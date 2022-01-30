package com.techinterview.ipvalidator.service;

import java.util.Arrays;

public final class Utility {

    public static final StringBuffer convertCidrToBinary(final String cidrRange){
        StringBuffer binaryIP = new StringBuffer();
        String[] cidr = cidrRange.split("/");
        String[] cidrIP = cidr[0].split("\\.");

        Arrays.stream(cidrIP).forEach(
                address -> {
                    int add = Integer.parseInt(address);
                    String binary = String.format("%8s", Integer.toBinaryString(add)).
                            replaceAll(" ", "0");
                    binaryIP.append(binary);
                }
        );
        return binaryIP;
    }

    public static final Integer getCidrRangeInteger(final String cidrRange){
        String[] cidr = cidrRange.split("/");
        Integer range = 32 - Integer.parseInt(cidr[1]);
        return range;
    }
}
