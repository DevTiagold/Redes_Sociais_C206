public class Usuario {

    private String nome;
    private String email;

    RedeSocial[] redeSocial = new RedeSocial[100];

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Usuario(RedeSocial redeSociais){
        for (int i = 0; i < redeSocial.length; i++) {
            if(redeSocial[i] ==null) {
                redeSocial[i] = redeSociais;
                if (redeSocial[i] instanceof Facebook) {
                    System.out.println("O usuario possui Facebook.");
                    break;
                }
                else if (redeSocial[i] instanceof Twitter) {
                    System.out.println("O usuario possui Twitter.");
                    break;
                }
                else if (redeSocial[i] instanceof GooglePlus) {
                    System.out.println("O usuario possui GooglePlus.");
                    break;
                }
                else if (redeSocial[i] instanceof Instagram) {
                    System.out.println("O usuario possui Instagram.");
                    break;
                }
                break;
            }

        }
    }

}