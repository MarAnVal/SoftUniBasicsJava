import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        //10 000 стъпки всеки ден
        //Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
        //Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня
        //и когато постигне целта си да се изписва "Goal reached! Good job!"
        //и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".
        //
        //Ако иска да се прибере преди това, тя ще въведе командата "Going home"
        //и ще въведе стъпките, които е извървяла докато се прибира.
        //След което, ако не е успяла да постигне целта си,
        //на конзолата трябва да се изпише: "{разликата между стъпките} more steps to reach goal."
        Scanner input = new Scanner(System.in);
        int dailyGoal = 10000;
        int dailyAchived = 0;
        boolean flag = true;

        while (flag){
            String steps = input.nextLine();
            switch (steps){
                case "Going home":
                    steps = input.nextLine();
                    dailyAchived += Integer.parseInt(steps);
                    if (dailyAchived >= dailyGoal){
                        System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(dailyAchived - dailyGoal));
                    } else {
                        System.out.printf("%d more steps to reach goal.", Math.abs(dailyAchived - dailyGoal));
                    }
                    flag = false;
                    break;
                default:
                    dailyAchived += Integer.parseInt(steps);
                    if (dailyAchived >= dailyGoal){
                        System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(dailyAchived - dailyGoal));
                        flag = false;
                    }
                    break;
            }


        }

    }
}
