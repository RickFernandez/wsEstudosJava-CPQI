public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        //Tipos e Tamanhos
        int idade = 18;
        double preco = 12.45;
        char sexo = 'M';
        boolean casado = false;

        byte b = 127; //cem
        short s = 32000; //32mil
        int i = 2000000000; // 2 bilhões
        long l = 900000000; // 9 quintilhões
        double d = 1.797; // IEEE 754
        float f = 123F;

        byte bb = 0b01010101; // 1 byte - começar com '0b' para informao ao PC que é um valor binário
        short ss = 0b0101010101010101; // 16 bits - 2 bytes
        int ii = 0b010101010101010101010101; // 32 bits - 4 bytes

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(casado);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ii);
    }
}

/*  
    CAST IMPLÍCITO
    É possível atribuir um valor dentro de outro (por exemplo, atribuir o valor de um 'short' em um 'int')

    CAST EXPLÍCITO
    'i = (int) l' - Atribui um valor maior 'long' em uma variável menor 'int'
 */