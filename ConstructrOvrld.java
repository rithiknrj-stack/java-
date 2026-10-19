




public class ConstructrOvrld {
    String name;
    String password;
    String mail;
    long phone;
    ConstructrOvrld(String name,String password){
        this.name=name;
        this.password=password;
        System.out.println("Account created using name and password!!");   
    }
    ConstructrOvrld(String mail,String password,long phone){
        this.mail=mail;
        this.password=password;
        this.phone=phone;
        System.out.println("Account created using name and password,mail,phone!!");
    }
    ConstructrOvrld(int phone,String password){
        this.phone=phone;
        this.password=password;
        System.out.println("Account created using  password and phone");
    }

    public static void main(String[] args){
        ConstructrOvrld obj=new ConstructrOvrld("Rithik","Rithik12" );
        ConstructrOvrld obj2=new ConstructrOvrld("Rithikgmail.com","Samyu13",1234567890);
        ConstructrOvrld obj3=new ConstructrOvrld(1234567890,"samyu890");

    }
    
}
