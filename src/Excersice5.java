import java.util.Arrays;

public class Excersice5 {
    public static void exerc5(){
        int[] arr = new int [10];
        for (int i=0; i<arr.length; i++){
            arr[i]= (int) Math.round((Math.random() * 100));
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        String nArrayString = Arrays.toString(arr);
        System.out.print(nArrayString);
    }
}
