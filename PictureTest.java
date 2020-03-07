/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.csd.datastructure.iceHockey.cs22;

import java.awt.Point;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ECC
 */
public class PictureTest {
    
    public PictureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkThreshold method, of class Picture.
     */
    
    @Test
    public void testFindPlayers() {
        System.out.println("findPlayers");
        String[] photo = {"33JUBU33","3U3O4433","O33P44NB","PO3NSDP3","VNDSD333","OINFD33X"};
        int team = 3;
        int threshold = 16;
        Picture instance = new Picture();
        Point[] expResult = new Point[3];
        expResult[0] = new Point(14, 2);
        expResult[1] = new Point(4, 5);
        expResult[2] = new Point(13, 9);
        
        Point[] result = instance.findPlayers(photo, team, threshold);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testFindPlayers2() {
        System.out.println("findPlayers");
        String[] photo = {"44444H44S4","K444K4L444","4LJ44T44XH","444O4VIF44","44C4D4U444","4V4Y4KB4M4","G4W4HP4O4W","4444ZDQ4S4","4BR4Y4A444","4G4V4T4444"};
        int team = 4;
        int threshold = 16;
        Picture instance = new Picture();
        
        Point[] expResult = new Point[6];
        expResult[0] = new Point(5, 4);
        expResult[1] = new Point(16, 3);
        expResult[2] = new Point(3, 8);
        expResult[3] = new Point(17, 9);
        expResult[4] = new Point(4, 16);
        expResult[5] = new Point(16, 17);
        
        
        Point[] result = instance.findPlayers(photo, team, threshold);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

   
    
}
