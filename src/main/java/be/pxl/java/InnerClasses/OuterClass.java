package be.pxl.java.InnerClasses;

public class OuterClass {
    public Object getInner(){
        int a = 5;
        class Inner{
            public String toString(){
                return "Inner " + a;
            }
        }
        return new Inner();
    }


    public class InnerClass{
        public void aMethod(){

        }
    }
    public void doSomething () {
        InnerClass inner = new InnerClass(); //object maken in de nestende klasse van de geneste klasse
        inner.aMethod();
    }
}
