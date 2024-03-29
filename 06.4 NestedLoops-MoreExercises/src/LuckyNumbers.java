import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        //прочита едно цяло число N и генерира всички възможни "щастливи" и различни 4-цифрени числа(всяка цифра от числото е в интервала [1...9]).
        //Щастливо число е 4-цифрено число, на което сбора от първите две цифри е равен на сбора от последните две.
        //Числото N трябва да се дели без остатък от сбора на първите две цифри на "щастливото" число.
        //Входът се чете от конзолата и се състои от едно цяло число в интервала [2...10000]
        //На конзолата трябва да се отпечатат всички "щастливи" и различни 4-цифрени числа, разделени с интервал
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        boolean flag = false;

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if (number % (i + j)!= 0){
                    continue;
                }
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){
                       if ((i + j) - (k + l) == 0){
                           if (flag){
                               System.out.print(" ");
                           }
                           System.out.printf("%d%d%d%d", i, j, k, l);
                           flag = true;
                       }
                    }
                }
            }
        }
    }
}
