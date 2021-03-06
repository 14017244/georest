package fr.istic.m2gla.DTO;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arno on 09/03/15.
 */

public class GeoJsonDTO implements Serializable {

    private String type;
    private List<List<List<Double>>> coordinates = new ArrayList<List<List<Double>>>();

    public GeoJsonDTO() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<List<Double>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }
}


