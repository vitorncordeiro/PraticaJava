package mm;

public class Task implements Comparable<Task>{
    private String assignee;
    private String projectName;
    private String description;
    private String status;
    private String priority;

    public Task(String assignee, String projectName, String description, String status, String priority) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    @Override
    public int compareTo(Task target){
        if(this.getProjectName().compareTo(target.getProjectName()) != 0){
            return this.getProjectName().compareTo(target.getProjectName());
        }
        return this.getDescription().compareTo(target.getDescription());

    }
    @Override
    public String toString(){
        return this.getAssignee() + " :\n" + this.getProjectName() + "\n" + this.getDescription() + "\n" + this.getPriority() + "\n" + this.getStatus() + "\n";
    }

}
