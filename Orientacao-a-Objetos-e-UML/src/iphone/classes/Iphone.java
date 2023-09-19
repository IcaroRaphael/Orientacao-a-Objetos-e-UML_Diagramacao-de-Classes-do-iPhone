package iphone.classes;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<Musica> musicas;
    private List<Contato> contatos;
    private List<CorreioVoz> correioVoz;
    private List<Pagina> navegadorInternet;

    public Iphone(List<Musica> musicas, List<Contato> contatos, List<CorreioVoz> correioVoz, List<Pagina> navegadorInternet) {
        this.musicas = musicas;
        this.contatos = contatos;
        this.correioVoz = correioVoz;
        this.navegadorInternet = navegadorInternet;
    }

    @Override
    public void ligar(Contato contato) {
        System.out.println("Ligando para " + contato);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Correio de voz: " + correioVoz;
    }

    @Override
    public void exibirPagina(Pagina pagina) {
        System.out.println(pagina);
    }

    @Override
    public void adicionarNovaAba(Pagina pagina) {
        navegadorInternet.add(pagina);
    }

    @Override
    public Pagina atualizarPagina(Pagina paginaAntiga, Pagina paginaNova) {
        paginaAntiga = paginaNova;
        return paginaAntiga;
    }

    @Override
    public void tocar() {
        int cont = 1;
        for(Musica m : musicas){
            System.out.println(cont + "º musica: " + m);
            cont++;
        }
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String nome) {
        String musica = "Musica não encontrada";
        for(Musica m : musicas){
            if(m.getNome().equals(nome)){
                musica = "Tocando musica: " + m;
            }
        }
        System.out.println(musica);
    }
}
