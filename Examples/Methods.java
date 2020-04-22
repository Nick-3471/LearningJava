package Examples;

public class Methods {
    public static void main(String[] args) {
        Boolean gameOver = true;
        int score = 800;
        int levelCompeted = 5;
        int bonus = 100;
        
    
    
        calculateScore(gameOver, score, levelCompeted, bonus);
    }



    public static void calculateScore (boolean gameOver, int score, int levelCompeted, int bonus){
        if (gameOver == true){
            int finalScore = score + (levelCompeted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }

}