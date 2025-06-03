import java.util.ArrayList;
import java.util.Scanner;

public class InvertigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasSim = 0;

        for (String pergunta : perguntas) {
            System.out.println(pergunta + " (sim/não):");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("sim")) {
                respostasSim++;
            }
        }
        String classificacao;
        if (respostasSim == 2) {
            classificacao = "Suspeita";
        } else if (respostasSim == 3 || respostasSim == 4) {
            classificacao = "Cúmplice";
        } else if (respostasSim == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }
        System.out.println("Classificação do suspeito: " + classificacao);
        scanner.close();
    }
}