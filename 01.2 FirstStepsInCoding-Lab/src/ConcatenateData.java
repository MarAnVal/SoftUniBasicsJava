import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        //прочита от конзолата име, фамилия, възраст и град
        //"You are firstName lastName&gt, a age-years old person from town "

        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String town = input.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}
