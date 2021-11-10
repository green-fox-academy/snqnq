- Adjuk hozzá a szerverhez a Resource Monitor szolgáltatást

Mivel Windows Server 2019 et hasznalunk, gondolom ez mar alap feature kent jelen van, mindenesetre a resmon.exe t kell futattni a win key + R futtatas parancsal.


- Mi az NTP szerver? Miért fontos ennek a beállítása?

 Network Time Protocol szerver. Szinkronizalja a rendszer orajat az internetes orahoz. Foleg hibakeresesi okobol kell a halozaton levo osszes gepet szinkronizalni egy NTP szerverre. Ha mar par miliszekundomos csuszas van, vagy extrem esetekben masodperces csuszas, akkor a rendszer uzemeltetonek nagyon nehez dolga lesz a folyamatok sorozatat rekonstrualni, hogy mi is tortent valojaban

- Az NTP TCP vagy UDP porton kommunikál?

 Az Network Time Protocol a 123-as UDP porton keresztul kommunikal.


- Miért fontos az Windows Update használata? Nagyvállalati környezetben milyen módon szokták használni és milyen kritikus pontja vannak a rendszerek frissítésének?

 Amiert fontos hogy up-to-date hasznaljuk a windowst, az foleg biztonsagi okokbol. Minden honap elso keddjen van update microsoft-tol, es ilyenkor a legfontosabb frissitesek azok a biztonsagi resek betomese, amelyeket a tamadok kihasznalva hozzafernek ertekes adatokhoz. 

 A kritikus pontok:

 - eloszor egy test ringet keszitunk, es azon teszteljuk az update et
 - kovetkezo korben egy nagyobb ringet un. fast ringet keszitunk ahol par nappal kesobb pusholjuk az update eket, feedbacket varva
 - az utolso korben pedig keszitunk egy slow ringet es az osszes keszuleket update ljuk
  Ezeket mind egy Group Policy Objectben hatarozzuk meg. 


- Hol tudjuk átállítani az elsődleges és másodlagos DNS szervert?

A halozati adapter beallitosoknal, az IPv4 tulajdonsagai kozott talalhato meg


- Hol tudnánk a gépünket domain-be léptetni? Milyen jogosultság kell ehhez?

 Settings > System > About beallitasoknal lehet domainbe leptetni a a gepunket. Domain Admin jogosultsag kell hozza.


- Tiltsuk le a tűzfalon a Remote Desktop használatát

 disabledRD.jpg feltoltve
