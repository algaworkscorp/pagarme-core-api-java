/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListTransferResponseBuilder {
    //the instance to build
    private ListTransferResponse listTransferResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListTransferResponseBuilder() {
        listTransferResponse = new ListTransferResponse();
    }

    /**
     * Transfers
     */
    public ListTransferResponseBuilder data(List<GetTransferResponse> data) {
        listTransferResponse.setData(data);
        return this;
    }

    /**
     * Object used for returning lists of objects with pagination
     */
    public ListTransferResponseBuilder paging(PagingResponse paging) {
        listTransferResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListTransferResponse build() {
        return listTransferResponse;
    }
}