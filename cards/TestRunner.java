package cards;


public class TestRunner {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deck deck = new Deck();
        int count = 1;
        for (Card c : deck.myCardList) {
            System.out.print(count);
            System.out.println(" " + c.prettyPrint());
            count++;
        }
    }

}
