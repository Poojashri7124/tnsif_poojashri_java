package NonAccessModifier;

class Parent {
    // final variable (constant)
    final int MAX_VALUE = 100;

    // final method (cannot be overridden)
    final void showMessage() {
        System.out.println("This is a final method from Parent class.");
    }
}

class Child extends Parent {
    // Trying to override a final method will cause an error:
    // void showMessage() { System.out.println("Overridden"); }  ❌

    void display() {
        // MAX_VALUE = 200; // ❌ Not allowed: cannot assign a value to final variable
        System.out.println("Final variable MAX_VALUE: " + MAX_VALUE);
    }
}

// final class cannot be inherited
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

// class AnotherClass extends FinalClass { } ❌ Not allowed

public class Final {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.showMessage();

        FinalClass f = new FinalClass();
        f.show();
    }
}
