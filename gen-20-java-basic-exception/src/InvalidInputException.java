// menggunakan extends agar classnya dapat digunakan pada class lain
public class InvalidInputException extends  IllegalArgumentException{
    // Constructor yang mempunyai parameter berupa pesan kostum
    public InvalidInputException(String message){
        super(message);
    }
}
