package be.pxl.java.exceptions.vriendengroepOef;

public class Vriendengroep {
    private Persoon[] vrienden;
    private static int MAXAANTALVRIENDEN = 10;

    public Vriendengroep() {
       vrienden = new Persoon[]{null, null, null, null, null, null, null, null, null, null};
    }

    public void voegVriendToe(Persoon per) throws NaamException, TeVeelVriendenException {
        int vrijePositie = -1;
        boolean naamBestaat = false;
        for(int i = 0; i < vrienden.length; i++){
            if(vrienden[i] == null ){
                if(vrijePositie == -1){
                    vrijePositie = i;
                }
            }
            if(vrienden[i] != null){
                if(vrienden[i].getName().equals(per.getName())){
                    naamBestaat = true;
                }
            }

        }
        if(naamBestaat == true){
            throw new NaamException("Deze naam zit al in de vriendengroep");
        }
        if(vrijePositie == -1){
            throw new TeVeelVriendenException("Er is geen plaats meer in de vriendengroep");
        }
        vrienden[vrijePositie] = per;
    }

    public void verwijderVriend(String name) throws Exception {
        boolean isVriend = false;
        for(int i = 0; i < vrienden.length; i++){
            if(vrienden[i].getName() == name){
                vrienden[i] = null;
                isVriend = true;
            }
        }
        if(isVriend == false){
            throw new Exception("Deze persoon is geen vriend en kan niet verwijderd worden");
        }
    }

    @Override
    public String toString() {
        long eersteVerjaarDag = 366;
        Persoon persoonVerjaardag = new Persoon();
        String output = "";
        for(Persoon per :vrienden){
            if(per != null){
                output += String.format("%s %te %tm %tY\n",per.getName(), per.getGeboorteDatum(), per.getGeboorteDatum(), per.getGeboorteDatum());
                if(per.aantalDagenTotVerjaardag() < eersteVerjaarDag){
                    eersteVerjaarDag = per.aantalDagenTotVerjaardag();
                    persoonVerjaardag = per;
                }
            }

        }
        output += "De volgende jarige is " + persoonVerjaardag.getName();
        return output;
    }
}
