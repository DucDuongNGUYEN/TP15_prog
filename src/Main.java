public class Main {

    public static void main(String[] args) {
        HorlogeReveil h = new HorlogeReveil();
        AffichageHeure aff = new AffichageClignotant (h);
        h.getReveil().regleReveil(6,0);
        Reveil reveil = new Reveil();
        reveil.regleReveil(10,0);
        h.ajouteObservateur(reveil);
        //System.out.println(horlogeReveil.getHeures());
    }
}
