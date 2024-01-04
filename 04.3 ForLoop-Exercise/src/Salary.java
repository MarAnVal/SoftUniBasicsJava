import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //Заплата - число в интервала [500...1500]
        int n = Integer.parseInt(input.nextLine());
        int salary = Integer.parseInt(input.nextLine());
        int total = 0;
        //След това n – на брой пъти се чете име на уебсайт – текст
        for (int i = 0; i < n; i++){
            String site = input.nextLine();
            //"Facebook" -> 150 лв
            //"Instagram" -> 100 лв
            //"Reddit" -> 50 лв.
            switch (site){
                case "Facebook":
                    total = total + 150; break;
                case "Instagram":
                    total = total + 100; break;
                case "Reddit":
                    total = total + 50; break;
            }
            if (salary - total <= 0){
                System.out.print("You have lost your salary."); i = n;
            }
        }
        //по-малка или равна на 0 лева, на конзолата се изписва "You have lost your salary." и програмата приключва.
        //В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).
        if (salary - total > 0){
            System.out.printf("%d",salary - total);
        }
    }
}
