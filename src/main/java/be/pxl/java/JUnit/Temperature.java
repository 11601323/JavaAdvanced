package be.pxl.java.JUnit;

public class Temperature {
    private float value;


    public Temperature(float value) {
        this.value = value;
    }

    public void setValue(float value){

        this.value = value;

    }

    public float getValue(){
        return this.value;
    }

    public boolean isBoiling(){
        if (value > 50){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFreezing(){
        if (value < 0 ){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
