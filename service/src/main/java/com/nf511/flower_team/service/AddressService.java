package com.nf511.flower_team.service;


import com.nf511.flower_team.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressService {
    List<Address> selectAllAddress();
    Address selectAddressId(@Param("addressId") String addressId);
    List<Address>selectAllAddressByPage(@Param("pagelimit")int pagelimit,@Param("size")int size);
    int insertAddress(Address address);
    int updateAddress(Address address);
    int deleteAddress(@Param("addressId") int addressId);
    int deleteAll(@Param("addressIds") List<Integer>items);
}
