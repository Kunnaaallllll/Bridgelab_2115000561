class TaskScheduler{
    public static void main(String[] args) {
        Task task = new Task(101, "organic chemistry", 4, "2025-02-25");
        task = task.addTaskAtBeginning(102, "physics", 2, "2025-02-22", task);
        task = task.addTaskAtBeginning(103, "Math", 1, "2025-02-11", task);
        task = task.addTaskAtEnd(104, "bio", 3, "2025-02-01", task);

        task.displayTasks(task);
        
        task = task.removeTask(102, task);
        task.displayTasks(task);
        
        task.searchTaskByPriority(1, task);

        task.viewCurrentTask();
        task.moveToNextTask();
        task.viewCurrentTask();
    }
}

class Task {
    int TaskID, Priority;
    String TaskName, DueDate;
    Task next;
    static Task currentTask;

    Task(int TaskID, String TaskName, int Priority, String DueDate) {
        this.TaskID = TaskID;
        this.TaskName = TaskName;
        this.Priority = Priority;
        this.DueDate = DueDate;
        this.next = this;
        if (currentTask == null)
            currentTask = this;
    }

    public static Task addTaskAtBeginning(int TaskID, String TaskName, int Priority, String DueDate, Task head) {
        Task newTask = new Task(TaskID, TaskName, Priority, DueDate);
        if (head == null)
            return newTask;

        Task temp = head;
        while (temp.next != head) 
            temp = temp.next;

        newTask.next = head;
        temp.next = newTask;
        return newTask;
    }

    public static Task addTaskAtEnd(int TaskID, String TaskName, int Priority, String DueDate, Task head) {
        Task newTask = new Task(TaskID, TaskName, Priority, DueDate);
        if (head == null)
            return newTask;

        Task temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newTask;
        newTask.next = head;
        return head;
    }

    public static Task removeTask(int TaskID, Task head) {
        if (head == null) 
            return null;

        Task temp = head, prev = null;
        
        if (head.TaskID == TaskID) {
            while (temp.next != head) 
                temp = temp.next;
            if (head.next == head)
                return null;
            temp.next = head.next;
            return head.next;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.TaskID != TaskID);

        if (temp == head) {
            System.out.println("Task ID " + TaskID + " not found.");
            return head;
        }

        prev.next = temp.next;
        return head;
    }

    public static void searchTaskByPriority(int priority, Task head) {
        if (head == null) 
            return;

        Task temp = head;
        boolean found = false;
        do {
            if (temp.Priority == priority) {
                System.out.println("Task Found: " + temp.TaskName + " | Due Date: " + temp.DueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with priority " + priority);
    }

    public static void displayTasks(Task head) {
        if (head == null) {
            System.out.println("No tasks scheduled.");
            return;
        }

        System.out.println("Task List:");
        Task temp = head;
        do {
            System.out.println(temp.TaskID + " | " + temp.TaskName + " | Priority: " + temp.Priority + " | Due: " + temp.DueDate);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void viewCurrentTask() {
        if (currentTask == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: " + currentTask.TaskName + " | Priority: " + currentTask.Priority);
    }

    public static void moveToNextTask() {
        if (currentTask != null) {
            currentTask = currentTask.next;
        }
    }
}