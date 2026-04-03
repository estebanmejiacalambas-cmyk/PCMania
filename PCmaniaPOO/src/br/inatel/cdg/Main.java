package br.inatel.cdg;
import br.inatel.cdg.Menu.Menu;

public class Main {
    public static void main(String[] args){
        //Chamar metodos na main
        Menu menu = new Menu();
        menu.apresentacao();
        menu.cadastro();
        menu.compra();

        //Foi com muito esforco e muitas horas quebrando a cabeca mas é satisfatorio ver o resultado final :)
    }

}