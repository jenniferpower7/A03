import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ColourTableTest {
    //test that an rbg colour was actually added to colourTable by checking it contains it and the size has incrememnted
    @Test
    public void testAddMethod(){
        ColourTable colourTable = new ColourTable(4);
        initialSize=colourTable.getSize();
        int [] rgbColourToAdd={255,0,0};
        colourTable.add(rgbColourToAdd);

        assertEquals(initialSize +1, colourTable.getSize());
        assertTrue(colourTable.contains(rgbColourToAdd));
    }

    @Test
    //test that the constructor created a palette of the size of the parameter
    public void testConstructorMethod() {
        ColourTable colourTable=new ColourTable(4);
        assertEquals(colourTable.getSize(),4);
    }

    @Test
    public void testInvalidRGBExceeding(){
        //test whether an exception is thrown when an invalid RBG is attempted to be added to colourTable
        ColourTable colourTable=new ColourTable(4);
        int[] invalidRGBValue={0,0,256};
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{colourTable.add(invalidRGBValue)});
        //check correct exception message is thrown
        assertEquals("Invalid RGB value: " + invalidRGBValue[2], exception.getMessage());
    }
    @Test
    public void testInvalidRGBSubceeding(){
        //test whether an exception is thrown when an invalid RBG is attempted to be added to colourTable
        ColourTable colourTable=new ColourTable(4);
        int[] invalidRGBValue={-1,0,0};
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{colourTable.add(invalidRGBValue)});
        //check correct exception message is thrown
        assertEquals("Invalid RGB value: " + invalidRGBValue[0], exception.getMessage());
    }

    @Test
    public void testInvalidCapacityExceeding(){
        //test whether an exception is thrown when the  capacity of the palette is invalid as it is larger than 1025
        IllegalStateException exception = assertThrows(IllegalStateException.class,()->{colourTable=new ColourTable(1026)});

    }

}
