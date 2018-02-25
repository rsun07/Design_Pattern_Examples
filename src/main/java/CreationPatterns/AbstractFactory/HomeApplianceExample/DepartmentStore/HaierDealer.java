package CreationPatterns.AbstractFactory.HomeApplianceExample.DepartmentStore;

import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.HaierFactory;
import CreationPatterns.AbstractFactory.HomeApplianceExample.Factory.HomeApplianceFactory;

public class HaierDealer implements DepartmentStore {
    private static final HomeApplianceFactory HAIER_FACTORY = HaierFactory.getHaierFactory();

    public static HomeApplianceFactory getHaierDealerMenu() {
        return HAIER_FACTORY;
    }
}