import java.security.SecureRandom; // permet d'utiliser la fonction secureRandom

public class Boucle {

    static String[] client = {"John", "Alexandre", "Stecy" , "claude" , "olivia"}; // Déclaration d'une liste de client

    static int bouclesize = new SecureRandom().nextInt(4);

    public static void main(String[] args){

        //  for( int i = 0 ; i < client.length ; i ++){
        //      Salut(client[i]);
        //  }

            // for( String client : client){ // on met d'abord le type de ce qu'on veut explorer ensuite on parcourt notre liste
            //      Salut(client);
            // }

        System.out.println( " Nous avons " + bouclesize + " place (s) restante (s) ") ;
        int numeroclient = 0;

        

            

        do{
            Salut(client[numeroclient]);
            numeroclient += 1;
            bouclesize -=1;
        }while(bouclesize> 0);
    
    }
    // Ici client c'est le nom de la personne à qui on doit dire salut
    private static void Salut ( String client){

        String phrase_pour_saluer = " Salut " + client ;

        System.out.println(phrase_pour_saluer);
        
    }
}