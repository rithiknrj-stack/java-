public class Chaining{
    Chaining(){
        System.out.println("1 is called");
    }
    Chaining(String message){
        this();
      System.out.println("2 is called "+ message);
    }
    public static void main(String[] args){
        Chaining ch=new Chaining("B***h");
    }
}



