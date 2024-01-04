package exam;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //1. Тегло на пратката в килограми – реално число в интервала [0.01 ... 150.00]
        //2. Тип услуга –  текст със следните възможности: "standard" или "express"
        //3. Разстояние в километри – цяло число в интервала [1 ... 1000]
        Scanner input = new Scanner(System.in);
        double kg = Double.parseDouble(input.nextLine());
        String service = input.nextLine();
        int distance = Integer.parseInt(input.nextLine());
        double total = 0;
        double extraFee = 0;
        double extraFeeKm = 0;
        double extraFeeTotal = 0;
        switch (service){
            case "standard":
                if (kg < 1){
                    //За пратки по - леки от 1 кг – 3 стотинки на километър.
                    total = distance * 0.03;
                }else if (kg < 10){
                    //От 1 кг до 10 кг – 5 стотинки на километър.
                    total = distance * 0.05;
                }else if (kg < 40){
                    //От 10 кг вкл. до 40 кг – 10 стотинки на километър.
                    total = distance * 0.1;
                }else if (kg < 90){
                    //От 40 кг вкл. до 90  кг – 15 стотинки на километър.
                    total = distance * 0.15;
                }else if (kg < 150){
                    //От 90 кг вкл. до 150 кг – 20 стотинки на километър.
                    total = distance * 0.2;
                }
                break;
            case "express":
                if (kg < 1){
                    //За пратки по - леки от 1 кг – на килограм по 80 % от съответната цена на километър
                    total = distance * 0.03;
                    extraFee = 0.03 * 0.8;
                    extraFeeKm = extraFee * kg;
                    extraFeeTotal = distance * extraFeeKm;
                    total += extraFeeTotal;
                }else if (kg < 10){
                    //От 1 кг до 10  кг – на килограм по 40 % от съответната цена на километър
                    total = distance * 0.05;
                    extraFee = 0.05 * 0.4;
                    extraFeeKm = extraFee * kg;
                    extraFeeTotal = distance * extraFeeKm;
                    total += extraFeeTotal;
                }else if (kg < 40){
                    //От 10 кг вкл. до 40 кг – на килограм по 5 % от съответната цена на километър
                    total = distance * 0.1;
                    extraFee = 0.1 * 0.05;
                    extraFeeKm = extraFee * kg;
                    extraFeeTotal = distance * extraFeeKm;
                    total += extraFeeTotal;
                }else if (kg < 90){
                    //От 40 кг вкл. до 90  кг – на килограм по 2 % от съответната цена на километър
                    total = distance * 0.15;
                    extraFee = 0.15 * 0.02;
                    extraFeeKm = extraFee * kg;
                    extraFeeTotal = distance * extraFeeKm;
                    total += extraFeeTotal;
                }else if (kg < 150){
                    //От 90 кг вкл. до 150 кг – на килограм по 1 % от съответната цена на километър
                    total = distance * 0.2;
                    extraFee = 0.2 * 0.01;
                    extraFeeKm = extraFee * kg;
                    extraFeeTotal = distance * extraFeeKm;
                    total += extraFeeTotal;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kg, total);

        //"The delivery of your shipment with weight of {тегло} kg. would cost {цена} lv."
        //Теглото да бъде закръглено до третия знак след десетичната запетая
        //Цената да бъде закръглена до втория знак след десетичната запетая
    }
}
