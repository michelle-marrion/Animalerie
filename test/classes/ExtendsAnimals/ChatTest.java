/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.ExtendsAnimals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngami_4vnxadk
 */
public class ChatTest {
    
    public ChatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Walker method, of class Chat.
     */
    @Test
    public void testWalker() {
        System.out.println("Walker");
        Chat instance = new Chat();
        instance.Walker();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cry method, of class Chat.
     */
    @Test
    public void testCry() {
        System.out.println("Cry");
        Chat instance = new Chat();
        instance.Cry();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
