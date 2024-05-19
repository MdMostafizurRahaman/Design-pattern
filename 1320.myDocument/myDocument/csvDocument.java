package myDocument;

public class csvDocument implements Document{
	public void open() {
		System.out.println("Open CSV Documents");
	}
	public void close() {
		System.out.println("Close CSV Documents");
	}
	public void save() {
		System.out.println("Save CSV Documents");		
	}
	public void revert() {
		System.out.println("Reverts CSV Documents");		
	}
}
