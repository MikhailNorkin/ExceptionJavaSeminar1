//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
package Tasks;
public class Task1 {
    public static void main(String[] args) {
        isZero();
        toMuchLong();
        StringToInt("");
    }

    public static int isZero() {
        int a = 1;
        int b = 0;
        return a/b;
    }

    public static int toMuchLong() {
        int[] array = {1,2,3,4,5};
        return array[10];
    }

    public static int StringToInt(String input) {
        return Integer.parseInt(input);
    }

}    