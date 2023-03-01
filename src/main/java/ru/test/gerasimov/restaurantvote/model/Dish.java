package ru.test.gerasimov.restaurantvote.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Entity
@Table(name = "dish", uniqueConstraints =
@UniqueConstraint(columnNames = {"restaurant_id", "add_date"}, name = "one_dish_in_rest_per_day"))
public class Dish extends AbstractPersistable<Integer> {

    @Column(name = "name", nullable = false)
    @NotNull
    @NotBlank
    @Size(min = 2, max = 1000)
    private String name;

    @Column(name = "price", nullable = false)
    @NotNull
    @Range(min = 1)
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "add_date", nullable = false)
    @NotNull
    private LocalDate addDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }
}
