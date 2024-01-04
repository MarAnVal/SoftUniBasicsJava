import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int summ = 0;
        for ( int i = 0; i < text.length(); i++){
            //буква    a e i o u
            //стойност 1 2 3 4 5
            text = text.toLowerCase();
            switch (text.charAt(i)){
                case 'a':
                    summ = summ + 1;
                    break;
                case 'e':
                    summ = summ + 2;
                    break;
                case 'i':
                    summ = summ + 3;
                    break;
                case 'o':
                    summ = summ + 4;
                    break;
                case 'u':
                    summ = summ + 5;
                    break;
            }
        }
        System.out.println(summ);
    }
}
