import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        //прочита едно число n,
        //след това прочита n на брой цели числа
        //и принтира средно аритметичното на тяхната сума число,
        //форматирано до втората цифра след десетични знак.
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double sum = 0;
        int i = 0;
        while (i < n){
            int num = Integer.parseInt(input.nextLine());
            sum += num;
            i++;
        }
        System.out.printf("%.2f", sum / n);
    }
}
