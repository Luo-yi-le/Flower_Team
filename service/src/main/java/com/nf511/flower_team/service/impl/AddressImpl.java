package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.AddressDao;
import com.nf511.flower_team.entity.Address;
import com.nf511.flower_team.entity.User;
import com.nf511.flower_team.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    public List<Address> selectAllAddress() {
        return addressDao.selectAllAddress();
    }

    public Address selectAddressId(String addressId) {
        return addressDao.selectAddressId(addressId);
    }

    public List<Address> selectAllAddressByPage(int pagelimit, int size) {
        return addressDao.selectAllAddressByPage(pagelimit, size);
    }

    public int insertAddress(Address address) {
        return addressDao.insertAddress(address);
    }

    public int updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }

    public int deleteAddress(int addressId) {
        return addressDao.deleteAddress(addressId);
    }

    public int deleteAll(List<Integer> items) {
        return addressDao.deleteAll(items);
    }
}
