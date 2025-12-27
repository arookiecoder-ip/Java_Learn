public class Box<Thing , Price>{

    Thing item;// for an unknown data type
    Price price;

    public void setItem(Thing item ,Price price){
        this.item = item;
        this.price= price;
    }

    public Thing getItem(){
        return this.item;
    }
    public Price getPrice(){
        return this.price;
    }


}
