import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        //12     12      14        14       12     16       16
        String day = input.nextLine();
        int out = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                out = 12; break;
            case "Wednesday":
            case "Thursday":
                out = 14; break;
            case "Saturday":
            case "Sunday":
                out = 16; break;

        }
        System.out.println(out);

    }
}
