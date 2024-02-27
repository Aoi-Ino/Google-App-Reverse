package com.nic.mparivahan.VahanServices.VahanUtils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import i7.d;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ld.c;
import ld.e;
import org.json.JSONObject;
import zh.b;
import zh.f;

@Keep
public final class VUtility {
    public static final a Companion = new a((g) null);
    /* access modifiers changed from: private */
    public static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    public static final String REG = "^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void A(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void i(Dialog dialog, View view) {
            l.f(dialog, "$dialog");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void w(Dialog dialog, Context context, View view) {
            l.f(dialog, "$d");
            l.f(context, "$context");
            dialog.dismiss();
            ((Activity) context).finish();
        }

        /* access modifiers changed from: private */
        public static final void x(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void z(Dialog dialog, Context context, View view) {
            l.f(dialog, "$d");
            l.f(context, "$context");
            dialog.dismiss();
            Intent intent = new Intent(context, DashBoard.class);
            new e(context).h(1);
            intent.addFlags(67108864);
            context.startActivity(intent);
            ((Activity) context).finish();
        }

        public final JSONObject B(String str, String str2, String str3) {
            l.f(str, "regn_no");
            l.f(str2, "state_cd");
            l.f(str3, "pur_cd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("purCd", (Object) str3);
            return jSONObject;
        }

        public final JSONObject C(String str) {
            l.f(str, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            return jSONObject;
        }

        public final String D(AOVSaveToDraftRequest aOVSaveToDraftRequest) {
            l.f(aOVSaveToDraftRequest, "dfc");
            String t10 = new d().t(aOVSaveToDraftRequest);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject E(String str) {
            l.f(str, "encstring");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("encstring", (Object) str);
            return jSONObject;
        }

        public final JSONObject F(String str) {
            l.f(str, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) str);
            return jSONObject;
        }

        public final JSONObject G(String str, String str2, String str3, String str4) {
            l.f(str, "stateCode");
            l.f(str2, "validFrom");
            l.f(str3, "periodMode");
            l.f(str4, "period");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            jSONObject.put("validFrom", (Object) str2);
            jSONObject.put("periodMode", (Object) str3);
            jSONObject.put("period", (Object) str4);
            return jSONObject;
        }

        public final JSONObject H(String str, String str2) {
            l.f(str, "applNo");
            l.f(str2, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            return jSONObject;
        }

        public final String I(String str, String str2, String str3, ArrayList arrayList) {
            l.f(str, "applNo");
            l.f(str2, "chasiNo");
            l.f(str3, "regnNo");
            l.f(arrayList, "purCdsForFee");
            String t10 = new d().t(new se.a(str, str2, str3, arrayList));
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject J(String str, String str2) {
            l.f(str, "natuteofGoods");
            l.f(str2, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("natuteofGoods", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            return jSONObject;
        }

        public final String K(MFPRequestModel mFPRequestModel) {
            l.f(mFPRequestModel, "dfc");
            String t10 = new d().t(mFPRequestModel);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject L() {
            return new JSONObject();
        }

        public final String M(String str, String str2, String str3) {
            l.f(str, "regNo");
            l.f(str2, "stateCode");
            l.f(str3, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("offCd", (Object) str3);
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final String N(DuplicateFitessDraft duplicateFitessDraft) {
            l.f(duplicateFitessDraft, "dfc");
            String t10 = new d().t(duplicateFitessDraft);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final String O(DuplicatePermitRe duplicatePermitRe) {
            l.f(duplicatePermitRe, "dp");
            String t10 = new d().t(duplicatePermitRe);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject P(String str, String str2) {
            l.f(str, "regNo");
            l.f(str2, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("chasiNo", (Object) str2);
            return jSONObject;
        }

        public final JSONObject Q(String str) {
            l.f(str, "transaction_no");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transactionNo", (Object) str);
            return jSONObject;
        }

        public final String R(fg.a aVar) {
            l.f(aVar, "dfc");
            String t10 = new d().t(aVar);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final String S(String str, String str2, String str3, String str4) {
            l.f(str, "regNo");
            l.f(str2, "offCd");
            l.f(str3, "purCd");
            l.f(str4, "stateCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("offCd", (Object) str2);
            jSONObject.put("purCd", (Object) str3);
            jSONObject.put("stateCode", (Object) str4);
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final JSONObject T(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            l.f(str, "regnNo");
            l.f(str2, "state_code");
            l.f(str3, "user_id");
            l.f(str4, "device_id");
            l.f(str5, "mobile_no");
            l.f(str6, "tid");
            l.f(str7, "chasisNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("did", (Object) str4);
            jSONObject.put("mid", (Object) str5);
            jSONObject.put("tid", (Object) str6);
            jSONObject.put("recordId", Long.parseLong(str3));
            jSONObject.put("chasiNo", (Object) str7);
            return jSONObject;
        }

        public final JSONObject U(String str, String str2) {
            l.f(str, "mobile_number");
            l.f(str2, "citizen_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smsCtzId", Long.parseLong(str2));
            jSONObject.put("smsEvent", (Object) "VHC_VRF");
            jSONObject.put("smsMobile", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smsAlert", (Object) jSONObject);
            return jSONObject2;
        }

        public final String V(String str, String str2, String str3) {
            l.f(str, "regNo");
            l.f(str2, "stateCode");
            l.f(str3, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("offCd", (Object) str3);
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final JSONObject W(String str) {
            l.f(str, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            return jSONObject;
        }

        public final JSONObject X() {
            return new JSONObject();
        }

        public final String Y(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "stateCode");
            l.f(str2, "regNo");
            l.f(str3, "taxMode");
            l.f(str4, "purCd");
            l.f(str5, "noofperm");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            jSONObject.put("regNo", (Object) str2);
            jSONObject.put("taxMode", (Object) str3);
            jSONObject.put("purCd", (Object) str4);
            jSONObject.put("noofperm", (Object) str5);
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final JSONObject Z(String str, String str2, String str3) {
            l.f(str, "regn");
            l.f(str2, "stateCode");
            l.f(str3, "offCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("offCd", (Object) str3);
            return jSONObject;
        }

        public final JSONObject a0(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "regNo");
            l.f(str2, "chasiNo");
            l.f(str3, "engineNo");
            l.f(str4, "regnDate");
            l.f(str5, "regnUpto");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regnNo", (Object) str);
            jSONObject.put("engineNo", (Object) str3);
            jSONObject.put("fitnessValidUpToDate", (Object) str5);
            jSONObject.put("registrationDate", (Object) str4);
            jSONObject.put("chassisNo", (Object) str2);
            return jSONObject;
        }

        public final JSONObject b0(String str) {
            l.f(str, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            return jSONObject;
        }

        public final JSONObject c0(String str, String str2, String str3, int i10, int i11, NrvDetails nrvDetails) {
            l.f(str, "appNo");
            l.f(str2, "purposeCode");
            l.f(str3, "state");
            l.f(nrvDetails, "rcdetails");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appNo", (Object) str);
            jSONObject.put("purposeCode", (Object) str2);
            jSONObject.put("state", (Object) str3);
            jSONObject.put("vhClassType", i10);
            if (str2.equals(VContant.DUPLICATE_RC_PURPOSE_CODE) && i11 > 0) {
                jSONObject.put("serviceRgn", i11);
            }
            if (VContant.Companion.e(str2)) {
                jSONObject.put("permit", (Object) String.valueOf(nrvDetails.getPmt_type_code()));
                jSONObject.put("transType", (Object) i10 == 1 ? "P" : "G");
                if (str3.equals("DL")) {
                    jSONObject.put("permitCat", (Object) String.valueOf(nrvDetails.getPmt_catg_code()));
                }
            }
            return jSONObject;
        }

        public final JSONObject d0(String str, String str2) {
            l.f(str, "regn");
            l.f(str2, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            return jSONObject;
        }

        public final JSONObject e0(String str) {
            l.f(str, "param");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("param", (Object) str);
            return jSONObject;
        }

        public final JSONObject f(String str, String str2) {
            l.f(str, "recptNumber");
            l.f(str2, "stateCode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recptNumber", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            return jSONObject;
        }

        public final JSONObject f0(String str) {
            l.f(str, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            return jSONObject;
        }

        public final String g(String str, String str2, String str3) {
            l.f(str, "stateCode");
            l.f(str2, "regNo");
            l.f(str3, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            jSONObject.put("regNo", (Object) str2);
            jSONObject.put("chasiNo", (Object) str3);
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final JSONObject g0() {
            return new JSONObject();
        }

        public final void h(Context context, String str) {
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
            ((TextView) findViewById2).setOnClickListener(new f(dialog));
            dialog.show();
        }

        public final String h0(BeforePaymentRequest beforePaymentRequest) {
            l.f(beforePaymentRequest, "param");
            String t10 = new d().t(beforePaymentRequest);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject i0(String str, String str2, String str3, String str4) {
            l.f(str, "regn_no");
            l.f(str2, "state_cd");
            l.f(str3, "chassi_no");
            l.f(str4, "officecode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regnNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("chassisNo", (Object) str3);
            jSONObject.put("officeCode", (Object) str4);
            return jSONObject;
        }

        public final JSONObject j(String str) {
            l.f(str, "regNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            return jSONObject;
        }

        public final JSONObject j0(String str, String str2) {
            l.f(str, "regNo");
            l.f(str2, "chasisNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("chasisNo", (Object) str2);
            return jSONObject;
        }

        public final JSONObject k(String str) {
            l.f(str, "applNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) str);
            return jSONObject;
        }

        public final String k0(HPTRequestParamModle hPTRequestParamModle) {
            l.f(hPTRequestParamModle, "hpt_request");
            String t10 = new d().t(hPTRequestParamModle);
            l.c(t10);
            return t10;
        }

        public final JSONObject l(String str, String str2) {
            l.f(str, "applNo");
            l.f(str2, "purCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", (Object) str);
            jSONObject.put("purCd", (Object) str2);
            return jSONObject;
        }

        public final String l0(NocDraftRequestParam nocDraftRequestParam) {
            l.f(nocDraftRequestParam, "noc_draft");
            String t10 = new d().t(nocDraftRequestParam);
            l.c(t10);
            return t10;
        }

        public final JSONObject m(String str) {
            l.f(str, "rcptno");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcptNo", (Object) str);
            return jSONObject;
        }

        public final String m0(BeforePaymentRequestfinal beforePaymentRequestfinal) {
            l.f(beforePaymentRequestfinal, "final_request");
            String t10 = new d().t(beforePaymentRequestfinal);
            l.c(t10);
            return t10;
        }

        public final JSONObject n(String str, String str2) {
            l.f(str, "stateCd");
            l.f(str2, "regnNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCd", (Object) str);
            jSONObject.put("regnNo", (Object) str2);
            return jSONObject;
        }

        public final String n0(duprcDtoRequestModle duprcdtorequestmodle) {
            l.f(duprcdtorequestmodle, "hpt_request");
            String t10 = new d().t(duprcdtorequestmodle);
            l.c(t10);
            return t10;
        }

        public final String o(MultiSelectRequest multiSelectRequest) {
            l.f(multiSelectRequest, "param");
            String t10 = new d().t(multiSelectRequest);
            l.e(t10, "toJson(...)");
            return t10;
        }

        public final JSONObject o0(String str, String str2, String str3, String str4) {
            l.f(str, "regNo");
            l.f(str2, "stateCd");
            l.f(str3, "offCd");
            l.f(str4, "transNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
            jSONObject.put("offCd", (Object) str3);
            jSONObject.put("transNo", (Object) str4);
            return jSONObject;
        }

        public final JSONObject p(String str, String str2, String str3) {
            l.f(str, "stateCode");
            l.f(str2, "offCd");
            l.f(str3, "purCd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            jSONObject.put("offCd", (Object) str2);
            jSONObject.put("purCd", (Object) str3);
            return jSONObject;
        }

        public final JSONObject p0(String str) {
            l.f(str, "statecode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateCode", (Object) str);
            return jSONObject;
        }

        public final JSONObject q(String str, String str2, String str3) {
            l.f(str, "regNo");
            l.f(str2, "applNo");
            l.f(str3, "chasiNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("applNo", (Object) str2);
            jSONObject.put("chasiNo", (Object) str3);
            return jSONObject;
        }

        public final JSONObject q0(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "purCd");
            l.f(str2, "transactionId");
            l.f(str3, "offCd");
            l.f(str4, "stateCd");
            l.f(str5, "regNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str5);
            jSONObject.put("transId", (Object) str2);
            jSONObject.put("stateCode", (Object) str4);
            jSONObject.put("offCd", (Object) str3);
            jSONObject.put("purCd", (Object) str);
            return jSONObject;
        }

        public final JSONObject r(String str) {
            l.f(str, "appNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appNo", (Object) str);
            return jSONObject;
        }

        public final boolean r0(ArrayList arrayList, String str) {
            l.f(arrayList, "list");
            l.f(str, "value");
            return arrayList.contains(str);
        }

        public final JSONObject s(String str, String str2, String str3) {
            l.f(str, "regNo");
            l.f(str2, "applNo");
            l.f(str3, "otp");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("applNo", (Object) str2);
            jSONObject.put("otp", (Object) str3);
            return jSONObject;
        }

        public final JSONObject s0(String str, String str2, String str3, String str4) {
            l.f(str, "regn_no");
            l.f(str2, "chasi_no");
            l.f(str3, "state_cd");
            l.f(str4, "pur_cd");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chasiNo", (Object) str2);
            jSONObject.put("purCd", (Object) str4);
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("stateCode", (Object) str3);
            return jSONObject;
        }

        public final String t(DmsUpdateRequest dmsUpdateRequest) {
            l.f(dmsUpdateRequest, "dmsupdate");
            String t10 = new d().t(dmsUpdateRequest);
            l.c(t10);
            return t10;
        }

        public final JSONObject t0(String str, String str2, String str3) {
            l.f(str, "bucketName");
            l.f(str2, "fileName");
            l.f(str3, "appNo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucketName", (Object) str);
            jSONObject.put("fileName", (Object) str2);
            jSONObject.put("appNo", (Object) str3);
            return jSONObject;
        }

        public final String u(DmsUploadReq dmsUploadReq) {
            l.f(dmsUploadReq, "upload_req");
            String t10 = new d().t(dmsUploadReq);
            l.c(t10);
            return t10;
        }

        public final void v(Context context, String str) {
            l.f(context, "context");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.exit_app_diloge);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.pop_up_msg);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = dialog.findViewById(R.id.cancle);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById3;
            View findViewById4 = dialog.findViewById(R.id.tv_title);
            l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            c cVar = new c(context);
            ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
            textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ((TextView) findViewById).setText(str);
            textView.setOnClickListener(new zh.d(dialog, context));
            textView2.setOnClickListener(new zh.e(dialog));
            dialog.show();
        }

        public final void y(Context context, String str) {
            l.f(context, "context");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.exit_app_diloge);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.pop_up_msg);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = dialog.findViewById(R.id.cancle);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById3;
            View findViewById4 = dialog.findViewById(R.id.tv_title);
            l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            c cVar = new c(context);
            ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
            textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            ((TextView) findViewById).setText(str);
            textView.setOnClickListener(new b(dialog, context));
            textView2.setOnClickListener(new zh.c(dialog));
            dialog.show();
        }
    }
}
