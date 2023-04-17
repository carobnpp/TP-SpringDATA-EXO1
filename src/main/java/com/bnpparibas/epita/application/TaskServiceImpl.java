package com.bnpparibas.epita.application;

import com.bnpparibas.epita.domaine.Task;
import com.bnpparibas.epita.infrastructure.ITaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService{

    @Autowired
    ITaskDao dao;

    @Override
    public void create(Task t) {
        dao.save(t);
    }

    @Override
    public void update(Task t) {
        dao.save(t);
    }

    @Override
    public Task findById(Long id) {
        if (dao.findById(id).isPresent()){
            return dao.findById(id).get();
        }else{
            throw new EntityExistsException();
        }
    }

    @Override
    public List<Task> findAll() {
        return dao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
