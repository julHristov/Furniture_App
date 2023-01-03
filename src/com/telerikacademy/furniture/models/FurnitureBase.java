package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.contracts.Furniture;
import com.telerikacademy.furniture.models.enums.MaterialType;

import static com.telerikacademy.furniture.utils.ValidationHelpers.*;

public abstract class FurnitureBase implements Furniture {

    private static final int MODEL_CODE_MIN_LENGTH = 3;
    private String modelCode;
    private double price;
    private double height;
    private final MaterialType materialType;

    public FurnitureBase(String modelCode, double price, double height, MaterialType materialType1) {
        setModelCode(modelCode);
        setPrice(price);
        setHeight(height);
        this.materialType = materialType1;
    }

    private void setModelCode(String modelCode) {
        validateStringMinLength(modelCode, MODEL_CODE_MIN_LENGTH);
        this.modelCode = modelCode;
    }

    private void setPrice(double price){
        validateGraterThanZero(price);
        this.price = price;
    }

    private void setHeight(double height){
        validateGraterThanZero(height);
        this.height = height;
    }

    @Override
    public String getModelCode() {
        return modelCode;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public MaterialType getMaterialType() {
        return materialType;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s, Model Code: %s, Material: %s, Price: %.2f, Height: %.2f",
                getFurnitureType(),
                modelCode,
                materialType,
                price,
                height,
                getAdditionalInfo()
        );
    }

    protected abstract String getFurnitureType();
    protected abstract String getAdditionalInfo();
}
