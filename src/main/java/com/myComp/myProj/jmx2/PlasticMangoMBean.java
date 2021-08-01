package com.myComp.myProj.jmx2;
public interface PlasticMangoMBean {
 String objectName = "com.myComp.myProj.jmx:type=PlasticMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
