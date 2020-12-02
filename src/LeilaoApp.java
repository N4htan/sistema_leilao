import model.Cliente;
import model.LeilaoModel;
import operacao.Leilao;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class LeilaoApp {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList <Leilao>leiloes = new ArrayList<Leilao>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LeilaoModel model = new LeilaoModel();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int resposta;

        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe uma Operaçao:"
                    + "\n\n1 - Cadastro de Cliente"
                    + "\n2 - Cadastro de Instituiçao"
                    + "\n3 - Cadastro de Imovel"
                    + "\n4 - Cadastro de Veiculo"
                    + "\n5 - Cadastro de Leilao"
                    + "\n6 - Imprimir Clientes"
                    + "\n7 - Remover Clientes"
                    + "\n8 - Imprimir Imoveis"
                    + "\n9 - Remover Imoveis"
                    + "\n10 - Imprimir Veiculos"
                    + "\n11 - Remover Veiculos"
                    + "\n12 - Imprimir Instituiçao"
                    + "\n13 - Remover Instituiçao"
                    + "\n14 - Imprimir Leilao"
                    + "\n15 - Remover Leilao"
                    + "\n16 - Dar Lance"
                    + "\n17 - Imprimir Lances por Cliente"
                    + "\n18 - Atualizar dados do Cliente"
                    + "\n19 - Atualizar dados da Instituiçao"
                    + "\n20 - Atualizar dados de Imovel"
                    + "\n21 - Atualizar dados de Veiculo"
                    + "\n\n22 - Sair"));

            switch(resposta){
                case 1 :
                    model.inserirCliente();
                    break;
                case 2 :
                    model.inserirInstituicao();
                    break;
                case 3 :
                    model.inserirImovel();
                    break;
                case 4 :
                    model.inserirVeiculo();
                    break;
                case 5 :
                    model.inserirLeilao();
                    break;
                case 6 :
                    model.imprimirCliente();
                    break;
                case 7 :
                    model.removerCliente();
                    break;
                case 8 :
                    model.imprimirImoveis();
                    break;
                case 9 :
                    model.removerImovel();
                    break;
                case 10 :
                    model.imprimirVeiculos();
                    break;
                case 11 :
                    model.removerVeiculo();
                    break;
                case 12 :
                    model.imprimirInstFin();
                    break;
                case 13 :
                    model.removerInstFin();
                    break;
                case 14 :
                    model.imprimirLeiloes();
                    break;
                case 15 :
                    model.removerLeilao();
                    break;
                case 16 :
                    model.darLances();
                    break;
                case 17 :
                    model.imprimirLances();
                    break;
                case 18:
                    model.alterarCliente();
                    break;
                case 19:
                    model.alterarInstFin();
                    break;
                case 20:
                    model.alterarImovel();
                    break;
                case 21:
                    model.alterarVeiculo();
                    break;

                case 22 :
                    System.out.println("Processo Finalizado");
                    break;

                default:

                    break;
            }}while(resposta != 7);
    }
}