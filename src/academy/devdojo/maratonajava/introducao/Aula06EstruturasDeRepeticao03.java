package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 números de um dado valor, por exemplo,50
    public static void main(String[] args) {
        int valorMax  = 100;
        for (int i = 0; i <= valorMax; i++) {
            if (i >75) {
                break;
            }
            System.out.println(i);
        }
    }
}
