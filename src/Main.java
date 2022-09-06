import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите назначение цены для xx");
        int xx = scanner.nextInt();
        int yy = 10;
        int x = 5;
        int y = 10;
        System.out.println("Введите x стороны треугольника");
        int x_4 = scanner.nextInt();
        System.out.println("Введите y стороны треугольника");
        int y_4 = scanner.nextInt();
        int q = 10;
        int w = 3;
        System.out.println("Введите трёхзначное число");
        int n = scanner.nextInt();
        double n_7 = 123.6;
        System.out.println("Введите число для превода в двоичную систему");
        int chislo = scanner.nextInt();
        Task_1_a(xx, yy);
        Task_1_b(xx, yy);
        Task_1_c(xx, yy);
        Task_2(xx, yy);
        Task_3(x, y);
        Task_4(x_4, y_4);
        Task_5(q, w);
        Task_6(n);
        Task_7(n_7);
        Task_8();
        Task_9();
        Task_10();
        Task_11(chislo);

    }

    public static void Task_1_a(int xx, int yy) {
        double A = xx;
        int B = yy;
        double A_with_sale = A - (A / 100 * 15);
        System.out.println(A_with_sale);
        double sum = A_with_sale * 10 + 2 * B;
        System.out.println(sum + "руб");
        System.out.println();
    }

    public static void Task_1_b(int xx, int yy) {
        double A = xx;
        int B = yy;
        double A_with_sale = A - (A / 100 * 50);
        System.out.println(A_with_sale);
        double sum = A_with_sale * 7 + B;
        System.out.println(sum + "руб");
        System.out.println();
    }

    public static void Task_1_c(int xx, int yy) {
        double A = xx;
        int B = yy;
        double A_with_sale = A - (A / 100 * 10);
        System.out.println(A_with_sale);
        double sum = A_with_sale * 2 + B * 3;
        System.out.println(sum + "руб");
        System.out.println();
    }

    public static void Task_2(int xx, int yy) {
        double A = xx;
        double B = yy;
        double sum = A + B;
        double sum_sale = (A + B) / 100 * 10;
        System.out.println("Цена без скидки = " + sum);
        sum -= sum_sale;
        System.out.println("Скидка = " + sum_sale);
        System.out.println("Итоговая цена = " + sum);
        System.out.println();
    }

    public static void Task_3(int x, int y) {
        System.out.println("Сторона x = " + x + " " + "Сторона y = " + y);
        double c = Math.sqrt(x * x + y * y);
        System.out.println("Гипотенуза = " + c);
        System.out.println();
    }

    public static void Task_4(int x, int y) {
        System.out.println("Сторона x = " + x + " " + "Сторона y = " + y);
        double c = Math.sqrt(x * x + y * y);
        System.out.println("Гипотенуза = " + c);
        System.out.println();
    }

    public static void Task_5(int q, int w) {
        int Division_with_remainder = q % w;
        System.out.println("Остаток = " + Division_with_remainder);
        System.out.println();
    }

    public static void Task_6(int n) {
        int sum = 0;
        int memory = 0;
        for (int N = n; N > 0; ) {
            memory = N % 10;
            N /= 10;
            sum += memory;
        }
        System.out.println("Сумма чисел трёхзначного числа = " + sum);
        System.out.println();
    }

    public static void Task_7(double n) {
        double result = Math.ceil(n);
        System.out.println("Округление до ближайшего числа = " + result);
        System.out.println();
    }

    public static void Task_8() {
        System.out.println("Привет!");
        int z = 2147483647 + 1;//мы выходим за пределы диапазона значений int
        System.out.println(z);
    }

    public static void Task_9() {
        int x = 5;
        int y = 7;
        int z = 0;
        int k = 9;
        z = x * x + y * y;
        System.out.println("z1 = " + z);
        z = 0;
        z = x * x * x;
        System.out.println("z2 = " + z);
        z = 0;
        // System.out.println("k = "+x/z); делить на 0 нельзя, компилятор сразу выдаёт ошибку
        System.out.println();
    }

    public static void Task_10() {
        int x = 0;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;
        int result = (x + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9) / 10;
        System.out.println("int = " + result);
        double result_double = (x + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9) / 10;
        System.out.println("double = " + result_double);
        double y = 0;
        double y1 = 1;
        double y2 = 2;
        double y3 = 3;
        double y4 = 4;
        double y5 = 5;
        double y6 = 6;
        double y7 = 7;
        double y8 = 8;
        double y9 = 9;
        double result_double_1 = (y + y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8 + y9) / 10;
        System.out.println("double = " + result_double_1);
        System.out.println();
    }

    public static void Task_11(int chislo) {
        int pum = 0;
        while (chislo > 0) {
            pum = chislo % 2;
            if (pum % 2 == 0) {
                System.out.print(pum % 2);
            } else {
                System.out.print(pum % 2);
            }
            chislo /= 2;
        }

    }

}