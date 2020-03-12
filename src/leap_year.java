import java.util.Locale;
import java.util.Scanner;

public class leap_year {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        int x = readint();
        String result = getResult(x);
        System.out.println(result);

    }



    public static String getResult(int x) {
        if (x % 4==0 && x%100!=0 || x%400==0) {
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static int readint() {
        return scanner.nextInt();
    }
}
