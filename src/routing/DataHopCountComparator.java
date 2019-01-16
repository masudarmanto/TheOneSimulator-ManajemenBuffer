package routing;

import java.util.Comparator;
import core.Message;

public class DataHopCountComparator implements Comparator<Message> {

	@Override
	public int compare(Message d1, Message d2) {
		return d1.getHopCount()- d2.getHopCount();
	}
}