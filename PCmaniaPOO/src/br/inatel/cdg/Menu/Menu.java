package br.inatel.cdg.Menu;
import java.util.Scanner;
import br.inatel.cdg.ComputadorInfo.HardwareBasico;
import br.inatel.cdg.ComputadorInfo.MemoriaUSB;

import br.inatel.cdg.Cliente.Cliente;
import br.inatel.cdg.ComputadorInfo.Computador;

public class Menu {
    Scanner input = new Scanner(System.in);
    Cliente cliente;
    int aux=1;
    Computador[] computadores = new Computador[10];
    int compraCodigo1=0;
    int compraCodigo2=0;
    int compraCodigo3=0;

    int matricula = 9864;

    MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16);
    MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32);
    MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000);

    //COMPUTADOR 1
    HardwareBasico c1_h1 = new HardwareBasico("Pentium Core i3", 2200);
    HardwareBasico c1_h2 = new HardwareBasico("Memória RAM", 8);
    HardwareBasico c1_h3 = new HardwareBasico("HD", 500);

    Computador computador1 = new Computador(
            "Apple",
            matricula,
            new HardwareBasico[]{c1_h1, c1_h2, c1_h3},
            "macOS Sequoia",
            64
    );
    //COMPUTADOR 2
    HardwareBasico c2_h1 = new HardwareBasico("Pentium Core i5", 3370);
    HardwareBasico c2_h2 = new HardwareBasico("Memória RAM", 16);
    HardwareBasico c2_h3 = new HardwareBasico("HD", 1000);

    Computador computador2 = new Computador(
            "Samsung",
            matricula + 1234,
            new HardwareBasico[]{c2_h1, c2_h2, c2_h3},
            "Windows 8",
            64
    );

    //COMPUTADOR 3
    HardwareBasico c3_h1 = new HardwareBasico("Pentium Core i7", 4500);
    HardwareBasico c3_h2 = new HardwareBasico("Memória RAM", 32);
    HardwareBasico c3_h3 = new HardwareBasico("HD", 2000);

    Computador computador3 = new Computador(
            "Dell",
            matricula + 5678,
            new HardwareBasico[]{c3_h1, c3_h2, c3_h3},
            "Windows 10",
            64
    );


    public void apresentacao(){
        computador1.addMemoriaUSB(m1);
        computador2.addMemoriaUSB(m2);
        computador3.addMemoriaUSB(m3);
        System.out.println("Olá, bem vindo a PCMania, onde voce podera adquirir o melhor PC para seu perfil!");
        System.out.println("Temos novas ofertas e promocoes, veja abaixo: ");
        //Coloquei esse * para conseguir me organizar melhor pois é muita informacao uma junto com a outra
        System.out.println("*Codigo 1: Promocao 1");
        computador1.mostraPCConfigurate();
        System.out.println(" ");//Deixei um espaco para deixar mais bonito
        System.out.println("*Codigo 2: Promocao 2");
        computador2.mostraPCConfigurate();
        System.out.println(" ");
        System.out.println("*Codigo 3: Promocao 3");
        computador3.mostraPCConfigurate();
        System.out.println(" ");
        System.out.println("*E quando voce quiser parar de adquirir voce so insire Codigo 0 :)");
    }

    public void cadastro() {
        System.out.println("---------------------------------------------------");
        System.out.println("Mas antes de tudo devemos fazer um cadastro...");

        System.out.println("Ingresse seu nome por favor: ");
        String nomeDigitado = input.nextLine();

        System.out.println("Ingresse seu cpf: ");
        String cpfDigitado = input.nextLine();

        this.cliente = new Cliente(nomeDigitado, cpfDigitado);

        System.out.println("Cadastro realizado com sucesso para: " + cliente.getNome());
    }

    public void compra(){
        while(aux!=0){
            System.out.println("Qual destas promocoes voce deseja adquirir? Lembre que 0 é para parar de adquirir");
            System.out.println("Codigo 1, promo 1 (coloque 1)");
            System.out.println("Codigo 2, promo 2 (coloque 2)");
            System.out.println("Codigo 3, promo 3 (coloque 3)");
            aux= input.nextInt();
            if (aux==1){
                for (int i = 0; i < computadores.length ; i++) {
                    if (computadores[i]==null){
                        cliente.adicionarComputador(computador1);
                        compraCodigo1++;
                        break;
                    }
                }
            }
            if (aux==2){
                for (int i = 0; i < computadores.length ; i++) {
                    if (computadores[i]==null){
                        cliente.adicionarComputador(computador2);
                        compraCodigo2++;
                        break;
                    }

                }
            }
            if (aux==3){
                for (int i = 0; i < computadores.length ; i++) {
                    if (computadores[i]==null){
                        cliente.adicionarComputador(computador3);
                        compraCodigo3++;
                        break;
                    }

                }
            }
        }

        //Ato da compra entao vou mostrar quanto se compro
        System.out.println("MUITO OBRIGADO POR TER COMPRADO EM NOSSA LOJA PCMANIA! Segue o resumo de sua compra:");
        System.out.println("Quantidade de produtos da promocao 1: "+compraCodigo1);
        System.out.println("Quantidade de produtos da promocao 2: "+compraCodigo2);
        System.out.println("Quantidade de produtos da promocao 3: "+compraCodigo3);
        //Fazendo a parte de somar tudo que foi gasto
        System.out.println("Total do gasto da compra: "+ cliente.calculaTotalCompra());

    }
}
