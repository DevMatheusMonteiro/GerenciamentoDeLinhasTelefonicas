import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Cliente[] clientes = new Cliente[2];

            for (int i = 0; i < clientes.length; i++) {
                System.out.print("Informe o nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("Informe o endereço do cliente: ");
                String endereco = sc.nextLine();

                clientes[i] = new Cliente(nome, endereco);

                System.out.println("Informe os dados da linha fixa do cliente " + clientes[i].getNome());
                Scanner dadosFixa = new Scanner(System.in);
                System.out.print("Informe o número do telefone: ");
                String numeroFixo = dadosFixa.nextLine();
                System.out.print("Indique quantos minutos foram gastos: ");
                int qtdMinutosGastosFixo = dadosFixa.nextInt();
                Fixa fixa = new Fixa(qtdMinutosGastosFixo, numeroFixo, clientes[i]);
                clientes[i].adicionarLinhaTelefonica(fixa);

                System.out.println("Informe os dados da linha móvel do cliente " + clientes[i].getNome());
                Scanner dadosMovel = new Scanner(System.in);
                System.out.print("Informe o número do celular: ");
                String numeroMovel = dadosMovel.nextLine();
                System.out.print("Informe se o plano de dados está habilitado: ");
                boolean planoDeDadosHabilitado = dadosMovel.nextLine().equalsIgnoreCase("Sim");
                System.out.print("Indique quantos minutos foram gastos: ");
                int qtdMinutosGastosMovel = dadosMovel.nextInt();
                Movel movel = new Movel(planoDeDadosHabilitado,qtdMinutosGastosMovel, numeroMovel, clientes[i]);
                clientes[i].adicionarLinhaTelefonica(movel);
            }
            System.out.println("------------------------");
            for (Cliente cliente : clientes){
                System.out.println(cliente);
                System.out.println("------------------------");
            }

        } catch (Error e){
            System.out.println(e.getMessage());
        }
    }
}