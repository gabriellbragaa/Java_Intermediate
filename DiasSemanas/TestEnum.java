public class TestEnum {

    public static void main(String[] args) {
        usandoEnum();

        System.out.println();

      //  usandoConstantes();
    }
   
    public enum DiasSemanas {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;
    }

    public class DiasSemanasConstantes{
        public static final int SEGUNDA = 1;
        public static final int TERCA = 2;
        public static final int QUARTA = 3;
        public static final int QUINTA = 4;
        public static final int SEXTA = 5;
        public static final int SABADO = 6;

    }

   /*  
   
    private static void usandoConstantes(){

        int segunda = DiasSemanasConstantes.SEGUNDA;
        int terca = DiasSemanasConstantes.TERCA;
        int quarta = DiasSemanasConstantes.QUARTA;
        int quinta = DiasSemanasConstantes.QUINTA;

        System.out.println("Teste Unitario utilizando enum no Java");
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);

    }

    */

    private static void usandoEnum() {
        DiasSemanas segunda = DiasSemanas.SEGUNDA;
        DiasSemanas terca = DiasSemanas.TERCA;

        System.out.println("Teste Unitario utilizando enum no Java");
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
    }

    private static void imprimirDiaSemana(DiasSemanas dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
