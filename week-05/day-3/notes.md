Privat ip tartomany: 

192.168.0.0 / 16 (255.255.255.0)
192.168.0.1 => 192.168.255.254
Network address : 192.168.0.0
Broadcast address : 192.168.255.255


172.16.0.0 / 
172.16.0.0 => 172.31.0.0
network address: 172.16.0.0
Broadcast address: 172.31.255.255

172.17.228.23 privat
172.32.228.23 publikus


10.0.0.0 / 8 (255.0.0.0)

11111111.00000000.00000000.00000000


Egyesek a network azonositok, mig a 0 ak a networkon belul a hostot azonositjak . Majd a host leforditja az ip cimet, es beazonositja a cimzetett 

00001010.1.00000101.00000000

Ip cim :  10.254.5.252
NET Mask: 255.255.255.0 
GW(router): 10.254.5.1

kis hazi magamnak, ird at binarisra!

linux parancsok:

ifconfig - info a halokartyarol

ifup ens160 - elinditja a kartyat 

ens160 a halokartya neve

cat /etc/redhat-release - kiirja a rendszer verzioszarmat

uname -a - kernel verzio szama?

rpm
rpm -qa - mi lett felinstallalva erre az oprendszerre

yum upgrade/update


CMD

arp -a

route print

ping

tracert/traceroute

back to Linux

cd
ls
nano
cp

/etc/selinux security enforcing

/etc/passwd cat parancsal megkapom a felhasznalokat

/etc/group


useradd [username] - letrehozz egy egy uj usert
passwd [username] - jelszot rendel hozza

systemctl - ujraolvassa a config allomanyt

ipcalc [ipcim] 

megmondja az ip cim osztalyat es helyet

diff -Nrup

megmondja a ket fajl kozti kulonbseget [text]