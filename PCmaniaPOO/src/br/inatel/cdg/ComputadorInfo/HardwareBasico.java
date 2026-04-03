package br.inatel.cdg.ComputadorInfo;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    // O Construtor que "obriga" a passar os dados
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Getters para podermos ler os dados depois na hora de imprimir
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}