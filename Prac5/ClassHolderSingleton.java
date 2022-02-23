package Prac5;

//+ : lazy initialization, thread-safe, high performance in multithreading
public class ClassHolderSingleton {
        private String info;

        public String getInfo() {
            return info;
        }
        public void setInfo(String info) {
            this.info = info;
        }

        private ClassHolderSingleton() {
            info = "Class Holder Singleton";
        }

        private static class SingletonHolder {
            public static final ClassHolderSingleton HOLDER_INSTANCE = new ClassHolderSingleton();
        }

        public static ClassHolderSingleton getInstance() {
            return SingletonHolder.HOLDER_INSTANCE;
        }
}
