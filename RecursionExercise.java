public class RecursionExercise {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args){
        System.out.println("The sum is:");
        System.out.println(sum(5));
    }
}
