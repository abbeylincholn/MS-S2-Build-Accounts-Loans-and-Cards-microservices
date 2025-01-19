package com.abbeymicrosvs.cards.repository;


import com.abbeymicrosvs.cards.entity.Cards;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CardsRepository extends JpaRepository<Cards, Long> {
    // this will take the entity classes and interact with the database table created

}
