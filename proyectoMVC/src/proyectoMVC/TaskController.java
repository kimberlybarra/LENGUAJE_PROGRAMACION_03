package proyectoMVC;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
	/*
	   EJEMPLO DE COMO HACER: 
	   private String titulo;
	   private List<String> opciones;
	
	   public Menu(String titulo, List<String> opciones)
	   {
	       this.titulo = titulo;
	       this.opciones = opciones;
	   }
	 */
	private List<Task> tasks;
	private TaskView view;
	
	public TaskController(TaskView view) {
		this.tasks = new ArrayList<>();
		this.view = view;
	}
	
	public void addtask(String taskName) {
		//tenemos que crear un objeto de la clase Task llamado como nosotros deseemos en este caso taskName
		Task newtask = new Task(taskName);
		//agregamos taskName a una lista taks
		tasks.add(newtask);
		//para mostrar que el objeto fue añadido llamamos al metodo mensaje de un objeto view
		view.printMessage("la tarea: " + taskName + " fue añadida con exito\n");
	}
	public void completeTask(int index) {
		//tenemos que validar que nuestro index sea mayor a cero ya que estos empiezan desde cero y menor al tamaño de la lista
		if (index >= 0 && index < tasks.size()) {
			Task task = tasks.get(index);
			task.complete();
			view.printMessage("\n la tarea: " + task.getname() + " fue completada \n");
		}else {
			view.printMessage("la tarea no fue completada \n");
		}
	}
	//mostrar las tareas
	public void displayTask() {
		view.printTasks(tasks);
	}
}
