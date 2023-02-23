package is.hi.hbv202g.ass5;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    IntStack stack;

    @Before
    public void testNewStackIsNotFull() {
        stack= new IntStack();

        assertFalse(stack.isFull());
    }

    public void testFullStackIsFull(){
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(1);
        }
        assertTrue(stack.isFull());
    }

}
