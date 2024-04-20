package com.example.Sensor;

import java.util.UUID;

public class Sensor {
  UUID id;
  String name;

  double cost;
  double input;
  double output;

  double precision;

  double phase;
  double gain;

  public Sensor(String name, double cost, double precision, double phase, double gain) {
    this.name = name;
    this.cost = cost;
    this.precision = precision;
    this.phase = phase;
    this.gain = gain;

    this.id = UUID.randomUUID();
    System.out.println("my id is: " + id);
  }

  public void setInput(double input) {
    this.input = input;
  }

  public void setOutput(double output) {
    this.output = output;
  }

}
