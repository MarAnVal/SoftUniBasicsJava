import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – брой дни – цяло число в интервал [1…5000]
        //Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        //Aко оставената храна Е достатъчна:
        //"{килограма остатък} kilos of food left."
        //Резултатът трябва да е закръглен към по-ниското цяло число
        //Ако оставената храна НЕ Е достатъчна:
        //“{килограма недостигат} more kilos of food are needed.”
        //Резултатът трябва да е закръглен към по-високото цяло число

        int day = Integer.parseInt(input.nextLine());
        double allFood = Double.parseDouble(input.nextLine());
        double dogPerDay = Double.parseDouble(input.nextLine());
        double catPerDay = Double.parseDouble(input.nextLine());
        double turtlePerDay = Double.parseDouble(input.nextLine());

        double neededFood = day * (dogPerDay + catPerDay + turtlePerDay/1000);

        if (allFood < neededFood){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - allFood));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(allFood - neededFood));
        }




    }
}
