- Milyen gyártói előírások vannak CentOS 8 esetében a hardware-re vonatkozóan (minimal requirements és compatibility)?

2 GB ram, 2 GHZ Procceszor, 20 GB hely merevlemezen, es egy 64 bit x86 os arhitektura

- Töltsd le a CentOS 8.2.2004 install médiát
 Megvan, illetve mar fel van telepitve a vmwareben, kep mellekelve

- Készíts boot-olható CentOS 8.2.2004 operációs rendszer installációs pendrive-ot!
 Nem csinaltam meg meg, de vagy Rufust, vagy Etcher t ajanlanak hozza. Rufus egy Windows alatt futtathato program, az Etcher pedig multiplatformos. 
 Illetve Linux terminalba is lehet egy par parancs kiadasaval.

 - eloszor unmountolni kell az usb drive ot a / $ sudo umount /[az usb eleresi utja]
 - masodjara flashelni kell a drive- ot (rairni) / $ sudo dd bs=4M if=[ISO image path] of=[USB Drive Name] status=progress oflag=sync

 Majd potolom es rakom fel a screenshotot. 

- Mi a különbség a "yum" és az "rpm" paramncsokkal való installálások között?

 Amig a "yum" automatikusan felinstallalja a package-ket automata, addig az rpm-el kulon kell mindet felrakosgatni. a "yum" manager updateli is a packageket.  

- Keresd ki, hogy mennyibe kerülne egy 2x16 core-os Intel Xeon processzoros gépre RedHat Enterprise Linux operációs rendszer vásárlása 1 év support-tal

 Elvileg nem tamogatja az intel xeon csaladot a red hat, bootolaskor hibat ir ki!

- Mi a feltétele annak, hogy DHCP-s IP cím beállítást használjunk a Linux szerverünk installálása során?

 Erre sem talaltam valaszt, kutfobol hogy offline ba hasznaljuk, vagy ideiglenesen mig at nem allitjuk statikus IP re

- Miért térjünk át statikus IP cím használatára?
 
 Mivel szerverrol van szo, statikus IP vel kell rendelkeznie, hogy mindig ugyanazon a cimen meg lehessen talani, egyebkent dinamikussal uj IP cimet kapna, es nem talalnak meg a halozaton

- Installálás során miért nem kérünk NTP-n keresztüli időszinkronizálást, miért kell kézzel beállítani a dátumot és a pontos időt?


- Milyen megszorítások vannak Linux operációs rendszert használó gép esetén a host nevére?


- Lehet-e LVM disk területen a /boot és /boot/efi?

a /boot lehet a linux nem foglalkozik vele, a boot/efi viszont nem, mert nem fogja a rendszer latni bootolasnal.

- Lehet-e swap partíció LVM disk területen?

Elvileg lehet, nincs akadalya

- Milyen file rendszereket használhatunk és használunk?

Linuxban is letezik FAT32 , ext 1-4, ESP (Efi System Partition), swap, LVM, BOOT Bios