package com.myComp.myProj.jmx;
public class RipeMango implements RipeMangoMBean {
 int availableCount = 30;
 boolean edible = true; 
  public RipeMango() {}
 boolean isEdible() {return edible;}
 int getAvailableCount(){return availableCount;}
 void clear() {availableCount = 0;}
 public getObjectName() { return objectName;}
}
