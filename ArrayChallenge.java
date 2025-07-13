public class ArrayChallenge {

    public static void main(String[] args){
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "A98", "B54", "C137", "B99", "A04", "C77"};
        for(String item : orderIds){
            if(item.startsWith("B")){

                System.out.println(item);
            } else if (item.startsWith("A")) {
                System.out.println("Starts with A");
                System.out.println(item);

            } else if (item.startsWith("C")) {
                System.out.println("Starts with C");
                System.out.println(item);

            }
        }

    }
}
