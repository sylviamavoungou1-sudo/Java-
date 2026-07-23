public class salutation {

    static String completer = "des équipes du parking";
    public static void main(String[] args) {
        salut();
        aurevoir();

    }

    private static void salut(){
        String Bienvenue = "Salut , recevez la bienvenue " + completer;
        System.out.println(Bienvenue);

    }

    private static void aurevoir() {
        String ciao = "Recevez les Aurevoir " + completer ;
        System.out.println(ciao);
    }
}
