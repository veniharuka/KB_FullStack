package afternoon.extendss.superrr;

public class Album extends Item{
    private String artist;


    public Album(String name, int price, String artist){
        super(name,price);
        this.artist = artist;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("책의 저자는 :"+this.artist);

    }


}
