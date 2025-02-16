package com.jecsdev.mytasklist.feature_task.domain.use_case

import com.jecsdev.mytasklist.feature_task.data.data_source.model.Task
import com.jecsdev.mytasklist.feature_task.domain.model.EmptyTask
import com.jecsdev.mytasklist.feature_task.domain.model.toTask
import com.jecsdev.mytasklist.feature_task.domain.repository.TaskRepository

class GetTask(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(id: Int): Task {
        return repository.getTaskById(id) ?: EmptyTask().toTask()
    }
}