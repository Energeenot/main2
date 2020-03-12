import java.util.Locale;
import java.util.Scanner;

public class remainder {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            scanner.useLocale(Locale.UK);
            int a = readint();
            int b = readint();
            int c = readint();
            int d = readint();
            while (a<=b) {
                if (a%d==c){
                    System.out.print(a + " ");
                }
            a=a+1;
            }
        }

        public static int readint() {
            return scanner.nextInt();
        }

}

