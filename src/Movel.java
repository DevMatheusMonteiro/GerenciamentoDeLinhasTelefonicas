public final class Movel extends LinhaTelefonica {
    private boolean planoDeDadosHabilitado;

    public Movel() {}

    public Movel(boolean planoDeDadosHabilitado) {
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    public Movel(boolean planoDeDadosHabilitado, int qtdMinutosGastos, String numero, Cliente cliente) {
        super(qtdMinutosGastos, numero, cliente);
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    public float calcular() {
        if (planoDeDadosHabilitado){
            return (getQtdMinutosGastos() * 0.20f) + 40.00f;
        }

        return (getQtdMinutosGastos() * 0.20f);
    }

    public boolean isPlanoDeDadosHabilitado() {
        return planoDeDadosHabilitado;
    }

    public void setPlanoDeDadosHabilitado(boolean planoDeDadosHabilitado) {
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    public String toString(){
        return String.format("%s\nTipo de linha: Móvel\nPlano de dados habilitado: %s\nValor do Boleto: R$ %s",
                super.toString(),
                (isPlanoDeDadosHabilitado() ? "Sim" : "Não"),
                String.format("%.2f", calcular()).replace('.', ','));
    }
}