package veiculo;

public enum EVeiculo {

    CARROS("Carro"),
    MOTOCICLETAS("Motocicleta");

    private final String valor;
    EVeiculo(String valorOpcao){
        valor = valorOpcao;
    }

    public String getValor() {
        return valor;
    }
}
