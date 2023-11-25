import BankSystem.AccountOperation;
import BankSystem.Bank;
import BankSystem.CrossAccountOperation;

//Создайте класс Tree<T> (настраиваемое бинарное дерево) и используйте его для хранения клиентов банка (вместо Vector).Обратите внимание что код
//приведеный ниже работать небудет, т.к. Java-компилятор незнает как сравнить две переменные неизвестного типа. Для того что реализовать сравнение
//в классе дерева воспользуйтесь стандартным интерфейсом Comparator (более детальную информацию смотрите в Java документации).

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account acc = bank.createAccount("Иванов", "АК123456");
        Bank.Account acc1 = bank.createAccount("Петров", "АЕ123456",50);
        Bank.Account acc2 = bank.createAccount("Петров222", "АЕccc123456",50);
        AccountOperation oper = new AccountOperation(acc,100);
        CrossAccountOperation oper2 = new CrossAccountOperation(acc, acc1,10);
        bank.addOperation(oper);
        bank.addOperation(oper2);
        bank.runOperations();
        System.out.print(bank);
    }
}