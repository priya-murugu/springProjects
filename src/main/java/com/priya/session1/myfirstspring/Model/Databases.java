package com.priya.session1.myfirstspring.Model;

import lombok.Data;

import java.util.List;

@Data
public class Databases {
    List<String> dbs;

    private void init() {

        System.out.println("initializing bean");
    }

    private void destroy()
    {
        System.out.println("destroying");
    }
}
