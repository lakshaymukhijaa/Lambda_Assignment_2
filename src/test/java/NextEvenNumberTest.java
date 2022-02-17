import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NextEvenNumberTest {

    List<Integer> integerArrayList = new ArrayList<Integer>(48566);


    @Test
    public void shouldReturn2() {
        int num=8;
        int num2=10;

        Assert.assertEquals(num2,num);
    }
}
