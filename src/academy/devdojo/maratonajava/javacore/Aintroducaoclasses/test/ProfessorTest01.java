package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = " Goku";
        professor.idade = 38;
        professor.sexo = 'M';

        System.out.println("Nome:"+professor.nome +" "+"Idade: "+professor.idade +" Sexo: "+professor.sexo);
    }
}
