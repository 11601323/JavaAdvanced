package be.pxl.java.InnerClasses;


public class Musician {
    private Instrument instrument;
    public class Instrument{

        public void makeSound() {
            System.out.println("Geluid van instrument prrrraaaa");
        }
    }
    public void play(){
        instrument = new Instrument();
        instrument.makeSound();
    }
    public void playAnononiemeKlasseMethode(){

    }
}
