package lesson5;

import java.util.Arrays;

public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        /*Sys.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        Sys.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names,balances,"Ann",2000);
        Sys.out.println(Arrays.toString(balances));*/

        withdraw(names,balances,"Denis",100);
        System.out.println(Arrays.toString(balances));
    }

   /* static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        int count = 0;
        for (int balance : balances) {
            if (balance >= n) {
                count++;
            }
        }
        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;


    }


    static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        int count = 0;
        for (int balance : balances) {
            if (balance < 0) {
                count++;
            }
        }


        String[] results = new String[count];

        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;


    }

    static void depositMoney(String[] clients, int[] balances, String client, int money) {
        balances[findClientIndexByName(clients,client)] += calculateDepositAmountAfterCommission(money);
    }*/
    static int findClientIndexByName(String[] clients,String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
    /*static int calculateDepositAmountAfterCommission(int money){
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }*/
    static void withdraw(String[] clients, int[] balances, String client, int amount){
        balances[findClientIndexByName(clients,client)] -= calculateAmountAfterWithdraw(clients,client, balances, amount);


    }
    static int calculateAmountAfterWithdraw(String[] clients,String client, int[] balances,int amount){
        int result = 0;
        int clientIndex = findClientIndexByName(clients, client);
        for (int balance : balances) {
            if (balance >= amount) {
                return result = balance - amount ;
            }
            return -1;
        }
        return result;
    }

}

