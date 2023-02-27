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
public class ListTransferResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3578955214375553260L;
    private List<GetTransferResponse> data;
    private PagingResponse paging;
    /** GETTER
     * Transfers
     */
    @JsonGetter("data")
    public List<GetTransferResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Transfers
     */
    @JsonSetter("data")
    public void setData (List<GetTransferResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Object used for returning lists of objects with pagination
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Object used for returning lists of objects with pagination
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
