package com.lastma.data.models;

import java.time.Year;

public class Vehicle {
    private String carBrand;
    private String plateNumber;
    private String carModel;
    private Year carYear;

    public Vehicle() {}

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Year getCarYear() {
        return carYear;
    }

    public void setCarYear(Year carYear) {
        this.carYear = carYear;
    }
}
