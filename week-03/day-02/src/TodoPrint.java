public class TodoPrint {

    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String toMerge1 = "My todo:\n";
        String toMerge2 = " - Download games\n";
        String toMerge3 = "\t- Diablo\n";
        todoText = toMerge1.concat(todoText).concat(toMerge2).concat(toMerge3);



        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
