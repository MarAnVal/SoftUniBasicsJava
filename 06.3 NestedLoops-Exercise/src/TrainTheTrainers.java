import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        //От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
        //След това на отделен ред се прочита името на презентацията - текст
        //За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
        //на конзолата се печата "{името на презентацията} - {средна оценка}."
        //След получаване на команда "Finish"
        //на конзолата се печата "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
        //Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
        Scanner input = new Scanner(System.in);
        int lectors = Integer.parseInt(input.nextLine());
        String presentationName = input.nextLine();
        double average = 0;
        int counter = 0;
        double averageGrade = 0;

        while (!presentationName.equals("Finish")){
             for (int i = 1; i <= lectors; i++) {
                 counter++;
                 double grade = Double.parseDouble(input.nextLine());
                averageGrade += grade;
                if (i == lectors){
                    System.out.printf("%s - %.2f.%n",presentationName, averageGrade / lectors);
                    average += averageGrade;
                    averageGrade = 0;
                    break;
                }
             }
             presentationName = input.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", average / counter);
    }
}

