import java.security.SecureRandom; // permet d'utiliser la fonction secureRandom

public class Boucle {

    static String[] client = {" John ", "Alexandre ", " Stecy " , " claude "}; // Déclaration d'une liste de client

    static int bouclesize = new SecureRandom().nextInt(3);

    public static void main(String[] args){

        for( int i = 0 ; i < client.length ; i ++){
            Salut(client[i]);
        }

    }

    // Ici client c'est le nom de la personne à qui on doit dire salut
    private static void Salut ( String client){

        String phrase_pour_saluer = " Salut " + client ;

        System.out.println(phrase_pour_saluer);
        
    }
}