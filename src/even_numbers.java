import java.util.Locale;
import java.util.Scanner;

public class even_numbers {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        int x = readint(); int y = readint();
        int s = 0;
        while (x<=y){
            if (x%2==0){
                s = x;
                System.out.print(s + " ");

            }
            x++;
        }
    }
    public static int readint() {
        return scanner.nextInt();
    }
}

