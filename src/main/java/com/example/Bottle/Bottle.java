package com.example.Bottle;

import com.example.Fluid.Fluid;
import com.example.System.Element;

public class Bottle extends Element {
  String name;

  double height;
  double diameter;
  double neckDiameter;
  double shapeFactor;

  private Fluid fluidContent;

  public Bottle(String name, double height, double diameter, double neckDiameter, double shapeFactor) {
    super(name);
    this.height = height;
    this.diameter = diameter;
    this.neckDiameter = neckDiameter;
    this.shapeFactor = shapeFactor;
  }

  public void setFluid(Fluid fluid) {
    this.fluidContent = fluid;
  }

  public Fluid getFluid() {
    return this.fluidContent;
  }

}
