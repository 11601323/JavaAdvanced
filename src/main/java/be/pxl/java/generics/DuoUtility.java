package be.pxl.java.generics;

public interface DuoUtility {
    public static void printUpper(Duo<String>d){ //Geen generieke interface maar een generieke methode van het type string
        System.out.println(d.getFirst().toUpperCase() + "," + d.getSecond().toUpperCase());
    }
    public static void printSum(Duo<? extends Number> d){ // geen generieke interface maar een generieke methode waar van het datatype ongekend is maar het is zwso een subtype van Number
        Number n1 = d.getFirst();
        Number n2 = d.getSecond();
        System.out.println(n1 + " + " + n2 + " = " + (n1.doubleValue()+n2.doubleValue()));
    }
    public static void superMethod(Duo<? super Number> d) { // geen generieke interface maar een generieke methode waar van het datatype ongekend is maar het is Number of een hogere superklasse
        System.out.println("hallo");
    }

    public static void printDuo(Duo<?> d) {

        System.out.println(d.getFirst().toString() + " " + d.getSecond().toString());
    }

    public static <T> void swapFirst(Duo<T> d1, Duo<T> d2){
        T temp = d1.getFirst();
        d1.setFirst(d2.getFirst());
        d2.setFirst(temp);
    }
}

