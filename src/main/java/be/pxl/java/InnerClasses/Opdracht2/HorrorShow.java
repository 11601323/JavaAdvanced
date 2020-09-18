package be.pxl.java.InnerClasses.Opdracht2;

public class HorrorShow {
    public static void main(String[] args) {
        class vampire implements Monster{

            @Override
            public void menance() {
                System.out.println("I'll drink your blood");
            }
        }

        class Werewolf implements DangerousMonster{

            @Override
            public void destroy() {

            }

            @Override
            public void menance() {
                System.out.println("I'll destroy you");
            }
        }
    }
}
