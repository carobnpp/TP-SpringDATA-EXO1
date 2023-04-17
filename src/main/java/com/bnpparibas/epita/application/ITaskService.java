package com.bnpparibas.epita.application;

import com.bnpparibas.epita.domaine.Task;

import java.util.List;

public interface ITaskService {

    void create(Task t);

    void update(Task t);

    Task findById(Long id);

    List<Task> findAll();

    void deleteById(Long id);

}
