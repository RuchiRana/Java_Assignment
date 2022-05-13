package Task6;

class AddAmount {
    int amount = 50, transactions = 0;
    public int AddAmount(){
        transactions++;
        return amount;
    }
    public int AddAmount(int num1){
        transactions++;
        amount += num1;
        return amount;
    }
    public int Calculate(){
        return transactions;
    }
}