package com.nic.mparivahan.VahanServices.VahanConst;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.Latestpaytaxdetails;
import com.nic.mparivahan.Tax.Model.TaxOwnerDetailsPuccPermit;
import com.nic.mparivahan.VahanServices.Model.VTHypthEntity;
import com.nic.mparivahan.VahanServices.VahanModel.Latesttaxdetails;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerIdentification;
import com.nic.mparivahan.VahanServices.VahanModel.PermitDetailDto;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VtInsuranceCommonDto;
import com.nic.mparivahan.VahanServices.VahanModel.Vtpucc;
import i7.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import ka.c;
import ld.c;
import ld.h;
import v9.e;

@Keep
public final class VContant {
    public static final String ALTERATION = "Alteration";
    public static final String ALTERATION_CODE = "ALT001";
    public static final String ALTERATION_PURPOSE_CODE = "16";
    public static final String APP_NO = "App_no";
    public static final String CHANGE_OF_ADDRESS = "Change_of_Address";
    public static final String CHANGE_OF_ADDRESS_CODE = "COD001";
    public static final String CHANGE_OF_ADDRESS_PURPOSE_CODE = "4";
    public static final String COMPOUND_FEE = "COMPOUND_FEE";
    public static final String COMPOUND_FEE_CODE = "COMP001";
    public static final Companion Companion = new Companion((g) null);
    public static final String DUPLICATE_FITNESS = "Duplicate_Fitness";
    public static final String DUPLICATE_FITNESS_CODE = "DFC001";
    public static final String DUPLICATE_FITNESS_PURPOSE_CODE = "14";
    public static final String DUPLICATE_PERMIT = "Duplicate_Permit";
    public static final String DUPLICATE_PERMIT_CODE = "DP001";
    public static final String DUPLICATE_PERMIT_PURPOSE_CODE = "34";
    public static final String DUPLICATE_RC = "Duplicate_RC";
    public static final String DUPLICATE_RC_CODE = "DRC001";
    public static final String DUPLICATE_RC_PURPOSE_CODE = "3";
    public static final String FINAL_SUBMIT = "Final_Submit";
    public static final String HYPOTHECATION_ADDITION = "Hypothecation_Addition";
    public static final String HYPOTHECATION_ADDITION_CODE = "HPA001";
    public static final String HYPOTHECATION_ADDITION_PURPOSE_CODE = "6";
    public static final String HYPOTHECATION_CONTINUATION = "Hypothecation_Continuation";
    public static final String HYPOTHECATION_CONTINUATION_CODE = "HPC001";
    public static final String HYPOTHECATION_CONTINUATION_PURPOSE_CODE = "8";
    public static final String HYPOTHICATION_TERMINATION = "Hypothication_Termination";
    public static final String HYPOTHICATION_TERMINATION_CODE = "HT001";
    public static final String HYPOTHICATION_TERMINATION_PURPOSE_CODE = "7";
    public static final String MISELL_CODE = "MIS001";
    public static final String MISELL_PAYMENT = "MISELL_Payment";
    public static final String MISELL_PURPOSE_CODE = "48";
    public static final String MULTISERVICE_PURPOSE_CODE = "950";
    public static final String MULTI_SELECT_SERVICE = "Mult_Select";
    public static final String MULTI_SELECT_SERVICE_ARRAY = "MULTIARRAY";
    public static final String MULTI_SELECT_SERVICE_CODE = "MSS001";
    public static final String MULTI_SERVICE_DRAFT_OBJ = "MULTIDRAFT";
    public static final String NEXGEN_INTENT_CODE = "001";
    public static final String NEXGEN_addahar_address = "aadhaarAddress";
    public static final String NEXGEN_addahar_name = "aadhaarName";
    public static final String NEXGEN_isFACELESS = "Face_Less_Staus";
    public static final String NOC = "NOC";
    public static final String NOC_CODE = "NC001";
    public static final String NOC_PURPOSE_CODE = "9";
    public static final String NOMINEE_PURPOSE_CODE = "109";
    public static final String NP_CODE = "NPP001";
    public static final String NP_Permit = "NPPermit";
    public static final String Nominee_Addition = "NOMINEE_Add";
    public static final String Nominee_CODE = "NOM001";
    public static final String PAY_TAX = "Tax";
    public static final String PAY_TAXASS = "TaxAssesment";
    public static final String PAY_TAX_ASS_CODE = "TAXASS001";
    public static final String PAY_TAX_CODE = "TAX001";
    public static final String PERMIT_RENEWAL = "PERMIT_RENEWAL";
    public static final String PERMIT_RENEWAL_CODE = "PR001";
    public static final String PURPOSE_CODE = "purpose_code";
    public static final String RCPARTICULAR = "RC_Particular";
    public static final String RCPARTICULAR_CODE = "RCP001";
    public static final String RCPARTICULAR_PURPOSE_CODE = "13";
    public static final String RC_CACELLATION_PURPOSE_CODE = "61";
    public static final String RC_CANCALATION = "RC_Cancellation";
    public static final String RC_CANCELLATION_CODE = "RCC001";
    public static final String RC_PERMIT_RENEWAL_PURPOSE_CODE = "27";
    public static final String RC_RELEASE = "RC_Release";
    public static final String RC_RELEASE_CODE = "RCR001";
    public static final String RC_RELEASE_PURPOSE_CODE = "66";
    public static final String RC_SURRENDER = "RC_Surrender";
    public static final String RC_SURRENDER_PURPOSE_CODE = "65";
    public static final String RC_SURRENDER_RC_CODE = "RCS001";
    public static final String REDIRECT = "GO001";
    public static final String RenewalNpAuthorization_CODE = "39";
    public static final String SERVICE_NAME = "Service_Name";
    public static final String TEMPERMIT_CODE = "TEMP001";
    public static final String TRANFER_OF_OWNERSHIP = "Transfer_of_Ownership";
    public static final String TRANFER_OF_OWNERSHIP_CODE = "TO001";
    public static final String TRANFER_OF_OWNERSHIP_PURPOSE_CODE = "5";
    public static final String Tax_PURPOSE_CODE = "58";
    public static final String TempPermit_PURPOSE_CODE = "35";
    public static final String Temp_Permit = "TempPermit";
    public static final String UPDATE_MOBILE = "update_mobile_no";
    public static final String UPDATE_MOBILE_CODE = "UMN001";
    public static final String UPDATE_MOBILE_PURPOSE_CODE = "135";
    public static final String VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE = "364";
    public static final String VAHAN_COMPOUNDFEE_PURPOSE_CODE = "363";
    /* access modifiers changed from: private */
    public static final String[] formats = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd HH:mm:ss", "MM/dd/yyyy HH:mm:ss", "MM/dd/yyyy'T'HH:mm:ss.SSS'Z'", "MM/dd/yyyy'T'HH:mm:ss.SSSZ", "MM/dd/yyyy'T'HH:mm:ss.SSS", "MM/dd/yyyy'T'HH:mm:ssZ", "MM/dd/yyyy'T'HH:mm:ss", "yyyy:MM:dd HH:mm:ss", "yyyyMMdd"};
    public static final int vahanLogUpdateDoc = 2;
    public static final int vahanLogUpdatePayment = 1;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void L(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void N(Dialog dialog, Context context, View view) {
            l.f(dialog, "$d");
            l.f(context, "$context");
            dialog.dismiss();
            ((Activity) context).finish();
        }

        public final String A(Context context, String str) {
            int i10;
            l.f(context, "context");
            l.f(str, "code");
            if (p.o(str, VContant.DUPLICATE_RC_PURPOSE_CODE, true)) {
                return "Issue of Duplicate RC";
            }
            if (p.o(str, VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, true)) {
                return "Change of Address in RC";
            }
            if (p.o(str, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                return "Hypothecation Addition";
            }
            if (p.o(str, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true)) {
                return "Hypothication Termination";
            }
            if (p.o(str, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true)) {
                return "Hypothecation Continuation";
            }
            if (p.o(str, VContant.RCPARTICULAR_PURPOSE_CODE, true)) {
                return "RC Particular";
            }
            if (p.o(str, VContant.NOC_PURPOSE_CODE, true)) {
                return "No Objection Certificate (NOC)";
            }
            if (p.o(str, VContant.TempPermit_PURPOSE_CODE, true)) {
                return "Temporary Permit";
            }
            if (p.o(str, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true)) {
                i10 = R.string.duplicate_fitness;
            } else if (p.o(str, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                i10 = R.string.duplicate_permit_certificate;
            } else if (p.o(str, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                i10 = R.string.rc_surrender;
            } else if (p.o(str, VContant.RC_CACELLATION_PURPOSE_CODE, true)) {
                return "RC Cancellation";
            } else {
                if (p.o(str, VContant.NOMINEE_PURPOSE_CODE, true)) {
                    return "Addition of Nominee";
                }
                if (p.o(str, VContant.RC_RELEASE_PURPOSE_CODE, true)) {
                    return "RC Release";
                }
                if (p.o(str, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true)) {
                    return "Compounding Fee Payment";
                }
                if (p.o(str, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true)) {
                    return "Permit Renewal";
                }
                return p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? "Transfer of Ownership" : "Vehicle Services";
            }
            String string = context.getString(i10);
            l.e(string, "getString(...)");
            return string;
        }

        public final String B(Context context, String str) {
            l.f(context, "context");
            l.f(str, "code");
            if (p.o(str, VContant.DUPLICATE_RC_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.RCPARTICULAR_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.NOC_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.TempPermit_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                return I(context, str);
            }
            if (p.o(str, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                String string = context.getString(R.string.rc_surrender);
                l.e(string, "getString(...)");
                return string;
            } else if (p.o(str, VContant.RC_CACELLATION_PURPOSE_CODE, true)) {
                return "RC Cancellation";
            } else {
                if (p.o(str, VContant.NOMINEE_PURPOSE_CODE, true)) {
                    return "Addition of Nominee";
                }
                if (p.o(str, VContant.RC_RELEASE_PURPOSE_CODE, true)) {
                    return "RC Release";
                }
                if (p.o(str, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true)) {
                    return "Compounding Fee Payment";
                }
                if (p.o(str, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true)) {
                    return "Permit Renewal";
                }
                return p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true) ? "Transfer of \nOwnership" : "Vehicle Services";
            }
        }

        public final ArrayList C() {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < 121; i10++) {
                arrayList.add(String.valueOf(i10));
            }
            return arrayList;
        }

        public final ArrayList D() {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < 5; i10++) {
                arrayList.add(String.valueOf(i10));
            }
            return arrayList;
        }

        public final ArrayList E() {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < 18; i10++) {
                arrayList.add(String.valueOf(i10));
            }
            return arrayList;
        }

        public final boolean F(String str) {
            l.f(str, "code");
            ArrayList arrayList = new ArrayList();
            arrayList.add("2");
            arrayList.add("2.0");
            arrayList.add(VContant.DUPLICATE_RC_PURPOSE_CODE);
            arrayList.add(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
            arrayList.add(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            arrayList.add(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
            arrayList.add(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
            arrayList.add(VContant.NOC_PURPOSE_CODE);
            arrayList.add(VContant.RCPARTICULAR_PURPOSE_CODE);
            arrayList.add("3.0");
            arrayList.add("4.0");
            arrayList.add("6.0");
            arrayList.add("7.0");
            arrayList.add("8.0");
            arrayList.add("9.0");
            arrayList.add("13.0");
            arrayList.add(VContant.DUPLICATE_FITNESS_PURPOSE_CODE);
            arrayList.add("14.0");
            arrayList.add(VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            arrayList.add("34.0");
            arrayList.add(VContant.RC_CACELLATION_PURPOSE_CODE);
            arrayList.add("61.0");
            arrayList.add(VContant.RC_SURRENDER_PURPOSE_CODE);
            arrayList.add("65.0");
            arrayList.add(VContant.RC_RELEASE_PURPOSE_CODE);
            arrayList.add("66.0");
            arrayList.add(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
            arrayList.add("5.0");
            arrayList.add(VContant.RenewalNpAuthorization_CODE);
            arrayList.add("39.0");
            arrayList.add(VContant.Tax_PURPOSE_CODE);
            arrayList.add("58.0");
            arrayList.add(VContant.TempPermit_PURPOSE_CODE);
            arrayList.add("35.0");
            arrayList.add(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
            arrayList.add("5.0");
            arrayList.add(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE);
            arrayList.add("363.0");
            arrayList.add(VContant.VAHAN_COMPOUNDFEE_OTHER_PURPOSE_CODE);
            arrayList.add("364.0");
            arrayList.add(VContant.NOMINEE_PURPOSE_CODE);
            arrayList.add("109.0");
            arrayList.add(VContant.MISELL_PURPOSE_CODE);
            arrayList.add("48.0");
            arrayList.add(VContant.ALTERATION_PURPOSE_CODE);
            arrayList.add("16.0");
            arrayList.add("27.0");
            arrayList.add(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
            return arrayList.contains(str);
        }

        public final List G(String str) {
            l.f(str, "jsonArrayString");
            List list = (List) new d().k(str, new VContant$Companion$parseJsonArrayWithCondition$listType$1().getType());
            l.c(list);
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (Integer.parseInt(((RtoNameModleItem) next).getOff_type_cd()) >= 0) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final List H(String str) {
            l.f(str, "jsonArrayString");
            List list = (List) new d().k(str, new VContant$Companion$passForNocRTO$listType$1().getType());
            l.c(list);
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (p.o(((RtoNameModleItem) next).getOff_type_cd(), "0", true)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final String I(Context context, String str) {
            e.a aVar;
            String str2;
            int i10;
            l.f(context, "context");
            l.f(str, "code");
            if (p.o(str, VContant.DUPLICATE_RC_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Issue of Duplicate RC";
            } else if (p.o(str, VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Change of Address in RC";
            } else if (p.o(str, VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Hypothecation Addition";
            } else if (p.o(str, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Hypothication Termination";
            } else if (p.o(str, VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Hypothecation Continuation";
            } else if (p.o(str, VContant.RCPARTICULAR_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "RC Particular";
            } else if (p.o(str, VContant.NOC_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "No Objection Certificate (NOC)";
            } else if (p.o(str, VContant.TempPermit_PURPOSE_CODE, true)) {
                aVar = e.f17509a;
                str2 = "Temporary Permit";
            } else {
                if (p.o(str, VContant.DUPLICATE_FITNESS_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    i10 = R.string.duplicate_fitness;
                } else if (p.o(str, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    i10 = R.string.duplicate_permit_certificate;
                } else if (p.o(str, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    i10 = R.string.rc_surrender;
                } else if (p.o(str, VContant.RC_CACELLATION_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "RC Cancellation";
                } else if (p.o(str, VContant.NOMINEE_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "Addition of Nominee";
                } else if (p.o(str, VContant.RC_RELEASE_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "RC Release";
                } else if (p.o(str, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "Compounding Fee Payment";
                } else if (p.o(str, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "Permit Renewal";
                } else if (p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true)) {
                    aVar = e.f17509a;
                    str2 = "Transfer of Ownership";
                } else if (!p.o(str, VContant.UPDATE_MOBILE_PURPOSE_CODE, true)) {
                    return "Vehicle Services";
                } else {
                    aVar = e.f17509a;
                    str2 = "Update Mobile No";
                }
                str2 = context.getString(i10);
                l.e(str2, "getString(...)");
            }
            return aVar.O(context, str2);
        }

        public final void J(boolean z10, View view) {
            l.f(view, "view");
            if (z10) {
                view.setVisibility(8);
            }
        }

        public final void K(Context context, String str) {
            l.f(context, "context");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.msg_dialog);
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
            View findViewById3 = dialog.findViewById(R.id.tv_title);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(str);
            c cVar = new c(context);
            ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
            textView.setOnClickListener(new b(dialog));
            dialog.show();
        }

        public final void M(Context context, String str) {
            l.f(context, "context");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.msg_dialog);
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
            View findViewById3 = dialog.findViewById(R.id.tv_title);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(str);
            c cVar = new c(context);
            ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
            textView.setOnClickListener(new a(dialog, context));
            dialog.show();
        }

        public final NrvDetails c(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            l.f(ownerDetailPuccPermit, "it");
            String str = ownerDetailPuccPermit.getP_add1() + ", " + ownerDetailPuccPermit.getP_add2() + ',' + ownerDetailPuccPermit.getP_add3();
            String str2 = ownerDetailPuccPermit.getC_add1() + ", " + ownerDetailPuccPermit.getC_add2() + ',' + ownerDetailPuccPermit.getC_add3();
            String fit_upto = ownerDetailPuccPermit.getFit_upto();
            VTHypthEntity vTHypthEntity = ownerDetailPuccPermit.getVTHypthEntity();
            String fncr_name = vTHypthEntity != null ? vTHypthEntity.getFncr_name() : null;
            String t10 = t(ownerDetailPuccPermit.getVtInsuranceCommonDto());
            VtInsuranceCommonDto vtInsuranceCommonDto = ownerDetailPuccPermit.getVtInsuranceCommonDto();
            String issuerName = vtInsuranceCommonDto != null ? vtInsuranceCommonDto.getIssuerName() : null;
            String x10 = x(ownerDetailPuccPermit.getVtInsuranceCommonDto());
            Vtpucc vtpucc = ownerDetailPuccPermit.getVtpucc();
            String valueOf = String.valueOf(vtpucc != null ? vtpucc.getPucc_upto() : null);
            Vtpucc vtpucc2 = ownerDetailPuccPermit.getVtpucc();
            String valueOf2 = String.valueOf(vtpucc2 != null ? vtpucc2.getPucc_no() : null);
            PermitDetailDto permitDetailDto = ownerDetailPuccPermit.getPermitDetailDto();
            String permitValidUpto = permitDetailDto != null ? permitDetailDto.getPermitValidUpto() : null;
            PermitDetailDto permitDetailDto2 = ownerDetailPuccPermit.getPermitDetailDto();
            String permitValidFrom = permitDetailDto2 != null ? permitDetailDto2.getPermitValidFrom() : null;
            PermitDetailDto permitDetailDto3 = ownerDetailPuccPermit.getPermitDetailDto();
            String permitType = permitDetailDto3 != null ? permitDetailDto3.getPermitType() : null;
            PermitDetailDto permitDetailDto4 = ownerDetailPuccPermit.getPermitDetailDto();
            String issue_dt = permitDetailDto4 != null ? permitDetailDto4.getIssue_dt() : null;
            PermitDetailDto permitDetailDto5 = ownerDetailPuccPermit.getPermitDetailDto();
            String pmt_no = permitDetailDto5 != null ? permitDetailDto5.getPmt_no() : null;
            Latesttaxdetails latesttaxdetails = ownerDetailPuccPermit.getLatesttaxdetails();
            String valueOf3 = String.valueOf(latesttaxdetails != null ? latesttaxdetails.getTax_upto() : null);
            String norms_descr = ownerDetailPuccPermit.getNorms_descr();
            String fuel_descr = ownerDetailPuccPermit.getFuel_descr();
            String regn_dt = ownerDetailPuccPermit.getRegn_dt();
            String model_name = ownerDetailPuccPermit.getModel_name();
            String maker_name = ownerDetailPuccPermit.getMaker_name();
            String vch_catg = ownerDetailPuccPermit.getVch_catg();
            String vh_class_desc = ownerDetailPuccPermit.getVh_class_desc();
            String f_name = ownerDetailPuccPermit.getF_name();
            String owner_name = ownerDetailPuccPermit.getOwner_name();
            String c_state = ownerDetailPuccPermit.getC_state();
            String chasi_no = ownerDetailPuccPermit.getChasi_no();
            String eng_no = ownerDetailPuccPermit.getEng_no();
            OwnerIdentification ownerIdentification = ownerDetailPuccPermit.getOwnerIdentification();
            String valueOf4 = String.valueOf(ownerIdentification != null ? ownerIdentification.getMobile_no() : null);
            String valueOf5 = String.valueOf(ownerDetailPuccPermit.getOff_cd());
            String owner_name2 = ownerDetailPuccPermit.getOwner_name();
            String regn_no = ownerDetailPuccPermit.getRegn_no();
            String state_cd = ownerDetailPuccPermit.getState_cd();
            String vch_catg2 = ownerDetailPuccPermit.getVch_catg();
            String valueOf6 = String.valueOf(ownerDetailPuccPermit.getVh_class());
            String vehType = ownerDetailPuccPermit.getVehType();
            Integer vehTypeAsInt = ownerDetailPuccPermit.getVehTypeAsInt();
            Integer seat_cap = ownerDetailPuccPermit.getSeat_cap();
            Integer owner_sr = ownerDetailPuccPermit.getOwner_sr();
            PermitDetailDto permitDetailDto6 = ownerDetailPuccPermit.getPermitDetailDto();
            Object pmt_type_code = permitDetailDto6 != null ? permitDetailDto6.getPmt_type_code() : null;
            PermitDetailDto permitDetailDto7 = ownerDetailPuccPermit.getPermitDetailDto();
            Object pmt_catg_code = permitDetailDto7 != null ? permitDetailDto7.getPmt_catg_code() : null;
            VtInsuranceCommonDto vtInsuranceCommonDto2 = ownerDetailPuccPermit.getVtInsuranceCommonDto();
            return new NrvDetails(fit_upto, fncr_name, t10, issuerName, x10, valueOf, valueOf2, "", "", "", permitValidUpto, permitValidFrom, permitType, issue_dt, pmt_no, valueOf3, norms_descr, fuel_descr, regn_dt, model_name, maker_name, vch_catg, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, valueOf4, valueOf5, owner_name2, str, str2, regn_no, state_cd, vch_catg2, valueOf6, vehType, vehTypeAsInt, seat_cap, owner_sr, pmt_type_code, pmt_catg_code, vtInsuranceCommonDto2 != null ? vtInsuranceCommonDto2.getInsuranceFrom() : null, ownerDetailPuccPermit.getVTHypthEntity());
        }

        public final NrvDetails d(TaxOwnerDetailsPuccPermit taxOwnerDetailsPuccPermit) {
            l.f(taxOwnerDetailsPuccPermit, "it");
            String str = taxOwnerDetailsPuccPermit.getP_add1() + ", " + taxOwnerDetailsPuccPermit.getP_add2() + ',' + taxOwnerDetailsPuccPermit.getP_add3();
            String str2 = taxOwnerDetailsPuccPermit.getC_add1() + ", " + taxOwnerDetailsPuccPermit.getC_add2() + ',' + taxOwnerDetailsPuccPermit.getC_add3();
            String fit_upto = taxOwnerDetailsPuccPermit.getFit_upto();
            VTHypthEntity vTHypthEntity = taxOwnerDetailsPuccPermit.getVTHypthEntity();
            String fncr_name = vTHypthEntity != null ? vTHypthEntity.getFncr_name() : null;
            String t10 = t(taxOwnerDetailsPuccPermit.getVtInsuranceCommonDto());
            VtInsuranceCommonDto vtInsuranceCommonDto = taxOwnerDetailsPuccPermit.getVtInsuranceCommonDto();
            String issuerName = vtInsuranceCommonDto != null ? vtInsuranceCommonDto.getIssuerName() : null;
            String x10 = x(taxOwnerDetailsPuccPermit.getVtInsuranceCommonDto());
            Vtpucc vtpucc = taxOwnerDetailsPuccPermit.getVtpucc();
            String valueOf = String.valueOf(vtpucc != null ? vtpucc.getPucc_upto() : null);
            Vtpucc vtpucc2 = taxOwnerDetailsPuccPermit.getVtpucc();
            String valueOf2 = String.valueOf(vtpucc2 != null ? vtpucc2.getPucc_no() : null);
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String permitValidUpto = permitDetailDto != null ? permitDetailDto.getPermitValidUpto() : null;
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto2 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String permitValidFrom = permitDetailDto2 != null ? permitDetailDto2.getPermitValidFrom() : null;
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto3 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String permitType = permitDetailDto3 != null ? permitDetailDto3.getPermitType() : null;
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto4 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String valueOf3 = String.valueOf(permitDetailDto4 != null ? Long.valueOf(permitDetailDto4.getIssue_dt()) : null);
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto5 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String pmt_no = permitDetailDto5 != null ? permitDetailDto5.getPmt_no() : null;
            Latestpaytaxdetails latesttaxdetails = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
            String valueOf4 = String.valueOf(latesttaxdetails != null ? latesttaxdetails.getTax_upto() : null);
            String norms_descr = taxOwnerDetailsPuccPermit.getNorms_descr();
            String fuel_descr = taxOwnerDetailsPuccPermit.getFuel_descr();
            String regn_dt = taxOwnerDetailsPuccPermit.getRegn_dt();
            String model_name = taxOwnerDetailsPuccPermit.getModel_name();
            String maker_name = taxOwnerDetailsPuccPermit.getMaker_name();
            String vch_catg = taxOwnerDetailsPuccPermit.getVch_catg();
            String vh_class_desc = taxOwnerDetailsPuccPermit.getVh_class_desc();
            String f_name = taxOwnerDetailsPuccPermit.getF_name();
            String owner_name = taxOwnerDetailsPuccPermit.getOwner_name();
            String c_state = taxOwnerDetailsPuccPermit.getC_state();
            String chasi_no = taxOwnerDetailsPuccPermit.getChasi_no();
            String eng_no = taxOwnerDetailsPuccPermit.getEng_no();
            com.nic.mparivahan.VahanServices.Model.OwnerIdentification ownerIdentification = taxOwnerDetailsPuccPermit.getOwnerIdentification();
            String valueOf5 = String.valueOf(ownerIdentification != null ? Long.valueOf(ownerIdentification.getMobile_no()) : null);
            String valueOf6 = String.valueOf(taxOwnerDetailsPuccPermit.getOff_cd());
            String owner_name2 = taxOwnerDetailsPuccPermit.getOwner_name();
            String regn_no = taxOwnerDetailsPuccPermit.getRegn_no();
            String state_cd = taxOwnerDetailsPuccPermit.getState_cd();
            String vch_catg2 = taxOwnerDetailsPuccPermit.getVch_catg();
            String valueOf7 = String.valueOf(taxOwnerDetailsPuccPermit.getVh_class());
            String vehType = taxOwnerDetailsPuccPermit.getVehType();
            Integer vehTypeAsInt = taxOwnerDetailsPuccPermit.getVehTypeAsInt();
            Integer seat_cap = taxOwnerDetailsPuccPermit.getSeat_cap();
            Integer owner_sr = taxOwnerDetailsPuccPermit.getOwner_sr();
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto6 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String pmt_type_code = permitDetailDto6 != null ? permitDetailDto6.getPmt_type_code() : null;
            com.nic.mparivahan.VahanServices.Model.PermitDetailDto permitDetailDto7 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
            String pmt_catg_code = permitDetailDto7 != null ? permitDetailDto7.getPmt_catg_code() : null;
            VtInsuranceCommonDto vtInsuranceCommonDto2 = taxOwnerDetailsPuccPermit.getVtInsuranceCommonDto();
            return new NrvDetails(fit_upto, fncr_name, t10, issuerName, x10, valueOf, valueOf2, "", "", "", permitValidUpto, permitValidFrom, permitType, valueOf3, pmt_no, valueOf4, norms_descr, fuel_descr, regn_dt, model_name, maker_name, vch_catg, vh_class_desc, f_name, owner_name, c_state, chasi_no, eng_no, valueOf5, valueOf6, owner_name2, str, str2, regn_no, state_cd, vch_catg2, valueOf7, vehType, vehTypeAsInt, seat_cap, owner_sr, pmt_type_code, pmt_catg_code, vtInsuranceCommonDto2 != null ? vtInsuranceCommonDto2.getInsuranceFrom() : null, (VTHypthEntity) null);
        }

        public final boolean e(String str) {
            l.f(str, VContant.PURPOSE_CODE);
            ArrayList arrayList = new ArrayList();
            arrayList.add(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
            arrayList.add(VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            arrayList.add(VContant.TempPermit_PURPOSE_CODE);
            arrayList.add(VContant.RenewalNpAuthorization_CODE);
            return arrayList.contains(str);
        }

        public final String f(HashMap hashMap) {
            l.f(hashMap, "serviceSelection_HashMap");
            if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
                return VContant.DUPLICATE_RC_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
                return VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
                return VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
                return VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
                return VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
                return VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.RCPARTICULAR)) {
                return VContant.RCPARTICULAR_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.NOC) || hashMap.containsKey(VContant.NOC)) {
                return VContant.NOC_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
                return VContant.DUPLICATE_FITNESS_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.RC_CANCALATION)) {
                return VContant.RC_CACELLATION_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.RC_SURRENDER)) {
                return VContant.RC_SURRENDER_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
                return VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.PERMIT_RENEWAL)) {
                return VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE;
            }
            if (hashMap.containsKey(VContant.ALTERATION)) {
                return VContant.ALTERATION_PURPOSE_CODE;
            }
            return hashMap.containsKey(VContant.MULTI_SELECT_SERVICE) ? VContant.MULTISERVICE_PURPOSE_CODE : "500";
        }

        public final RtoNameModle g(String str) {
            l.f(str, "authority");
            RtoNameModle rtoNameModle = new RtoNameModle();
            rtoNameModle.addAll(VContant.Companion.G(str));
            return rtoNameModle;
        }

        public final ArrayList h(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            l.c(arrayList);
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(String.valueOf(((Number) arrayList.get(i10)).intValue()));
                }
            }
            return arrayList2;
        }

        public final RtoNameModle i(String str) {
            l.f(str, "authorty");
            RtoNameModle rtoNameModle = new RtoNameModle();
            rtoNameModle.addAll(VContant.Companion.H(str));
            return rtoNameModle;
        }

        public final ArrayList j(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            l.c(arrayList);
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = arrayList.get(i10);
                    l.e(obj, "get(...)");
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) obj)));
                }
            }
            return arrayList2;
        }

        public final String k(String str) {
            l.f(str, "State_code");
            HashMap hashMap = new HashMap();
            hashMap.put("AN", "Andaman and Nicobar Islands");
            hashMap.put("AP", "Andhra Pradesh");
            hashMap.put("AR", "Arunachal Pradesh");
            hashMap.put("AS", "Assam");
            hashMap.put("BR", "Bihar");
            hashMap.put("CG", "Chandigarh");
            hashMap.put("CH", "Chandigarh");
            hashMap.put("DH", "Dadra and Nagar Haveli");
            hashMap.put("DD", "Daman and Diu");
            hashMap.put("DL", "Delhi");
            hashMap.put("GA", "Goa");
            hashMap.put("GJ", "Gujarat");
            hashMap.put("HR", "Haryana");
            hashMap.put("HP", "Himachal Pradesh");
            hashMap.put("JK", "Jammu and Kashmir");
            hashMap.put("JH", "Jharkhand");
            hashMap.put("KA", "Karnataka");
            hashMap.put("KL", "Kerala");
            hashMap.put("LD", "Lakshadweep");
            hashMap.put("MP", "Madhya Pradesh");
            hashMap.put("MH", "Maharashtra");
            hashMap.put("MN", "Manipur");
            hashMap.put("ML", "Meghalaya");
            hashMap.put("MZ", "Mizoram");
            hashMap.put("NL", "Nagaland");
            hashMap.put("OR", "Odisha");
            hashMap.put("OD", "Odisha");
            hashMap.put("PY", "Puducherry");
            hashMap.put("PB", "Punjab");
            hashMap.put("RJ", "Rajasthan");
            hashMap.put("SK", "Sikkim");
            hashMap.put("TN", "Tamil Nadu");
            hashMap.put("TS", "Telangana");
            hashMap.put("TR", "Tripura");
            hashMap.put("UK", "Uttarakhand");
            hashMap.put("UP", "Uttar Pradesh");
            hashMap.put("WB", "West Bengal");
            return String.valueOf(hashMap.get(str));
        }

        public final String l(Context context, h hVar) {
            l.f(context, "context");
            l.f(hVar, "session");
            try {
                if (p.o(hVar.c(), VContant.DUPLICATE_RC_CODE, true)) {
                    return e.f17509a.O(context, "Issue of Duplicate RC");
                }
                if (p.o(hVar.c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                    return e.f17509a.O(context, "Hypothecation Addition");
                }
                if (p.o(hVar.c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                    return e.f17509a.O(context, "Hypothecation Continuation");
                }
                if (p.o(hVar.c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                    return e.f17509a.O(context, "Hypothecation Termination");
                }
                if (p.o(hVar.c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                    return e.f17509a.O(context, "Change of Address in RC");
                }
                if (p.o(hVar.c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                    return e.f17509a.O(context, "Transfer of Ownership");
                }
                if (p.o(hVar.c(), VContant.RCPARTICULAR_CODE, true)) {
                    return e.f17509a.O(context, "RC Particulars against Fee");
                }
                if (p.o(hVar.c(), VContant.NOC_CODE, true)) {
                    return e.f17509a.O(context, "No Objection Certificate (NOC)");
                }
                if (p.o(hVar.c(), VContant.DUPLICATE_FITNESS_CODE, true)) {
                    return e.f17509a.O(context, "Duplicate Fitness Certificate");
                }
                if (p.o(hVar.c(), VContant.DUPLICATE_PERMIT_CODE, true)) {
                    return e.f17509a.O(context, "Duplicate Permit Certificate");
                }
                if (p.o(hVar.c(), VContant.RC_SURRENDER_RC_CODE, true)) {
                    return e.f17509a.O(context, "RC Surrender");
                }
                if (p.o(hVar.c(), VContant.RC_CANCELLATION_CODE, true)) {
                    return e.f17509a.O(context, "RC Cancellation");
                }
                if (p.o(hVar.c(), VContant.PAY_TAX_CODE, true)) {
                    return e.f17509a.O(context, "Pay Tax");
                }
                if (p.o(hVar.c(), VContant.PAY_TAX_ASS_CODE, true)) {
                    return e.f17509a.O(context, "Tax Assessment");
                }
                if (p.o(hVar.c(), VContant.RC_RELEASE_CODE, true)) {
                    return e.f17509a.O(context, "RC Release");
                }
                if (p.o(hVar.c(), VContant.TEMPERMIT_CODE, true)) {
                    return e.f17509a.O(context, "Temporary Permit");
                }
                if (p.o(hVar.c(), VContant.NP_CODE, true)) {
                    return e.f17509a.O(context, "Renewal of NP Authorization Permit");
                }
                if (p.o(hVar.c(), VContant.PERMIT_RENEWAL_CODE, true)) {
                    return e.f17509a.O(context, "Permit Renewal");
                }
                if (p.o(hVar.c(), VContant.COMPOUND_FEE_CODE, true)) {
                    return e.f17509a.O(context, "Compounding Fee Payment");
                }
                if (p.o(hVar.c(), VContant.Nominee_CODE, true)) {
                    return e.f17509a.O(context, "Addition of Nominee");
                }
                if (p.o(hVar.c(), VContant.MISELL_CODE, true)) {
                    return e.f17509a.O(context, "Miscellaneous Fee Payment");
                }
                if (p.o(hVar.c(), VContant.ALTERATION_CODE, true)) {
                    return e.f17509a.O(context, "Alteration of Vehicle");
                }
                return hVar.c().equals(VContant.MULTI_SELECT_SERVICE_CODE) ? e.f17509a.O(context, "RC Services") : "Vehicle Services";
            } catch (Exception e10) {
                e10.printStackTrace();
                return "Vehicle Services";
            }
        }

        public final long m(String str) {
            l.f(str, "d");
            int i10 = 0;
            while (i10 < VContant.formats.length) {
                try {
                    Date parse = new SimpleDateFormat(VContant.formats[i10]).parse(str);
                    l.e(parse, "parse(...)");
                    return parse.getTime();
                } catch (Exception unused) {
                    i10++;
                }
            }
            return 0;
        }

        public final String n(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date parse = simpleDateFormat.parse(str);
                l.e(parse, "parse(...)");
                return simpleDateFormat2.format(parse);
            } catch (ParseException unused) {
                return null;
            }
        }

        public final String o(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date parse = simpleDateFormat.parse(str);
                l.e(parse, "parse(...)");
                return simpleDateFormat2.format(parse);
            } catch (ParseException unused) {
                return null;
            }
        }

        public final String p(String str) {
            l.f(str, "code");
            HashMap hashMap = new HashMap();
            hashMap.put(VContant.DUPLICATE_RC_PURPOSE_CODE, "IsueOfDuplicateMultiService");
            hashMap.put(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, "ChangeOfAddressMultiService");
            hashMap.put(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "HypothecationTerminationActivityMultiService");
            hashMap.put(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "HypothecationAdditionActivityMultiService");
            hashMap.put(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "HypothecationContinuationActivityMulti");
            hashMap.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TransferOfOwnerMultiScreen");
            return String.valueOf(hashMap.get(str));
        }

        public final String q(String str, String str2) {
            String str3;
            l.f(str, "code");
            l.f(str2, "type");
            HashMap hashMap = new HashMap();
            hashMap.put(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "HypothecationTerminationActivityMultiServiceTO");
            hashMap.put(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "HypothecationAdditionActivityMultiServiceTO");
            hashMap.put(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "HypothecationContinuationActivityMultiTO");
            if (p.o(str2, "S", true)) {
                hashMap.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TransferOfOwnerShipActivitySeller");
                str3 = "IsueOfDuplicateMultiServiceTO";
            } else {
                hashMap.put(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "TOBuyerMainActivity");
                str3 = "IssueOfDuplicateMultiServiceToBuyer";
            }
            hashMap.put(VContant.DUPLICATE_RC_PURPOSE_CODE, str3);
            return String.valueOf(hashMap.get(str));
        }

        public final String r(String str, ArrayList arrayList) {
            l.f(str, "purCode");
            try {
                l.c(arrayList);
                int indexOf = arrayList.indexOf(str) + 1;
                if (indexOf >= arrayList.size()) {
                    return VContant.REDIRECT;
                }
                Object obj = arrayList.get(indexOf);
                l.e(obj, "get(...)");
                return VContant.Companion.p((String) obj);
            } catch (Exception unused) {
                return "0";
            }
        }

        public final String s(String str, ArrayList arrayList, String str2) {
            l.f(str, "purCode");
            l.f(str2, "type");
            try {
                l.c(arrayList);
                int indexOf = arrayList.indexOf(str) + 1;
                if (indexOf >= arrayList.size()) {
                    return VContant.REDIRECT;
                }
                Object obj = arrayList.get(indexOf);
                l.e(obj, "get(...)");
                return VContant.Companion.q((String) obj, str2);
            } catch (Exception unused) {
                return "0";
            }
        }

        public final String t(VtInsuranceCommonDto vtInsuranceCommonDto) {
            Object insuranceUpto;
            if (vtInsuranceCommonDto == null) {
                return " ";
            }
            c.a aVar = ka.c.f13158a;
            if (!aVar.m((String) vtInsuranceCommonDto.getInsuranceUpto())) {
                insuranceUpto = vtInsuranceCommonDto.getInsuranceUpto();
            } else if (!aVar.m((String) vtInsuranceCommonDto.getIns_upto())) {
                insuranceUpto = vtInsuranceCommonDto.getIns_upto();
            } else if (aVar.m((String) vtInsuranceCommonDto.getInsUpto())) {
                return " ";
            } else {
                insuranceUpto = vtInsuranceCommonDto.getInsUpto();
            }
            return String.valueOf(insuranceUpto);
        }

        public final boolean u(String str, ArrayList arrayList) {
            l.f(str, "purCode");
            try {
                l.c(arrayList);
                return ((String) arrayList.get(arrayList.indexOf(str) + 1)).equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
            } catch (Exception unused) {
            }
        }

        public final String v(String str) {
            l.f(str, "periodMode");
            if (p.o(str, "Days", true)) {
                return "D";
            }
            if (p.o(str, "Weeks", true)) {
                return "W";
            }
            return (!p.o(str, "Months", true) && !p.o(str, "year", true)) ? "" : "M";
        }

        public final String w(String str) {
            l.f(str, "periodMode");
            String str2 = "Days";
            if (!str.equals(str2) && !str.equals("D")) {
                str2 = "Weeks";
                if (!str.equals(str2) && !str.equals("W")) {
                    str2 = "Months";
                    if (!str.equals(str2) && !str.equals("M")) {
                        return (p.o(str, "year", true) || p.o(str, "y", true)) ? "Year" : "";
                    }
                }
            }
            return str2;
        }

        public final String x(VtInsuranceCommonDto vtInsuranceCommonDto) {
            String policy_no;
            if (vtInsuranceCommonDto == null) {
                return " ";
            }
            c.a aVar = ka.c.f13158a;
            if (!aVar.m(vtInsuranceCommonDto.getPolicy_no())) {
                policy_no = vtInsuranceCommonDto.getPolicy_no();
            } else if (aVar.m(vtInsuranceCommonDto.getPolicyNo())) {
                return " ";
            } else {
                policy_no = vtInsuranceCommonDto.getPolicyNo();
            }
            return String.valueOf(policy_no);
        }

        public final String y(h hVar) {
            l.f(hVar, "session");
            try {
                if (p.o(hVar.c(), VContant.DUPLICATE_RC_CODE, true)) {
                    return VContant.DUPLICATE_RC_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                    return VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                    return VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                    return VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                    return VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                    return VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.RCPARTICULAR_CODE, true)) {
                    return VContant.RCPARTICULAR_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.NOC_CODE, true)) {
                    return VContant.NOC_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.DUPLICATE_FITNESS_CODE, true)) {
                    return VContant.DUPLICATE_FITNESS_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.RC_CANCELLATION_CODE, true)) {
                    return VContant.RC_CACELLATION_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.RC_SURRENDER_RC_CODE, true)) {
                    return VContant.RC_SURRENDER_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.DUPLICATE_PERMIT_CODE, true)) {
                    return VContant.DUPLICATE_PERMIT_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.PAY_TAX_CODE, true)) {
                    return VContant.Tax_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.PAY_TAX_ASS_CODE, true)) {
                    return VContant.Tax_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.RC_RELEASE_CODE, true)) {
                    return VContant.RC_RELEASE_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.TEMPERMIT_CODE, true)) {
                    return VContant.TempPermit_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.NP_CODE, true)) {
                    return VContant.RenewalNpAuthorization_CODE;
                }
                if (p.o(hVar.c(), VContant.PERMIT_RENEWAL_CODE, true)) {
                    return VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.MISELL_CODE, true)) {
                    return VContant.MISELL_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.COMPOUND_FEE_CODE, true)) {
                    return VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.ALTERATION_CODE, true)) {
                    return VContant.ALTERATION_PURPOSE_CODE;
                }
                if (p.o(hVar.c(), VContant.UPDATE_MOBILE_CODE, true)) {
                    return VContant.UPDATE_MOBILE_PURPOSE_CODE;
                }
                return p.o(hVar.c(), VContant.MULTI_SELECT_SERVICE_CODE, true) ? VContant.MULTISERVICE_PURPOSE_CODE : "Vehicle Services";
            } catch (Exception e10) {
                e10.printStackTrace();
                return "Vehicle Services";
            }
        }

        public final int z(String str) {
            l.f(str, "reason");
            if (p.o(str, "COMMON", true)) {
                return 0;
            }
            if (p.o(str, "LOST", true)) {
                return 1;
            }
            if (p.o(str, "THEFT", true)) {
                return 2;
            }
            if (p.o(str, "TORN", true)) {
                return 3;
            }
            return p.o(str, "OTHER", true) ? 4 : 5;
        }
    }
}
