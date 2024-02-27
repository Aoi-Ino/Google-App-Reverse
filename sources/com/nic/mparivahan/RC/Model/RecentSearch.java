package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;

@Keep
public final class RecentSearch {
    private String driverImage;
    private String searchNumber;
    private String searchTimeStamp;
    private String searchType;
    private String searchUserName;

    public final String getDriverImage() {
        return this.driverImage;
    }

    public final String getSearchNumber() {
        return this.searchNumber;
    }

    public final String getSearchTimeStamp() {
        return this.searchTimeStamp;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final String getSearchUserName() {
        return this.searchUserName;
    }

    public final void setDriverImage(String str) {
        this.driverImage = str;
    }

    public final void setSearchNumber(String str) {
        this.searchNumber = str;
    }

    public final void setSearchTimeStamp(String str) {
        this.searchTimeStamp = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public final void setSearchUserName(String str) {
        this.searchUserName = str;
    }
}
