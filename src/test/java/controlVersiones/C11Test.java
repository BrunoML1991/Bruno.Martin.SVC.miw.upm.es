package controlVersiones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class C11Test {

    private C11 c11;

    @BeforeEach
    void beforeEach (){
        c11 = new C11();
    }

    @Test
    void testM1 (){
        assertEquals("m1",c11.m1());
    }

    @Test
    void testM2 (){
        assertEquals("m2",c11.m2());
    }

}
