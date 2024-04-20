package com.example.System;

import java.util.UUID;

public abstract class Element {
  private UUID id;
  String name;

  public Element(String name) {
    this.name = name;
    this.id = UUID.randomUUID();
  }

  public UUID getId() {
    return id;
  }

}
