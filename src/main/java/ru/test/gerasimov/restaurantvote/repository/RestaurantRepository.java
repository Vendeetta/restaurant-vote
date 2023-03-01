package ru.test.gerasimov.restaurantvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.test.gerasimov.restaurantvote.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
