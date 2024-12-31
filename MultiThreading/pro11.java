class Mythread extends Thread {
    boolean value = true;

    public void run() {
        long counter = 0;
        while (value) { 
            counter++;
        }
        System.out.println(Thread.currentThread().getName() + " executed= " + counter);
    }
}

class pro11 {
    public static void main(String[] args) {

        Mythread obj1 = new Mythread();
        Mythread obj2 = new Mythread();

        Thread t1 = new Thread(obj1, "ONE");
        Thread t2 = new Thread(obj2, "TWO");

        System.out.println("currentPriority() is " + t1.getPriority()); // This is Thread.NORM_PRIORITY
        System.out.println("currentPriority() is " + t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            Thread.sleep(1500); // Sleep for 1.5 seconds (changed)
        } catch (InterruptedException ie) {
            System.out.println("caught " + ie);
        }

        obj1.value = false; // Changed: Set value to false to terminate threads**
        obj2.value = false; // Changed: Set value to false to terminate threads**

        System.out.println("main () ends");
    }
}
