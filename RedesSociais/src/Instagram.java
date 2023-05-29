public class Instagram extends RedeSocial{

    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        super.postarFoto();
        System.out.println("Postou foto no feed do Insta");
    }

    @Override
    public void postarVideo() {
        super.postarVideo();
        System.out.println("Postou vídeo no reels do Insta");
    }

    @Override
    public void postarComentario() {
        super.postarComentario();
        System.out.println("Comentou uma publicação do insta");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Curtiu uma publicação do Facebook");
    }
}
