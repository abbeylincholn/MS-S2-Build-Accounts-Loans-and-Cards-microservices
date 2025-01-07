package com.abbeymicrosvs.accounts.service;

import com.abbeymicrosvs.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Account Details based on a given mobileNumber
     */
    CustomerDto fetchAccountDetails(String mobileNumber);


    /**
     *
     * @param customerDto - customerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);


}
