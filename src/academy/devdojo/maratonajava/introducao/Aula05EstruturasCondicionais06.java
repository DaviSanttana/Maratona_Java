package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como Domingo
        byte  diaSemana = 5;
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("É final de semana ");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        char conceito ='A';
        switch (conceito){
            case 'A':
                System.out.println("EXCELENTE ");
                break;
            case 'B':
                System.out.println("BOM ");
                break;
            case 'C':
                System.out.println("REGULAR ");
                break;
            case 'D':
                System.out.println("INSATISFATÓRIO");
                break;
            case 'F':
                System.out.println("REPROVADO ");
                break;
            default:
                System.out.println("Conceito inválido");
        }
        int codigoVeiculo = 2 ;
        switch (codigoVeiculo){
            case 1:
                System.out.println("Carro");
                break;
            case 2:
                System.out.println("Moto");
                break;
            case 3:
                System.out.println("Caminhão");
                break;
            case 4:
                System.out.println("Bicicleta");
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}
