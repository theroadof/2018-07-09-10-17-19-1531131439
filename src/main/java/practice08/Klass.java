package practice08;

public class Klass {
    private String number;
    private Student leader;

    public Klass(int number) {
        this.number = String.valueOf(number);
    }

    public String getDisplayName(){
        return "Class 2";
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student leader){
        this.leader = leader;
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
