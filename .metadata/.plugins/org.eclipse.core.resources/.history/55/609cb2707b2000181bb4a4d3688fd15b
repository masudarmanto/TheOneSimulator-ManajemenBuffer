package routing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import core.Message;

public class DataChainedComparator implements Comparator<Message> {

	private List<Comparator<Message>> listComparators;

	@SafeVarargs
	public DataChainedComparator(Comparator<Message>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Message d1, Message d2) {
		for (Comparator<Message> comparator : listComparators) {
			int result = comparator.compare(d1, d2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}