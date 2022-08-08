package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String say(int s) {
        if(s%3 == 0) {
            return "Fizz";
        }
        return String.valueOf(s);
    }

    public List range(int start, int end){
        List<String> result = new ArrayList();
        for(int i=start; i<=end; i++) {
            result.add(say(i));
        }
        return result;
    }
}
