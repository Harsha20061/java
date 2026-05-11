class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class UserDefinedException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age is not valid ");
        }
        else{
            System.out.println("you are eligible ");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(22);
        } catch (InvalidAgeException e) {
            System.out.println("exception "+e.getMessage());
        }
    }
    
}
