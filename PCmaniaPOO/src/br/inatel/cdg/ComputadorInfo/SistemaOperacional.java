package br.inatel.cdg.ComputadorInfo;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {//Ele constroi o objeto
        this.nome = nome;
        this.tipo = tipo;
    }

    //Se eu coloco generate ele faz tudo por mim :)
    //Agora to preferindo intelijei do que VScode kkkk
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
