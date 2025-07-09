package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {

        System.out.println("Números pares de 1 a 50 ");
        for (int par = 1; par <= 10000; par++) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
        }
    }
}