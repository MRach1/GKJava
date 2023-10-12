import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 0, 3, 4, 3, -2, 2, 1, 0};
        System.out.println(countEvens(array));
        System.out.println(difference(array));
        System.out.println(two0(array));
    }

    static int countEvens(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static int difference(int[] arr){
        Arrays.sort(arr);
        return (arr[arr.length - 1] - arr[0]);
    }

    static boolean two0(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] == 0 & arr[i] == 0) {
                return true;
            }
        }
        return false;
    }
}