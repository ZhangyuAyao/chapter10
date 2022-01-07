package final_;

public class FinalExercise02 {
    public static void main(String[] args) {

    }
}

class Something {
    public int addOne(final int x){
        //++x; 这里不允许
        return x + 1;
    }
}
