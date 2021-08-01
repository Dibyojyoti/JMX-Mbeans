package com.myComp.myProj.jmx;
public interface RottenMangoMBean {
 String objectName = "com.myComp.myProj.jmx:type=Mango,name=RottenMango";
 boolean isEdible();
 int getAvailableCount();
 void clear();
}
