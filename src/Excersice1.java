import java.util.Arrays;

public class Excersice1 {
    public static void exerc1 (){
        int[] nArray = new int [10];
        for (int i=0; i<nArray.length; i++){
            nArray[i]= (int) Math.round((Math.random() * 100));
            System.out.print(nArray[i]+" ");
        }
        int min = nArray[0];
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]<min){
                min=nArray[i];
            }
        }
        int max = 0;
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]>max){
                max=nArray[i];
            }
        }

        System.out.println("\nМинимальные значение в массиве:");
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==min){
                System.out.println(nArray[i]);
            }
        }
        System.out.println("Максимальные значение в массиве:");
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==max){
                System.out.println(nArray[i]);
            }
        }
        for(int i=0; i<nArray.length;i++){
            if (nArray[i]==min) {
                nArray[i]=0;
            }else if
            (nArray[i]==max) {
                nArray[i]=99;
            }
        }
        String nArrayString = Arrays.toString(nArray);
        System.out.print(nArrayString);
    }
}
