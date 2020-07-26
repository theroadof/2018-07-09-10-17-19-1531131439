package practice09;

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
        if (leader.getKlass().equals(this)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }
}
