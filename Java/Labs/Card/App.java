public class App {
    public static void main(String[] args){
        Card card1 = new Card();
        Card card2 =  new Card();
        card1 = card1.setCard("2","H");
        card2 = card2.setCard("2","H");
        card1.equalSuit(card2);
        card1.equalValue(card2);
    }
    
}
