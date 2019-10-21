import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void test(){
        NameGenerator generator = new SimpleTestNameGenerator();
        String name = generator.generate();

        assertEquals(name, "Vasya");
    }
}
