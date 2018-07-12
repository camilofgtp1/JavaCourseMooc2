
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        System.out.println("");
        System.out.println("");
        printWithSmileys("another");
        System.out.println("");
        System.out.println("");
        // printWithSmileys("Matti");
    }

    private static void printWithSmileys(String characterString) {
        smileyLine(characterString);
        System.out.println("");
        characterLine(characterString);
        
        smileyLine(characterString);

    }

    public static void smileyLine(String characterString) {
        if (characterString.length() % 2 == 0) {
            for (int i = 0; i < characterString.length() / 2 + 3; i++) {
                System.out.print(":)");
            }

        } else {
            for (int i = 0; i < characterString.length() / 2 + 4; i++) {
                System.out.print(":)");

            }

        }
    }

    public static void characterLine(String characterString) {

        if (characterString.length() % 2 == 0) {
            System.out.println(":)" + " " + characterString + " " + ":)");
        } else {
            System.out.println(":)" + " " + characterString + "  " + ":)");
        }
    }
}
