
    class Parent{
        String bike="Splender 110";
        String Pname;
        Parent(String Pname){
            this.Pname=Pname;
            System.out.println("Callig parent class Constructor.... "+ Pname);
        }
    }
    class Child extends Parent{
        String bike="Duke 390";
        String Name;
        Child(String Pname,String Name){
            super(Pname);
            System.out.println("Child Class Constructor is callled... "+ Name);
        }
        void Display(){
            System.out.println("Child bike Name : "+ this.bike);
            System.out.println("Parent bike Name : "+ super.bike);
        }
    }
    public class SuperKyword {
    public static void main (String[] args){
        Child Coocoo=new Child("Coocoo","melon" );
        Parent urrr=new Parent("urrererr");
        Coocoo.Display();

    }
}
