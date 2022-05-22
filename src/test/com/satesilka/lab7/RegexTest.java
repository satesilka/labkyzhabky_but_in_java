package test.com.satesilka.lab7;

import com.satesilka.lab7.Regex;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RegexTest {
    @Test
    //ні блін контрольна робота
    public void testRegex() {
        var regex = new Regex("Acdafaofn fafoafa ehaofoaf ibofa oaiop idafia");
        String[] expected = {"ibofa", "Acdafaofn", "idafia", "ehaofoaf", "oaiop"};
        assertArrayEquals(expected,  regex.sortWords().toArray());
    }
}
