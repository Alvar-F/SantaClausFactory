package Factory;
import java.util.*;

public class Elf {
    protected Toy toy;
    protected List<GiftPaper> papers;
    protected Factory factory;



    public Elf(Factory factory){
        this.factory=factory;
    }

    public boolean pickToy(String toy) throws NoSuchToyException{
        if (this.toy==null){
            if (this.factory.create(toy)==null){
            System.out.println("I didn't find any "+toy+".");
            return false;
           }else{
            this.toy=this.factory.create(toy);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
           }
        }else{
            System.out.println("Minute please ?! I'm not that fast.");
            return false;
        }
    }

    public boolean pickPapers(int nb){
        this.papers=this.factory.getPapers(nb);
        return true;
    }

    public GiftPaper pack(){
        if (this.toy==null){
            System.out.println("I don't have any toy, but hey at least it's paper!");
        }else if(this.papers.isEmpty()==false){
            papers.get(0).wrap(this.toy);
            GiftPaper lol = papers.get(0);
            papers.remove(0);
            this.toy=null;
            System.out.println("And another kid will be happy!");
            return lol;
        }else{
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        return null;
    }

}