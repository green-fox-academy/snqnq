public class ConditionalVariableMutation {
        public static void main(String[] args) {
            double a = 24;
            int out = 0;

           if(a % 2 == 0){
               out++;
           }
            // Ha a páros, növeld az out változó értékét 1-gyel


            System.out.println(out);




            int b = 13;
            String out2 = "";
            if(10 < b && b < 20){
                out2 = "Édes";
            } else if( b < 10){
                out2= "Kevés";
            } else if (b > 20){
                out2 = "Sok";
            }
            // Ha b 10 és 20 között van, akkor az out2 legyen "Édes!"
            // Ha b kevesebb, mint 10, out2 legyen "Kevés!"
            // Ha b több, mint 20, out2 legyen "Sok!"


            System.out.println(out2);



            int c = 123;
            int credits = 100;
            boolean isBonus = false;

            if(credits >= 50 && isBonus == false){
                c -= 2;
            } else if(credits < 50 && isBonus == false){
                c -= 1;
            } else if(isBonus == true){
                c = c;
            }
            // Ha credits legalább 50,
            // és isBonus hamis, c legyen csökkentve 2-vel
            // Ha credits kisebb, mint 50,
            // és isBonus hamis, c legyen csökkentve 1-gyel
            // Ha isBonus igaz, c ne változzon


            System.out.println(c);




            int d = 8;
            int time = 120;
            String out3 = "";

            if(d % 4 == 0 && time <= 200){
                out3 = "check";
            }else if(time > 200){
                out3 = "Az idő lejárt!";
            }else{
                out3 = "Fuss, Forest, Fuss!";
            }
            // Ha d osztható 4-gyel
            // és a time nem több, mint 200
            // out3 legyen "check"
            // Ha time nagyobb, mint 200
            // out3 legyen "Az idő lejárt!"
            // különben out3 legyen "Fuss, Forest, Fuss!"


            System.out.println(out3);
        }

}
