import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Градусите - цяло число в интервала [10…42]
        //Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
        //Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}."
        int degree = Integer.parseInt(input.nextLine());
        String time = input.nextLine();
        String outfit = "";
        String shous = "";

        switch (time) {
            //Morning
            //10 <= градуси <= 18    Outfit = Sweatshirt Shoes = Sneakers
            //18 < градуси <= 24     Outfit = Shirt Shoes = Moccasins
            //градуси >= 25          Outfit = T-Shirt Shoes = Sandals
            case "Morning":
                if (degree >= 25){ outfit = "T-Shirt"; shous = "Sandals"; break;}
                else if (degree > 18) { outfit = "Shirt"; shous = "Moccasins"; break;}
                else if (degree >= 10) { outfit = "Sweatshirt"; shous = "Sneakers"; break;};
                break;
            //Afternoon
            //10 <= градуси <= 18    Outfit = Shirt Shoes = Moccasins
            //18 < градуси <= 24     Outfit = T-Shirt Shoes = Sandals
            //градуси >= 25          Outfit = Swim Suit Shoes = Barefoot
            case "Afternoon":
                if (degree >= 25){ outfit = "Swim Suit"; shous = "Barefoot"; break;}
                else if (degree > 18) { outfit = "T-Shirt"; shous = "Sandals"; break;}
                else if (degree >= 10) { outfit = "Shirt"; shous = "Moccasins"; break;};
                break;
            //Evening
            //10 <= градуси <= 18    Outfit = Shirt Shoes = Moccasins
            //18 < градуси <= 24     Outfit = Shirt Shoes = Moccasins
            //градуси >= 25          Outfit = Shirt Shoes = Moccasins
            case "Evening":
                outfit = "Shirt"; shous = "Moccasins";
                break;

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shous);

    }
}
