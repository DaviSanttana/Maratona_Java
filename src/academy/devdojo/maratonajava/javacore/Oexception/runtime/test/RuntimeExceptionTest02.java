package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
         divisao(1,0);
        } catch (RuntimeException e) {
           e.printStackTrace();
        }
        /**
         *
         * @param a
         * @param b nao pode ser zero
         * return
         * @throws IllegalArgumentException CASO B SEJA ZERO
         */
    }
    private static int divisao( int a , int b ) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("nao exite divisao por zero");
        }
        return a/b;
    }
}
