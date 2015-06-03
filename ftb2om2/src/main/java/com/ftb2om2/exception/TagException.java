/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.exception;

public class TagException extends Exception {

    public TagException() {
    }

    public TagException(String string) {
        super(string);
    }

    public TagException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TagException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
}
