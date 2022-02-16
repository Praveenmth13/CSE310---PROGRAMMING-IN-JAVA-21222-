B.) Object a1 = new Object(); //statement 1
  Object a2 = new Object(); //statement 2
  a2 = a1;
  In the above code, the initial object referred by a2 in statement 2 will be available for GC after the statement a2 = a1; is executed.
