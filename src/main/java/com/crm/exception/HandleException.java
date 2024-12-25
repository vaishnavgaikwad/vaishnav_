package com.crm.exception;

import com.crm.payload.ErrorDetails;
import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

//catch block
@ControllerAdvice
public class HandleException {

    //handle exception for Employee not found
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails>handleEmployeeNotFound(ResourceNotFound e,WebRequest request){
        ErrorDetails errorDetails=new ErrorDetails(new Date(),e.getMessage(), request.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails>globalException(Exception e,WebRequest request){
        ErrorDetails errorDetails=new ErrorDetails(new Date(),e.getMessage(), request.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
//@ControllerAdvice
//public class HandlerException{
//
//     @ExceptionHandler(ResourceNotFound.class)
//    public ResponseEntity<ErrorDetails>handlerException(ResourceNotFound e,WebRequest request){
//         ErrorDetails Errordetail=new ErrorDetails(new Date(), e.getMessage(), request.getDescription(false));
//         return new ResponseEntity<>(Errordetail,HttpStatus.INTERNAL_SERVER_ERROR);
//     }
//
//     @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorDetails>globalExceptio(Exception e,WebRequest request){
//         ErrorDetails errorDetails =new ErrorDetails(new Date(),e.getMessage(),request.getDescription(false));
//         return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
//     }
//
//
//
//}




