package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Set;

public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set<String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z10);

    void setAttributionBehavior(int i10);

    void setDisabledActionModeMenuItems(int i10);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z10);

    void setForceDark(int i10);

    void setForceDarkBehavior(int i10);

    void setOffscreenPreRaster(boolean z10);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);

    void setSafeBrowsingEnabled(boolean z10);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebAuthnSupport(int i10);

    void setWillSuppressErrorPage(boolean z10);
}
