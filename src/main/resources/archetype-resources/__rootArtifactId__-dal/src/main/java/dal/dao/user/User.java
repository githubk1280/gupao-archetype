#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.dao.user;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wx_open_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String wxOpenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wx_info
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String wxInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.balance
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private Integer balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_pic
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String userPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mailbox
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private String mailbox;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_type
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    private Byte userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wx_open_id
     *
     * @return the value of user.wx_open_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getWxOpenId() {
        return wxOpenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wx_open_id
     *
     * @param wxOpenId the value for user.wx_open_id
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wx_info
     *
     * @return the value of user.wx_info
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getWxInfo() {
        return wxInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wx_info
     *
     * @param wxInfo the value for user.wx_info
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setWxInfo(String wxInfo) {
        this.wxInfo = wxInfo == null ? null : wxInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.balance
     *
     * @return the value of user.balance
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.balance
     *
     * @param balance the value for user.balance
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_pic
     *
     * @return the value of user.user_pic
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_pic
     *
     * @param userPic the value for user.user_pic
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mailbox
     *
     * @return the value of user.mailbox
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mailbox
     *
     * @param mailbox the value for user.mailbox
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_type
     *
     * @return the value of user.user_type
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_type
     *
     * @param userType the value for user.user_type
     *
     * @mbggenerated Tue Aug 16 12:22:53 CST 2016
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }
}