public class Banking{
    public static void main(String[] args) {
        Account acc1 = new Account(555);
        Account acc2 = new Account(555);

        System.out.println(acc1.hashCode() == acc2.hashCode());
    }
}

class Account {
    int accNo;

    Account(int accNo){
        this.accNo = accNo;
    }

    @Override
    public int hashCode(){
        return this.accNo;
    }
}