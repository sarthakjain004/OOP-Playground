public class exceptionHandling {
    public static void main(String[] args) {
        // 1. Basic try-catch
        System.out.println("1. Basic try-catch example:");
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        System.out.println("\n2. Multiple catch blocks example:");
        try {
            int[] arr = new int[5];
            arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
            int result = 10 / 0;  // This will throw ArithmeticException (but won't be reached)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }

        // 3. try-catch-finally
        System.out.println("\n3. try-catch-finally example:");
        try {
            String str = null;
            str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }

        // 4. Nested try-catch
        System.out.println("\n4. Nested try-catch example:");
        try {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: " + e.getMessage());
                throw new RuntimeException("Rethrowing exception");
            }
        } catch (RuntimeException e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }

        // 5. Custom Exception
        System.out.println("\n5. Custom Exception example:");
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }

        // 6. try-with-resources (AutoCloseable)
        System.out.println("\n6. try-with-resources example:");
        try (CustomResource resource = new CustomResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Exception in resource: " + e.getMessage());
        }
    }

    // Custom Exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method that throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
    }

    // Custom AutoCloseable resource
    static class CustomResource implements AutoCloseable {
        public CustomResource() {
            System.out.println("Resource created");
        }

        public void doSomething() {
            System.out.println("Resource is being used");
        }

        @Override
        public void close() {
            System.out.println("Resource closed automatically");
        }
    }
}