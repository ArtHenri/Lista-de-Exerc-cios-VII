import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array de contadores para cada faixa salarial
        int[] faixas = new int[9];
        
        System.out.print("Digite o número de vendedores: ");
        int numVendedores = scanner.nextInt();
        
        for (int i = 0; i < numVendedores; i++) {
            System.out.print("Digite as vendas brutas do vendedor " + (i + 1) + ": ");
            double vendas = scanner.nextDouble();
            
            // Calcula o salário: $200 fixo + 9% das vendas
            double salario = 200 + 0.09 * vendas;
            
            // Determina a faixa e incrementa o contador correspondente
            if (salario >= 200 && salario < 300) {
                faixas[0]++;
            } else if (salario < 400) {
                faixas[1]++;
            } else if (salario < 500) {
                faixas[2]++;
            } else if (salario < 600) {
                faixas[3]++;
            } else if (salario < 700) {
                faixas[4]++;
            } else if (salario < 800) {
                faixas[5]++;
            } else if (salario < 900) {
                faixas[6]++;
            } else if (salario < 1000) {
                faixas[7]++;
            } else {
                faixas[8]++;
            }
        }
        
        // Mostra o resultado
        System.out.println("\nDistribuição dos salários:");
        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 ou mais: " + faixas[8]);
        
        scanner.close();
    }
}
