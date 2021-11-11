- Végezzük el az LinuxTEST gép operációs rendszerének az update-jét. Hajtsunk végre a "yum update" parancsot, nézzük meg és elemezzük, hogy mit fog az installációt követően a rendszer update-elni!

Mar updateletuk a Linuxot elso nap. Kernelt updatelt.

- Lehet-e egy felhasználó több csoportnak is a tagja?

Igen lehet.

- A /home könyvtár alá csatoljunk disk-et. Eddigi tartalma ne vesszen el!


- Hozz létre saját account-ot!

Week5/day3 kep feltoltve az accountokrol

- Hozz létre egy munka könyvtárt a saját munkakönyvtáradban!

mkdir /home/munka

- Az /etc könyvtár tartalmát csomagolt össze egy file-ba a munka könyvtárba!

zipEtc.jpg fajlban printscreen

- A létrehozott file-t tömörítsük be!
??? ugyanezt csinaltam meg egy lepesbe?

- Végezzük el a következő komplex feladatot:


TAR segítségével csomagoljuk be a /home tartalmát és tegyük a file-t a /opt alá.

tar -cvf backup-home.tar /home/ /opt/

ezzel a parancsal csinaltam egy backup filet


Töröljük le a /home tartalmát.

rm -r /home torolne a home nak a tarltalmat es a konytarstrukturat

Adjunk egy 10 GByte-os disk-et a gépünkhöz!

mount parancsot kene hasznalni, de meg nem vettuk el

Fedeztessük fel a géppel újraindítás nélkül!

echo "- - -" > /sys/class/scsi_host/host0/scan
echo "- - -" > /sys/class/scsi_host/host1/scan
echo "- - -" > /sys/class/scsi_host/host2/scan

a jegyzeteimhez igazodva ezekkel a parancsokkal lehet a rendszerrel felfedeztetni az uj particio

Hozzunk létre egy statikus partíciót!

Formatáljuk le xfs file rendszerrel!

Mountoljuk fel a /home alá.

TAR-oljuk vissza a home könyvtár betarolt tartalmát!

Az /etc/fstab file-ba vezessük be ezt a mount point-ot!

Ellenőrizzük a jogoslutságot és tulajdonjogot a /home alatt!

Töröljük az /opt alól a felesleges állományt!