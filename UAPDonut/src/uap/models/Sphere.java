package uap.models;

import uap.bases.Mold;

public class Sphere extends Mold {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        volume = (4.0 / 3.0) * PI * radius * radius * radius;
        return volume;
    }

    @Override
    public double getSurfaceArea() {
        surfaceArea = 4 * PI * radius * radius;
        return surfaceArea;
    }

    @Override
    public double getMass() {
        mass = surfaceArea * THICKNESS_CM * DENSITY;
        return mass;
    }

    @Override
    public int getMassKg() {
        return (int) Math.ceil(mass / 1000.0);
    }

    @Override
    public int getShippingCost() {
        return getMassKg() * 5000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f%n", getMass());
        System.out.printf("Massa dalam kg  : %d%n", getMassKg());
        System.out.printf("Biaya kirim     : Rp%d%n", getShippingCost());
    }
}

