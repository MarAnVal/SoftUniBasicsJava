public class MultiplicationTable {
    public static void main(String[] args) {
        //Отпечатайте на конзолата таблицата за умножение за числата от 1 до 10
        //във формат: "{първи множител} * {втори множител} = {резултат}".
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <=10; j++){
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
