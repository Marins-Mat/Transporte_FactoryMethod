public class TransporteFactory {

    public static Transporte transporte(String tipoRota) {
        if ("Maritima".equalsIgnoreCase(tipoRota)) {
            return new Navio();
        } else if ("Terrestre".equalsIgnoreCase(tipoRota)) {
            return new Caminhao();
        }
        throw new IllegalArgumentException("Rota desconhecida: " + tipoRota);
    }
}
