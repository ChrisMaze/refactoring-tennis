package cn.xpbootcamp.tennis;

import java.util.Map;

public interface TennisGame {
    Map<Integer, String> scoreMap = Map.of(0, "Love", 1, "Fifteen", 2, "Thirty", 3, "Forty");
    void wonPoint(String playerName);
    String getScore();
}
