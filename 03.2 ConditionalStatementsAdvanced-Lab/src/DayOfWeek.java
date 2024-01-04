import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        //чете цяло число в граници [1...7]
        // отпечатва ден от седмицата (на английски език)
        // отпечатва "Error" в случай, че въведеното число е невалидно.
        Scanner input = new Scanner(System.in);
        String out = "";
        int val = Integer.parseInt(input.nextLine());

        switch (val){
            case 1: out = "Monday"; break;
            case 2: out = "Tuesday"; break;
            case 3: out = "Wednesday"; break;
            case 4: out = "Thursday"; break;
            case 5: out = "Friday"; break;
            case 6: out = "Saturday"; break;
            case 7: out = "Sunday"; break;
            default: out = "Error"; break;

        }
        System.out.println(out);

    }
}
