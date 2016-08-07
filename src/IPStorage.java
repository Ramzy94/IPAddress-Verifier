
import java.util.ArrayList;
public class IPStorage {

    public class IPaddess{
        private String address;
        private boolean valid = false;

        public IPaddess(String address, boolean valid) {
            this.address = address;
            this.valid = valid;
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

    private static ArrayList<String> addressList = new ArrayList<String>();
    private static ArrayList<IPaddess> validatedList = new ArrayList<IPaddess>();


    public static ArrayList<String> getAddressList() {
        return addressList;
    }

    public static ArrayList<IPaddess> getValidatedList() {
        return validatedList;
    }

    public static void purgeLists()
    {
        addressList.clear();
        validatedList.clear();
    }
}

