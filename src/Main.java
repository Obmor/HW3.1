public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a, b));

        double x1 = 10.635;
        double y1 = 3.76;
        System.out.printf("Значение %.3f в степени %.2f равно %.3f \n", x1, y1, Math.pow(x1, y1));
        System.out.printf("pow(%.3f, %.3f) = %.3f \n", x1, y1, Math.pow(x1, y1));

        int x2 = 2;
        double y2 = 3.76;
        System.out.printf("Значение 2 в степени %.2f равно %.3f \n", y2, Math.pow(x2, y2));
        System.out.printf("pow(2, %.3f) = %.3f", y2, Math.pow(x2, y2));
    }
}