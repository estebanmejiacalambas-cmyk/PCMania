package br.inatel.cdg.ComputadorInfo;

public class Computador {
    private String marca;
    private float preco;

    // Atributos baseados no diagrama
    private SistemaOperacional sistemaoperacional;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;


    public Computador(String marca, float preco, HardwareBasico[] hardwares, String nomeSO, int tipoSO) {

        this.marca = marca;
        this.preco = preco;
        this.sistemaoperacional = new SistemaOperacional(nomeSO, tipoSO);
        this.hardwares = hardwares;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }


    public void mostraPCConfigurate(){
        System.out.println("Seguem as configuracoes: ");
        System.out.println("Marca do computador: "+ marca);
        System.out.println("Preco do computador:  R$"+preco);//Perguntar pro pizzoni se nn é exagero
        System.out.println("O sistema operacional do computador é: "+
                this.getSistemaoperacional().getNome());
        System.out.println("->Hardware basico do dispositivo: ");
        for(int j = 0; j < hardwares.length; j++){

            String nome = hardwares[j].getNome();
            float capacidade = hardwares[j].getCapacidade();

            if(nome.toLowerCase().contains("core")) {
                System.out.println(nome + " (" + capacidade + " Mhz)");
            }
            else if(nome.toLowerCase().contains("ram")) {
                System.out.println(capacidade + " Gb de " + nome);
            }
            else {
                System.out.println(capacidade + "Gb de " + nome);
            }
        }
        if(memoriaUSB != null){
            System.out.println("Memoria USB: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
        }

    }

    public float getPreco() {
        return preco;
    }


    public SistemaOperacional getSistemaoperacional() {
        return sistemaoperacional;
    }


}

