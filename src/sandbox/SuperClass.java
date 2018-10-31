package sandbox;

// I am not nice. I am above this superclass declaration

class SuperClass {
  SuperClass(int x) {
    System.out.println("Super");
  }
}
class SubClass extends SuperClass {
  SubClass() {
    super(10);
    System.out.println("Sub 2");
  }
}
