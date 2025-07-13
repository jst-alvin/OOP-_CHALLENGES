import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class ArrayChallenge3 {
    public static void main(String[] args){
        Random rand = new Random();
        String[] pallets = new String[10];
        for(int i = 0; i < pallets.length; i++){
            char prefix = (char)(rand.nextInt(5)+'A');
            int num = rand.nextInt(999) + 1;
            String suffix = String.format("%03d", num);

            pallets[i] = prefix + suffix;

        }
        System.out.println("Initial array.....");
        for(String item: pallets){
            System.out.println(item);
        }
        Arrays.sort(pallets);
        System.out.println("Sorted....");
        for(String sorted: pallets){
            System.out.println(sorted);

        }

        //Reverse
        System.out.println("Reversed....");
        List<String> reversed = Arrays.asList(pallets);
        Collections.reverse(reversed);
        for(String item: reversed){
            System.out.println(item);
        }





    }
}
