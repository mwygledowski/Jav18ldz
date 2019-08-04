package pl.sda.repository;

import pl.sda.model.Category;
import pl.sda.model.ToDoModel;

import java.time.LocalDateTime;
import java.util.*;

public class ToDoRepository {

    private static Map<String, List<ToDoModel>> toDoMap = loadMock();

    public List<ToDoModel> getToDoList(String login) {
        return toDoMap.get(login);
    }

    public void addToDoLit(String login, ToDoModel toDoModel) {
        if (toDoMap.get(login) != null) {
            toDoMap.get(login).add(toDoModel);
        }
        else {
           toDoMap.put(login, new ArrayList<>(Arrays.asList(toDoModel)));
        }
    }

    public void markAsDone(String login, long id) {
        List<ToDoModel> toDoModelList = toDoMap.get(login);
        Optional<ToDoModel> model = toDoModelList.stream().filter(x -> x.getId() == id).findFirst();
        if (model.isPresent()) {
            model.get().setDone(true);
        }
    }

    public void removeFromToDoList(String login, long id) {
        List<ToDoModel> toDoModelList = toDoMap.get(login);
        ToDoModel model = toDoModelList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        toDoModelList.remove(model);
    }

    public ToDoModel getToDo(String login, long id) {
        List<ToDoModel> toDoModelList = toDoMap.get(login);
        ToDoModel model = toDoModelList.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
        return model;
    }

    public void editToDo(String login, long id, String newTitle, Category newCategory, LocalDateTime newDeadline, String newDescription) {
        List<ToDoModel> toDoModelList = toDoMap.get(login);
        ToDoModel model = toDoModelList.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
        model.setCategory(newCategory);
        model.setTitle(newTitle);
        model.setDeadlineDate(newDeadline);
        model.setDescription(newDescription);
    }

    private static Map<String, List<ToDoModel>> loadMock() {
        ToDoModel toDoModel1 = new ToDoModel(SequenceGenerator.getNextValue(),
                "Umyć nogi",
                Category.RELAX,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "dokladnie",
                false);
        ToDoModel toDoModel2 = new ToDoModel(SequenceGenerator.getNextValue(),
                "Zrobic liste zakupow",
                Category.HOME,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "na jutro",
                false);

        List<ToDoModel> toDoModelList = new ArrayList<>();
        toDoModelList.add(toDoModel1);
        toDoModelList.add(toDoModel2);

        Map<String, List<ToDoModel>> result = new HashMap<>();
        result.put("Unicorn", toDoModelList);

        return result;
    }
}
