package codingDays.day4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by smoenkemeyer on 19.10.16.
 */
public class PersonTest {


    @Test
    public void amIOld() {

        Assert.assertEquals("Age is not valid, setting age to 0.", person.amIOld());

    }

    @Test
    public void yearPasses() throws Exception {

    }

    @Test
    public void main() throws Exception {
        Person person = new Person(12);
        Assert.assertEquals("Age is not valid, setting age to 0.", person.main(12,1,2););

    }

}

    public void testSimpleAdd() {
        Money m12CHF= new Money(12, "CHF");  // (1)
        Money m14CHF= new Money(14, "CHF");
        Money expected= new Money(26, "CHF");
        Money result= m12CHF.add(m14CHF);    // (2)
        Assert.assertTrue(expected.equals(result));     // (3)
    }