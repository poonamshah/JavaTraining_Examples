
// Singleton Design Pattern
// Only one thread can access object at a time 
public final class LazySingleton {
    private static volatile LazySingleton instance = null;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
            	
                instance = new LazySingleton();
                if(instance instanceof LazySingleton) {
                	
                }
            }
        }
        return instance;
    }
    
    
    
    
    
}