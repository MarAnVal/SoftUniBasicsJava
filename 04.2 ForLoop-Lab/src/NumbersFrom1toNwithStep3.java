import java.util.Scanner;

public class NumbersFrom1toNwithStep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int j = 1;
        while (j <= n){
            System.out.println(j);
            j= j + 3;
        }
    }
}
