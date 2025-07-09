package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
   // Condição valorParcela >= 1000
    public static void main(String[] args) {
       /* double valorTotal = 30000;
        for (int parcela =(int)valorTotal; parcela >= 1 ; parcela--) {
        double valorParcela = valorTotal / parcela;
        if (valorParcela < 1000) {
            continue;
        }
        }
        System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
*/
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}