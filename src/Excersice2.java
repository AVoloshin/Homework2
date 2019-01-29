import java.util.Arrays;

public class Excersice2 {
    public static void exerc2 (){
        float[] fArray = {75.6195f, 78.78593f, 56.129f, 55.521046f, 3.513097f, 56.129f, 31.598627f, 56.129f, 0.61181366f, 75.6195f};
        float[] compare = new float [10];
        /**for (int i=0; i<fArray.length; i++){
            fArray[i]= (float) (Math.random() * 100);
            System.out.print(fArray[i]+" ");
        }**/

        for(int j=0; j<fArray.length;j++){
            int num=0,k=0;
            for (float n:compare) {
                if(fArray[j]==n){
                    break;
                }
            }
            for(int i=0; i<fArray.length;i++){
                if (fArray[i]==fArray[j]){
                    num++;
                }
                if(num>0){
                    compare[k]=fArray[j];
                    k++;
                }
            }
            System.out.println("["+fArray[j]+"]" +" совпадений " + num );
        }
        int max = 0;

        String nArrayString = Arrays.toString(fArray);
        System.out.print(nArrayString);
    }
}
