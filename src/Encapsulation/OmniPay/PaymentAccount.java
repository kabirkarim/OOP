package Encapsulation.OmniPay;
import java.util.Random;
public class PaymentAccount {
    //PART 1: THE SECURE FOUNDATION (Private Fields)
    private String accountId;
    private String accountHolder;
    private double balance;
    private String accountStatus;

    public void activate(){
        accountStatus="Active";
    }
    @SuppressWarnings("unused")
    public void deactivate(){
        accountStatus="Deactivate";
    }
    @SuppressWarnings("unused")
    public void deposit(double amount){
        if(amount>0)    balance+=amount;
    }

    // PART 2: THE "SMART" IDENTITY (String Manipulation)

    public void setAccountHolder(String name) {
        if(name==null || name.isEmpty()){
            this.accountHolder="Unknown";
            return;
        }
        // Auto-Formatting: Trim and Title Case
        String[] words =name.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            if(!w.isEmpty()){
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        accountHolder = sb.toString().trim();
    }

    public void setAccountId(String id) {
        // ID Validation logic: OP-XXXX-2026
        if(id!=null && id.startsWith("OP-") && id.endsWith("-2026")&&id.length()==12){     accountId=id;    }
        else    {   accountId="Pending";    }
    }
    // FLEXIBLE ONBOARDING (Constructor Chaining)
    //Basic + Data Migrator is combined to avoid "Already Defined" error
    public PaymentAccount(String data){
        if (!data.contains(",")) {
        setAccountHolder(data);
        this.balance=0.0;
        }
        else{
            String[] part= data.split(",");
            setAccountHolder(part[0]);
            this.balance=Double.parseDouble(part[1].trim());
        }
        this.accountStatus="INVALID";
        this.accountId=generateID();
    }
    //Standard Constructor
    public PaymentAccount(String name, double amount){
        setAccountHolder(name);
        this.balance=amount;
        this.accountStatus="INACTIVE";
        this.accountId=generateID();
    }

    private String generateID(){
        return "OP-"+(new Random().nextInt(9000)+1000)+"-2026";
    }

//    PART 4: MULTI-CURRENCY PROCESSOR (Method Overloading)
    //Overloaded 1: Standard Method
    public void processPayment(double amount){
        this.balance-=amount;
    }
    //OverLoaded 2: Currency Shift
    public void processPayment(double amount, String currencyCode){
        double convertAmount = amount;
        if(currencyCode.equalsIgnoreCase("PKR")){
            convertAmount=(amount/280);
        }
        else if(currencyCode.equalsIgnoreCase("EUR")){
           convertAmount=(amount*1.1);
        }
        processPayment(convertAmount); //Internal Call to overload  1
    }
    //OverLoaded 3: Encoded String
    public void processPayment(String encryptedEntry){
        String[] part=encryptedEntry.split(":");
        if(part.length==2 && part[0].equalsIgnoreCase("PAY")){
            processPayment(Double.parseDouble(part[1]));
        }
    }
    // PART 5: SECURITY AUDIT & ANALYTICS
    public String getAccountSummary(){
        String[] names= accountHolder.split("\\s+");
        StringBuilder masked = new StringBuilder();
        for(String n:names){
            if(n.length()>1){
                masked.append(n.charAt(0));
                masked.append("*".repeat(n.length()-1));
                masked.append(" ");
            }
            else{
                masked.append(n).append(" ");
            }
        }
        return "ID: "+accountId+"\t Name: "+masked.toString().trim()+"\t Balance: "+ String.format("%.2f",balance)+"\t Status: "+accountStatus;
    }
    public static PaymentAccount compareAccounts(PaymentAccount a, PaymentAccount b){
        boolean aActive = "ACTIVE".equalsIgnoreCase(a.accountStatus);
        boolean bActive = "ACTIVE".equalsIgnoreCase(b.accountStatus);
        if(aActive && bActive) return (a.balance>=b.balance)? a:b;
        if(aActive) return a;
        if(bActive) return b;
        return null;
    }

}
