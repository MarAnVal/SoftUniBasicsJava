import java.util.Scanner;

public class Fishland {
    public Fishland() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double skumriaPrice = Double.parseDouble(input.nextLine());
        double cacaPrice = Double.parseDouble(input.nextLine());
        double palamudKG = Double.parseDouble(input.nextLine());
        double safridKG = Double.parseDouble(input.nextLine());
        double midiKG = Double.parseDouble(input.nextLine());
        double palamudPrice = skumriaPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double total = midiKG * 7.5 + palamudKG * palamudPrice + safridPrice * safridKG;
        System.out.printf("%.2f", total);
    }
}
