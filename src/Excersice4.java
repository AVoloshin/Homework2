import java.util.Arrays;

public class Excersice4 {
    public static void exerc4 (){
        int[] numArray = {0,1,2,3,4,5,6,7,8,9};
        String nArrayString = Arrays.toString(numArray);

        for(int i=0; i<numArray.length/2;i++) {
            if(numArray[i]<numArray[i+1]){

            }
            else {
                System.out.println("Цифры числа не образуют строго возрастающую последовательность");
                return;
            }
        }
        System.out.println("Цифры числа образуют строго возрастающую последовательность");
        System.out.print(nArrayString);
    }
}
