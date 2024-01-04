import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        //Брой страници в текущата книга – цяло число в интервала [1…1000]
        //Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        Scanner input = new Scanner(System.in);

        int bookPages = Integer.parseInt(input.nextLine());
        int pagesPerHour = Integer.parseInt(input.nextLine());
        int days = Integer.parseInt(input.nextLine());

        int hoursToRead = bookPages/pagesPerHour;
        int houersPerDay = hoursToRead/days;

        System.out.println(houersPerDay);

    }
}
