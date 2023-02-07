package com.Harish.program.Springapp.repository;

import com.Harish.program.Springapp.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense,String> {
@Query("{'name':?0}")
    Optional<Expense> findBYName(String name);
}
