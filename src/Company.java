import java.util.Calendar;

public class Company {

    public void get(String name, int Id){
        System.out.println("Name = " + name);
        System.out.println("ID = " + Id);

    }

    public void get(int Id, String name){
        System.out.println("ID = " + Id);
        System.out.println("Name = " + name);

    }

}

class Overlading extends Company {

    public static void main(String[] args) {

    Company c = new Company();
    c.get("BMW" , 10);
    c.get("AUDI" ,20);
    }
}
