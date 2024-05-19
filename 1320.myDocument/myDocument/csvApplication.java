package myDocument;

public class csvApplication extends Application{

	public void newDocument()
	{
		Document document1 = createDocument();
		document1.open();
		document1.save();
		document1.close();
	}
	@Override
	public Document createDocument() {
		return new csvDocument();
	}
}
