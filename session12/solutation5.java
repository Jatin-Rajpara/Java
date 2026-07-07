package session12;

public class solutation5 {

    public static String maskWalletID(String walletID) {

        StringBuffer masked = new StringBuffer();

        masked.append("***");
        masked.append(walletID.substring(walletID.length() - 4));

        return masked.toString();
    }

    public static void main(String[] args) {

        String walletID = "WAL12345678";

        System.out.println("Original Wallet ID : " + walletID);
        System.out.println("Masked Wallet ID   : " + maskWalletID(walletID));
    }
}