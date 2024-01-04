import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        //чете ден от седмицата (текст), на английски език
        // Ако денят е работен отпечатва на конзолата - "Working day"
        // ако е почивен - "Weekend"
        // Ако се въведе текст различен от ден от седмицата да се отпечата - "Error"
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();
        String out = "";

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                out = "Working day"; break;
            case "Saturday":
            case "Sunday":
                out = "Weekend"; break;
            default:
                out = "Error"; break;
        }
            System.out.println(out);
    }
}
