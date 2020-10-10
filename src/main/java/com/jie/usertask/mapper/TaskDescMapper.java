package com.jie.usertask.mapper;


import com.jie.usertask.entities.TaskDesc;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface TaskDescMapper {

    public void InsertTask(TaskDesc taskDesc);
    public Collection<TaskDesc> getAll();
    public TaskDesc getByTaskId (Integer taskId);
    public void delete(Integer taskId);
    public Collection<TaskDesc> getById(Integer id);

}
