package proyectoMVC;

public class Main {
    public static void main(String[] args) {
        
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);
        
        controller.addtask("Terminar trabajo de LP");
        controller.addtask("Terminar informe de redes");
        
        controller.displayTask();
        
        controller.completeTask(1);
        
        controller.displayTask();
//actualiazr
        controller.updateTask(0, "Finalizar trabajo de LP");
        controller.displayTask();
//eliminar        
        controller.deleteTask(1);
        controller.displayTask();
        
        controller.saveTasksToFile("tareas.txt");

        controller.loadTasksFromFile("tareas.txt");
        controller.displayTask();
    }
}
