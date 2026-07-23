public class salutation {

    static String completer = "des équipes du parking";
    static service service = new service();

    public static void main(String[] args) {
        salut();
        aurevoir();

    }

    private static void salut(){
        String Bienvenue = "Salut , recevez la bienvenue " + completer;
        System.out.println(Bienvenue);
        String parkservice = service.Parking;
        String laverieservice = service.Laverie;

        System.out.println("Nous proposons les services suivant :" + parkservice + "et " + laverieservice);

    }

    private static void aurevoir() {
        String ciao = "Recevez les Aurevoir " + completer ;
        System.out.println(ciao);
    }
}
