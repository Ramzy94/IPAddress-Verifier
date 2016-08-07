
import java.util.ArrayList;
public class IPStorage {

    public class IPaddess{
        private String address;
        private boolean valid = false;

        public IPaddess(String address) {
            this.setIPAddress(address);
        }

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }

        public String getIPAddress() {
            return address;
        }

        public void setIPAddress(String IPAddress) {
            this.address = IPAddress;
        }
    }

    private static ArrayList<IPaddess> addressList = new ArrayList<IPaddess>();
    private static ArrayList<IPaddess> validatedList = new ArrayList<IPaddess>();


    public static ArrayList<IPaddess> getAddressList() {
        return addressList;
    }

    public static void setAddressList(ArrayList<IPaddess> addressList) {
        addressList = addressList;
    }

    public static ArrayList<IPaddess> getValidatedList() {
        return validatedList;
    }

    public static void setValidatedList(ArrayList<IPaddess> validatedList) {
        IPStorage.validatedList = validatedList;
    }

    public static void purgeLists()
    {
        addressList.clear();
        validatedList.clear();
    }
}

