package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[6];
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
            double[][] alunosDouble = new double[3][];

            alunosDouble[0] = new double[]{7.5, 8.0};
            alunosDouble[1] = new double[]{6.0, 7.0, 5.5, 9.0};
            alunosDouble[2] = new double[]{8.5, 7.5, 6.0};

            for (int aluno = 0; aluno < alunosDouble.length; aluno++) {
                for (int prova = 0; prova < alunosDouble[aluno].length; prova++) {
                    System.out.println("Aluno " + (aluno + 1) + " - Prova " + (prova + 1) + ": " + alunosDouble[aluno][prova]);
                }
            }
        }
    }
}