import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        //Входът се чете от конзолата и се състои от едно цяло число в интервала [1…600000]
        //· N да се дели на всяка една от неговите цифри без остатък.
        //На конзолата трябва да се отпечатат всички "специални" числа, разделени с интервал
        //генерира всички възможни "специални" числа от 1111 до 9999
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        boolean space = false;

        for (int i = 1111; i <= 9999; i++){
            boolean flag = false;
            String curentNum = "" + i;
            for (int j = 0; j < curentNum.length(); j++){
                String buffer = "" + curentNum.charAt(j);
                if (Integer.parseInt(buffer) == 0){
                    flag = true;
                    break;}
                if (n % Integer.parseInt(buffer) != 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                if (space){
                    System.out.printf(" %d", i);
                } else {
                    System.out.printf("%d", i);
                    space = true;}
            }
        }
    }
}
