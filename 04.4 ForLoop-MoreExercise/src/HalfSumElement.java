import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if(max < num || i == 0){
                max = num;
            }
            sum = sum + num;
        }
        if (max * 2 == sum){
            System.out.printf("Yes%nSum = %d",max);
        } else
            System.out.printf("No%nDiff = %d",Math.abs(max * 2 - sum));
        //Ако има такъв елемент печата "Yes" и на нов ред "Sum = " + неговата стойност
        //Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големи
    }
}