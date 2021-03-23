import Participant.ParticipantData;

public class Bracket
{
    private ParticipantData[] participantList;
    private int rounds;
    private int games;

    public Bracket()
    {
        this.rounds = -1;
        this.games = -1;
        this.amountOfTeams = -1;

        participantList = new ParticipantData[0];
    }

    public Bracket(ParticipantData[] partList, int rounds)
    {
        this.participantList = partList;

        this.amountOfTeams = partList.length;

        this.rounds = rounds;
    }

    public ParticipantData[] getParticipantList()
    {
        return participantList;
    }

    public void setParticipantList(ParticipantData[] participantList)
    {
        this.participantList = participantList;
    }

    public int getRounds()
    {
        return rounds;
    }

    public void setRounds(int rounds)
    {
        this.rounds = rounds;
    }

    public int getGames()
    {
        return games;
    }

    public void setGames(int games)
    {
        this.games = games;
    }

    public int getAmountOfTeams()
    {
        return amountOfTeams;
    }

    public void setAmountOfTeams(int amountOfTeams)
    {
        this.amountOfTeams = amountOfTeams;
    }

    private int amountOfTeams;



}
