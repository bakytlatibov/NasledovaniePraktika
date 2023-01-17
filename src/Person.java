public class Person {
    private String name;
    private  String mildeti;

    public Person(String name,String mildeti) {
        this.name = name;
        this.mildeti=mildeti;

    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMildeti() {
        return mildeti;
    }

    public void setMildeti(String mildeti) {
        this.mildeti = mildeti;
    }
    public void Do(){



    }
    public String toString(){
        return "name;  "+getName()+",  "+"mildet:  "+getMildeti();


    }
}
