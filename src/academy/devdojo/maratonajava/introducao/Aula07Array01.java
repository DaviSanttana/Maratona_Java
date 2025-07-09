package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {
      /*  int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 60;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

*/
        int [] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 8;
        numeros[2] = 10;
        numeros[3] = 9;
        numeros[4] = 4;
        numeros[5] = 4;
        numeros[6] = 7;
        numeros[7] = 6;
        numeros[8] = 8 ;
        numeros[9] = 1 ;
        int quantPares = 0;

        System.out.print("Números do array: ");
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");

            if (numeros[i] % 2 == 0){
                quantPares++;
            }
        }
        System.out.println("Os numeros paares são " + quantPares);
    }
}
