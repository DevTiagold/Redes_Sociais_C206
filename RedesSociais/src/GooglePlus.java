public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando publicação no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming com GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Curtiu uma publicação no GooglePlus");
    }

    @Override
    public void postarComentario() {
        super.postarComentario();
        System.out.println("Comentou uma publicação no GooglePlus");
    }

    @Override
    public void postarVideo() {
        super.postarVideo();
        System.out.println("Postou um vídeo no GooglePlus");
    }

    @Override
    public void postarFoto() {
        super.postarFoto();
        System.out.println("Postou uma foto no GooglePlus");
    }

}
