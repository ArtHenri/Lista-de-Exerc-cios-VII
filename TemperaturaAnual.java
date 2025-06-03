import java.util.Scanner;

public class TemperaturaAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", 
            "Novembro", "Dezembro"
        };
        double[] temperaturas = new double[12];
        double somaTemperaturas = 0.0;
        
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        double temperaturaMedia = somaTemperaturas / meses.length;
        System.out.printf("A temperatura média anual é: %.2f°C%n", temperaturaMedia);
        System.out.println("Temperaturas acima da media anual:");

        for (int i = 0; i < meses.length; i++) {
            if (temperaturas[i] > temperaturaMedia) {
                System.out.printf("%s: %.2f°C%n", meses[i], temperaturas[i]);
            }
        }
        
        scanner.close();
    }
}