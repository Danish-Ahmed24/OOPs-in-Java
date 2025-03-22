package lab6;

class Software {
    protected String name;
    protected String version;
    protected String licenseKey;

    public Software(String name, String version, String licenseKey) {
        this.name = name;
        this.version = version;
        this.licenseKey = licenseKey;
    }
}

class LicensedSoftware extends Software {
    protected String expiryDate;

    public LicensedSoftware(String name, String version, String licenseKey, String expiryDate) {
        super(name, version, licenseKey);
        this.expiryDate = expiryDate;
    }

    public boolean isLicenseExpired() {
        return false;
    }
}

class CloudSoftware extends LicensedSoftware {
    private int storageLimit;
    private int usedStorage;

    public CloudSoftware(String name, String version, String licenseKey, String expiryDate, int storageLimit, int usedStorage) {
        super(name, version, licenseKey, expiryDate);
        this.storageLimit = storageLimit;
        this.usedStorage = usedStorage;
    }

    public void displayDetails() {
        System.out.println("Software Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("License Key: " + licenseKey);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("License Status: " + (isLicenseExpired() ? "Expired" : "Active"));
        System.out.println("Remaining Storage: " + (storageLimit - usedStorage) + " GB");
    }
}

public class Q7_lab6 {
    public static void main(String[] args) {
        CloudSoftware software = new CloudSoftware("SystemPro", "1.0", "ABC123", "2025-12-31", 500, 120);
        software.displayDetails();
    }
}
