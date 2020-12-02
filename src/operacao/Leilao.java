package operacao;

import java.util.Date;

public class Leilao {

    private Integer numeroLeilao;
    private String instFin;
    private Date data;
    private String endereco;
    private Object tipo;

    public Leilao(Integer numeroLeilao, String instFin,  String endereco) {
        this.numeroLeilao = numeroLeilao;
        //this.tipo = tipo;
        this.instFin = instFin;
        //this.data = data;
        this.endereco = endereco;
    }

    public Integer getNumeroLeilao() {
        return numeroLeilao;
    }
    public void setNumeroLeilao(Integer numeroLeilao) {
        this.numeroLeilao = numeroLeilao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getInstFin() {
        return instFin;
    }
    public void setInstFin(String instFin) {
        this.instFin = instFin;
    }

    public String toString(){
        return "\nNumero do operacao.Leilao:"+ this.numeroLeilao + ", Instituição Financeira: " + this.instFin +", Data: "+ data +", Endereço: "+endereco+", Tipo: "+tipo;
    }

}
