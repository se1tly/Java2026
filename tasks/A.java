class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

     static void main() {
        A.printVars();
        printVars();
    }
}

