
package cs145;
import org.junit.Test;

import cs145.Rectangle;

import static org.junit.Assert.*;
public class RectangleTest {

    //Clockwise points
    @Test public void setCWTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        assertTrue(r.set(10.0,8.0,10.0,1.0,1.0,1.0,1.0,8.0));
    } 
    
    //Counterclockwise points
    @Test public void setCCWTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,1,10,8,1,8,1,1));
    } 

    @Test public void areaTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        double allowedDelta= 0.001;
        assertEquals(63.0, r.getArea(),allowedDelta);
    } 

    @Test public void lengthTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        double allowedDelta= 0.001;
        assertEquals(9.0, r.getLength(),allowedDelta);
    } 

    @Test public void widthTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        double allowedDelta= 0.001;
        assertEquals(7.0, r.getWidth(),allowedDelta);
    } 

    @Test public void perimeterTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        double allowedDelta= 0.001;
        assertEquals(32.0, r.getPerimeter(),allowedDelta);
    } 

    @Test public void squareTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,3,1,3,8));
        assertTrue(r.isSquare());
    } 

    @Test public void squareNegativeTest() {
        Rectangle r = new Rectangle();
        assertTrue(r.set(10,8,10,1,1,1,1,8));
        assertFalse(r.isSquare());
    } 

    @Test public void yRangeViolations() {
        Rectangle r = new Rectangle();
        double lo=-0.01;
        double hi=20.01;
        assertFalse(r.set(10,hi,10,1, 1,1, 1,8));
        assertFalse(r.set(10,lo,10,1, 1,1, 1,8));
        assertFalse(r.set(10,8, 10,hi,1,1, 1,8));
        assertFalse(r.set(10,8, 10,lo,1,1, 1,8));
        assertFalse(r.set(10,8, 10,1, 1,hi,1,8));
        assertFalse(r.set(10,8, 10,1, 1,lo,1,8));
        assertFalse(r.set(10,8, 10,1, 1,1, 1,hi));
        assertFalse(r.set(10,8, 10,1, 1,1, 1,lo));
    }

    @Test public void xRangeViolations() {
        Rectangle r = new Rectangle();
        double lo=-0.01;
        double hi=20.01;
        assertFalse(r.set(hi,8, 10,1, 1,1, 1,8));
        assertFalse(r.set(lo,8, 10,1, 1,1, 1,8));
        assertFalse(r.set(10,8, hi,1, 1,1, 1,8));
        assertFalse(r.set(10,8, lo,1, 1,1, 1,8));
        assertFalse(r.set(10,8, 10,1,hi,1, 1,8));
        assertFalse(r.set(10,8, 10,1,lo,1, 1,8));
        assertFalse(r.set(10,8, 10,1, 1,1,hi,8));
        assertFalse(r.set(10,8, 10,1, 1,1,lo,8));
    }

    @Test public void nonRectangularInput() {
        Rectangle r = new Rectangle();
        assertFalse(r.set(10,8,10,1,1,1,1,7));
        assertFalse(r.set(10,8,10,1,1,1,2,8));
        assertFalse(r.set(10,8,10,1,1,2,1,8));
        assertFalse(r.set(10,8,10,1,2,1,1,8));
        assertFalse(r.set(10,8,10,2,1,1,1,8));
        assertFalse(r.set(10,8,11,1,1,1,1,8));
        assertFalse(r.set(10,9,10,1,1,1,1,8));
        assertFalse(r.set(11,8,10,1,1,1,1,8));
    }
}
