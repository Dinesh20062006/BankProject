package com.wipro.bank.exception;

public class BankValidationException extends Exception {
    String msg = "Invalid Data";
      public String toString() {
        return msg;
    }
}