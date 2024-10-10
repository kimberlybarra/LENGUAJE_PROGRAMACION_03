package proyectoMVC;

import java.io.*;
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
	
	 public void updateTask(int index, String newName) {
	        if (index >= 0 && index < tasks.size()) {
	            Task task = tasks.get(index);
	            task.updateName(newName);
	            view.printMessage("La tarea fue actualizada a: " + newName + "\n");
	        } else {
	            view.printMessage("Índice de tarea no válido\n");
	        }
	    }
	 
	 public void deleteTask(int index) {
		 if (index >= 0 && index < tasks.size()) {
	         Task task = tasks.remove(index);
	         view.printMessage("La tarea: " + task.getname() + " fue eliminada\n");
	        } else {
	            view.printMessage("Índice de tarea no válido\n");
	        }
	    }

	    public void saveTasksToFile(String filename) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
	            for (Task task : tasks) {
	                writer.write(task.getname() + "," + (task.isComplete() ? "1" : "0") + "\n");
	            }
	            view.printMessage("Tareas guardadas en el archivo: " + filename + "\n");
	        } catch (IOException e) {
	            view.printMessage("Error al guardar tareas: " + e.getMessage() + "\n");
	        }
	    }

	    public void loadTasksFromFile(String filename) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                Task task = new Task(parts[0]);
	                if (parts[1].equals("1")) {
	                    task.complete();
	                }
	                tasks.add(task);
	            }
	            view.printMessage("Tareas cargadas desde el archivo: " + filename + "\n");
	        } catch (IOException e) {
	            view.printMessage("Error al cargar tareas: " + e.getMessage() + "\n");
	        }
	    }
	 
	//mostrar las tareas
	public void displayTask() {
		view.printTasks(tasks);
	}
}
