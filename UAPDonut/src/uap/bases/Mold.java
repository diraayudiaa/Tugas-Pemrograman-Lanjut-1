package uap.bases;

import uap.interfaces.Calculable;

public abstract class Mold implements Calculable {
    protected static final double PI = 22.0 / 7;
    protected static final double THICKNESS_CM = 0.5;
    protected static final double DENSITY = 8; // gr/cm³ for stainless steel 304

    protected double volume;
    protected double surfaceArea;
    protected double mass;
}
