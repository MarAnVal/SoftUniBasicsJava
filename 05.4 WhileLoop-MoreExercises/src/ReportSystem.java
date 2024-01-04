import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        //Сумата, която се очаква да бъде събрана от продажбите - цяло число в интервала [1 ... 10000]
        //На всеки следващ ред, до получаване на командата "End"
        //или докато не се съберат нужните средства: цените на предметите, които ще бъдат закупени - цяло число в интервала [1 ... 500]
        Scanner input = new Scanner(System.in);
        int neededMoney = Integer.parseInt(input.nextLine());
        boolean flag = true;
        int count = 1;
        double totalCS = 0;
        double totalCC = 0;
        int csCount = 0;
        int ccCount = 0;
        while (flag){
            String price = input.nextLine();
            switch (price){
                case "End":
                    //При получаване на команда "End", да се изпише един ред:
                    //"Failed to collect required money for charity."
                    System.out.print("Failed to collect required money for charity.");
                    flag = false;
                    break;
                default:
                    //плащанията за закупените продукти винаги се редуват: плащане в брой и плащане с карта.
                    if (count % 2 != 0){
                        //в брой
                        //Ако продуктът надвишава 100лв., за него не може да се плати в брой
                        //При успешна транзакция: "Product sold!"
                        //При неуспешна транзакция: "Error in transaction!"
                        if (Double.parseDouble(price) <= 100){
                            System.out.println("Product sold!");
                            csCount++;
                            totalCS += Double.parseDouble(price);
                        } else
                            System.out.println("Error in transaction!");
                    } else {
                        //карта
                        //Ако продуктът е на цена под 10лв., за него не може да се плати с кредитна карта
                        //При успешна транзакция: "Product sold!"
                        //При неуспешна транзакция: "Error in transaction!"
                        if (Double.parseDouble(price) >= 10){
                            System.out.println("Product sold!");
                            ccCount++;
                            totalCC += Double.parseDouble(price);
                        } else
                            System.out.println("Error in transaction!");
                    }
                    count++;
                    break;
            }
            //Програмата приключва или след като получим команда "End" или след като средствата бъдат събрани.
            if (totalCS + totalCC >= neededMoney){
                //Ако сумата на всички закупени продукти надвиши или достигне очакваната сума, програмата трябва да приключи и на конзолата да се изпишат два реда:
                //"Average CS: {средно плащане в кеш на човек}"
                //"Average CC: {средно плащане с карта на човек}"
                System.out.printf("Average CS: %.2f%nAverage CC: %.2f", totalCS / csCount, totalCC / ccCount);
                flag = false;
            }
        }

        //Плащанията трябва да бъдат форматирани до втората цифра след десетичния знак.
    }
}
