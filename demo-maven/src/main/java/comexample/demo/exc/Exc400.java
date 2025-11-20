package comexample.demo.exc;

import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
public class Exc400 extends RuntimeException{
    final HttpStatus status;

    public Exc400(String msg, HttpStatus status) {
        super(msg);
        this.status = status;
    }
}
