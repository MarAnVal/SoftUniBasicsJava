import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        //До получаване на команда "End of words" се чете по един ред от конзолата:
        //дума – текст
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        double currentPower = 0;
        double winnerPower = 0;
        String winnerWord = "";
        boolean flag = false;
        //сборът от ASCII стойностите на символите, от които се състои думата.
        //Ако започва с гласна буква - 'a', 'e', 'i', 'o', 'u', 'y' (или техните еквивалентни главни букви),
        //полученият сбор трябва да се умножи по дължината на думата,
        //в противен случай, да се раздели на дължината и да се закръгли до най-близкото цяло число надолу.
        while (!word.equals("End of words")){

            for (int i = 0; i < word.length(); i++){
                int letter = (int) word.charAt(i);
                currentPower += letter;
            }
            String currentWord = word.toLowerCase();
            switch (currentWord.charAt(0)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    currentPower *= currentWord.length();
                    break;
                default:
                    currentPower /= currentWord.length();
                    break;
            }
            if (flag){
                winnerPower = currentPower;
                winnerWord = word;
            } else {
                if (currentPower > winnerPower){
                winnerPower = currentPower;
                winnerWord = word;
                flag = false;}
            }
            word = input.nextLine();
            currentPower = 0;
        }
        //"The most powerful word is {думата с най-голяма сила} - {силата на думата}"
        System.out.printf("The most powerful word is %s - %.0f" , winnerWord, winnerPower);
    }
}
