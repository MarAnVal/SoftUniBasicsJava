public class NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        //Напишете програма, която печата всички числа в интервала от 1 до 100,
        //който се делят на 3 без остатък, по едно на ред.
        int number = 1;
        while (number < 100) {
            if (number % 3 == 0){
                System.out.println(number);
            }
            number++;
        }
    }
}
