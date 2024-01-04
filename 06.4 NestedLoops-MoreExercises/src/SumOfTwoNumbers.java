import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        //Първи ред – начало на интервала – цяло число в интервала [1...999]
        //Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //Трети ред – магическото число – цяло число в интервала [1...10000]
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int sum = Integer.parseInt(input.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                count++;
                if (i + j == sum){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }else if (i == end){
                System.out.printf("%d combinations - neither equals %d", count, sum);
            }
        }
        //Ако е намерена комбинация чиито сбор на числата е равен на магическото число
        //"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
        //Ако не е намерена комбинация отговаряща на условието
        //"{броят на всички комбинации} combinations - neither equals {магическото число}"
    }
}
