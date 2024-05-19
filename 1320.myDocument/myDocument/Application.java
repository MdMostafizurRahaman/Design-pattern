package myDocument;

public abstract class Application {
	public abstract void newDocument();

	public void openDocument(){
		System.out.println("Open the documents");
	}
	public abstract Document createDocument();
}
