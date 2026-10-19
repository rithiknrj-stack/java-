class Gift{
    void wrap(){
        System.out.println("opening Gift");
    }
}
class BirthdayGift extends Gift{
    void give(){
        System.out.println("Birthday Gift");
        System.out.println("surprise....oh my god! it was PUPPY DOG,look at him, he was sooo cute.... ");

    }
}
class AnniversaryGift extends Gift{
    void Surprise(){
        System.out.println("Anniversary Gift" );
        System.out.println("close ur eyes 3,2,1 go ,surprise...ohhh it was an 55inch big photo frame resemblig our golden memories....");

    }
}
class valentinesGift extends Gift{
    void wonder(){
        System.out.println("Vantines Gift");
        System.out.println("A bouquet of all the Flowers she likes,saying will  yo be my VALENTINE ......");

    }
}



public class Hierarichical {
    public static void main(String[] args){
        Gift G=new Gift();
        G.wrap();

        valentinesGift VG=new valentinesGift();
         VG.wrap();
        VG.wonder();

        AnniversaryGift AG=new AnniversaryGift();
        AG.wrap();
        AG.Surprise();

        BirthdayGift BG=new BirthdayGift();
        BG.wrap();
        BG.give();


    }

    
}
