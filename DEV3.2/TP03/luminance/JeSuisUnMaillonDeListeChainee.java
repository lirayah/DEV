package luminance;

public class JeSuisUnMaillonDeListeChainee<E> {
    private JeSuisUnMaillonDeListeChainee<E> next;
    private E data;

    public JeSuisUnMaillonDeListeChainee(JeSuisUnMaillonDeListeChainee<E> nextinext,E datata){
        this.next=nextinext;
        this.data=datata;
    }

    public E getData() {
        return this.data;
    }

    public JeSuisUnMaillonDeListeChainee<E> getNext(){
        return this.next;
    }

    public void setNext(JeSuisUnMaillonDeListeChainee<E> e){
        this.next=e;
    }
}
