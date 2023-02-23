package is.hi.hbv202g.ass5;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

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

    @Test
    public void testPopReturnsPushedValue(){
        Random random = new Random();
        int[] pushedValues = new int[stack.getCapacity()];
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            int value = random.nextInt(200);
            stack.push(value);
            pushedValues[i] = value;
        }

        for (int i = stack.getCapacity() - 1; i >= 0; i--) {
            int value = stack.pop();
            assertEquals(value, pushedValues[i]);
        }
    }

}
