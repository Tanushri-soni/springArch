package com.spring.utill;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.multipart.MultipartFile;

import com.koala.rhschedule.util.error.ErrorInfo;
import com.koala.rhschedule.util.exception.ServiceException;
import com.koala.rhschedule.util.exception.ThirdPartyException;
import com.spring.constants.CommonConstants;

/**
 * 
 * Validation class for validating input request
 *
 */
public class ValidationUtils {

	@Autowired
	@Qualifier(CommonConstants.ERROR_CODE_HELPER)
	private ErrorCodeHelper errorCodeHelper;

	private static final Logger logger = Logger.getLogger(ValidationUtils.class);

	/**
	 * Validates required field
	 * 
	 * @param fieldValue
	 */
	public void validateRequiredField(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * Validates required search field
	 * 
	 * @param fieldValue
	 */
	public void validateSearchField(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
		if (fieldValue.length() < CommonConstants.THREE) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1034_ERROR_CODE,
					CommonConstants.E1034_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate retention field
	 * 
	 * @param fieldValue
	 */
	public void validateRequiredRetentionField(Integer fieldValue, int maxLength, String fieldName) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
		if (fieldValue < 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1146_ERROR_CODE,
					CommonConstants.E1146_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}

		if (fieldValue > maxLength) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1152_ERROR_CODE,
					CommonConstants.E1152_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate integer field
	 * 
	 * @param fieldValue
	 */
	public void validateRequiredIntegerField(Integer fieldValue) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1020_ERROR_CODE,
					CommonConstants.E1020_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate contact number
	 * 
	 * @param contact
	 */
	public void validateContactNo(String contact) {

		validateRequiredField(contact);
		Pattern contactPattern = Pattern.compile(CommonConstants.CONTACT_PATTERN);
		Matcher contactMatcher = contactPattern.matcher(contact);
		if (!contactMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1073_ERROR_CODE,
					CommonConstants.E1073_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}

	}

	/**
	 * validate allowed characters
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param contactNo
	 * @param rhId
	 */
	public void validateAllowedCharacters(Long id, String firstName, String lastName, String email, String rhId) {

		if (firstName.length() > CommonConstants.HUNDRED || lastName.length() > CommonConstants.HUNDRED
				|| email.length() > CommonConstants.HUNDRED) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1069_ERROR_CODE,
					CommonConstants.E1069_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}

		if (String.valueOf(id).length() > CommonConstants.HUNDRED
				|| String.valueOf(rhId).length() > CommonConstants.TWO_HUNDRED) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1069_ERROR_CODE,
					CommonConstants.E1069_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate location setting fields
	 * 
	 * @param locationName
	 * @param streetAddress1
	 * @param streetAddress2
	 * @param zip
	 */
	public void validateLocationSettingsFields(String locationName, String streetAddress1, String streetAddress2,
			String zip) {
		if (locationName.length() > 100) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1086_ERROR_CODE,
					CommonConstants.E1086_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		} else if (streetAddress1.length() > 200) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1087_ERROR_CODE,
					CommonConstants.E1087_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		} else if (null != streetAddress2 && streetAddress2.length() > 200) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1088_ERROR_CODE,
					CommonConstants.E1088_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		} else if (zip.length() > 10) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1089_ERROR_CODE,
					CommonConstants.E1089_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}

	}

	/**
	 * Validates required object
	 * 
	 * @param objectName
	 * @param objectValue
	 */
	public void validateRequiredObject(Object objectValue) {
		if (null == objectValue) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validdate required object with fieldname
	 * 
	 * @param objectValue
	 * @param fieldName
	 */
	public void validateRequiredObjectWithFieldName(Object objectValue, String fieldName) {
		if (null == objectValue) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validates required number
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateRequiredNumberField(long fieldValue) {
		if (fieldValue == 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validates required number
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateRequiredDoubleField(Double fieldValue) {
		if (fieldValue == 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate required location field
	 * 
	 * @param fieldValue
	 */
	public void validateRequiredLocationIdField(Long fieldValue) {
		if (fieldValue == null || fieldValue == 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1081_ERROR_CODE,
					CommonConstants.E1081_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate koala's max characters
	 * 
	 * @param macAddress
	 * @param serialNo
	 */
	public void validateKoalaMaxCharacter(String macAddress, String serialNo) {
		if (macAddress.length() > CommonConstants.SEVENTEEN) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1077_ERROR_CODE,
					CommonConstants.E1077_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
		if (serialNo.length() > CommonConstants.FIFTY) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1078_ERROR_CODE,
					CommonConstants.E1078_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate required serial number fields
	 * 
	 * @param fieldValue
	 */
	public void validateSerialNoRequiredField(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1076_ERROR_CODE,
					CommonConstants.E1076_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate required mac address
	 * 
	 * @param fieldValue
	 */
	public void validateMacAddressRequiredField(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1075_ERROR_CODE,
					CommonConstants.E1075_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

		Pattern macAddressPattern = Pattern.compile(CommonConstants.MAC_ADDRESS_PATTERN);
		Matcher macAddressMatcher = macAddressPattern.matcher(fieldValue);
		if (!macAddressMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1112_ERROR_CODE,
					CommonConstants.E1112_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validates required number
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateRequiredAlphaNumberField(String fieldValue) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * Validates email
	 * 
	 * @param fieldName
	 * @param email
	 */
	public void validateEmail(String email) {

		validateRequiredField(email);

		Matcher matcher = Pattern.compile(CommonConstants.EMAIL_REGEX_LMS).matcher(email.trim());
		if (!matcher.find()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1012_ERROR_CODE,
					CommonConstants.E1012_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validate required number field
	 * 
	 * @param fieldValue
	 * @param fieldName
	 */
	public void validateRequiredIntegerWithFieldName(Integer fieldValue, String fieldName) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
		if (fieldValue < 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1146_ERROR_CODE,
					CommonConstants.E1146_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * Validates required Name field
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateAlphabetOnly(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

		Pattern pattern = Pattern.compile(CommonConstants.NAME_PATTERN);
		Matcher matcher = pattern.matcher(fieldValue);
		if (!matcher.matches()) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}

	}

	/**
	 * Validates required Name field
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateAlphaNumeric(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

		if (!StringUtils.isAlphanumeric(fieldValue.trim())) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * Validates required Name field
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateNumericOnly(String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

		if (!StringUtils.isNumeric(fieldValue.trim())) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate time format
	 * 
	 * @param expirationDate
	 */
	public void validateTimeFormat(String expirationDate) {

		validateRequiredField(expirationDate);
		Pattern timePattern = Pattern.compile(CommonConstants.TIME_PATTERN);
		Matcher timeMatcher = timePattern.matcher(expirationDate);
		if (!timeMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1059_ERROR_CODE,
					CommonConstants.E1059_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validate file type
	 * 
	 * @param fileName
	 * @param allowedFileExtensions
	 * @return
	 */

	public void validateFiletype(String fileName, String allowedFileExtensions) {

		int lastIndex = fileName.lastIndexOf(CommonConstants.DOT);
		String inputFileExtension = fileName.substring(lastIndex, fileName.length());
		if (!allowedFileExtensions.contains(inputFileExtension.toLowerCase())) {

			logger.info("invalid file type");

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1014_ERROR_CODE,
					CommonConstants.E1014_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * checking the size of file (less than 5mb or not) if not then returning
	 * false else true
	 * 
	 * @param maxSize
	 * @param uploadfile
	 * @param userEmail
	 * @return true if less than or equal to 5mb
	 * @return false if greater than 5mb
	 * @throws Exception
	 */

	public void validateFileSize(long maxSize, MultipartFile uploadfile) {

		if (uploadfile.isEmpty()) {
			logger.info("file is empty");
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1024_ERROR_CODE,
					CommonConstants.E1024_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		} else if (uploadfile.getSize() > maxSize) {
			logger.info("file size exceeded");
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1015_ERROR_CODE,
					CommonConstants.E1015_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validating date format
	 * 
	 * @param fieldName
	 * @param expirationDate
	 */

	public void validateDateTimeFormat(String expirationDate) {

		validateRequiredField(expirationDate);
		Pattern datePattern = Pattern.compile(CommonConstants.DATE_TIME_PATTERN);
		Matcher dateMatcher = datePattern.matcher(expirationDate);
		if (!dateMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1066_ERROR_CODE,
					CommonConstants.E1066_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * validate date format
	 * 
	 * @param fieldName
	 * @param expirationDate
	 */
	public void validateDateFormat(String expirationDate) {

		validateRequiredField(expirationDate);
		Pattern datePattern = Pattern.compile(CommonConstants.DATE_PATTERN);
		Matcher dateMatcher = datePattern.matcher(expirationDate);
		if (!dateMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1016_ERROR_CODE,
					CommonConstants.E1016_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}

	}

	/**
	 * pattern to check alphabet, number, comma(',') space (' '), hyphen ('-'),
	 * dot ('.'), colon (':') , brackets ('()[]')
	 * 
	 * @param fieldValue
	 */
	public void validateAlphaNumericSplChar(String fieldValue) {

		boolean isValidPattern = Pattern.matches(CommonConstants.REGEX_ALPHA_NUMERIC_SPL_CHAR_PATTERN,
				fieldValue.trim());
		if (!isValidPattern) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * pattern to check alphabets only
	 * 
	 * @param fieldValue
	 */
	public void validateAlphabets(String fieldValue) {
		boolean isValidPattern = Pattern.matches(CommonConstants.REGEX_ALPHA_PATTERN, fieldValue.trim());
		if (!isValidPattern) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate field for alphabets
	 * 
	 * @param fieldValue
	 * @param fieldName
	 */
	public void validateAlphabetsWithFieldName(String fieldValue, String fieldName) {
		boolean isValidPattern = Pattern.matches(CommonConstants.REGEX_ALPHA_PATTERN, fieldValue.trim());
		if (!isValidPattern) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1152_ERROR_CODE,
					CommonConstants.E1152_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate if collection is null or empty
	 * 
	 * @param inputCollection
	 */
	public void validateRequiredCollection(Collection inputCollection) {
		if (CollectionUtils.isEmpty(inputCollection)) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate maximum characters
	 * 
	 * @param length
	 * @param fieldValue
	 */
	public void validateMaxCharacters(int length, String fieldValue) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		} else if (fieldValue.length() > length) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate field for alphabets and underscore
	 * 
	 * @param fieldValue
	 */
	public void validateAlphabetsAndUnderScore(String fieldValue) {
		validateRequiredField(fieldValue);

		Matcher matcher = Pattern.compile(CommonConstants.KEYBOARD_CODE_PATTERN).matcher(fieldValue.trim());
		if (!matcher.find()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1013_ERROR_CODE,
					CommonConstants.E1013_ERROR_DESCRIPTION);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate gumtree request
	 * 
	 * @param fieldValue
	 * @return
	 */
	public boolean validateGumtreeRequest(String fieldValue) {
		if (!fieldValue.equals(CommonConstants.GUMTREE_RESPONSE_TYPE)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1103_ERROR_CODE,
					CommonConstants.E1103_ERROR_DESCRIPTION);
			
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
		}
		return true;
	}

	/**
	 * validate gumtree request for koala's state
	 * 
	 * @param fieldValue
	 * @return
	 */
	public boolean validateGumTreeKoalaState(String fieldValue) {

		if (!CommonConstants.getKoalaStatusList().contains(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1108_ERROR_CODE,
					CommonConstants.E1108_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
			}
		return true;

	}

	/**
	 * validate gumtree request for koala's mac address
	 * 
	 * @param fieldValue
	 * @return
	 */
	public boolean validateGumTreeMacAddress(String fieldValue) {
		Matcher matcher = Pattern.compile(CommonConstants.MAC_ADDRESS_PATTERN).matcher(fieldValue.trim());
		if (!matcher.find()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1104_ERROR_CODE,
					CommonConstants.E1104_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
		}

		return true;
	}

	/**
	 * validate gumtree request for rhie id
	 * 
	 * @param fieldValue
	 * @return
	 */
	public ErrorInfo validateGumTreeRhieId(String fieldValue) {

		if (fieldValue.length() != 4) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1105_ERROR_CODE,
					CommonConstants.E1105_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
		}
		return null;

	}

	/**
	 * validate gumtree request for required object
	 * 
	 * @param objectValue
	 * @return
	 */
	public boolean validateGumTreeRequiredObject(Object objectValue) {

		if (null == objectValue) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
		}
		return true;

	}

	/**
	 * validate gumtree request for serial number
	 * 
	 * @param fieldValue
	 * @return
	 */
	public boolean validateGumTreeSerialNumber(String fieldValue) {

		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1107_ERROR_CODE,
					CommonConstants.E1107_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
		}
		return true;

	}

	/**
	 * validate field for required length
	 * 
	 * @param officeName
	 * @param length
	 * @return
	 */
	public boolean validateLengthRequiredField(String officeName, Integer length) {
		officeName = officeName.trim();
		if (officeName.length() < length || officeName.length() > 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1132_ERROR_CODE,
					CommonConstants.E1132_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ServiceException(errorInfo);
		}
		return true;
	}

	/**
	 * validate boolean input
	 * 
	 * @param action
	 */
	public void validateAllowBoolean(Boolean action) {
		if (action == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1142_ERROR_CODE,
					CommonConstants.E1142_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validates date input and throws ThirdPartyException error in case
	 * validation fails
	 * 
	 * @param fieldValue
	 */
	public void validateDateWithThirdPartyError(String fieldValue) {

		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1011_ERROR_CODE,
					CommonConstants.E1011_ERROR_DESCRIPTION);
			throw new ThirdPartyException(errorInfo);

		}

		Pattern datePattern = Pattern.compile(CommonConstants.DATE_PATTERN);
		Matcher dateMatcher = datePattern.matcher(fieldValue);
		if (!dateMatcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1016_ERROR_CODE,
					CommonConstants.E1016_ERROR_DESCRIPTION);
			throw new ThirdPartyException(errorInfo);

		}

	}

	/**
	 * validate gum tree request type
	 * 
	 * @param fieldValue
	 * @return
	 */
	public boolean validateGumTreeRequestType(String fieldValue) {
		if (!fieldValue.equals(CommonConstants.GUMTREE_REQUEST_TYPE)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1145_ERROR_CODE,
					CommonConstants.E1145_ERROR_DESCRIPTION);
			logger.info(errorInfo);
			throw new ThirdPartyException(errorInfo);
			}
		return true;
	}

	/**
	 * validates required number
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateRequiredNumberField(Long fieldValue, String fieldName) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}
		if (fieldValue == 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1146_ERROR_CODE,
					CommonConstants.E1146_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validates required number
	 * 
	 * @param fieldName
	 * @param fieldValue
	 */
	public void validateRequiredNumberField(long fieldValue, String fieldName) {
		if (fieldValue <= 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * Validates required field
	 * 
	 * @param fieldValue
	 * @param fieldName
	 */
	public void validateRequiredField(String fieldValue, String fieldName) {
		if (StringUtils.isEmpty(fieldValue)) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate field for length range
	 * 
	 * @param fieldValue
	 * @param fieldName
	 * @param minLength
	 * @param maxLength
	 */
	public void validateRequiredFieldWithLength(String fieldValue, String fieldName, Integer minLength,
			Integer maxLength) {
		fieldValue = fieldValue.trim();
		if (StringUtils.isEmpty(fieldValue) || fieldValue.length() > maxLength || fieldValue.length() < minLength) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}
	}

	/**
	 * validate input long array field
	 * 
	 * @param groupId
	 * @param fieldName
	 */
	public void validateRequiredLongArray(Long[] groupId, String fieldName) {
		if (groupId == null || groupId.length == 0) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}

	}

	/**
	 * validate field for boolean input
	 * 
	 * @param fieldValue
	 * @param fieldName
	 */
	public void validateRequiredFieldForBoolean(Boolean fieldValue, String fieldName) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate field for long value
	 * 
	 * @param fieldValue
	 * @param fieldName
	 */
	public void validateRequiredFieldForLong(Long fieldValue, String fieldName) {
		if (fieldValue == null) {
			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1147_ERROR_CODE,
					CommonConstants.E1147_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);
		}
	}

	/**
	 * validate field on the basis of a particular pattern
	 * 
	 * @param field
	 * @param pattern
	 * @param fieldName
	 */
	public void validatePattern(String field, String pattern, String fieldName) {
		validateRequiredField(field);
		Pattern patternToMatch = Pattern.compile(pattern);
		Matcher matcher = patternToMatch.matcher(field);
		if (!matcher.matches()) {

			ErrorInfo errorInfo = errorCodeHelper.getErrorInfo(CommonConstants.E1152_ERROR_CODE,
					CommonConstants.E1152_ERROR_DESCRIPTION, fieldName);
			throw new ServiceException(errorInfo);

		}

	}
}
