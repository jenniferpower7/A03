import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ColourTableTest {
    @Test
    public void testAddMethod(){
        ColourTable colourTable = new ColourTable(4);
        initialSize=colourTable.getSize();
        int [] rgbColourToAdd={255,0,0};
        colourTable.add(rgbColourToAdd);

        assertEquals(initialSize +1, colourTable.getSize());
        assertTrue(colourTable.contains(rgbColourToAdd));
    }
}
