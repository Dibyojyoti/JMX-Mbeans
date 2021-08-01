package com.myComp.myProj.jmx;
public class PlasticMango implements PlasticMangoMBean { 
 int availableCount = 10;
 boolean edible = false; 
  public PlasticMango() {}
 boolean isEdible() {return edible;}
 int getAvailableCount(){return availableCount;}
 void clear() {availableCount = 0;}
 public getObjectName() { return objectName;}
}
