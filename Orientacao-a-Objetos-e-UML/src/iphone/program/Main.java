package iphone.program;

import iphone.classes.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>(Arrays.asList(
                new Musica("Musica 1", "Artista 1"),
                new Musica("Musica 2", "Artista 2"),
                new Musica("Musica 3", "Artista 3"),
                new Musica("Musica 4", "Artista 4"),
                new Musica("Musica 5", "Artista 5")));

        List<Contato> contatos = new ArrayList<>(Arrays.asList(
                new Contato("João", Arrays.asList(11111111, 11111112)),
                new Contato("Pedro", Arrays.asList(22222222, 22222223)),
                new Contato("Lucas", Arrays.asList(33333333, 33333334)),
                new Contato("Rafael", Arrays.asList(44444444, 44444445)),
                new Contato("Carlos", Arrays.asList(55555555, 5555556))));

        List<CorreioVoz> correioVoz = new ArrayList<>(Arrays.asList(
                new CorreioVoz(11111111, "Ola"),
                new CorreioVoz(22222222, "Ola, tudo bem?"),
                new CorreioVoz(33333333, "Hey"),
                new CorreioVoz(44444444, "Como vai?"),
                new CorreioVoz(55555555, "Tudo bem?")));

        List<Pagina> navegadorInternet = new ArrayList<>(Arrays.asList(
                new Pagina("google.com", "192.168.0.0"),
                new Pagina("youtube.com", "192.168.0.1"),
                new Pagina("g1.com", "192.168.0.2"),
                new Pagina("r7.com", "192.168.0.3"),
                new Pagina("uol.com", "192.168.0.4")));

        // Instanciando Iphone
        Iphone iphone = new Iphone(musicas, contatos, correioVoz, navegadorInternet);

        // Utilizando os métodos do Reprodutor musical
        System.out.println("REPRODUTOR MUSICAL:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Musica 3");
        System.out.println();

        // Utilizando os métodos do Aparelho telefonico
        System.out.println("APARELHO TELEFÔNICO:");
        iphone.ligar(contatos.get(1));
        iphone.atender();
        System.out.println(iphone.iniciarCorreioVoz());
        System.out.println();

        // Utilizando os métodos do Navegador de internet
        System.out.println("NAVEGADOR DE INTERNET:");
        iphone.adicionarNovaAba(new Pagina("sbt.com", "192.168.0.5"));
        iphone.exibirPagina(navegadorInternet.get(5));
        System.out.println(iphone.atualizarPagina(navegadorInternet.get(1), new Pagina("band.com", "192.168.0.6")));
    }
}
