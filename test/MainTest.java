/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongNH
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void TestSuccessfullCase() {
        assertTrue(Main.DateCheck(29, 2, 2000));
        assertTrue(Main.DateCheck(31, 3, 2000));
        assertTrue(Main.DateCheck(30, 4, 2000));
        assertTrue(Main.DateCheck(28, 2, 2001));
        assertTrue(Main.DateCheck(30, 2, 2001));
    }
    
    @Test
    public void TestFailCase() {
        assertFalse(Main.DateCheck(30, 2, 2000));
        assertFalse(Main.DateCheck(33, 3, 2000));
        assertFalse(Main.DateCheck(31, 4, 2000));
        assertFalse(Main.DateCheck(0, 3, 2000));
        assertFalse(Main.DateCheck(0, 4, 2000));
        assertFalse(Main.DateCheck(31, 3, -1));
        assertFalse(Main.DateCheck(30, 2, 2001));
    }
}
