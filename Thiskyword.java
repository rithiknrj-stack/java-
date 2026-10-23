public class Thiskyword {
    String Coffe_Name;
    String Size;
    int Quantity;

     Thiskyword(String Coffe_Name){
     System.out.println("Coffename :"+ Coffe_Name + " : is being prepared");
     }
     Thiskyword(String Coffe_Name,String Size){
        this(Coffe_Name);
        System.out.println("Coffe is Ready");}
    
    Thiskyword(String Coffe_Name,int Quantity,String Size){
        this.Coffe_Name=Coffe_Name;
        this.Quantity=Quantity;
        this.Size=Size;
        System.out.println("Coffe is Served with "+ Size +" Quantity :" + Quantity);
    }
    public static void main(String[] args) {
        Thiskyword Coffee=new Thiskyword("Americal Latte","Regular");
    }
}
