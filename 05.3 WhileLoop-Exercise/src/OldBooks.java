import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        //въвежда търсената от нея книга (текст)
        //Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
        //програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст),
        //която тя проверява.
        //Книгите в библиотеката са свършили щом получите текст "No More Books".
        //Ако не открие търсената книгата да се отпечата на два реда:
        //"The book you search is not here!"
        //"You checked {брой} books."
        //Ако открие книгата си се отпечатва един ред:
        //"You checked {брой} books and found it."
        Scanner input = new Scanner(System.in);
        String searchedBook = input.nextLine();
        String libraryBook = input.nextLine();
        int flag = 0;

        while (true){
            if (libraryBook.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.", flag);
                break;
            } else if (libraryBook.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.", flag);
                break;
            }
            flag++;
            libraryBook = input.nextLine();
        }

    }
}
