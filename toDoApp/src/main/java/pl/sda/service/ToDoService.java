package pl.sda.service;

import pl.sda.model.ToDoModel;
import pl.sda.repository.ToDoRepository;

import java.util.List;

public class ToDoService {

    private ToDoRepository toDoRepository = new ToDoRepository();

    public void addToDo(String login, ToDoModel toDoModel) {
        toDoRepository.addToDoLit(login, toDoModel);
    }

    public void markAsDone(String login, long id ){
        toDoRepository.markAsDone(login, id);
    }

    public List<ToDoModel> getToDoList(String login) {
        return toDoRepository.getToDoList(login);
    }

    public void remove(String login,long id) {
        toDoRepository.removeFromToDoList(login, id);
    }

    public void save(ToDoModel model) {
    }
}
