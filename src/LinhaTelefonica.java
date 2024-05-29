public abstract class LinhaTelefonica implements Consumo {
    private int qtdMinutosGastos;
    private String numero;
    private Cliente cliente;


    public LinhaTelefonica() {}

    public LinhaTelefonica(int qtdMinutosGastos, String numero, Cliente cliente){
        this.numero = numero;
        setCliente(cliente);
        setQtdMinutosGastos(qtdMinutosGastos);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void setQtdMinutosGastos(int qtdMinutosGastos) {
        if (qtdMinutosGastos < 0) {
            throw new Error(String.format("Erro: quantidade de minutos gastos do número %s está negativa", getNumero()));
        }
        this.qtdMinutosGastos = qtdMinutosGastos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new Error("Erro: cliente não pode ser nulo");
        }

        this.cliente = cliente;
    }

    public String toString(){
        return "Número: " + numero + "\nQuantidade de minutos gastos: " + qtdMinutosGastos;
    }
}
