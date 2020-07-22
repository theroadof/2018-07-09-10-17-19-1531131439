package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person implements joinListener{

    private List<Klass> classes;

    public Teacher(int id,String name, int age, List<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
        this.classes.forEach(klass -> {
            klass.getJoinListeners().add(this);
        });
    }

    public Teacher(int id,String name,int age){
        super(id,name,age);
        this.classes=new LinkedList<>();
    }

    @Override
    public String introduce() {
        if(this.classes.size()==0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        } else {
            String result = super.introduce()+" I am a Teacher. I teach Class";
            for(Klass klass:this.classes){
                result+=" "+klass.getNumber()+",";
            }
            return result.substring(0,result.length()-1)+".";
        }

    }

    public String introduceWith(Student student){
        for(Klass klass:this.classes){
            if(klass.getNumber()==student.getKlass().getNumber()){
                return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
            }
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

    public boolean isTeaching(Student student){
        for(Klass klass:this.classes){
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public void update(Student student) {
        if(student.getKlass().getLeader()!=null){
            System.out.print("I am "+this.getName()+". I know "+student.getName()+" become Leader of "+student.getKlass().getDisplayName()+".\n");
        }else {
            System.out.print("I am "+this.getName()+". I know "+student.getName()+" has joined "+student.getKlass().getDisplayName()+".\n");
        }
    }
}
