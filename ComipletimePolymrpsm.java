public class ComipletimePolymrpsm {
    void userlogin(String mail,String password){
        System.out.println("logged in by  using mail and password");
    }    
    void userlogin(String password,long phone){
        System.out.println("logged in by using phone and password");
    }
    void userlogin(String mail,String password,long phone){
        System.out.println("logged in by using <>phone ,<>mail and <>password ****");
    }
    public static void main(String[] args) {
        ComipletimePolymrpsm mylv=new ComipletimePolymrpsm();
        mylv.userlogin("Rithik@98789","RithiklvSAm",267089799);
    }
}
