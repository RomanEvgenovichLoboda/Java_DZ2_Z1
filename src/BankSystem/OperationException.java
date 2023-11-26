package BankSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class OperationException extends Exception {
    public OperationException(String message) {
        super(message);
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(LocalDateTime.now().toString() + " - " + message + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
