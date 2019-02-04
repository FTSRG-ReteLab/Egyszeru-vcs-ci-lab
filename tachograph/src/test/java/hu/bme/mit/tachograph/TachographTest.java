import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

package hu.bme.mit.tachograph;

public class TachographSystem{
    Tachograph th;
    @Before
    public void before() {
        TrainSystem s = new TrainSystem();
        th = new Tachograph(s);
    }

    @Test
    public void PuttingItemInTachograph_ListNotEmpty(){
        th.saveDate();

        Assert.assertFalse(th.isTableEmpty());
    }
}