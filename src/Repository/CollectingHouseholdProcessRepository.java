package Repository;

import DataAccess.CollectingHouseholdDAO;
import java.util.List;

public class CollectingHouseholdProcessRepository implements ICollectingHouseholdProcessRepository {

    @Override
    public void display(List<Integer> lt) {
        CollectingHouseholdDAO.Instance().display(lt);
    }

}