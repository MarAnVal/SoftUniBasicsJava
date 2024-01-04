import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        //Входът е поредица от цели числа и текст:
        //На първия ред до получаване на командата "Finish" - име на филма – текст
        //На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //Типа на закупения билет - текст ("student", "standard", "kid")
        Scanner input = new Scanner(System.in);
        String filmName = input.nextLine();
        int counterStudent = 0;
        int counterStandart = 0;
        int counterKid = 0;
        int counterAll = 0;
        int counter = 0;
        boolean flag = false;
        while (!filmName.equals("Finish")){
            int chairs = Integer.parseInt(input.nextLine());
            for (int i = 0; i < chairs; i++){
                String bilet = input.nextLine();
                switch (bilet){
                    case "student":
                        counterStudent++;
                        counter++;
                        counterAll++;
                        break;
                    case "standard":
                        counterStandart++;
                        counter++;
                        counterAll++;
                        break;
                    case "kid":
                        counterKid++;
                        counter++;
                        counterAll++;
                        break;
                    case "End":
                        i = chairs;
                        break;
                    case "Finish":
                        flag = true;
                        i = chairs;
                        break;
                }
            }
            //На конзолата трябва да се печатат следните редове:
            //След всеки филм да се отпечата, колко процента от кино залата е пълна
            //"{името на филма} - {процент запълненост на залата}% full."

            if (flag){break;}
            else {
                System.out.printf("%s - %.2f%% full.%n",filmName, counter * 100.0 / chairs);
                filmName = input.nextLine();
                counter=0;
            }
        }
        System.out.printf("Total tickets: %d%n", counterAll);
        System.out.printf("%.2f%% student tickets.%n", counterStudent * 100.0 / counterAll);
        System.out.printf("%.2f%% standard tickets.%n", counterStandart * 100.0 / counterAll);
        System.out.printf("%.2f%% kids tickets.%n", counterKid * 100.0 / counterAll);

        //При получаване на командата "Finish" да се отпечатат четири реда:
        //"Total tickets: {общият брой закупени билети за всички филми}"
        //"{процент на студентските билети}% student tickets."
        //"{процент на стандартните билети}% standard tickets."
        //"{процент на детските билети}% kids tickets."
    }
}
