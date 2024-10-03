package proyectoMVC;

import java.util.List;

public class TaskView {
	public void printTasks(List<Task>tasks){
		for (Task task : tasks) {
			String state = task.isComplete() ? "Completado":"Pendiente";
			System.out.println(task.getname()+ " " + state);
			
		}
	}
	public void printMessage(String message) {
		System.out.println(message);
	}
}
