package Participant;

public interface IParticipant
{
    public String getName();

    public int getSeed();

    public int getRound();

    public void advanceToNextRound();

    public void setCurrentOpponent(int currentOpponentSeed);

    public int getCurrentOpponentSeed();
}
