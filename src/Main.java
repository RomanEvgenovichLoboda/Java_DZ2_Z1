import BankSystem.AccountOperation;
import BankSystem.Bank;
import BankSystem.CrossAccountOperation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

//1.Создайте класс Tree<T> (настраиваемое бинарное дерево) и используйте его для хранения клиентов банка (вместо Vector).Обратите внимание что код
//приведеный ниже работать небудет, т.к. Java-компилятор незнает как сравнить две переменные неизвестного типа. Для того что реализовать сравнение
//в классе дерева воспользуйтесь стандартным интерфейсом Comparator (более детальную информацию смотрите в Java документации).
//2.Необходимо логировать ошибки происходящие во время банковских операций. Ошибка должна хранится в виде (Дата, Сообщение). Разработайте объектную
//модель которая позволит хранить ошибки. При создании модели, обратите внимание на то что неплохобы было добавлять информацию об ошибках с
//любого места программы. Таким образом унифицировать процесс обработки ошибок.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account acc = bank.createAccount("Иваненко", "АК123456");
        Bank.Account acc1 = bank.createAccount("Петренко", "АЕ123456",50);
        Bank.Account acc2 = bank.createAccount("Сіромаха", "АH123456",100);
        AccountOperation oper = new AccountOperation(acc,100);
        CrossAccountOperation oper2 = new CrossAccountOperation(acc, acc1,100);
        CrossAccountOperation oper3 = new CrossAccountOperation(acc2,acc,1000);
        bank.addOperation(oper);
        bank.addOperation(oper2);
        bank.addOperation(oper3);
        bank.runOperations();
        System.out.print(bank);


        Path path = Paths.get("log.txt");
        if (Files.exists(path)) {
            System.out.println("Log File Exist");
        }
        else System.out.println("Log File not exist");
        try (FileReader reader = new FileReader("log.txt")) {
            // читаем посимвольно
            System.out.print("-----------LogS:");
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}