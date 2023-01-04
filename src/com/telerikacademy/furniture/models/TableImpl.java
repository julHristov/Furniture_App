package com.telerikacademy.furniture.models;

import com.telerikacademy.furniture.models.contracts.Table;
import com.telerikacademy.furniture.models.enums.MaterialType;
import com.telerikacademy.furniture.utils.ValidationHelpers;

import static com.telerikacademy.furniture.utils.ValidationHelpers.*;
import static java.lang.String.*;

public class TableImpl extends FurnitureBase implements Table {
    private double length;
    private double width;

    public TableImpl(String modelCode, double price, double height, MaterialType materialType1,
                     double length, double width) {
        super(modelCode, price, height, materialType1);
        setLength(length);
        setWidth(width);
    }

    private void setLength(double length) {
        validateGraterThanZero(length);
        this.length = length;
    }

    private void setWidth(double width) {
        validateGraterThanZero(width);
        this.width = width;
    }

    @Override
    protected String getFurnitureType() {
        return "Table";
    }

    @Override
    protected String getAdditionalInfo() {
        return format(", Length: %.2f, Width: %.2f, Area: %.2f",
                length,
                width,
                getArea());
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
