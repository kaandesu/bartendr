package com.example.Fluid;

import com.example.System.Element;
import com.example.Utils.Constants;

public abstract class Fluid extends Element {
  String name;

  double viscosity;
  double density;
  double liquidAirSurfaceTension;

  // Constants.gravitationalAcceleration;

  public Fluid(String name, double viscosity, double density, double liquidAirSurfaceTension) {
    super(name);
    this.viscosity = viscosity;
    this.density = density;
    this.liquidAirSurfaceTension = liquidAirSurfaceTension;
  }

}
