package mm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class TaskData {
    private Set<Task> tasks = new HashSet<>(List.of(
            // Ann's Tasks
            new Task("Ann", "Infrastructure", "Security", "In Progress", "High"),
            new Task("Ann", "Infrastructure", "Password Policy", "In Progress", "Medium"),
            new Task("Ann", "Research", "Cloud solutions", "In Progress", "Medium"),
            new Task("Ann", "Data Design", "Encryption Policy", "Not Started", "High"),
            new Task("Ann", "Data Design", "Project Table", "Not Started", "Medium"),
            new Task("Ann", "Data Access", "Write Views", "In Progress", "Low"),

            // Bob's Tasks
            new Task("Bob", "Infrastructure", "Security", "In Progress", "High"),
            new Task("Bob", "Infrastructure", "Password Policy", "Not Started", "Medium"),
            new Task("Bob", "Data Design", "Encryption Policy", "Not Started", "High"),
            new Task("Bob", "Data Access", "Write Views", "In Progress", "Low"),

            // Carol's Tasks
            new Task("Carol", "Infrastructure", "Logging", "In Progress", "High"),
            new Task("Carol", "Infrastructure", "DB Access", "Not Started", "Medium"),
            new Task("Carol", "Infrastructure", "Password Policy", "Not Started", "Medium"),
            new Task("Carol", "Data Design", "Task Table", "Not Started", "High"),
            new Task("Carol", "Data Access", "Write Views", "Not Started", "Low")
    ));
//    private List<Task> tasksList = new ArrayList<>(List.of(
//            // Ann's Tasks
//            new Task("Ann", "Infrastructure", "Security", "In Progress", "High"),
//            new Task("Ann", "Infrastructure", "Password Policy", "In Progress", "Medium"),
//            new Task("Ann", "Research", "Cloud solutions", "In Progress", "Medium"),
//            new Task("Ann", "Data Design", "Encryption Policy", "Not Started", "High"),
//            new Task("Ann", "Data Design", "Project Table", "Not Started", "Medium"),
//            new Task("Ann", "Data Access", "Write Views", "In Progress", "Low"),
//
//            // Bob's Tasks
//            new Task("Bob", "Infrastructure", "Security", "In Progress", "High"),
//            new Task("Bob", "Infrastructure", "Password Policy", "Not Started", "Medium"),
//            new Task("Bob", "Data Design", "Encryption Policy", "Not Started", "High"),
//            new Task("Bob", "Data Access", "Write Views", "In Progress", "Low"),
//
//            // Carol's Tasks
//            new Task("Carol", "Infrastructure", "Logging", "In Progress", "High"),
//            new Task("Carol", "Infrastructure", "DB Access", "Not Started", "Medium"),
//            new Task("Carol", "Infrastructure", "Password Policy", "Not Started", "Medium"),
//            new Task("Carol", "Data Design", "Task Table", "Not Started", "High"),
//            new Task("Carol", "Data Access", "Write Views", "Not Started", "Low")
//    ));

//    public List<Task> getTasksList(String param){
//        if(param.toLowerCase().equals("all")){
//            return tasksList;
//        }
//        Predicate<Task> isNameEquals = t -> t.getAssignee().toLowerCase() != param.toLowerCase();
//        tasksList.forEach(t -> tasksList.removeIf(isNameEquals));
//        return tasksList;
//    }


    public Set<Task> getTasks(String param){
        if(param.toLowerCase().equals("all")){
            return tasks;
        }
        Predicate<Task> isNameEquals = t -> !(t.getAssignee().equalsIgnoreCase(param));
        tasks.removeIf(isNameEquals);
        return tasks;
    }
}
