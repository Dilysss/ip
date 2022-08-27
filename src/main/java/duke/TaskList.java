package duke;

import java.util.ArrayList;

/**
 * Contains the task list.
 */
public class TaskList {

    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Adds task to list.
     *
     * @param task Task to be added.
     * @return Task that was added.
     */
    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    /**
     * Deletes task from list.
     *
     * @param taskNum Index of task to be deleted from the arraylist.
     */
    public void deleteTask(int taskNum) {
        tasks.remove(taskNum);
    }

    /**
     * Marks task as done.
     *
     * @param index Index of task to be marked.
     * @return Task that is marked.
     */
    public Task mark(int index) {
        tasks.get(index).isDone = true;
        return tasks.get(index);
    }

    /**
     * Unmarks task as undone.
     *
     * @param index Index of task to be unmarked.
     * @return Task that is unmarked.
     */
    public Task unmark(int index) {
        tasks.get(index).isDone = false;
        return tasks.get(index);
    }

    /**
     * Displays list of tasks.
     *
     * @return Arraylist of tasks.
     */
    public ArrayList<Task> listOfTasks() {
        return tasks;
    }

    /**
     * Returns a specific task.
     *
     * @param index Index of task to be returned.
     * @return Task that was specified.
     */
    public Task getTask(int index) {
        return tasks.get(index);
    }

    /**
     * Returns size of arraylist.
     *
     * @return Size of arraylist.
     */
    public int getSize() {
        return tasks.size();
    }
}
