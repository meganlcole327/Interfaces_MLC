
public class Task implements Priority, java.lang.Comparable<Task> {

	public enum Status {

		NOT_STARTED, IN_PROCESS, COMPLETE;

	} // end enum

	private String name;
	private int priority;
	private Status status;
	
	public Task() {
		super();
		this.name = "";
	} //end empty-argument constructor

	public Task(String name) {
		super();
		this.name = name;
	} // end preferred constructor

	@Override
	public int compareTo(Task o) {
		if (this.priority < o.getPriority()) {
			return -1;
		} else if (this.priority > o.getPriority()) {
			return 1;
		}
		return 0;
	} // end compareTo

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	} // end setPriority

	@Override
	public int getPriority() {
		return this.priority;
	} // end getPriority

	public String getName() {
		return name;
	} // end getName

	public Status getStatus() {
		return status;
	} // end getStatus

	public void setStatus(Status status) {
		this.status = status;
	} // end setStatus

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
	} // end toString

} // end class
