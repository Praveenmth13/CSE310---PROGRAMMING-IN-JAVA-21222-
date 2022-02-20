Read the code below:
void waitForSignal() throws InterruptedException {
    Object obj = new Object();
    synchronized (Thread.currentThread()) {
        obj.wait();
        obj.notify();
     }
}
Which statement is true?
  => ANSSWER
  B.) The code throws IllegalMonitorStateException.
