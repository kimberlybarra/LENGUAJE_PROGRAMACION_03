package proyectoMVC;

public class Task {
	private String name;
	private boolean completed;
	
	public Task(String name) {
		this.name = name;
		this.completed = false; 
	}
	
	public String getname() {
		return name;
	}
	public boolean isComplete() {
		return completed;
	}
	public void complete() {
		this.completed = true;
	}
	
    public void updateName(String newName) {
        this.name = newName;
    }
}
