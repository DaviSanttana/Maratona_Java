package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException ");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException ");
        }


        try {
            talvezLanceExcepton();
        } catch (SQLException |FileNotFoundException e){
                e.printStackTrace();
        }

        }
    private static void talvezLanceExcepton () throws SQLException, FileNotFoundException {
    }
}
