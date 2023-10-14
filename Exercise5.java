import java.util.Scanner;
    public class Exercise5 {
        public static void main(String[] args) {
            // Press Alt+Intro with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            System.out.print("Hello please insert a number to check: ");

            Scanner sc=new Scanner(System.in);

            int intvalue = sc.nextInt();

            String positiveornegative = "negative";
            String evenorOdd = "Odd";

            if(intvalue == 0)
            {
                System.out.print("The number is zero (adn its even)");
                return;
            }

            if(intvalue > 0)
            {
                positiveornegative = "Positive";

            }

            if(intvalue % 2 == 0) {
                evenorOdd = "Even";
            }

            System.out.print("The number is "+ positiveornegative + " and "+ evenorOdd);

        }
    }