package br.inatel.cdg.ComputadorInfo;

//Ela é uma agregacao, mas oq é agregacao? agregacao é quando algo pode ou nao fazer parte do objeto
public class MemoriaUSB {
    private String nome;
    private float capacidade;

    public MemoriaUSB(String nome, int capacidade) { //Instancia primeiro objeto do bagulho
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {//VAi pegar a informacao que voce quer e vai mostrar
        return nome;
    }

    public void setNome(String nome) { //O setter altera as informar
        this.nome = nome;
    }

    public float getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
