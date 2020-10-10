package com.jie.usertask.mapper;
import com.jie.usertask.entities.Task;
import com.jie.usertask.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface TaskMapper {

 public void InsertTask(Task task);
 public Collection<Task> getAll();
 public Task getByTaskId (Integer taskId);
 public void delete(Integer taskId);
 public Collection<Task> getById(Integer id);

}
