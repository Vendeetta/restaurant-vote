package ru.test.gerasimov.restaurantvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.test.gerasimov.restaurantvote.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
