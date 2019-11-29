package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private ScoreCalculateur sc;
    private QuestionAChoixMultiple qM;

    @Before
    public void setUp() throws Exception {
        this.sc = new ScoreCalculateur();
        qM = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
    }

    @Test
    public void testCalculeScore() {
        ArrayList<Integer> reponses = new ArrayList<Integer>();
        reponses.add(1);
        reponses.add(4);
        assertEquals("1: Le score 0 ne correspond pas!",0,sc.calculeScore(reponses,qM),0.0);
        reponses = new ArrayList<Integer>();
        reponses.add(2);
        reponses.add(3);
        float scorePartiel = 200f/3;
        assertEquals("2: Le score pour réponses partielles ne correspond pas!",scorePartiel,sc.calculeScore(reponses,qM),0.01);
        reponses = new ArrayList<Integer>();
        reponses.add(2);
        reponses.add(3);
        reponses.add(5);
        assertEquals("3: Le score maximal ne correspond pas!",100,sc.calculeScore(reponses,qM),0.01);
        reponses = new ArrayList<Integer>();
        reponses.add(1);
        reponses.add(2);
        reponses.add(3);
        assertEquals("4: Le score ne correspond pas!",16.66,sc.calculeScore(reponses,qM),0.01);
        reponses = new ArrayList<Integer>();
        reponses.add(1);
        reponses.add(2);
        reponses.add(3);
        reponses.add(4);
        reponses.add(5);
        assertEquals("5: Le score ne correspond pas!",0,sc.calculeScore(reponses,qM),0.01);
    }
}