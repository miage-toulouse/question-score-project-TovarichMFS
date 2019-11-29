package miagem1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionAChoixExclusifTest {
    private QuestionAChoixExclusif q;

    @Before
    public void setUp() throws Exception{
        this.q = new QuestionAChoixExclusif("LOL?",3);

    }

    @Test
    public void testGetEnonce() {
        //when : on demande l'énoncé de la question
        String resEnonce = q.getEnonce();
        //then : on vérifie l'énoncé retoruné avec l'énoncé fourni
        assertEquals("L'énoncé ne correspond pas!","LOL?",resEnonce);
    }

    @Test
    public void testGetScoreForIndiceBonneReponse() {
        float score = 100;
        assertThat("Le score ne devrait pas correspondre!",score,not(equalTo(q.getScoreForIndice(1))));
    }

    @Test
    public void testGetScoreForIndiceMauvaiseReponse() {
        float score = 100;
        assertThat("Le score ne devrait pas correspondre!",score,not(equalTo(q.getScoreForIndice(1))));
    }
}