import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        //Изходът да се форматира в следния вид:
        //"OddSum=" + {сума на числата на нечетни позиции},
        //"OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
        //"OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
        //"EvenSum=" + { сума на числата на четни позиции },
        //"EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
        //"EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
        //Всяко число трябва да е форматирано до втория знак след десетичната запетая.
        double oddSum = 0;
        double oddMin = 0;
        double oddMax = 0;
        double evenSum = 0;
        double evenMin = 0;
        double evenMax = 0;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(input.nextLine());
            if (i % 2 != 0) {
                oddSum = oddSum + num;
                if (i == 1) {
                    oddMax = num;
                    oddMin = num;
                } else {
                    if (num > oddMax) {
                        oddMax = num;
                    } else if (num < oddMin) {
                        oddMin = num;
                    }
                }
            } else {
                evenSum = evenSum + num;
                if (i == 2) {
                    evenMax = num;
                    evenMin = num;
                } else {
                    if (num > evenMax) {
                        evenMax = num;
                    } else if (num < evenMin) {
                        evenMin = num;
                    }
                }
            }

        }
        //"OddSum=" + {сума на числата на нечетни позиции},
        //"OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
        //"OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
        //"EvenSum=" + { сума на числата на четни позиции },
        //"EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
        //"EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
        System.out.printf("%nOddSum=%.2f,",oddSum);
        if (n < 1){
            System.out.printf("%nOddMin=No,");
            System.out.printf("%nOddMax=No,");
        } else {
            System.out.printf("%nOddMin=%.2f,", oddMin);
            System.out.printf("%nOddMax=%.2f,", oddMax);
        }
        System.out.printf("%nEvenSum=%.2f,",evenSum);
        if (n <2){
            System.out.printf("%nEvenMin=No,");
            System.out.printf("%nEvenMax=No");
        } else {
            System.out.printf("%nEvenMin=%.2f,",evenMin);
            System.out.printf("%nEvenMax=%.2f", evenMax);
        }

    }
}
