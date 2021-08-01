package com.myComp.myProj.jmx;
public class RottenMango implements RottenMangoMBean {
 int availableCount = 20;
 boolean edible = true; 
  public RottenMango() {}
 boolean isEdible() {return edible;}
 int getAvailableCount(){return availableCount;}
 void clear()´{availableCount = 0;}
  public getObjectName() { return objectName;}
}
