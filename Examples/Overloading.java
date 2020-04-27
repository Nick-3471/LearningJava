package Examples;

public class Overloading {

        public static void main(String[] args) {
            int firstScore = calculateScore("Nick", 1000);

            int secondScore = calculateScore(10000);
            int thridScore = calculateScore();
            
            System.out.println(calcFeetAndInchesToCentimeteres(122));
            System.out.println(getDurrationString(-100));

        }

        //Testing out overloading
        public static int calculateScore(String playerName, int score) {
            
            System.out.println("Player "+ playerName + "scored " + score + " points");
            return score * 1000;
        }

        public static int calculateScore(int score) {
            
            System.out.println("Unknown Player scored " + score + " points");
            return score * 1000;
        }
        public static int calculateScore() {
            
            System.out.println("No Player - 0 Score");
            return -1;
        }


        //First self example with overlaoding
        private static double calcFeetAndInchesToCentimeteres(int feet, int inch) {
            if(feet >= 0){
                if(inch >= 0 && inch <= 12){
                    return (feet * 30.48) + (inch * 2.54);
                }
            }
            return -1;
        }

        private static double calcFeetAndInchesToCentimeteres(double inch) {
            if(inch >= 0){
                 return calcFeetAndInchesToCentimeteres((int)(inch/12), (int)(inch % 12) );
                }
            return -1;
        }

        //Converting seconds into string HH MM SS format
        public static String getDurrationString(int min, int sec) {
            if(min >=0){
                if(sec >=0 && sec <= 59){
                    return min + "min and " + sec + "sec is " + (min/60) + "h " + (min%60) + "m " + sec + "s";
                }
            }
        return "Invalid Vaules";
        }

        public static String getDurrationString(int sec) {
            if(sec >=0){
                return getDurrationString((sec/60), (sec%60));
            }
        return "Invalid Vaules";
        }
}