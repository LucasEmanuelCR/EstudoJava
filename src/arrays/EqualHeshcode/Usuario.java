package arrays.EqualHeshcode;

public class Usuario {
    String nome;
    String email;

    Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
            Usuario usuario = (Usuario) obj;

            boolean nomeIgual = this.nome.equals(usuario.nome);
            boolean emailIgual = this.email.equals(usuario.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
