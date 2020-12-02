package model;

import imoveis.Imovel;
import operacao.Lance;
import operacao.Leilao;
import veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeilaoModel {

    //INSTANCIANFO VARIÁVEIS DO TIPO SCANNER PARA LER AS ENTRADAS DO USUÁRIO E ARMAZENAR NAS VARIÁVEIS DEFINIDAS ABAIXO
    private Scanner le;




    // DEFININDO VARIÁVEIS UTILIZADAS NOS MÉTODOS
    private String nome, senha, cpf, cnpj, registro, endereco, descricao,  marca, modelo, tipo,
            email;
    //private Date data;
    private Integer numLeilao, qtde, id, ano;




	/* Instanciando enuns
	TipoVeiculo tipoVeic;
	TipoImovel tipoImovel;*/




    //INSTANCIANDO AS CLASSES (LISTAS)
    private static List<Cliente> clientes;
    private static List<Imovel> imoveis;
    private static List<Veiculo> veiculos;
    private static List<Instituicao> instFinanceiras;
    static List<Leilao> leiloes;
    static List<Lance> lances;






    //CRIANDO ARRAYLISTS DAS LISTAS INSTANCIADAS
    public LeilaoModel() {
        clientes = new ArrayList<>();
        imoveis = new ArrayList<>();
        instFinanceiras = new ArrayList<>();
        leiloes = new ArrayList<>();
        veiculos = new ArrayList<>();
        lances = new ArrayList<>();
        //produtos = new ArrayList<>();

        le = new Scanner(System.in);


    }




    //FUNÇÕES DE INSERÇÃO


    public void darLances() {
        System.out.println("Insira seu CPF: ");
        cpf = le.next();

        for (Cliente cliente : clientes) {
            if (!cpf.equals(cliente.getCpf())) {
                System.out.println("model.Cliente não encontrado!");
                break;
            }
            // cliente = le.next();
            System.out.println("Insira o número do Leilão: ");
            numLeilao = le.nextInt();

            for (Leilao leilao : leiloes) {
                if (numLeilao.equals(leilao.getNumeroLeilao())) {
                    System.out.println("Insira o valor: ");
                    Float valor = le.nextFloat();

                    lances.add(new Lance(valor, cliente, leilao));
                }else{
                    System.out.println("Leilão não encontrado!");
                    break;
                }

            }


        }


    }


    public void inserirCliente() {

        System.out.println("Nome: ");
        nome = le.nextLine();
        System.out.println("E-mail: ");
        email = le.nextLine();
        System.out.println("Senha: ");
        nome = le.nextLine();
        System.out.println("CPF: ");
        cpf = le.nextLine();

        clientes.add(new Cliente(nome, email, senha, cpf));

        System.out.println("Cadastrado!!!");
    }

    public void inserirImovel() {
        System.out.println("Id: ");
        id = le.nextInt();
        System.out.println("Registro: ");
        registro = le.next();
        System.out.println("Endereço: ");
        endereco = le.next();
        System.out.println("Digite um tipo do Imóvel:");
        System.out.println("\nApartamento, Terreno, Casa, Edifício Comercial");
        tipo = le.next();
        if(tipo.equals("Apartamento")||tipo.equals("Terreno")||tipo.equals("Casa")||tipo.equals("Edifício Comercial")||tipo.equals("Edificio Comercial")
                ||tipo.equals("apartamento")||tipo.equals("terreno")||tipo.equals("casa")||tipo.equals("edifício comercial")||tipo.equals("edificio comercial")) {
            System.out.println("Descrição: ");
            descricao = le.nextLine();
        }else {
            System.out.println("Tipo de imóvel não encontrado");
        }
        imoveis.add(new Imovel(id, registro, endereco, descricao));
        System.out.println("Cadastrado!");
    }

    public void inserirVeiculo() {


        System.out.println("Digite uma das opções referente ao tipo do Veículo:");
        System.out.println("\nCarro, Motocicleta, Bicicleta, Patinete, Skate");
        tipo = le.next();
        System.out.println("Id: ");
        id = le.nextInt();


        if(tipo.equals("Carro")||tipo.equals("Motocicleta")||tipo.equals("Bicicleta")||tipo.equals("Patinete")||tipo.equals("Skate")
                ||tipo.equals("carro")||tipo.equals("motocicleta")||tipo.equals("bicicleta")||tipo.equals("patinete")||tipo.equals("skate") ) {
            System.out.println("Ano: ");
            ano = le.nextInt();
            System.out.println("Marca: ");
            marca = le.next();
            System.out.println("Modelo: ");
            modelo = le.next();


            System.out.println("Descrição: ");
            descricao = le.nextLine();
            descricao = le.nextLine();

        }else {
            System.out.println("Tipo de Veículo não encontrado");

        }

        veiculos.add(new Veiculo( id, tipo, marca, ano, modelo, descricao));

    }



    public void inserirInstituicao() {
        System.out.println("CNPJ: ");
        cnpj = le.nextLine();
        System.out.println("Nome: ");
        nome = le.nextLine();
        System.out.println("Endereco: ");
        endereco = le.nextLine();

        instFinanceiras.add(new Instituicao(cnpj, nome, endereco));
        System.out.println("Item Cadastrado");
    }



    public void inserirLeilao() {
        System.out.println("Numero do Leilao: ");
        numLeilao = le.nextInt();
        System.out.println("CPNJ da Instituição Financeira: ");
        cnpj = le.next();

        for (Instituicao instituicaoFinanceira : instFinanceiras) {
            if (!cnpj.equals(instituicaoFinanceira.getCnpj())) {
                System.out.println("Instituição Financeira não encontrada!");

            }

        }

        leiloes.add(new Leilao(numLeilao, cnpj, endereco));

    }

    //FUNÇÕES DE ALTERAÇÃO


    public void alterarCliente() {
        System.out.println("CPF do Cliente: ");
        cpf = le.nextLine();

        for (Cliente cliente : clientes) {
            if(cpf.equals(cliente.getCpf())) {
                System.out.println("Insira o nome: ");
                nome = le.nextLine();
                cliente.setNome(nome);
                System.out.println("Insira a senha: ");
                senha = le.nextLine();
                cliente.setSenha(senha);
                System.out.println("Insira o e-mail:");
                email=le.nextLine();
                cliente.setEmail(email);
                System.out.println("CPF:");
                cpf = le.nextLine();
                cliente.setCpf(cpf);

                System.out.println("Dados atualizados com sucesso!");
            }else {
                System.out.println("model.Cliente não encontrado");
            }
        }
    }


    public void alterarInstFin() {
        System.out.println("Insira o CNPJ da instituição: ");
        cnpj = le.nextLine();

        for(Instituicao instFin: instFinanceiras ) {
            if(cnpj.equals(instFin.getCnpj())) {
                System.out.println("Insira o nome: ");
                nome = le.nextLine();
                instFin.setNome(nome);
                System.out.println("Insira endereço: ");
                endereco = le.nextLine();
                instFin.setEndereco(endereco);

                System.out.println("Dados atualizados com sucesso!");
            }else {
                System.out.println("Instituição Financeira não encontrado");
            }
        }
    }


    public void alterarImovel() {
        System.out.println("Insira o registro do Imóvel: ");
        registro = le.nextLine();

        for(Imovel imovel: imoveis) {
            if(registro.equals(imovel.getRegistro())) {
                System.out.println("Insira o endereço: ");
                endereco = le.nextLine();
                imovel.setEndereco(endereco);
                descricao = le.nextLine();
                imovel.setDescricao(descricao);
            }else {
                System.out.println("Imóvel não encontrado");
            }
        }
    }


    public void alterarVeiculo() {
        System.out.println("Insira o id do Veículo: ");
        id = le.nextInt();

        for(Veiculo veiculo: veiculos) {
            if(id.equals(veiculo.getId())) {

                System.out.println("Insira a marca: ");
                marca = le.next();
                veiculo.setMarca(marca);

                System.out.println("Insira o modelo: ");
                modelo = le.nextLine();
                veiculo.setModelo(modelo);
                System.out.println("Insira a descricao: ");
                descricao = le.nextLine();
                veiculo.setDescricao(descricao);
                System.out.println("Insira o ano: ");
                ano = le.nextInt();
                veiculo.setAno(ano);
            }else {
                System.out.println("Veículo não encontrado");
            }
        }
    }



    //FUNÇÕES DE IMPRESSÃO

    public void imprimirCliente() {
        for (Cliente Cliente : clientes) {
            System.out.println(
                    " | Nome: " + Cliente.getNome() + "  \t| Certificado Digital: " + Cliente.getCpf());
        }

    }



    public void imprimirImoveis() {
        for (Imovel Imovel : imoveis) {
            System.out.println("Registro: " + Imovel.getRegistro() + " | Endereço: "
                    + Imovel.getEndereco() + "  \t| Descricao: " + Imovel.getDescricao());
        }
    }



    public void imprimirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("ID: " + veiculo.getId() + " | Marca: " + veiculo.getMarca() + "  \t| Ano: "
                    + veiculo.getAno() + "  \t| Modelo: " + veiculo.getModelo());
        }
    }



    public void imprimirInstFin() {
        for (Instituicao instituicaoFinanceira : instFinanceiras) {
            System.out.println("CNPJ: " + instituicaoFinanceira.getCnpj() + " | Nome: "
                    + instituicaoFinanceira.getNome() + "  \t| Endereço: " + instituicaoFinanceira.getEndereco());
        }
    }



    public void imprimirLeiloes() {
        for (Leilao leilao : leiloes) {
            System.out.println("Número do leilão: " + leilao.getNumeroLeilao() + " \t| Instituição Financeira: " + leilao.getInstFin() + "  \t| Data: " + leilao.getData()
                    + "  \t| Endereço: " + leilao.getEndereco());
        }
    }


    public void imprimirLances() {

        System.out.println("Insira o certificado digital: ");
        cpf = le.next();

        for(Cliente cliente: clientes) {
            for (Lance lance : lances) {

                if(cliente.getCpf().equals(cpf) && cliente.getCpf().equals(lance.getCliente().getCpf())) {
                    System.out.println("Valor: " + lance.getValor() + " | model.Cliente: " + lance.getCliente() + " | Leilao: "
                            + lance.getLeilao());
                }
            }
        }
    }

    //FUNÇÕES DE REMOÇÃO
    public void removerCliente() {

        System.out.println("Insira o certificado digital: ");
        String ctd = le.next();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(ctd)) {
                clientes.remove(i);
            }
        }
        System.out.println("Removido!!!");
    }



    public void removerImovel() {

        System.out.println("Insira o Registro: ");
        String registro = le.next();

        for (int i = 0; i < imoveis.size(); i++) {
            if (imoveis.get(i).getRegistro().equals(registro)) {
                imoveis.remove(i);
            }
        }
        System.out.println("Removido!!!");
    }



    public void removerVeiculo() {

        System.out.println("Insira o ID: ");
        int id = le.nextInt();

        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getId().equals(id)) {
                veiculos.remove(i);
            }
        }
        System.out.println("Removido!!!");
    }



    public void removerInstFin() {

        System.out.println("Insira o CNPJ: ");
        cnpj = le.next();

        for (int i = 0; i < instFinanceiras.size(); i++) {
            if (instFinanceiras.get(i).getCnpj().equals(cnpj)) {
                instFinanceiras.remove(i);
            }
        }
        System.out.println("Removido!!!");
    }



    public void removerLeilao() {

        System.out.println("Insira o numero do Leilao: ");
        numLeilao = le.nextInt();

        for (int i = 0; i < leiloes.size(); i++) {
            if (leiloes.get(i).getNumeroLeilao().equals(numLeilao)) {
                leiloes.remove(i);
            }
        }
        System.out.println("Removido!!!");
    }
}
