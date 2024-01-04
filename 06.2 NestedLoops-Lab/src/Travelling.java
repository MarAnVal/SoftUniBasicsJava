import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        //От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за пътуването, реално число.
        //След това ще се четат няколко суми, реални числа, които Ани спестява като работи и когато успее да събере достатъчно за пътуването,
        //ще заминава, като на конзолата трябва да се изпише:
        //"Going to {дестинацията}!"
        //Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе "End" и програмата ще приключи.
        Scanner input = new Scanner(System.in);
        String destination = input.nextLine();
        double savedMoney = 0;
        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(input.nextLine());
            while (savedMoney < neededMoney){
                double saving = Double.parseDouble(input.nextLine());
                savedMoney += saving;
            }
            System.out.printf("Going to %s!%n", destination);
            savedMoney = 0;
            destination = input.nextLine();

        }
    }
}
