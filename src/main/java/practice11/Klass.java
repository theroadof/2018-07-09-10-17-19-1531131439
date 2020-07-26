package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private String number;
    private Student leader;
    private List<joinListener> joinListeners = new ArrayList<>();

    public Klass(int number, List<joinListener> joinListeners) {
        this.number = String.valueOf(number);
        this.joinListeners = joinListeners;
    }

    public Klass(int number) {
        this.number = String.valueOf(number);
    }

    public List<joinListener> getJoinListeners() {
        return joinListeners;
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
            joinListeners.forEach(joinListener -> {
                joinListener.update(leader);
            });
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        joinListeners.forEach(joinListener -> {
            joinListener.update(student);
        });
    }

    public boolean isIn(Student student) {
        return student.getKlass() == this;
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }
}
