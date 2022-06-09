package estudosJavaP1;

public class GarbageCollector {
    public static void main(String[] args) {
        
        //Variável Primitiva
        int x = 7;
        x = 9; //Substitui o valor de 'x'

        //Variavel de Referência
        String y = "XYZ";
        y = "xyz.com";
        y = null; // Limpa os dados (valores anteriores) e atribui um valor nulo (null) a variável

        System.out.println(x);
        System.out.println(y);
    }
}

