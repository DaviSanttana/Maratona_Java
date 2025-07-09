package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade  = 20 ;
        boolean isAutoizadoComprarBebida = idade >= 18;
        // !
        if (isAutoizadoComprarBebida){
            System.out.println("Autorizado Comprar Bebida alcoolica");
        }else {
            System.out.println(" Não Autorizado Comprar Bebida alcoolica");
        }

        if (!isAutoizadoComprarBebida){
            System.out.println(" Não Autorizado Comprar Bebida alcoolica");
        }
        System.out.println("Fora do If");
    }
}
