package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calculaBonus();
    }
}
