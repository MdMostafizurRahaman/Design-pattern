package myDocument;

public class textDocuments implements Document{

	public void open() {
		System.out.println("Open Text Documents");
	}
	public void close() {
		System.out.println("Close Text Documents");
	}
	public void save() {
		System.out.println("Save Text Documents");		
	}
	public void revert() {
		System.out.println("Reverts TextDocuments");		
	}
}
