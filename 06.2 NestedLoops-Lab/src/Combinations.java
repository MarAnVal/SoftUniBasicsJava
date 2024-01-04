import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        //Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
        //x1 + x2 + x3 = n
        //Числото n е цяло число и се въвежда от конзолата.
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int counter = 0;
        for (int x1 = 0; x1 <= n; x1++){
            for (int x2 = 0; x2 <= n; x2++){
                for (int x3 = 0; x3 <= n; x3++){
                    if (x1 + x2 + x3 == n){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
