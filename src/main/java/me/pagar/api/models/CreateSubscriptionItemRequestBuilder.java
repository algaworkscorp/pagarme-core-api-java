/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateSubscriptionItemRequestBuilder {
    //the instance to build
    private CreateSubscriptionItemRequest createSubscriptionItemRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSubscriptionItemRequestBuilder() {
        createSubscriptionItemRequest = new CreateSubscriptionItemRequest();
    }

    /**
     * Item description
     */
    public CreateSubscriptionItemRequestBuilder description(String description) {
        createSubscriptionItemRequest.setDescription(description);
        return this;
    }

    /**
     * Request for creating a pricing scheme
     */
    public CreateSubscriptionItemRequestBuilder pricingScheme(CreatePricingSchemeRequest pricingScheme) {
        createSubscriptionItemRequest.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Item id
     */
    public CreateSubscriptionItemRequestBuilder id(String id) {
        createSubscriptionItemRequest.setId(id);
        return this;
    }

    /**
     * Plan item id
     */
    public CreateSubscriptionItemRequestBuilder planItemId(String planItemId) {
        createSubscriptionItemRequest.setPlanItemId(planItemId);
        return this;
    }

    /**
     * Discounts for the item
     */
    public CreateSubscriptionItemRequestBuilder discounts(List<CreateDiscountRequest> discounts) {
        createSubscriptionItemRequest.setDiscounts(discounts);
        return this;
    }

    /**
     * Item name
     */
    public CreateSubscriptionItemRequestBuilder name(String name) {
        createSubscriptionItemRequest.setName(name);
        return this;
    }

    /**
     * Number of cycles which the item will be charged
     */
    public CreateSubscriptionItemRequestBuilder cycles(Integer cycles) {
        createSubscriptionItemRequest.setCycles(cycles);
        return this;
    }

    /**
     * Quantity of items
     */
    public CreateSubscriptionItemRequestBuilder quantity(Integer quantity) {
        createSubscriptionItemRequest.setQuantity(quantity);
        return this;
    }

    /**
     * Minimum price
     */
    public CreateSubscriptionItemRequestBuilder minimumPrice(Integer minimumPrice) {
        createSubscriptionItemRequest.setMinimumPrice(minimumPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSubscriptionItemRequest build() {
        return createSubscriptionItemRequest;
    }
}