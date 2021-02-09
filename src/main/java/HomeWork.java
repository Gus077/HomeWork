public class HomeWork {
    public static void main(String[] args) {
        byte a = 2; short b = 15; int c = 1000000; long d = 2000000000000l; float e = 1.3f;
        double f = 2.6; char ch = '*'; boolean bool = true;
        System.out.println(calculate(1.2f, 3.1f,2.2f,1.4f));
        System.out.println(task10and20(10,8));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-4));
        greetings();
        year (2021);

    }
    public static float calculate (float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }
    public static boolean task10and20 (int a, int b) {
        int result = a + b;
        if (result <= 10 && result >= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative (int a) {
        if (a >= 0){
            System.out.println(a + " Положительное число");
        } else {
            System.out.println(a + " Отрицательное число");
        }
    }
    public static boolean isNegative (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void greetings () {
        System.out.println("Hello, Сергей");
    }

    public static void year (int a) {
        if (a % 400 == 0) {
            System.out.println("Високосный");
        } else if (a % 100 == 0){
            System.out.println("Не високосный");
        } else if (a % 4 == 0){
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

}

