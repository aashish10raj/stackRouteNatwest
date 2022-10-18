package com.stackroute.collections;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CricketScoreAnalyzerTests {
    private CricketScoreAnalyzer scoreAnalyzer;
    private Map<String, Integer> scoreCard;


    @BeforeEach
    public void setUp() {
        scoreCard = new HashMap<>();
        scoreAnalyzer = new CricketScoreAnalyzer();
    }

    @AfterEach
    public void tearDown() {
        scoreAnalyzer = null;
    }

    @Test
    public void givenValidCricketScoreAnalyzer() {
        assertEquals(scoreCard, scoreAnalyzer.getScoreCard(), "on instantiating object, scorecard should be empty");
    }

    @Test
    public void isAddRunsToScoreCard(){
        boolean test=scoreAnalyzer.addRunsToScoreCard("Dhoni", 250);
        assertEquals(true,test,"true if valid batsman is added");
    }

    @Test
    public void addRunsToScoreCardWhenNull(){
        boolean test=scoreAnalyzer.addRunsToScoreCard(null, 1);
        assertFalse(test,"should return false when null batsman is trying to add");
    }

    @Test
    public void isGetRunsScored(){
        scoreCard.put("Sachin",199);
        scoreAnalyzer.addRunsToScoreCard("Sachin", 199);
        assertEquals(scoreCard,scoreAnalyzer.getScoreCard(), "should be equal ");

    }

    @Test
    public void isGetTotalRuns(){
       Map<String, Integer> list = scoreAnalyzer.getScoreCard();
        list.put("a",12);
        list.put("b",23);
        assertEquals(35, scoreAnalyzer.getTotalRuns(), "should return the total scores");
    }

    @Test
    public void getTotalRunsWhenNoRuns(){
        assertEquals(0, scoreAnalyzer.getTotalRuns(),"should return zero");
    }

    @Test
    public void getRunsScoredByBatsman() {
        Map<String, Integer> scoreList = scoreAnalyzer.getScoreCard();
        scoreList.put("Dhoni",249);
        scoreList.put("Sachin", 299);
        assertEquals(249, scoreAnalyzer.getRunsScored("Dhoni"), "Should return the score of the individual batsman");
    }

    @Test
    public void getBatsmanList() {
        Map<String, Integer> scoreList = scoreAnalyzer.getScoreCard();
        scoreList.put("Dhoni",249);
        scoreList.put("Sachin", 299);

        List<String> batsmen = new ArrayList<>();
        batsmen.add("Sachin");
        batsmen.add("Dhoni");
        assertEquals(batsmen, scoreAnalyzer.getSortedBatsmanName(), "should return the name of the batsmen");
    }
    @Test
    public void getHighestRunsScored() {
        Map<String, Integer> scoreList = scoreAnalyzer.getScoreCard();
        scoreList.put("Dhoni",249);
        scoreList.put("Sachin", 299);

        assertEquals(299, scoreAnalyzer.getHighestRunsScored(), "should return the highesht run" );
    }

    @Test
    public void getBatsmanWithHighestRunsFromCricketScorecardAnalyzerObject() {
        Map<String, Integer> scoreList = scoreAnalyzer.getScoreCard();
        scoreList.put("Dhoni",249);
        scoreList.put("Sachin", 299);
        List<String> topScores = new ArrayList<>();

        topScores.add("Sachin");
        assertEquals(topScores, scoreAnalyzer.getBatsmenNamesWithHighestRuns(), "should return the name of the batsman with highesht score");
    }

}
