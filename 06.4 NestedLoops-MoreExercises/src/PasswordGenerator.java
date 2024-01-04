import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int l = Integer.parseInt(input.nextLine());
        //Символ 1: цифра от 1 до n.
        //Символ 2: цифра от 1 до n.
        //Символ 3: малка буква измежду първите l букви на латинската азбука.
        //Символ 4: малка буква измежду първите l букви на латинската азбука.
        //Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet.substring(0, l);
        boolean flag = false;
        //На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < alphabet.length(); k++) {
                    for (int f = 0; f < alphabet.length(); f++) {
                        for (int g = 1; g <= n; g++) {
                            if (g > i && g > j) {
                                if (flag){
                                    System.out.print(" ");
                                }
                                System.out.printf("%d%d%c%c%d", i, j, alphabet.charAt(k), alphabet.charAt(f), g);
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
