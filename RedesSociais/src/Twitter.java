public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando com twitter");
    }

    @Override
    public void postarVideo() {
        super.postarVideo();
        System.out.println("Postou um vídeo no twitter");
    }

    @Override
    public void postarComentario() {
        super.postarComentario();
        System.out.println("Comentou uma publicação do twitter");
    }

    @Override
    public void postarFoto() {
        super.postarFoto();
        System.out.println("Postou uma foto no twitter");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Curtiu uma publicação no twitter");
    }
}
