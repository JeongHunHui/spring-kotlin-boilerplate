package com.hunhui.boilerplate.error

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@RestControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {
    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ResponseEntity<ErrorResponse.Body> {
        logger.error(e.message, e)
        return ErrorResponse(
            errorCode = GlobalErrorCode.INTERNAL_SERVER_ERROR,
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR,
        )
    }

    @ExceptionHandler(BusinessException::class)
    fun handleRuntimeException(e: BusinessException): ResponseEntity<ErrorResponse.Body> {
        logger.warn(e)
        return ErrorResponse(
            errorCode = e.errorCode,
            httpStatus = HttpStatus.BAD_REQUEST,
        )
    }
}