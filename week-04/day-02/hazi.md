* tiering atnezese, illetve a vmware mukodosenek atnezeses, kis google segitsegevel
* meg kezdjuk el a vmware virtualizaciot, ez a delutani mentor timeon lesz
* laszlo.bottkos@fnxs.hu ha kerdes van

Gepterem tiering: 

*                                                           Tier1       Tier2        Tier 3        Tier 4

*  Aktív kiszolgáló egyszégek az ICT eszközök ellátására | N         |  N+1       | N+1     | bármely elem hibája után is ‚N‘ |  

*                                       Ellátási útvonal | 1         | 1          | 1 aktiv,    |    2 egyidejűleg aktív | 
                                                                                  |  1 tartalek | 

*              Szolgáltatás-kiesés nélkül karbantartható |  Nem      | Nem        | Igen        |  Igen                 |                 

*                                               Hibatűrő | Nem       |  Nem       | Nem         |  Igen                 |

*                           Független ellátási útvonalak | Nem       |  Nem       | Nem         |  Igen                 |

*                                       Folyamatos hűtés | Terhelésfüggő | Terhelésfüggő | Terhelésfüggő | Biztosított  |

*                                    Rendelkezésre állás | 99.67%    |  99.75%    |  99.98 %    |    99.99%             |

*                 Éves tervezett leaállás és kiesett idő | 28.8 óra  | 22 óra     |  1.6 óra    |  0.8 óra              |


* Mi a különbség egy Tier 3 és Tier 4 besorolású gépterem között?

Mint a táblázatból is látszik, a TIER 3 és TIER 4 es géptermek között apró különbségek vannak, viszont annál fontosabbak.
Főleg az ellátási útvonal, a karbantartás, a hűtés, és a leálláskor kiesett idő ami említésre méltó.

* Keress Tier 3 és Tier 4 géptermeket Budapesten!

Tier 3 as a DC10 Elhelyezkedés: 1108 Budapest, Kozma utca 2. Invitech // Barátomat megkérdeztem aki szakmában dolgozik, és felvilágosított hogy nincs TIER 4 es magyarországon!
Tier 3as a DC14 Elhelyezkedés: 1143 Budapest, Ilka utca 31. Invitech

* Lehet-e gépteremben vízzel oltani? Indokold!

Internetes kutatásom során azt találtam hogy semmi esetben ne oltsunk vízzel, és oltás elött áramtalanítani kell a géptermet.

2020 március 10-én egy Strassbourgi gépteremben tűz útött ki, amit a tűzoltók nagyon sok vízzel próbálták megfékezni a tűz terjedését, ezáltal a SGB2es gépterem teljesen tönkrement, de hatással volt másik géptermekre is. 

* Milyen oltórendszerek/készülékek használhatók gépteremben?

Az oltást mindenképp olyan módszerrel kell, hogy az oxigént elfojtjuk a tűztől, porraloltó pl.

Illetve olyan rendszerek alkalmazhatóak, amelyek gázzal pl. Nitrogén-el vagy Argon-al vagy a kombinációjukkal fojtják el a tüzet. Ezek a gázok nem lépnek kémiai reakcióba más elemekkel, így kifejezetten biztonságos velük tüzet oltani.  


* Mi a különbség egy „rack mounted” és egy „blade” szerver között?
 
 A blade szerver helytakarékosabb mint a rack mounted.
Kb. 3ad annyi racket kell telepítenünk ugyanahozz a teljesítményhez!
 
 A blade szerverek egységes hálózati kábelezéssel és elektromos vezetékekkel rendelkeznek. Minden blade szerverhez nincs szükség mérnöki kábelezésre, míg a rack szerverekhez minden kábelt minden unithoz külön kell bekötni, ami egy 42U s szekrényben 1 U szerverekkel rengeteg kábelezést jelent.
 
 A rack szerverek rugalmasabbak erőforrás terén. Ha a blade szervereket nem clusterelve használjuk, elég erőtlenek, míg rack szervereket már lehet kapni pl 16 slotos memóriával, míg a blade-ek 4-8 közötti slottal jönnek. 
 
 Az áruk is fontos különbség: a rack szerverek sokkal költséghatékonyabbak a blade-nél, mivel olcsóbbak.

 Az 1U rack szerver előnye, hogy szabványos szervertervezési technológiát és szabványos portokat használ, hogy egyedül működjön. Több funkciót nem tud bővíteni, de bővítőszekrény csatlakoztatásával bővítheti funkcióit.
 Amikor növeljük az új blade szerver egységet, csak az újat csatlakoztatjuk a házhoz és ennyi. A blade szerverek csatlakoztathatók a kibővített infrastruktúrához. Ezenkívül a házon belüli opciós modulok lehetővé teszik számunkra, hogy a külső csatlakoztatás után a funkciók megosztását is lehetővé tegyük. A blade szerver technológia moduláris felépítése gyorsan bővül.

 Rack-szerverek használatakor sok a rendezetlen kábel, ami rejtett problémákat okoz, de a blade szervereknél nincs kábelprobléma.
 Mivel a blade-szerver egységek üzem közben cserélhetők, egyszerű hibaelhárításuk. A rack-szerverek önálló eszközök, így nehezebb a hibaelhárítás.

A Rack szerver megfelel a felhasználói alkalmazások igényeinek, míg a blade szerver integrációja túl sűrű, a szabványos hűtés nem teljesen megoldott. Ezen túlmenően a blade szerver nagyszámú géppel együtt dolgozik, hogy egy klasztert alkosson a felhasználó számára.

 Röviden, a blade szerverek továbbra sem tudják helyettesíteni a rack szervereket.


* Mi a különbség egy desktop gép és egy szerver között?

Először is az op.rendszer: A szerver és az asztali számítógép operációs rendszere nagyon különbözik. Egy szerver operációs rendszere egyszerre több folyamatot és kapcsolatot is tud kezelni (hardvertől függően). Vannak bizonyos funkciók, amelyekkel egy szerverorientált operációs rendszer rendelkezik, de az asztali számítógépek nem. A grafikus felhasználói felület nem található meg a szerver operációs rendszerében, vagy opcionális. A szerver operációs rendszer képes frissíteni a szoftvert és a hardvert anélkül, hogy újraindulna, míg az asztali operációs rendszerben újra kell indítani, hogy a változtatások érvénybe lépjenek. A szerverek operációs rendszere rendelkezik biztonsági mentési lehetőséggel a kritikus adatok rendszeres online biztonsági másolatainak készítéséhez. A szerver operációs rendszer biztonsága sokkal jobb, mint egy asztali számítógép operációs rendszere. A szerver az asztali számítógépekhez képest fejlett és rugalmas hálózati képességekkel is rendelkezik.

Hardware : Az asztali számítógépek által használt processzorok nagyrészt Intel Core sorozatúak, míg a szerverek processzorai Intel Xeon. A Xeon processzorokat úgy tervezték, hogy több más processzorral működjenek együtt, mivel sok más processzorral kell kommunikálniuk a szerververemben. Tehát egy szerver alaplapja több processzorral is rendelkezhet, az asztali számítógép alaplapja viszont csak egy processzort tartalmaz. Egy szerver processzor sokkal több alkalmazás futtatására képes egyidejűleg, mint egy asztali számítógép. A Xeon processzorok támogatják az Error Code Correcting (ECC) RAM-ot, mert a szervereknek folyamatosan üzemben kell lenniük, és ha memóriahiba lép fel, az ECC ram észleli a problémát, és megakadályozza a szerver leállását. Az asztali számítógépekben használt Intel Core processzor nem támogatja az ECC RAM-ot, de az AMD processzorokat támogatják.

Támogatás: Az asztali számítógépek támogatása gyakran fordul elő irodai számítógépekhez. Ezek nagyon korlátozott támogatást jelentenek bizonyos műszaki dokumentációkkal és útmutatásokkal. Az asztali számítógépekhez kínált támogatás távolról történik. Ezt a támogatást a vállalat számítógépén vagy az egyéni felhasználó számítógépén felmerülő szoftverrel kapcsolatos problémák esetén ajánljuk. Ez lehet hardverjavítási támogatás is, amely fizikailag történik.
 
 A szerver támogatás sokkal proaktívabb, mint az asztali támogatás. A szervertámogatásban a szolgáltató segít a szerverek távoli futtatásában, karbantartásában és felügyeletében. A nap 24 órájában, a hét minden napján elérhető támogatást nyújtanak, emellett külön csapattal és telefonszámmal is gyorsabban kérhet segítséget. Szerver esetén vírustámadásokra, hackelésekre, rosszindulatú programokra stb. is kap támogatást a gyártótól.

 Tehát ennyi volt az asztali számítógép és a szerver közötti különbség. Röviden, az asztali számítógépet egy magánszemély vagy egy szervezet használja alkalmazottai számára. Ezzel szemben a nagy cégek szervereket használnak több alkalmazás párhuzamos futtatására a szervezet hálózatán. Bár mindkettő számítógép, de mégis nagyon különböznek egymástól.




* Oktató anyag a HPE blade technológián keresztül mutatta be blade rendszer felépítését. Keresd meg ennek a megfelelőjét a DELL esetében!

Azt találtam hogy a DELL nél Poweredge-nek hívják a szervereket, ezenbelül a PowerEdge M1000e blade szekrény amely képes 16 blade unitot eltárolni egy 10 unitos helyen. 
