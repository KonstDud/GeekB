import java.util.Random;

public class SecondApp {
    public static void main(String[] args) {
//        1 Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;


        System.out.println("\n\n====№1=====\n");

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arr[i] = Math.abs(random.nextInt() % 2);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            arr[i] = (arr[i] + 1) % 2;
            System.out.print(arr[i] + " ");
        }
//        2. Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

        System.out.println("\n\n====№2=====\n");

        int[] arr1 = new int[8];
        for (int i = 0; i < 8; i++){
            System.out.print((arr1[i] = 1 + i * 3) + " ");

        }

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        System.out.println("\n\n====№3=====\n");



        int [] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }


        System.out.println();
        for (int i = 0; i < arr2.length; i++){
            System.out.print((arr2[i] < 6 ? arr2[i] = arr2[i] * 2 : arr2[i]) + " ");
        }

//        4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("\n\n====№4=====\n");

        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arr3[i] = Math.abs(random.nextInt() % 99 + 1);
            System.out.print(arr3[i] + " ");
        }


        System.out.println("\nминимум:" + minOfArr(arr3) + " максимум:" + maxOfArr(arr3));

//        5. * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);

        System.out.println("\n\n====№5=====\n");

        int[][] sqrArr = new int[5][5];

        for (int i = 0; i < 5; i ++){
            sqrArr[i][i] = 1;
            sqrArr[4-i][i] = 1;
        }

        for (int i = 0; i<5; i++)
        {
            for (int j = 0; j < 5; j++) {
                System.out.print(sqrArr[i][j] + " ");
            }
            System.out.println();
        }

//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место,
//        в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
//        checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.

        System.out.println("\n\n====№6=====\n");

        int[] arr4 = {10, 1, 2, 3, 4};

        System.out.println(balance(arr4));




//        7 *** Написать метод, которому на вход подаётся одномерный массив
//        и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
//        8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
        System.out.println("\n\n====№7-8=====\n");


        int[] arr5 = {1,2,3,4,5,6,7,8,10};

        for (int i = 0; i < arr5.length; i++)
            System.out.print(arr5[i] + " ");

        System.out.println();

        moveArray(arr5, -3);

        for (int i = 0; i < arr5.length; i++)
            System.out.print(arr5[i] + " ");




    }

    public static int maxOfArr(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i ++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int minOfArr(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i ++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static boolean balance(int[] array) {
        for(int i = 1; i < array.length -1; i ++){
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j< i; j++)leftSum += array[j];
            for (int k = i; k<array.length; k++)rightSum+=array[k];

            if (leftSum == rightSum) return  true;
        }

        return false;
    }

    public static void moveArray(int[] array, int step) {
        if (step > 0){
            for (int i = 0; i < step; i++)
            {
                int symbol = array[0];
                for (int j = 0; j < array.length; j++)
                {
                    int temp = array[(j+1) % array.length];
                    array[(j+1) % array.length]=symbol;
                    symbol = temp;
                }
            }
        }
        else if (step < 0){
            for (int i = 0; i > step; i-- )
            {
                int symbol = array[0];
                for (int j = array.length; j > 0; j--)
                {
                    int temp = array[(j-1) % array.length];
                    array[(j-1) % array.length]=symbol;
                    symbol = temp;
                }
            }

        }
    }



}