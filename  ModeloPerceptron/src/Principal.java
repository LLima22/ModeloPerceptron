public class Principal {
    public static void main(String[] args) {
        // Instanciando o perceptron
        Perceptron perceptron = new Perceptron();

        // Testando o perceptron com alguns exemplos
        int resultado1 = perceptron.executar(0, 0);
        int resultado2 = perceptron.executar(0, 1);
        int resultado3 = perceptron.executar(1, 0);
        int resultado4 = perceptron.executar(1, 1);

        // Exibindo os resultados
        System.out.println("Resultado para (0, 0): " + resultado1);
        System.out.println("Resultado para (0, 1): " + resultado2);
        System.out.println("Resultado para (1, 0): " + resultado3);
        System.out.println("Resultado para (1, 1): " + resultado4);
        // Treinando o perceptron
        perceptron.treinar();

        // Obtendo o número de épocas necessárias para o treinamento
        int epocas = perceptron.getCount();
        System.out.println("Número de épocas necessárias para treinar: " + epocas);

                // Testando o perceptron com alguns exemplos
        int resultado11 = perceptron.executar(0, 0);
        int resultado22 = perceptron.executar(0, 1);
        int resultado33 = perceptron.executar(1, 0);
        int resultado44 = perceptron.executar(1, 1);

        // Exibindo os resultados
        System.out.println("Resultado para (0, 0): " + resultado11);
        System.out.println("Resultado para (0, 1): " + resultado22);
        System.out.println("Resultado para (1, 0): " + resultado33);
        System.out.println("Resultado para (1, 1): " + resultado44);
    }
}