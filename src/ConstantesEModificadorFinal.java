public class ConstantesEModificadorFinal {

    public static void main(String[] args) {
        
        int populacaoBrasileira = 203429773;

        //Modificador 'final' torna a variávle uma constante (seu valor não poderá ser alterado)
        final double Pi = 3.141592;

        System.out.println(populacaoBrasileira);
        System.out.println(Pi);

        populacaoBrasileira = 400000;
        //Pi = 3,15; -- Caso tente executar, o programa dará erro

        System.out.println(populacaoBrasileira);
        System.out.println(Pi);

    }
}