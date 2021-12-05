package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//    System.out.println("Hello World!");
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro = new Livro("Dominando Ide", 300);
        System.out.println(livro);
    }
}
class Livro{
    private String nome;
    private int nPagi;

    public Livro(String nome, int nPagi) {
        this.nome = nome;
        this.nPagi = nPagi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnPagi() {
        return nPagi;
    }

    public void setnPagi(int nPagi) {
        this.nPagi = nPagi;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPagi=" + nPagi +
                '}';
    }
}
