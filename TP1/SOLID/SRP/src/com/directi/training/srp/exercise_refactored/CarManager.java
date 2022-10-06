package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private CarDB _CarDB;
    private CarFormatter _CarFormatter;
    private CarBest _CarBest;


    public Car getByID(final String carId)
    {
        return (_CarDB.getFromDb(carId));
    }
    
    public String getCarsNames(){
        return (_CarFormatter.getCarsNames(_CarDB.getAll()));
    }

    public Car getBestCar(){
        return (_CarBest.getBestCar(_CarDB.getAll()));
    }


}
