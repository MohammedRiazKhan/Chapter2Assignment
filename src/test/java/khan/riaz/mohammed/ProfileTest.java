package khan.riaz.mohammed;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfileTest {

    private Profile myProfile;

    @Before
    public void setUp() throws Exception {

        myProfile = new Profile();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addToArrayList() {

        String name1 = "Mohammed";
        String name2 = "Riaz";

        myProfile.addToArrayList(name1);
        myProfile.addToArrayList(name2);

        Assert.assertEquals("Adding to list", name1, name1);
        Assert.assertEquals("Adding to list", name2, name2);

    }

    @Test
    public void addToSet() {

        String qualification1 = "Higher Certificate";
        String qualification2 = "Diploma";
        String qualification3 = "Diploma";

        myProfile.addToSet(qualification1);
        myProfile.addToSet(qualification2);
        myProfile.addToSet(qualification3);

        Assert.assertNotSame("Unique Items in set", qualification1, qualification2);
        //Assert.assertNotSame("Unique items in Set only", qualification2, qualification3);

    }

    @Test
    public void addToMap() {

        String key = "Java";
        String val = null;

        myProfile.addToMap(key, val);

        Assert.assertNotNull(val);//checks if there is a value along with the key

    }
}