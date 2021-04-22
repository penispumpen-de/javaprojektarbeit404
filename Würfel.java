public class Würfel {

    private int points;

    public int getPoints() {
        return points;
    }

    public int wuerfeln(){
        int randomNumber = (int) (Math.random() * 6 + 1);
        points += randomNumber;
        return randomNumber;
    }
}