- ps auxf | grep root | grep vmstat | grep -v grep | awk '{print "kill -9 " $2}' | /bin/bash

proccess listabol kiragadja a root altal inditott processeket, abbol a vmstat ot, kiszuri a grep et belole, es a kill parancsal atadja a pid jet a bin/bash shellnek

ls | grep vmware-network | grep -v vmware-network.log | awk '{print "rm " $1}' | /bin/bash

ez torli az osszes vmware-network filet, kiveve a vmware-network.log ot


ls *2021* | awk '{print "rm " $1}' | /bin/bash

ez ugyanaz csak egy masik verzioja

cat /etc/group
Ha nincs még a szükséges csoport: groupadd -g [guid] [group neve]

cat /etc/passwd
(Eddig használt felhasználónevek, és user ID-k.)
useradd -u [uid] -g [gid] [user neve]
passwd [user neve]


find /etc -name '*ens33*' -
grep -R 192.168.136.11 *


Hálózati hiba:
ifconfig
route
ping
traceroute
arp
nslookup
