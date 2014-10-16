package parking;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Exorcist
 */
public class CarTest {
    
    public CarTest() {
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCarEmptyModel() {
        new Car( "", "к013хм177" );
    }
    @Test (expected = IllegalArgumentException.class)
    public void testCarEmptyPlate() {
        new Car( "Ford Fusion", "" );
    }
    @Test (expected = IllegalArgumentException.class)
    public void testCarEmptyModelAndPlate() {
        new Car( "Ford Fusion", "" );
    }
    @Test (expected = IllegalArgumentException.class)
    public void testCarNullModel() {
        new Car( null, "к013хм177" );
    }
    @Test (expected = IllegalArgumentException.class)
    public void testCarNullPlate() {
        new Car( "Ford Fusion", null );
    }
    
}
