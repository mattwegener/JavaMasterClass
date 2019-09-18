package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone mattPhone;
        mattPhone = new DeskPhone(12346531);
        mattPhone.powerOn();
        mattPhone.callPhone(12346531);
        mattPhone.answer();

        mattPhone = new MobilePhone(123456);
        mattPhone.powerOn();
        mattPhone.callPhone(123456);
        mattPhone.answer();

    }
}
