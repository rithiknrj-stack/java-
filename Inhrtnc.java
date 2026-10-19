class parent{
    void phone(){
        System.out.println("i am the parent/super/base class");
    }
}
public class Inhrtnc extends parent {
    void smartphone(){
        System.out.println("i am the  child/sub/derived class");
        
    }  

public static void main(String[] args){
    Inhrtnc obj=new Inhrtnc();
    obj.smartphone();
    obj.phone();

}
}