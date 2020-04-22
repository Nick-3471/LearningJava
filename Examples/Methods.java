package Examples;

public class Methods {
    public static void main(String[] args) {
        Boolean gameOver = true;
        int score = 800;
        int levelCompeted = 5;
        int bonus = 100;
        int finalScore;
        
    
        if(gameOver){
            finalScore = calculateScore(score, levelCompeted, bonus);
            System.out.println("Your final score is " + finalScore);
        }
            

        score = 10000;
        levelCompeted = 8;
        bonus = 200;
        if(gameOver){
            finalScore = calculateScore(score, levelCompeted, bonus);
            System.out.println("Your final score is " + finalScore);
        }


        String playerOne = "Player One";
        int playerOneScore = calculateHighScorePosition(270); 
        String playerTwo = "Player Two";
        int playerTwoScore = calculateHighScorePosition(852); 
        String playerThree = "Player Three";
        int playerThreeScore = calculateHighScorePosition(1060); 
        String playerFour = "Player Four";
        int playerFourScore = calculateHighScorePosition(1); 

        displayHighScorePosition(playerOne, playerOneScore);
        displayHighScorePosition(playerTwo, playerTwoScore);
        displayHighScorePosition(playerThree, playerThreeScore);
        displayHighScorePosition(playerFour, playerFourScore);
    }



    public static int calculateScore (int score, int levelCompeted, int bonus){
            int finalScore = score + (levelCompeted * bonus);
            finalScore += 1000;

            return finalScore;
    }


    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println("Player " + playersName + " managed to get to a position of " + position);        
    }


    public static int calculateHighScorePosition(int playersScore){
        if(playersScore >= 1000){
            return 1;
        }
        else if (playersScore >= 500 /*&& playersScore < 1000 - don't need this seciton becuase it is always True if we get to this line*/){
            return 2;
        }
        else if (playersScore >= 100 /*&& playersScore < 500 - don't need this seciton becuase it is always True if we get to this line*/){
            return 3;
        }
        return 4;
    }  

}