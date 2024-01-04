import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        //Име на играча с дължина n - текст
        //За всеки играч се четат n на брой реда:
        //число – цяло число в интервала[0…127]
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String currentName = "";
        String winnerName = "";
        int currentSum = 0;
        int winnerSum = 0;
        boolean flag = false;

        while (!name.equals("Stop")){
            currentName = name.toLowerCase();
            for (int i = 0; i < name.length(); i++) {
                int ascii = Integer.parseInt(input.nextLine());
                int letter = (int) name.charAt(i);
                if (letter == ascii) {
                    currentSum += 10;
                } else {
                    currentSum += 2;
                }
            }
            if (flag) {
                if (currentSum >= winnerSum) {
                    winnerName = name;
                    winnerSum = currentSum;
                }
            } else {
                winnerName = name;
                winnerSum = currentSum;
                flag = true;
            }

        name = input.nextLine();
            currentSum = 0;
        }
        //"The winner is {името на победителя} with {точките на победителя} points!"
        System.out.printf("The winner is %s with %d points!", winnerName, winnerSum);
    }
}
