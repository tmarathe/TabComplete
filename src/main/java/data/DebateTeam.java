package data;

import java.util.LinkedHashMap;
import java.util.Map;


public class DebateTeam{

    private String teamName;

    private Debater debaterOne;

    private Debater debaterTwo;

    private Map<Integer, Boolean> winLossRecord = new LinkedHashMap<>();

    public DebateTeam(String teamName, Debater debaterOne, Debater debaterTwo){

        this.teamName = teamName;

        this.debaterOne = debaterOne;

        this.debaterTwo = debaterTwo;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void setDebaterOne(Debater debaterOne){
        this.debaterOne = debaterOne;
    }

    public void setDebaterTwo(Debater debaterTwo){
        this.debaterTwo = debaterTwo;
    }

    public Debater getDebaterOne(){
        return this.debaterOne;
    }

    public Debater getDebaterTwo(){
        return this.debaterTwo;
    }

    public void setRoundResult(Integer round, Boolean result){
        this.winLossRecord.put(round, result);
    }


}
