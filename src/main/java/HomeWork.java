import java.util.Arrays;

public class HomeWork {
   /*
     1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью
      цикла(-ов) заполнить его диагональные элементы единицами;
     5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
      если в массиве есть место, в котором сумма левой и правой части массива равны.
      Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
      граница показана символами ||, эти символы в массив не входят.
     7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
     отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
      Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
      (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
      При каком n в какую сторону сдвиг можете выбирать сами.
     */

    public static void main(String[] args) {
        System.out.println("Task 1");

        int[] first = {1, 0, 0, 1, 1, 1};

        System.out.println(Arrays.toString(first));
        convert(first);
        System.out.println(Arrays.toString(first));


        System.out.println("Task 2");

        int[] second = new int[8];
        System.out.println(Arrays.toString(second));
        fillArray(second);
        System.out.println(Arrays.toString(second));

        System.out.println("Task 3");

        int [] third = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(third));
        change(third);
        System.out.println(Arrays.toString(third));

        System.out.println("Task 4");

        int [][] fourth = new int [5][5];

        fillDiagonal(fourth);
        System.out.println();

        System.out.println("Task 5");

        int [] fifth = {15,25,-100,800,1240,-1050,0};
        minMaxAverage (fifth);
        System.out.println();

        System.out.println("Task 6");

        int[] sixth = {4, 6, 15, 25};
        leftAndRightSum(sixth);

        System.out.println("Task 7");
        int[] seventh = {1, 2, 3, 4};
        shiftArray(seventh, 2);
        System.out.println(Arrays.toString(seventh));
    }

    public static void convert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
    }

    public  static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 3;
        }
    }
    public static void change(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            } else System.out.print(arr[i] + " ");
        }
    }
    public static void fillDiagonal (int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0, x = arr.length -1; j < arr.length; j++, x--){
                if (i == j || i == x){
                    arr [i][j] = 1;
                }
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void minMaxAverage (int[] arr ){
        int min, max;
        min = max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
    public static boolean leftAndRightSum(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            System.out.print("leftSum: " + leftSum + " ");
            for (int k = arr.length - 1; k > i - 1; k--) {
                rightSum += arr[k];
            }
            System.out.print("rightSum: " + rightSum + " ");
            if (leftSum == rightSum) {
                System.out.println("Массив сбалансирован");
                return true;
            }
        }
        System.out.println("Массив не сбалансирован");
        return false;
    }

    static void shiftArray (int[] arr, int n){
        if (n > 0){
            for(int i = 0; i < n; i++){
                rightShift(arr);
            }
        }else {
            for (int i = 0; i > n; i--){
                leftShift(arr);
            }
        }
    }
    static void rightShift (int[] arr){
        int b = arr[0];
        arr[0] = arr[arr.length - 1];
        for(int i = 1; i < arr.length - 1;i++){
            arr[arr.length - i] = arr[arr.length - i - 1];
        }
        arr[1] = b;
    }
    static void leftShift (int[] arr){
        int b = arr[arr.length - 1];
        arr[arr.length -1] = arr[0];
        for(int i = 1; i < arr.length - 1; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 2] = b;
    }
}

