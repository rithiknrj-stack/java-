
public class Passport {
    String PassportNo;
    String NAME;
  Passport(String PassportNo,String NAme){
    this.PassportNo=PassportNo;
    this.NAME=NAme;
  }
  Passport(Passport original){
    this.PassportNo=original.PassportNo;
    this.NAME=original.NAME;
  }
  void Details(){
    System.out.println("Name :" +NAME);
    System.out.println("PassportNO:" +PassportNo);
    
  }
    public static  void main(String[] args){
        Passport Passporterrr=new Passport("1A2C3HJYTV","Rithik");
        Passporterrr.Details();
        Passport Copy=new Passport(Passporterrr);
        Copy.Details();
    }
}
