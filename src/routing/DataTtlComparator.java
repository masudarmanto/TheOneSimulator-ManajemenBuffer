package routing;

import java.util.Comparator;
import core.Message;

public class DataTtlComparator implements Comparator<Message> {

	@Override
	public int compare(Message d1, Message d2) {
		return d2.getTtl() - d1.getTtl() ;
	}
}