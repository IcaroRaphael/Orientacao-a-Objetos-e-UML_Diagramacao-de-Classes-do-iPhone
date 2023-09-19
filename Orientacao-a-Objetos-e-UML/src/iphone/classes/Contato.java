package iphone.classes;

import java.util.List;

public class Contato {
    private String nome;
    private List<Integer> numeros;

    public Contato(String nome, List<Integer> numeros) {
        this.nome = nome;
        this.numeros = numeros;
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeros=" + numeros +
                '}';
    }
}
