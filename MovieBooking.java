class MovieBooking{
    String Movie_Name;
    String Language;
    double Rating;
    double price ;
    int Number_of_Tickets;
    double Total_price;
    MovieBooking(String Movie_Name,String Language,double Rating,double price,int Number_of_Tickets){
        this.Movie_Name=Movie_Name;
        this.Language=Language;
        this.Rating=Rating;
        this.price=price;
        this.Number_of_Tickets=Number_of_Tickets;
        this.Total_price=this.price*this.Number_of_Tickets;
        System.out.println("our Movie Name is :" +Movie_Name );
         System.out.println("our Movie Language is :" +Language );
          System.out.println("price is :" +price );  
           System.out.println("Number of tickets :" +Number_of_Tickets );
           System.out.println("YOur total price is :"+Total_price); }      
    public static void main(String[] args){
         MovieBooking obj=new MovieBooking("jailer","Tamil",9.8,378.0,2);
        
    }
}