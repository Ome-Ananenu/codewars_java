public class Printer {
    
    public static String printerError(String s) {
        int bad = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!"abcdefghijklm".contains(Character.toString(s.charAt(i)))){
                bad++;
            }
        }
        return "" + bad + "/" + s.length();
    }
}