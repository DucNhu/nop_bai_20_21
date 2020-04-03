package javabai20.excaption;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exitmain()");
    }
    public static void methodA() {
        System.out.println("Enter Method A");
        methodB();
        System.out.println("Exit method A");
    }
    public static void methodB() {
        System.out.println("Enter Method B");
        methodC();
        System.out.println("Exit method B");
    }
    public static void methodC() {
        System.out.println("Enter Method C");
        System.out.println("Exit method C");
    }
}// Nghĩ nó chán, tự dưng có người yêu để nghịch
