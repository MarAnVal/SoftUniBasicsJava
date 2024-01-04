import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        //Дадено число е валидно, ако е в диапазона [100…200] или е 0
        //Да се напише програма, която чете цяло число
        //печата "invalid" ако въведеното число не е валидно

        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        if (num > 200 || num < 100){
            if (num != 0){ System.out.println("invalid");}
        }


    }
}
