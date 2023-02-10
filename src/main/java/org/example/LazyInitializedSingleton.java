package main.java.com.basic.practice;

    public class LazyInitializedSingleton {


        private static LazyInitializedSingleton instance;

        private LazyInitializedSingleton() {
        }

        public static  LazyInitializedSingleton getInstance() {
            if (instance == null) {
                instance = new LazyInitializedSingleton();
            }
            return instance;
        }

        public static void main(String[] args) {
            LazyInitializedSingleton lts1 = LazyInitializedSingleton.getInstance().;
            LazyInitializedSingleton lts2 = LazyInitializedSingleton.getInstance();
            System.out.println(lts1);
            System.out.println(lts2);

        }
    }

