import java.util.Locale;
import java.util.Scanner;

public class Squares {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        int x = readint();
        int y = readint();
        while(x<=y){
            if (x*x>=x && x*x<=y){
                System.out.print(x*x + " ");
            }
            x++;
        }
    }
    public static int readint() {
        return scanner.nextInt();
    }
}
