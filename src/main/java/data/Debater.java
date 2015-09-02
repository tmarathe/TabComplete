package data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Dean on 2015-09-02.
 */
public class Debater
{

    private String name;

    private Map<Integer, Double> speakerScoresByRound = new LinkedHashMap<>();


    public Debater(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setSpeakerScore(int round, String score) throws NumberFormatException
    {
        Double parsedScore = Double.parseDouble(score);
        this.speakerScoresByRound.put(round, parsedScore);
    }

    public void setSpeakerScore(int round, double score)
    {
        this.speakerScoresByRound.put(round, score);
    }

    public Double getSpeakerScore(int round)
    {
        return this.speakerScoresByRound.get(round);
    }

    public double averageSpeakerScore()
    {
        return 1.0;
    }



}
