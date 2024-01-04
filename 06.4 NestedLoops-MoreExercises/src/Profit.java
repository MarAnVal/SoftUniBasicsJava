import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        //1. Брой монети по 1лв. - цяло положително число;
        //2. Брой монети по 2лв. - цяло положително число;
        //3. Брой банкноти по 5лв. - цяло положително число;
        //4. Сума - цяло положително число в интервала [1…1000];
        Scanner input = new Scanner(System.in);
        int oneLevs = Integer.parseInt(input.nextLine());
        int twoLevs = Integer.parseInt(input.nextLine());
        int fiveLevs = Integer.parseInt(input.nextLine());
        int sum = Integer.parseInt(input.nextLine());
        int total;

        for (int i = 0; i <= oneLevs; i++){
            for (int j = 0; j <= twoLevs; j++){
                for (int k = 0; k <= fiveLevs; k++){
                    total = i + j * 2 + k * 5;
                    if (sum == total){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
        //"{бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv."
    }
}
