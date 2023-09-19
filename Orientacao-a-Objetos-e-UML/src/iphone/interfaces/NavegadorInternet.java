package iphone.interfaces;

import iphone.classes.Pagina;

public interface NavegadorInternet {
    void exibirPagina(Pagina pagina);
    void adicionarNovaAba(Pagina pagina);
    Pagina atualizarPagina(Pagina paginaAntiga, Pagina paginaNova);
}
