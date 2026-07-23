public class Parking {
    

    // Ceci est la fonction principal d'un programme Java
    // Arg représente les paramètres donné lors de l'éxécution du programe
    public static void main(String[] args) {

        salut(args[0]);
      
    }

    // Cette fonction permet d'acceuillir et présenter les servieces aux utilisateurs du parking 
    // arg représente le nom de l'utilisateur du parking 

        private static void salut(String arg) {
            
        String message_de_bienvenue = "Salut " + arg + " Bienvenue au Parking";
        String services = "Nous offrons les services suivant : gardinage , laverie , ... ";
        String Attention = "Dépêchez vous de rentrez car il n'y aura bientôt plus de places !";
        System.out.println(message_de_bienvenue); // Pour passer la valeur args[0] il faut faire Parking + nom (au moment de l'éxécution)
        System.out.println(services);
        System.out.println(Attention.toUpperCase()); // la fonction toUpperCase() sert à mettre du texte en majuscule
}

}
