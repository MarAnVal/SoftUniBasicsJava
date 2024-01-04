import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        // 1 USD = 1.79549 BGN.
        Scanner input = new Scanner(System.in);

        double USD = Double.parseDouble(input.nextLine());
        double BGN = USD * 1.79549;
        System.out.println(BGN);

    }
}
