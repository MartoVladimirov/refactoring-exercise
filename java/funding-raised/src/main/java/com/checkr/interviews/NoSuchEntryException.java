package com.checkr.interviews;

public class NoSuchEntryException extends Exception{
private String msg;
public NoSuchEntryException(String err) {
    this.msg = err;
}
public String getMsg(){
    return msg;
}

}
