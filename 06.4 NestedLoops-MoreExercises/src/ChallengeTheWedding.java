import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        //Броя клиенти мъже - цяло число в интервала [1...100]
        //Броя клиенти жени - цяло число в интервала [1...100]
        //Максималният брой маси - цяло число в интервала [1...100]
        // пецхата ({№ клиент} <-> {№ клиент}) до края на броя на масите
        Scanner input = new Scanner(System.in);
        int males = Integer.parseInt(input.nextLine());
        int females = Integer.parseInt(input.nextLine());
        int tables = Integer.parseInt(input.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int i = 1; i <= males; i++) {
            for (int j = 1; j <= females; j++) {

                if (counter < tables) {
                    if (flag) {
                        System.out.print(" ");
                    }
                    System.out.printf("(%d <-> %d)", i, j);
                    counter++;
                    flag = true;
                } else {
                    break;
                }

            }

        }
    }
}
