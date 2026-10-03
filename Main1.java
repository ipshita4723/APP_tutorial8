class HospitalTask extends Thread {
    public HospitalTask(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread Name: " + getName() + " | Priority: " + getPriority());
    }
}

public class Main1 {
    public static void main(String[] args) {
        HospitalTask t1 = new HospitalTask("EmergencyAlert", Thread.MAX_PRIORITY);
        HospitalTask t2 = new HospitalTask("VitalMonitor", Thread.NORM_PRIORITY);
        HospitalTask t3 = new HospitalTask("ReportGenerator", Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
