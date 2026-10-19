public class MthdOvrRide {
    void print(int a,int b){
     System.out.println("output:" + a +" and " +b );
    }
     void print(int a,int b,int c){
        System.out.println("output:" + a +" ,"+b +" and "+c);
     }
     public static void main(String[] args){
        MthdOvrRide obj=new MthdOvrRide();
        obj.print(12,15);
        obj.print(10,20,30);
     }
    
}
