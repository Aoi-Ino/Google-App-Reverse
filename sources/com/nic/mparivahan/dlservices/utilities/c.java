package com.nic.mparivahan.dlservices.utilities;

import android.util.Log;
import cm.g;
import cm.l;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22374a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4) {
            l.f(str, "dlNumber");
            l.f(str2, "dob");
            l.f(str3, "rtoCode");
            l.f(str4, "random_key");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", (Object) str);
            jSONObject.put("dob", (Object) str2);
            jSONObject.put("rtoCodeDLTr", (Object) str3);
            jSONObject.put("applcatgDLserReq", (Object) "G");
            Log.d("checkEligiblity", jSONObject.toString());
            return jSONObject;
        }

        public final String b(int i10) {
            StringBuilder sb2 = new StringBuilder();
            String substring = "dlari$#@$G#2033@".substring(0, 11);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append(Integer.toString(i10));
            return sb2.toString();
        }

        public final JSONObject c(String str) {
            l.f(str, "selectState");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", (Object) str);
            Log.d("state_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject d() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("agentId", (Object) "DelhTrans");
            jSONObject.put("agentPwd", (Object) "d9fe1613399b0883e4ecf3f710e18317");
            jSONObject.put("agentIpAddress", (Object) "164.100.161.142");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            Log.d("state_request", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject e(String str) {
            l.f(str, "stCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stCode", (Object) str);
            Log.d("customState", jSONObject.toString());
            return jSONObject;
        }

        public final JSONObject f(String str, String str2) {
            l.f(str, "dlnumber");
            l.f(str2, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlno", (Object) str);
            jSONObject.put("dob", (Object) str2);
            Log.d("getLastRTO_", jSONObject.toString());
            return jSONObject;
        }

        public final int g(double d10, double d11) {
            return (int) (((double) ((int) (Math.random() * ((d11 - d10) + ((double) 1))))) + d10);
        }

        public final JSONObject h(String str) {
            l.f(str, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsId", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            Log.d("resend_otp", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject i(String str, String str2) {
            l.f(str, "otp");
            l.f(str2, "otpid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otpSmsId", Integer.parseInt(str2));
            jSONObject.put("otpVal", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsOtp", (Object) jSONObject);
            Log.d("verify_otp", jSONObject2.toString());
            return jSONObject2;
        }

        public final JSONObject j(String str, String str2) {
            l.f(str, "mobile_number");
            l.f(str2, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", Long.parseLong(str2));
            jSONObject.put("smsEvent", (Object) "DL_VRF");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            Log.d("sendOtp", jSONObject2.toString());
            return jSONObject2;
        }
    }
}
