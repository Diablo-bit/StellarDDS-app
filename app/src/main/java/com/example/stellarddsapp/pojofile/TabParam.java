
package com.example.stellarddsapp.pojofile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TabParam {

    @SerializedName("param_name")
    @Expose
    private String paramName;
    @SerializedName("param_key")
    @Expose
    private String paramKey;
    @SerializedName("param_value")
    @Expose
    private Integer paramValue;
    @SerializedName("param_description")
    @Expose
    private String paramDescription;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public Integer getParamValue() {
        return paramValue;
    }

    public void setParamValue(Integer paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamDescription() {
        return paramDescription;
    }

    public void setParamDescription(String paramDescription) {
        this.paramDescription = paramDescription;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}
