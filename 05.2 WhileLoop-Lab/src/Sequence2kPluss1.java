import java.util.Scanner;

public class Sequence2kPluss1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Напишете програма, която чете число n, въведено от потребителя,
        //и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
        //Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
        int line = Integer.parseInt(input.nextLine());
        int k = 1;
        while (k <= line){
            System.out.println(k);
            k *= 2;
            k++;
        }
    }
}
