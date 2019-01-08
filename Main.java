import com.controller.TableDetailController;
import com.model.business.functions.PullTable;
import com.model.data_access.ConnectToDb;
import com.model.data_access.DataRef;
import com.view.ui.frame.UIHome;

public class Main {
	public static void main(String[] args) {
		ConnectToDb db = new ConnectToDb();
		DataRef ref = DataRef.createInstance();
		UIHome home = new UIHome();
		PullTable table = new PullTable(home, ref.getTableRef());
	}
}
