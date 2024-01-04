import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        //Брой продадени игри- n - цяло положително число в интервала [1… 100]
        //За следващите n реда се чете по един ред:
        //Име на игра - текст
        //Hearthstone
        //Fornite
        //Overwatch
        //Others
        Scanner input = new Scanner(System.in);
        int numberSold = Integer.parseInt(input.nextLine());
        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 0; i < numberSold; i++){
            String game = input.nextLine();
            switch (game){
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n" ,hearthstone * 100.0 / numberSold);
        System.out.printf("Fornite - %.2f%%%n" , fornite * 100.0 / numberSold);
        System.out.printf("Overwatch - %.2f%%%n", overwatch * 100.0 / numberSold);
        System.out.printf("Others - %.2f%%", others * 100.0 / numberSold);
    }
}
