package com.example;

import com.example.Sensor.*;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Sensor s = new Sensor("sensor1", 12.1, 1.1, 2.1, 3.1);

    System.out.println("Hello World! " + s.getClass().getSimpleName());
  }
}
