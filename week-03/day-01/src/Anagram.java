
public class Anagram {

    // Készíts egy isAnagram nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót.
    // A függvények bemeneten fogadnia a kell két stringet és visszaadni egy logikai (boolean) értéket attól függően,
    // hogy a két string egymás anagrammája vagy sem.

    //Példák
    // bemenet 1	bemenet 2	kimenet
    //"dog"	"god"	true
    //       "green"	"fox"	false

    public static void main(String[] args) {
        System.out.println(isAnagram("dog","god"));
        System.out.println(isAnagram("green","fox"));
        System.out.println(isAnagram("görög","görög"));
    }

    public static boolean isAnagram(String str1, String str2){
        String myStr="";
        for(int i=str1.length()-1; i>=0; i--){
            myStr+=str1.charAt(i);
        }
        if(myStr.equals(str2)){
            return true;
        }
        return false;
    }
}