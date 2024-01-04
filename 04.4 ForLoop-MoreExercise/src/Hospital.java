import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        //На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]
        int days = Integer.parseInt(input.nextLine());
        int doctors = 7;
        int t = 0;
        int unt = 0;
        for (int i = 1; i <= days; i++){
            int pacients = Integer.parseInt(input.nextLine());
            if (i % 3 == 0 && unt > t){doctors++;}
            //Всеки трети ден, болницата прави изчисления и ако броят на непрегледаните пациенти е по-голям от броя на прегледаните,
            //се назначава още един лекар.
            //Като назначаването става преди да започне приемът на пациенти за деня.
            if (pacients > doctors) {
                unt = unt + (pacients - doctors);
                t = t + doctors;
            } else{
                t = t + pacients;}
        }
        //Да се отпечатат на конзолата 2 реда :
        //На първия ред: "Treated patients: {брой прегледани пациенти}."
        //На втория ред: "Untreated patients: {брой непрегледани пациенти}."
        System.out.printf("%nTreated patients: %d.", t);
        System.out.printf("%nUntreated patients: %d.", unt);
    }
}
