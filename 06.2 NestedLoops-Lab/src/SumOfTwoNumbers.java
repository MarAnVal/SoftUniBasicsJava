import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        //Първи ред – начало на интервала – цяло число в интервала [1...999]
        //Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //Трети ред – магическото число – цяло число в интервала [1...10000]
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int magicNumber = Integer.parseInt(input.nextLine());
        boolean flag = false;
        int counter = 0;
        //проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
        //На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
        //Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                counter++;
                if (i + j == magicNumber){
                    //Ако е намерена комбинация чиито сбор на числата е равен на магическото число
                    //"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        //Ако не е намерена комбинация отговаряща на условието
        //"{броят на всички комбинации} combinations - neither equals {магическото число}"
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }

    }
}
