/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CreateCheckoutPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5055144782779123059L;
    private List<String> acceptedPaymentMethods;
    private List<Object> acceptedMultiPaymentMethods;
    private String successUrl;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;
    private CreateCheckoutCreditCardPaymentRequest creditCard;
    private CreateCheckoutDebitCardPaymentRequest debitCard;
    private CreateCheckoutBoletoPaymentRequest boleto;
    private Boolean customerEditable;
    private Integer expiresIn;
    private boolean skipCheckoutSuccessPage;
    private boolean billingAddressEditable;
    private CreateAddressRequest billingAddress;
    private CreateCheckoutBankTransferRequest bankTransfer;
    private List<String> acceptedBrands;
    private CreateCheckoutPixPaymentRequest pix;
    /** GETTER
     * Accepted Payment Methods
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods ( ) { 
        return this.acceptedPaymentMethods;
    }
    
    /** SETTER
     * Accepted Payment Methods
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods (List<String> value) { 
        this.acceptedPaymentMethods = value;
    }
 
    /** GETTER
     * Accepted Multi Payment Methods
     */
    @JsonGetter("accepted_multi_payment_methods")
    public List<Object> getAcceptedMultiPaymentMethods ( ) { 
        return this.acceptedMultiPaymentMethods;
    }
    
    /** SETTER
     * Accepted Multi Payment Methods
     */
    @JsonSetter("accepted_multi_payment_methods")
    public void setAcceptedMultiPaymentMethods (List<Object> value) { 
        this.acceptedMultiPaymentMethods = value;
    }
 
    /** GETTER
     * Success url
     */
    @JsonGetter("success_url")
    public String getSuccessUrl ( ) { 
        return this.successUrl;
    }
    
    /** SETTER
     * Success url
     */
    @JsonSetter("success_url")
    public void setSuccessUrl (String value) { 
        this.successUrl = value;
    }
 
    /** GETTER
     * Default payment method
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod ( ) { 
        return this.defaultPaymentMethod;
    }
    
    /** SETTER
     * Default payment method
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod (String value) { 
        this.defaultPaymentMethod = value;
    }
 
    /** GETTER
     * Gateway Affiliation Id
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId ( ) { 
        return this.gatewayAffiliationId;
    }
    
    /** SETTER
     * Gateway Affiliation Id
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId (String value) { 
        this.gatewayAffiliationId = value;
    }
 
    /** GETTER
     * Checkout card payment request
     */
    @JsonGetter("credit_card")
    public CreateCheckoutCreditCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Checkout card payment request
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCheckoutCreditCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Checkout credit card payment request
     */
    @JsonGetter("debit_card")
    public CreateCheckoutDebitCardPaymentRequest getDebitCard ( ) { 
        return this.debitCard;
    }
    
    /** SETTER
     * Checkout credit card payment request
     */
    @JsonSetter("debit_card")
    public void setDebitCard (CreateCheckoutDebitCardPaymentRequest value) { 
        this.debitCard = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("boleto")
    public CreateCheckoutBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateCheckoutBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Customer is editable?
     */
    @JsonGetter("customer_editable")
    public Boolean getCustomerEditable ( ) { 
        return this.customerEditable;
    }
    
    /** SETTER
     * Customer is editable?
     */
    @JsonSetter("customer_editable")
    public void setCustomerEditable (Boolean value) { 
        this.customerEditable = value;
    }
 
    /** GETTER
     * Time in minutes for expiration
     */
    @JsonGetter("expires_in")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * Time in minutes for expiration
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * Skip postpay success screen?
     */
    @JsonGetter("skip_checkout_success_page")
    public boolean getSkipCheckoutSuccessPage ( ) { 
        return this.skipCheckoutSuccessPage;
    }
    
    /** SETTER
     * Skip postpay success screen?
     */
    @JsonSetter("skip_checkout_success_page")
    public void setSkipCheckoutSuccessPage (boolean value) { 
        this.skipCheckoutSuccessPage = value;
    }
 
    /** GETTER
     * Billing Address is editable?
     */
    @JsonGetter("billing_address_editable")
    public boolean getBillingAddressEditable ( ) { 
        return this.billingAddressEditable;
    }
    
    /** SETTER
     * Billing Address is editable?
     */
    @JsonSetter("billing_address_editable")
    public void setBillingAddressEditable (boolean value) { 
        this.billingAddressEditable = value;
    }
 
    /** GETTER
     * Request for creating a new Address
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Request for creating a new Address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * Checkout bank transfer payment request
     */
    @JsonGetter("bank_transfer")
    public CreateCheckoutBankTransferRequest getBankTransfer ( ) { 
        return this.bankTransfer;
    }
    
    /** SETTER
     * Checkout bank transfer payment request
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer (CreateCheckoutBankTransferRequest value) { 
        this.bankTransfer = value;
    }
 
    /** GETTER
     * Accepted Brands
     */
    @JsonGetter("accepted_brands")
    public List<String> getAcceptedBrands ( ) { 
        return this.acceptedBrands;
    }
    
    /** SETTER
     * Accepted Brands
     */
    @JsonSetter("accepted_brands")
    public void setAcceptedBrands (List<String> value) { 
        this.acceptedBrands = value;
    }
 
    /** GETTER
     * Checkout pix payment request
     */
    @JsonGetter("pix")
    public CreateCheckoutPixPaymentRequest getPix ( ) { 
        return this.pix;
    }
    
    /** SETTER
     * Checkout pix payment request
     */
    @JsonSetter("pix")
    public void setPix (CreateCheckoutPixPaymentRequest value) { 
        this.pix = value;
    }
 
}
