package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private ScoreCalculateur sc;
    private QuestionAChoixExclusif qE;
    private QuestionAChoixMultiple qM;

    @Before
    public void setUp() throws Exception {
        this.sc = new ScoreCalculateur();
        this.qE = new QuestionAChoixExclusif("LOL?",2);
        this.qM = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
    }

    @Test
    public void calculeScoreExclusif() {
        float score = 100;
        ArrayList<Integer> reponses = new ArrayList<Integer>();
        reponses.add(1);
        reponses.add(9);
        assertEquals("Le score ne correspond pas!",score,sc.calculeScore(reponses,qE),0.0);
    }
}