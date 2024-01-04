import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //град / продукт coffee water beer sweets peanuts
        //          Sofia 0.50  0.80  1.20 1.45   1.60
        //        Plovdiv 0.40  0.70  1.15 1.30   1.50
        //        Varna   0.45  0.70  1.10 1.35   1.55
        //
        //чете продукт (низ), град (низ) и количество (десетично число)
        // пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения град.
        String product = input.nextLine();;
        String town = input.nextLine();
        double amount = Double.parseDouble(input.nextLine());
        double total = 0;

        switch (town){
            case "Sofia":
                switch (product){
                    case "coffee":
                        total = amount * 0.5; break;
                    case "water":
                        total = amount * 0.8; break;
                    case "beer":
                        total = amount * 1.2; break;
                    case "sweets":
                        total = amount * 1.45; break;
                    case "peanuts":
                        total = amount * 1.6; break;
                } break;

            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        total = amount * 0.4; break;
                    case "water":
                        total = amount * 0.7; break;
                    case "beer":
                        total = amount * 1.15; break;
                    case "sweets":
                        total = amount * 1.30; break;
                    case "peanuts":
                        total = amount * 1.5; break;
                } break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        total = amount * 0.45; break;
                    case "water":
                        total = amount * 0.7; break;
                    case "beer":
                        total = amount * 1.10; break;
                    case "sweets":
                        total = amount * 1.35; break;
                    case "peanuts":
                        total = amount * 1.55; break;
                } break;
        }
        System.out.println(total);

    }
}
