import java.util.Arrays;

public class Excersice3 {
    public static void exerc3 (){
        int[] revArray = {0,1,2,3,4,5,6,7,8,9};
        String nArrayString = Arrays.toString(revArray);
        System.out.print(nArrayString);

        for(int i=0; i<revArray.length/2;i++) {
            int temp = revArray[i];
            revArray[i]=revArray[revArray.length -i -1];
            revArray[revArray.length -i-1]=temp;
        }
        nArrayString = Arrays.toString(revArray);
        System.out.print(nArrayString);
    }
}

