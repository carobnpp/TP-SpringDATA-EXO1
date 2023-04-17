package com.bnpparibas.epita.exposition;

import com.bnpparibas.epita.application.ITaskService;
import com.bnpparibas.epita.domaine.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {

    @Autowired
    ITaskService service;

    @GetMapping("/{id}")
    public Task findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Task> findByAll(){
        return service.findAll();
    }

    @PostMapping()
    void createTask(@RequestBody Task t) {
        service.create(t);
    }

    @PutMapping()
    void UpdateTask(@RequestBody Task t) {
        service.update(t);
    }

    @PostMapping("/del/{id}")
    void deleteById (@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
