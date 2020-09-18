package be.pxl.java.InnerClasses;

public class InnerOuterApp {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // innerclass object maken // innerklasse kan gebruik maken van alle variabelen van de outer klasse

    }
}
