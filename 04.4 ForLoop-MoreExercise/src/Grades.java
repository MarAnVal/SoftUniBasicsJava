import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        int n = Integer.parseInt(input.nextLine());
        double totalGrades = 0.0;
        int a = 0;
        int b = 0;
        int c = 0;
        int f = 0;
        for (int i = 0; i < n; i++){
            double grade = Double.parseDouble(input.nextLine());
            //Да се отпечатат на конзолата 5 реда, които съдържат следната информация:
            //Ред 1 - "Top students: {процент студенти с успех 5.00 или повече}%"
            //Ред 2 - "Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
            //Ред 3 - "Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
            //Ред 4 - "Fail: {по-малко от 3.00}%"
            //Ред 5 - "Average: {среден успех}"
            //Всички числа трябва да са форматирани до вторият знак след десетичната запетая.
            if (grade >= 5){
                a++; totalGrades = totalGrades + grade;
            }else if (grade >= 4){
                b++; totalGrades = totalGrades + grade;
            }else if (grade >= 3){
                c++; totalGrades = totalGrades + grade;
            }else {
                f++; totalGrades = totalGrades + grade;
            }
        }
        System.out.printf("%nTop students: %.2f", a * 100.0 / n); System.out.print("%");
        System.out.printf("%nBetween 4.00 and 4.99: %.2f", b * 100.0 / n); System.out.print("%");
        System.out.printf("%nBetween 3.00 and 3.99: %.2f", c * 100.0 / n); System.out.print("%");
        System.out.printf("%nFail: %.2f", f * 100.0 / n); System.out.print("%");
        System.out.printf("%nAverage: %.2f", totalGrades / n);
    }
}
