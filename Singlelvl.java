class Teacher{
    void teach(){
        System.out.println("teacher teaches us");
    }    
}
class Trainer extends Teacher{
    void train(){
        System.out.println("trainer will train us");
    }
}

public class Singlelvl {
    public static void main(String[] args){
        Trainer obj=new Trainer();
        obj.train();
        obj.teach();

    }
    
}
