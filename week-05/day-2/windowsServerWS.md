- Milyen porton kommunikál a DNS szerver?

 A DNS szerver az UDP/TCP 53-as portjan kommunikal

- Mik az FSMO szerepkörök? Melyek a tartományi és melyek az erdőszintű szerepkörök? Keressük meg grafikus felületen az öt szerepkört! Hogyan tudjuk lekérdezni parancssorból?

Tartomanyi szerepkorok: RID Master, PDC Emulator, Infarstructure Master

Erdoszintu szerepkorok: Schema Master, Domain Naming Master

Ezeket a parancssorbol a netdom query fsmo parancsal tudjuk lekerni. 

queryFsmoRoles.jpg  

- Mit tudunk konfigurálni a DNS Forwaders fülön? Keressünk itt használható DNS szervereket (IP címeket)

Egy kulso DNS szerver cimet tudjuk megadni, hogy a szerver helyett, a megadott DNS intezze a kiszolgalast, ezzel javitva a halozat gyorsasagat.

 Google : 8.8.8.8
 quad9: 9.9.9.9
 OpenDNSHome: 208.67.222.222
 Cloudflare: 1.1.1.1
 CleanBrowsing: 185.228.168.9
 Alternate DNS: 76.76.19.19
 AdGuard DNS: 94.140.14.14 

- DHCP szerveren hogyan tudunk a kiosztandó IP címtartományból kizárni kiadható IP-ket? Milyen esetekben célszerű használni ezt a lehetőséget?

 Meg nem tanultunk DHCP t

- Kérdezzük le egy tetszőleges domain SOA, A és MX rekordját



- Mi a Globális katalógus?

- Miket tárol a SYSVOL mappa? Ha több DC-nk is van melyiken találjuk meg?


- Mi az RODC?Mikor telepíthetjük egy hálózatba?

. Mi a DSRM és mikor használjuk? -Mi az Organizational Unit?

- Mi a Multimaster replikáció?

- Mi a séma?