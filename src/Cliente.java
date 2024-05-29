import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private List<LinhaTelefonica> linhasTelefonicas;

    public Cliente(){
        this.linhasTelefonicas = new ArrayList<>();
    }

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.linhasTelefonicas = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<LinhaTelefonica> getLinhasTelefonicas() {
        return linhasTelefonicas;
    }

    public void adicionarLinhaTelefonica(LinhaTelefonica linhaTelefonica) {
        this.linhasTelefonicas.add(linhaTelefonica);
    }

    public String toString(){
        StringBuilder message = new StringBuilder(String.format("Nome: %s | Endereço: %s\n", nome, endereco));

        if (!linhasTelefonicas.isEmpty()) {
            message.append(linhasTelefonicas.size() > 1 ? "*** Linhas Telefônicas ***\n" : "*** Linha Telefônica ***\n");

            for (int i = 0; i < linhasTelefonicas.size(); i++) {
                if (i == linhasTelefonicas.size() - 1) {
                    message.append(linhasTelefonicas.get(i));
                } else {
                    message.append(linhasTelefonicas.get(i)).append("\n*********\n");
                }
            }
        }

        return message.toString();
    }
}
