package khan.riaz.mohammed;

import Configuration.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class Profile2Test {

    private CollectionsInterface myProfile2;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        myProfile2 = (CollectionsInterface)ctx.getBean("allCollectionsStartingAt1");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addToArrayList() {

        String name1 = "Mohammed";
        String name2 = "Riaz";

        myProfile2.addToArrayList(name1);
        myProfile2.addToArrayList(name2);

        Assert.assertEquals("Adding to list", name1, name1);
        Assert.assertEquals("Adding to list", name2, name2);

    }

    @Test
    public void addToSet() {

        String qualification1 = "Higher Certificate";
        String qualification2 = "Diploma";
        String qualification3 = "Diploma";

        myProfile2.addToSet(qualification1);
        myProfile2.addToSet(qualification2);
        myProfile2.addToSet(qualification3);

        Assert.assertNotSame("Unique Items in set", qualification1, qualification2);
        //Assert.assertNotSame("Unique items in Set only", qualification2, qualification3);

    }

    @Test
    public void addToMap() {

        String key = "Java";
        String val = null;

        myProfile2.addToMap(key, val);

        Assert.assertNotNull(val);//checks if there is a value along with the key

    }
}