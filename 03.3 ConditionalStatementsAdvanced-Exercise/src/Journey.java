import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        //Втори ред – Един от двата възможни сезона: "summer" или "winter"
        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
        //При 100лв. или по-малко – някъде в България
        //Лято – 30% от бюджета
        //Зима – 70% от бюджета
        //При 1000лв. или по малко – някъде на Балканите
        //Лято – 40% от бюджета
        //Зима – 80% от бюджета
        //При повече от 1000лв. – някъде из Европа
        //При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета
        double spentMoney = 0.0;
        String vacant = "Camp";
        String destination = "";
        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    spentMoney = budget * 0.3; break;
                case "winter":
                    spentMoney = budget * 0.7; vacant = "Hotel"; break;
            }

        } else if (budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    spentMoney = budget * 0.4; break;
                case "winter":
                    spentMoney = budget * 0.8; vacant = "Hotel"; break;
            }


        } else {destination = "Europe"; spentMoney = budget * 0.9; vacant = "Hotel";}

        //Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
        //Втори ред – "{Вид почивка} – {Похарчена сума}"
        //Почивката може да е между "Camp" и "Hotel"
        //Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f", vacant, spentMoney);


    }
}
