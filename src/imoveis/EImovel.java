package imoveis;

public enum EImovel {

    APARTAMENTO("Apartamento"),
    TERRENO("Terreno"),
    CASA("Casa"),
    EDIFICIO_COMERCIAL("Edificio Comercial");

    private final String valor;
    EImovel(String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }
}
