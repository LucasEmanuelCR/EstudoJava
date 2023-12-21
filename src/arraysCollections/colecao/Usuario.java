package arraysCollections.colecao;

import java.util.Objects;

public class Usuario {

    String nome;

    @Override
    public String toString() {
        return this.nome;
    }

    Usuario (String nome){
        this.nome = nome;
    }
    public boolean equals(Object o) {
        Usuario usuario = (Usuario) o;
        return this.nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

}
