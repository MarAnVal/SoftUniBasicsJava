package exam;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //K – цяло число в интервала [0..8]
        //L – цяло число в интервала [0..9]
        //M– цяло число в интервала [0..8]
        //N – цяло число в интервала [0..9]
        Scanner input = new Scanner(System.in);
        int k = Integer.parseInt(input.nextLine());
        int l = Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        int firstNum = 0;
        int secondNum = 0;
        int count = 0;
        boolean flag = true;
        //кой са първите 6 валидни смени
        //Първата цифра на първото число е в интервала от цифрата K до 8, включително.
        //Втората цифра на първото число е в интервала от 9 до L, включително.
        //Първата цифра на второто число е в интервала от цифрата M до 8, включително.
        //Втората цифра на второто число е в интервала от 9 до N, включително.
        //За да бъде възможна една смяна, първата цифра на всеки от номерата трябва да бъде четна, а втората -  нечетна.
        for(int i = k; i <=8; i++){
            if (i % 2 != 0){continue;}
            for(int j = 9; j >= l; j--){
                if (j % 2 == 0){continue;}
                for (int u = m; u <= 8; u++){
                    if (u % 2 != 0){continue;}
                    for (int h = 9; h >= n; h--){
                        if (h % 2 == 0){continue;}
                        else {
                            firstNum = i * 10 +j;
                            secondNum = u * 10 + h;
                            if (firstNum != secondNum){
                                //Ако смяната е възможна и номерата НЕ съвпадат, тя Е валидна и трябва да се отпечата:
                                //"{K}{L} - {M}{N}"
                                if (flag){System.out.printf("%n");}
                                System.out.printf("%d%d - %d%d", i, j, u, h);
                                count++;
                                flag = true;
                            } else {
                                //Ако смяната е възможна, но номерата съвпадат, тя НЕ е валидна и трябва да се отпечата:
                                //"Cannot change the same player."
                                if (flag){System.out.printf("%n");}
                                System.out.printf("Cannot change the same player.");
                                flag = true;
                            }
                        }
                        if (count == 6){break;}
                    }
                    if (count == 6){break;}
                }
                if (count == 6){break;}
            }
            if (count == 6){break;}
        }
    }
}
