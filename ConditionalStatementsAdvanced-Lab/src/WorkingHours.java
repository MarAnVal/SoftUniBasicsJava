import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //чете час от денонощието(цяло число) и ден от седмицата(текст)
        //работното време на офисът е от 10-18 часа, от понеделник до събота включително
        int h = Integer.parseInt(input.nextLine());
        String day = input.nextLine();
        String out = "closed";

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (h >= 10 && h <= 18){
                    out = "open";
                } break;

        }
        System.out.println(out);

    }
}
