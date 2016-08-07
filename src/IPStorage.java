
import java.util.ArrayList;
public class IPStorage {

    public static class IPaddress{
        private String address;
        private boolean valid = false;

        public IPaddress(String address, boolean valid) {
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
    private static ArrayList<IPaddress> validatedList = new ArrayList<IPaddress>();


    public static ArrayList<String> getAddressList() {
        return addressList;
    }

    public static void addValidatedIPAddress(String address,boolean validation){
        IPaddress ipAddress = new IPaddress(address,validation);

        validatedList.add(ipAddress);
    }

    public static ArrayList<IPaddress> getValidatedList() {
        return validatedList;
    }

    public static void purgeLists()
    {
        addressList.clear();
        validatedList.clear();
    }
}

