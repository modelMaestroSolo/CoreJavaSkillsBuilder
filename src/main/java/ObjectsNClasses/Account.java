package ObjectsNClasses;

public class Account {
    private double value;

    public Account(double value){
        this.value = value;
    }

    public Account(){
        this(0);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
