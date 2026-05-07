package Factory;

public class CandyFactory {
    private CandyFactory(){
    }

    public static final Candy getCandy(CandyType type){
        switch (type){
            case Chocolate: {
                return new ChocolateCandy();
            }
            case Alpenliebe: {
                return new AlpenliebeCandy();
            }
            default:
                throw new IllegalArgumentException("Unexpected: " + type);
        }
    }
}
