package com.hanung.postgresdemo.repository;

import com.hanung.postgresdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
