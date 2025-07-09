package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
       //while, do while, for
        int count = 0;
        while (count<100){
        System.out.println(++count);//vai adicionar mais 1 ao número anterior
        count +=5;//vai adicionar  5 em 5
        }
        count = 0;

        do {
            System.out.println("Dentro do do-while "+ ++count);
            count++;
        }while ( count <10 );

        for (int i= 0 ; i<10 ;i+=2 ){// enquanto i for menor que 10 , incremeneta no i +2
            System.out.println("For "+i);
        }

        //imorime a tabuada do 5
        System.out.println("Tabuada do 5 : ");
        for (int tabuada = 0; tabuada < 11; tabuada++) {
            System.out.println("5 x " + tabuada + "=" + (5 * tabuada));
        }


        //imprime números pares ate 50 , depois tira a media

        int soma = 0;
        int quantidadde = 0;

        System.out.println("Números pares de 1 a 50 ");
        for (int par = 2; par <= 50; par += 2) {
            System.out.println(par);
            soma += par;
            quantidadde++;
        }
        double media =  (double) soma /quantidadde;
        System.out.println("Quantidade: " + quantidadde); // Deve ser 25
        System.out.println("Soma dos pares "+soma); // Deve ser 650
        System.out.println("Media dos pares "+media);// Deve ser 26.0
    }
}