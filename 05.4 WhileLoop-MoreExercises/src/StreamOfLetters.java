import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //От конзолата се чете поредица от редове с един символ на всеки до получаване на командата "End".
        //Символите, които не са латински букви трябва да бъдат игнорирани.
        //Думите скрити в потока са разделени от тайна команда от три букви – "c", "o" и "n".
        //При първото получаване на една от тези букви, тя се маркира като срещната, но не се запазва в думата.
        //При всяко следващо нейно срещане се записва нормално в думата.
        //След като са налични и трите символа от командата, се печата думата и интервал " ".
        //На конзолата се печата на един ред всяка дума след тайната команда, следвана от интервал.
        //При команда "End" програмата спира без да пецхата.
        String text = input.nextLine();
        int countC = 0;
        int countO = 0;
        int countN = 0;
        String word = "";

        while (!text.equals("End")){
            switch (text.toLowerCase()){
                case "a":
                case "b":
                case "d":
                case "e":
                case "f":
                case "g":
                case "h":
                case "i":
                case "j":
                case "k":
                case "l":
                case "m":
                case "p":
                case "q":
                case "r":
                case "s":
                case "t":
                case "u":
                case "v":
                case "w":
                case "x":
                case "y":
                case "z":
                    word = word + text;
                    break;
                case "c":
                    if (!text.equals("C")){
                        if (countC > 0){
                            word = word + text;
                        }
                        countC++;
                    } else {word = word + text;}
                   break;
                case "o":
                    if (!text.equals("O")){
                        if (countO > 0){
                            word = word + text;
                        }
                        countO++;
                    } else {word = word + text;}
                    break;
                case "n":
                    if (!text.equals("N")){
                        if (countN > 0){
                            word = word + text;
                        }
                        countN++;
                    } else {word = word + text;}
                    break;
            }
            if (countC > 0 && countN > 0 && countO > 0){
                System.out.printf("%s ", word);
                word = "";
                countC = 0;
                countO = 0;
                countN = 0;
            }
            text = input.nextLine();

        }

    }
}
