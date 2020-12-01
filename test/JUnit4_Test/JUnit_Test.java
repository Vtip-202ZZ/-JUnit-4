package JUnit4_Test;

import org.junit.Test;
import static org.junit.Assert.*;

import static zza06_junit4.ZZA06_JUnit4.myDiv;

public class JUnit_Test {

    @Test
    public void test1MyDiv() throws Exception {
        assertTrue(myDiv(5, 6, 880) == 1);
    }

    @Test
    public void test2MyDiv() throws Exception {
        try {
            assertTrue("Проверка деления на 0", myDiv(0, 13, 44) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}
