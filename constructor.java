public class constructor {
    String name;
    int age;
    //if we create a constructor explicitly,default constructor  wil be overwritten
  public constructor(String n,int a){
    name=n;
    age=a;

  }
  public static void main(String[] args){
  constructor cons=new constructor("rithik",21);
  System.out.println("person name :"+cons.name);
  System.out.println("person age :" +cons.age);
   constructor cons1=new constructor("Samyuktha",21);
  System.out.println("person name :"+cons1.name);
  System.out.println("person age :" +cons1.age);
   constructor cons2=new constructor("Twin Babies",1);
  System.out.println("person name :"+cons2.name);
  System.out.println("person age :" +cons2.age);
  



  }
    
}
