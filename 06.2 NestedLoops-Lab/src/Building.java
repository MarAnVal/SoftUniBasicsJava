import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        //извежда на конзолата номерата на стаите в една сграда (в низходящ ред), като са изпълнени следните условия:
        //На всеки четен етаж има само офиси
        //На всеки нечетен етаж има само апартаменти
        //Всеки апартамент се означава по следния начин : А{номер на етажа}{номер на апартамента}, номерата на апартаментите започват от 0.
        //Всеки офис се означава по следния начин : О{номер на етажа}{номер на офиса}, номерата на офисите също започват от 0.
        //На последният етаж винаги има апартаменти и те са по-големи от останалите, за това пред номера им пише 'L', вместо 'А'.
        //Ако има само един етаж, то има само големи апартаменти!
        //От конзолата се прочитат две цели числа - броят на етажите и броят на стаите за един етаж.

        Scanner input = new Scanner(System.in);
        int floors = Integer.parseInt(input.nextLine());
        int rooms = Integer.parseInt(input.nextLine());

        for (int k = floors; k > 0; k--){
            for (int j = 0; j < rooms; j++){
                if (k == floors) {
                    System.out.printf("L%d%d",k, j);
                } else if (k % 2 == 0){
                    System.out.printf("O%d%d", k, j);
                }else {System.out.printf("A%d%d", k, j);}
                if (j != rooms - 1){System.out.print(" ");}
                else {System.out.printf("%n");}
            }
        }

    }
}
