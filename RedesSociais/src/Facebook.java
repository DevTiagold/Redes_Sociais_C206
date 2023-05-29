public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando postagem no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo uma streaming no Facebook");
    }

    @Override
    public void postarVideo() {
        super.postarVideo();
        System.out.println("Postou um vídeo Facebook");
    }

    @Override
    public void postarComentario() {
        super.postarComentario();
        System.out.println("Comentou um post no Facebook");
    }

    @Override
    public void postarFoto() {
        super.postarFoto();
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Curtiu uma publicação no Facabook");
    }

}
