import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        //На първия ред – началната стойност на първите първата двойка числа – цяло положително число в диапазона [10… 90]
        //На втория ред – началната стойност на втората двойка числа – цяло положително число в диапазона [10… 90]
        //На третия ред – разликата между началната и крайната стойност на  първата двойка числа – цяло положително число в диапазона [1… 9]
        //На четвъртия ред – разликата между началната и крайната стойност на  втората двойка числа – цяло положително число в диапазона [1… 9]
        Scanner input = new Scanner(System.in);
        int firstStart = Integer.parseInt(input.nextLine());
        int secondStart = Integer.parseInt(input.nextLine());
        int firstPlus = Integer.parseInt(input.nextLine());
        int secondPlus = Integer.parseInt(input.nextLine());
        int count = 0;


        for (int i = firstStart; i <= firstStart + firstPlus; i++){
            boolean flag = false;
            for (int a = 2; a < i; a++){
                if (i % a == 0){
                    flag = true;
                    break;
                }
            }
            if (flag){continue;}
            for (int j = secondStart; j <= secondStart + secondPlus; j++){
                flag = false;
                for (int a = 2; a < j; a++){
                    if (j % a == 0){
                        flag = true;
                        break;
                    }

                }
                if (!flag){
                    System.out.printf("%d%d%n", i, j);
                }

            }
        }
    }
}
