//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих
//массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

package Tasks;

//java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {2,3,4,5};
        int[] array2 = {1,2,3};
        int[] array = isEqually(array1,array2);
        for (int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + " ");
        }
    }    

    public static  int[] isEqually  (int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы не равны по длине");       
        }

        int[] array = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}
