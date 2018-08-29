package com.questionmarks.questionApp.controller;

import com.questionmarks.questionApp.dto.ExamCreationDTO;
import com.questionmarks.questionApp.dto.ExamUpdateDTO;
import com.questionmarks.questionApp.model.Exam;
import com.questionmarks.questionApp.repository.ExamRepository;
import com.questionmarks.questionApp.util.DTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamRestController {

    private ExamRepository examRepository;

    public ExamRestController(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @GetMapping
    public List<Exam> getExams() {
        return examRepository.findAll();
    }

    @PostMapping
    public void newExam(@DTO(ExamCreationDTO.class) Exam exam) {
        examRepository.save(exam);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void editExam(@DTO(ExamUpdateDTO.class) Exam exam) {
        examRepository.save(exam);
    }
}
