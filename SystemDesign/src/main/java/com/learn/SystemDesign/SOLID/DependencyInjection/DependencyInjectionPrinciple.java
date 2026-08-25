package com.learn.SystemDesign.SOLID.DependencyInjection;

//high level components should not depend on low level components directly, instead, they should depend on abstraction
public class DependencyInjectionPrinciple {
    public static void main(String[] args) {
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();
        WifiKeyboard wifiKeyboard = new WifiKeyboard();
        WiredKeyboard wiredKeyboard = new WiredKeyboard();
        bluetoothKeyboard.getSpecifications();
        wiredKeyboard.getSpecifications();
        wifiKeyboard.getSpecifications();

    }
}
