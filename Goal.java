import java.util.Date;

public class Goal {
    String Title;
    Boolean completed = false;
    Date creationDate = new Date();
    Date completionDate = new Date();
    Date intendedCompletion = new Date();
    Task subtasks;

    public Goal(String title, Date creationDate, Date completionDate, Date intendedCompletion, Task subtasks) {
        Title = title;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.intendedCompletion = intendedCompletion;
        this.subtasks = subtasks;
    }
}
