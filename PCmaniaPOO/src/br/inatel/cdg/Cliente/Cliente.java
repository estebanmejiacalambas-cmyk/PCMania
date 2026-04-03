package br.inatel.cdg.Cliente;

import br.inatel.cdg.ComputadorInfo.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[10];

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Computador[] getComputadores() {// Criei o computador porque o cliente pode pegar varios computadores
        return computadores;
    }

    public void setComputadores(Computador[] computadores) { //Para ele modificar caso o cliente queira tirar
        this.computadores = computadores;
    }

    public void adicionarComputador(Computador comp) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = comp;
                break;
            }
        }
    }

    public float calculaTotalCompra(){
        float total = 0;

        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] != null){
                total += computadores[i].getPreco();
            }
        }

        return total;
    }

    public String getNome() {
        return nome;
    }
}

