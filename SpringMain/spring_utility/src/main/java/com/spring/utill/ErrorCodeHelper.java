package com.spring.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.koala.rhschedule.util.error.ErrorInfo;
import com.koala.rhschedule.util.property.reader.PropertyReader;
import com.spring.constants.CommonConstants;

/**
 * To provide http error code and regarding description
 *
 */
public class ErrorCodeHelper {

    @Autowired
    @Qualifier(CommonConstants.ERROR_PROPERTY_READER)
    private PropertyReader errorPropertyReader;

    /**
     * Get Error info and set error code and error description
     * @param httpErrorCode
     * @param httpErrorDescription
     * @return ErrorInfo
     */
    public ErrorInfo getErrorInfo(String httpErrorCode, String httpErrorDescription) {    
        String responseCode = errorPropertyReader.getProperty(httpErrorCode);
        String responseDescription = errorPropertyReader.getProperty(httpErrorDescription);
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setResponseCode(responseCode);
        errorInfo.setResponseDescription(responseDescription);
        return errorInfo;
    }

    /**
     * Get Error info and set error code, error description and referenceNumber
     * @param httpErrorCode
     * @param httpErrorDescription
     * @param referenceNumber
     * @return ErrorInfo
     */
    public ErrorInfo getErrorInfo(String httpErrorCode, String httpErrorDescription,Integer referenceNumber) {
        String responseCode = errorPropertyReader.getProperty(httpErrorCode);
        String responseDescription = errorPropertyReader.getProperty(httpErrorDescription);
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setResponseCode(responseCode);
        errorInfo.setResponseDescription(responseDescription);
        errorInfo.setReferenceNumber(referenceNumber);
        return errorInfo;
    }
    
    /**
     * This method can be used, if you want to show the specific field as well in the response description.
     * 
     * @param httpErrorCode
     * @param httpErrorDescription
     * @param field
     * @return ErrorInfo
     */
    public ErrorInfo getErrorInfo(String httpErrorCode, String httpErrorDescription,String field) {      
        String responseCode = errorPropertyReader.getProperty(httpErrorCode);
        String responseDescription = errorPropertyReader.getProperty(httpErrorDescription,field);
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setResponseCode(responseCode);
        errorInfo.setResponseDescription(responseDescription);
        return errorInfo;
    }
    
}
