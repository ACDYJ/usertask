package com.jie.usertask.service;

import com.jie.usertask.entities.Task;
import com.jie.usertask.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskDao {

    @Autowired(required = false)
    TaskMapper taskMapper;
    public void save(Task task)
    {
        taskMapper.InsertTask(task);
    }
    public Collection<Task> getAll()
    {
        return taskMapper.getAll();
    }
    public Task getByTaskId (Integer taskId)
    {
        return taskMapper.getByTaskId(taskId);
    }
    public Collection<Task> getById(Integer id)
    {
        return taskMapper.getById(id);
    }
    public void delete(Integer taskId)
    {
        taskMapper.delete(taskId);
    }
}
