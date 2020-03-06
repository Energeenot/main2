import java.util.Locale;
import java.util.Scanner;

public class task6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        int x = readint();
        String result = getResult(x);
        System.out.println(result);


    }

    public static int readint() {
        return scanner.nextInt();
    }

    public static String getResult(int x) {
        if (x%10==1 && x!=11 && x!=111) {
            return x + " bochka";
        }
        if (x%10>=2 && x%10<=4 && x!=12 && x!=+13 && x!=14 && x<111){
            return x + " bochki";
        }
        else{
            return x + " bochek";
        }
    }
}