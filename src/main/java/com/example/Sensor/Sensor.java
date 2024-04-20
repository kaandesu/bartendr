package com.example.Sensor;

import java.util.UUID;

import com.example.System.Element;

public abstract class Sensor extends Element {
  String name;

  double cost;
  double input;
  double output;

  double precision;

  double phase;
  double gain;

  public Sensor(String name, double cost, double precision, double phase, double gain) {
    super(name);
    this.cost = cost;
    this.precision = precision;
    this.phase = phase;
    this.gain = gain;
  }

  public void setInput(double input) {
    this.input = input;
  }

  public void setOutput(double output) {
    this.output = output;
  }

}
