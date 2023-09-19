package iphone.classes;

public class CorreioVoz {
    private Integer numero;
    private String mensagem;

    public CorreioVoz(Integer numero, String mensagem) {
        this.numero = numero;
        this.mensagem = mensagem;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "CorreioVoz{" +
                "numero=" + numero +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
