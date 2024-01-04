public class NumbersEndingIn7 {
    public static void main(String[] args) {
       for (int i = 0; i < 1000;i++)  {
           double j = i % 10.0;
           if (j == 7){
               System.out.println(i);
           }
       }

    }
}
