package com.questionmarks.questionApp.repository;

import com.questionmarks.questionApp.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository  extends JpaRepository<Exam, Long> {
}
