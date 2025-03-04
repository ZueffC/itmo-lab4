package itmo.lab4.exceptions;

public class ShipDestroyedException extends Exception {
    @Override
    public String getMessage() {
        return "Корабль был уничтожен!";
    }
    
    public ShipDestroyedException(String message) {
        super(message);
    }
}