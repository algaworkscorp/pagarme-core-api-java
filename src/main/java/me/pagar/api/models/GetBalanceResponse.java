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
public class GetBalanceResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6047727524308375522L;
    private String currency;
    private long availableAmount;
    private GetRecipientResponse recipient;
    private long transferredAmount;
    private long waitingFundsAmount;
    /** GETTER
     * Currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * Amount available for transferring
     */
    @JsonGetter("available_amount")
    public long getAvailableAmount ( ) { 
        return this.availableAmount;
    }
    
    /** SETTER
     * Amount available for transferring
     */
    @JsonSetter("available_amount")
    public void setAvailableAmount (long value) { 
        this.availableAmount = value;
    }
 
    /** GETTER
     * Recipient response
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient response
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transferred_amount")
    public long getTransferredAmount ( ) { 
        return this.transferredAmount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transferred_amount")
    public void setTransferredAmount (long value) { 
        this.transferredAmount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("waiting_funds_amount")
    public long getWaitingFundsAmount ( ) { 
        return this.waitingFundsAmount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("waiting_funds_amount")
    public void setWaitingFundsAmount (long value) { 
        this.waitingFundsAmount = value;
    }
 
}
