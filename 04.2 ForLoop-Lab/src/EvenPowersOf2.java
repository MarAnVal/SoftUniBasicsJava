import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = Integer.parseInt(input.nextLine());
        int j = 0;
        int result = 1;
        while (j <= i){
            if (j % 2 == 0){
                System.out.println(result);
            }
            j++;
            result = result * 2;
        }
    }
}
