package StandAlone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Persons {
    private List friends;
    private Map<String,Integer> feeStructure;

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }
    public Persons()
    {
        super();
    }
    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    private Properties driver;

    @Override
    public String toString() {
        return "Persons{" +
                "friends=" + friends +
                ", feeStructure="+ feeStructure +
                ", driver=" + driver +
                '}';
    }

    public Persons(List friends) {
        this.friends = friends;
    }

    public Properties getDriver() {
        return driver;
    }

    public void setDriver(Properties driver) {
        this.driver = driver;
    }

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }
}
