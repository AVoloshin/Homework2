import java.util.Arrays;

public class Excersice2 {
    public static void exerc2 (){
        float[] fArray = {75.6195f, 78.78593f, 56.129f, 55.521046f, 3.513097f, 56.129f, 31.598627f, 56.129f, 0.61181366f, 75.6195f};
        int[] compare = new int [10];
        /**for (int i=0; i<fArray.length; i++){
            fArray[i]= (float) (Math.random() * 100);
            System.out.print(fArray[i]+" ");
        }**/

        for(int i=0; i<fArray.length;i++) {
            int num = 1;
            if (compare[i] != -1) {
                for (int j = i+1; j < fArray.length; j++) {

                    if (fArray[i] == fArray[j]) {
                        num++;
                        compare[j]=-1;
                    }
                }
                if (num>1) {
                    System.out.println("[" + fArray[i] + "]" + " совпадений " + num);
                }
            }


        }

        String nArrayString = Arrays.toString(fArray);
        System.out.print(nArrayString);
    }
}
