import java.util.ArrayList;

public abstract class RedeSocial {
   // ArrayList<Usuario> user = new ArrayList<>();

    protected String senha;
    protected int numAmigos;


   public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public void postarFoto(){

    }//sendo implementado nas subclasses
    public void postarVideo(){

    }//sendo implementado nas subclasses
    public void postarComentario(){

    }//sendo implementado nas subclasses
    public void curtirPublicacao(){

    }//sendo implementado nas subclasses


}
