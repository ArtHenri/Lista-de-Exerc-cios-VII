import java.util.ArrayList;
import java.util.Scanner;

public class NotasPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        System.out.println("Digite as notas (ou -1 para encerrar):");
        
        // Leitura das notas
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }
        
        // Mostra a quantidade de valores lidos
        System.out.println("\nQuantidade de valores lidos: " + notas.size());
        
        // Exibe todos os valores na ordem informada
        System.out.print("Valores na ordem informada: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        
        System.out.println("\n\nValores na ordem inversa:");
        // Exibe todos os valores na ordem inversa, um abaixo do outro
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        
        // Calcula a soma
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println("\nSoma dos valores: " + soma);
        
        // Calcula a média
        double media = (notas.size() > 0) ? soma / notas.size() : 0;
        System.out.println("Média dos valores: " + media);
        
        // Conta quantos valores acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        
        // Conta quantos valores abaixo de 7
        int abaixoDeSete = 0;
        for (double nota : notas) {
            if (nota < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de 7: " + abaixoDeSete);
        
        // Mensagem final
        System.out.println("\nPrograma encerrado. Obrigado por usar!");
        
        scanner.close();
    }
}
