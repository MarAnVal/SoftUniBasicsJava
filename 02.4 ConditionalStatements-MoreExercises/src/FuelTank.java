import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //на първия ред се чете типа на горивото
        //текст с възможности: "Diesel", "Gasoline" или "Gas"
        //литрите гориво реално число, които има в резервоара
        //Ако литрите гориво са повече или равни на 25, на конзолата да се отпечата "You have enough {вида на горивото}."
        //Aко са по-малко от 25, да се отпечата "Fill your tank with {вида на горивото}!"
        //В случай, че бъде въведено гориво, различно от посоченото, да се отпечата "Invalid fuel!".

        String fuel = input.nextLine();
        double liters = Double.parseDouble(input.nextLine());
        fuel = fuel.toLowerCase();

        if (fuel.equals("diesel") || fuel.equals("gasoline") || fuel.equals("gas")){
            if (liters < 25){
                System.out.printf("Fill your tank with %s!", fuel);
            } else
                System.out.printf("You have enough %s.", fuel);
        } else
            System. out.print("Invalid fuel!");


    }
}
