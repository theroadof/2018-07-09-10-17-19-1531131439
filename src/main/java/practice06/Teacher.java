package practice06;

public class Teacher extends Person{

    private int klass;

    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name,int age){
        super(name,age);
        this.klass=-1;
    }

    @Override
    public String introduce() {
        return (klass==-1)?super.introduce()+" I am a Teacher. I teach No Class."
                :super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
