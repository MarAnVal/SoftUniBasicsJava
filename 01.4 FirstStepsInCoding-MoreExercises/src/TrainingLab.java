import java.util.Scanner;

public class TrainingLab {
    public TrainingLab() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        int ww = (int)(w / 1.2);
        int hh = (int)((h - 1.0) / 0.7);
        int totalFull = ww * hh - 3;
        System.out.println(totalFull);
    }
}
