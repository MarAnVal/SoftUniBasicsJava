import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        //Цифрата на единиците и цифрата на стотиците трябва да бъде четна
        //Цифрата на десетиците да бъде просто число в диапазона (2...7).
        //Горната граница на стотиците - цяло число в диапазона (1-9)
        //Горната граница на десетиците - цяло число в диапазона (1-9)
        //Горната граница на единиците - цяло число в диапазона (1-9)
        //отпечата на на нов ред всичкяко трицифрено число, за което всяка една част отговаря на условията по-горе.
        Scanner input = new Scanner(System.in);
        int hunderedMax = Integer.parseInt(input.nextLine());
        int decedesMax = Integer.parseInt(input.nextLine());
        int unitsMax = Integer.parseInt(input.nextLine());


        for (int i = 1; i <= hunderedMax; i++){

            if (i % 2 != 0) {continue;}
            for (int j = 2; j <= decedesMax; j++){
                boolean flag = false;
                int count = 0;
                for (int l = 2; l <= j; l++){
                    if (j % l == 0) {
                        count++;
                    }
                    if (count > 1){
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    for (int k = 1; k <= unitsMax; k++) {
                        if (k % 2 != 0) {
                            continue;
                        }
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }                }


            }
        }
    }

