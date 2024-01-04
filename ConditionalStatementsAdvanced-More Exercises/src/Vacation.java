import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
        //Втори ред –  Сезон – текст "Summer" или "Winter"
        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
        double total = 0.0;
        String location = "";
        String vacant = "";
        // Сезоните са лято и зима – "Summer" и "Winter"
        // Локациите са – "Alaska" и "Morocco"
        // Възможните места за настаняване – "Hotel", "Hut" или "Camp".
        switch (season){
            case "Summer":
                location = "Alaska";
                //При бюджет <= от 1000лв.:
                //Настаняване в "Camp"
                //Лято – Аляска – 65% от бюджета
                //При бюджет > от 1000лв.<= от 3000лв.:
                //Настаняване в "Hut"
                //Лято – Аляска – 80% от бюджета
                //При бюджет > от 3000лв.:
                //Настаняване в "Hotel"
                // Лято – Аляска - 90% от бюджета
                if (budget <= 1000){
                    vacant = "Camp"; total = budget * 0.65;
                } else if (budget <= 3000){
                    vacant = "Hut"; total = budget * 0.8;
                } else {
                    vacant = "Hotel"; total = budget * 0.9;
                }
                break;
            case "Winter":
                location = "Morocco";
                //При бюджет <= от 1000лв.:
                //Настаняване в "Camp"
                //Зима – Мароко – 45% от бюджета
                //При бюджет > от 1000лв.<= от 3000лв.:
                //Настаняване в "Hut"
                //Зима – Мароко – 60% от бюджета
                //При бюджет > от 3000лв.:
                //Настаняване в "Hotel"
                //Зима – Мароко - 90% от бюджета
                if (budget <= 1000){
                    vacant = "Camp"; total = budget * 0.45;
                } else if (budget <= 3000){
                    vacant = "Hut"; total = budget * 0.6;
                } else {
                    vacant = "Hotel"; total = budget * 0.9;
                }
                break;
        }
        //"{локацията} – {мястото за настаняване} – {цената}"
        System.out.printf("%s - %s - %.2f", location, vacant, total);
    }
}
