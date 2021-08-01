package com.myComp.myProj.jmx;
public interface PlasticMangoMBean {
 String objectName = "com.myComp.myProj.jmx:type=PlasticMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
