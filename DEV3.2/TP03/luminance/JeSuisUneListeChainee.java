package luminance;

public class JeSuisUneListeChainee<E> {
    private JeSuisUnMaillonDeListeChainee<E> maillon;


    public JeSuisUneListeChainee(){
        this.maillon=null;
    }

    public void add(E value){
        JeSuisUnMaillonDeListeChainee<E> nouveau = new JeSuisUnMaillonDeListeChainee<E>(this.maillon,value);
        this.maillon=nouveau;
    }

    public void remove(E value){
        JeSuisUnMaillonDeListeChainee ptrCurrent=this.maillon;
        JeSuisUnMaillonDeListeChainee ptrPrecedent=null;
        while(ptrCurrent!=null && ptrCurrent.getData()!=value){
            ptrPrecedent=ptrCurrent;
            ptrCurrent=ptrCurrent.getNext();
        }
        if(ptrCurrent==null){
            throw new IllegalArgumentException("pabon");
        }
        if(ptrPrecedent==null){
            this.maillon=ptrCurrent.getNext();
        }
        ptrPrecedent.setNext(ptrCurrent.getNext());
    }

    public JeSuisUnMaillonDeListeChainee iteration(){
        
    }
}
