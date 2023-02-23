package is.hi.hbv202g.ass5;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    IntStack stack;

    @Before
    public void initalizeTestVariables() {
        stack= new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull(){
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            stack.push(1);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testAlmostFull(){
        for (int i = 0; i < stack.getCapacity() - 2; i++) {
            stack.push(1);
        }
        assertFalse(stack.isFull());
    }

}
