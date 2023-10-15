public class Progamming {

    String language;
    Progamming(){
        this.language = "java";
    }
    Progamming(String language){
        this.language = language;
    }

    public void getName(){
        System.out.println(" Progarmming Language = " + this.language);
    }
    public static void main(String[] args) {

        Progamming p = new Progamming();
        Progamming p1 = new Progamming("Python");
        p.getName();
        p1.getName();


    }
}
