import java.util.Arrays;

public class decrescente {
    void main() {
        int[] numeros = {1, 2, 7, 9, 4, 6};

        Arrays.sort(numeros);

        for (int i = numeros.length -1; i>=0; i--) {
            IO.println(numeros[i]);
        }
    }
}