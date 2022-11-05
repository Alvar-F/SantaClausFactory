package Factory;
import java.util.*;

public class Factory{


    public Factory(){

    }

    public Toy create(String toy) throws NoSuchToyException{
        if(toy=="teddy"){
            return new TeddyBear();
        }else if (toy=="gameboy"){
            return new Gameboy();
        }else{
            throw new NoSuchToyException("No such toy: "+toy+".");
        }
    
    }

    public List<GiftPaper> getPapers(int n){
        List<GiftPaper> Papers= new ArrayList<GiftPaper>();
        for (int i=0;i<n;i++){
            Papers.add(new GiftPaper());
        }
        return Papers;
    }
}