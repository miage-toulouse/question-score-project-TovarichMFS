package miagem1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class QuestionAChoixExclusifTest {

    @Test
    public void testGetEnonce() {
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("LOL?",3);
        assertEquals("L'énoncé ne correspond pas!","LOL?",q.getEnonce());
    }

    @Test
    public void testGetScoreForIndice() {
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("LOL?",3);
        assertEquals("Le score ne correspond pas!",100,q.getScoreForIndice(3),0.0);
        assertThat("Le score ne correspond pas!",100.0f,not(equalTo(q.getScoreForIndice(1))));
    }
}