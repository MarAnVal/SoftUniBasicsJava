import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        //чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000.
        //Винаги първото въведено число ще бъде по малко от второто.
        //На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете,
        //прочетени от конзолата числа и отговарят на следното условие:
        //сумата от цифрите на четни и нечетни позиции да са равни. Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.
        Scanner input = new Scanner(System.in);
        int firstNum = Integer.parseInt(input.nextLine());
        int lastNum = Integer.parseInt(input.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        String buffer = "";

        for (int i = firstNum; i <= lastNum; i++){
            String curentNum = "" + i;
            for (int j = 0; j < curentNum.length(); j++){
                buffer = "" + curentNum.charAt(j);
                if (j % 2 == 0){
                    evenSum += Integer.parseInt(buffer);
                } else {
                    oddSum += Integer.parseInt(buffer);
                }
            }
            if (evenSum == oddSum){
                System.out.printf("%s", curentNum);
                if (i != lastNum){
                    System.out.print(" ");
                }
            }
            oddSum = 0;
            evenSum = 0;
        }
    }
}
