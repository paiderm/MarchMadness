import Participant.Participant;

public class Bracket
{
    private Participant[] participantList;
    private int rounds;
    private int games;
    private int amountOfTeams;

    public Bracket()
    {
        this.rounds = -1;
        this.games = -1;
        this.amountOfTeams = -1;

        participantList = new Participant[0];
    }

    public Bracket(Participant[] partList)
    {
        this.participantList = partList;

        this.amountOfTeams = partList.length;

        this.rounds = determineRounds(this.amountOfTeams);

    }
    private int determineRounds(int amountOfTeams)
    {
        if (amountOfTeams == 0)
            return 0;
        else if (amountOfTeams <= 2)
            return 1;
        else if (amountOfTeams <= 4)
            return 2;
        else if (amountOfTeams <= 8)
            return 3;

        return 0;
    }
}
