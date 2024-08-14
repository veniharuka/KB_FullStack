package org.example.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice
@Slf4j

public class CommonExceptionAdvice {
    private String context = "/exception";

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle404(NoHandlerFoundException ex) {
        return context +"/404";
    }

    @ExceptionHandler(Exception.class)
    public String exception(Exception e, Model model){
        log.error(e.getMessage());
        e.printStackTrace();

        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("stcktrace", Arrays.asList(e.getStackTrace()));
        return context +"/error-page";
    }
}
