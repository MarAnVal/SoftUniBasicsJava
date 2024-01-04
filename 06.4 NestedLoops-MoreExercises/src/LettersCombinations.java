import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLetter = input.nextLine();
        String secondLetter = input.nextLine();
        String thurdLetter = input.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String buffer = "";
        int couter = 0;
        for (int a = 0; a < alphabet.length(); a++){
            String letter = "" + alphabet.charAt(a);
            if (letter.equals(firstLetter)) {
                buffer = alphabet.substring(a);
                alphabet = buffer;
                break;
            }
        }
        for (int a = 0; a < alphabet.length(); a++){
            String letter = "" + alphabet.charAt(a);
            if (letter.equals(secondLetter)){
                    buffer = alphabet.substring(0, a +1);
                    alphabet = buffer;
                    break;
            }
        }
        for (int a = 0; a < alphabet.length(); a++){
            String letter = "" + alphabet.charAt(a);
            if (letter.equals(thurdLetter)){
                buffer = buffer.substring(0 , a) + buffer.substring(a + 1);
                alphabet = buffer;
                break;
            }
        }


        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++){
                for (int k = 0; k < alphabet.length(); k++){
                    System.out.printf("%c%c%c ", alphabet.charAt(i), alphabet.charAt(j), alphabet.charAt(k));
                    couter++;
                }
            }
        }
        System.out.print(couter);
    }
}
