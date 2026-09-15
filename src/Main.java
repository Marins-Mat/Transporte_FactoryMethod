public class Main {
    public static void main(String[] args) {

        Transporte transporte1 = TransporteFactory.transporte("Terrestre");
        transporte1.entregar();

        Transporte transporte2 = TransporteFactory.transporte("Maritima");
        transporte2.entregar();
    }
}