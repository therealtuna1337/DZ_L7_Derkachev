import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        new Task5();
        Task5.sumChecker();
        isPositive();
        new Task7();
        Task7.checker();
        new Task8();
        Task8.repeater();
        new Task9();
        Task9.t9();
        new Task10();
        Task10.arraySwitcher();
        t11();
        t12();
        t13();
        t14();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -11;
        if ((a + b) > 0) {
            System.out.println("Сумма положительная");
        } else if ((a + b) < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма равна нулю");
        }

    }
    public static void printColor() {
        int value = 33;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a, b;
        a = 7;
        b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static class Task5 extends Main {
        public static void sumChecker() {
            Scanner scanner = new Scanner(System.in);
            int a, b, c;
            System.out.print("Введите первое число");
            a = scanner.nextInt();
            System.out.println("Введите второе число");
            b = scanner.nextInt();
            c = a + b;
            System.out.println(isSumInRange(c));
        }

        public static boolean isSumInRange(int c) {
            return c >= 10 && c <= 20;
        }
    }

    public static void isPositive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static class Task7 extends Main {
        public static void checker() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int a = scanner.nextInt();
            System.out.println(isNegative(a));
        }

        public static boolean isNegative(int a) {
            return a < 0;
        }
    }

    public static class Task8 extends Main {
        public static void repeater() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку");
            String a = scanner.nextLine();
            System.out.println("Введите количество повторений");
            int b = scanner.nextInt();
            printString(a, b);
        }

        public static void printString(String a, int b) {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }
    }
    public static class Task9 extends Main {
        public static void t9() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год");
            int y = scanner.nextInt();
            System.out.println(isLeap(y));
    }
        public static boolean isLeap(int y) {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    return y % 400 == 0;
                }
                return true;
            }
            return false;
        }
    }

    public static class Task10 extends Main {
        public static void arraySwitcher() {
                int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                System.out.println("Старые значения: ");
                for(int i = 0; i < arr.length; i++){
                    System.out.print (arr[i] + " ");
                }
                System.out.println(" ");
                for(int i = 0; i < arr.length; i++)
                    if(arr[i] == 1) {
                        arr[i] = 0;
                    }else arr[i] = 1;
                System.out.println("Новые значения: ");
                for(int i = 0; i < arr.length; i++){
                    System.out.print (arr[i] + " ");
                }
            }
        }

    public static void t11() {
        int[] arr = new int[100];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + 1;
                System.out.println(arr[i]);
            }
        }

    public static void t12() {
            int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.print("Старые значения: ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                if (arr[i] < 6) arr[i] = arr[i] * 2;
            }
            System.out.print("Новые значения: ");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print (arr[i]+" ");
            }
        }
    public static void t13() {
            int[][] arr = new int[5][5];

            for (int i = 0; i < arr.length; i++) {
                arr[i][arr.length - i - 1] = 1;
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][i] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    public static void t14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение");
        int initialValue = scanner.nextInt();

            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
            }
            for (int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);
        }

    }