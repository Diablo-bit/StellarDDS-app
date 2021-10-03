package com.example.stellarddsapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiCallPojo<TabParam> {

    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("client_id")
    @Expose
    private Integer clientId;
    @SerializedName("client_cust_id")
    @Expose
    private Integer clientCustId;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("api_token")
    @Expose
    private String apiToken;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("last_login_at")
    @Expose
    private String lastLoginAt;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("TabParams")
    @Expose
    private List<TabParam> tabParams = null;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("user_photo")
    @Expose
    private Object userPhoto;
    @SerializedName("clientCompany")
    @Expose
    private String clientCompany;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("invoice_logo")
    @Expose
    private String invoiceLogo;
    @SerializedName("washout_certification_logo")
    @Expose
    private String washoutCertificationLogo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientCustId() {
        return clientCustId;
    }

    public void setClientCustId(Integer clientCustId) {
        this.clientCustId = clientCustId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public List<TabParam> getTabParams() {
        return tabParams;
    }

    public void setTabParams(List<TabParam> tabParams) {
        this.tabParams = tabParams;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(Object userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInvoiceLogo() {
        return invoiceLogo;
    }

    public void setInvoiceLogo(String invoiceLogo) {
        this.invoiceLogo = invoiceLogo;
    }

    public String getWashoutCertificationLogo() {
        return washoutCertificationLogo;
    }

    public void setWashoutCertificationLogo(String washoutCertificationLogo) {
        this.washoutCertificationLogo = washoutCertificationLogo;
    }

}



