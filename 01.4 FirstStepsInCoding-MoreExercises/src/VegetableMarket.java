import java.util.Scanner;

public class VegetableMarket {
    public VegetableMarket() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vegiePrice = Double.parseDouble(input.nextLine());
        double fruitPrice = Double.parseDouble(input.nextLine());
        int vegieKG = Integer.parseInt(input.nextLine());
        int fruitKG = Integer.parseInt(input.nextLine());
        double totalBGN = vegiePrice * (double)vegieKG + fruitPrice * (double)fruitKG;
        double totalEUR = totalBGN / 1.94;
        System.out.printf("%.2f", totalEUR);
    }
}
