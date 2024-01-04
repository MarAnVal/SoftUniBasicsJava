import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //прочита възраст (десетично число)
        // пол ("m" или "f")
        // "Mr." - мъж (пол "m") на 16 или повече години
        // "Master" - момче (пол "m") под 16 години
        // "Ms." - жена (пол "f") на 16 или повече години
        // "Miss" - момиче (пол "f") под 16 години

        Double age = Double.parseDouble(input.nextLine());
        String gender = input.nextLine();

        String out = "";

        switch (gender){
            case "m":
                if (age < 16){
                    out = "Master";
                } else out = "Mr."; break;
            case "f":
                if (age < 16){
                    out = "Miss";
                } else out = "Ms."; break;
        }
        System.out.println(out);

    }
}
