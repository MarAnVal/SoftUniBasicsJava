import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n >0){
            System.out.println(n);
            n--;
        }
    }
}
