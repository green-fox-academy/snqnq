let tl, totalGoal, sectionHeight, complete, sections, prefix, suffix, goalCompleteText;

// goal interval of each section
const interval = 5

let currentAmount = 0

let ticker = {
  _amount: 0,
  get amount () {
    return this._amount
  },
  set amount (amount) {
    displayAmount(amount)
  }
}

let timelineUpdateCount = 0

function formatNumber (num, decimals) {
  return parseFloat(Math.round(num * 100) / 100).toFixed(decimals);
}

function moveSections () {
  const amount = currentAmount

  function findSectionIndex () {
    const index = sections.findIndex(section => amount < section) - 1
    return index > 0 ? index : 0
  }

  // Get the index we're on
  const sectionIndex = findSectionIndex()
  const section = sections[sectionIndex]

  function isInbetween () {
    return section !== amount
  }

  const nextSection = sections[sectionIndex + 1]
  const sectionDifference = nextSection - section
  const remainder = amount - section

  // How close we are to next section, in decimal. 0.5 is halfway
  const between = isInbetween() ? remainder / sectionDifference : 0
  const moveAmount = sectionHeight * (sectionIndex + between)

  const id = 'SectionUpdate' + timelineUpdateCount
  timelineUpdateCount++
  tl.add(id)

  tl.to('#sections', 1.4, {
    top: moveAmount,
    ease: Power3.easeInOut,
    delay: .4
  }, id)

  tl.to(ticker, 1.4, {
    amount,
    ease: Power3.easeInOut,
    delay: .4
  }, id)
    .set(ticker, {_amount:amount})
}

function displayAmount (amount) {
  // would be great to animate the text counting up as
  // it moves, even using the random text would be great
  $('#currentAmount').text(prefix + formatNumber(amount, 2) + suffix)
}

function onNewAmount (amount) {
  // Can't just do a percantage as the increase isn't linear and could be ???
  if (isNaN(amount)) {
    console.warn('ono, amoutnNum ended up being NaN :thinking:')
    return
  }

  currentAmount = amount
  moveSections()
}

function onGoal () {
  // wait the animation time here before we do the ongoal animation.
  console.log('onGoal');
  var gc = new TimelineMax(); 

  gc.set("#flash", {delay: 1.6, scaleX: 0, transformOrigin: "left center"})
    .to("#flash", .25, {ease: Power3.easeOut, scaleX: 1, opacity: .8, transformOrigin: "left center", onComplete: animateName})
    .to("#flash", .2, {opacity: 0})
    .to("#completeMessage", .6, {delay: .8, opacity: 0, yoyo: true, repeat: 8})
}

function loadScript (url) {
  return new Promise(function (resolve, reject) {
    const script = document.createElement('script')
    script.onload = resolve
    script.onerror = reject
    script.src = url

    document.head.appendChild(script)
  })
}

function createSections(sections) {
  // populate the dom baesd on `sections`.
  const $sections = $('#sections')

  sections.forEach(function(section) {
    $sections.prepend('<div class="section">' + prefix + formatNumber(section, 2) + suffix + '</div>')
  });

  const goalDiff = sections[sections.length - 1] - sections[sections.length - 2]
  const goalOffset = (sectionHeight / interval) * (interval - goalDiff)

  $('.section').first().addClass('goalAmount').css({
    transform: 'translateY(' + goalOffset + 'px)'
  });
}

function createSectionArray(startNum, endNum, interval) {
  sections = []

  // lets create the sections here.
  for (var i = startNum; i <= endNum; i += interval) {
    if (i > endNum) {
      i = endNum
    }
    sections.push(i)
  }

  if (sections[sections.length-1] !== endNum) {
    sections.push(endNum)
  }

  return sections
}

document.addEventListener('goalEvent', function(obj) {
  const newAmount = obj.detail.amount.current
  const target = obj.detail.amount.target

  onNewAmount(newAmount)

  if (newAmount >= target && !complete) {
    complete = true
    $('#goalWidget').addClass('completed');
    onGoal()
  }
});

document.addEventListener('goalLoad', function(obj) {
  console.log(obj);
  
	prefix = "{prefix}";
  suffix = "{suffix}";
  goalCompleteText = "{goalReached}";
    
  let flip = "{flip}";
  if(flip == "true"){
    $("body").addClass("flip");   
    $("#goalWidget").addClass("flip");   
  }
  
  const current = obj.detail.amount.current
  const target = obj.detail.amount.target
  const title = obj.detail.title

  $('#goalType').html(title)
  $('#goalAmount').text(prefix + formatNumber(target, 2) + suffix)
  $('#currentAmount').text(prefix + '0.00' + suffix)

  loadScript('https://cdnjs.cloudflare.com/ajax/libs/gsap/1.20.3/TweenMax.min.js').then(function () { 
    tl = new TimelineMax()
    tl.timeScale(1);

    // total goal
    totalGoal = target
    // height of each section in pixels
    sectionHeight = 70
    // is the goal complete?
    complete = false
    // array of numbers to create the goal timeline

    sections = createSectionArray(0, totalGoal, interval)

    createSections(sections);

    onNewAmount(current)
    currentAmount = current

    if (current >= target) {
      complete = true;
      onGoal();
      $('#goalWidget').addClass('completed');
    }
  });   

});

function animateName(){
  displayLetterWriteString({
    targetElement: document.querySelectorAll('#completeMessage'),
    finalString: [goalCompleteText],
    repeat: 1,
    holdTimeRepeat: 3000,
    changesPerLetter: 5,
    changesBeforeNextLetter: 2,
    timePerChange: 1000 / 30
  })
}

const generateRandomString = (() => {
  function generateCharset (range) {
    const chars = []
    for (let i = range[0]; i < range[1] + 1; i++) {
      chars.push(String.fromCharCode(i))
    }
    return chars
  }
  const alphaChars = generateCharset([65, 90])
  const numChars = generateCharset([48, 57])

  const charMap = {
    'A': alphaChars,
    '#': numChars
  }

  return function (pattern) {
    const str = []
    if (!pattern) return ''
    for (let i = 0; i < pattern.length; i++) {
      if (!charMap[pattern[i]]) {
        str.push(pattern[i])
        continue
      }

      const charset = charMap[pattern[i]]

      const index = Math.floor(Math.random() * charset.length)
      str.push(charset[index])
    }

    return str.join('')
  }
})()

const sleep = ms => new Promise(wake => setTimeout(wake, ms))

async function displayLetterWriteString (args) {
  const {
    targetElement: _targetElement, finalString, changesPerLetter, changesBeforeNextLetter, timePerChange, holdTimeRepeat, holdTimeNextString, repeat
  } = args

  const targetElement = (_targetElement instanceof NodeList)
    ? [].slice.call(_targetElement) : _targetElement

  function isElementInDom (element) {
    if (!element || !document.body.contains(element)) {
      return false
    }
    return true
  }

  if (Array.isArray(targetElement)) {
    for (const element of targetElement) {
      if (!isElementInDom(element)) {
        return
      }
    }
  } else {
    if (!isElementInDom(targetElement)) {
      return
    }
  }

  if (Number.isInteger(repeat) && repeat !== 0) {
    for (let i = 0; repeat === -1 || i < repeat; i++) {
      const success = await displayLetterWriteString(Object.assign({}, args, {
        repeat: null
      }))

      if (repeat === -1 || i < repeat - 1) {
        await sleep(holdTimeRepeat)
      }

      if (success === false) {
        return
      }
    }

    return
  }

  if (Array.isArray(finalString)) {
    for (const strIndex in finalString) {
      const str = finalString[strIndex]
      
      await displayLetterWriteString(Object.assign({}, args, {
        finalString: str
      }))

      if (strIndex < finalString.length - 1) {
        await sleep(holdTimeNextString)
      }
    }

    return
  }

  const isNumberRegex = /[0-9]/
  const isAlphaRegex = /[a-zA-Z]/
  const isWhitespaceRegex = /\s/

  function setText (text) {
    function setElement (element) {
      if (!element) {
        return
      }
      element.innerText = text
    }

    if (Array.isArray(targetElement)) {
      targetElement.forEach(setElement)
    } else {
      setElement(targetElement)
    }
  }

  setText('')

  function getCharType (char) {
    if (isNumberRegex.test(char)) {
      return '#'
    }

    if (isAlphaRegex.test(char)) {
      return 'A'
    }

    return char
  }

  let outputStringArray = []

  function updateText () {
    setText(outputStringArray.join(''))
  }

  async function doChar ({ finalChar, originalIndex }, charIndex) {
    await sleep(changesBeforeNextLetter * charIndex * timePerChange)

    for (let iteration = 1; iteration <= changesPerLetter; iteration++) {
      const isFinal = iteration === changesPerLetter
      const displayChar = isFinal ? finalChar : generateRandomString(getCharType(finalChar))

      outputStringArray[originalIndex] = displayChar
      updateText()

      await sleep(timePerChange)
    }
  }

  for (let i = 0; i < finalString.length; i++) {
    if (isWhitespaceRegex.test(finalString[i])) {
      outputStringArray[i] = finalString[i]
    }
  }

  await Promise.all(
    finalString
      .split('')
      .map((char, index) => ({ finalChar: char, originalIndex: index }))
      .filter(char => !isWhitespaceRegex.test(char.finalChar)) 
      .map(doChar)
  ) 
}

//SE GOAL WRAPPER
let index, goal, fieldData, currency, userLocale;
let updateData;


window.addEventListener('onWidgetLoad', function (obj) {
    fieldData = obj.detail.fieldData;
    goal = fieldData["goal"];
    userLocale = fieldData["userLocale"];
    currency = obj["detail"]["currency"]["code"];
    index = fieldData['eventType'] + "-" + fieldData['eventPeriod'];
    if (fieldData['eventType'] === "subscriber-points") {
        index = fieldData['eventType'];
    }

    count = 0;
    if (typeof obj["detail"]["session"]["data"][index] !== 'undefined') {
        if (fieldData['eventPeriod'] === 'goal' || fieldData['eventType'] === 'cheer' || fieldData['eventType'] === 'tip' || fieldData['eventType'] === 'subscriber-points') {
            count = obj["detail"]["session"]["data"][index]['amount'];
        } else {
            count = obj["detail"]["session"]["data"][index]['count'];
        }
    }

    updateData = {
        detail: {
            title: fieldData.titleText,
            amount: {
                current: count,
                target: goal,
                start: 0,
            },
            to_go: {
                ends_at: fieldData.endDate
            },
            settings: {
                custom_json: {}
            }
        }
    };
    for (let i in fieldData) {
        updateData.detail.settings.custom_json[i] = fieldData[i];
    }
    if (fieldData['eventType'] === 'tip') {
        updateData.detail.amount.currency = currency;
    } else {
        $("#goal").html(goal);
    }
    let event = new CustomEvent('goalLoad', updateData);
    document.dispatchEvent(event);

});


window.addEventListener('onSessionUpdate', function (obj) {
    if (typeof obj["detail"]["session"][index] !== 'undefined') {
        if (fieldData['eventPeriod'] === 'goal' || fieldData['eventType'] === 'cheer' || fieldData['eventType'] === 'tip' || fieldData['eventType'] === 'subscriber-points') {
            count = obj["detail"]["session"][index]['amount'];
        } else {
            count = obj["detail"]["session"][index]['count'];
        }
    }
    updateData.detail.amount.current = count;

    let event = new CustomEvent('goalEvent', updateData);
    document.dispatchEvent(event);
});
