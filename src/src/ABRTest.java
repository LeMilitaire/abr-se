import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by renau on 09/11/2016.
 */
public class ABRTest {

    @Test
    public void isEmptyTest(){
        ABR abr= new ABR();
        assertTrue("This is empty",abr.isEmpty());
        abr.insert(3);
        assertFalse(ABR is not empty, abr.isEmpty());
        assertEquals(1,abr.nbElements());
    }
}