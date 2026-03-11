public class WrapperClasses {
    public static void main() {
        //Практика #1
        String dec1 = "100";
        String oct1 = "015";
        String hex1 = "0x10";

        System.out.println(Integer.decode(dec1));
        System.out.println(Integer.decode(oct1));
        System.out.println(Integer.decode(hex1));
        
        //Практика #2
        Boolean b11 = new Boolean(true); 
        Boolean b22 = Boolean.valueOf(true);
        Boolean b33 = true;

        //Практика #3
        //NullPointerException - только при автораспаковке
        // Integer val_c = null;
        // int val = val_c;

        //Практика #4
        // int i1 = 128;
        // Integer a1 = i1; 
        // Integer b1 = i1;
        // System.out.println("a1==i1 " + (a1 == i1)); a1==i1 true - java автоматически выполняет автораспаковку, сравнение по значению 
        // System.out.println("b1==i1 " + (b1 == i1)); b1==i1 true - тоже самое
        // System.out.println("a1==b1 " + (a1 == b1)); a1==b1 false - разные ссылки в куче
        // System.out.println("a1.equals(i1) -> " + a1.equals(i1)); a1.equals(i1) -> true - сравнение по значению
        // System.out.println("b1.equals(i1) -> " + b1.equals(i1)); b1.equals(i1) -> true
        // System.out.println("a1.equals(b1) -> " + a1.equals(b1)); a1.equals(b1) -> true

        // int i2 = 127;
        // Integer a2 = i2;
        // Integer b2 = i2;
        // System.out.println("a2==i2 " + (a2 == i2)); a2==i2 true
        // System.out.println("b2==i2 " + (b2 == i2)); b1.equals(i1) -> true
        // System.out.println("a2==b2 " + (a2 == b2)); a2==b2 true - число 127 попадает в диапазон кэша (от -128 до 127), при автоупаковке Java 
        //                                                           не создает новые объекты, а берет уже существующие экземпляры из внутреннего кэша                               
        //                                                           Переменные a2 и b2 ссылаются на один и тот же объект в памяти                       
        // System.out.println("a2.equals(i2) -> " + a2.equals(i2)); a2.equals(i2) -> true
        // System.out.println("b2.equals(i2) -> " + b2.equals(i2)); b2.equals(i2) -> true
        // System.out.println("a2.equals(b2) -> " + a2.equals(b2)); a2.equals(b2) -> true

        // IntegerCache — это внутренняя статическая структура данных внутри класса java.lang.Integer, которая хранит заранее созданные объекты-обертки для диапазона чисел от -128 до 127.
        // нужен для экономии памяти и производительности.
        // Маленькие целые числа используются в программах крайне часто. Если бы для каждого int i = 1 создавался новый объект Integer, 
        // память быстро бы переполнилась одинаковыми объектами со значением 1. 
        // Кэш позволяет использовать один объект для всех случаев использования числа 1
    
}
