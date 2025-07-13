public class WhileLoopExercise {

    // Demonstrates the use of a while loop in Java
    public void Count() {
        int count = 0;
        while (count <= 10) {
            System.out.println("The value of count is " + count);
            count++;
        }
    }
    public static void main(String[] args){
        WhileLoopExercise counter = new WhileLoopExercise();
        counter.Count();
    }
}
