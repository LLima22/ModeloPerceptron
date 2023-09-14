public class Perceptron {
    private double[] w = new double[3];
    private double NET = 0;
    private final int epocasMax = 30;
    private int count = 0;
    private int[][] matrizAprendizado = new int[4][3];

    public int getCount() {
        return this.count;
    }

    public Perceptron() {
        this.matrizAprendizado[0][0] = 0; // entrada 1
        this.matrizAprendizado[0][1] = 0; // entrada 2
        this.matrizAprendizado[0][2] = 0; // valor esperado

        this.matrizAprendizado[1][0] = 0; // entrada 1
        this.matrizAprendizado[1][1] = 1; // entrada 2
        this.matrizAprendizado[0][0] = 0; // valor esperado

        this.matrizAprendizado[2][0] = 1; // entrada 1
        this.matrizAprendizado[2][1] = 0; // entrada 2
        this.matrizAprendizado[0][0] = 0; // valor esperado

        this.matrizAprendizado[3][0] = 1; // entrada 1
        this.matrizAprendizado[3][1] = 1; // entrada 2
        this.matrizAprendizado[3][2] = 1; // valor esperado

        w[0] = 0;   // Peso sináptico para primeira entrada.
        w[1] = 0;   // Peso sináptico para segunda entrada.
        w[2] = 0;   // Peso sináptico para o BIAS
    }

    public int executar(int x1, int x2) {
        NET = (x1 * w[0]) + (x2 * w[1]) + ((-1) * w[2]);
        if (NET >= 0) {
            return 1;
        }
        return 0;
    }

    public void treinar() {
        boolean treinou = true;
        int saida;

        for (int i = 0; i < matrizAprendizado.length; i++) {
            saida = executar(matrizAprendizado[i][0], matrizAprendizado[i][1]);
            if (saida != matrizAprendizado[i][2]) {
                corrigirPeso(i, saida);
                treinou = false;
            }
        }

        this.count++;

        if ((treinou == false) && (this.count < this.epocasMax)) {
            treinar();
        }
    }

    private void corrigirPeso(int i, int saida) {
        w[0] = w[0] + (1 * (matrizAprendizado[i][2] - saida) * matrizAprendizado[i][0]);
        w[1] = w[1] + (1 * (matrizAprendizado[i][2] - saida) * matrizAprendizado[i][1]);
        w[2] = w[2] + (1 * (matrizAprendizado[i][2] - saida) * (-1));
    }
}
