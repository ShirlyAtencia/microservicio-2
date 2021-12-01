package com.misiontic.p65.c4.g3.HotelReservaJava.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
@ResponseBody
public class NoReservaNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ReservaNotFoundException.class) // cuando se da el error entra aquí
    @ResponseStatus(HttpStatus.CONFLICT)
    String NoReservaNotFoundAdvice(NoReservaNotFoundException ex){
        return ex.getMessage();

    }
}
