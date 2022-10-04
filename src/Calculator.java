public class Calculator {
    public int  plus ( int a, int b){
        return a+b;
    }
    public int minus (int a, int b){
        return a-b;
    }
    public int ymn (int a, int b){
        return a*b;
    }
    public int delenie (int a, int b){
        if (b != 0){
            return a/b;
        }
        else {
            System.out.println("На ноль делить нельзя!!!");
            return 0;
        }

    }
    public int perimetr (int a, int b){
        return a+b+a+b;
    }

}