import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        // Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //Всички останали са "unknown"
        String val = input.nextLine();
        String out = "";

        switch (val){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                out = "fruit"; break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                out = "vegetable"; break;
            default:
                out = "unknown"; break;

        }
        System.out.println(out);
    }
}
