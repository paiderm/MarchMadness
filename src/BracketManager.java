import Participant.ParticipantData;

public class BracketManager
{
    private Bracket bracket;

    public BracketManager(ParticipantData[] participantList)
    {
        this.bracket = new Bracket();

        this.bracket.setParticipantList(participantList);
        this.bracket.setAmountOfTeams(participantList.length);
        this.bracket.setGames(determineRounds(participantList.length));
    }

    public int determineRounds(int amountOfTeams)
    {
        int returnValue;
        if (amountOfTeams < 2)
        {
            returnValue = 0;
        }
        else
            returnValue = (int)Math.ceil(Math.log(amountOfTeams) / Math.log(2.0));

        return returnValue;

    }

    public Bracket getBracket()
    {
        return this.bracket;
    }
}
