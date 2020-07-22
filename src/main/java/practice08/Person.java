package practice08;

import java.lang.reflect.Field;

public class Person {

    protected int id;

    protected String name;

    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field f:fields){
            f.setAccessible(true);
            try {
                Object object = f.get(obj);
                Object thisObj = f.get((Object) this);
                if(object==thisObj){
                    return true;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return false;
    }
}
