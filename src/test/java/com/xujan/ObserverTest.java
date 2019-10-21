package com.xujan;


import com.xujan.pattern.observer.Cat;
import com.xujan.pattern.observer.Mouse;
import com.xujan.pattern.observer.People;
import org.junit.Test;

public class ObserverTest {


    @Test
    public void test() {
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        People people = new People();
        cat.addObserver(mouse);
        cat.addObserver(people);
        cat.catCry();
    }

}
