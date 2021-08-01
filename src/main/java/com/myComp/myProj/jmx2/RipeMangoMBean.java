package com.myComp.myProj.jmx;
public interface RipeMangoMBean {
 String objectName = "com.myComp.myProj.jmx:type=RipeMango";
 boolean isEdible();
  int getAvailableCount();
 void clear();
}
