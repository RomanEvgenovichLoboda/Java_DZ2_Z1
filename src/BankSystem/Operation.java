package BankSystem;

public abstract class Operation{
    //Денежные средства в банковской операции
    protected double amount;
    //Выполняет банковскую операцию
    public abstract void doWork( ) throws OperationException;
}
