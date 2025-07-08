package com.java.advanced.sealed;

//sealed keyword is allowed to be used in interface or class
//sealed interface is similar to normal interface but using permits allows only the Car class can use
// this sealed interface
public sealed interface SmartMediaPlayer permits Car{

    void connectPhone();
}
