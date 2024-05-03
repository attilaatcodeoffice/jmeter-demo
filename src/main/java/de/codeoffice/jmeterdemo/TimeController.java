package de.codeoffice.jmeterdemo;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TimeController {

    @GetMapping("/time")
    public String getActualTime() {
        log.debug("getTime");
        return LocalDateTime.now().toString();
    }
    @GetMapping("/factorial")
    public String getFactorial() {
        log.debug("getFactorial");
        int number = (int) (Math.random() * 200);
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return String.format("Die Faktorielle von %d ist: %d. Der aktuelle Zeitpunkt ist: %s", number, factorial, LocalDateTime.now().toString());
    }    
}
