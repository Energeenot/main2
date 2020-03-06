import java.util.Locale;
import java.util.Scanner;

public class max_value {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        int x = readint();
        int y = readint();
        String result = getResult(x, y);
        System.out.println(result);

    }



    public static String getResult(int x, int y) {
        if (x>y) {
             return x+"";
        }
        else{
            return y+"";
        }
    }
    public static int readint() {
        return scanner.nextInt();
    }
}
