class Dancer{
    void Dance(){
        System.out.println("Dancing crazily");
    }
}
class FolkDancer extends Dancer{
    @Override
    void Dance(){
     System.out.println("Dancing Folk dance crazily");
    }

}
public class MethodOverride {
    public static void main(String[] args){
        Dancer hod=new Dancer();
        hod.Dance();
        FolkDancer sam=new FolkDancer();
        sam.Dance();

    }
    
}
