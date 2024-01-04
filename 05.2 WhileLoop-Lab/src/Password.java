import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //при въвеждане на грешна парола: потребителя да се подкани да въведе нова парола
        //при въвеждане на правилна парола: отпечатваме "Welcome {username}!"
        String name = input.nextLine();
        String pass = input.nextLine();

        while (true){
            String pass1 = input.nextLine();
            if (pass1.equals(pass)) {
                System.out.printf("Welcome %s!", name);
                break;
            }
        }
    }
}
