package estudosJavaP1;

public class Wrapper {
    public static void main(String[] args) {
        
        Double preco = new Double("12.45");

        //Converte o valor de 'preco' a outros métodos
        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();

        Boolean casado = new Boolean("false");

        //CONVERSÃO ESTÁTICA  
        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");

        int i2 = Integer.valueOf("101011", 2); //faz a conversão de um valor binário (valor '2' é o tipo de valores binários) 
        System.out.println(i2);

        System.out.println(d);
        System.out.println(i);
        System.out.println(b);
        System.out.println(casado);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(f1);
    }
}
