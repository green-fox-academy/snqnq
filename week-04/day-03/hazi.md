* Nézzünk utána mi a különbség az ADSL és a bérelt vonal között? Melyiket használják enterprise környezetben és miért?
 
 Az ADSL egy asszimetrikus adatkommunikáció, amely olyan felhasználásra jött létre, ahol a felhasználók inkább letöltenek mint fel, tehát a fel-letöltés nem egyenlő,
 míg a bérelt vonalak egy szimertrikus adatkommunikáció, ahol a fel- és letöltés szimetrikus, tehát megegyezzik! A bérelt vonalnak sokkal nagyobb a sávszélessége is, és akkor használják főleg ha két vagy több telephelyet kell összekötni, és fontos a gyors és biztonságos kommunikáció. Enterprise környezetben a bérelt vonalat használják- Számítható költség, fix sávszél, monitorozott adatforgalom, bővíthető sávszél. 

* Kérdezzük le az otthoni gépünk IP  beállításait. Milyen osztályú IP  címmel rendelkezünk?

C osztályú IP  címem van itthon. 192. vel kezdodik, amely a C osztályhoz tartozik!

* Milyen parancsokkal tudjuk felszabadítni, majd új IP  címet igényelni a gépünk számára?

Először IP config /release parancsal tudjuk felszabadítani, és utána az IP config /renew parancsal tudunk új IP  címet kérni!

* Kérdezzük le az otthoni gépünk ARP tábláját

Kép mellékelve!

* Mit mutat az MX rekord és hogyan tudjuk lekérdezni?

Az MX rekord megmutatja az adott domain szerver levelezési szerverének a címét. Mindig egy domainra fog mutatni, ami meghatározza a levelek(email) útját az adott domainre. A command parancssorban az nslookup parancsal belepek az interaktiv modba! Utána egy server ip.cím parancsal beállítottam egy DNS szervert, mert valamiért nincs default beállítva. Aztán a set q=MX parancs után csak simán beírom az ip címét az adott domainnek, és visszakapom a levelező szervereknek a címét!
Egy rővidebb parancs amit találtam az az nslookup  -querytype=mx  domain.név. 

* Milyen paranccsal kérdeznéd le, hogy a géped milyen TCP/UDP portokon figyel éppen (aktív kapcsolatok)?
netstat -a megmutatja az osszes aktiv portot amit a géped használ, ha külön szeretném őket lekérdezni az a netstat -p udp/tcp parancsal érhető el.

* Milyen parancsot használnál, ha csak! a géped MAC címét szeretnéd kiiratni (Windows parancsosrban)
getmac parancsal

* Mire szolgál a tracert parancs? Mikor és mire használnád?
A tracert-vel megnézhetjük hogy hány routeren kell keresztülmennie hogy az adott célt elérjük. A saját gépünk és a megadott cél között. A különböző routereket hopoknak hívják, ami azt jelenti hányszor kell ugrania hogy elérje az adott célt.

* Hálózatunkon nincs engedélyezve a 3389-es port. Milyen szolgáltás nem fog működni?
Amit találtam az a Windows Remote Desktop használja az TCP/UDP 3389 -es portokat.