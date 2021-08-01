package com.myComp.myProj.jmx3;
public interface RipeMangoMBean {
 String objectName = 
"com.myComp.myProj.jmx:type=Mango,scope="Edible",name=RipeMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
