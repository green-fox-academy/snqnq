- Végezzük el az LinuxTEST gép operációs rendszerének az update-jét. Hajtsunk végre a "yum update" parancsot, nézzük meg és elemezzük, hogy mit fog az installációt követően a rendszer update-elni!

Nekem most a renszer egy ujabb verziora lepett ettol, 8.4 rol 8.5 re.

- Állítsuk le a gépünket "shutdown -h now" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

Remote side unexpectedly closed network connection. Ezt az uzenetet kaptam, a virtualis gep teljesen leallt

- Állítsuk le a gépünket "shutdown -h now" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

Ugyanaz tortent, leallt a linux teljesen

- Állítsuk le a gépünket "halt" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

Remote side unexpectedly closed network connection uzenet megint, a centosban egy kill all remaining procces uzenet talalhato, es nem reagal semmire. CPU has been disabled uzenetet kaptam a vmware tol

- Állítsuk le a gépünket "halt" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

Az egyetlen kulonbseg amit eszrevettem hogy a vegen kiirta hogy halt, ujrainditas szukseges hogy ujra mukodjon a rendszer.

- Állítsuk le a gépünket "poweroff" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

SSh kliensbe nem tortenik semmi, ugyanugy a kapcsolat megszakad

- Állítsuk le a gépünket "poweroff" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

uzenet: dracut warning, killing all remaining procceses, es kikapcsol a gep

- Indítsuk újra a gépünket "shutdown -r now" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?



Remote side unexpectedly closed network connection parancs, es megszakad a kapcsolat

- Indítsuk újra a gépünket "shutdown -r now" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?

a gep ujraindul a dracut warning uzenettel es ujra bootol. 

- Elemezzük ki a "dmesg" parancs kimenetét egy gép indítását követően.

A gep boot folyamatarol kapunk reszletes informaciot, eloszor a kernelt tolti be, majd a device drivereket tolti, utana jon a hardware elemek azonositasa, es a vegen inditja a service ket. 

- Elemezzük ki a "ps auxf" parancs kimenetét!

a ps auxf parancsal lekerheto az eppen futo programoknak es szolgaltatasoknak a teljesitmeny igenye, hogy mennyi memoriat es procceszort hasznalnak fel az eroforrasbol.
Illetve megmondja hogy az epp adott proccest ki inditotta, es mikor.

- Nézzük meg a "top" parancs kimenetét, elemezzük mit látunk!

Ez a parancs valos idoben mutatja meg a folyamatok eroforras igenyeit, es folyamatosan frissiti is oket

- Indítsunk egy SSH kliensen keresztüli belépést. Belépést követően indítsunk egy "vi /root/.bashrc" parancsot. Lépjünk be konzolon. A "ps auxf" segítségével keressük ki a "vi" parancsunkat. A szülő shell-jét "kill" segítségével állítsuk le! Majd ellenőrizzük a "ps auxf" segítségével a hatását process szinten. Végezetül mit találunk a /root könyvtárban ami eddig nem volt ott?

Tehat megtalaltam a vi pid jat ami 2722 volt az zen esetemben, a kill 2722 parancsal megallitottam a vi-t , a ssh kliensen pedig a vim finished, terminated uzenet jelent meg. A /root konyvtarban pedig keletkezett egy .viminfo fajl.

- Adjunk egy 10GB-os és egy 20GB-os disk-et a gépünkhöz (mind a kettő legyen thin provisioning módban)! A 10GB-os disk-et csatoljuk a /DATA/mongoDB alá. Legyen xfs file system. A 20GB-os disk-en LVM legyen. A VG neve: grayLOG-VG, file system: xfs, mount point: /DATA/grayLOG

- "Pasword reset" módszerrel hajtsuk végre a gépünk root felhasználójának jelszó módosítását! (Nem kötelező! Aki végrehajtja: óvatosan!)