package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("O grande software com previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = entradaTeclado.nextLine();
        if(pergunta.charAt(0)== ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }

}
