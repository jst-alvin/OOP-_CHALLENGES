public class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
    public static void main(String[] args){
        try{
            throw new CustomException("This is a custom exception");
        }
        catch(CustomException ce){
            System.out.println(ce.getMessage());
        }

    }

}
