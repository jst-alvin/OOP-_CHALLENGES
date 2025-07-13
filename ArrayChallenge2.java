import java.util.Random;

public class ArrayChallenge2 {
    public static void main(String[] args){
        Random rand = new Random();
        String[] orderIds = new String[15];
        for(int i = 0; i < orderIds.length; i++){
            char prefix = (char)(rand.nextInt(5)+'A');
            int num = rand.nextInt(999) + 1;
            String suffix = String.format("%03d", num);

            orderIds[i] = prefix + suffix;

        }
        for(String item:orderIds){
            System.out.println(item);
        }
    }

}
