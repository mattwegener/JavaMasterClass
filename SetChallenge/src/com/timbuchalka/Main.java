package com.timbuchalka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> stars = new HashSet<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody sol = new HeavenlyBody("Sol", 0, HeavenlyBody.BodyType.STAR);
        solarSystem.put(sol.getName(),sol);
        stars.add(sol);


        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        temp = new HeavenlyBody("Venus", 225, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        temp = new HeavenlyBody("Earth", 365, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new HeavenlyBody("Mars", 687, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        tempMoon = new HeavenlyBody("Io", 1.8, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7, HeavenlyBody.BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        temp = new HeavenlyBody("Uranus", 30660, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        temp = new HeavenlyBody("Neptune", 165, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        temp = new HeavenlyBody("Pluto", 248, HeavenlyBody.BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        sol.addSatellite(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842, HeavenlyBody.BodyType.PLANET);
        planets.add(pluto);

        System.out.println("To string test");
        for(HeavenlyBody star : stars) {
            //System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
            System.out.println(star.toString());
        }

        //System.out.println(solarSystem.toString());






    }
}
