package ar.edu.info.unlp.refactoring.ejercicio1;

import java.sql.Time;
import java.time.LocalDate;

public abstract class Product {
    private TimePeriod timePeriod;

    public Product (TimePeriod timePeriod){
        this.timePeriod = timePeriod;
    }

    public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }

    public TimePeriod getTimePeriod(){
        return this.timePeriod;
    }

    public abstract double price();

}
