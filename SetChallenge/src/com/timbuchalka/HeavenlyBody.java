package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public enum BodyType {
        STAR,
        PLANET,
        MOON
    }


    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        if(this.bodyType == BodyType.PLANET && satellite.getBodyType() != BodyType.MOON){
            return false;
        }
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        //System.out.println("obj.getClass() is " + obj.getClass());
        //System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }

    /* //One Level Deep
    @Override
    public String toString() {
        String out = "";
        out = out.concat(this.name);
        for (HeavenlyBody satellite : satellites) {
            out = out.concat("\n\t" + satellite.getName());
        }
        return out;
    }

     */

   @Override
    public String toString() {
        return toString("\t");
    }

    public String toString(String tab){
        String out = this.name;
        if(this.satellites.isEmpty()){
            return out;
        }
        else{
            for(HeavenlyBody satellite : this.satellites){
                out = out.concat("\n"+ tab + satellite.toString(tab + "\t"));
            }
            return out;
        }
    }

}
