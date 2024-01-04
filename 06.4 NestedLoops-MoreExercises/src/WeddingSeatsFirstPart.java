import java.util.Scanner;

public class WeddingSeatsFirstPart {
    public static void main(String[] args) {
        //Последния сектор от секторите - символ (B-Z)
        //Броят на редовете в първия сектор - цяло число (1-100)
        //Броят на местата на нечетен ред - цяло число (1-24)
        //Редовете във всеки следващ сектор се увелицхават с 1
        //Четните родове са с 2 повече места
        //{сектор}{ред}{място}
        //Накрая трябва да отпечата броя на всички места.
        Scanner input = new Scanner(System.in);
        String sector = input.nextLine();
        int linesInFirstSector = Integer.parseInt(input.nextLine());
        int chairsInOddLine = Integer.parseInt(input.nextLine());
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chairs = "abcdefghijklmnopqrstuvwxwz";
        int curentChairs = 0;
        int counter = 0;

        for(int a = 0; a < alphabet.length(); a++){
            String buffer = "" + alphabet.charAt(a);
            if (buffer.equals(sector)){
                alphabet = alphabet.substring(0, a+1);
                break;
            }
        }
        for (int i = 0; i < alphabet.length(); i++){
            String buffer = "" + alphabet.charAt(i);
            for (int j = 1; j <= linesInFirstSector; j++){
                if (j % 2 != 0){
                    curentChairs = chairsInOddLine - 1;
                } else
                    curentChairs = chairsInOddLine + 1;
                for (int k = 0; k <= curentChairs; k++){
                    String buffer1 = "" + chairs.charAt(k);
                    System.out.printf("%s%d%s%n", buffer, j, buffer1);
                    counter++;
                }
            }
            linesInFirstSector++;
        }
        System.out.printf("%d", counter);
    }
}
