public class Cycles {
    public static void main() {
        //Практика #1
        boolean i = true;
        int x = 0;
        //если бы не if с break циклы были бы бесконечными
        while(i){
            x++;
           if (x == 10){
            break;
           }
           if (x == 5){
            continue;
           }
           System.out.println(x);
        }

        do {
            x++;
            if (x == 10){
                break;
            }
        }while(i);
    }
    
}
