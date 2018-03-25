package com.markos.liquibase.sqlfile.repository;

import com.markos.liquibase.sqlfile.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
