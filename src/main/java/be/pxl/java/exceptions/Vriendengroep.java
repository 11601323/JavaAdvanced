package be.pxl.java.exceptions;

public class Vriendengroep {
    private Person[] vrienden;

    public static final int MAX_AANTAL_VRIENDEN = 10;

    public Vriendengroep() {
        vrienden = new Person[MAX_AANTAL_VRIENDEN];
    }

    public void voegVriendToe(Person vriend) throws NaamException, TeVeelVriendenException {
        for(Person p : vrienden) {
            if(p != null && p.equals(vriend)) {
                throw new NaamException(String.format("Deze naam bestaat al (%s)", vriend.getNaam()));
            }
        }

        int vrijePositie = getVrijePositie();
        if(vrijePositie == -1) {
            throw new TeVeelVriendenException("De rij vrienden is al vol.");
        }
        vrienden[vrijePositie] = vriend;
    }

    public int getVrijePositie() {
        for(int i=0;i<vrienden.length;i++) {
            if(vrienden[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void verwijderVriend(String naam) throws GeenVriendException {
        for(int i=0;i<vrienden.length;i++) {
            if(vrienden[i] != null && vrienden[i].getNaam().equals(naam)) {
                vrienden[i] = null;
                return;
            }
        }
        throw new GeenVriendException("Deze persoon is geen vriend en kan niet verwijderd worden.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Person vriend: vrienden) {
            sb.append(vriend);
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
