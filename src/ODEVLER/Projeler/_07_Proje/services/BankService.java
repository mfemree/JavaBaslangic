package ODEVLER.Projeler._07_Proje.services;

import ODEVLER.Projeler._07_Proje.application.Customer;

public interface BankService {

    // Bu Interface de govdesiz methodlar tanimlanacaktir...
    // Bu methodlarin govdesi bu interface i implement eden sinifta tanimlanacaktir.
    void addFunds(Customer currentCustomer);
    void withdrawMoney(Customer currentCustomer);

    void createAccount(Customer currentCustomer);
    void freezeAccount(Customer currentCustomer);

}
