package be.pxl.java.collections.CompareTo;

public class Dier implements Comparable<Dier>{
    private String naam;
    private String soort;

    public Dier(String naam, String soort) {
        this.naam = naam;
        this.soort = soort;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }

    @Override
    public int compareTo(Dier dier) {
         return this.getSoort().compareTo(dier.getSoort());


    }

    @Override
    public String toString() {
        return this.naam + " : " + this.soort;
    }
}
