package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //taxa de 9.70% se salario < 34,712 por ano
        //taxa de 37,35% se salario > 34.713 && salario < 68,507 por ano
        //taxa de 49,50% se salario < 68,508 por ano
        double salarioAnual = 30000;
        double taxaSalario1 = 9.70 / 100;
        double taxaSalario2 = 37.35 / 100;
        double taxaSalario3 = 49.50 / 100;
        double valorDoImposto;
        if (salarioAnual <= 34712) {
            valorDoImposto = salarioAnual * taxaSalario1;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorDoImposto = salarioAnual * taxaSalario2;
        } else {
            valorDoImposto = salarioAnual *taxaSalario3;
        }
        System.out.println(valorDoImposto);
    }
}
