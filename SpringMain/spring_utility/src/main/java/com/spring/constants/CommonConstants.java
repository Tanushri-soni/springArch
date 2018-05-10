package com.spring.constants;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Class containing common Constants
 *
 */
public class CommonConstants {

	/**
	 * private constructor to prevent initialization directly
	 */
	private CommonConstants() {
	}
	// Controller Constants

	// Validation Constants

	// Regex expression Constants
	public static final String EMAIL_REGEX = "^[a-z0-9._%+-]+@[a-z0-9-]+(\\.[a-z]{2,6}){1,2}$";
	public static final String EMAIL_REGEX_LMS = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+(\\.[A-Za-z]{2,6}){1,2}$";
	public static final String DATE_PATTERN = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
	
	public static final String DATE_TIME_PATTERN = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01]) (00|0?[0-9]|1[0-9]|2[0-3]):([0-9]|[0-5][0-9]):([0-9]|[0-5][0-9])$";
	public static final String KEYBOARD_CODE_PATTERN = "^[a-zA-Z0-9_]+$";
	public static final String MAC_ADDRESS_PATTERN = "^([0-9A-Fa-f]{2}[:]){5}([0-9A-Fa-f]{2})$";
	// pattern to check alphabet, number, comma(',') space (' '), hyphen ('-'),
	// dot ('.'), colon (':') , brackets ('()[]')
	public static final String REGEX_ALPHA_NUMERIC_SPL_CHAR_PATTERN = "[a-zA-Z0-9., \\-:()\\[\\]]*$";

	public static final String REGEX_ALPHA_PATTERN = "^[\\p{L} .']+$";

	// Exception message constants
	public static final String MISSING_FIELD_EXCEPTION_MESSAGE = "Required Field Missing:";
	public static final String INVALID_DATA_EXCEPTION_MESSAGE = "Invalid Value Passed for Field:";

	// User Test Data
	public static final int RH_USER_LEVEL = 4;
	public static final int RH_USER_DEFAULT_VERSION_ID = 0;
	public static final int RH_USER_ROLE_ID = 10;
	public static final int RH_USER_ACTIVE_STATUS_ID = 25;
	public static final String RH_USER_DEFAULT_CONTACT_NUMBER = null;
	public static final Long RH_USER_CREATED_BY = 1L;
	public static final String RH_USER_LOGIN_ID = null;
	public static final String RH_USER_LOGIN_PASSWORD = null;
	public static final String RH_USER_PARENT_ID = "1";

	// Exam Master Test Data
	public static final int RH_EXAM_MASTER_DEFAULT_VERSION_ID = 0;
	public static final int RH_EXAM_MASTER_ACTIVE_STATUS_ID = 45;
	public static final Long RH_EXAM_MASTER_CREATED_BY = 1L;
	public static final String RH_EXAM_MASTER_EXAM_NAME = "Java Exam";

	// User Eligibility Test Data
	public static final int RH_USER_ELIGIBILITY_DEFAULT_VERSION_ID = 0;
	public static final Long RH_USER_ELIGIBILITY_CREATED_BY = 1L;

	// RhLms Class Fields
	public static final String RH_LMS = "LMS";
	public static final String RH_LMS_USER = "user";
	public static final String RH_LMS_EXAM_CODE = "examCode";

	public static final String RH_LMS_EXPIRATION_DATE = "expirationDate";

	// RhUser Class Fields
	public static final String RH_USER_FIRST_NAME = "firstName";
	public static final String RH_USER_LAST_NAME = "lastName";
	public static final String RH_USER_CERTIFICATION_ID = "certificationId";
	public static final String RH_USER_CONTACT_NO = "userContactno";

	// Location Search constants
	public static final int NAME_INDEX = 1;
	public static final String REGION_ID = "regionId";
	public static final String KEYBOARD_TYPE_QUERY_PARAMETER = "keyboardType";
	public static final String KEYBOARD_TYPE = "KEYBOARD_TYPE";
	public static final String INPUT_TYPE_PARAMETER = "inputType";
	public static final String OUTPUT_TYPE_PARAMETER = "outputType";
	public static final String LOCATION_DATA_URL = "/location/type.json";
	public static final String SEARCH_LOCATION_URL = "/locations.json/{pageNumber}";
	public static final String PAGE_NUMBER = "pageNumber";
	public static final String PAGE_SIZE = "pageSize";
	public static final String KEYBOARD_TYPE_ID = "keyboardTypeId";
	public static final String ACTIVE_LOCATION_STATUS = "Active";
	public static final String ADD_ENTITY_URL = "/common/entity.json";
	public static final String GET_ENUM_AND_SEQUENCE = "GET_ENUM_AND_SEQUENCE";
	public static final String RESULT = "result";
	public static final String UPDATE_RESULT_MESSAGE = "Record updated successfully";
	public static final String RESULT_MESSAGE = "Record updated successfully";
	public static final String ADD_RESULT_MESSAGE = "Record added successfully";
	public static final String CANDIDATE_EXAM_STATUS_ENUM = "CANDIDATE_EXAM_STATUS";
	public static final String CANDIDATE_EXAM_STATUS_PASS = "PASS";
	public static final String CANDIDATE_EXAM_STATUS_FAIL = "FAIL";
	public static final String GUMTREE_REQUEST_TYPE = "session.result";
	public static final String GUMTREE_UPDATE_CANDIDATE_EXAM_STATUS = "/integration/v1/gumtree/scheduleexam/status.json";

	public static final String STATUS_ACTIVE = "ACTIVE";
	public static final String STATUS_PENDING = "PENDING";
	public static final String KOALA_STATUS_RETIRED = "RETIRED";
	public static final String STATUS_UNAVAILABLE = "UNAVAILABLE";
	public static final String LOCATION_STATUS_RETIRE = "RETIRE";

	public static final String LOCATION_STATUS = "LOCATION_STATUS";
	public static final String LOCATION_RHIE_STATUS = "LOCATION_RHIE_STATUS";
	public static final String LOCATION_DETAILS = "/location.json";

	// query Constants
	public static final String GET_TIMEZONE_BY_LOCATION_ID = "GET_TIMEZONE_BY_LOCATION_ID";
	public static final String GET_SCHEDULED_EXAMS_OF_LOCATION = "GET_SCHEDULED_EXAMS_OF_LOCATION";
	public static final String GET_LOCATION_BY_LOCATION_ID = "GET_LOCATION_BY_LOCATION_ID";
	public static final String GET_USER_EXAM_DELIVERIES_LOCATION = "GET_USER_EXAM_DELIVERIES_LOCATION";
	public static final String GET_USER_EXAM_DELIVERIES_REGION = "GET_USER_EXAM_DELIVERIES_REGION";
	public static final String GET_USER_EXAM_DELIVERIES_FROMDATE = "GET_USER_EXAM_DELIVERIES_FROMDATE";
	public static final String GET_USER_EXAM_DELIVERIES_TODATE = "GET_USER_EXAM_DELIVERIES_TODATE";
	public static final String GET_USER_EXAM_DELIVERIES_STATUS = "GET_USER_EXAM_DELIVERIES_STATUS";
	public static final String GET_USER_EXAM_DELIVERIES = "GET_USER_EXAM_DELIVERIES";
	public static final String GET_ALL_EXPIRED_ELIGIBILITY = "GET_ALL_EXPIRED_ELIGIBILITY";
	public static final String GET_LMS_MESSAGE_STATUS_BY_UUID = "GET_LMS_MESSAGE_STATUS_BY_UUID";
	public static final String GET_LMS_DATA_FOR_ALL = "GET_LMS_DATA_FOR_ALL";
	public static final String GET_USER_BY_EMAIL_AND_RHID = "GET_USER_BY_EMAIL_AND_RHID";
	public static final String UPDATE_BLACKLISTED_EXAM = "UPDATE_BLACKLISTED_EXAM";
	public static final String GET_PROCTOR_GROUP_DETAILS = "GET_PROCTOR_GROUP_DETAILS";
	public static final String GET_RHI_PROCTOR_BY_ID = "GET_RHI_PROCTOR_BY_ID";
	public static final String GET_PROCTOR_GROUP_DETAILS_FOR_GLOBAL_ADMIN = "GET_PROCTOR_GROUP_DETAILS_FOR_GLOBAL_ADMIN";
    public static final String GET_PROCTOR_MASTER_GROUP_DETAILS_FOR_GLOBAL_ADMIN = "GET_PROCTOR_MASTER_GROUP_DETAILS_FOR_GLOBAL_ADMIN";
	public static final String GET_COUNTRY_LIST_ADMIN = "GET_COUNTRY_LIST_ADMIN";
	public static final String GET_COUNTRY_LIST_IDENTITY_IS_REQUIRED = "GET_COUNTRY_LIST_IDENTITY_IS_REQUIRED";
	public static final String GET_ORDERED_COUNTRY_LIST = "GET_ORDERED_COUNTRY_LIST";
	public static final String GET_REGION_LIST = "GET_REGION_LIST";
	public static final String GET_REGION_BASED_ON_USER_ID = "GET_REGION_BASED_ON_USER_ID";
	public static final String GET_STATE_LIST_BY_COUNTRY_ID = "GET_STATE_LIST_BY_COUNTRY_ID";
	public static final String GET_CITY_LIST_BY_STATE_ID = "GET_CITY_LIST_BY_STATE_ID";
	public static final String GET_KEYBOARD_TYPE_LIST = "GET_KEYBOARD_TYPE_LIST";
	public static final String GET_LOCATION_LIST_ADMIN = "GET_LOCATION_LIST_ADMIN";
	public static final String GET_LOCATION_LIST_BY_BUSINESS_CENTER_ID = "GET_LOCATION_LIST_BY_BUSINESS_CENTER_ID";
	public static final String FIND_TOKEN_BY_USER = "FIND_TOKEN_BY_USER.HQL";
	public static final String FIND_KEY_BY_TOKEN = "FIND_KEY_BY_TOKEN.HQL";
	public static final String GET_USER_VERSION_ID = "getUserVersionId.hql";
	public static final String REGION_STATUS = "REGION_STATUS";
	public static final String ENUM_ITEM_REGION_STATUS = "ACTIVE";
	public static final String GET_USER_INFO_BY_EMAIL = "GET_USER_INFO_BY_EMAIL";
	public static final String GET_FAILED_EMAIL_LIST = "GET_FAILED_EMAIL_LIST";
	public static final String UPDATE_SCHEDULED_RECORD_PICKED_FOR_MAIL_STATUS = "UPDATE_SCHEDULED_RECORD_PICKED_FOR_MAIL_STATUS";
	public static final String GET_POLICY = "POLICY.HQL";
	public static final String GET_FAQ = "FAQ.HQL";
	public static final String GET_CANDIDATE_EXAM_LIST = "GET_CANDIDATE_EXAM_LIST.HQL";
	public static final String CHECK_IS_IDENTITY_REQUIRED_FOR_COUNTRY = "CHECK_IS_IDENTITY_REQUIRED_FOR_COUNTRY";
	public static final String GET_COUNTRY_LIST = "GET_COUNTRY_LIST";
	public static final String GET_STATE_LIST = "GET_STATE_LIST";
	public static final String GET_CITY_LIST = "GET_CITY_LIST";
	public static final String GET_TIMEZONE_BY_CITYID = "GET_TIMEZONE_BY_CITYID";
	public static final String GET_ALL_TIMEZONE = "GET_ALL_TIMEZONE";
	public static final int LOCATION_INDEX = 3;
	public static final String GET_LOCATION_LIST_BASED_ON_LOGGED_IN_USER = "GET_LOCATION_LIST_BASED_ON_LOGGED_IN_USER";
	public static final String GET_NOMINEE_LIST = "GET_NOMINEE_LIST";
	public static final String GET_NOMINEE_LIST_REGIONAL = "GET_NOMINEE_LIST_REGIONAL";
	public static final String GET_NOMINEE_LIST_SITE = "GET_NOMINEE_LIST_SITE";
	public static final String GET_NOMINEE_LIST_ORDER_BY = "GET_NOMINEE_LIST_ORDER_BY";
	public static final String GET_UNIVERSAL_HOUR_OF_OPERATION = "GET_UNIVERSAL_HOUR_OF_OPERATION";
	public static final String GET_COUNT_OF_PENDING_ID = "GET_COUNT_OF_PENDING_ID";
	public static final String GET_COUNT_OF_PENDING_ID_REGIONAL_ADMIN = "GET_COUNT_OF_PENDING_ID_REGIONAL_ADMIN";
	public static final String GET_LOCATION_LIST = "GET_LOCATION_LIST";
	public static final String GET_BLACKLISTED_LOCATIONS = "GET_BLACKLISTED_LOCATIONS";
	public static final String GET_EXAM_CODE = "GET_EXAM_CODE";
	public static final String GET_PROCTOR_DETAILS = "GET_PROCTOR_DETAILS";
	public static final String GET_PROCTOR_SESSION_DETAILS = "GET_PROCTOR_SESSION_DETAILS";
	public static final String CHECK_ELIGIBILITY_EXISTS = "CHECK_ELIGIBILITY_EXISTS.HQL";
	public static final String GET_ELIGIBILITY_ID = "GET_ELIGIBILITY_ID";
	public static final String GET_EXAM_SCHEDULE_DETAIL_BY_ELIGIBILITY_CODE = "GET_EXAM_SCHEDULE_DETAIL_BY_ELIGIBILITY_CODE.HQL";
	public static final String GET_EXAM_STATUS_CODES_LIST = "GET_EXAM_STATUS_CODES_LIST";
	public static final String GET_EXAM_DELIVERIES_STATUS_CODES_LIST="GET_EXAM_DELIVERIES_STATUS_CODES_LIST";
	public static final String GET_USER_ROLE = "GET_USER_ROLE";
	public static final String GET_USER_ROLE_ID = "GET_USER_ROLE_ID";
	public static final String GET_EXAM_NAME_CODE_LIST = "GET_EXAM_NAME_CODE_LIST";
	public static final String GET_EXAM_LIST_COUNT = "GET_EXAM_LIST_COUNT";
	public static final String GET_ENUM_ITEM_LIST = "GET_ENUM_ITEM_LIST";
	public static final String GET_EXAM_LIST_LOCATION_SETTINGS = "GET_EXAM_LIST_LOCATION_SETTINGS";
	public static final String GET_ENUM_ITEM_LOCATION_KOALA = "GET_ENUM_ITEM_LOCATION_KOALA";
	public static final String GET_LOCATION_DETAILS = "GET_LOCATION_DETAILS";
	public static final String GET_PROCTOR_GROUP = "GET_PROCTOR_GROUP_BASED_ON_LOCATION";
	public static final String UPDATE_NOTIFICATION_STATUS = "UPDATE_NOTIFICATION_STATUS";
	public static final String GET_CANDIDATE_ID_NOTIFICATION_DETAIL = "GET_CANDIDATE_ID_NOTIFICATION_DETAIL";
	public static final String GET_ELIGIBILITY_CANCELLATION = "GET_ELIGIBILITY_CANCELLATION";
	public static final String GET_EXAM_SCHEDULE_DTL_BY_ELIGIBILITY_RHID_STATUS = "GET_EXAM_SCHEDULE_DTL_BY_ELIGIBILITY_RHID_STATUS";
	public static final String GET_EXAM_RETIRE_STATUS = "GET_EXAM_RETIRE_STATUS";
	public static final String GET_USER_BY_RHID_UUID = "GET_USER_BY_RHID_UUID";
	public static final String GET_BUSINESS_CENTER_LIST = "GET_BUSINESS_CENTER_LIST";
	public static final String GET_PROCTOR_GROUP_LIST = "GET_PROCTOR_GROUP_LIST";
	public static final String GET_USER_BY_RHID = "GET_USER_BY_RHID";
	public static final String FAILED = "FAILED";
	public static final String GET_KOALA_DETAILS = "GET_KOALA_DETAILS_FOR_ACTIVE";
	public static final String MAC_ADDRESS = "macAddress";
	public static final String GET_USER_EXAM_DELIVERIES_APPEND1 = "GET_USER_EXAM_DELIVERIES_APPEND1";
	public static final String GET_ACTIVE_USER_OF_SIMILAR_RHID = "GET_ACTIVE_USER_OF_SIMILAR_RHID";
	public static final String GET_USER_EXAM_DELIVERIES_APPEND2 = "GET_USER_EXAM_DELIVERIES_APPEND2";
	public static final String GET_LIST_OF_USERS = "GET_LIST_OF_USERS";
	public static final String GET_COUNTRY_BY_LOCATION_ID = "GET_COUNTRY_BY_LOCATION_ID";
	public static final String GET_COUNT_OF_FAILED_LMS_MESSAGES = "GET_COUNT_OF_FAILED_LMS_MESSAGES";
	public static final String ADD_ORDER_BY_COUNTRY = "ADD_ORDER_BY_COUNTRY";
	public static final String GET_TIMEZONE_DESCRIPTION_BY_CODE ="GET_TIMEZONE_DESCRIPTION_BY_CODE";
	public static final String GET_USER_EXAM_DELIVERIES_APPEND3 = "GET_USER_EXAM_DELIVERIES_APPEND3";
	public static final String GET_USER_EXAM_DELIVERIES_APPEND4 = "GET_USER_EXAM_DELIVERIES_APPEND4";

	public static final String GET_USER_EXAM_DELIVERIES_APPEND5 = "GET_USER_EXAM_DELIVERIES_APPEND5";

	public static final String GET_USER_EXAM_DELIVERIES_APPEND6 = "GET_USER_EXAM_DELIVERIES_APPEND6";
	public static final String GET_USER_EXAM_DELIVERIES_IF_IS_TIMEZONE = "GET_USER_EXAM_DELIVERIES_IF_IS_TIMEZONE";
	public static final String GET_USER_EXAM_DELIVERIES_FROM_WHERE = "GET_USER_EXAM_DELIVERIES_FROM_WHERE";
	
	public static final String GET_BLACKLISTED_KOALA = "GET_BLACKLISTED_KOALA";
	public static final String UPDATE_IDLE_TIME_FOR_CHAT = "UPDATE_IDLE_TIME_FOR_CHAT";
	public static final String GET_IDLE_TIME_FOR_CHAT = "GET_IDLE_TIME_FOR_CHAT";

	// get location mail dtl object based on location id
	public static final String GET_LOCATION_USER_DTL_BY_LOC = "GET_LOCATION_USER_DTL_BY_LOC";

	public static final String UPDATE_EXAM_STATUS = "UPDATE_EXAM_STATUS";

	public static final String UPDATE_ACTIVE_EXAM_STATUS = "UPDATE_ACTIVE_EXAM_STATUS";

	public static final String GET_LOCATION_USER_TYPE_LIST = "GET_LOCATION_USER_TYPE_LIST";
	public static final String UPDATE_RHIE_STATUS = "UPDATE_RHIE_STATUS";
	public static final String GET_LOCATION_ID = "GET_LOCATION_ID";

	public static final String GET_NEXTDAY_EMAIL_DETAILS = "GET_NOMINEE_EMAIL_DETAILS";

	public static final String GET_EXCEPTION_CALENDAR_YEARS = "GET_EXCEPTION_CALENDAR_YEARS";
	public static final String GET_EXCEPTION_CALENDAR_YEARS_JOIN = "GET_EXCEPTION_CALENDAR_YEARS_JOIN";
	public static final String GET_EXCEPTION_CALENDAR_YEARS_WHERE = "GET_EXCEPTION_CALENDAR_YEARS_WHERE";
	public static final String GET_EXCEPTION_CALENDAR_YEARS_SITE_ADMIN = "GET_EXCEPTION_CALENDAR_YEARS_SITE_ADMIN";
	public static final String GET_EXCEPTION_CALENDAR_YEARS_REGIONAL_ADMIN = "GET_EXCEPTION_CALENDAR_YEARS_REGIONAL_ADMIN";

	public static final String GET_EXAM_SCHEDULED_LIST = "GET_EXAM_SCHEDULED_LIST";

	public static final String GET_APP_CONFIGURATION_BY_CODE = "GET_APP_CONFIGURATION_BY_CODE";

	// get exam schedules based within date range
	public static final String GET_SCHEDULED_EXAM_DETAILS_BY_DATE = "GET_SCHEDULED_EXAM_DETAILS_BY_DATE";
	public static final String GET_SCHEDULED_EXAM_DETAILS_BY_DATE_BY_LOCATION = "GET_SCHEDULED_EXAM_DETAILS_BY_DATE_BY_LOCATION";

	// get lms Failed Records for backup script
	public static final String GET_LMS_DATE_FOR_FAILED_RECORDS = "GET_LMS_DATE_FOR_FAILED_RECORDS";

	// file related constants
	public static final long MAX_SIZE = 5;
	public static final String FILE_EXTENSIONS = ".jpg,.pdf,.png,.jpeg";
	public static final String RELATIVE_WEB_PATH = "/KoaLAScheduler_web/WEB-INF/classes/files";
	public static final String NO_EMAIL_FOUND = "No user found with mentioned Email";
	public static final String FILE_UPLOADED = "Your Id has been uploaded successfully and has been sent for approval";
	public static final String INVALID_FILE_SIZE = "ApprovalId size exceeded";
	public static final String INVALID_FILE_TYPE = "Invalid type of ApprovalId";
	public static final String USER_IDENTITY_STATUS = "USER_IDENTITY_STATUS";
	public static final String PENDING = "PENDING";
	public static final String NO_APPROVAL_ID = "No approval id uploaded";
	public static final String EMAIL = "email";
	public static final String NOT_CANDIDATE_EMAIL = "email id doesnot belong to candidate";
	public static final String NO_STATUS_FOR_CANDIDATE = "no status found for this candidate";
	public static final String UPLOAD_FILE_URL = "/upload";
	public static final String REQUEST_PARAM_FILE = "file";
	public static final String SLASH = "/";
	public static final char DOT = '.';
	public static final int ONE_ZERO_TWO_FOUR = 1024;
	public static final String DOT_WAR = ".war";

	// Rest API End point
	public static final String EXAM_ADD_URL = "/exams.json";
	public static final String POLICY_URL = "/country/policy.json";
	public static final String FIND_URL = "/common/user.json";
	public static final String COMMON_USER_URL = "/user/v1";
	public static final String UPLOAD_URL = "/user/identity.json";
	public static final String COMMON_ADMIN_URL = "/admin/v1";
	public static final String COMMON_COMMON_URL = "/common/v1";
	public static final String COMMON_LOCATION_URL = "/location/v1";
	public static final String COMMON_EXAM_URL = "/exam/v1";
	public static final String COMMON_SCHEDULE_EXAM_URL = "/scheduleexam/v1";
	public static final String COMMON_CALENDAR_URL = "/calendar/v1";

	public static final String FAQ_URL = "/user/faq.json";
	public static final String USER_EXAM_URL = "/user/exam.json";

	public static final String LOCATION_SEARCH = "/location/name.json";

	public static final String LOGOUT_URL = "/common/logout.json";
	public static final String IDP_LOGOUT_URL="IDP_LOGOUT_URL";
	public static final String LOGOUT_MESSAGE = "logged out successfully";
	public static final String GET_RH_USER_TOKEN_BY_TOKEN = "GET_RH_USER_TOKEN_BY_TOKEN";
	// Country List api
	public static final String COUNTRY_LIST = "/countries.json";

	public static final String EXAM_SLOTS_URL = "/exam/slots.json";
	// Exam Status Code List API
	public static final String EXAM_CODE_LIST_URL = "/exams/codes.json";

	// exam search list url
	public static final String EXAM_SEARCH_LIST = "/exams.json/{pageNumber}";

	// check exam retire status url
	public static final String CHECK_EXAM_RETIRE_STATUS = "/exam/status.json";

	// api url to save and update a location
	public static final String SAVE_UPDATE_LOCATION_URL = "/locations.json";

	// api to remove nominee
	public static final String REMOVE_NOMINEE_URL = "/location/nominee.json";
	public static final String ADD_NOMINEES_URL = "/location/nominee.json";

	// api to manage exception calendar for a location
	public static final String ADD_EXCEPTION_CALENDAR = "/location/exception.json";
	public static final String EXCEPTION_CALENDAR_YEAR = "/location/exception/years.json";

	public static final String GET_CONCURRENT_EXAM_NUMBER = "/scheduleexam/count.json";
	public static final String SET_CONCURRENT_EXAM_NUMBER = "/exam.json";

	// global admin details
	public static final String GLOBAL_ADMIN_LIST = "/admin.json/{pageNumber}";
	public static final String GET_GLOBAL_ADMIN_COUNT = "GET_GLOBAL_ADMIN_COUNT";
	public static final String GET_GLOBAL_ADMIN_LIST = "GET_GLOBAL_ADMIN_LIST";
	public static final String UPDATE_LOCATION_STATUS_VIA_KOALA = "UPDATE_LOCATION_STATUS_VIA_KOALA";
	public static final String GET_ACTIVE_LOCATION_FOR_KOALA = "GET_ACTIVE_LOCATION_FOR_KOALA";
	public static final String SCHEDULED_STATUS_LIST = "scheduledStatusList";
	public static final String COMPLETED_STATUS_LIST = "completedStatusList";
	public static final String NOMINEES_LIST = "/location/nominees.json/{pageNumber}";
	public static final String LOCATIONS_LIST = "/locations.json";
	public static final String EXAM_DELIVERIES_URL = "/scheduleexams.json/{pageNumber}";
	public static final String EFFECTIVE_DATE = "effectiveDate";

	public static final String CHANGE_IDENTITY_STATUS = "/common/status.json";
	public static final String STATUS_MESSAGE_SUCCESS = "status has been changed successfully!!";
	public static final String UPDATE_BLACK_LISTED_EXAM = "/location/exam.json";
	public static final String UPDATE_USER_STATUS = "UPDATE_USER_STATUS";
	public static final String UPDATE_LOCATION_STATUS = "UPDATE_LOCATION_STATUS";
	public static final String GET_KOALA_LIST = "GET_KOALA_LIST";
	public static final String GET_RETENTION_POLICY_DATA = "GET_RETENTION_POLICY_DATA";
	public static final String GUMTREE_GET_EXAM_SCHEDULES = "GUMTREE_GET_EXAM_SCHEDULES";
	public static final String GUMTREE_GET_EXAM_SCHEDULES_WITH_RHIE = "GUMTREE_GET_EXAM_SCHEDULES_WITH_RHIE";

	// LMS
	public static final String ADD_LMS_DATA_URL = "/lms/v1/lms-data";
	public static final String CANCEL_ELIGIBILITY_URL = "/lms/v1/exam/eligibility";
	public static final String GENERATE_TOKEN_URL = "/user/token.json";
	public static final String COMMON_USER_LOGIN_URL = "/user/v1";
	public static final String SIMPLE_DATE_FORMAT_VALUE = "yyyy-MM-dd";
	public static final String INCORRECT_DATE_FORMAT_MESSAGE = "date should be in this  format yyyy-MM-dd";
	public static final String LMS_AUTHORIZATION_TOKEN = "LMS_AUTHORIZATION_TOKEN_TOLMS";
	public static final String RH_LMS_USER_CREATED_BY = "LMS_USER";
	public static final String AMQ_LMS_URL = "LMS_AMQ_URL";
	public static final String PST_TIME_ZONE = "PST";
	public static final String LMS_MAIL_TO = "LMS_MAIL_TO";
	public static final String LMS_MAIL_BODY = "LMS_MAIL_BODY";
	public static final String LMS_MAIL_SUBJECT = "LMS_MAIL_SUBJECT";
	public static final String LMS_REVENUE_NO_STATUS = "NO";
	public static final String LMS_REVENUE_YES_STATUS = "YES";
	public static final String LMS_REQUEST_AUTHORIZATION_TOKEN = "LMS_REQUEST_AUTHORIZATION_TOKEN_FRMLMS";
	public static final String SQS_REQUEST_AUTHORIZATION_TOKEN = "SQS_REQUEST_AUTHORIZATION_TOKEN";
	public static final String NAME_PATTERN = "^[a-zA-Z0-9!@#*^%!:;'$&()\\-`.+,/\"]*$";

	// GumTree
	public static final String MACADDRESS = "macAddress";
	public static final String ENUM_ITEM_LOACTION_RHIE_STATUS_ID = "enumItemLocationRhieStatusId";
	public static final String KOALA_STATUS_DEATIL = "detail";
	public static final String SERIAL_NUMBER = "serialNumber";
	public static final String RHIE_ID = "rhieId";
	public static final String SQS_TIMESTAMP = "timestamp";
	public static final String GUMTREE_RESPONSE_TYPE = "rhie.status";
	public static final String KOALA_STATUS_FAILED = "FAILED";
	public static final String KOALA_STATUS_NEW = "NEW";
	public static final String KOALA_STATUS_INSTALLING = "INSTALLING";
	public static final String KOALA_STATUS_TESTING = "TESTING";
	public static final String KOALA_STATUS_ACTIVE = "ACTIVE";
	public static final String TYPE = "type";
	public static final String STATUS_UPDATE = "status.update";

	// gumtree candidate registration request
	public static final String EXAM_START_TIME = "c_starttime";
	public static final String EXAM_SETUP_START_TIME = "e_setuptime";
	public static final String GUMTREE_EXAM_SCHEDULE_STATUS = "r_status";
	public static final String CANDIDATE_COUNTRY = "c_country";

	public static final String GUMTREE_GET_KOALA_STATUS = "/integration/v1/gumtree/koala/status.json";
	public static final String GUMTREE_CANDIATE_REGISTRATION_REQUEST = "/integration/v1/gumtree/candidate/data.json";
	public static final String COMMON_GUMTREE_URL = "/integration/v1/integration/gumtree.json";

	private static final String[] GUMTREE_KOALA_STATE = { KOALA_STATUS_FAILED, KOALA_STATUS_NEW,
			KOALA_STATUS_INSTALLING, KOALA_STATUS_TESTING, KOALA_STATUS_ACTIVE };

	// common
	public static final int DEFAULT_PAGE_SIZE = 50;
	public static final int MAX_ALLOWED_PAGE_SIZE = 100;
	public static final int DEFAULT_PAGE_NO = 1;
	public static final String DEFAULT_TEARDOWN_TIME = "00:00:00";
	public static final String RHEXAM = "rhExam";
	public static final String ACTIVE_USER_STATUS_CODE = "ACTIVE_USER_STATUS_CODE";
	public static final String ISDELETED = "isDeleted";
	public static final String ACTIVE_USER_STATUS_CODE_SET_LONG = "activeUserStatusCode";
	public static final String USER_MAIL_ID = "userMailid";
	public static final String CODE_STATUS = "codeStatus";
	public static final String ENUM_ITEM_STATUS = "enumItemStatus";
	public static final String USER_IDENTITY_STATUS_SET_STRING = "userIdentityStatus";
	public static final String STATUS = "status";
	public static final String USER_ID = "userId";
	public static final String STATUS_ID = "statusId";
	public static final String DOUBLE_QUOTES = "";
	public static final String INVALID_DATA = "Invalid data";
	public static final String TOKEN = "token";
	public static final String QUERY_PROPERTIES = "query.properties";
	public static final String GET_EXAM_BY_EXAM_CODE_HQL = "GET_EXAM_BY_EXAM_CODE_HQL";
	public static final String EXAM_CODE = "examCode";
	public static final String EXAM_STATUS_ID = "examStatusId";
	public static final int EXAM_STATUS_ID_VALUE = 45;
	public static final String ELIGIBILITY_CODE = "eligibilityCode";
	public static final String ELIGIBILITY_EXPIRY = "eligibilityExpiry";
	public static final String SET_INTEGER_ROLE_ID = "roleId";
	public static final String NAME_ID_DATA_VALUE = "Value";
	public static final String FORMAT = "Format";
	public static final String SP_NAME_QUALIFIER = "SPNameQualifier";
	public static final String NAME_QUALIFIER = "NameQualifier";
	public static final String SAML_LOGOUT_REQUEST_DOCUMENT_URL = "/samlp:LogoutRequest/saml:Issuer";
	public static final String SAML_LOGOUT_REQUEST_DOCUMENT_URL_SESSION_INDEX = "/samlp:LogoutRequest/samlp:SessionIndex";
	public static final String ENUM_ROLE_CODE = "enumRoleCode";
	public static final int ONE = 1;
	public static final int ZERO = 0;
	public static final long TOKEN_GET_LAST_TIME = 60 * 1000L;
	public static final String ROLE = "role";
	public static final int TEN = 10;
	public static final int HUNDRED = 100;
	public static final int THOUSAND = 1000;
	public static final int SEVENTEEN = 17;
	public static final int FIFTY = 50;
	public static final String INVALID_EMAIL_ID = "Invalid Email Id-";
	public static final String DOT_MESSAGE = ".message";
	public static final String DOT_DESCRIPTION = ".description";
	public static final String TIMEZONECODE="timezoneCode";
	public static final String EXPIRATION_TIME = "EXPIRATION_TIME";
	public static final String EXAM_STATUS_PARAMETER_NAME = "examStatus";
	public static final int ID_INDEX = 0;
	public static final int CODE_INDEX = 1;
	public static final int ZIP_CODE_INDEX = 2;
	public static final int STREET_ADDRESS_INDEX = 3;
	public static final int CITY_INDEX = 4;
	public static final int STATE_INDEX = 5;
	public static final int COUNTRY_INDEX = 6;
	public static final int REGION_INDEX = 7;
	public static final int KEYBOARD_TYPE_INDEX = 8;
	public static final int COMBINED_ADDRESS_INDEX = 9;
	public static final int TIMEZONE_ID_INDEX = 10;
	public static final int TIMEZONE_CODE_INDEX = 11;
	public static final int LATITUDE_INDEX = 12;
	public static final int LONGITUDE_INDEX = 13;
	public static final int REGION_ID_INDEX = 14;
	public static final int COUNTRY_ID_INDEX = 15;
	public static final int KEYBOARD_TYPE_ID_INDEX = 16;
	public static final int LOCATION_STATUS_INDEX = 17;
	public static final int LOCATION_TIME_DETAIL_INDEX = 18;
	public static final String GET_EXAM_DETAIL = "/exam.json";
	public static final String NO_RECORD_FOUND = "No record found";
	public static final String MODIFIED_BY = "modifiedby";
	public static final String MODIFIED_ON = "modifiedon";
	public static final String UPDATE_PROCTOR_EXAM_SESSION_DTL = "UPDATE_PROCTOR_EXAM_SESSION_DTL";
	public static final String PROCTOR_UUID = "uuid";
	public static final String PRIMARY_PROCTOR_ID = "primaryProctor";
	public static final String OBSERVER_PROCTOR_ID = "observerProctor";
	public static final String GET_EXAM_START_DATE_TIME = "GET_EXAM_START_DATE_TIME";
	public static final String IS_RETIRED = "isRetired";
	public static final String SPLIT_AT_DOLLAR = "\\$";
	public static final String SPLIT_AT_SPACE = "\\s+";
	public static final String ACTION = "action";
	public static final String EXAM_ADDED = "added";
	public static final String EXAM_UPDATED = "updated";
	public static final String EXAM_CONFLICT = "conflict";
	public static final String EXAM_CONFLICT_LIST = "conflictList";
	public static final String EXAM_CONFLICTS_LIST = "conflicstList";
	public static final String USER_IDS = "userIds";
	// web mvc config ,webHibernateConfig and servlet
	public static final String DISPATCHER = "dispatcher";
	public static final String BASE_PACKAGES = "com.spring";
	public static final String SET_BASENAME = "classpath:koala-rhschedule-messages";
	public static final String SET_DEFAULT_ENCODING = "UTF-8";
	public static final int SET_CACHE_SECONDS = 2;
	public static final String MULTIPART_RESOLVER = "multipartResolver";
	public static final String QUERIES_PROPERTIES = "queries.properties";
	public static final String SYSTEM_PROPERTIES = "system.properties";
	public static final String PROPERTY_SOURCE_VALUE = "classpath:system.properties";
	public static final String PACKAGES_TO_SCAN_SECOND = "com.spring";
	public static final String PACKAGES_TO_SCAN_FIRST = "com.spring";
	public static final String JDBC_URL = "jdbc.url";
	public static final String JDBC_USERNAME = "jdbc.username";
	public static final String JDBC_PASS = "jdbc.password";
	public static final String CACHE_PREP_STMTS = "cachePrepStmts";
	public static final String PREP_STMT_CACHE_SIZE = "prepStmtCacheSize";
	public static final String PREP_STMT_CACHE_SQL_LIMIT = "prepStmtCacheSqlLimit";
	public static final String USE_SERVER_PREP_STMTS = "useServerPrepStmts";
	public static final String HIBERNATE_CACHEPREPSTMTS = "hibernate.hikari.dataSource.cachePrepStmts";
	public static final String HIBERNATE_PREPSTMTCACHESIZE = "hibernate.hikari.dataSource.prepStmtCacheSize";
	public static final String HIBERNATE_PREPSTMTCACHESQLLIMIT = "hibernate.hikari.dataSource.prepStmtCacheSqlLimit";
	public static final String HIBERNATE_USESERVERPREPSTMTS = "hibernate.hikari.dataSource.useServerPrepStmts";
	public static final String CLASSPATH_SYSTEM_PROPERTIES = "classpath:system.properties";

	// api to get exception calendar details
	public static final String GET_EXCEPTION_CALENDAR_LIST = "GET_EXCEPTION_CALENDAR_LIST";
	// api to remove exception calendar record
	public static final String REMOVE_EXCEPTION_CALENDAR_URL = "/location/exception/status.json";

	public static final String GET_EXCEPTION_CALENDAR = "/location/exception.json/{pageNumber}";
	public static final String YEAR = "year";
	public static final String START_TIME = "00:00:00";
	public static final String END_TIME = "23:59:59";
	public static final String S0015_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0015";

	/* Changes Related to Database Connection Issue */
	public static final Integer IDLE_TIME_OUT_MS = 60000;
	public static final Integer CONNECTION_TIME_OUT = 60000;
	public static final Integer VALIDATION_TIME_OUT = 30000;
	public static final Integer MAX_LIFE_TIME = 60000;
	/* Database Connection Issue Done Here */

	// Hibernate Properties
	public static final String HIBERNATE_DIALECT = "hibernate.dialect";
	public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	public static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
	public static final String HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
	public static final String HIBERNATE_CACHE_USE_QUERY_CACHE = "hibernate.cache.use_query_cache";
	public static final String HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = "hibernate.cache.use_second_level_cache";
	public static final String HIBERNATE_CACHE_REGION_FACTORY_CLASS = "hibernate.cache.region.factory_class";
	public static final String HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_PROP = "org.hibernate.envers.audit_table_suffix";
	public static final String HIBERNATE_ENVERS_AUDIT_TABLE_SUFFIX_VALUE = "_aud";
	public static final String HIBERNATE_ENVERS_STORE_DATA_AT_DELETE = "org.hibernate.envers.store_data_at_delete";
	public static final String HIBERNATE_JDBC_BATCH_SIZE = "hibernate.jdbc.batch_size";

	public static final String CHECK_USER_EXISTS = "CHECK_USER_EXIST";
	public static final String ENUM_ITEM_USER_STATUS = "PENDING";
	public static final String GET_REGIONAL_ADMIN_USERID = "GET_REGIONAL_ADMIN_USERID";
	public static final String EXAM_ID = "examId";
	// Bean
	public static final String QUERY_PROPERTY_READER = "propertyReader";
	public static final String ERROR_PROPERTY_READER = "errorPropertyReader";
	public static final String ERROR_CODE_HELPER = "errorCodeHelper";
	public static final String VALIDATION_UTILS = "validationUtillsReader";
	public static final String SYSTEM_PROPERTY_READER = "systemPropertyReader";
	public static final String CANDIDATE_SAML_PROPERTY_READER = "candidateSamlPropertyReader";
	public static final String ADMIN_SAML_PROPERTY_READER = "adminSamlPropertyReader";
	public static final String SYSTEM_FILE_PATH = "/opt/eap/standalone/configuration/";
	//public static final String SYSTEM_FILE_PATH = "C:\\opt\\jboss\\eap\\standalone\\configuration\\";

	// public static final String VERFICATION_ID_WEB_PATH =
	// "/opt/wildfly-10.1.0.Final/verificationIds";
	public static final String VERFICATION_ID_WEB_PATH = "CANDIDATE_ARTIFACT_PATH";
	
	// Cron patterns
	public static final String PUSH_MESSSAGES_TO_LMS_CRON_PATTERN = "PUSH_MESSSAGES_TO_LMS_CRON_PATTERN";
	public static final String PUSH_EXPIRED_ELIGIBILITIES_TO_LMS_CRON_PATTERN = "PUSH_EXPIRED_ELIGIBILITIES_TO_LMS_CRON_PATTERN";
	public static final String SEND_MAIL_CRON_PATTERN = "SEND_MAIL_CRON_PATTERN";

	public static final String QUERY_PROPERTIES_FILENAME = "query.properties";
	public static final String ERROR_PROPERTIES_FILENAME = "error.properties";

	public static final String ADD_PATH_PATTERN = "/**";
	public static final String EXCLUDE_PATH_PATTERN_GENERATE = "/user/**";
	public static final String EXCLUDE_PATH_PATTERN_SAML = "/saml/**";

	// Scheduling Actor/Role Code
	public static final String ROLE_CANDIDATE = "CANDIDATE";
	public static final String ROLE_SITE_ADMINISTRATOR = "SITE_ADMINISTRATOR";
	public static final String ROLE_REGIONAL_ADMINISTRATOR = "REGIONAL_ADMINISTRATOR";
	public static final String ROLE_GLOBAL_ADMINISTRATOR = "GLOBAL_ADMINISTRATOR";
	public static final String ROLE_PROCTOR = "PROCTOR";
	// saml property file
	public static final String CANDIDATE_SAML_PROPERTY_FILE = "candidate.saml.properties";
	public static final String ADMIN_SAML_PROPERTY_FILE = "admin.saml.properties";

	// saml session constants
	public static final String SAML_SESSION_ATTRIBUTE_ATTRIBUTES = "attributes";
	public static final String SAML_SESSION_ATTRIBUTE_NAME_ID = "nameId";
	public static final String SAML_SESSION_ATTRIBUTE_EMAIL_ADDRESS = "Email";
	public static final String SAML_EXTERNAL_FIRSTNAME_ATTRIBUTE = "First Name";
	public static final String SAML_EXTERNAL_LASTNAME_ATTRIBUTE = "Last Name";
	public static final String SAML_INTERNAL_EMAIL_ATTRIBUTE = "email";
	public static final String SAML_INTERNAL_RHID_ATTRIBUTE = "uid";
	public static final String SAML_INTERNAL_FIRSTNAME_ATTRIBUTE = "givenName";
	public static final String SAML_INTERNAL_LASTNAME_ATTRIBUTE = "sn";
	public static final String LMS = "Lms";
	// SAML

	public static final String SAML_LOGIN_URL = "/login";
	public static final String SAML_COMMON_URL = "/saml";
	public static final String HEADER_TOKEN = "X-Auth-Token";
	public static final String USER_ROLE = "userRole";
	public static final String RESPONSE_URL = "/response";
	public static final String CANDIDATE_ROLE_ID = "1";
	public static final String SAML_RESPONSE = "/saml/response";
	public static final String USER_NOT_AUTHENTICATED = "User Not authenticated";
	public static final String CANDIDATE_ACCESS_DENIED_MESSAGE = "No Candidate user exist for given credentials";
	public static final String ADMIN_ACCESS_DENIED_MESSAGE = "No Admin user exist for given credentials";
	public static final String POST_FOR_ENTITY_URL = "/KoaLAScheduler_web/user/v1/tokens.json";
	public static final String ADMIN_PAGE = "Admin Page";
	public static final int TWO_HUNDRED = 200;
	public static final String CANDIDATE_PAGE = "Candidate page";
	public static final String ADMIN_RESPONSE_URL = "/admin/response";
	public static final String REQUEST_URL = "requestURL";
	public static final String QUERY_PARAMS = "queryParams";
	public static final String NAME = "name";
	public static final String VALUE = "value";
	public static final String ID = "ID";
	public static final String SAML_LOGOUT_RESPONSE_IS_NOT_LOADED = "SAML Logout Response is not loaded";
	public static final String MESSAGE_CURRENT_URL_IS_EMPTY = "The URL of the current host was not established";
	public static final String SIGNATURE_PARAMETER = "Signature";
	public static final String XML_VALIDATION_MESSAGE = "Invalid SAML Logout Response. Not match the saml-schema-protocol-2.0.xsd";
	public static final String IN_RESPONSE_TO = "InResponseTo";
	public static final String VALIDATE_ERROR = "The InResponseTo of the Logout Response: ";
	public static final String VALIDATE_ERROR_MESSAGE = ", does not match the ID of the Logout request sent by the SP: ";
	public static final String STRING_FORMAT_MESSAGE = "Invalid issuer in the Logout Response. Was '%s', but expected '%s'";
	public static final String DESTINATION = "Destination";
	public static final String LOGOUT_RESPONSE_MESSAGE = "The LogoutResponse was received at ";
	public static final String INSTEAD_OF = " instead of ";
	public static final String WANT_MESSAGE_SIGNED_MESSAGE = "The Message of the Logout Response is not signed and the SP requires it";
	public static final String IDP_IS_REQUIRED = "In order to validate the sign on the Logout Response, the x509cert of the IdP is required";
	public static final String SIGALG_PARAMETER = "SigAlg";
	public static final String RELAY_STATE_PARAMETER = "RelayState";
	public static final String RELAY_STATE = "&RelayState=";
	public static final String SIGNATURE_VALIDATION_FAILED = "Signature validation failed. Logout Response rejected";
	public static final String SAML_ISSUER = "/samlp:LogoutResponse/saml:Issuer";
	public static final String SAMLP_STATUS_CODE = "/samlp:LogoutResponse/samlp:Status/samlp:StatusCode";
	public static final String ID_PARAMETER = "id";
	public static final String ISSUE_INSTANT = "issueInstant";
	public static final String DESTINATION_EQUALS = " Destination=\"";
	public static final String STR_SLASH = "\"";
	public static final String DESTINATION_STR = "destinationStr";
	public static final String IN_RESPONSE_TO_STR = " InResponseTo=\"";
	public static final String IN_RESPONSE_STR = "inResponseStr";
	public static final String ISSUER = "issuer";
	public static final String SAML_ASSERTION = "<samlp:LogoutResponse xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\" xmlns:saml=\"urn:oasis:names:tc:SAML:2.0:assertion\" ";
	public static final String APPEND_ID = "ID=\"${id}\" ";
	public static final String APPEND_VERSION = "Version=\"2.0\" ";
	public static final String APPEND_ISSUE_INSTANT = "IssueInstant=\"${issueInstant}\"${destinationStr}${inResponseStr} >";
	public static final String APPEND_SAML_ISSUER = "<saml:Issuer>${issuer}</saml:Issuer>";
	public static final String APPEND_SAMLP_STATUS = "<samlp:Status>";
	public static final String APPEND_STATUS_SUCCESS = "<samlp:StatusCode Value=\"urn:oasis:names:tc:SAML:2.0:status:Success\" />";
	public static final String APPEND_SAML_STATUS_SLASH = "</samlp:Status>";
	public static final String APPEND_LOGOUT_RESPONSE = "</samlp:LogoutResponse>";
	public static final String APPEND_COLLON = ": ";
	public static final String SUBJECT_CONFIRMATION_MESSAGE = "A valid SubjectConfirmation was not found on this Response";
	public static final String APPEND_SLASH_N = "\n[";
	public static final String APPEND_BRACKET = "] ";
	public static final String APPEND_COMMA = ", ";
	public static final String UNCHECKED = "unchecked";
	public static final String STRING_FORMAT = "%s://%s";
	public static final String STRING_FORMAT_ADDED_ON = "%s://%s:%s";
	public static final char QUESTION_MARK = '?';
	public static final String STRING_QUESTION_MARK = "?";
	public static final String AND = "&";
	public static final String EQUAL_TO = "=";
	public static final String APPEND_ID_AS_ID = "id";
	public static final String VALID_UNTIL_TIME = "validUntilTime";
	public static final String CACHE_DURATION = "cacheDuration";
	public static final String SP_ENTITY_ID = "spEntityId";
	public static final String STRAUTHNSIGN = "strAuthnsign";
	public static final String STRWSIGN = "strWsign";
	public static final String SP_NAME_ID_FORMAT = "spNameIDFormat";
	public static final String SP_ASSERTION_CONSUMER_SERVICE_BINDING = "spAssertionConsumerServiceBinding";
	public static final String SLS = "sls";
	public static final String SP_ASSERTION_CONSUMER_SERVICE_URL = "spAssertionConsumerServiceUrl";
	public static final String STR_ATTRIBUTE_CONSUMING_SERVICE = "strAttributeConsumingService";
	public static final String STR_KEY_DESCRIPTOR = "strKeyDescriptor";
	public static final String STR_CONTACTS = "strContacts";
	public static final String STR_ORGANIZATION = "strOrganization";
	public static final String EN = "en";
	public static final String APPEND_XML_VERSION = "<?xml version=\"1.0\"?>";
	public static final String APPEND_ENTITY_DESCRIPTOR = "<md:EntityDescriptor xmlns:md=\"urn:oasis:names:tc:SAML:2.0:metadata\"";
	public static final String APPEND_VALID_UNTIL_TIME = " validUntil=\"${validUntilTime}\"";
	public static final String APPEND_CACHE_DURATION = " cacheDuration=\"PT${cacheDuration}S\"";
	public static final String APPEND_ENTITY_ID = " entityID=\"${spEntityId}\"";
	public static final String APPEND_ID_STRING_BUILDER = " ID=\"${id}\">";
	public static final String APPEND_SPSSO_DESCRIPTOR = "<md:SPSSODescriptor AuthnRequestsSigned=\"${strAuthnsign}\" WantAssertionsSigned=\"${strWsign}\" protocolSupportEnumeration=\"urn:oasis:names:tc:SAML:2.0:protocol\">";
	public static final String APPEND_STR_KEY_DESCRIPTOR = "${strKeyDescriptor}";
	public static final String APPEND_NAME_ID_FORMAT = "${sls}<md:NameIDFormat>${spNameIDFormat}</md:NameIDFormat>";
	public static final String APPEND_SP_ASSERTION_CONSUMER_SERVICE_BINDING = "<md:AssertionConsumerService Binding=\"${spAssertionConsumerServiceBinding}\"";
	public static final String APPEND_SP_ASSERTION_CONSUMER_SERVICE_URL = " Location=\"${spAssertionConsumerServiceUrl}\"";
	public static final String APPEND_INDEX = " index=\"1\"/>";
	public static final String APPEND_ATTRIBUTE_CONSUMING_SERVICE = "${strAttributeConsumingService}";
	public static final String APPEND_SPSSO_DESCRIPTOR_STR_ORGANIZATION = "</md:SPSSODescriptor>${strOrganization}${strContacts}";
	public static final String APPEND_ENTITY_DESCRIPTOR_STR = "</md:EntityDescriptor>";
	public static final String ERROR_MSG_INVALID_SETTING = "Invalid settings: ";
	public static final String COMMA = ", ";
	public static final String ADMIN_SAML_PROPERTIES = "admin.saml.properties";
	public static final String ERROR_INVALID_RESPONSE = "invalid_response";
	public static final String ERROR_MSG_SAML_RESPONSE_NOT_FOUND = "SAML Response not found, Only supported HTTP_POST Binding";
	public static final String SAML_RESPONSE_PARAMETER_NAME = "SAMLResponse";
	public static final String ERROR_INVALID_LOGOUT_RESPONSE = "invalid_logout_response";
	public static final String ERROR_LOGOUT_NOT_SUCCESS = "logout_not_success";
	public static final String ERROR_INVALID_LOGOUT_REQUEST = "invalid_logout_request";

	public static final String ENUM_ITEM_LOCATION_STATUS_ID_PARAM = "enumItemLocationStatusId";
	public static final String ENUM_ITEM_LOCATION_RHIE_STATUS_ID = "enumItemLocationRhieStatusId";

	// LMS response messages
	public static final String RH_LMS_SUCCESS_MESSAGE = "Lms Record updated successfully";
	public static final String RH_LMS_FAILURE_MESSAGE = "Eligibility already exists, Lms Record cannot be updated";

	// proctor constants
	public static final String GET_PROCTOR_SESSION_DETAILS_URL = "/admin/proctor/session.json";
	public static final String GET_PROCTOR_SESSIONS_DETAILS_URL = "/admin/proctor/sessions.json";
	public static final String RHID = "rhId";
	public static final String SESSIONIDS = "sessionIds";
	public static final String COMMON_PROCTOR_URL = "/proctor";
	public static final String GET_PROCTOR_DETAIL_URL = "/admin/proctorss.json";
	public static final String PROCTOR_UPDATE_EXAM_URL = "/scheduleexam/session.json";
	public static final String SESSION_ID = "sessionId";
	public static final String PROCTOR_ID = "proctorId";
	public static final String OBSERVER_ID = "observerId";
	public static final String GROUP_ID = "groupId";
	public static final String CLAIMED_SUCCESS_MESSAGE = "Exam is claimed for proctoring successfully";
	public static final String OBSERVER_UPDATED_SUCCESS_MESSAGE = "Observer is updated for the exam";
	public static final String CLAIMED_FAILURE_MESSAGE = "Sorry, exam could not be claimed for proctoring";
	public static final String OBSERVER_UPDATED_FAILURE_MESSAGE = "Sorry, Observer could not be updated";
	public static final String EXAM_SCHEDULE_ID = "examScheduleId";
	public static final int PROCTOR_ID_INDEX = 0;
	public static final int PROCTOR_RHID_INDEX = 1;
	public static final int PROCTOR_FIRST_NAME_INDEX = 2;
	public static final int PROCTOR_LAST_NAME_INDEX = 3;
	public static final int PROCTOR_STATUS_INDEX = 4;
	public static final int PROCTOR_MAX_ASSIGN_SESSION_COUNT_INDEX = 5;
	public static final int PROCTOR_MAX_OBSERVED_SESSION_COUNT_INDEX = 6;
	public static final int PROCTOR_GROUP_ID_INDEX = 7;
	public static final int PROCTOR_GROUP_CODE_INDEX = 8;
	public static final int PROCTOR_LEAD_ID_INDEX = 9;
	public static final int PROCTOR_LEAD_NAME_INDEX = 10;
	public static final int PROCTOR_LEAD_DETAILS_INDEX = 11;
	public static final int PROCTOR_GROUP_MEMBERS_INDEX = 12;
	public static final String GET_CANDIDATE_DETAILS = "GET_CANDIDATE_DETAILS";
	public static final String GUUID = "guuId";
	public static final String CANDIDATE_EMAIL = "email";
	public static final String PROCTOR_GET_CANDIDATE_DETAIL = "/user/id.json";
	public static final String PROCTOR_UPDATE_LEAD_URL = "/admin/proctor/group.json";
	public static final String PROCTOR_SHARE_EXAM_SESSION = "/scheduleexam/exam/session.json";
	public static final String GROUP_LIST_PARAMETER = "groupList";

	// Error code constants
	public static final String E1000_ERROR_CODE = "RH-HTTP_CODE-E1000";
	public static final String E1000_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1000";

	public static final String E1001_ERROR_CODE = "RH-HTTP_CODE-E1001";
	public static final String E1001_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1001";

	public static final String E1002_ERROR_CODE = "RH-HTTP_CODE-E1002";
	public static final String E1002_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1002";

	public static final String E1003_ERROR_CODE = "RH-HTTP_CODE-E1003";
	public static final String E1003_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1003";

	public static final String E1004_ERROR_CODE = "RH-HTTP_CODE-E1004";
	public static final String E1004_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1004";

	public static final String E1005_ERROR_CODE = "RH-HTTP_CODE-E1005";
	public static final String E1005_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1005";

	public static final String E1006_ERROR_CODE = "RH-HTTP_CODE-E1006";
	public static final String E1006_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1006";

	public static final String E1007_ERROR_CODE = "RH-HTTP_CODE-E1007";
	public static final String E1007_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1007";

	public static final String E1008_ERROR_CODE = "RH-HTTP_CODE-E1008";
	public static final String E1008_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1008";

	public static final String E1009_ERROR_CODE = "RH-HTTP_CODE-E1009";
	public static final String E1009_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1009";

	public static final String E1010_ERROR_CODE = "RH-HTTP_CODE-E1010";
	public static final String E1010_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1010";

	public static final String E1011_ERROR_CODE = "RH-HTTP_CODE-E1011";
	public static final String E1011_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1011";

	public static final String E1012_ERROR_CODE = "RH-HTTP_CODE-E1012";
	public static final String E1012_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1012";

	public static final String E1013_ERROR_CODE = "RH-HTTP_CODE-E1013";
	public static final String E1013_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1013";

	// Code for invalid file type(other than .pdf,.png,.jpg)
	public static final String E1014_ERROR_CODE = "RH-HTTP_CODE-E1014";
	public static final String E1014_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1014";

	// Code for multipart file exceeds max allowed size(here 5MB)
	public static final String E1015_ERROR_CODE = "RH-HTTP_CODE-E1015";
	public static final String E1015_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1015";

	public static final String E1016_ERROR_CODE = "RH-HTTP_CODE-E1016";
	public static final String E1016_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1016";

	public static final String E1017_ERROR_CODE = "RH-HTTP_CODE-E1017";
	public static final String E1017_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1017";

	public static final String E1018_ERROR_CODE = "RH-HTTP_CODE-E1018";
	public static final String E1018_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1018";

	public static final String E1019_ERROR_CODE = "RH-HTTP_CODE-E1019";
	public static final String E1019_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1019";

	public static final String E1020_ERROR_CODE = "RH-HTTP_CODE-E1020";
	public static final String E1020_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1020";

	public static final String E1021_ERROR_CODE = "RH-HTTP_CODE-E1021";
	public static final String E1021_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1021";

	public static final String E1022_ERROR_CODE = "RH-HTTP_CODE-E1022";
	public static final String E1022_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1022";

	public static final String E1023_ERROR_CODE = "RH-HTTP_CODE-E1023";
	public static final String E1023_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1023";

	// Code for empty multipart file
	public static final String E1024_ERROR_CODE = "RH-HTTP_CODE-E1024";
	public static final String E1024_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1024";

	// Code when identity upload not required based on its country
	public static final String E1025_ERROR_CODE = "RH-HTTP_CODE-E1025";
	public static final String E1025_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1025";

	// Code when candidate has already uploaded a document before and is either
	// approved or pending
	public static final String E1026_ERROR_CODE = "RH-HTTP_CODE-E1026";
	public static final String E1026_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1026";

	public static final String E1027_ERROR_CODE = "RH-HTTP_CODE-E1027";
	public static final String E1027_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1027";

	public static final String E1028_ERROR_CODE = "RH-HTTP_CODE-E1028";
	public static final String E1028_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1028";

	public static final String E1029_ERROR_CODE = "RH-HTTP_CODE-E1029";
	public static final String E1029_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1029";

	public static final String E1030_ERROR_CODE = "RH-HTTP_CODE-E1030";
	public static final String E1030_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1030";

	public static final String E1031_ERROR_CODE = "RH-HTTP_CODE-E1031";
	public static final String E1031_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1031";

	public static final String E1032_ERROR_CODE = "RH-HTTP_CODE-E1032";
	public static final String E1032_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1032";

	public static final String E1033_ERROR_CODE = "RH-HTTP_CODE-E1033";
	public static final String E1033_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1033";

	public static final String E1034_ERROR_CODE = "RH-HTTP_CODE-E1034";
	public static final String E1034_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1034";

	public static final String E1035_ERROR_CODE = "RH-HTTP_CODE-E1035";
	public static final String E1035_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1035";

	public static final String E1036_ERROR_CODE = "RH-HTTP_CODE-E1036";
	public static final String E1036_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1036";

	public static final String E1037_ERROR_CODE = "RH-HTTP_CODE-E1037";
	public static final String E1037_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1037";

	public static final String E1038_ERROR_CODE = "RH-HTTP_CODE-E1038";
	public static final String E1038_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1038";

	public static final String E1039_ERROR_CODE = "RH-HTTP_CODE-E1039";
	public static final String E1039_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1039";

	public static final String E1040_ERROR_CODE = "RH-HTTP_CODE-E1040";
	public static final String E1040_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1040";

	public static final String E1041_ERROR_CODE = "RH-HTTP_CODE-E1041";
	public static final String E1041_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1041";

	public static final String E1042_ERROR_CODE = "RH-HTTP_CODE-E1042";
	public static final String E1042_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1042";

	public static final String E1043_ERROR_CODE = "RH-HTTP_CODE-E1043";
	public static final String E1043_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1043";

	public static final String E1049_ERROR_CODE = "RH-HTTP_CODE-E1049";
	public static final String E1049_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1049";

	public static final String E1047_ERROR_CODE = "RH-HTTP_CODE-E1047";
	public static final String E1047_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1047";

	public static final String E1048_ERROR_CODE = "RH-HTTP_CODE-E1048";
	public static final String E1048_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1048";

	public static final String E1050_ERROR_CODE = "RH-HTTP_CODE-E1050";
	public static final String E1050_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1050";

	public static final String E1052_ERROR_CODE = "RH-HTTP_CODE-E1052";
	public static final String E1052_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1052";

	public static final String E1055_ERROR_CODE = "RH-HTTP_CODE-E1055";
	public static final String E1055_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1055";

	public static final String E1054_ERROR_CODE = "RH-HTTP_CODE-E1054";
	public static final String E1054_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1054";

	public static final String E1056_ERROR_CODE = "RH-HTTP_CODE-E1056";
	public static final String E1056_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1056";

	public static final String E1057_ERROR_CODE = "RH-HTTP_CODE-E1057";
	public static final String E1057_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1057";

	public static final String E1058_ERROR_CODE = "RH-HTTP_CODE-E1058";
	public static final String E1058_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1058";

	public static final String E1059_ERROR_CODE = "RH-HTTP_CODE-E1059";
	public static final String E1059_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1059";

	public static final String E1060_ERROR_CODE = "RH-HTTP_CODE-E1060";
	public static final String E1060_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1060";

	public static final String E1061_ERROR_CODE = "RH-HTTP_CODE-E1061";
	public static final String E1061_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1061";

	public static final String E1062_ERROR_CODE = "RH-HTTP_CODE-E1062";
	public static final String E1062_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1062";
	public static final String E1063_ERROR_CODE = "RH-HTTP_CODE-E1063";
	public static final String E1063_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1063";

	public static final String E1064_ERROR_CODE = "RH-HTTP_CODE-E1064";
	public static final String E1064_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1064";

	public static final String E1065_ERROR_CODE = "RH-HTTP_CODE-E1065";
	public static final String E1065_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1065";

	public static final String E1066_ERROR_CODE = "RH-HTTP_CODE-E1066";
	public static final String E1066_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1066";

	public static final String E1068_ERROR_CODE = "RH-HTTP_CODE-E1068";
	public static final String E1068_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1068";

	public static final String E1069_ERROR_CODE = "RH-HTTP_CODE-E1069";
	public static final String E1069_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1069";

	public static final String E1070_ERROR_CODE = "RH-HTTP_CODE-E1070";
	public static final String E1070_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1070";

	public static final String S0001_SUCCESS_CODE = "RH-HTTP_CODE-S0001";
	public static final String S0001_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0001";
	public static final String E1071_ERROR_CODE = "RH-HTTP_CODE-E1071";
	public static final String E1071_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1071";

	public static final String E1072_ERROR_CODE = "RH-HTTP_CODE-E1072";
	public static final String E1072_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1072";

	public static final String E1073_ERROR_CODE = "RH-HTTP_CODE-E1073";
	public static final String E1073_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1073";
	public static final String E1074_ERROR_CODE = "RH-HTTP_CODE-E1074";
	public static final String E1074_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1074";
	public static final String E1075_ERROR_CODE = "RH-HTTP_CODE-E1075";
	public static final String E1075_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1075";
	public static final String E1076_ERROR_CODE = "RH-HTTP_CODE-E1076";
	public static final String E1076_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1076";
	public static final String E1077_ERROR_CODE = "RH-HTTP_CODE-E1077";
	public static final String E1077_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1077";
	public static final String E1078_ERROR_CODE = "RH-HTTP_CODE-E1078";
	public static final String E1078_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1078";
	public static final String E1079_ERROR_CODE = "RH-HTTP_CODE-E1079";
	public static final String E1079_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1079";
	public static final String E1080_ERROR_CODE = "RH-HTTP_CODE-E1080";
	public static final String E1080_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1080";
	public static final String E1081_ERROR_CODE = "RH-HTTP_CODE-E1081";
	public static final String E1081_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1081";

	public static final String E1082_ERROR_CODE = "RH-HTTP_CODE-E1082";
	public static final String E1082_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1082";

	// duplicate name. record already exist
	public static final String E1083_ERROR_CODE = "RH-HTTP_CODE-E1083";
	public static final String E1083_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1083";
	// no record for the given location
	public static final String E1084_ERROR_CODE = "RH-HTTP_CODE-E1084";
	public static final String E1084_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1084";
	// policy related constatnts
	public static final String E1094_ERROR_CODE = "RH-HTTP_CODE-E1094";
	public static final String E1094_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1094";
	public static final String E1096_ERROR_CODE = "RH-HTTP_CODE-E1096";
	public static final String E1096_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1096";

	public static final String E1097_ERROR_CODE = "RH-HTTP_CODE-E1097";
	public static final String E1097_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1097";
	public static final String E1098_ERROR_CODE = "RH-HTTP_CODE-E1098";
	public static final String E1098_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1098";

	public static final String E1099_ERROR_CODE = "RH-HTTP_CODE-E1099";
	public static final String E1099_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1099";
	public static final String E1100_ERROR_CODE = "RH-HTTP_CODE-E1100";

	public static final String E1100_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1100";
	public static final String E1101_ERROR_CODE = "RH-HTTP_CODE-E1101";
	public static final String E1101_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1101";

	public static final String E1102_ERROR_CODE = "RH-HTTP_CODE-E1102";
	public static final String E1102_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1102";

	public static final String E1103_ERROR_CODE = "RH-HTTP_CODE-E1103";
	public static final String E1103_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1103";

	public static final String E1104_ERROR_CODE = "RH-HTTP_CODE-E1104";
	public static final String E1104_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1104";

	public static final String E1105_ERROR_CODE = "RH-HTTP_CODE-E1105";
	public static final String E1105_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1105";

	public static final String E1106_ERROR_CODE = "RH-HTTP_CODE-E1106";
	public static final String E1106_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1106";

	public static final String E1107_ERROR_CODE = "RH-HTTP_CODE-E1107";
	public static final String E1107_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1107";

	public static final String E1108_ERROR_CODE = "RH-HTTP_CODE-E1108";
	public static final String E1108_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1108";

	public static final String P0001_PARTIAL_SUCCESS_CODE = "RH-HTTP_CODE-P0001";
	public static final String P0001_PARTIAL_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-P0001";

	public static final String E0001_FAILURE_CODE = "RH-HTTP_CODE-E0001";
	public static final String E0001_FAILURE_DESCRIPTION = "RH-HTTP_DESCRIPTION-E0001";

	public static final String E1111_ERROR_CODE = "RH-HTTP_CODE-E1111";
	public static final String E1111_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1111";

	public static final String E1112_ERROR_CODE = "RH-HTTP_CODE-E1112";
	public static final String E1112_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1112";

	public static final String E1113_ERROR_CODE = "RH-HTTP_CODE-E1113";
	public static final String E1113_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1113";

	public static final String E1130_ERROR_CODE = "RH-HTTP_CODE-E1130";
	public static final String E1130_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1130";

	public static final String E1132_ERROR_CODE = "RH-HTTP_CODE-E1132";
	public static final String E1132_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1132";

	public static final String E1134_ERROR_CODE = "RH-HTTP_CODE-E1134";
	public static final String E1134_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1134";

	public static final String E1152_ERROR_CODE = "RH-HTTP_CODE-E1152";
	public static final String E1152_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1152";

	public static final String E1153_ERROR_CODE = "RH-HTTP_CODE-E1153";
	public static final String E1153_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1153";

	public static final String E1156_ERROR_CODE = "RH-HTTP_CODE-E1156";
	public static final String E1156_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1156";

	public static final String E1161_ERROR_CODE = "RH-HTTP_CODE-E1161";
	public static final String E1161_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1161";

	public static final String E1162_ERROR_CODE = "RH-HTTP_CODE-E1162";
	public static final String E1162_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1162";

	// Exam Status
	public static final String EXAM_STATUS_ALL = "ALL";
	public static final String EXAM_STATUS_EXPIRED = "EXAMSEXPIRED";
	public static final String EXAM_STATUS_SCHEDULED = "SCHEDULED";
	public static final String EXAM_STATUS_RESCHEDULED = "RESCHEDULED";
	public static final String EXAM_STATUS_CANCELLED = "CANCELED";
	public static final String EXAM_STATUS_TAKEN = "EXAMSTAKEN";
	public static final String EXAM_STATUS_UNSCHEDULED = "EXAMSTOSCHEDULE";
	public static final String EXAM_STATUS_COMPLETED = "COMPLETED";
	public static final String EXAM_STATUS_NO_SHOW = "NOSHOW";
	public static final String EXAM_STATUS_NETWORK_ERROR = "NETWORKERROR";
	public static final String EXAM_STATUS_SITE_ERROR = "SITEERROR";

	private static final String[] examStatusList = { EXAM_STATUS_ALL, EXAM_STATUS_EXPIRED, EXAM_STATUS_SCHEDULED,
			EXAM_STATUS_RESCHEDULED, EXAM_STATUS_CANCELLED, EXAM_STATUS_TAKEN, EXAM_STATUS_UNSCHEDULED };
	public static final String EXAM_STATUS = "examStatus";
	public static final String GET_ELIGIBILITY_EXPIRATION_DATE = "GET_ELIGIBILITY_EXPIRATION_DATE";
	public static final String PRC_FIND_EXAM_TIME_SLOTS = "PRC_FIND_EXAM_TIME_SLOTS";
	public static final String GET_TIMEZONE_BY_ID = "GET_TIMEZONE_BY_ID";

	// SAML URL constants

	public static final String SAML_LOGIN_BY_ROLE_URL = "/KoaLAScheduler_web/saml/login?userRole=";
	public static final String SAML_UI_REDIRECT_URL = "SAML_UI_REDIRECT_URL";
	public static final String SAML_UI_SUCCESS_URL = "S0001/";
	public static final String SAML_UI_EXTERNAL_URL = "#/AuthenticateUser/";
	public static final String SAML_UI_INTERNAL_URL = "#/AuthenticateInternalUser/";

	// Api String response key
	public static final String RESPONSE_JSON_KEY = "Response";

	// Upload id Query fields

	public static final String COUNTRY_ID = "countryId";
	public static final String STATE_ID = "stateId";
	public static final String CITY_ID = "cityId";

	public static final String FILE = "file";

	public static final Integer ID_APPROVAL_STATUS_REJECTED = 77;

	// location constatnts
	public static final String SEARCH_TEXT_PARAMETER = "searchText";

	// Jboss Constants
	public static final String JBOSS_SERVER_CONFIG_DIR = "jboss.server.config.dir";

	// email Notification
	public static final String MAIL_SMTP_PORT = "mail.smtp.port";
	public static final String MAIL_SMTP_AUTH = "mail.smtp.auth";
	public static final String MAIL_SMTP_START_TLS_ENABLE = "mail.smtp.starttls.enable";
	public static final String EMAIL_BODY_TYPE = "text/html";
	public static final String TRANSPORT_TYPE = "smtp";
	public static final String HOST = "MAIL_HOST";
	public static final String USERNAME = "MAIL_SMTP_HOST_USERNAME";
	public static final String USERNAME_FROM = "MAIL_USERNAME_FROM";
	public static final String PASS = "MAIL_SMTP_HOST_PASSWORD";
	public static final String MAIL_SMTP_START_TLS_ENABLE_PROPERTY = "MAIL_SMTP_START_TLS_ENABLE";
	public static final String MAIL_SMTP_PORT_PROPERTY = "MAIL_SMTP_PORT";
	public static final String MAIL_SMTP_AUTH_PROPERTY = "MAIL_SMTP_AUTH";
	public static final String MAIL_TRANSPORT_PROTOCOL_PROPERTY = "MAIL_TRANSPORT_PROTOCOL";
	public static final String MAIL_DEBUG_TRUE_PROPERTY = "MAIL_DEBUG_TRUE";

	public static final String EMAIL_PROPERTY_READER = "emailPropertyReader";
	public static final String EMAIL_PROPERTIES_FILENAME = "email.properties";
	public static final String TEMPLATE_ENCODING = "MAIL_TEMPLATE_ENCODING";
	public static final String MAIL_TRANSPORT_PROTOCOL = "mail.transport.protocol";
	public static final String MAIL_DEBUG = "mail.debug";

	// velocity Configurations
	public static final String RESOURCE_LOADER = "resource.loader";
	
	public static final String RESOURCE_LOADER_CLASS = "class.resource.loader.class";
	public static final String RESOURCE_LOADER_VALUE = "class";
	public static final String RESOURCE_LOADER_CLASS_VALUE = "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader";
	
	/*public static final String RESOURCE_LOADER_CLASS = "file.resource.loader.class";
    public static final String RESOURCE_LOADER_VALUE = "file";
    public static final String RESOURCE_LOADER_CLASS_VALUE = "org.apache.velocity.runtime.resource.loader.FileResourceLoader";
    public static final String RESOURCE_LOADER_FILE_PATH = "file.resource.loader.path";
    public static final String RESOURCE_LOADER_FILE_PATH_VALUE = "MAIL_TEMPLATE_FILE_PATH";*/

	// Calender default date range for time slots(7 days)
	public static final int DEFAULT_DATE_RANGE = 6;

	public static final String LOCATION_ID = "locationId";
	public static final String KOALA_ID = "koalaId";
	public static final String WHITE_LIST = "whiteList";
    public static final String BLACK_LIST = "blackList";
	public static final String FROM_DATE = "fromDate";
	public static final String TO_DATE = "toDate";

	// exam time slots procedure result index
	public static final int EXAM_SLOT_EXAM_DATE_INDEX = 0;
	public static final int EXAM_SLOT_EXAM_TIME_SLOT_INDEX = 1;
	public static final int EXAM_SLOT_LOCATION_TIMEZONE_ID_INDEX = 2;
	public static final int EXAM_SLOT_LOCATION_TIMEZONE_CODE_INDEX = 3;

	public static final String TIMEZONE_ID = "timezoneId";
	public static final String TIMEZONE_UTC = "UTC";
	public static final int TWENTY_FOUR_HOURS = 24;

	// Time slot constants
	public static final String location_open_time = "00:00:00";
	public static final String location_close_time = "24:00:00";
	public static final String exam_length = "00:00:00";

	public static final String E1046_ERROR_CODE = "RH-HTTP_CODE-E1046";
	public static final String E1046_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1046";

	// RhUserExamScheduleDtl class Fields
	public static final String RH_EXAM_ID = "examId";

	public static final String RH_LOCATION_RHIE_ID = "locationRhieId";
	public static final String USER_EXAM_SCHEDULE_STATUS = "USER_EXAM_SCHEDULE_STATUS";
	public static final String SCHEDULED = "scheduled";
	public static final String CANDIDATE_EXAM_STATUS = "candidateExamStatus";

	public static final String PRC_CHECK_AVAILABILITY_OF_TIMESLOT = "PRC_CHECK_AVAILABILITY_OF_TIMESLOT";
	public static final String GET_TIMEZONE_FROM_ID = "GET_TIMEZONE_FROM_ID";

	// Scheduled Exam API
	public static final String RESERVE_SCHEDULED_EXAM = "/scheduleexam.json";
	public static final String RESCHEDULED_EXAM = "/v1/reschedule-exam.json";

	public static final String SIMPLE_DATE_TIME_FORMAT_VALUE = "yyyy-MM-dd HH:mm:ss";
	public static final String SIMPLE_DATE_TIME_FORMAT_VALUE_WITHOUT_SECOND = "yyyy-MM-dd HH:mm";
	public static final String SIMPLE_TIME_FORMAT_VALUE = "HH:mm:ss";
	public static final String LOCATION_TIME_FORMAT = "HH:mm";
	public static final String DATE_TIME_T_FORMAT_VALUE = "yyyy-MM-dd HH-mm-ss";

	public static final String UTC_TIME_ZONE = "UTC";
	public static final String TIME_ZONE = "timeZone";

	public static final String TIMESTAMP_PATTERN = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01]) (?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$";

	public static final String RH_EXAM_MASTER_PARAMETER_NAME = "rhExamMaster";
	public static final String EXAM_START_DATE_TIME_PARAMETER_NAME = "examStartDateTime";
	public static final String EXAM_START_DATE_TIME_PARAMETER_NAME_LOCAL = "examStartDateTime_Local";
	public static final String RH_LOCATION_MASTER_PARAMETER_NAME = "locationMaster";
	public static final String RH_LOCATION_RHIE_DTL_PARAMETER_NAME = "locationRhieDtl";
	public static final String LOCATION_RHIE_DTL_ID_PARAMETER_NAME = "locationRhieDtlId";
	public static final String SCHEDULED_SUCCESS_MESSAGE = "You have successfully scheduled your exam";
	public static final String RESCHEDULED_SUCCESS_MESSAGE = "You have successfully rescheduled your exam";
	public static final String SCHEDULED_FAILURE_MESSAGE = "Sorry,the exam could not be scheduled.";
	public static final String GET_FIRST_NAME_LAST_NAME = "GET_FIRST_NAME_LAST_NAME.HQL";
	public static final String START_DATE = "startDate";
	public static final String END_DATE = "endDate";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String SIGNATURE = "signature";
	public static final String TEMPLATE_PATH = "MAIL_TEMPLATE_FILE_LOCATION";
    public static final String TEMPLATE_PATH_FOR_SCHEDULED_EXAM = "templates/schedule-exam-template.vm";
    public static final String TEMPLATE_FOR_CANCELLATION_EMAIL = "templates/cancel-email-template.vm";
    public static final String TEMPLATE_FOR_CANDIDATE_EXAM_NOTIFICATION = "templates/candidate-exam-notification.vm";
    public static final String TEMPLATE_FOR_APPROVED_ID = "templates/approve-id-template.vm";
    public static final String TEMPLATE_FOR_REJECTED_ID = "templates/reject-id-template.vm";
    public static final String SUBJECT_SCHEDULED = "Your Red Hat Individual exam reservation has been confirmed";
    public static final String SUBJECT_RESCHEDULED = "Exam Rescheduled";
    public static final String SIGNATURE_CONTENT = "www.redhat.com";
    public static final String ID_STATUS = "ID Status";

	public static final String EXAM_START_DATE_TIME = "examStartDateTime";
	public static final String TIMEZONE = "timeZone";
	public static final String TIMEZONE_INPUT = "timezone";
	public static final String LOCATION_NAME = "locationName";
	public static final String EXAM_NAME = "examName";

	public static final String GET_EXAM_NAME_BY_ELIGIBILITY_CODE = "GET_EXAM_NAME_BY_ELIGIBILITY_CODE";

	public static final String CHECK_TIME_DIFFERENCE = "/location/time.json";

	public static final String CANCEL_EXAM = "/exam/status.json";

	public static final String E1044_ERROR_CODE = "RH-HTTP_CODE-E1044";
	public static final String E1044_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1044";

	public static final String E1045_ERROR_CODE = "RH-HTTP_CODE-E1045";
	public static final String E1045_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1045";

	public static final String E1051_ERROR_CODE = "RH-HTTP_CODE-E1051";
	public static final String E1051_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1051";

	public static final String E1053_ERROR_CODE = "RH-HTTP_CODE-E1053";
	public static final String E1053_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1053";

	public static final String E1067_ERROR_CODE = "RH-HTTP_CODE-E1067";
	public static final String E1067_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1067";

	public static final String TIME_DIFFERENCE_SUCCESS_MESSAGE = "Time difference is more than 24 hours.";
	public static final String TIME_DIFFERENCE_FALIURE_MESSAGE = "Time difference is less than 24 hours.";
	public static final String EXAM_ADD_SUCCESS_MESSAGE = "Exam is added successfully";
	public static final String EXAM_UPDATE_SUCCESS_MESSAGE = "Exam is updated successfully";
	public static final String CANCEL_SUCCESS_MESSAGE = "Exam canceled";
	public static final String CANCEL_FALIURE_MESSAGE = "Exam could not be canceled";

	public static final Long USER_EXAM_SCHEDULED_STATUS_ID = 72l;
	public static final Long USER_EXAM_RESCHEDULED_STATUS_ID = 103l;
	public static final Long USER_EXAM_CANCELED_STATUS_ID = 73l;

	public static final String USER_EXAM_SCHEDULED_STATUS = "scheduled";
	public static final String USER_EXAM_RESCHEDULED_STATUS = "rescheduled";

	// Response model for schedule/ reschedule
	public static final String RH_EXAM_SCHEDULE = "rhExamSchedule";

	public static final int USER_EXAM_COMPLETED_STATUS_ID = 74;
	public static final int USER_EXAM_TAKEN_STATUS_ID = 101;
	// SAML
	public static final String SAMLRESPONSE = "SAMLResponse";
	public static final String SAML_REQUEST = "SAMLRequest";
	public static final String HIPHEN_ARROW = " --> ";
	public static final String SIGNATURE_SAML = "Signature";
	public static final String SIGALG_SAML = "SigAlg";
	public static final String RELAY_STATE_SAML = "RelayState";
	public static final String NOT_ON_OR_AFTER = "NotOnOrAfter";
	public static final String VALUE_SAML = "Value";
	public static final String FORMAT_SAML = "Format";
	public static final String SP_NAME_QUALIFIER_SAML = "SPNameQualifier";
	public static final String NAME_QUALIFIER_SAML = "NameQualifier";
	// Audit package scan for hibernate config
	public static final String AUDIT_PACKAGE_TO_SCAN = "com.spring";

	// Lms Eligibility expiration time
	public static final String ELIGIBILITY_EXPIRATION_TIME = " 23:59:59";

	// email notification rhEmails object key name
	public static final String EMAIL_DETAILS = "emailDetails";

	// time difference input date variable name
	public static final String INPUT_DATE = "inputDate";
	public static final String TIME_DIFFERENCE = "timeDiff";

	public static final String ENUM_CODE = "enumCode";
	public static final String KOALA_STATUS_ID = "id";

	public static final String APPROVED = "APPROVED";
	public static final String REJECTED = "REJECTED";

	// global admin data
	public static final String TIME_PATTERN = "^(?:(?:([01]?\\d|2[0-9]):)?([0-9]?\\d):)?([0-9]?\\d)$";
	public static final String TIME_PATTERN_HOURS_MINUTES = "^(?:(?:([01]?\\d|2[0-9]):)?([0-9]?\\d))$";
	public static final String WITH_ID = " with id:";
	public static final int THIRTEEN = 13;
	public static final int THREE = 3;
	public static final int TWENTY = 20;
	public static final String CONTACT_PATTERN = "^[-? +? ()? xX? ?0-9]{1,20}+$";
	public static final String ADMIN_ADD_SUCCESS_MESSAGE = " Admin added successfully";
	public static final String INVALID_USER = "Invalid User";
	public static final String ADMIN_UPDATE_SUCCESS_MESSAGE = " Admin updated successfully";
	public static final String ADMIN_ADD_UPDATE_URL = "/admin.json";
	public static final String GLOBAL_ADMIN_EXAM_URL = "/location/exams.json";
	public static final String ADD_KOALA_URL = "/location/koala.json";
	public static final String DOMAIN_DETAIL_URL = "/location/domaindetail.json";
	public static final String KOALA_ADD_SUCCESS_MESSAGE = "Koala has been requested successfully";
	public static final String GET_KOALA_LIST_FOR_LOCATION_URL = "/location/koalas.json";
	public static final String UPDATE_KOALA_STATUS = "UPDATE_KOALA_STATUS";
	public static final String GET_RETENTION_POLICY = "/scheduleexam/policy.json";
	public static final String UPDATE_RETENTION_POLICY = "/scheduleexam/policy.json";
	public static final String UPDATE_EXAM_STATUS_TO = "/scheduleexam/exam/status.json";
	public static final String LOCATION_CODE = "locationCode";
	public static final String MAPPING_IDS = "mappingIds";
	public static final String MAX_INACTIVE_TIME = "maxInactiveTime";
	public static final String LMS_PUSH_MESSAGE_URL = "/scheduleexam/messages/lmsmessages";
	public static final String LMS_COUNT_FAIL_MESSAGE_URL = "/scheduleexam/messages/count.json";
	public static final String UPDATE_CHAT_IDLE_TIME_URL = "/chatidletime.json";
	
	public static final String UPDATE_CHAT_IDLE_TIME_PROCTORING_URL = "/proctoring/chatidletime.json";
	
	
	public static final String POLICY_UPDATE_SUCCESS_MESSAGE = "Policy has been updated successfully";

	// Enum/Enum Item CODE Constants
	public static final String ENUM_USER_ROLE = "USER_ROLE";

	public static final String ADMIN_ID = "adminId";
	public static final String GET_LOCATION_CALENDAR_URL = "/location/calendar.json";

	public static final String RESULT_ADD_MESSAGE = "Record added successfully";
	public static final String IS_RECORD_ADDED = "isAdded";

	// location settings

	public static final String UPDATE_LOCATION_SETTINGS = "/location/settings.json";
	public static final int SINGLE_DAY = 1;
	public static final String PRC_GET_EXAM_TIME_DETAILS = "PRC_GET_EXAM_TIME_DETAILS";
	public static final String PRC_GET_LOCATION_CALENDAR_DETAILS = "PRC_GET_LOCATION_CALENDAR_DETAILS";
	public static final String PRC_GET_ALL_KOALA_BOOKING_DETAILS = "PRC_GET_ALL_KOALA_BOOKING_DETAILS";
	public static final String PRC_GET_EXCEPTION_CALENDAR_DETAILS = "PRC_GET_EXCEPTION_CALENDAR_DETAILS";
	public static final long FOUR_HOUR = 4 * 60 * (long) 60000;
	public static final String STATUS_OPEN = "OPEN";
	public static final String STATUS_CLOSE = "CLOSE";

	public static final String TIME_INTERVAL = "00:30:00";
	public static final String LOCATION_CALENDAR_STATUS = "LOCATION_CALENDAR_STATUS";

	public static final String E1085_ERROR_CODE = "RH-HTTP_CODE-E1085";
	public static final String E1085_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1085";

	public static final String E1086_ERROR_CODE = "RH-HTTP_CODE-E1086";
	public static final String E1086_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1086";

	public static final String E1087_ERROR_CODE = "RH-HTTP_CODE-E1087";
	public static final String E1087_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1087";

	public static final String E1088_ERROR_CODE = "RH-HTTP_CODE-E1088";
	public static final String E1088_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1088";

	public static final String E1089_ERROR_CODE = "RH-HTTP_CODE-E1089";
	public static final String E1089_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1089";

	public static final String E1090_ERROR_CODE = "RH-HTTP_CODE-E1090";
	public static final String E1090_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1090";

	public static final String E1091_ERROR_CODE = "RH-HTTP_CODE-E1091";
	public static final String E1091_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1091";

	public static final String E1092_ERROR_CODE = "RH-HTTP_CODE-E1092";
	public static final String E1092_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1092";

	public static final String E1093_ERROR_CODE = "RH-HTTP_CODE-E1093";
	public static final String E1093_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1093";
	public static final String E1095_ERROR_CODE = "RH-HTTP_CODE-E1095";
	public static final String E1095_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1095";
	public static final String E1114_ERROR_CODE = "RH-HTTP_CODE-E1114";
	public static final String E1114_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1114";
	public static final String E1115_ERROR_CODE = "RH-HTTP_CODE-E1115";
	public static final String E1115_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1115";
	public static final String E1116_ERROR_CODE = "RH-HTTP_CODE-E1116";
	public static final String E1116_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1116";
	public static final String E1117_ERROR_CODE = "RH-HTTP_CODE-E1117";
	public static final String E1117_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1117";
	public static final String E1118_ERROR_CODE = "RH-HTTP_CODE-E1118";
	public static final String E1118_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1118";
	public static final String E1119_ERROR_CODE = "RH-HTTP_CODE-E1119";
	public static final String E1119_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1119";
	public static final String E1120_ERROR_CODE = "RH-HTTP_CODE-E1120";
	public static final String E1120_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1120";
	public static final String E1121_ERROR_CODE = "RH-HTTP_CODE-E1121";
	public static final String E1121_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1121";
	public static final String E1122_ERROR_CODE = "RH-HTTP_CODE-E1122";
	public static final String E1122_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1122";
	public static final String E1123_ERROR_CODE = "RH-HTTP_CODE-E1123";
	public static final String E1123_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1123";
	public static final String E1124_ERROR_CODE = "RH-HTTP_CODE-E1124";
	public static final String E1124_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1124";
	public static final String E1125_ERROR_CODE = "RH-HTTP_CODE-E1125";
	public static final String E1125_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1125";
	public static final String E1126_ERROR_CODE = "RH-HTTP_CODE-E1126";
	public static final String E1126_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1126";
	public static final String E1127_ERROR_CODE = "RH-HTTP_CODE-E1127";
	public static final String E1127_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1127";
	public static final String E1128_ERROR_CODE = "RH-HTTP_CODE-E1128";
	public static final String E1128_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1128";
	public static final String E1129_ERROR_CODE = "RH-HTTP_CODE-E1129";
	public static final String E1129_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1129";
	public static final String E1131_ERROR_CODE = "RH-HTTP_CODE-E1131";
	public static final String E1131_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1131";
	public static final String E1133_ERROR_CODE = "RH-HTTP_CODE-E1133";
	public static final String E1133_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1133";

	public static final String S0002_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0002";
	public static final String S0003_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0003";

	public static final String S0004_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0004";
	public static final String S0005_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0005";
	public static final String S0006_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0006";
	public static final String S0007_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0007";
	public static final String S0008_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0008";
	public static final String S0009_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0009";
	public static final String S0010_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0010";
	public static final String S0011_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0011";
	public static final String S0012_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0012";
	public static final String S0013_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0013";
	public static final String S0014_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0014";
	public static final String S0021_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0021";
	public static final String S0033_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0033";
	public static final String S0029_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0029";
	public static final String S0034_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0034";
	
	public static final String S0035_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0035";

	public static final String LOCATION_SETTINGS_UPDATE_SUCCESS_MESSAGE = "location has been updated successfully";
	public static final String LOCATION_SETTINGS_ADDED_SUCCESS_MESSAGE = "location has been added successfully";

	public static final String NOMINEE_REMOVE_SUCCESS_MESSAGE = "Nominee removed successfully";
	public static final String NOMINEE_ADDED_SUCCESS_MESSAGE = "Nominees added successfully";
	
	public static final String CHAT_IDLE_TIME_UPDATE_SUCCESS_MESSGAE="Chat idle time updated successfully.";
	// default data
	public static final String DEFAULT_STARTTIME = "00:00";
	public static final String DEFAULT_ENDTIME = "00:00";
	public static final String DEFAULT_STATUS = "OPEN";
	public static final String UTC = "UTC";

	// token generation: random number generator algorithm
	public static final String RANDOM_NUMBER_GENERATOR_ALOG = "SHA1PRNG";
	public static final String CLAIM_TOKEN_VERSION = "version";

	public static final int MAX_ZIP_CODE_LENGTH = 10;

	// site admin access level constants
	public static final String BUSINESS = "Business";
	public static final String SITE = "Site";

	// location-user types
	public static final String LOCATION_USER_TYPE_ADMIN = "ADMIN";
	public static final String LOCATION_USER_TYPE_TECH = "TECH";

	public static final String SQS_QUERY_BY_ID = "GET_SQS_INFORMATION_BY_ID";
	public static final String REASON = "reason";
	public static final String GUMTREE_AWS_ACCESS_KEY_ID = "GUMTREE_AWS_ACCESS_KEY_ID";
	public static final String GUMTREE_AWS_SECRET_KEY = "GUMTREE_AWS_SECRET_KEY";
	public static final String GUMTREE_SEND_MESSAGE_REQUEST_URL = "GUMTREE_SEND_MESSAGE_REQUEST_URL";

	public static final String GET_NOMINEE_LIST_INFORMATION_FOR_MAILING = "GET_NOMINEE_LIST_INFORMATION_FOR_MAILING";
	public static final String GET_UNAVAILABLE_KOALA_STATUS = "GET_UNAVAILABLE_KOALA_STATUS";

	public static final String UNAVAILABLE = "UNAVAILABLE";

	public static List<String> getExamStatusList() {
		return Arrays.asList(examStatusList);
	}

	// koala
	public static final String SUCCESS_LIST = "successList";
	public static final String FAILURE_LIST = "failureList";

	// procedure column mapping
	public static final String PRC_USER_MAILID = "user_mailid";
	public static final String PRC_LOCATION_ID = "location_id";
	public static final String PRC_LOCATION_CODE = "location_code";
	public static final String PRC_LOCATION_USER = "location_user";
	public static final String PRC_SITE_ADMIN_LIST = "site_admin_list";
	public static final String PRC_EXAM_NAME = "exam_name";
	public static final String PRC_TIMEZONE = "timeZone";
	public static final String PRC_EXAM_START_DATE_TIME = "exam_start_date_time";

	public static final String SUBJECT_NOMINEE_NOTIFICATION = "Candidate Detail Notification";
	public static final String TEMPLATE_NOMINEE_NOTIFICATION = "Notification Template";
	public static final String CHECK_GROUP_AVAIL_OR_NOT = "CHECK_GROUP_AVAIL_OR_NOT";
	public static final String UPDATE_PROCTOR_EXAM_REMOVE_DTL = "UPDATE_PROCTOR_EXAM_REMOVE_DTL";
	public static final String NEW_LINE_CHARACTER = "\n";

	public static final String S0016_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0016";
	public static final String S0017_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0017";
	public static final String S0018_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0018";
	public static final String S0019_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0019";
	public static final String S0020_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0020";

	public static final String E1135_ERROR_CODE = "RH-HTTP_CODE-E1135";
	public static final String E1135_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1135";

	public static final String E1136_ERROR_CODE = "RH-HTTP_CODE-E1136";
	public static final String E1136_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1136";

	public static final String GET_AUDIT_DATA = "GET_AUDIT_DATA";
	// google API's common constants
	public static final String GOOGLE_API_TO_GET_LAT_LONG_FROM_ADDRESS = "https://maps.googleapis.com/maps/api/geocode/xml?address=";
	public static final String SENSOR_STATUS = "&sensor=true";
	public static final String GEOCODE_RESPONSE_STATUS_PATH = "/GeocodeResponse/status";
	public static final String LATITUDE_PATH = "//geometry/location/lat";
	public static final String LONGITUDE_PATH = "//geometry/location/lng";
	public static final String KEY = "&key=";
	public static final String GOOGLE_UNRESTRICTED_API_KEY = "GOOGLE_UNRESTRICTED_API_KEY";
	public static final String GOOGLE_RESTRICTED_API_KEY = "GOOGLE_RESTRICTED_API_KEY";
	public static final String DOWNLOAD_ARTIFACT_API_URL = "DOWNLOAD_ARTIFACT_API_URL";
	public static final String DOWNLOAD_ARTIFACT_TOKEN = "DOWNLOAD_ARTIFACT_TOKEN";

	public static List<String> getKoalaStatusList() {
		return Arrays.asList(GUMTREE_KOALA_STATE);
	}

	public static final String PENDING_STATUS = "Pending";
	public static final String REMARK = "remark";
	public static final String SPACE = " ";
	public static final String ADD_ORDER_BY_LOCATION_CODE = "ADD_ORDER_BY_LOCATION_CODE";
	public static final String GET_LOCATIONID_BY_USER = "GET_LOCATIONID_BY_USER";
	public static final String AND_HQL = " and ";
	public static final String WHERE_HQL = " where ";
	public static final String IN_HQL = " in (";
	public static final String CLOSE_BRACE_HQL = ")";
	public static final String ADD_REGIONID_FILTER_FOR_LOCATION = "ADD_REGIONID_FILTER_FOR_LOCATION";
	public static final String ADD_REGIONID_FILTER_FOR_COUNTRY = "ADD_REGIONID_FILTER_FOR_COUNTRY";
	public static final String ADD_COUNTRYID_FILTER = "ADD_COUNTRYID_FILTER";
	public static final String ADD_ORDER_BY_COUNTRY_NAME = "ADD_ORDER_BY_COUNTRY_NAME";
	public static final String COUNTRY_DOT_REGIONMASTER = "COUNTRY_DOT_REGIONMASTER";
	public static final String GET_REGIONID_BY_USER = "GET_REGIONID_BY_USER";
	public static final String GET_LOCATION_REGION_BY_USER_ID = "GET_LOCATION_REGION_BY_USER_ID";
	public static final String GET_LOCATION_DETAIL_BY_SITE_ADMIN_ID = "GET_LOCATION_DETAIL_BY_SITE_ADMIN_ID";
	public static final String GET_LOCATION_DETAIL_BY_REGIONAL_ADMIN_ID = "GET_LOCATION_DETAIL_BY_REGIONAL_ADMIN_ID";
	// Open My Common Constants Session
	public static final String PROCTOR_ADMINISTRATOR = "PROCTOR_ADMINISTRATOR";
	public static final Integer ROLE_ID = 15;
	public static final String GET_OFFICE_DETAILS_BY_NAME = "GET_OFFICE_DETAILS_BY_NAME";
	public static final String GET_OFFICE_DETAILS_BY_ID = "GET_OFFICE_DETAILS_BY_ID";
	public static final String OFFICE_NAME = "officeName";
	public static final String OFFICE_IS_DELETED = "is_deleted";
	public static final String GET_PROCTOR_DETAILS_BY_NAME_USING_LIKE = "GET_PROCTOR_DETAILS_BY_NAME_USING_LIKE";
	public static final String GET_PROCTOR_DETAILS_BY_MULTI_PARAMETERS = "GET_PROCTOR_DETAILS_BY_MULTI_PARAMETERS";
	public static final String IS_LEAD = "isLead";
	public static final String PROCTOR_GROUP_CODE = "groupCode";
	public static final String GET_RH_USER_BY_ID = "GET_RH_USER_BY_ID";
	public static final String GET_ALL_OFFICE_DETAILS = "GET_ALL_OFFICE_DETAILS";
	public static final String GET_ALL_GROUP_DETAILS = "GET_ALL_GROUP_DETAILS";
	public static final String COMMON_ADMIN_PROCTOR_URL = "/proctoradmin";
	public static final String ADD_OFFICE_BY_PROCTOR_ADMIN = "/office.json";
	public static final String REPLACE_OFFICE_BY_PROCTOR_ADMIN = "/office/new.json";
	public static final int OFFICE_NAME_LENGTH = 50;
	public static final String DELETE_OFFICE_BY_PROCTOR_ADMIN = "/office/status.json";
	public static final String GET_OFFICE = "/offices.json";
	public static final String FIND_ALL_GROUP = "/admin/groups.json";
	public static final String PROCTOR_DETAILS_BY_NAME_USING_LIKE = "/admin/proctors.json";
	public static final String PROCTOR_NAME = "proctorName";
	public static final String PROCTOR_DETAILS_BY_MULTI_PARAMETERS = "/admin/proctor/leads.json/{pageNumber}";
	public static final String PROCTOR_DETAILS_ADD_OR_UPDATE = "/admin/proctor.json";
	public static final String PROCTOR_DETAILS_RETIRE_OR_ACTIVE = "/user.json";
	// Close My Common Constants Session
	public static final String S0024_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0024";
	public static final String S0025_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0025";
	public static final String E1138_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1138";
	public static final String E1139_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1139";
	public static final String S0026_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0026";
	public static final String S0027_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0027";
	public static final String S0028_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0028";
	public static final String E1140_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1140";
	public static final String E1141_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1141";
	public static final String S0030_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0030";
	public static final String S0031_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0031";
	public static final String GET_PROCTOR_ROLE_ID = "GET_PROCTOR_ROLE_ID";
	public static final String E1142_ERROR_CODE = "RH-HTTP_CODE_E1142";
	public static final String E1142_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION_E1142";
	public static final String E1143_ERROR_CODE = "RH-HTTP_CODE_E1143";
	public static final String E1143_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION_E1143";
	public static final String E1141_ERROR_CODE = "RH-HTTP_CODE_E1141";
	public static final String E1144_ERROR_CODE = "RH-HTTP_CODE_E1144";
	public static final String E1144_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION_E1144";
	public static final String S0032_SUCCESS_DESCRIPTION = "RH-HTTP_DESCRIPTION-S0032";
	public static final String E1148_ERROR_CODE = "RH-HTTP_CODE_E1148";
	public static final String E1148_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION_E1148";
	public static final String E1145_ERROR_CODE = "RH-HTTP_CODE-E1145";
	public static final String E1145_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1145";
	public static final String E1151_ERROR_CODE = "RH-HTTP_CODE_E1151";
	public static final String E1151_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION_E1151";
	public static final String E1160_ERROR_CODE = "RH-HTTP_CODE-E1160";
	public static final String E1160_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1160";

	public static final String ZERO_VALUE = "0";
	public static final String ZERO_PARAMETER = "ZERO";

	public static final String GET_ERROR_CASE_DATA = "GET_ERROR_CASE_DATA";
	public static final String GET_ERROR_CASE_DATA_WITH_ID = "GET_ERROR_CASE_DATA_WITH_ID";
	public static final String ERROR_CASE_DATA_URL = "/schceduleexam/errors.json/{pageNumber}";

	public static final String STATUS_FAIL = "FAIL";
	public static final String STATUS_PASS = "PASS";
	public static final String STATUS_SITEERROR = "SITEERROR";
	public static final String STATUS_NETWORKERROR = "NETWORKERROR";
	public static final String EXAM_SCHEDULE_STATUS = "EXAM_SCHEDULE_STATUS";
	public static final String CANDIDATE_EXAM_STATUS_LIST = "CANDIDATE_EXAM_STATUS";
	public static final String E1150_ERROR_CODE = "RH-HTTP_CODE-E1150";
	public static final String E1150_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1150";

	public static final String GET_DATA_EXAM_RETAKE = "GET_DATA_EXAM_RETAKE";
	public static final String EXAM_RETAKE_MESSAGE = "'. Please contact to RedHat Admin for more information";

	public static final String E1146_ERROR_CODE = "RH-HTTP_CODE-E1146";
	public static final String E1146_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1146";

	public static final String E1147_ERROR_CODE = "RH-HTTP_CODE-E1147";
	public static final String E1147_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1147";

	public static final String E1149_ERROR_CODE = "RH-HTTP_CODE-E1149";
	public static final String E1149_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1149";

	public static final String E1155_ERROR_CODE = "RH-HTTP_CODE-E1155";
	public static final String E1155_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1155";

	public static final String E1157_ERROR_CODE = "RH-HTTP_CODE-E1157";
	public static final String E1157_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1157";

	public static final String E1163_ERROR_CODE = "RH-HTTP_CODE-E1163";
	public static final String E1163_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1163";

	public static final String E1164_ERROR_CODE = "RH-HTTP_CODE-E1164";
	public static final String E1164_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1164";

	public static final String E1166_ERROR_CODE = "RH-HTTP_CODE-E1166";
	public static final String E1166_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1166";

	public static final String E1167_ERROR_CODE = "RH-HTTP_CODE-E1167";
	public static final String E1167_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1167";

	public static final String E1168_ERROR_CODE = "RH-HTTP_CODE-E1168";
	public static final String E1168_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1168";

	public static final String E1169_ERROR_CODE = "RH-HTTP_CODE-E1169";
	public static final String E1169_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1169";

	public static final String E1170_ERROR_CODE = "RH-HTTP_CODE-E1170";
	public static final String E1170_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1170";

	public static final String E1171_ERROR_CODE = "RH-HTTP_CODE-E1171";
	public static final String E1171_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1171";
	
	public static final String E1172_ERROR_CODE = "RH-HTTP_CODE-E1172";
	public static final String E1172_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1172";
	
	public static final String E1173_ERROR_CODE = "RH-HTTP_CODE-E1173";
	public static final String E1173_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1173";
	
	public static final String E1174_ERROR_CODE = "RH-HTTP_CODE-E1174";
	public static final String E1174_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1174";

	public static final String E1175_ERROR_CODE = "RH-HTTP_CODE-E1175";
	public static final String E1175_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1175";
	
	public static final String E1176_ERROR_CODE = "RH-HTTP_CODE-E1176";
	public static final String E1176_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1176";
	
	public static final String E1177_ERROR_CODE = "RH-HTTP_CODE-E1177";
	public static final String E1177_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1177";
	
	public static final String E1178_ERROR_CODE = "RH-HTTP_CODE-E1178";
	public static final String E1178_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1178";
	
	public static final String E1179_ERROR_CODE = "RH-HTTP_CODE-E1179";
	public static final String E1179_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1179";
	
	public static final String E1180_ERROR_CODE = "RH-HTTP_CODE-E1180";
	public static final String E1180_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1180";
	
	public static final String E1159_ERROR_CODE = "RH-HTTP_CODE-E1159";
	public static final String E1159_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1159";

	// app configuration code for concurrent exam capacity cap
	public static final String CAPACITY_CAP_CODE = "CAPACITYCAP";
	public static final String EXAM_NUMBER = "examNumber";
	public static final String APP_CONFIG_CODE = "appConfigCode";
	
	// app configuration code for chat idle time
	public static final String CHAT_IDLE_TIME = "CHATIDLETIME";
	
	public static final String IDLE_TIME_FOR_CHAT = "chatIdleTime";
	public static final String CONFIG_CODE = "configCode";
	
	public static final String SPECIAL_CHAR_CHECK = "[$&+,:;=?@#|'<>^*()%!]"; //". and - are not considered"

	// Approval id related constants

	public static final String GET_PENDING_APPROVAL_DETAIL = "/location/user/identities.json/{pageNumber}";
	public static final String GET_APPROVAL_ID_LIST = "GET_APPROVAL_ID_LIST";
	public static final String GET_APPROVAL_ID_LIST_BY_COUNTRY = "GET_APPROVAL_ID_LIST_BY_COUNTRY";
	public static final String GET_APPROVAL_ID_LIST_FOR_REGIONAL_ADMIN = "GET_APPROVAL_ID_LIST_FOR_REGIONAL_ADMIN";
	public static final String GET_APPROVAL_ID_OF_CANDIDATE = "GET_APPROVAL_ID_OF_CANDIDATE";
	public static final String UPDATE_APPROVAL_ID_STATUS = "/location/user/identity.json";
	public static final int FIVE_HUNDRED = 500;
	public static final String DOWNLOAD_APPROVAL_ID = "/location/user/identity.json";
	public static final String GET_IDENTITY_DTL_BY_USERID = "GET_IDENTITY_DTL_BY_USERID";
	public static final String MIME_TYPE = "application/octet-stream";
	public static final String HEADER = "Content-Disposition";

	// success flag in case of list conflict
	public static final String SUCCESS = "success";

	public static final Integer NAME_LENGTH = 200;
	public static final String GET_PROCTOR_NAME_BY_PROCTOR_LEAD = "/v1/getproctornamebyproctorlead.json";
	public static final String GET_PROCTOR_DETAILS_BY_PROCTOR_LEAD = "/v1/getproctordetailsbyproctorlead.json/{pageNumber}";
	public static final String ADD_OR_UPDATE_PROCTOR_BY_LEAD = "/v1/addOrUpdateProctorBylead.json";
	public static final String GET_PROCTOR_DETAILS_BY_PROCTOR_LEAD_QUERY = "GET_PROCTOR_DETAILS_BY_PROCTOR_LEAD_QUERY";

	// Universal Hour of Operation constants
	public static final String GET_HOUR_OF_OPERATION_URL = "/operation/hours.json";
	public static final String UPDATE_HOUR_OF_OPERATION_URL = "/operation/hours.json";
	public static final String START_DAY = "startDay";
	public static final String END_DAY = "endDay";

	// Notification constants
	public static final String IS_READ = "isRead";
	public static final String READ_TIME = "readTime";
	public static final String NOTIFICATION = "/notification/v1";
	public static final String UPDATE_NOTIFICATION_URL = "/notification/status.json";
	public static final String GET_NOTIFICATION_URL = "/notification.json";
	public static final String E1158_ERROR_CODE = "RH-HTTP_CODE-E1158";
	public static final String E1158_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1158";
	public static final String REGISTER_NOTIFICATION_URL = "/notification/register.json/{id}";
	public static final String APPROVAL_NOTIFICATION_MESSAGE = "Your uploaded ID has been approved";
	public static final String REJECT_NOTIFICATION_MESSAGE = "Your uploaded ID has been rejected";
	public static final String NOTIFICATION_MESSAGE = "notificationMessage";
	public static final String ISELIGIBLE = "ISELIGIBLE";
	public static final String ISNOTELIGIBLE = "ISNOTELIGIBLE";
	public static final String GET_ENUM_ITEM_BY_CODE = "GET_ENUM_ITEM_BY_CODE";
	public static final String GET_PROCTOR_GROUP_BY_ID = "GET_PROCTOR_GROUP_BY_ID";
	public static final String IDS = "IDS";
	public static final String E1165_ERROR_CODE = "RH-HTTP_CODE-E1165";
	public static final String E1165_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1165";
	public static final String UPDATECONFIG = "/config/config.json";
	public static final String GETCONFIG = "/config/configs.json";
	public static final String GET_PROCTOR_CONFIG = "/proctor/configs.json";
	public static final String ATTRIBUTECODE = "ATTRIBUTECODE";
	public static final String ATTRIBUTECODEVALUE = "ATTRIBUTECODEVALUE";
	public static final Object ALERTCONFIGTIME = "ALERTCONFIGTIME";
	public static final Object ALERTMAXACTIVESESSION = "ALERTMAXACTIVESESSION";
	public static final String UPDATE_ALERT_CONFIG = "UPDATE_ALERT_CONFIG";
	public static final String GET_ALERT_CONFIG = "GET_ALERT_CONFIG";
	public static final String GET_EXAMED_DETAILS = "/admin/artefacts.json/{pageNumber}";
	public static final String GET_NAMES = "/candidate/names.json";
	public static final String GET_EXAMS = "/exam/exams.json";
	public static final String GET_EXAMS_DETAILS = "GET_EXAMS_DETAILS";
	public static final String GET_EXAMS_CODE_ID = "GET_EXAMS_CODE_ID";
	public static final String GET_STUDENT_NAMES = "GET_STUDENT_NAMES";
	public static final String GET_EXAMS_CODE = "GET_EXAMS_CODE";
	public static final String OFFICE_ID = "officeId";
	public static final String CANDIDATE_NAME = "candidateName";
	public static final String GET_PROCTORS = "/admin/proctor/id.json";
	public static final String PROCTOR_ID_PARAMETER = "id";
	public static final String GET_PROCTOR_BY_ID = "GET_PROCTOR_BY_ID";

	public static final String GET_SCHEDULED_EXAMS = "/scheduleexam/exams.json/{pageNumber}";

	// rhEmails status code
	public static final String CRONE_JOB_STATUS_CODE = "CRONE_JOB_STATUS";
	public static final String CRONE_JOB_STATUS_IN_PROGRESS = "INPROGRESS";
	public static final String CRONE_JOB_STATUS_SUCCESS = "SUCCESS";
	public static final String CRONE_JOB_STATUS_FAIL = "FAIL";

	public static final String CRONE_JOB_INTERVAL = "time";
	public static final String MAIL_RESEND_COUNT = "MAIL_RESEND_COUNT";
	public static final String MAIL_CRON_INTERVAL = "MAIL_CRON_INTERVAL";
	public static final String RESEND_ATTEMPT = "resendAttempt";
	public static final String RECORDS_PICKED_FOR_MAIL = "recordsPickedForMail";
	public static final String CRON_USER = "cronUser";

	// api to change exam status by proctor
	public static final String UPDATE_EXAM_STATUS_URL = "integration/v1/scheduleexam/exam/status.json";
	public static final String GET_SCHEDULED_EXAM_BY_UUID = "GET_SCHEDULED_EXAM_BY_UUID";
	public static final String EXAM_DATE_TIME = "examDateTime";
	public static final String EXAM_UUID = "uuid";
	public static final String GET_ARTIFACTS = "/artifacts/uuid";
	public static final String RETAIN_STATUS = "/artifacts/status";

	public static final String LMS_CRON_INTERVAL = "LMS_CRON_INTERVAL";
	public static final String LMS_RESEND_COUNT = "LMS_RESEND_COUNT";

	public static final String IS_SENT_FOR_CRON = "isSentForCron";
	public static final String GET_PROCTOR_ALL_SESSION_DETAILS = "GET_PROCTOR_ALL_SESSION_DETAILS";
	public static final String EXPRIED = "EXPRIED";
	public static final String ACTIVE = "ACTIVE";
	public static final String ISRETAIN = "isRetain";
	public static final int PROCTOR_EMAIL_ID_INDEX = 13;
	public static final String GET_ARTIFACTS_DETAILS = "GET_ARTIFACTS_DETAILS";
	public static final String DAYS = "DAYS";
	public static final String MONTHS = "MONTHS";
	public static final String YEARS = "YEARS";

	public static final String APP_CONFIG_CHAT_RETENTION = "CHATRETENTIONDAYS";
	public static final String APP_CONFIG_IMAGE_RETENTION = "IMAGERETENTIONDAYS";
	public static final String APP_CONFIG_VIDEO_RETENTION = "VIDEORETENTIONDAYS";

	public static final int RETENTION_POLICY_MAX_ALLOWED_DAYS = 99;

	// proctor request token key
	public static final String PROCTOR_REQUEST_AUTHORIZATION_TOKEN = "PROCTOR_REQUEST_AUTHORIZATION_TOKEN";

	// proctor artifact constants
	public static final String PROCTOR_ARTIFACT_API_URL = "PROCTOR_ARTIFACT_API_URL";
	public static final String ARTIFACT_UUID = "uuId";
	public static final String ARTIFACT_ID = "artifactId";
	public static final String RETENTION = "retention";
	public static final String PKID = "pkId";
	public static final String ARTIFACT_LIST = "artifactList";
	public static final String DATE_TIME = "dateTime";
	public static final String ARTIFACT_TYPE = "artifactType";
	public static final String EXPIRE_DATE = "expireDate";
	public static final String ARTIFACT_PARAMETER = "artifacts";
	public static final String VIDEOS_ARTIFACT = "VIDEO";
	public static final String SNAPSHOT_ARTIFACT = "SNAPSHOT";
	public static final String NOTES_ARTIFACT = "NOTES";
	public static final String IS_REQUIRED = "isRequired";
	
	public static final String PROCTOR_REPORT_API_URL = "PROCTOR_REPORT_API_URL";

	public static final String DOMAIN = "domain";
    public static final String DOMAIN_WITH_EXTENTION= "domainWithExtension";
    public static final String EMAIL_ID = "emailID";
    
    public static final String GET_LOCATION_TIME_INTERVAL_FOR_SLOTS = "GET_LOCATION_TIME_INTERVAL_FOR_SLOTS";
    
    public static final String LOGOUT_URL_PARAMETER="?logoutURLExternal=";
    public static final String CONFIG_SYSTEM_API_URL="/common/config.json";
    
    public static final String EXTERNAL_ENTITY_ID_KEY="onelogin.saml2.sp.entityid";
    public static final String LOGOUT_REDIRECT_URL_PARAMETER="?redirect=";
    public static final String EXTERNAL_USER_LOGIN_URL="externaluser/login";
    
    public static final String USER_NOTIFICATION_TYPE = "USER_NOTIFICATION_TYPE";
    public static final String USER_NOTIFICATION_DURATION_SUCCESS_TYPE = "USER_NOTIFICATION_DURATION_SUCCESS_TYPE";
    
    public static final String IDENTITY_UPDATE_NOTIFICATION = "IDENTITY_UPDATE_NOTIFICATION";
    public static final String EXAM_NOTIFICATION = "EXAM_NOTIFICATION";
    public static final String ELIGIBILITY_EXPIRY_NOTIFICATION = "ELIGIBILITY_EXPIRY_NOTIFICATION";
    
    public static final String DAILY_SUCCESS = "DAILY_SUCCESS";
    public static final String WEEKLY_SUCCESS = "WEEKLY_SUCCESS";
    public static final String MONTHLY_SUCCESS = "MONTHLY_SUCCESS";
    
    public static final String NEXT_DAY_NOTIFICATION_MESSAGE_FIRST = "Upcoming EXAM CODE(";
    public static final String NEXT_DAY_NOTIFICATION_MESSAGE_SECOND = ") tomorrow : Date ";
    public static final String NEXT_WEEK_NOTIFICATION_MESSAGE_FIRST = "Upcoming EXAM CODE(";
    public static final String NEXT_WEEK_NOTIFICATION_MESSAGE_SECOND = ") next week : Date ";
    public static final String NEXT_MONTH_NOTIFICATION_MESSAGE_FIRST = "EXAM CODE(";
    public static final String NEXT_MONTH_NOTIFICATION_MESSAGE_SECOND = ") is Expiring next month, please schedule to prevent it from being expired";
    
    public static final String GET_CANDIDATE_SCHEDULED_EXAMS = "GET_CANDIDATE_SCHEDULED_EXAMS";
    public static final String GET_USER_ELIGIBILITIES = "GET_USER_ELIGIBILITIES";
    public static final String GET_USER_NOTIFICATIONS = "GET_USER_NOTIFICATIONS";
    public static final String UPDATE_NOTIFICATION_STATUS_TO_NULL = "UPDATE_NOTIFICATION_STATUS_TO_NULL";
    
    public static final String GET_USER_ROLE_BY_ID = "GET_USER_ROLE_BY_ID";
    
    public static final String DEFAULT_MAX_SESSION_ASSIGN_COUNT = "DEFAULT_MAX_SESSION_ASSIGN_COUNT";
    public static final String GET_ENUM_ITEM_CODE_BY_ID = "GET_ENUM_ITEM_CODE_BY_ID";
    
    public static final String REQUEST_TYPE = "requestType";
    
    //ssl constatnts
    public static final String KEYSTORE_PATH_KEY="javax.net.ssl.keyStore";
    public static final String KEYSTORE_PASS_KEY="javax.net.ssl.keyStorePassword";
    public static final String TRUSTSTORE_PATH_KEY="javax.net.ssl.trustStore";
    public static final String TRUSTSTORE_PASS_KEY="javax.net.ssl.trustStorePassword";
    
    //Security Headers
    public static final String X_FRAME_OPTIONS="x-frame-options";
    public static final String X_CONTENT_TYPE_OPTIONS="x-content-type-options";
    public static final String STRICT_TRANSPORT_SECURITY="strict-transport-security";
    public static final String CONTENT_SECURITY_POLICY="content-security-policy";
    public static final String X_PERMITTED_CROSS_DOMAIN_POLICIES="x-permitted-cross-domain-policies";
    
    public static final String GET_PROCTOR_LIST_BY_GLOBAL_ADMIN = "GET_PROCTOR_LIST_BY_GLOBAL_ADMIN";
    public static final String GET_PROCTOR_LIST_BY_PROCTOR_LEAD = "GET_PROCTOR_LIST_BY_PROCTOR_LEAD";
    public static final String PROCTOR_LIST_URL = "/proctors.json";


}
