package t8;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.Afterpayment;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycRequest;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import j$.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONObject;
import v9.d;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16582a = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f16583b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f16584c = Pattern.compile("/^[A-Za-z][A-Za-z\\-]([A-Za-z][A-Za-z\\-]+)*/");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void d(Dialog dialog, View view) {
            l.f(dialog, "$dialog");
            dialog.dismiss();
        }

        public final JSONObject A(String str, long j10, int i10, String str2, String str3, String str4) {
            l.f(str, "sarlogApplDate");
            l.f(str2, "sarlogDlDob");
            l.f(str3, "sarlogDlNumber");
            l.f(str4, "sarlogRtoCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String format = String.format(str2, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                l.e(format, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sarlogApplDate", (Object) d.f17494a.m());
                jSONObject2.put("sarlogApplNo", j10);
                jSONObject2.put("sarlogCtzId", (long) i10);
                jSONObject2.put("sarlogDlDob", (Object) format);
                jSONObject2.put("sarlogDlNumber", (Object) str3);
                jSONObject2.put("sarlogRtoCd", (Object) str4);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", (Object) jSONObject2);
                Log.d("DlUpdateReq", jSONObject3.toString());
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }

        public final JSONObject B(String str, String str2, String str3, String str4) {
            l.f(str, "ctzRecordId");
            l.f(str2, "ctzMobileNo");
            l.f(str3, "ctzDeviceId");
            l.f(str4, "mpin");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ctzMpin", (Object) str4);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ctzRecordId", Long.parseLong(str));
                jSONObject3.put("ctzMobile", (Object) str2);
                jSONObject3.put("ctzDeviceId", (Object) str3);
                jSONObject.put("citizenLogin", (Object) jSONObject3);
                jSONObject.put("mparCitizenUser", (Object) jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject C(AfterPaymentResponse afterPaymentResponse, int i10) {
            String str;
            String str2;
            l.f(afterPaymentResponse, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (i10 == 2) {
                    jSONObject2.put("vahlogApplNo", (Object) afterPaymentResponse.getAppl_no());
                    jSONObject2.put("vahlogRcNumber", (Object) afterPaymentResponse.getRegn_no());
                    jSONObject2.put("setVahlogPhotoUplDate", (Object) afterPaymentResponse.getRcpt_dt());
                    str = "setVahlogDocUplDate";
                    str2 = afterPaymentResponse.getRcpt_dt();
                } else {
                    jSONObject2.put("vahlogApplNo", (Object) afterPaymentResponse.getAppl_no());
                    d.a aVar = d.f17494a;
                    String rcpt_dt = afterPaymentResponse.getRcpt_dt();
                    l.c(rcpt_dt);
                    jSONObject2.put("vahlogFeeDate", (Object) aVar.g(rcpt_dt));
                    jSONObject2.put("vahlogRcNumber", (Object) afterPaymentResponse.getRegn_no());
                    jSONObject2.put("vahlogReptDate", (Object) aVar.g(afterPaymentResponse.getRcpt_dt()));
                    jSONObject2.put("vahlogFeeAmt", (Object) afterPaymentResponse.getRcpt_amt());
                    jSONObject2.put("vahlogReptNo", (Object) afterPaymentResponse.getRcpt_NO());
                    str = "vahlogRtoCd";
                    String regn_no = afterPaymentResponse.getRegn_no();
                    if (regn_no != null) {
                        str2 = regn_no.substring(0, 4);
                        l.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str2 = null;
                    }
                }
                jSONObject2.put(str, (Object) str2);
                jSONObject.put("vahanLog", (Object) jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject D(DocUpdateLogs docUpdateLogs) {
            String str;
            l.f(docUpdateLogs, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                d.a aVar = d.f17494a;
                jSONObject2.put("vahlogFeeDate", (Object) aVar.g(docUpdateLogs.getVahlogReptDate()));
                jSONObject2.put("vahlogReptDate", (Object) aVar.g(docUpdateLogs.getVahlogReptDate()));
                jSONObject2.put("vahlogFeeAmt", docUpdateLogs.getVahlogFeeAmt());
                jSONObject2.put("vahlogReptNo", (Object) docUpdateLogs.getVahlogReptNo());
                String vahlogRcNumber = docUpdateLogs.getVahlogRcNumber();
                if (vahlogRcNumber != null) {
                    str = vahlogRcNumber.substring(0, 4);
                    l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = null;
                }
                jSONObject2.put("vahlogRtoCd", (Object) str);
                jSONObject2.put("vahlogApplNo", (Object) docUpdateLogs.getVahlogApplNo());
                jSONObject2.put("vahlogRcNumber", (Object) docUpdateLogs.getVahlogRcNumber());
                jSONObject2.put("VahlogPhotoUplDate", (Object) docUpdateLogs.getSetVahlogPhotoUplDate());
                jSONObject2.put("VahlogDocUplDate", (Object) docUpdateLogs.getSetVahlogDocUplDate());
                jSONObject.put("vahanLog", (Object) jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject E(Afterpayment afterpayment, int i10) {
            String str;
            String str2;
            l.f(afterpayment, "afterpayment");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (i10 == 2) {
                    jSONObject2.put("vahlogApplNo", (Object) afterpayment.getTrans_NO());
                    jSONObject2.put("vahlogRcNumber", (Object) afterpayment.getRegn_NO());
                    jSONObject2.put("setVahlogPhotoUplDate", (Object) afterpayment.getRcpt_DT());
                    str = "setVahlogDocUplDate";
                    str2 = afterpayment.getRcpt_DT();
                } else {
                    jSONObject2.put("vahlogApplNo", (Object) afterpayment.getTrans_NO());
                    d.a aVar = d.f17494a;
                    String rcpt_DT = afterpayment.getRcpt_DT();
                    l.c(rcpt_DT);
                    jSONObject2.put("vahlogFeeDate", (Object) aVar.g(rcpt_DT));
                    jSONObject2.put("vahlogRcNumber", (Object) afterpayment.getRegn_NO());
                    jSONObject2.put("vahlogReptDate", (Object) aVar.g(afterpayment.getRcpt_DT()));
                    jSONObject2.put("vahlogFeeAmt", afterpayment.getRcpt_amt());
                    jSONObject2.put("vahlogReptNo", (Object) afterpayment.getRcpt_NO());
                    str = "vahlogRtoCd";
                    String regn_NO = afterpayment.getRegn_NO();
                    if (regn_NO != null) {
                        str2 = regn_NO.substring(0, 4);
                        l.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str2 = null;
                    }
                }
                jSONObject2.put(str, (Object) str2);
                jSONObject.put("vahanLog", (Object) jSONObject2);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final JSONObject b(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "mobile_number");
            l.f(str2, "ctzDispName");
            l.f(str3, "ctzEmail");
            l.f(str4, "mpin");
            l.f(str5, "state");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzMobile", (Object) str);
            jSONObject.put("ctzDispName", (Object) str2);
            jSONObject.put("ctzEmail", (Object) str3);
            jSONObject.put("ctzMpin", (Object) str4);
            jSONObject.put("ctzMpinStatus", !ka.c.f13158a.m(str4) && str4.length() >= 6);
            jSONObject.put("ctzStateCd", (Object) str5);
            return jSONObject;
        }

        public final void c(Context context, String str) {
            l.f(context, "context");
            l.f(str, "title");
            Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.mvvm_number_dialog);
            View findViewById = dialog.findViewById(R.id.txt_dialog);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(str);
            View findViewById2 = dialog.findViewById(R.id.f19013ok);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById2).setOnClickListener(new b(dialog));
            dialog.show();
        }

        public final String e(eKycRequest ekycrequest) {
            l.f(ekycrequest, "ekyc");
            String t10 = new i7.d().t(ekycrequest);
            l.e(t10, "toJson(...)");
            return t10.toString();
        }

        public final JSONObject f(String str, String str2, String str3, String str4) {
            l.f(str, "id");
            l.f(str2, "did");
            l.f(str3, "mdid");
            l.f(str4, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", Long.parseLong(str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", (Object) jSONObject);
            jSONObject2.put("did", (Object) str2);
            jSONObject2.put("mid", (Object) str3);
            jSONObject2.put("tid", (Object) str4);
            return jSONObject2;
        }

        public final JSONObject g(String str) {
            l.f(str, "mobile_no");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzMobile", (Object) str);
            jSONObject.put("ctzMpinStatus", false);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject h(String str, String str2, String str3, String str4) {
            l.f(str, "ctzId");
            l.f(str2, "did");
            l.f(str3, "mid");
            l.f(str4, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            jSONObject.put("did", (Object) str2);
            jSONObject.put("mid", (Object) str3);
            jSONObject.put("tid", (Object) str4);
            return jSONObject;
        }

        public final Pattern i() {
            return c.f16583b;
        }

        public final JSONObject j(String str, String str2) {
            l.f(str, "mobile_number");
            l.f(str2, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", (Object) str2);
            jSONObject.put("smsEvent", (Object) "CTZ_UDT");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject k() {
            return new JSONObject();
        }

        public final JSONObject l() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "1");
            return jSONObject;
        }

        public final JSONObject m(String str, int i10) {
            l.f(str, "mobile_number");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsEvent", (Object) "CTZ_REG");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject n(String str) {
            l.f(str, "mobile_number");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsEvent", (Object) "CTZ_SIG");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject o(String str) {
            l.f(str, "smsId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsId", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject p(String str) {
            l.f(str, "mobileNumber");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userName", (Object) str);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final boolean q(String str) {
            l.f(str, "mobile_number");
            Pattern compile = Pattern.compile(VUtility.REG);
            l.e(compile, "compile(...)");
            return compile.matcher(str).find();
        }

        public final boolean r(String str) {
            l.f(str, "str");
            return i().matcher(str).matches();
        }

        public final JSONObject s(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "otp");
            l.f(str2, "otpid");
            l.f(str3, "number");
            l.f(str4, "fcm_token");
            l.f(str5, "device_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceModel", (Object) Build.MODEL);
            jSONObject.put("deviceOsType", (Object) "Android");
            jSONObject.put("deviceOsVersion", (Object) Build.DEVICE);
            jSONObject.put("deviceFcmToken", (Object) str4);
            jSONObject.put("deviceId", (Object) str5);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(str2));
            jSONObject2.put("otpVal", (Object) str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ctzMobile", (Object) str3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("smsOtp", (Object) jSONObject2);
            jSONObject4.put("mparCitizenUser", (Object) jSONObject3);
            jSONObject4.put("mparCitizenDevice", (Object) jSONObject);
            return jSONObject4;
        }

        public final JSONObject t(String str, String str2) {
            l.f(str, "otp");
            l.f(str2, "otpid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otpSmsId", Long.parseLong(str2));
            jSONObject.put("otpVal", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsOtp", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            l.f(str, "otp");
            l.f(str2, "otpid");
            l.f(str3, "device_id");
            l.f(str4, "mobile_no");
            l.f(str5, "tid");
            l.f(str6, "docnumber");
            l.f(str7, "citizenId");
            l.f(str8, "docType");
            l.f(str9, "dob");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("docCtzId", Long.parseLong(str7));
            jSONObject.put("docNumber", (Object) q.B0(str6).toString());
            jSONObject.put("docType", (Object) str8);
            if (str8.equals("DL")) {
                jSONObject.put("docDob", (Object) z9.a.f18947a.b(q.B0(str9).toString()));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(str2));
            jSONObject2.put("otpVal", (Object) str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("smsOtp", (Object) jSONObject2);
            jSONObject3.put("mparCitizenDoc", (Object) jSONObject);
            jSONObject3.put("did", (Object) str3);
            jSONObject3.put("mid", (Object) str4);
            jSONObject3.put("tid", (Object) str5);
            return jSONObject3;
        }

        public final JSONObject v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            l.f(str, "otp");
            l.f(str2, "otpid");
            l.f(str3, "mobile_number");
            l.f(str4, "ctzDispName");
            l.f(str5, "ctzEmail");
            l.f(str6, "mpin");
            l.f(str7, "state");
            l.f(str8, "device_id");
            l.f(str9, "fcm_token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceModel", (Object) Build.MODEL);
            jSONObject.put("deviceOsType", (Object) "Android");
            jSONObject.put("deviceOsVersion", (Object) Build.DEVICE);
            jSONObject.put("deviceFcmToken", (Object) str9);
            jSONObject.put("deviceId", (Object) str8);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("otpSmsId", Long.parseLong(str2));
            jSONObject2.put("otpVal", (Object) str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("mparCitizenDevice", (Object) jSONObject);
            jSONObject3.put("smsOtp", (Object) jSONObject2);
            jSONObject3.put("mparCitizenUser", (Object) b(str3, str4, str5, str6, str7));
            return jSONObject3;
        }

        public final JSONObject w(String str, String str2) {
            l.f(str, "mobile_number");
            l.f(str2, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", (Object) str2);
            jSONObject.put("smsEvent", (Object) "CTZ_DOC");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject x(String str, String str2, String str3, long j10, int i10, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12) {
            String str13 = str;
            String str14 = str2;
            String str15 = str4;
            String str16 = str5;
            String str17 = str9;
            String str18 = str10;
            String str19 = str11;
            l.f(str13, "sarlogAadhar4");
            l.f(str14, "sarlogApplCat");
            l.f(str3, "sarlogApplDate");
            l.f(str15, "sarlogDlDob");
            l.f(str16, "sarlogDlNumber");
            l.f(str6, "sarlog_eKYC");
            l.f(str7, "sarlog_eSign");
            String str20 = "sarlog_eSign";
            l.f(str8, "sarlogGender");
            l.f(str17, "sarlogMobileNo");
            String str21 = "sarlogMobileNo";
            l.f(str18, "sarlogPurCd");
            String str22 = "sarlogPurCd";
            l.f(str19, "sarlogRtoCd");
            String str23 = "sarlogRtoCd";
            l.f(str12, "sarlogStateCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String format = String.format(str15, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                l.e(format, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sarlogAadhar4", (Object) str13);
                jSONObject2.put("sarlogApplCat", (Object) str14);
                jSONObject2.put("sarlogApplDate", (Object) d.f17494a.m());
                jSONObject2.put("sarlogApplNo", j10);
                jSONObject2.put("sarlogCtzId", (long) i10);
                jSONObject2.put("sarlogDlDob", (Object) format);
                jSONObject2.put("sarlogDlNumber", (Object) str16);
                jSONObject2.put("sarlog_eKYC", (Object) str6);
                jSONObject2.put(str20, (Object) str7);
                jSONObject2.put("sarlogGender", (Object) "M");
                jSONObject2.put(str21, (Object) str17);
                jSONObject2.put("sarlogOrgDonor", z10);
                jSONObject2.put(str22, (Object) str18);
                jSONObject2.put(str23, (Object) str19);
                jSONObject2.put("sarlogStateCd", (Object) str12);
                jSONObject2.put("sarlogStatus", true);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", (Object) jSONObject2);
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }

        /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final org.json.JSONObject y(java.lang.String r9, java.lang.String r10, com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            /*
                r8 = this;
                java.lang.String r0 = "ctzRecordId"
                cm.l.f(r9, r0)
                java.lang.String r0 = "ctzMobileNo"
                cm.l.f(r10, r0)
                java.lang.String r0 = "rc_details"
                cm.l.f(r11, r0)
                java.lang.String r0 = "isEKYC"
                cm.l.f(r12, r0)
                java.lang.String r0 = "appl_no"
                cm.l.f(r13, r0)
                java.lang.String r0 = "purCode"
                cm.l.f(r14, r0)
                java.lang.String r0 = "rtocode"
                cm.l.f(r15, r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fa }
                r1.<init>()     // Catch:{ Exception -> 0x00fa }
                java.lang.String r2 = "Y"
                r3 = 1
                boolean r2 = km.p.o(r12, r2, r3)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r4 = "vahlogAadhar4"
                if (r2 == 0) goto L_0x003e
                java.lang.String r2 = ""
            L_0x003a:
                r1.put((java.lang.String) r4, (java.lang.Object) r2)     // Catch:{ Exception -> 0x00fa }
                goto L_0x0041
            L_0x003e:
                java.lang.String r2 = "0000"
                goto L_0x003a
            L_0x0041:
                java.lang.String r2 = "vahlogApplDate"
                v9.d$a r4 = v9.d.f17494a     // Catch:{ Exception -> 0x00fa }
                java.lang.String r4 = r4.m()     // Catch:{ Exception -> 0x00fa }
                r1.put((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r2 = "vahlogApplNo"
                r1.put((java.lang.String) r2, (java.lang.Object) r13)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r13 = "vahlogChassis5"
                java.lang.String r2 = r11.getRc_chasi_no()     // Catch:{ Exception -> 0x00fa }
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                r5 = 0
                if (r2 == 0) goto L_0x007d
                java.lang.String r6 = r11.getRc_chasi_no()     // Catch:{ Exception -> 0x00fa }
                if (r6 == 0) goto L_0x006b
                int r6 = r6.length()     // Catch:{ Exception -> 0x00fa }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00fa }
                goto L_0x006c
            L_0x006b:
                r6 = r5
            L_0x006c:
                cm.l.c(r6)     // Catch:{ Exception -> 0x00fa }
                int r6 = r6.intValue()     // Catch:{ Exception -> 0x00fa }
                int r6 = r6 + -5
                java.lang.String r2 = r2.substring(r6)     // Catch:{ Exception -> 0x00fa }
                cm.l.e(r2, r4)     // Catch:{ Exception -> 0x00fa }
                goto L_0x007e
            L_0x007d:
                r2 = r5
            L_0x007e:
                r1.put((java.lang.String) r13, (java.lang.Object) r2)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r13 = "vahlogCtzId"
                long r6 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x00fa }
                r1.put((java.lang.String) r13, (long) r6)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlog_eKYC"
                r1.put((java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogEngine5"
                java.lang.String r12 = r11.getRc_eng_no()     // Catch:{ Exception -> 0x00fa }
                if (r12 == 0) goto L_0x00b5
                java.lang.String r13 = r11.getRc_eng_no()     // Catch:{ Exception -> 0x00fa }
                if (r13 == 0) goto L_0x00a5
                int r13 = r13.length()     // Catch:{ Exception -> 0x00fa }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00fa }
            L_0x00a5:
                cm.l.c(r5)     // Catch:{ Exception -> 0x00fa }
                int r13 = r5.intValue()     // Catch:{ Exception -> 0x00fa }
                int r13 = r13 + -5
                java.lang.String r5 = r12.substring(r13)     // Catch:{ Exception -> 0x00fa }
                cm.l.e(r5, r4)     // Catch:{ Exception -> 0x00fa }
            L_0x00b5:
                r1.put((java.lang.String) r9, (java.lang.Object) r5)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlog_eSign"
                java.lang.String r12 = "N"
                r1.put((java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogMobileNo"
                r1.put((java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogPurCd"
                r1.put((java.lang.String) r9, (java.lang.Object) r14)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogRcNumber"
                java.lang.String r10 = r11.getRc_regn_no()     // Catch:{ Exception -> 0x00fa }
                r1.put((java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogReptNo"
                java.lang.String r10 = "NA"
                r1.put((java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogRtoCd"
                r1.put((java.lang.String) r9, (java.lang.Object) r15)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogStateCd"
                java.lang.String r10 = r11.getState_cd()     // Catch:{ Exception -> 0x00fa }
                r1.put((java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogVhClass"
                java.lang.String r10 = r11.getRc_vh_class_desc()     // Catch:{ Exception -> 0x00fa }
                r1.put((java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahlogStatus"
                r1.put((java.lang.String) r9, (boolean) r3)     // Catch:{ Exception -> 0x00fa }
                java.lang.String r9 = "vahanLog"
                r0.put((java.lang.String) r9, (java.lang.Object) r1)     // Catch:{ Exception -> 0x00fa }
            L_0x00fa:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t8.c.a.y(java.lang.String, java.lang.String, com.nic.mparivahan.VahanServices.VahanModel.NrvDetails, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
        }

        public final JSONObject z(String str, long j10, int i10, String str2, String str3, String str4, String str5) {
            l.f(str, "sarlogApplDate");
            l.f(str2, "sarlogDlDob");
            l.f(str3, "sarlogDlNumber");
            l.f(str4, "sarlogFeeDate");
            l.f(str5, "sarlogRtoCd");
            JSONObject jSONObject = new JSONObject();
            try {
                String format = String.format(str2, Arrays.copyOf(new Object[]{DateTimeFormatter.ofPattern("yyyy-MM-dd")}, 1));
                l.e(format, "format(this, *args)");
                JSONObject jSONObject2 = new JSONObject();
                d.a aVar = d.f17494a;
                jSONObject2.put("sarlogApplDate", (Object) aVar.m());
                jSONObject2.put("sarlogApplNo", j10);
                jSONObject2.put("sarlogCtzId", (long) i10);
                jSONObject2.put("sarlogDlDob", (Object) format);
                jSONObject2.put("sarlogDlNumber", (Object) str3);
                jSONObject2.put("sarlogFeeDate", (Object) aVar.m());
                jSONObject2.put("sarlogRtoCd", (Object) str5);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sarathiLog", (Object) jSONObject2);
                return jSONObject3;
            } catch (Exception unused) {
                return jSONObject;
            }
        }
    }
}
