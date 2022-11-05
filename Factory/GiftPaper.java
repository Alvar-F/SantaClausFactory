package Factory;

public class GiftPaper{
    protected Toy gift;

    public GiftPaper(){

    }

    public void wrap(Toy toy){
        this.gift=toy;
    }

    public Toy unwrap(){
        Toy tamere=this.gift;
        this.gift=null;
        return tamere;
    }
}