import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double x, y,c;
        char a;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число");
            x = scanner.nextDouble();
            System.out.println("Введите арифметическую операцию");
            a = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            y = scanner.nextDouble();
            switch (a){
                case '-':
                    c =x-y;
                    System.out.println(x + "-" + y + "=" + c);
                    break;
                case '+':
                    c=x+y;
                    System.out.println(x + "+" + y + "=" + c);
                    break;
                case '*':
                    c=x*y;
                    System.out.println(x + "*" + y + "=" + c);
                    break;
                case '/':
                    c=x/y;
                    System.out.println(x + "/" + y + "=" + c);
                    break;
            }
        }
    }
}