package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return (this.klass.getLeader() == null) ? super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + "."
                : super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
