import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        //Ако номерът започва с четна цифра, то той трябва да завършва на нечетна цифра и обратното – ако започва с нечетна,  завършва на четна
        //Първата цифра от номера е по-голяма от последната
        //Сумата от втората и третата цифра трябва да е четно число
        //1. Първи ред - едноцифрено число - началото на интервала – цяло число в интервала [1…9]
        //2. Втори ред - едноцифрено число - края на интервала – цяло число в интервала [1…9]
        //На конзолата трябва да се отпечатат всички специални номера, разделени с интервал.
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        boolean flag = false;

        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                for (int k = start; k <= end; k++){
                    if ((j + k) % 2 != 0){
                        continue;
                    }
                    for (int l = start; l <= end; l++){
                        if ((l < i) && (i % 2 == 0) && (l %2 != 0)){
                            if (flag){
                                System.out.print(" ");
                            }
                            System.out.printf("%d%d%d%d", i, j, k, l);
                            flag = true;
                        }
                    }
                    for (int l = start; l <= end; l++){
                        if ((l < i) && (i % 2 != 0) && (l %2 == 0)){
                            if (flag){
                                System.out.print(" ");
                            }
                            System.out.printf("%d%d%d%d", i, j, k, l);
                            flag = true;
                        }
                    }
                }
            }
        }
    }
}
