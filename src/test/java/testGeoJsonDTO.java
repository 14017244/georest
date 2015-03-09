
/**
 * Created by arno on 09/03/15.
 */
import com.sun.jersey.api.core.ResourceConfig;
import fr.istic.m2gla.georestservice.GeoJsonDTO;
import fr.istic.m2gla.georestservice.GeoPosition;
import fr.istic.m2gla.georestservice.Position;
//import org.glassfish.jersey.test.JerseyTest;
import org.junit.*;

import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testGeoJsonDTO {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() {


    }


    @Test
    public void testPosition()  {
        Position p1 = new Position(10.0,12.0);
        Position p2 = new Position(12.0,11.0);
        Position p3 = new Position(11.0,10.0);
        List<List<Position>> zones = new ArrayList<List<Position>>();
        List<Position> zone = new ArrayList<Position>();
        zone.add(p1);
        zone.add(p2);
        zone.add(p3);
        zones.add(zone);
        GeoJsonDTO geoJson = new GeoJsonDTO("Polygon",zones);

    }
}
