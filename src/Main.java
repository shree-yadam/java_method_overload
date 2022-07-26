public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("SDY", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(1, 2));
        System.out.println(calcFeetAndInchesToCentimeters(14));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double centimeters = (feet * 12 + inches) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0) {
            return -1;
        }

        int feet = (inches - inches % 12)/ 12;
        inches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
