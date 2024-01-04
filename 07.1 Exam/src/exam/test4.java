package exam;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        Scanner input = new Scanner(System.in);
        int studentsNum = Integer.parseInt(input.nextLine());
        double excelentGrade = 0;
        double goodGrade = 0;
        double averageGrade = 0;
        double poorGrade = 0;
        double totalGrades = 0;
        for (int i = 0; i < studentsNum; i++){
            double grade = Double.parseDouble(input.nextLine());
            totalGrades+=grade;
            if (grade >= 5){
                excelentGrade++;
            } else if (grade >= 4){
                goodGrade++;
            } else if (grade >= 3){
                averageGrade++;
            }else
                poorGrade++;
        }
        System.out.printf("Top students: %.2f%%%n",excelentGrade/studentsNum*100);
        //Ред 1 - "Top students: {процент студенти с успех 5.00 или повече}%"
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodGrade/studentsNum*100);
        //Ред 2 - "Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averageGrade/studentsNum*100);
        //Ред 3 - "Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
        System.out.printf("Fail: %.2f%%%n", poorGrade/studentsNum*100);
        //Ред 4 - "Fail: {по-малко от 3.00}%"
        System.out.printf("Average: %.2f", totalGrades/studentsNum);
        //Ред 5 - "Average: {среден успех}"
    }
}
