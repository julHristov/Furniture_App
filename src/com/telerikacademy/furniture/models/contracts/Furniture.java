package com.telerikacademy.furniture.models.contracts;

import com.telerikacademy.furniture.models.enums.MaterialType;

public interface Furniture {
    String getModelCode();
    double getPrice();
    double getHeight();
    MaterialType getMaterialType();
}
