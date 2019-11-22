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
    public void testGetScoreForIndice() {
        float score = 100;
        assertEquals("Le score ne correspond pas!",score,q.getScoreForIndice(3),0.0);
        assertThat("Le score ne devrait pas correspondre!",score,not(equalTo(q.getScoreForIndice(1))));
    }
}