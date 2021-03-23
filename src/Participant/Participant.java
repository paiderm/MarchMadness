package Participant;

public class Participant implements IParticipant
{
    private String name;
    private int seed;
    private int round;

    private int currentOpponentSeed;

    public Participant ()
    {
        this.name = "default";
        this.seed = -1;
        this.round = -1;

        this.currentOpponentSeed = -1;
    }

    public Participant(String name, int seed, int currentOpponentSeed)
    {
        this.name = name;
        this.seed = seed;
        this.round = 1;

        currentOpponentSeed = currentOpponentSeed;
    }

    public Participant(Participant copy)
    {
        this.name = copy.getName();
        this.seed = copy.getSeed();
        this.round = copy.getRound();

        this.currentOpponentSeed = copy.getCurrentOpponentSeed();
    }

    @Override
    public void setCurrentOpponent(int currentOpponentSeed)
    {
        this.currentOpponentSeed = currentOpponentSeed;
    }

    @Override
    public int getCurrentOpponentSeed()
    {
        return this.currentOpponentSeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSeed() {
        return seed;
    }

    @Override
    public int getRound() {
        return this.round;
    }

    @Override
    public void advanceToNextRound()
    {
        this.round += 1;
    }

    @Override
    public String toString()
    {
        String output;
        output = "Name: " + this.getName();
        output += "\nSeed: " + this.getSeed();
        output += "\nCurrent Round: " + this.getRound();
        output += "\nOpponent Seed: " + this.getCurrentOpponentSeed();

        return output;
    }
}
