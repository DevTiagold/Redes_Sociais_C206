import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Usuario user = new Usuario(null, null);
        //cadastrando conta
        System.out.print("Insira um nome de usuário: ");
        user.setNome(entrada.nextLine());
        //System.out.println(user.getNome());
        System.out.print("Insira um email: ");
        user.setEmail(entrada.nextLine());

        System.out.print("adicionando conta.");
        Thread. sleep(1000);
        System.out.print(".");
        Thread. sleep(1000);
        System.out.println(".");
        Thread. sleep(1000);
        //facebook
        System.out.println("Dados das redes socias: (senha/número de seguidores)");
        Facebook face1 = new Facebook(null, 0);
        System.out.println("--------Facebook--------");
        System.out.print("Senha: ");
        face1.senha = entrada.nextLine();
        System.out.print("Número de seguidores: ");
        face1.numAmigos = entrada.nextInt();
        Thread. sleep(1000);
        //termina facebook

        //google plus
        System.out.println("Dados das redes socias: (senha/número de seguidores)");
        GooglePlus google1 = new GooglePlus(null, 0);
        System.out.println("--------GooglePlus--------");
        System.out.print("Senha: ");
        entrada.nextLine();
        google1.senha = entrada.nextLine();
        System.out.print("Número de seguidores: ");
        google1.numAmigos = entrada.nextInt();
        Thread. sleep(1000);
        //termina google

        //twitter
        System.out.println("Dados das redes socias: (senha/número de seguidores)");
        Twitter twi1 = new Twitter(null, 0);
        System.out.println("--------Twitter--------");
        System.out.print("Senha: ");
        entrada.nextLine();
        twi1.senha = entrada.nextLine();
        System.out.print("Número de seguidores: ");
        twi1.numAmigos = entrada.nextInt();
        Thread. sleep(1000);
        //termina twitter


        //insta
        System.out.println("Dados das redes socias: (senha/número de seguidores)");
        Instagram inst1 = new Instagram(null, 0);
        System.out.println("--------Twitter--------");
        System.out.print("Senha: ");
        entrada.nextLine();
        inst1.senha = entrada.nextLine();
        System.out.print("Número de seguidores: ");
        inst1.numAmigos = entrada.nextInt();
        Thread. sleep(1000);
        //termina insta

        System.out.println("--------------------Confirmação de usuário------------------------");
        System.out.println("Nome do usuario: " + user.getNome());
        System.out.println("Email do usuario: " + user.getEmail());
        Thread. sleep(1000);
        System.out.println("-------------------------------------------------------------------");


        System.out.print("Verificando suas RedesSociais.");
        Thread. sleep(1000);
        System.out.print(".");
        Thread. sleep(1000);
        System.out.println(".");
        Thread. sleep(1000);
        user.Usuario(face1);
        Thread. sleep(1000);
        user.Usuario(google1);
        Thread. sleep(1000);
        user.Usuario(twi1);
        Thread. sleep(1000);
        user.Usuario(inst1);
        Thread. sleep(1000);

        for (int i = 0; i < user.redeSocial.length; i++) {
            if (user.redeSocial[i] != null) {
                if (user.redeSocial[i] instanceof Facebook) {
                    Facebook face = (Facebook) user.redeSocial[i];
                    face.compartilhar();
                    face.postarFoto();
                    face.fazStreaming();
                    System.out.println("--------------------------");
                    Thread. sleep(1000);

                } else if (user.redeSocial[i] instanceof GooglePlus) {
                    GooglePlus google = (GooglePlus) user.redeSocial[i];
                    google.compartilhar();
                    google.fazStreaming();
                    google.curtirPublicacao();
                    System.out.println("---------------");
                    Thread. sleep(1000);
                   // Thread. sleep(5000);

                } else if (user.redeSocial[i] instanceof Twitter) {
                    Twitter twi = (Twitter) user.redeSocial[i];
                    twi.compartilhar();
                    twi.curtirPublicacao();
                    twi.postarComentario();
                    System.out.println("---------------");
                    Thread. sleep(1000);
                } else if (user.redeSocial[i] instanceof Instagram) {
                    Instagram inst = (Instagram) user.redeSocial[i];
                    inst.postarComentario();
                    inst.postarVideo();
                    inst.postarFoto();
                    System.out.println("---------------");
                    Thread. sleep(1000);
                }
            }
        }
    }
}
