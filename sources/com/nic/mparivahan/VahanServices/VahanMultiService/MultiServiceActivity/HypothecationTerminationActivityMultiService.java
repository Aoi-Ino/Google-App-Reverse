package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ld.c;
import ni.cb;
import pg.g;
import tg.a1;
import tg.b1;
import tg.c1;
import tg.d1;
import tg.e1;
import tg.t0;
import tg.v0;
import tg.w0;
import tg.y0;
import tg.z0;
import v9.e;
import z9.a;

public final class HypothecationTerminationActivityMultiService extends d {
    public ProgressDialog G;
    public h H;
    public VahanProService I;
    public cb J;
    public String K;
    public String L;
    public NrvDetails M;
    private Calendar N = Calendar.getInstance();
    public String O;
    public HptDetailsModle P;
    private boolean Q;
    public String R;
    public String S;
    public c T;
    private ArrayList U = new ArrayList();
    private MultiServiceDraft V;
    private MultiServiceDraft W;
    public MultiSelectionViewModel X;
    public MultiService Y;

    /* access modifiers changed from: private */
    public static final void E1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        try {
            g.f30363a.e(hypothecationTerminationActivityMultiService, hypothecationTerminationActivityMultiService.U);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        Intent intent = new Intent(hypothecationTerminationActivityMultiService, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationTerminationActivityMultiService.z1());
        intent.putExtra("RcDetails", hypothecationTerminationActivityMultiService.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivityMultiService.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivityMultiService.s1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivityMultiService.r1());
        hypothecationTerminationActivityMultiService.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, String str) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        hypothecationTerminationActivityMultiService.y1().dismiss();
        VContant.Companion.K(hypothecationTerminationActivityMultiService, str);
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        hypothecationTerminationActivityMultiService.N.set(1, i10);
        hypothecationTerminationActivityMultiService.N.set(2, i11);
        hypothecationTerminationActivityMultiService.N.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationTerminationActivityMultiService.N.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationTerminationActivityMultiService.N.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationTerminationActivityMultiService.N.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationTerminationActivityMultiService.T1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationTerminationActivityMultiService.t1().f25743h.setText(simpleDateFormat.format(hypothecationTerminationActivityMultiService.N.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationTerminationActivityMultiService, onDateSetListener, hypothecationTerminationActivityMultiService.N.get(1), hypothecationTerminationActivityMultiService.N.get(2), hypothecationTerminationActivityMultiService.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, HptDetailsModle hptDetailsModle) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        hypothecationTerminationActivityMultiService.y1().dismiss();
        try {
            l.c(hptDetailsModle);
            hypothecationTerminationActivityMultiService.U1(hptDetailsModle);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            c.a aVar = ka.c.f13158a;
            if (!aVar.m(str)) {
                if (!aVar.m(valueOf)) {
                    if (valueOf.length() == 0) {
                        hypothecationTerminationActivityMultiService.t1().f25747l.setText("--");
                    } else {
                        hypothecationTerminationActivityMultiService.t1().f25747l.setText(valueOf);
                    }
                    if (valueOf2.length() != 0) {
                        AppCompatTextView appCompatTextView = hypothecationTerminationActivityMultiService.t1().f25745j;
                        appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
                    }
                    if (valueOf5.length() != 0) {
                        hypothecationTerminationActivityMultiService.t1().f25742g.setText(a.f18947a.f(valueOf5));
                    }
                    if (str == null) {
                        return;
                    }
                    if (str.length() != 0) {
                        hypothecationTerminationActivityMultiService.t1().f25759x.setText(str.toString());
                        return;
                    }
                    return;
                }
            }
            String b10 = hypothecationTerminationActivityMultiService.v1().b("unable_to_process_your_request", hypothecationTerminationActivityMultiService.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivityMultiService.f2(hypothecationTerminationActivityMultiService, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, String str) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        hypothecationTerminationActivityMultiService.y1().dismiss();
        try {
            String b10 = hypothecationTerminationActivityMultiService.v1().b("unable_to_process_your_request", hypothecationTerminationActivityMultiService.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivityMultiService.f2(hypothecationTerminationActivityMultiService, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        Class<?> cls;
        HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService2 = hypothecationTerminationActivityMultiService;
        l.f(hypothecationTerminationActivityMultiService2, "this$0");
        if (hypothecationTerminationActivityMultiService.t1().f25743h.getText().length() < 2) {
            Toast.makeText(hypothecationTerminationActivityMultiService2, hypothecationTerminationActivityMultiService.v1().b("please_select_date", hypothecationTerminationActivityMultiService2.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            String valueOf = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFncr_add1());
            String valueOf2 = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFncr_add2());
            String valueOf3 = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFncr_add3());
            String fncr_district = hypothecationTerminationActivityMultiService.u1().getFncr_district();
            l.c(fncr_district);
            int parseInt = Integer.parseInt(fncr_district);
            String valueOf4 = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFncr_district());
            String valueOf5 = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFncr_name());
            String fncr_pincode = hypothecationTerminationActivityMultiService.u1().getFncr_pincode();
            Integer valueOf6 = Integer.valueOf(fncr_pincode != null ? Integer.parseInt(fncr_pincode) : 1);
            String fncr_state = hypothecationTerminationActivityMultiService.u1().getFncr_state();
            String fncr_state2 = hypothecationTerminationActivityMultiService.u1().getFncr_state();
            String valueOf7 = String.valueOf(hypothecationTerminationActivityMultiService.u1().getFrom_dt());
            String hp_type = hypothecationTerminationActivityMultiService.u1().getHp_type();
            int parseInt2 = Integer.parseInt(hypothecationTerminationActivityMultiService.x1());
            String m10 = v9.d.f17494a.m();
            int parseInt3 = Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
            String z12 = hypothecationTerminationActivityMultiService.z1();
            Integer rc_owner_srNo = hypothecationTerminationActivityMultiService.A1().getRc_owner_srNo();
            int intValue = rc_owner_srNo != null ? rc_owner_srNo.intValue() : 1;
            String valueOf8 = String.valueOf(hypothecationTerminationActivityMultiService.A1().getState_cd());
            a.C0251a aVar = a.f18947a;
            HptDto hptDto = new HptDto(" ", valueOf, valueOf2, valueOf3, parseInt, valueOf4, valueOf5, valueOf6, fncr_state, fncr_state2, 0, "0", 0, "0", valueOf7, " ", hp_type, " ", parseInt2, m10, parseInt3, z12, intValue, valueOf8, aVar.h(hypothecationTerminationActivityMultiService.t1().f25743h.getText().toString()), " ", aVar.h(hypothecationTerminationActivityMultiService.t1().f25743h.getText().toString()), " ");
            MultiServiceDraft multiServiceDraft = hypothecationTerminationActivityMultiService2.V;
            l.c(multiServiceDraft);
            hypothecationTerminationActivityMultiService2.W = MultiServiceDraft.copy$default(multiServiceDraft, (String) null, (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2031, (Object) null);
        } catch (Exception e10) {
            try {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        VContant.Companion companion = VContant.Companion;
        if (p.o(companion.r(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, hypothecationTerminationActivityMultiService2.U), VContant.REDIRECT, true)) {
            hypothecationTerminationActivityMultiService.y1().show();
            MultiSelectionViewModel D1 = hypothecationTerminationActivityMultiService.D1();
            MultiServiceDraft multiServiceDraft2 = hypothecationTerminationActivityMultiService2.W;
            l.c(multiServiceDraft2);
            D1.v(multiServiceDraft2);
            return;
        }
        Intent intent = new Intent();
        if (companion.u(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, hypothecationTerminationActivityMultiService2.U)) {
            cls = Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.r(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, hypothecationTerminationActivityMultiService2.U));
        } else {
            cls = Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.r(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, hypothecationTerminationActivityMultiService2.U));
        }
        intent.setClass(hypothecationTerminationActivityMultiService2, cls);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationTerminationActivityMultiService2.U);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationTerminationActivityMultiService2.W);
        intent.putExtra("RC", hypothecationTerminationActivityMultiService.z1());
        intent.putExtra("RcDetails", hypothecationTerminationActivityMultiService.A1());
        intent.putExtra("off_code", hypothecationTerminationActivityMultiService.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivityMultiService2.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivityMultiService.s1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivityMultiService.r1());
        hypothecationTerminationActivityMultiService2.startActivity(intent);
        hypothecationTerminationActivityMultiService.finish();
    }

    /* access modifiers changed from: private */
    public static final void M1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        VUtility.Companion.v(hypothecationTerminationActivityMultiService, hypothecationTerminationActivityMultiService.v1().b("are_you_sure_you_want_to_leave", hypothecationTerminationActivityMultiService.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void N1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        hypothecationTerminationActivityMultiService.P1();
    }

    /* access modifiers changed from: private */
    public static final void O1(HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, DraftResponse draftResponse) {
        HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService2 = hypothecationTerminationActivityMultiService;
        l.f(hypothecationTerminationActivityMultiService2, "this$0");
        hypothecationTerminationActivityMultiService.y1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage != null && apiMessage.getStatusCode() == 200) {
            Data data = draftResponse.getData();
            MultiServiceDraft multiServiceDraft = null;
            String valueOf = String.valueOf(data != null ? data.getApplNo() : null);
            Data data2 = draftResponse.getData();
            if (data2 != null) {
                data2.getTransferOwnershipDto();
            }
            Data data3 = draftResponse.getData();
            ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
            Data data4 = draftResponse.getData();
            HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
            Data data5 = draftResponse.getData();
            HptDto hptDto = data5 != null ? data5.getHptDto() : null;
            Data data6 = draftResponse.getData();
            Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
            MultiServiceDraft multiServiceDraft2 = hypothecationTerminationActivityMultiService2.V;
            if (multiServiceDraft2 != null) {
                multiServiceDraft = MultiServiceDraft.copy$default(multiServiceDraft2, valueOf, channgeOfAdressDto, durcdto, hpaDto, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2016, (Object) null);
            }
            Intent intent = new Intent(hypothecationTerminationActivityMultiService2, VahanMultiServiceConfirmationScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationTerminationActivityMultiService2.U);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
            intent.putExtra("RcDetails", hypothecationTerminationActivityMultiService.A1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivityMultiService2.Q);
            intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivityMultiService.s1());
            intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivityMultiService.r1());
            hypothecationTerminationActivityMultiService2.startActivity(intent);
            hypothecationTerminationActivityMultiService.finish();
        }
    }

    private final void P1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, HypothecationTerminationActivityMultiService hypothecationTerminationActivityMultiService, View view) {
        l.f(dialog, "$dialog");
        l.f(hypothecationTerminationActivityMultiService, "this$0");
        dialog.dismiss();
        hypothecationTerminationActivityMultiService.finish();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService B1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h C1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final MultiSelectionViewModel D1() {
        MultiSelectionViewModel multiSelectionViewModel = this.X;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModelMulti");
        return null;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void S1(cb cbVar) {
        l.f(cbVar, "<set-?>");
        this.J = cbVar;
    }

    public final void T1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void U1(HptDetailsModle hptDetailsModle) {
        l.f(hptDetailsModle, "<set-?>");
        this.P = hptDetailsModle;
    }

    public final void V1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void W1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.Y = multiService;
    }

    public final void X1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final void Z1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void b2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void c2(String str, ArrayList arrayList) {
        l.f(str, "purCode");
        try {
            l.c(arrayList);
            int indexOf = arrayList.indexOf(str);
            if (arrayList.size() == 4) {
                t1().f25755t.f29783b.setVisibility(0);
                TextView textView = t1().f25755t.f29785d;
                VContant.Companion companion = VContant.Companion;
                Object obj = arrayList.get(0);
                l.e(obj, "get(...)");
                textView.setText(companion.B(this, (String) obj));
                TextView textView2 = t1().f25755t.f29787f;
                Object obj2 = arrayList.get(1);
                l.e(obj2, "get(...)");
                textView2.setText(companion.B(this, (String) obj2));
                TextView textView3 = t1().f25755t.f29792k;
                Object obj3 = arrayList.get(2);
                l.e(obj3, "get(...)");
                textView3.setText(companion.B(this, (String) obj3));
                TextView textView4 = t1().f25755t.f29795n;
                Object obj4 = arrayList.get(3);
                l.e(obj4, "get(...)");
                textView4.setText(companion.B(this, (String) obj4));
                if (indexOf == 3) {
                    t1().f25755t.f29784c.setChecked(true);
                    t1().f25755t.f29786e.setChecked(true);
                    t1().f25755t.f29789h.setChecked(true);
                    t1().f25755t.f29794m.setChecked(false);
                }
                if (indexOf == 2) {
                    t1().f25755t.f29784c.setChecked(true);
                    t1().f25755t.f29786e.setChecked(true);
                    t1().f25755t.f29789h.setChecked(false);
                    t1().f25755t.f29794m.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 1) {
                    t1().f25755t.f29784c.setChecked(true);
                    t1().f25755t.f29786e.setChecked(false);
                    Drawable e10 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().f25755t.f29789h.setCheckMarkDrawable(e10);
                    t1().f25755t.f29794m.setCheckMarkDrawable(e10);
                }
                if (indexOf == 0) {
                    t1().f25755t.f29784c.setChecked(false);
                    Drawable e11 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().f25755t.f29786e.setCheckMarkDrawable(e11);
                    t1().f25755t.f29789h.setCheckMarkDrawable(e11);
                    t1().f25755t.f29794m.setCheckMarkDrawable(e11);
                }
            }
            if (arrayList.size() == 3) {
                t1().f25755t.f29802u.setVisibility(0);
                TextView textView5 = t1().f25755t.f29807z;
                VContant.Companion companion2 = VContant.Companion;
                Object obj5 = arrayList.get(2);
                l.e(obj5, "get(...)");
                textView5.setText(companion2.B(this, (String) obj5));
                TextView textView6 = t1().f25755t.f29804w;
                Object obj6 = arrayList.get(1);
                l.e(obj6, "get(...)");
                textView6.setText(companion2.B(this, (String) obj6));
                TextView textView7 = t1().f25755t.f29791j;
                Object obj7 = arrayList.get(0);
                l.e(obj7, "get(...)");
                textView7.setText(companion2.B(this, (String) obj7));
                if (indexOf == 2) {
                    t1().f25755t.f29790i.setChecked(true);
                    t1().f25755t.f29803v.setChecked(true);
                    t1().f25755t.f29806y.setChecked(false);
                }
                if (indexOf == 1) {
                    t1().f25755t.f29790i.setChecked(true);
                    t1().f25755t.f29803v.setChecked(false);
                    t1().f25755t.f29806y.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 0) {
                    t1().f25755t.f29790i.setChecked(false);
                    Drawable e12 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().f25755t.f29803v.setCheckMarkDrawable(e12);
                    t1().f25755t.f29806y.setCheckMarkDrawable(e12);
                }
            }
            if (arrayList.size() == 2) {
                t1().f25755t.A.setVisibility(0);
                TextView textView8 = t1().f25755t.f29801t;
                VContant.Companion companion3 = VContant.Companion;
                Object obj8 = arrayList.get(1);
                l.e(obj8, "get(...)");
                textView8.setText(companion3.B(this, (String) obj8));
                TextView textView9 = t1().f25755t.f29799r;
                Object obj9 = arrayList.get(0);
                l.e(obj9, "get(...)");
                textView9.setText(companion3.B(this, (String) obj9));
                if (indexOf == 1) {
                    t1().f25755t.f29798q.setChecked(true);
                    t1().f25755t.f29800s.setChecked(false);
                }
                if (indexOf == 0) {
                    t1().f25755t.f29798q.setChecked(false);
                    t1().f25755t.f29800s.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public final void d2(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void e2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.X = multiSelectionViewModel;
    }

    public final void f2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new v0(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, new ld.c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.hpttermination_multi_service);
        cb c10 = cb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        S1(c10);
        setContentView((View) t1().b());
        e.f17509a.W0(this, t1());
        V1(new ld.c(this));
        b2(VahanProService.f21196b.b(this));
        Y1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        d2((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(B1()))).a(h.class));
        W1(MultiService.f21070a.b(this));
        e2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(w1()))).a(MultiSelectionViewModel.class));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        R1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.V = (MultiServiceDraft) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.U = arrayList;
        c2(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, arrayList);
        t1().f25758w.f28304e.setVisibility(0);
        t1().f25758w.f28304e.setText(z1());
        SpannableString spannableString = new SpannableString(z1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        t1().f25758w.f28304e.setText(spannableString);
        ArrayList arrayList2 = this.U;
        l.c(arrayList2);
        if (arrayList2.size() <= 1) {
            V1(new ld.c(this));
            t1().f25758w.f28308i.setText(v1().b("hypothecation_termination", getString(R.string.vahan_hypothecation_termination)));
        } else {
            SpannableString spannableString2 = new SpannableString(v1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            t1().f25758w.f28308i.setText(spannableString2);
        }
        t1().f25758w.f28308i.setOnClickListener(new t0(this));
        V1(new ld.c(this));
        TextView textView = t1().I;
        textView.setText(v1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        t1().J.setText(v1().b("view_vehicle_details", "View Vehicle Details"));
        t1().J.setPaintFlags(t1().J.getPaintFlags() | 8);
        t1().f25758w.f28304e.setOnClickListener(new tg.x0(this));
        X1(String.valueOf(A1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.Q = booleanExtra;
        if (booleanExtra) {
            t1().f25754s.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.Q;
        LinearLayout linearLayout = t1().f25754s.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        try {
            y1().show();
            C1().i0(this, z1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        t1().f25743h.setOnClickListener(new z0(this, new y0(this)));
        C1().j0().g(this, new a1(this));
        C1().k0().g(this, new b1(this));
        t1().f25739d.setOnClickListener(new c1(this));
        t1().f25758w.f28305f.setOnClickListener(new d1(this));
        t1().f25758w.f28306g.setOnClickListener(new e1(this));
        D1().l().g(this, new tg.u0(this));
        D1().m().g(this, new w0(this));
    }

    public final String r1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String s1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final cb t1() {
        cb cbVar = this.J;
        if (cbVar != null) {
            return cbVar;
        }
        l.v("binding");
        return null;
    }

    public final HptDetailsModle u1() {
        HptDetailsModle hptDetailsModle = this.P;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        l.v("htpmodle");
        return null;
    }

    public final ld.c v1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final MultiService w1() {
        MultiService multiService = this.Y;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String x1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }
}
