public class Fixa extends LinhaTelefonica{

    public static final int FRANQUIA = 30;

    public Fixa() {}

    public Fixa(int qtdMinutosGastos, String numero, Cliente cliente) {
        super(qtdMinutosGastos, numero, cliente);
    }

    public float calcular(int minutosExcedentes){
        return minutosExcedentes * 0.05f;
    }

    public float calcular() {
        if (getQtdMinutosGastos() <= FRANQUIA) {
            return 45.00f;
        }

        int minutosExcedentes = getQtdMinutosGastos() - FRANQUIA;

        return  45.00f + (calcular(minutosExcedentes));
    }

    public String toString(){
        return String.format("%s\nTipo de linha: Fixa\nValor do Boleto: R$ %s",
                super.toString(),
                String.format("%.2f", calcular()).replace('.', ','));
    }
}
