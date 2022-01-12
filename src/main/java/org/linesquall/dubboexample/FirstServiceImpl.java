package org.linesquall.dubboexample;

public class FirstServiceImpl implements FirstService {

    @Override
    public String say(String str) {
        System.out.println(str);
        return str;
    }

}
