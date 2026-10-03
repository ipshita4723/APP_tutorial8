class DeliveryTask extends Thread {
    private String activity;

    public DeliveryTask(String name, int priority, String activity) {
        super(name);
        setPriority(priority);
        this.activity = activity;
    }

    public void run() {
        System.out.println("Thread Name: " + getName() + " | Priority: " + getPriority() + " | Activity: " + activity);
    }
}

public class Main2 {
    public static void main(String[] args) {
        DeliveryTask t1 = new DeliveryTask("OrderProcessing", 8, "Processing customer order");
        DeliveryTask t2 = new DeliveryTask("DeliveryTracking", 5, "Tracking delivery location");
        DeliveryTask t3 = new DeliveryTask("Notification", 2, "Sending order status update");

        t1.start();
        t2.start();
        t3.start();
    }
}
