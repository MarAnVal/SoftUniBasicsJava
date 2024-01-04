package exam;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //цел за деня – цяло число в интервала [1 … 5000]
        //След това се четат поредица от редове до получаване на команда "closed" или
        //докато Деси не постигне целта за деня – услугата, която иска клиентът – текст с възможности "haircut" и "color".
        //При команда "haircut" ще се очаква да се въведе видът на подстригването – "mens", "ladies" или "kids".
        //При команда "color" ще се очаква видът на боядисването – "touch up" или "full color".
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());
        boolean flag = true;
        int total = 0;
        String service = input.nextLine();
        while (!service.equals("closed")){
                switch (service){
                case "haircut":
                    String type = input.nextLine();
                    switch (type){
                        case "mens":
                            //Мъжко (mens) - 15лв.
                            total += 15;
                            break;
                        case "ladies":
                            //Дамско (ladies) – 20лв.
                            total += 20;
                            break;
                        case "kids":
                            //Детско (kids) – 10лв.
                            total += 10;
                            break;
                    }
                    break;
                case "color":
                    String color = input.nextLine();
                    switch (color){
                        case "touch up":
                            //Поддръжка (touch up) – 20лв.
                            total += 20;
                            break;
                        case "full color":
                            //Пълно боядисване (full color) – 30лв.
                            total += 30;
                            break;
                    }
                    break;
                }
            if (total >= target){
                flag = false;
                //Ако Деси е успяла да постигне целта за деня:
                //"You have reached your target for the day!"
                //Ако Деси не е успяла да постигне целта за деня:
                //На втория ред:
                //	"Earned money: {парите, които е спечелила за деня}lv."
                System.out.printf("You have reached your target for the day!%nEarned money: %dlv.", total);
                break;
            }
            service = input.nextLine();
        }
        if (flag){
            System.out.printf("Target not reached! You need %dlv. more.%nEarned money: %dlv.", Math.abs(total- target), total);
            //"Target not reached! You need {колко пари не и достигат, за да стигне целта}lv. more."
            //На втория ред:
            //	"Earned money: {парите, които е спечелила за деня}lv."
        }

    }
}
