public class Main {


    public static void main(String[] args){

        int longeur = 180;
        int larg = 120;
        int surface = longeur * larg ;
        int perimettre = (longeur + larg) * 2;
        int diff = longeur - larg ;
        double rapport = (double) larg / longeur; // Ici on a fait un cast pour transformer le résultat de la variable en type float
        System.out.println("La surface au sol de la voiture est de : "+ surface);
        System.out.println("Le perimettre au sol de la voiture est de : "+ perimettre);
        System.out.println("La différence entre la longueur et la largeur est de : "+ diff);
        System.out.println("Le rapport entre la longueur et la largeur est de : "+ rapport);

    }
}