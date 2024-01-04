import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        //На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        //След това многократно се четат по два реда:
        //Име на задача - текст
        //Оценка - цяло число в интервала [2…6]
        //Незадоволителна е всяка оценка, която е по-малка или равна на 4.
        Scanner input = new Scanner(System.in);
        int maxPoorGrades = Integer.parseInt(input.nextLine());
        int flag = 0;
        double average = 0;
        int problemsNum = 0;
        String lastProblem = "";
        while (true){
            String problemName = input.nextLine();
            if (problemName.equals("Enough")){
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",average/problemsNum, problemsNum, lastProblem);
            break;
            }

            double grade = Double.parseDouble(input.nextLine());
            if (grade <= 4){
                flag++;
                if (flag >= maxPoorGrades){
                    System.out.printf("You need a break, %d poor grades.", flag);
                    break;
                }
            }
            problemsNum++;
            average+=grade;
            lastProblem = problemName;

        }
        //Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
        //"Average score: {средна оценка}"
        //"Number of problems: {броя на всички задачи}"
        //"Last problem: {името на последната задача}"
        //Ако получи определения брой незадоволителни оценки:
        //"You need a break, {брой незадоволителни оценки} poor grades."
        //Средната оценка да бъде форматирана до втория знак след десетичната запетая.
    }
}
