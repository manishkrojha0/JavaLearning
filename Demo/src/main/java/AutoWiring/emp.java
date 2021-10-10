package AutoWiring;

public class emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "emp{" +
                "address=" + address +
                '}';
    }
    public emp()
    {
        super();
    }
}
