package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {
    private QuestionAChoixMultiple q;

    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> listeR = new ArrayList<Integer>();
        listeR.add(2);
        listeR.add(7);
        this.q = new QuestionAChoixMultiple("LOLILOL?",listeR);
    }

    @Test
    public void getEnonce() {
        //when : on demande l'énoncé de la question
        String resEnonce = q.getEnonce();
        //then : on vérifie l'énoncé retoruné avec l'énoncé fourni
        assertEquals("L'énoncé ne correspond pas!","LOLILOL?",resEnonce);
    }

    @Test
    public void getScoreForIndiceBonneReponse() {
        float score = 100/2;
        assertEquals("Le score ne correspond pas!",score,q.getScoreForIndice(2),0.0);

    }

    @Test
    public void getScoreForIndiceMauvaiseReponse() {
        float score = 100/2;
        assertThat("Le score ne devrait pas correspondre!",score,not(equalTo(q.getScoreForIndice(8))));

    }
}