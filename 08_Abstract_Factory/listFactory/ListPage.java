packagelistfactory;
import factory.*;
import java.util.Iterator;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.appned("<ul>\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		buffer.appned("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}
}
