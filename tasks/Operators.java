class Animal{}
class Cat extends Animal{}
class MaineCoon extends Cat {}

public class Operators {

    Cat cat = new Cat();

    public void main() {

        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof MaineCoon);

        int a = 10, b = 3;
        String s = "aaa";
        boolean flag = true;

        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a + b);
        System.out.println(s + " bbb");

        int i = 5;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);

        System.out.println(~a);
        System.out.println(!flag);

        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println((a & b));
        System.out.println((a ^ b));
        System.out.println((a | b));

        System.out.println(flag && !flag);
        System.out.println(flag || !flag);

        System.out.println(a > 5 ? "Yes" : "No");

        a += 2;
        a -= 2;
        a *= 2;
        a /= 2;
        a %= 2;
        System.out.println(a);

        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        System.out.println((2 + 3) * 4);
        
        int[] arr = {1, 2};
        System.out.println(arr[0]);
    }
}
