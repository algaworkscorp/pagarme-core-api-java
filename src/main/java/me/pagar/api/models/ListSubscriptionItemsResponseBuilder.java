/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListSubscriptionItemsResponseBuilder {
    //the instance to build
    private ListSubscriptionItemsResponse listSubscriptionItemsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListSubscriptionItemsResponseBuilder() {
        listSubscriptionItemsResponse = new ListSubscriptionItemsResponse();
    }

    /**
     * The subscription items
     */
    public ListSubscriptionItemsResponseBuilder data(List<GetSubscriptionItemResponse> data) {
        listSubscriptionItemsResponse.setData(data);
        return this;
    }

    /**
     * Object used for returning lists of objects with pagination
     */
    public ListSubscriptionItemsResponseBuilder paging(PagingResponse paging) {
        listSubscriptionItemsResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListSubscriptionItemsResponse build() {
        return listSubscriptionItemsResponse;
    }
}