public class problem{
    String productname;
     String  category;
     String  brand;
     int Quantity;
     int price;
    public problem(String productname,String category,String brand,int Quantity,int price){
        this.productname=productname;
        this.category=category;
        this.brand=brand;
     this.Quantity=Quantity;
        this.price=price;
    }
        
    void display(){
        System.out.println("product name : "+ productname);
         System.out.println("category : "+ category);
         System.out.println("brand : "+ brand);
          System.out.println("Quantity : "+ Quantity);
           System.out.println("pice : "+ price);
    }
 public static void main(String[] args){
        problem disp=new problem("Smartphone","mobile","Samsung",1,120000);
        disp.display();
       
    }}
