public class caderno {
    void main() {
        int[] numeros = {3, 6, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            if (i % 3 == 0) {
                IO.println(numeros[i]);
            }
        }
    }
}

