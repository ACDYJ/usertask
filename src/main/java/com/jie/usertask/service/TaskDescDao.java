package com.jie.usertask.service;

import com.jie.usertask.entities.TaskDesc;
import com.jie.usertask.mapper.TaskDescMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskDescDao {

    @Autowired(required = false)
    TaskDescMapper taskDescMapper;
    public void save(TaskDesc taskDesc)
    {
        taskDescMapper.InsertTask(taskDesc);
    }
    public Collection<TaskDesc> getAll()
    {
        return taskDescMapper.getAll();
    }
    public TaskDesc getByTaskId (Integer taskId)
    {
        return taskDescMapper.getByTaskId(taskId);
    }
    public Collection<TaskDesc> getById(Integer id)
    {
        return taskDescMapper.getById(id);
    }
    public void delete(Integer taskId)
    {
        taskDescMapper.delete(taskId);
    }
}
