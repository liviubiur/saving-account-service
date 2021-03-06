package com.liviubiur.savingaccountservice.account.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class WeekDaysException extends RuntimeException {

  public WeekDaysException() {
    super("Please return Monday to open your account.");
  }

}
