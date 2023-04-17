package com.bnpparibas.epita.infrastructure;

import com.bnpparibas.epita.domaine.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskDao extends JpaRepository<Task, Long> {
}
