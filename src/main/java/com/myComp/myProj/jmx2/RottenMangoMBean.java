package com.myComp.myProj.jmx2;
public interface RottenMangoMBean {
 String objectName = "com.myComp.myProj.jmx:type=RottenMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
