package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado =  numero01 /(double)numero02;
        System.out.println(resultado);

        //%
        int resto = 21 %2 ;//se o resto for 1( impar ), se for 0 ( par )
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDelDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIguaDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDeez "+isDezDiferenteDelDez);

        // && (AND)  || ( or ) !
        float salario = 4700f;
        int idade = 35;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

       double valorTotalContaCorrente = 200;
       double valorTotalContaPoupanca = 10000;
       float valorPlaystationaCinco = 5000;

       boolean isPlastationCincoCompravel = valorTotalContaCorrente >= valorPlaystationaCinco || valorTotalContaPoupanca >= valorPlaystationaCinco;
        System.out.println("isPlayStationCincoCompravel "+isPlastationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800 ;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2 ;
        System.out.println(bonus);

        // ++ --
        int contador = 0 ;
        contador += 1 ; //contador = contador +1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);

    }
}
