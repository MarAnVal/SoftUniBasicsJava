import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        //Напишете програма, която чете цяло число n,
        //въведено от потребителя, и отпечатва пирамида от числа като в примерите
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int counter = 1;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                if (counter > number){
                    break;
                }
                System.out.printf("%d", counter);
                if (j < i){
                    System.out.print(" ");
                } else
                    System.out.printf("%n");
                counter++;
            }
            if (counter > number){
                break;
            }
        }
    }
}
