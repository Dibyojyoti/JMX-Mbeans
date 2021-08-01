package com.myComp.myProj.jmx3;
public interface RottenMangoMBean {
 String objectName =
"com.myComp.myProj.jmx:type=Mango,scope="Edible",name=RottenMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
