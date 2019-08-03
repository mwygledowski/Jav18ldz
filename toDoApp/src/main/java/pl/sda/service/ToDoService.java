package pl.sda.service;

import pl.sda.model.ToDoModel;
import pl.sda.repository.ToDoRepository;

import java.util.List;

public class ToDoService {

    private ToDoRepository toDoRepository = new ToDoRepository();

    public void addToDo(String login, ToDoModel toDoModel) {
        toDoRepository.addToDoLit(login, toDoModel);
    }

    public List<ToDoModel> getToDoList(String login) {
        return toDoRepository.getToDoList(login);
    }

    public void remove() {
        toDoRepository.
    }
}
