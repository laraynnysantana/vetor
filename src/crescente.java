import java.util.Arrays;

public class crescente {
    void main(){
        int[] numeros  = {1,2,7,9,4,6};
        Arrays.sort(numeros);

        for ( int i = 0; i < numeros.length; i++){
            IO.println(numeros[i]);
        }
    }
}
