package cn.xpbootcamp.tennis.game1;

import cn.xpbootcamp.tennis.TennisGame;

public class TennisGame1 implements TennisGame {

    public static final String ADVANTAGE = "Advantage";
    public static final String WIN_FOR = "Win for";
    public static final String DEUCE = "Deuce";
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;


    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) player1Score++;
        else player2Score++;
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return player1Score > 2 ? DEUCE : String.format("%s-All", scoreMap.get(player1Score));
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            String leader = minusResult > 0 ? player1Name : player2Name;
            String leadingType = Math.abs(minusResult) == 1 ? ADVANTAGE : WIN_FOR;
            return String.format("%s %s", leadingType, leader);
        } else {
            return String.format("%s-%s", scoreMap.get(player1Score), scoreMap.get(player2Score));
        }
    }
}
