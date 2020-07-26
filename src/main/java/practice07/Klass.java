package practice07;

public class Klass {
    public String number;

    public Klass(int number) {
        this.number = String.valueOf(number);
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }
}
