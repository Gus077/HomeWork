import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkHorizontalAndVertical(DOT_X) || checkDiagonal(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkHorizontalAndVertical(DOT_O) || checkDiagonal(DOT_O)) {
                System.out.println("Победил Искусственный Интелект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static boolean checkHorizontalAndVertical(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int hor, vert;
            hor = vert = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    hor++;
                } else hor = 0;
                if (map[j][i] == symb) {
                    vert++;
                } else vert = 0;
                if (hor == DOTS_TO_WIN || vert == DOTS_TO_WIN) return true;
            }

        }
        return false;
    }

    public static boolean checkDiagonal(char symb) {
        int diag, upDiag, downDiag, antiDiag, upAntidiag, downAntidiag;
        diag = upDiag = downDiag = antiDiag = upAntidiag = downAntidiag = 0;
        for (int i = 0; i < SIZE; i++){
            if(map[i][i] == symb){
                diag++;
            } else diag = 0;
            if (map[i][SIZE - 1 - i] == symb) {
                antiDiag++;
            } else antiDiag = 0;
            if (diag == DOTS_TO_WIN || antiDiag == DOTS_TO_WIN) return true;
        }
            for (int i = 1; i < SIZE; i++) {
                for (int j = 0; i + j < SIZE; j++) {
                    if (map[j][j + i] == symb) {
                        upDiag++;
                    } else upDiag = 0;
                    if (map[i + j][j] == symb) {
                        downDiag++;
                    } else downDiag = 0;
                    if (map[SIZE - 1 - (i + j)][j] == symb) {
                        upAntidiag++;
                    } else upAntidiag = 0;
                    if (map[SIZE - 1 - j][i+j] == symb) {
                        downAntidiag++;
                    } else downAntidiag = 0;
                    if (upDiag == DOTS_TO_WIN || downDiag == DOTS_TO_WIN || upAntidiag == DOTS_TO_WIN
                            || downAntidiag == DOTS_TO_WIN) return true;
                }
            }
        return false;
    }
}