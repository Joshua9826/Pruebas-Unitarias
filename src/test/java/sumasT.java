/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Sumas.Sumas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joshu
 */
public class sumasT {
    
    public sumasT() {
    }
    Sumas x= new Sumas();
    @Test
    public void testPrueba1(){
        assertEquals(5, x.sumas(2, 3));
    }
    @Test
    public void testPrueba2(){
        assertEquals(60, x.minhr(60, 1));
    }
    @Test
    public void testPrueba3(){
        assertEquals(3600, x.secmin(1, 3600));
    }
    
    
}
