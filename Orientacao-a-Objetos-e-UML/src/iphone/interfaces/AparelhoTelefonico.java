package iphone.interfaces;

import iphone.classes.Contato;

public interface AparelhoTelefonico {
    void ligar(Contato contato);
    void atender();
    String iniciarCorreioVoz();
}
