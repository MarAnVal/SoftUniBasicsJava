import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        double total;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if (num >= 800){
                p5++;
            }else if (num >= 600){
                p4++;
            }else if (num >= 400){
                p3++;
            }else if (num >= 200){
                p2++;
            }else p1++;
        }
        total = p1 * 100.0/n;
        System.out.printf("%.2f",total); System.out.print("%");
        total = p2 * 100.0/n;
        System.out.printf("%n%.2f",total); System.out.print("%");
        total = p3 * 100.0/n;
        System.out.printf("%n%.2f",total); System.out.print("%");
        total = p4 * 100.0/n;
        System.out.printf("%n%.2f",total); System.out.print("%");
        total = p5 * 100.0/n;
        System.out.printf("%n%.2f",total); System.out.print("%");
    }
}

