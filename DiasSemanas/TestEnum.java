public class TestEnum {

    public static void main(String[] args) {
        usandoEnum();
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


    private static void usandoEnum() {
        DiasSemanas segunda = DiasSemanas.SEGUNDA;
        DiasSemanas terca = DiasSemanas.TERCA;

        System.out.println("Teste utilizando enum no Java");
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
