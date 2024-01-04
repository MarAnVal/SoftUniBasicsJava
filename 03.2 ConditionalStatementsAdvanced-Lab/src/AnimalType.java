import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //dog -> mammal
        // crocodile, tortoise, snake -> reptile
        // others -> unknown
        String animal = input.nextLine();
        String out = "";

        switch (animal){
            case "dog":
                out = "mammal"; break;
            case "crocodile":
            case "tortoise":
            case "snake":
                out = "reptile"; break;
            default:
                out = "unknown"; break;
        }
        System.out.println(out);
    }
}
