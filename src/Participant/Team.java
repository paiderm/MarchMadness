package Participant;

public class Team extends Participant
{
    private String mascot;
    //private Image logo;

    public Team()
    {
        super();
        this.mascot = "default";
    }

    public Team(String name, String mascot, int seed)
    {
        super(name, seed);
        this.mascot = mascot;
    }

    public Team(String name, String mascot, int seed, int round)
    {
        super(name, seed, round);
        this.mascot = mascot;
    }

    public String getMascot()
    {
        return mascot;
    }

    @Override
    public String toString()
    {
        String output;
        output = super.toString() + "Mascot: " + this.getMascot();
        return output;
    }
}
