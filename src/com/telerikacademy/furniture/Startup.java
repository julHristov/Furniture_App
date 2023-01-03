package com.telerikacademy.furniture;

import com.telerikacademy.furniture.core.FurnitureEngineImpl;

public class Startup {

    public static void main(String[] args) {
        FurnitureEngineImpl engine = new FurnitureEngineImpl();
        engine.start();
    }

}