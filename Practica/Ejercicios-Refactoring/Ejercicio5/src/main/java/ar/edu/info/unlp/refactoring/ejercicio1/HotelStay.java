package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double quote;  /* variable ahora privada, luego en el punto 2 cambia de cost a quote */
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
        super(timePeriod);
        this.quote = cost;  /* cambia por nuevo nombre de variable o quizas podria usar el getter */
        this.hotel = hotel;
    }


    public double priceFactor() {
        return this.quote / this.price();  /* o podria usar el getter */
    }

    /* agrego el getTimePeriod por uso de pull up field */

    public double price() {
        return this.getTimePeriod().duration() * this.hotel.nightPrice() * this.hotel.discountRate();
    }

    /* nuevo metodo getter necesario por metodo encapsulate field */

    public double getCost(){
        return this.quote;  /* cambia nombre por rename field */
    }
}
