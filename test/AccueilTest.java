/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alseyni BALDE
 */
public class AccueilTest {
    
    public AccueilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkInput method, of class Accueil.
     */
    @Test
    public void testCheckInput() {
        System.out.println("checkInput");
        Accueil instance = new Accueil();
        boolean expResult = false;
        boolean result = instance.checkInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Accueil.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Accueil.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class Accueil.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Accueil instance = new Accueil();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillet method, of class Accueil.
     */
    @Test
    public void testGetBillet() {
        System.out.println("getBillet");
        Accueil instance = new Accueil();
        ArrayList<Billet> expResult = null;
        ArrayList<Billet> result = instance.getBillet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBillet method, of class Accueil.
     */
    @Test
    public void testShowBillet() {
        System.out.println("showBillet");
        Accueil instance = new Accueil();
        instance.showBillet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultBillet method, of class Accueil.
     */
    @Test
    public void testGetResultBillet() {
        System.out.println("getResultBillet");
        Accueil instance = new Accueil();
        ArrayList<Billet> expResult = null;
        ArrayList<Billet> result = instance.getResultBillet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showSearchBillet method, of class Accueil.
     */
    @Test
    public void testShowSearchBillet() {
        System.out.println("showSearchBillet");
        Accueil instance = new Accueil();
        instance.showSearchBillet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showElements method, of class Accueil.
     */
    @Test
    public void testShowElements() {
        System.out.println("showElements");
        int index = 0;
        Accueil instance = new Accueil();
        instance.showElements(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
