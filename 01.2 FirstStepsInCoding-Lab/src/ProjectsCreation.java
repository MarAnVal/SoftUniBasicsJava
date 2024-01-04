import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        // Името на архитекта - текст
        //Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project."
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int projects = Integer.parseInt(input.nextLine());
        int hours = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project.", name, hours, projects);


    }
}
