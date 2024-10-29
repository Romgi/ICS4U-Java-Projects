//Finding optimal strategy for pig dice game with a single dice

import java.util.Random;

public class PigDiceSimulator {
    
    public static void main(String[] args) {
        int numberOfGames = 1000000; // Number of simulations for each hold value
        int maxHoldValue = 100;
        int[] totalMoves = new int[maxHoldValue + 1];
        
        for (int holdValue = 1; holdValue <= maxHoldValue; holdValue++) {
            int moves = simulateGames(numberOfGames, holdValue);
            totalMoves[holdValue] = moves;
        }

        int optimalHoldValue = findOptimalStrategy(totalMoves, numberOfGames);
        System.out.println("Most optimal hold value: " + optimalHoldValue);
    }

    private static int simulateGames(int numberOfGames, int holdValue) {
        int totalMoves = 0;

        for (int game = 0; game < numberOfGames; game++) {
            totalMoves += playGame(holdValue);
        }

        return totalMoves;
    }

    private static int playGame(int holdValue) {
        Random random = new Random();
        int playerScore = 0;
        int opponentScore = 0;
        int moves = 0;

        while (playerScore < 100 && opponentScore < 100) {
            moves++;
            int turnScore = 0;
            boolean rolling = true;

            while (rolling) {
                int roll = random.nextInt(6) + 1; // Roll a die (1-6)
                if (roll == 1) {
                    turnScore = 0; // Lose all points for this turn
                    rolling = false;
                } else {
                    turnScore += roll;
                    if (turnScore >= holdValue) {
                        playerScore += turnScore; // Hold and add to score
                        rolling = false;
                    }
                }
            }

            // Simulate opponent's turn (using the same strategy for simplicity)
            turnScore = 0;
            rolling = true;
            while (rolling) {
                int roll = random.nextInt(6) + 1;
                if (roll == 1) {
                    turnScore = 0;
                    rolling = false;
                } else {
                    turnScore += roll;
                    if (turnScore >= holdValue) {
                        opponentScore += turnScore;
                        rolling = false;
                    }
                }
            }
        }

        return moves;
    }

    private static int findOptimalStrategy(int[] totalMoves, int numberOfGames) {
        int optimalHoldValue = 1;
        double bestAverage = Double.MAX_VALUE;

        for (int i = 1; i < totalMoves.length; i++) {
            double averageMoves = (double) totalMoves[i] / numberOfGames;
            System.out.println("Hold value: " + i + ", Average moves: " + averageMoves);
            if (averageMoves < bestAverage) {
                bestAverage = averageMoves;
                optimalHoldValue = i;
            }
        }

        return optimalHoldValue;
    }
}