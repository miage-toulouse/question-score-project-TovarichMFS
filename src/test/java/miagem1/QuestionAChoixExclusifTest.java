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
        assertEquals("L'énoncé ne correspond pas!","LOL?",q.getEnonce());
    }

    @Test
    public void testGetScoreForIndice() {
        assertEquals("Le score ne correspond pas!",100,q.getScoreForIndice(3),0.0);
        assertThat("Le score ne devrait pas correspondre!",100.0f,not(equalTo(q.getScoreForIndice(1))));
    }
}