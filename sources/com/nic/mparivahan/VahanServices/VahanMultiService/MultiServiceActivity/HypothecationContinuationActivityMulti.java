package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import java.util.ArrayList;
import ld.c;
import ni.db;
import pg.g;
import tg.j0;
import tg.k0;
import tg.l0;
import tg.m0;
import tg.n0;
import tg.o0;
import tg.p0;
import tg.q0;
import tg.r0;
import tg.s0;
import v9.e;
import z9.a;

public final class HypothecationContinuationActivityMulti extends d {
    public db G;
    public h H;
    public VahanProService I;
    public String J;
    public String K;
    public NrvDetails L;
    public ProgressDialog M;
    private boolean N;
    public c O;
    private ArrayList P = new ArrayList();
    private MultiServiceDraft Q;
    public MultiSelectionViewModel R;
    public MultiService S;
    public String T;
    public String U;

    /* access modifiers changed from: private */
    public static final void B1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, View view) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        try {
            g.f30363a.e(hypothecationContinuationActivityMulti, hypothecationContinuationActivityMulti.P);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, View view) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        Intent intent = new Intent(hypothecationContinuationActivityMulti, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationContinuationActivityMulti.w1());
        intent.putExtra("RcDetails", hypothecationContinuationActivityMulti.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivityMulti.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivityMulti.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivityMulti.p1());
        hypothecationContinuationActivityMulti.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, HptDetailsModle hptDetailsModle) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        hypothecationContinuationActivityMulti.v1().dismiss();
        try {
            hypothecationContinuationActivityMulti.r1().f25943o.setVisibility(0);
            hypothecationContinuationActivityMulti.r1().f25932d.setVisibility(0);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            if (valueOf.length() == 0) {
                hypothecationContinuationActivityMulti.r1().f25938j.setText("--");
            } else {
                hypothecationContinuationActivityMulti.r1().f25938j.setText(valueOf);
            }
            if (valueOf2.length() != 0) {
                AppCompatTextView appCompatTextView = hypothecationContinuationActivityMulti.r1().f25936h;
                appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
            }
            if (valueOf5.length() != 0) {
                hypothecationContinuationActivityMulti.r1().f25935g.setText(a.f18947a.f(valueOf5));
            }
            if (str == null) {
                return;
            }
            if (str.length() != 0) {
                hypothecationContinuationActivityMulti.r1().f25950v.setText(str.toString());
            }
        } catch (Exception e10) {
            hypothecationContinuationActivityMulti.r1().f25943o.setVisibility(8);
            hypothecationContinuationActivityMulti.r1().f25932d.setVisibility(8);
            hypothecationContinuationActivityMulti.Y1(hypothecationContinuationActivityMulti, hypothecationContinuationActivityMulti.getString(R.string.service_unavable_please_try));
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, String str) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        hypothecationContinuationActivityMulti.v1().dismiss();
        hypothecationContinuationActivityMulti.r1().f25943o.setVisibility(8);
        hypothecationContinuationActivityMulti.r1().f25932d.setVisibility(8);
        hypothecationContinuationActivityMulti.Y1(hypothecationContinuationActivityMulti, hypothecationContinuationActivityMulti.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, View view) {
        StringBuilder sb2;
        String str;
        l.f(hypothecationContinuationActivityMulti, "this$0");
        Intent intent = new Intent();
        VContant.Companion companion = VContant.Companion;
        if (p.o(companion.r(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, hypothecationContinuationActivityMulti.P), VContant.REDIRECT, true)) {
            hypothecationContinuationActivityMulti.v1().show();
            MultiSelectionViewModel A1 = hypothecationContinuationActivityMulti.A1();
            MultiServiceDraft multiServiceDraft = hypothecationContinuationActivityMulti.Q;
            l.c(multiServiceDraft);
            A1.v(multiServiceDraft);
            return;
        }
        if (companion.u(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, hypothecationContinuationActivityMulti.P)) {
            sb2 = new StringBuilder();
            str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip.";
        } else {
            sb2 = new StringBuilder();
            str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.";
        }
        sb2.append(str);
        sb2.append(companion.r(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, hypothecationContinuationActivityMulti.P));
        intent.setClass(hypothecationContinuationActivityMulti, Class.forName(sb2.toString()));
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationContinuationActivityMulti.P);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationContinuationActivityMulti.Q);
        intent.putExtra("RC", hypothecationContinuationActivityMulti.w1());
        intent.putExtra("RcDetails", hypothecationContinuationActivityMulti.x1());
        intent.putExtra("off_code", hypothecationContinuationActivityMulti.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivityMulti.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivityMulti.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivityMulti.p1());
        hypothecationContinuationActivityMulti.startActivity(intent);
        hypothecationContinuationActivityMulti.finish();
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, View view) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        VUtility.Companion.v(hypothecationContinuationActivityMulti, hypothecationContinuationActivityMulti.s1().b("are_you_sure_you_want_to_leave", hypothecationContinuationActivityMulti.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, View view) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        hypothecationContinuationActivityMulti.K1();
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, DraftResponse draftResponse) {
        HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti2 = hypothecationContinuationActivityMulti;
        l.f(hypothecationContinuationActivityMulti2, "this$0");
        hypothecationContinuationActivityMulti.v1().dismiss();
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
            MultiServiceDraft multiServiceDraft2 = hypothecationContinuationActivityMulti2.Q;
            if (multiServiceDraft2 != null) {
                multiServiceDraft = MultiServiceDraft.copy$default(multiServiceDraft2, valueOf, channgeOfAdressDto, durcdto, hpaDto, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2016, (Object) null);
            }
            Intent intent = new Intent(hypothecationContinuationActivityMulti2, VahanMultiServiceConfirmationScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationContinuationActivityMulti2.P);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
            intent.putExtra("RcDetails", hypothecationContinuationActivityMulti.x1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationContinuationActivityMulti2.N);
            intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationContinuationActivityMulti.q1());
            intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationContinuationActivityMulti.p1());
            hypothecationContinuationActivityMulti2.startActivity(intent);
            hypothecationContinuationActivityMulti.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationContinuationActivityMulti hypothecationContinuationActivityMulti, String str) {
        l.f(hypothecationContinuationActivityMulti, "this$0");
        hypothecationContinuationActivityMulti.v1().dismiss();
    }

    private final void K1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final MultiSelectionViewModel A1() {
        MultiSelectionViewModel multiSelectionViewModel = this.R;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModelMulti");
        return null;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void N1(db dbVar) {
        l.f(dbVar, "<set-?>");
        this.G = dbVar;
    }

    public final void O1(c cVar) {
        l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void P1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.S = multiService;
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void R1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void U1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void V1(String str, ArrayList arrayList) {
        l.f(str, "purCode");
        try {
            l.c(arrayList);
            int indexOf = arrayList.indexOf(str);
            if (arrayList.size() == 4) {
                r1().f25946r.f29783b.setVisibility(0);
                TextView textView = r1().f25946r.f29785d;
                VContant.Companion companion = VContant.Companion;
                Object obj = arrayList.get(0);
                l.e(obj, "get(...)");
                textView.setText(companion.B(this, (String) obj));
                TextView textView2 = r1().f25946r.f29787f;
                Object obj2 = arrayList.get(1);
                l.e(obj2, "get(...)");
                textView2.setText(companion.B(this, (String) obj2));
                TextView textView3 = r1().f25946r.f29792k;
                Object obj3 = arrayList.get(2);
                l.e(obj3, "get(...)");
                textView3.setText(companion.B(this, (String) obj3));
                TextView textView4 = r1().f25946r.f29795n;
                Object obj4 = arrayList.get(3);
                l.e(obj4, "get(...)");
                textView4.setText(companion.B(this, (String) obj4));
                if (indexOf == 3) {
                    r1().f25946r.f29784c.setChecked(true);
                    r1().f25946r.f29786e.setChecked(true);
                    r1().f25946r.f29789h.setChecked(true);
                    r1().f25946r.f29794m.setChecked(false);
                }
                if (indexOf == 2) {
                    r1().f25946r.f29784c.setChecked(true);
                    r1().f25946r.f29786e.setChecked(true);
                    r1().f25946r.f29789h.setChecked(false);
                    r1().f25946r.f29794m.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 1) {
                    r1().f25946r.f29784c.setChecked(true);
                    r1().f25946r.f29786e.setChecked(false);
                    Drawable e10 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    r1().f25946r.f29789h.setCheckMarkDrawable(e10);
                    r1().f25946r.f29794m.setCheckMarkDrawable(e10);
                }
                if (indexOf == 0) {
                    r1().f25946r.f29784c.setChecked(false);
                    Drawable e11 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    r1().f25946r.f29786e.setCheckMarkDrawable(e11);
                    r1().f25946r.f29789h.setCheckMarkDrawable(e11);
                    r1().f25946r.f29794m.setCheckMarkDrawable(e11);
                }
            }
            if (arrayList.size() == 3) {
                r1().f25946r.f29802u.setVisibility(0);
                TextView textView5 = r1().f25946r.f29807z;
                VContant.Companion companion2 = VContant.Companion;
                Object obj5 = arrayList.get(2);
                l.e(obj5, "get(...)");
                textView5.setText(companion2.B(this, (String) obj5));
                TextView textView6 = r1().f25946r.f29804w;
                Object obj6 = arrayList.get(1);
                l.e(obj6, "get(...)");
                textView6.setText(companion2.B(this, (String) obj6));
                TextView textView7 = r1().f25946r.f29791j;
                Object obj7 = arrayList.get(0);
                l.e(obj7, "get(...)");
                textView7.setText(companion2.B(this, (String) obj7));
                if (indexOf == 2) {
                    r1().f25946r.f29790i.setChecked(true);
                    r1().f25946r.f29803v.setChecked(true);
                    r1().f25946r.f29806y.setChecked(false);
                }
                if (indexOf == 1) {
                    r1().f25946r.f29790i.setChecked(true);
                    r1().f25946r.f29803v.setChecked(false);
                    r1().f25946r.f29806y.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 0) {
                    r1().f25946r.f29790i.setChecked(false);
                    Drawable e12 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    r1().f25946r.f29803v.setCheckMarkDrawable(e12);
                    r1().f25946r.f29806y.setCheckMarkDrawable(e12);
                }
            }
            if (arrayList.size() == 2) {
                r1().f25946r.A.setVisibility(0);
                TextView textView8 = r1().f25946r.f29801t;
                VContant.Companion companion3 = VContant.Companion;
                Object obj8 = arrayList.get(1);
                l.e(obj8, "get(...)");
                textView8.setText(companion3.B(this, (String) obj8));
                TextView textView9 = r1().f25946r.f29799r;
                Object obj9 = arrayList.get(0);
                l.e(obj9, "get(...)");
                textView9.setText(companion3.B(this, (String) obj9));
                if (indexOf == 1) {
                    r1().f25946r.f29798q.setChecked(true);
                    r1().f25946r.f29800s.setChecked(false);
                }
                if (indexOf == 0) {
                    r1().f25946r.f29798q.setChecked(false);
                    r1().f25946r.f29800s.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public final void W1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void X1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.R = multiSelectionViewModel;
    }

    public final void Y1(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new s0(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.hypo_continustion_multi);
        db c10 = db.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        N1(c10);
        setContentView((View) r1().b());
        e.f17509a.T0(this, r1());
        U1(VahanProService.f21196b.b(this));
        P1(MultiService.f21070a.b(this));
        X1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(t1()))).a(MultiSelectionViewModel.class));
        S1(String.valueOf(getIntent().getStringExtra("RC")));
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        T1((NrvDetails) serializableExtra);
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.Q = (MultiServiceDraft) serializableExtra2;
        this.P = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        r1().f25949u.f28304e.setVisibility(0);
        r1().f25949u.f28304e.setText(w1());
        SpannableString spannableString = new SpannableString(w1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        r1().f25949u.f28304e.setText(spannableString);
        ArrayList arrayList = this.P;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            O1(new c(this));
            r1().f25949u.f28308i.setText(s1().b("hypothecation_continuation", getString(R.string.vahan_hypothecation_continuation)));
        } else {
            SpannableString spannableString2 = new SpannableString(s1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            r1().f25949u.f28308i.setText(spannableString2);
        }
        r1().f25949u.f28308i.setOnClickListener(new j0(this));
        V1(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, this.P);
        if (this.N) {
            r1().f25945q.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.N;
        LinearLayout linearLayout = r1().f25945q.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        O1(new c(this));
        TextView textView = r1().G;
        textView.setText(s1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
        r1().H.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        r1().H.setPaintFlags(r1().H.getPaintFlags() | 8);
        r1().f25949u.f28304e.setOnClickListener(new k0(this));
        R1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        W1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(y1()))).a(h.class));
        try {
            v1().show();
            z1().i0(this, w1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        z1().j0().g(this, new l0(this));
        z1().k0().g(this, new m0(this));
        r1().f25932d.setOnClickListener(new n0(this));
        r1().f25949u.f28305f.setOnClickListener(new o0(this));
        r1().f25949u.f28306g.setOnClickListener(new p0(this));
        A1().l().g(this, new q0(this));
        A1().m().g(this, new r0(this));
    }

    public final String p1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final db r1() {
        db dbVar = this.G;
        if (dbVar != null) {
            return dbVar;
        }
        l.v("binding");
        return null;
    }

    public final c s1() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final MultiService t1() {
        MultiService multiService = this.S;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String u1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String w1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService y1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h z1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
