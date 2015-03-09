package fr.istic.m2gla.georestservice;

import org.json.JSONObject;

import java.io.Serializable;
import java.io.SerializablePermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arno on 09/03/15.
 */
public class GeoJsonDTO implements Serializable {

    private String type;
    private List<List<Position>> coordinates = new ArrayList<List<Position>>();

    public GeoJsonDTO(String type, List<List<Position>> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<Position>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<Position>> coordinates) {
        this.coordinates = coordinates;
    }
}


