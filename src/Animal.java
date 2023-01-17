public class Animal {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public Animal() {

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

    public Animal(String name, int age) {
        this.name = name;
        this.age=age;


    }
    public String toString(){
        return  "Animal:"+"name:  " + getName()+","+","+"age:"+ getAge();

    }
}
