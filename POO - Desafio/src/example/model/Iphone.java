package example.model;

import example.interfaces.AparelhoTelefonicoInterface;
import example.interfaces.NavegadorInternetInterface;
import example.interfaces.ReprodutorMusicalInterface;

public class Iphone implements ReprodutorMusicalInterface, NavegadorInternetInterface, AparelhoTelefonicoInterface{

    @Override
    public void pausar() {
        System.out.println("Música pausada");
        
    }

    @Override
    public void selectionarMusica(String musica) {
        System.out.println("Mudando para música "+ musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("tocando...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova Aba adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página foi atualizada!");
        
    }

    @Override
    public void exibePagina(String url) {
        System.out.println("Mudando para página "+url);
    }

    @Override
    public void atender() {
        System.out.println("ligação atendida!");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Não estou disponível no momento, tente mais tarde!");
    }

    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para "+numero);
        
    }
    

}
