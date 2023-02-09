package Labs.Card;

public class Card {

    private String value;
    private String suit;
    public Card(){
    }

    public Card(String card){
    }

    public Card setCard(String value, String suit){
        return this;
    }

    public Card getCard(){
        return this;
    }

    public void setValue(String value){
    }

    public String getValue(){
        return value;
    }

    public void setSuit(String suit){
    }

    public String getSuit(){
        return suit;
    }

    public void equalValue(Object obj){
        Card other = (Card) obj;
        if (value != other.value){
            System.out.println("not equal");
        }
        System.out.println("equal");

    }

    public void equalSuit(Object obj){
        Card other = (Card) obj;
        if (suit != other.suit){
            System.out.println("not equal");
        }
        System.out.println("equal");

    }

    
    
}
