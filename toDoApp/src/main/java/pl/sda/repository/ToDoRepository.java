package pl.sda.repository;

import pl.sda.model.Category;
import pl.sda.model.ToDoModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoRepository {

    private static Map<String, List<ToDoModel>> toDoMap = loadMock();

    public List<ToDoModel> getToDoList(String login) {
        return toDoMap.get(login);
    }

    public void addToDoLit(String login, ToDoModel toDoModel) {
        toDoMap.get(login).add(toDoModel);
    }

    public void removeFromToDoList(String login, ToDoModel toDoModel) {
        List<ToDoModel> toDoModelList = toDoMap.get(login);
        toDoModelList.remove(toDoModel);
    }

    private static Map<String, List<ToDoModel>> loadMock() {
        ToDoModel toDoModel1 = new ToDoModel(SequenceGenerator.getNextValue(),
                "Umyć nogi",
                Category.RELAX,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "dokladnie");
        ToDoModel toDoModel2 = new ToDoModel(SequenceGenerator.getNextValue(),
                "Zrobic liste zakupow",
                Category.HOME,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "na jutro");

        List<ToDoModel> toDoModelList = new ArrayList<>();
        toDoModelList.add(toDoModel1);
        toDoModelList.add(toDoModel2);

        Map<String, List<ToDoModel>> result = new HashMap<>();
        result.put("Unicorn", toDoModelList);

        return result;
    }

}