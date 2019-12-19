package com.example.demo.aspects;

import com.example.demo.beans.Knight;
import org.springframework.beans.factory.annotation.Required;

public class Minstrel {

    public void singBeforeQuest(){
        System.out.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest(){
        System.out.println("Tee hee hee, the knight did embark on a quest!");
    }

}
