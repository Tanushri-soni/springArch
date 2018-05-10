package com.koala.rhschedule.util.error;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 *ErrorInfo class having information about custom exceptions
 */
@JsonInclude(value = Include.NON_NULL)
public class ErrorInfo implements Serializable{
   
	private static final long serialVersionUID = 67549136213141491L;

	private String responseCode;

    private String responseDescription;
    
    private Integer referenceNumber;
 
    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    
    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }


    @Override
    public String toString() {
        return "ErrorInfo [responseCode=" + responseCode + ", responseDescription=" + responseDescription +
            ", referenceNumber=" + referenceNumber + "]";
    }


}
