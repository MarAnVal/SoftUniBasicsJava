import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Напишете програма, която чете текст от конзолата (стринг)
        //и го принтира, докато не получи командата "Stop".
        String text = input.nextLine();

        while (!text.equals("Stop")){
            System.out.println(text);
            text = input.nextLine();
        }
    }
}
