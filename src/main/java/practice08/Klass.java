package practice08;

public class Klass {
    private String number;
    private Student leader;

    public Klass(int number) {
        this.number = String.valueOf(number);
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }
}
