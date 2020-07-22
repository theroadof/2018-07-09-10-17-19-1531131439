package practice10;

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
        if(leader.getKlass().equals(this)){
            this.leader = leader;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }

    public boolean isIn(Student student){
        return student.getKlass()==this;
    }

    public int getNumber() {
        return Integer.parseInt(this.number);
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
