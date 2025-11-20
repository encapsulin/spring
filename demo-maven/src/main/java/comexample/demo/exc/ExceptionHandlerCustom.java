package comexample.demo.exc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerCustom {
    @ExceptionHandler(Exc400.class)
    public ResponseEntity<String> handle400(Exc400 exc){
        log(exc);
        return new ResponseEntity<>(exc.getMessage(), exc.status);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException exc){
        log(exc);
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exc){
        log(exc);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exc.getMessage());
    }

    private static void log(Exception exc){
        log.error("Exception: ", exc);
    }
}

