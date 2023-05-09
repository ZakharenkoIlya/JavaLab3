package edu.mde.lab1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static double Func1(double a, double b, double x)
    {
        return Math.sqrt(Math.abs(a*1/Math.tan(x)-b*Math.tan(x)))+Math.pow((x+a),3);
    }

    public static double Func2(double a, double b, double x)
    {
        return x*Math.pow(Math.log(Math.abs(a*Math.sin(x)+b*Math.cos(x))),2);
    }

    private double a = 0.5;
    private double b = -0.3;
    private double x = -1.25;

    public void EnterValues()
    {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Уведіть a:");
        this.a = scanner.nextDouble();
        System.out.print("Уведіть b:");
        this.b = scanner.nextDouble();
        System.out.print("Уведіть x:");
        this.x = scanner.nextDouble();
    }

    public void OutValues()
    {
        System.out.format("a = %f", a).println();
        System.out.format("b = %f", b).println();
        System.out.format("x = %f", x).println();
    }

    public void Results() {
        System.out.format("f1(x) = %f", Func1(a, b, x)).println();
        System.out.format("f2(x) = %f", Func2(a, b, x)).println();
    }

    private static final SimpleDateFormat dateFormat =new SimpleDateFormat("dd.MM.yy");

    public static void Date()
    {
        final Date now = new Date();
        System.out.format("Поточна дата %s", dateFormat.format(now)).println();
    }

    public void Menu()
    {
        System.out.println("Меню:");
        System.out.println("1. Введення значень вхідних даних");
        System.out.println("2. Виведення значень вхідних даних");
        System.out.println("3. Виведення обчислених значень функцій");
        System.out.println("4. Виведення поточної дати");
        System.out.println("5. Вихід із меню");
    }

    public void EnterMenu() {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.print("Оберіть пункт меню: ");
            final int selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    EnterValues();
                    break;
                case 2:
                    OutValues();
                    break;
                case 3:
                    Results();
                    break;
                case 4:
                    Date();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Уведене значення має бути у діапазоні 1..5");
            }
        }
        }

        public static void main (String[]args)
        {
            final Main main = new Main();
            System.out.println("Розпочато роботу із програмою.");
            main.OutValues();
            main.EnterMenu();
            System.out.println("Роботу програми закінчено.");
        }

}