/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricky
 */
public class ProcesadorArchivosTest {
    
    public ProcesadorArchivosTest() {
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
     * Test of ValidarArchivos method, of class ProcesadorArchivos.
     */
    @org.junit.Test
    public void testValidarArchivos() {
        System.out.println("ValidarArchivos");
        String path = "src/test/resource/newfile.txt";
        ProcesadorArchivos instance = new ProcesadorArchivos();
        boolean expResult = false;
        boolean result = instance.ValidarArchivos(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of LeerArchivo method, of class ProcesadorArchivos.
     */
    @Test
    public void testLeerArchivo() {
        System.out.println("LeerArchivo");
        String path = "src/test/resource/newfile.txt";
        ProcesadorArchivos instance = new ProcesadorArchivos();
        boolean expResult = false;
        ArrayList<Object> resultado = instance.LeerArchivo(path);
        boolean result = resultado.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
