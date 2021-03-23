import Participant.ParticipantData;

import static org.junit.jupiter.api.Assertions.*;

class BracketManagerTest
{
    BracketManager bm;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        ParticipantData[] partList = {new ParticipantData()};
        bm = new BracketManager(partList);
    }

    @org.junit.jupiter.api.Test
    void determineRounds1()
    {
        int expected = 0;
        int output = bm.determineRounds(0);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds2()
    {
        int expected = 0;
        int output = bm.determineRounds(1);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds3()
    {
        int expected = 1;
        int output = bm.determineRounds(2);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds4()
    {
        int expected = 2;
        int output = bm.determineRounds(3);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds5()
    {
        int expected = 2;
        int output = bm.determineRounds(4);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds6()
    {
        int expected = 3;
        int output = bm.determineRounds(5);
        assertEquals(expected, output);
    }

    @org.junit.jupiter.api.Test
    void determineRounds7()
    {
        int expected = 6;
        int output = bm.determineRounds(64);
        assertEquals(expected, output);
    }
}