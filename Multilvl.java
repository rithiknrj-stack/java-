
class Food{
    void order(){
      System.out.println("you ordered food");}}
    
 class FastFood extends Food{
    void receive(){
        System.out.println("you received fastfood ");
    }}
   
 class Friedrice extends FastFood{
    void eat(){
        System.out.println("you aree eating friedrice now.....");
    }}
 