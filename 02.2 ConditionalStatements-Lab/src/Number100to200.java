import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //чете цяло число
        // проверява дали е под 100, между 100 и 200 или над 200
        //под 100 отпечатайте: "Less than 100"
        //между 100 и 200 отпечатайте: "Between 100 and 200"
        //над 200 отпечатайте: "Greater than 200"

        int num = Integer.parseInt(input.nextLine());

        if (num < 100){
            System.out.println("Less than 100");
        } else if (num <= 200){
            System.out.println("Between 100 and 200");
        } else
            System.out.println("Greater than 200");


    }
}
