package practice09;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return (klass == null) ? super.introduce() + " I am a Teacher. I teach No Class."
                : super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        return (student.getKlass().getNumber() == this.klass.getNumber())
                ? super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

}
