package org.example;

public class Deadlock {

    public class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public  void bow(Friend bower) {
            synchronized (lock1){
            System.out.format("%s:%s"+"has bowed to me%n", this.name, bower.getName());
            bower.bowBack(this);}
        }
        public   void bowBack(Friend bower) {
            synchronized (lock2) {
                System.out.format("%s:%s" + "has bowedback to me%n", this.name, bower.getName());
            }
        }

    }
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args){
        final Deadlock deadlock = new Deadlock();
        final Friend Alfonso = deadlock.new Friend("Alfonso");
        final Friend Gastone = deadlock.new Friend("Gastone");
        new Thread(new Runnable() {
            public void run() {Alfonso.bow(Gastone);  }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                Gastone.bow(Alfonso);}
        }).start();
    }
}
