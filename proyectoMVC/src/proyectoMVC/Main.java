package proyectoMVC;


public class Main {
	public static void main (String[] args) {
		
		TaskView view = new TaskView ();
		TaskController controller = new TaskController(view);
		
		controller.addtask(" TERMINAR TRABAJO DE LP");
		controller.addtask(" TERMINAR INFORME DE REDES");
		
		controller.displayTask();
		
		controller.completeTask(1);
		
		controller.displayTask();
	}
}
