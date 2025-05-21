public class innerclasses {
    // Outer class - The main class that contains all inner classes
    private int outerField = 10;  // A private field to demonstrate scope access
    
    // 1. Regular Inner Class
    // - Has access to all members of outer class (even private)
    // - Must have an instance of outer class to be instantiated
    class RegularInner {
        void display() {
            System.out.println("Outer field value: " + outerField); // Can access outer class members directly
        }
    }

    // 2. Static Inner Class
    // - Does not need an instance of outer class to be instantiated
    // - Cannot access non-static members of outer class
    // - More memory efficient as it doesn't hold reference to outer class
    static class StaticInner {
        void display() {
            // Cannot access outerField because it's non-static
            System.out.println("This is a static inner class");
        }
    }

    // Method containing a Local Inner Class
    public void methodWithLocalInner() {
        // 3. Local Inner Class
        // - Defined inside a method
        // - Can only be instantiated and used within this method
        // - Can access final or effectively final local variables of the method
        class LocalInner {
            void display() {
                System.out.println("This is a local inner class");
            }
        }
        LocalInner local = new LocalInner(); // Instance must be created within the method
        local.display();
    }

    public static void main(String[] args) {
        // Creating instance of outer class
        innerclasses outer = new innerclasses();

        // Creating instance of regular inner class
        // Note the special syntax: outer.new RegularInner()
        RegularInner inner = outer.new RegularInner();
        inner.display();

        // Creating instance of static inner class
        // No need for outer class instance
        StaticInner staticInner = new StaticInner();
        staticInner.display();

        // Using local inner class through method
        outer.methodWithLocalInner();

        // 4. Anonymous Inner Class
        // - Class definition and instantiation in one step
        // - Commonly used for implementing interfaces or extending classes on the fly
        // - No name, one-time use
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class");
            }
        };
        runnable.run();
    }
}
