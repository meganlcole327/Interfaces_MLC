
public class Process implements Priority, java.lang.Comparable<Process>{
	
	private String processID;
	private int priority;
	
	public Process() {
		super();
		this.processID = "";
	}
	
	public Process(String processID) {
		super();
		this.processID = processID;
	} //end preferred constructor 

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
		
	} //end setPriority
	
	@Override
	public int getPriority() {
		return this.priority;
		
	} //end getPriority


	public String getProcessID() {
		return processID;
	} //getProcessID

	@Override
	public int compareTo(Process o) {
		return 0;
	} //end compareTo

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	} //end toString

} //end class
