package com.nic.mparivahan.dlservices.ui.changeName;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import ij.k;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kk.e;
import ni.h0;
import pl.x;
import v9.e;

public final class ChangeOfName extends oi.g {
    /* access modifiers changed from: private */
    public h0 J;
    /* access modifiers changed from: private */
    public ld.c K;
    private ek.a L;
    private pj.b M;
    /* access modifiers changed from: private */
    public List N;
    private Calendar O = Calendar.getInstance();
    private String P = "Y";
    public ld.g Q;
    private String R;
    private String S;
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    public DldetobjX Z;

    /* renamed from: a0  reason: collision with root package name */
    private HashMap f21917a0 = new HashMap();

    /* renamed from: b0  reason: collision with root package name */
    public ld.f f21918b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21919c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f21920d0;

    /* renamed from: e0  reason: collision with root package name */
    private String f21921e0 = "NA";

    /* renamed from: f0  reason: collision with root package name */
    private String f21922f0 = "N";

    /* renamed from: g0  reason: collision with root package name */
    private String f21923g0 = "N";

    /* renamed from: h0  reason: collision with root package name */
    private String f21924h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f21925i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f21926j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f21927k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f21928l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f21929m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f21930n0 = "N";

    /* renamed from: o0  reason: collision with root package name */
    public Context f21931o0;

    /* renamed from: p0  reason: collision with root package name */
    private String f21932p0 = "0";

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f21933q0;

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList f21934r0;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f21935s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f21936t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f21937u0;

    /* renamed from: v0  reason: collision with root package name */
    private String f21938v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f21939w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f21940x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private ab.d f21941y0;

    /* renamed from: z0  reason: collision with root package name */
    public CombineServiceInterface f21942z0;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21943e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f21944f;

        a(ChangeOfName changeOfName, u uVar) {
            this.f21943e = changeOfName;
            this.f21944f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f21943e.t2(((AppCatPojo) ((ArrayList) this.f21944f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21945e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f21946f;

        b(ChangeOfName changeOfName, u uVar) {
            this.f21945e = changeOfName;
            this.f21946f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f21945e.C2(((SpinnerPojo) ((ArrayList) this.f21946f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangeOfName changeOfName) {
            super(1);
            this.f21947e = changeOfName;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f21947e.N = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    this.f21947e.r2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21948e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChangeOfName changeOfName) {
            super(1);
            this.f21948e = changeOfName;
        }

        public final void b(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ChangeOfName changeOfName;
            String b10;
            List<ResultItemSubmit> result;
            h0 G1 = this.f21948e.J;
            ld.c cVar = null;
            if (G1 == null) {
                l.v("binding");
                G1 = null;
            }
            G1.f26579h.c(false);
            try {
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (p.p(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, (Object) null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (dlSubmitresult2 != null && (result = dlSubmitresult2.getResult()) != null && (!result.isEmpty())) {
                        DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                        ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                        if (resultItemSubmit != null) {
                            ChangeOfName changeOfName2 = this.f21948e;
                            try {
                                DlLogCapture.a aVar = DlLogCapture.f21655k;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                l.c(applicationNo);
                                long parseLong = Long.parseLong(applicationNo);
                                int parseInt = Integer.parseInt(changeOfName2.V1().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                l.c(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String W1 = changeOfName2.W1();
                                l.c(W1);
                                aVar.a(changeOfName2, "1234", "S", applicationDate, parseLong, parseInt, dateofBirth, dlno, "N", "N", applicantGender, W1, false, "526", changeOfName2.P1(), changeOfName2.S1());
                            } catch (Exception e10) {
                                Log.d("valiii", e10.getLocalizedMessage());
                            }
                            if (!l.a(changeOfName2.Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                                changeOfName2.A2(new ArrayList());
                                changeOfName2.X1().add(changeOfName2.Z1().i());
                            }
                            dLServiceAcknowlegementActivity.E2(changeOfName2, resultItemSubmit, changeOfName2.P1(), changeOfName2.M1(), changeOfName2.N1(), changeOfName2.O1(), changeOfName2.W1(), changeOfName2.Q1(), changeOfName2.R1(), changeOfName2.S1(), changeOfName2.X1());
                            return;
                        }
                        return;
                    }
                    return;
                }
                DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                if (reqStatus != null) {
                    if (reqStatus.length() != 0) {
                        changeOfName = this.f21948e;
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        b10 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        l.c(b10);
                        changeOfName.r2(b10);
                    }
                }
                changeOfName = this.f21948e;
                ld.c H1 = changeOfName.K;
                if (H1 == null) {
                    l.v("langSession");
                    H1 = null;
                }
                b10 = H1.b("service_is_not_present", this.f21948e.getString(R.string.unable_to_get_details));
                changeOfName.r2(b10);
            } catch (Exception unused) {
                h0 G12 = this.f21948e.J;
                if (G12 == null) {
                    l.v("binding");
                    G12 = null;
                }
                G12.f26579h.c(false);
                ChangeOfName changeOfName3 = this.f21948e;
                ld.c H12 = changeOfName3.K;
                if (H12 == null) {
                    l.v("langSession");
                } else {
                    cVar = H12;
                }
                changeOfName3.r2(cVar.b("service_is_not_present", this.f21948e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAckDetForGivenDLNumberResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21949e;

        e(ChangeOfName changeOfName) {
            this.f21949e = changeOfName;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
            if (r3 == null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
            if (r3 == null) goto L_0x0063;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                cm.l.c(r3)
                int r4 = r3.length()
                if (r4 <= 0) goto L_0x00b0
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r2.f21949e
                ni.h0 r4 = r4.J
                r5 = 0
                java.lang.String r6 = "binding"
                if (r4 != 0) goto L_0x0018
                cm.l.v(r6)
                r4 = r5
            L_0x0018:
                android.widget.EditText r4 = r4.f26584m
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                int r4 = r4.length()
                r0 = 32
                if (r4 <= 0) goto L_0x0079
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r2.f21949e
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x0036
                cm.l.v(r6)
                r4 = r5
            L_0x0036:
                android.widget.EditText r4 = r4.D
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r3 = r2.f21949e
                ni.h0 r3 = r3.J
                if (r3 != 0) goto L_0x004f
                cm.l.v(r6)
                r3 = r5
            L_0x004f:
                android.widget.EditText r3 = r3.f26584m
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r3 = r2.f21949e
                ni.h0 r3 = r3.J
                if (r3 != 0) goto L_0x0067
            L_0x0063:
                cm.l.v(r6)
                goto L_0x0068
            L_0x0067:
                r5 = r3
            L_0x0068:
                android.widget.EditText r3 = r5.f26580i
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r4.setText(r3)
                goto L_0x00b0
            L_0x0079:
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r2.f21949e
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x0085
                cm.l.v(r6)
                r4 = r5
            L_0x0085:
                android.widget.EditText r4 = r4.D
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r0)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r3 = r2.f21949e
                ni.h0 r3 = r3.J
                if (r3 != 0) goto L_0x009e
                cm.l.v(r6)
                r3 = r5
            L_0x009e:
                android.widget.EditText r3 = r3.f26584m
                android.text.Editable r3 = r3.getText()
                r1.append(r3)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r3 = r2.f21949e
                ni.h0 r3 = r3.J
                if (r3 != 0) goto L_0x0067
                goto L_0x0063
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.e.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21950e;

        f(ChangeOfName changeOfName) {
            this.f21950e = changeOfName;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (String.valueOf(charSequence).length() > 0) {
                h0 G1 = this.f21950e.J;
                h0 h0Var = null;
                if (G1 == null) {
                    l.v("binding");
                    G1 = null;
                }
                EditText editText = G1.D;
                StringBuilder sb2 = new StringBuilder();
                h0 G12 = this.f21950e.J;
                if (G12 == null) {
                    l.v("binding");
                    G12 = null;
                }
                sb2.append(G12.f26576e.getText());
                sb2.append(' ');
                sb2.append(charSequence);
                sb2.append(' ');
                h0 G13 = this.f21950e.J;
                if (G13 == null) {
                    l.v("binding");
                } else {
                    h0Var = G13;
                }
                sb2.append(h0Var.f26580i.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21951e;

        g(ChangeOfName changeOfName) {
            this.f21951e = changeOfName;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            if (String.valueOf(charSequence).length() > 0) {
                h0 G1 = this.f21951e.J;
                h0 h0Var = null;
                if (G1 == null) {
                    l.v("binding");
                    G1 = null;
                }
                if (G1.f26584m.getText().toString().length() > 0) {
                    h0 G12 = this.f21951e.J;
                    if (G12 == null) {
                        l.v("binding");
                        G12 = null;
                    }
                    editText = G12.D;
                    sb2 = new StringBuilder();
                    h0 G13 = this.f21951e.J;
                    if (G13 == null) {
                        l.v("binding");
                        G13 = null;
                    }
                    sb2.append(G13.f26576e.getText());
                    sb2.append(' ');
                    h0 G14 = this.f21951e.J;
                    if (G14 == null) {
                        l.v("binding");
                    } else {
                        h0Var = G14;
                    }
                    sb2.append(h0Var.f26584m.getText());
                    sb2.append(' ');
                } else {
                    h0 G15 = this.f21951e.J;
                    if (G15 == null) {
                        l.v("binding");
                        G15 = null;
                    }
                    editText = G15.D;
                    sb2 = new StringBuilder();
                    h0 G16 = this.f21951e.J;
                    if (G16 == null) {
                        l.v("binding");
                        G16 = null;
                    }
                    sb2.append(G16.f26576e.getText());
                    sb2.append(' ');
                    h0 G17 = this.f21951e.J;
                    if (G17 == null) {
                        l.v("binding");
                    } else {
                        h0Var = G17;
                    }
                    sb2.append(h0Var.f26584m.getText());
                }
                sb2.append(charSequence);
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class h implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfName f21952a;

        h(ChangeOfName changeOfName) {
            this.f21952a = changeOfName;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r1 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r1.get(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r4, int r5) {
            /*
                r3 = this;
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r0 = r3.f21952a
                java.util.List r1 = r0.N
                r2 = 0
                if (r1 == 0) goto L_0x0016
                java.lang.Object r1 = r1.get(r5)
                com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem r1 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r1
                if (r1 == 0) goto L_0x0016
                java.lang.Integer r1 = r1.getReasonCode()
                goto L_0x0017
            L_0x0016:
                r1 = r2
            L_0x0017:
                cm.l.c(r1)
                int r1 = r1.intValue()
                r0.u2(r1)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r0 = r3.f21952a
                java.util.List r1 = r0.N
                if (r1 == 0) goto L_0x0036
                java.lang.Object r5 = r1.get(r5)
                com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r5
                if (r5 == 0) goto L_0x0036
                java.lang.String r5 = r5.getReasonName()
                goto L_0x0037
            L_0x0036:
                r5 = r2
            L_0x0037:
                cm.l.c(r5)
                r0.B2(r5)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r5 = r3.f21952a
                ni.h0 r5 = r5.J
                java.lang.String r0 = "binding"
                if (r5 != 0) goto L_0x004b
                cm.l.v(r0)
                r5 = r2
            L_0x004b:
                android.widget.EditText r5 = r5.f26577f
                r5.setText(r4)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r3.f21952a
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x005c
                cm.l.v(r0)
                r4 = r2
            L_0x005c:
                android.widget.EditText r4 = r4.f26577f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = ""
                r5.append(r1)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r1 = r3.f21952a
                int r1 = r1.L1()
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r4.setContentDescription(r5)
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r3.f21952a
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x0084
                cm.l.v(r0)
                r4 = r2
            L_0x0084:
                android.widget.EditText r4 = r4.f26577f
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "Miscellaneous"
                r1 = 1
                boolean r4 = km.p.o(r4, r5, r1)
                if (r4 == 0) goto L_0x00ab
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r3.f21952a
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x00a3
                cm.l.v(r0)
                goto L_0x00a4
            L_0x00a3:
                r2 = r4
            L_0x00a4:
                android.widget.LinearLayout r4 = r2.f26578g
                r5 = 0
            L_0x00a7:
                r4.setVisibility(r5)
                goto L_0x00bd
            L_0x00ab:
                com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r4 = r3.f21952a
                ni.h0 r4 = r4.J
                if (r4 != 0) goto L_0x00b7
                cm.l.v(r0)
                goto L_0x00b8
            L_0x00b7:
                r2 = r4
            L_0x00b8:
                android.widget.LinearLayout r4 = r2.f26578g
                r5 = 8
                goto L_0x00a7
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.h.a(java.lang.String, int):void");
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final i f21953e = new i();

        i() {
            super(1);
        }

        public final void b(String str) {
            l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21954a;

        j(bm.l lVar) {
            l.f(lVar, "function");
            this.f21954a = lVar;
        }

        public final pl.c a() {
            return this.f21954a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21954a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0121, code lost:
        if (r0 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0127, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0138, code lost:
        if (r0 == null) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void K1() {
        /*
            r11 = this;
            cm.u r0 = new cm.u
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f20234e = r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r3 = "Select Applicant Category"
            java.lang.String r4 = "0"
            r2.<init>(r4, r3)
            r3 = 0
            r1.add(r3, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r5 = "G"
            java.lang.String r6 = "General"
            r2.<init>(r5, r6)
            r5 = 1
            r1.add(r5, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r6 = "R"
            java.lang.String r7 = "Repatriate"
            r2.<init>(r6, r7)
            r6 = 2
            r1.add(r6, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "T"
            java.lang.String r8 = "Refugees"
            r2.<init>(r7, r8)
            r7 = 3
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "X"
            java.lang.String r8 = "Ex-Servicemen"
            r2.<init>(r7, r8)
            r7 = 4
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "F"
            java.lang.String r8 = "Foreigners (Not Diplomats)"
            r2.<init>(r7, r8)
            r7 = 5
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "D"
            java.lang.String r8 = "Diplomats (Foreigner)"
            r2.<init>(r7, r8)
            r7 = 6
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "O"
            java.lang.String r8 = "OCI"
            r2.<init>(r7, r8)
            r7 = 7
            r1.add(r7, r2)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r2 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r7 = "P"
            java.lang.String r8 = "Differently Abled"
            r2.<init>(r7, r8)
            r7 = 8
            r1.add(r7, r2)
            oi.a r1 = new oi.a
            java.lang.Object r2 = r0.f20234e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r1.<init>(r11, r2)
            ni.h0 r2 = r11.J
            java.lang.String r7 = "binding"
            r8 = 0
            if (r2 != 0) goto L_0x00b6
            cm.l.v(r7)
            r2 = r8
        L_0x00b6:
            android.widget.Spinner r2 = r2.f26592u
            r2.setAdapter(r1)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r2 = r3
        L_0x00c4:
            if (r2 >= r1) goto L_0x0103
            ld.f r9 = r11.Z1()
            java.lang.String r9 = r9.a()
            java.lang.CharSequence r9 = km.q.B0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.Object r10 = r0.f20234e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r2)
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r10 = (com.nic.mparivahan.dlservices.data.model.AppCatPojo) r10
            java.lang.String r10 = r10.getAppCode()
            java.lang.CharSequence r10 = km.q.B0(r10)
            java.lang.String r10 = r10.toString()
            boolean r9 = cm.l.a(r9, r10)
            if (r9 == 0) goto L_0x0100
            ni.h0 r1 = r11.J
            if (r1 != 0) goto L_0x00fa
            cm.l.v(r7)
            r1 = r8
        L_0x00fa:
            android.widget.Spinner r1 = r1.f26592u
            r1.setSelection(r2)
            goto L_0x0103
        L_0x0100:
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x0103:
            ni.h0 r1 = r11.J
            if (r1 != 0) goto L_0x010b
            cm.l.v(r7)
            r1 = r8
        L_0x010b:
            android.widget.Spinner r1 = r1.f26592u
            com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName$a r2 = new com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName$a
            r2.<init>(r11, r0)
            r1.setOnItemSelectedListener(r2)
            java.lang.String r0 = r11.f21939w0
            java.lang.String r1 = "S"
            boolean r0 = km.p.p(r0, r1, r3, r6, r8)
            if (r0 == 0) goto L_0x012e
            ni.h0 r0 = r11.J
            if (r0 != 0) goto L_0x0127
        L_0x0123:
            cm.l.v(r7)
            goto L_0x0128
        L_0x0127:
            r8 = r0
        L_0x0128:
            android.widget.Spinner r0 = r8.f26592u
            r0.setEnabled(r5)
            goto L_0x0149
        L_0x012e:
            java.lang.String r0 = r11.f21932p0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013b
            ni.h0 r0 = r11.J
            if (r0 != 0) goto L_0x0127
            goto L_0x0123
        L_0x013b:
            ni.h0 r0 = r11.J
            if (r0 != 0) goto L_0x0143
            cm.l.v(r7)
            goto L_0x0144
        L_0x0143:
            r8 = r0
        L_0x0144:
            android.widget.Spinner r0 = r8.f26592u
            r0.setEnabled(r3)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.K1():void");
    }

    private final void a2() {
        int i10;
        String str;
        CustomWegetLayout customWegetLayout;
        ld.c cVar;
        String str2;
        String str3;
        this.L = (ek.a) new u0(this).a(ek.a.class);
        h0 h0Var = null;
        if (getIntent() != null) {
            try {
                this.R = String.valueOf(getIntent().getStringExtra("DL"));
                this.S = String.valueOf(getIntent().getStringExtra("dob"));
                this.T = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                v2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.U = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.W = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.V = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.X = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("state_value");
                l.d(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.Y = stringExtra5;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.f21917a0 = (HashMap) serializableExtra2;
                h0 h0Var2 = this.J;
                if (h0Var2 == null) {
                    l.v("binding");
                    h0Var2 = null;
                }
                h0Var2.f26574c.setText("DL No.: " + this.R);
            } catch (Exception unused) {
            }
            if (l.a(Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                try {
                    this.f21937u0 = getIntent().getIntExtra("serialNo", 0);
                    Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
                    l.d(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    A2((ArrayList) serializableExtra3);
                    Serializable serializableExtra4 = getIntent().getSerializableExtra("listHeaderSteps");
                    l.d(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    w2((ArrayList) serializableExtra4);
                    Serializable serializableExtra5 = getIntent().getSerializableExtra("COA");
                    l.d(serializableExtra5, "null cannot be cast to non-null type kotlin.Boolean");
                    this.f21935s0 = ((Boolean) serializableExtra5).booleanValue();
                    String stringExtra6 = getIntent().getStringExtra("metaflag");
                    l.d(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                    this.f21938v0 = stringExtra6;
                    this.f21939w0 = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                    this.f21940x0 = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                    x2(CombineServiceInterface.f8704a.a(this));
                    this.f21941y0 = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(U1()))).a(ab.d.class);
                    if (Build.VERSION.SDK_INT >= 30) {
                        WindowMetrics a10 = getWindowManager().getMaximumWindowMetrics();
                        l.e(a10, "getMaximumWindowMetrics(...)");
                        Rect a11 = a10.getBounds();
                        l.e(a11, "getBounds(...)");
                        i10 = a11.right;
                        this.f21936t0 = i10;
                        str = "Width";
                    } else {
                        i10 = getResources().getDisplayMetrics().widthPixels;
                        this.f21936t0 = i10;
                        str = "Width 1";
                    }
                    Log.d(str, String.valueOf(i10));
                    if (this.f21937u0 == X1().size()) {
                        h0 h0Var3 = this.J;
                        if (h0Var3 == null) {
                            l.v("binding");
                            h0Var3 = null;
                        }
                        h0Var3.f26597z.setVisibility(0);
                        h0 h0Var4 = this.J;
                        if (h0Var4 == null) {
                            l.v("binding");
                            h0Var4 = null;
                        }
                        h0Var4.f26573b.setVisibility(0);
                        h0 h0Var5 = this.J;
                        if (h0Var5 == null) {
                            l.v("binding");
                            h0Var5 = null;
                        }
                        customWegetLayout = h0Var5.f26579h;
                        cVar = this.K;
                        if (cVar == null) {
                            l.v("langSession");
                            cVar = null;
                        }
                        str2 = "vahan_btn_submit";
                        str3 = "Submit";
                    } else {
                        h0 h0Var6 = this.J;
                        if (h0Var6 == null) {
                            l.v("binding");
                            h0Var6 = null;
                        }
                        h0Var6.f26597z.setVisibility(8);
                        h0 h0Var7 = this.J;
                        if (h0Var7 == null) {
                            l.v("binding");
                            h0Var7 = null;
                        }
                        h0Var7.f26573b.setVisibility(8);
                        h0 h0Var8 = this.J;
                        if (h0Var8 == null) {
                            l.v("binding");
                            h0Var8 = null;
                        }
                        customWegetLayout = h0Var8.f26579h;
                        ld.c cVar2 = this.K;
                        if (cVar2 == null) {
                            l.v("langSession");
                            cVar2 = null;
                        }
                        str2 = "btn_dl_serv_next";
                        str3 = "Next";
                    }
                    customWegetLayout.setText(cVar.b(str2, str3));
                    if (l.a(Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE) && T1().size() > 1) {
                        h0 h0Var9 = this.J;
                        if (h0Var9 == null) {
                            l.v("binding");
                            h0Var9 = null;
                        }
                        h0Var9.f26586o.setLayoutManager(new LinearLayoutManager(this, 0, false));
                        ArrayList T1 = T1();
                        int i11 = this.f21937u0;
                        int i12 = this.f21936t0;
                        ld.c cVar3 = this.K;
                        if (cVar3 == null) {
                            l.v("langSession");
                            cVar3 = null;
                        }
                        String b10 = cVar3.b("change_name_dl", "Change of Name in DL");
                        l.c(b10);
                        bb.a aVar = new bb.a(T1, this, i11, i12, b10);
                        h0 h0Var10 = this.J;
                        if (h0Var10 == null) {
                            l.v("binding");
                            h0Var10 = null;
                        }
                        h0Var10.f26586o.setAdapter(aVar);
                    }
                } catch (Exception unused2) {
                }
            }
            if (l.a(Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                try {
                    if (T1().size() == 1) {
                        h0 h0Var11 = this.J;
                        if (h0Var11 == null) {
                            l.v("binding");
                            h0Var11 = null;
                        }
                        h0Var11.f26585n.f29580g.setText((CharSequence) T1().get(0));
                        h0 h0Var12 = this.J;
                        if (h0Var12 == null) {
                            l.v("binding");
                            h0Var12 = null;
                        }
                        h0Var12.f26585n.f29579f.setVisibility(8);
                    } else {
                        h0 h0Var13 = this.J;
                        if (h0Var13 == null) {
                            l.v("binding");
                            h0Var13 = null;
                        }
                        TextView textView = h0Var13.f26585n.f29580g;
                        ld.c cVar4 = this.K;
                        if (cVar4 == null) {
                            l.v("langSession");
                            cVar4 = null;
                        }
                        String b11 = cVar4.b("dl_services", getString(R.string.dl_services));
                        l.c(b11);
                        textView.setText(b11);
                        h0 h0Var14 = this.J;
                        if (h0Var14 == null) {
                            l.v("binding");
                            h0Var14 = null;
                        }
                        h0Var14.f26585n.f29579f.setVisibility(8);
                        h0 h0Var15 = this.J;
                        if (h0Var15 == null) {
                            l.v("binding");
                            h0Var15 = null;
                        }
                        TextView textView2 = h0Var15.f26585n.f29580g;
                        h0 h0Var16 = this.J;
                        if (h0Var16 == null) {
                            l.v("binding");
                            h0Var16 = null;
                        }
                        textView2.setPaintFlags(h0Var16.f26585n.f29580g.getPaintFlags() | 8);
                    }
                } catch (Exception unused3) {
                }
            } else {
                h0 h0Var17 = this.J;
                if (h0Var17 == null) {
                    l.v("binding");
                    h0Var17 = null;
                }
                h0Var17.f26585n.f29580g.setText(Z1().i());
                h0 h0Var18 = this.J;
                if (h0Var18 == null) {
                    l.v("binding");
                    h0Var18 = null;
                }
                h0Var18.f26585n.f29579f.setVisibility(8);
            }
        }
        this.M = (pj.b) new u0(this).a(pj.b.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            ek.a aVar2 = this.L;
            if (aVar2 == null) {
                l.v("viewModel");
                aVar2 = null;
            }
            aVar2.n("526");
        } else {
            Context applicationContext = getApplicationContext();
            ld.c cVar5 = this.K;
            if (cVar5 == null) {
                l.v("langSession");
                cVar5 = null;
            }
            Toast.makeText(applicationContext, cVar5.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        h0 h0Var19 = this.J;
        if (h0Var19 == null) {
            l.v("binding");
            h0Var19 = null;
        }
        h0Var19.f26577f.setOnClickListener(new ij.f(this));
        h0 h0Var20 = this.J;
        if (h0Var20 == null) {
            l.v("binding");
            h0Var20 = null;
        }
        h0Var20.f26579h.setOnClickListener(new ij.g(this));
        h0 h0Var21 = this.J;
        if (h0Var21 == null) {
            l.v("binding");
            h0Var21 = null;
        }
        h0Var21.f26588q.setOnClickListener(new ij.h(this));
        u uVar = new u();
        ArrayList arrayList = new ArrayList();
        uVar.f20234e = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) uVar.f20234e).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) uVar.f20234e).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) uVar.f20234e).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) uVar.f20234e).add(3, new SpinnerPojo("G", "Guardian Name"));
        r9.a aVar3 = new r9.a(this, (ArrayList) uVar.f20234e);
        h0 h0Var22 = this.J;
        if (h0Var22 == null) {
            l.v("binding");
            h0Var22 = null;
        }
        h0Var22.f26593v.setAdapter(aVar3);
        h0 h0Var23 = this.J;
        if (h0Var23 == null) {
            l.v("binding");
            h0Var23 = null;
        }
        h0Var23.f26593v.setOnItemSelectedListener(new b(this, uVar));
        h0 h0Var24 = this.J;
        if (h0Var24 == null) {
            l.v("binding");
            h0Var24 = null;
        }
        h0Var24.J.setOnClickListener(new ij.i());
        h0 h0Var25 = this.J;
        if (h0Var25 == null) {
            l.v("binding");
            h0Var25 = null;
        }
        h0Var25.f26585n.f29581h.setOnClickListener(new ij.j(this));
        h0 h0Var26 = this.J;
        if (h0Var26 == null) {
            l.v("binding");
            h0Var26 = null;
        }
        h0Var26.f26585n.f29580g.setOnClickListener(new k(this));
        h0 h0Var27 = this.J;
        if (h0Var27 == null) {
            l.v("binding");
            h0Var27 = null;
        }
        h0Var27.f26585n.f29578e.setVisibility(8);
        h0 h0Var28 = this.J;
        if (h0Var28 == null) {
            l.v("binding");
            h0Var28 = null;
        }
        h0Var28.f26583l.f25961g.setText(Z1().i());
        h0 h0Var29 = this.J;
        if (h0Var29 == null) {
            l.v("binding");
            h0Var29 = null;
        }
        h0Var29.J.setVisibility(0);
        h0 h0Var30 = this.J;
        if (h0Var30 == null) {
            l.v("binding");
        } else {
            h0Var = h0Var30;
        }
        h0Var.f26574c.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void b2(ChangeOfName changeOfName, View view) {
        l.f(changeOfName, "this$0");
        if (l.a(changeOfName.Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (changeOfName.T1().size() > 1) {
                    Dialog dialog = new Dialog(changeOfName);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    l.c(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View findViewById = dialog.findViewById(R.id.service_label_cross);
                    l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) findViewById;
                    View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                    l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById2;
                    View findViewById3 = dialog.findViewById(R.id.service_label_list);
                    l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) findViewById4;
                    View findViewById5 = dialog.findViewById(R.id.dl_services);
                    l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView4 = (TextView) findViewById5;
                    ld.c cVar = changeOfName.K;
                    ld.c cVar2 = null;
                    if (cVar == null) {
                        l.v("langSession");
                        cVar = null;
                    }
                    textView.setText(cVar.b("btn_ok", "OK"));
                    ld.c cVar3 = changeOfName.K;
                    if (cVar3 == null) {
                        l.v("langSession");
                    } else {
                        cVar2 = cVar3;
                    }
                    textView4.setText(cVar2.b("title_dl_services", "Driving Licence Services"));
                    imageView.setOnClickListener(new ij.c(dialog));
                    int size = changeOfName.T1().size();
                    String str = "";
                    int i10 = 0;
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) changeOfName.T1().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
                    textView.setOnClickListener(new ij.d(dialog));
                    Window window2 = dialog.getWindow();
                    l.c(window2);
                    window2.setGravity(48);
                    window2.setLayout(-2, -2);
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void d2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e2(ChangeOfName changeOfName, View view) {
        l.f(changeOfName, "this$0");
        changeOfName.q2();
    }

    /* access modifiers changed from: private */
    public static final void f2(ChangeOfName changeOfName, View view) {
        ek.a aVar;
        ChangeOfName changeOfName2 = changeOfName;
        l.f(changeOfName2, "this$0");
        if (!changeOfName.k2()) {
            return;
        }
        if (l.a(changeOfName.Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            changeOfName.s2();
            return;
        }
        h0 h0Var = changeOfName2.J;
        h0 h0Var2 = null;
        if (h0Var == null) {
            l.v("binding");
            h0Var = null;
        }
        h0Var.f26579h.c(true);
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        l.e(format, "format(...)");
        ek.a aVar2 = changeOfName2.L;
        if (aVar2 == null) {
            l.v("viewModel");
            aVar = null;
        } else {
            aVar = aVar2;
        }
        String str = changeOfName2.f21932p0;
        String str2 = changeOfName2.R;
        String str3 = changeOfName2.S;
        String str4 = changeOfName2.W;
        String Y1 = changeOfName.Y1();
        int i10 = changeOfName2.f21920d0;
        String str5 = changeOfName2.f21921e0;
        h0 h0Var3 = changeOfName2.J;
        if (h0Var3 == null) {
            l.v("binding");
            h0Var3 = null;
        }
        String obj = h0Var3.D.getText().toString();
        h0 h0Var4 = changeOfName2.J;
        if (h0Var4 == null) {
            l.v("binding");
            h0Var4 = null;
        }
        String obj2 = h0Var4.f26576e.getText().toString();
        h0 h0Var5 = changeOfName2.J;
        if (h0Var5 == null) {
            l.v("binding");
            h0Var5 = null;
        }
        String obj3 = h0Var5.f26580i.getText().toString();
        h0 h0Var6 = changeOfName2.J;
        if (h0Var6 == null) {
            l.v("binding");
            h0Var6 = null;
        }
        String obj4 = h0Var6.f26589r.getText().toString();
        h0 h0Var7 = changeOfName2.J;
        if (h0Var7 == null) {
            l.v("binding");
        } else {
            h0Var2 = h0Var7;
        }
        String obj5 = h0Var2.f26590s.getText().toString();
        String str6 = changeOfName2.T;
        l.c(str6);
        aVar.g(str, "", str2, str3, str4, "N", Y1, i10, str5, obj, format, obj2, obj3, obj4, obj5, str6, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", changeOfName.Z1().f(), changeOfName.Z1().g(), changeOfName.Z1().e(), changeOfName.Z1().h());
    }

    /* access modifiers changed from: private */
    public static final void g2(ChangeOfName changeOfName, View view) {
        l.f(changeOfName, "this$0");
        changeOfName.finish();
    }

    /* access modifiers changed from: private */
    public static final void h2(View view) {
    }

    /* access modifiers changed from: private */
    public static final void i2(ChangeOfName changeOfName, View view) {
        l.f(changeOfName, "this$0");
        try {
            Intent intent = new Intent(changeOfName, DlServiceDetailsActivity.class);
            intent.putExtra("DL", changeOfName.R);
            intent.putExtra("dob", changeOfName.S);
            intent.putExtra("DLDetails", changeOfName.M1());
            intent.putExtra("Mobile_no", changeOfName.T);
            intent.putExtra("lastEndorsedRTO", changeOfName.U);
            intent.putExtra("lastEndorsedState", changeOfName.V);
            intent.putExtra("lastEndorsedRTOCode", changeOfName.W);
            intent.putExtra("lastEndorseStateCode", changeOfName.X);
            intent.putExtra("whatServiceRequired", changeOfName.f21917a0);
            if (l.a(changeOfName.Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", changeOfName.X1());
            }
            changeOfName.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void j2(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.R);
            intent.putExtra("dob", this.S);
            intent.putExtra("DLDetails", M1());
            intent.putExtra("Mobile_no", this.T);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.W);
            intent.putExtra("lastEndorseStateCode", this.X);
            intent.putExtra("whatServiceRequired", this.f21917a0);
            intent.putExtra("state_value", this.Y);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.f21938v0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("listHeaderSteps", T1());
            intent.putExtra("serialNo", this.f21937u0 + 1);
            intent.putExtra("COA", this.f21935s0);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean k2() {
        h0 h0Var = this.J;
        ld.c cVar = null;
        if (h0Var == null) {
            l.v("binding");
            h0Var = null;
        }
        MyTextView myTextView = h0Var.f26597z;
        l.e(myTextView, "txtAppCategory");
        if (myTextView.getVisibility() == 0 && l.a(this.f21932p0, "0")) {
            r2(getString(R.string.sel_app_category));
            return false;
        } else if (this.f21920d0 == 0) {
            ld.c cVar2 = this.K;
            if (cVar2 == null) {
                l.v("langSession");
            } else {
                cVar = cVar2;
            }
            Toast.makeText(this, cVar.b("label_select_reason", getString(R.string.sel_rsn)), 1).show();
            return false;
        } else {
            h0 h0Var2 = this.J;
            if (h0Var2 == null) {
                l.v("binding");
                h0Var2 = null;
            }
            LinearLayout linearLayout = h0Var2.f26578g;
            l.e(linearLayout, "idDupdl");
            if (linearLayout.getVisibility() == 0) {
                h0 h0Var3 = this.J;
                if (h0Var3 == null) {
                    l.v("binding");
                    h0Var3 = null;
                }
                if (h0Var3.f26575d.getText().length() < 3) {
                    ld.c cVar3 = this.K;
                    if (cVar3 == null) {
                        l.v("langSession");
                    } else {
                        cVar = cVar3;
                    }
                    Toast.makeText(this, cVar.b("label_dl_serv_enter_reas_manul", getString(R.string.enter_Reason)), 0).show();
                    return false;
                }
            }
            h0 h0Var4 = this.J;
            if (h0Var4 == null) {
                l.v("binding");
                h0Var4 = null;
            }
            Editable text = h0Var4.f26576e.getText();
            l.e(text, "getText(...)");
            if (text.length() == 0) {
                ld.c cVar4 = this.K;
                if (cVar4 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar4;
                }
                Toast.makeText(this, cVar.b("PLEASE_ENTER_FIRST_NAME", getString(R.string.enter_first_name)), 0).show();
                return false;
            }
            h0 h0Var5 = this.J;
            if (h0Var5 == null) {
                l.v("binding");
                h0Var5 = null;
            }
            if (h0Var5.f26576e.getText().length() < 3) {
                ld.c cVar5 = this.K;
                if (cVar5 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar5;
                }
                Toast.makeText(this, cVar.b("enter_valid_3_first_name", getString(R.string.enter_valid_3_first_name)), 0).show();
                return false;
            }
            h0 h0Var6 = this.J;
            if (h0Var6 == null) {
                l.v("binding");
                h0Var6 = null;
            }
            Editable text2 = h0Var6.f26580i.getText();
            l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                ld.c cVar6 = this.K;
                if (cVar6 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar6;
                }
                Toast.makeText(this, cVar.b("PLEASE_ENTER_LAST_NAME", getString(R.string.enter_last_name)), 0).show();
                return false;
            }
            h0 h0Var7 = this.J;
            if (h0Var7 == null) {
                l.v("binding");
                h0Var7 = null;
            }
            if (h0Var7.f26580i.getText().length() < 3) {
                ld.c cVar7 = this.K;
                if (cVar7 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar7;
                }
                Toast.makeText(this, cVar.b("enter_valid_3_last_name", getString(R.string.enter_valid_3_last_name)), 0).show();
                return false;
            }
            h0 h0Var8 = this.J;
            if (h0Var8 == null) {
                l.v("binding");
                h0Var8 = null;
            }
            Editable text3 = h0Var8.D.getText();
            l.e(text3, "getText(...)");
            if (text3.length() == 0) {
                ld.c cVar8 = this.K;
                if (cVar8 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar8;
                }
                Toast.makeText(this, cVar.b("PLEASE_ENTER_FULL_NAME", getString(R.string.enter_full_name)), 0).show();
                return false;
            }
            h0 h0Var9 = this.J;
            if (h0Var9 == null) {
                l.v("binding");
                h0Var9 = null;
            }
            if (h0Var9.D.getText().length() < 3) {
                ld.c cVar9 = this.K;
                if (cVar9 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar9;
                }
                Toast.makeText(this, cVar.b("enter_valid_3_full_name", getString(R.string.enter_valid_3_full_name)), 0).show();
                return false;
            } else if (l.a(Y1(), "0")) {
                ld.c cVar10 = this.K;
                if (cVar10 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar10;
                }
                Toast.makeText(this, cVar.b("PLEASE_SELECT_RELATION", getString(R.string.select_relation)), 1).show();
                return false;
            } else {
                h0 h0Var10 = this.J;
                if (h0Var10 == null) {
                    l.v("binding");
                    h0Var10 = null;
                }
                Editable text4 = h0Var10.f26589r.getText();
                l.e(text4, "getText(...)");
                if (text4.length() == 0) {
                    ld.c cVar11 = this.K;
                    if (cVar11 == null) {
                        l.v("langSession");
                    } else {
                        cVar = cVar11;
                    }
                    Toast.makeText(this, cVar.b("PLEASE_ENTER_REL_FIRST_NAME", getString(R.string.rel_first_name)), 0).show();
                    return false;
                }
                h0 h0Var11 = this.J;
                if (h0Var11 == null) {
                    l.v("binding");
                    h0Var11 = null;
                }
                if (h0Var11.f26589r.getText().length() < 3) {
                    ld.c cVar12 = this.K;
                    if (cVar12 == null) {
                        l.v("langSession");
                    } else {
                        cVar = cVar12;
                    }
                    Toast.makeText(this, cVar.b("enter_valid_rel_3_first_name", getString(R.string.enter_valid_rel_3_first_name)), 0).show();
                    return false;
                }
                h0 h0Var12 = this.J;
                if (h0Var12 == null) {
                    l.v("binding");
                    h0Var12 = null;
                }
                Editable text5 = h0Var12.f26590s.getText();
                l.e(text5, "getText(...)");
                if (text5.length() == 0) {
                    ld.c cVar13 = this.K;
                    if (cVar13 == null) {
                        l.v("langSession");
                    } else {
                        cVar = cVar13;
                    }
                    Toast.makeText(this, cVar.b("PLEASE_ENTER_REL_LAST_NAME", getString(R.string.rel_last_name)), 0).show();
                    return false;
                }
                h0 h0Var13 = this.J;
                if (h0Var13 == null) {
                    l.v("binding");
                    h0Var13 = null;
                }
                if (h0Var13.f26590s.getText().length() >= 3) {
                    return true;
                }
                ld.c cVar14 = this.K;
                if (cVar14 == null) {
                    l.v("langSession");
                } else {
                    cVar = cVar14;
                }
                Toast.makeText(this, cVar.b("enter_valid_rel_3_last_name", getString(R.string.enter_valid_rel_3_last_name)), 0).show();
                return false;
            }
        }
    }

    private final void l2() {
        ab.d dVar = this.f21941y0;
        ab.d dVar2 = null;
        if (dVar == null) {
            l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new ij.l(this));
        ab.d dVar3 = this.f21941y0;
        if (dVar3 == null) {
            l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new ij.m(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2(com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName r28, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r29) {
        /*
            r15 = r28
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r19 = "langSession"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.h0 r0 = r15.J
            java.lang.String r20 = "binding"
            r13 = 0
            if (r0 != 0) goto L_0x0016
            cm.l.v(r20)
            r0 = r13
        L_0x0016:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f26579h
            r12 = 0
            r0.c(r12)
            r11 = 2132019337(0x7f140889, float:1.9677006E38)
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r1 = r11
            r26 = r13
            r3 = r14
            r13 = r15
            goto L_0x02e1
        L_0x0031:
            r0 = r13
        L_0x0032:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0296
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0290 }
            if (r0 == 0) goto L_0x0304
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0290 }
            if (r0 == 0) goto L_0x0304
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x0290 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0290 }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0304
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r21 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x0290 }
            r21.<init>()     // Catch:{ Exception -> 0x0290 }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0290 }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x0290 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x0290 }
            r22 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r22 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r22     // Catch:{ Exception -> 0x0290 }
            if (r22 == 0) goto L_0x0304
            java.lang.String r0 = ""
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0076
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0076:
            java.lang.String r3 = "check_dl_serv_dupl_dl"
            java.lang.String r4 = "Issue of Duplicate DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0095
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "513,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0095:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00a1
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00a1:
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "514,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x00c0:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00cc
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00cc:
            java.lang.String r3 = "revalidtion_expired_dl"
            java.lang.String r4 = "Re-Validation of Expired DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x00eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "537,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x00eb:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x00f7
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x00f7:
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0116
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "515,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0116:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0122
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0122:
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0141
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "516,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0141:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x014d
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x014d:
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x016c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "523,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x016c:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x0178
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x0178:
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "524,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x0197:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x01a3
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x01a3:
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x01c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "526,"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x01c2:
            java.util.ArrayList r1 = r28.X1()     // Catch:{ Exception -> 0x0290 }
            ld.c r2 = r15.K     // Catch:{ Exception -> 0x0290 }
            if (r2 != 0) goto L_0x01ce
            cm.l.v(r19)     // Catch:{ Exception -> 0x002a }
            r2 = r13
        L_0x01ce:
            java.lang.String r3 = "change_birth_dl"
            java.lang.String r4 = "Change of Date of Birth in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0290 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0290 }
            if (r1 == 0) goto L_0x01ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r1.<init>()     // Catch:{ Exception -> 0x002a }
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "548"
            r1.append(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x002a }
        L_0x01ed:
            r16 = r0
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0257 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r22.getApplicationDate()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = r22.getApplicationNo()     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0257 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0257 }
            ld.g r0 = r28.V1()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0257 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0257 }
            java.lang.String r9 = r22.getDateofBirth()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r10 = r22.getDlno()     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0257 }
            java.lang.String r0 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r22.getApplicantGender()     // Catch:{ Exception -> 0x0257 }
            java.lang.String r2 = r15.T     // Catch:{ Exception -> 0x0257 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0257 }
            r23 = 0
            r24 = r14
            java.lang.String r14 = r15.W     // Catch:{ Exception -> 0x0251 }
            r29 = r14
            java.lang.String r14 = r15.X     // Catch:{ Exception -> 0x0251 }
            r25 = r2
            r2 = r28
            r11 = r0
            r12 = r17
            r26 = r13
            r13 = r18
            r0 = r29
            r18 = r14
            r27 = r24
            r14 = r25
            r15 = r23
            r17 = r0
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x024f }
        L_0x024c:
            r13 = r28
            goto L_0x0266
        L_0x024f:
            r0 = move-exception
            goto L_0x025c
        L_0x0251:
            r0 = move-exception
            r26 = r13
            r27 = r24
            goto L_0x025c
        L_0x0257:
            r0 = move-exception
            r26 = r13
            r27 = r14
        L_0x025c:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x028d }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x028d }
            goto L_0x024c
        L_0x0266:
            java.lang.String r4 = r13.W     // Catch:{ Exception -> 0x0287 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r28.M1()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r6 = r13.R     // Catch:{ Exception -> 0x0287 }
            java.lang.String r7 = r13.S     // Catch:{ Exception -> 0x0287 }
            java.lang.String r8 = r13.T     // Catch:{ Exception -> 0x0287 }
            java.lang.String r9 = r13.U     // Catch:{ Exception -> 0x0287 }
            java.lang.String r10 = r13.V     // Catch:{ Exception -> 0x0287 }
            java.lang.String r11 = r13.X     // Catch:{ Exception -> 0x0287 }
            java.util.ArrayList r12 = r28.T1()     // Catch:{ Exception -> 0x0287 }
            r1 = r21
            r2 = r28
            r3 = r22
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0304
        L_0x0287:
            r3 = r27
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02e1
        L_0x028d:
            r13 = r28
            goto L_0x0287
        L_0x0290:
            r26 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02e1
        L_0x0296:
            r26 = r13
            r27 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0287 }
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0287 }
            goto L_0x02a8
        L_0x02a6:
            r0 = r26
        L_0x02a8:
            if (r0 == 0) goto L_0x02c5
            int r0 = r0.length()     // Catch:{ Exception -> 0x0287 }
            if (r0 != 0) goto L_0x02b1
            goto L_0x02c5
        L_0x02b1:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r29.getDlSubmitresult()     // Catch:{ Exception -> 0x0287 }
            if (r0 == 0) goto L_0x02bc
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0287 }
            goto L_0x02be
        L_0x02bc:
            r0 = r26
        L_0x02be:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0287 }
            r13.r2(r0)     // Catch:{ Exception -> 0x0287 }
            goto L_0x0304
        L_0x02c5:
            ld.c r0 = r13.K     // Catch:{ Exception -> 0x0287 }
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r19)     // Catch:{ Exception -> 0x0287 }
            r0 = r26
        L_0x02ce:
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02df }
            r3 = r27
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02e1 }
            r13.r2(r0)     // Catch:{ Exception -> 0x02e1 }
            goto L_0x0304
        L_0x02df:
            r3 = r27
        L_0x02e1:
            ni.h0 r0 = r13.J
            if (r0 != 0) goto L_0x02ea
            cm.l.v(r20)
            r0 = r26
        L_0x02ea:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f26579h
            r2 = 0
            r0.c(r2)
            ld.c r0 = r13.K
            if (r0 != 0) goto L_0x02f9
            cm.l.v(r19)
            r0 = r26
        L_0x02f9:
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.r2(r0)
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.m2(com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void n2(ChangeOfName changeOfName, String str) {
        l.f(changeOfName, "this$0");
        h0 h0Var = changeOfName.J;
        ld.c cVar = null;
        if (h0Var == null) {
            l.v("binding");
            h0Var = null;
        }
        h0Var.f26579h.c(false);
        ld.c cVar2 = changeOfName.K;
        if (cVar2 == null) {
            l.v("langSession");
        } else {
            cVar = cVar2;
        }
        changeOfName.r2(cVar.b("service_is_not_present", changeOfName.getString(R.string.unable_to_get_details)));
    }

    private final void o2() {
        ek.a aVar = this.L;
        ek.a aVar2 = null;
        if (aVar == null) {
            l.v("viewModel");
            aVar = null;
        }
        aVar.m().g(this, new j(new c(this)));
        ek.a aVar3 = this.L;
        if (aVar3 == null) {
            l.v("viewModel");
        } else {
            aVar2 = aVar3;
        }
        aVar2.j().g(this, new j(new d(this)));
    }

    /* access modifiers changed from: private */
    public static final void p2(ChangeOfName changeOfName, View view) {
        l.f(changeOfName, "this$0");
        changeOfName.finish();
    }

    private final void q2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.N;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new h(this));
    }

    private final void s2() {
        ld.c cVar;
        ab.d dVar;
        h0 h0Var;
        ld.c cVar2;
        Intent intent;
        String str;
        String str2;
        String str3;
        Class<CombineReq> cls = CombineReq.class;
        if (X1().size() > this.f21937u0) {
            try {
                CombineReq combineReq = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), cls);
                CombineReq combineReq2 = new CombineReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 1023, (cm.g) null);
                combineReq2.setPofbirth(combineReq.getPofbirth());
                combineReq2.setCountry(combineReq.getCountry());
                combineReq2.setPassno(combineReq.getPassno());
                combineReq2.setPassvaltill(combineReq.getPassvaltill());
                combineReq2.setVisano(combineReq.getVisano());
                combineReq2.setVisavaltill(combineReq.getVisavaltill());
                combineReq2.setTovisit(combineReq.getTovisit());
                combineReq2.setIscountryrestricted(combineReq.getIscountryrestricted());
                combineReq2.setCountryRestrictedReason(combineReq.getCountryRestrictedReason());
                combineReq2.setDlSerdisqualified(combineReq.isDlSerdisqualified());
                combineReq2.setDlSerdisqualifiedReason(combineReq.getDlSerdisqualifiedReason());
                combineReq2.setForAdd1(combineReq.getForAdd1());
                combineReq2.setForAdd2(combineReq.getForAdd2());
                combineReq2.setForAdd3(combineReq.getForAdd3());
                combineReq2.setForAddPinCode(combineReq.getForAddPinCode());
                combineReq2.setForNationMobNum(combineReq.getForNationMobNum());
                combineReq2.setEmailID(combineReq.getEmailID());
                combineReq2.setAppliedIdpfromIndEmb(combineReq.getAppliedIdpfromIndEmb());
                combineReq2.setIndEmbName(combineReq.getIndEmbName());
                combineReq2.setEmbPlace(combineReq.getEmbPlace());
                combineReq2.setDateOfVerifEmb(combineReq.getDateOfVerifEmb());
                combineReq2.setEmbEndorseNo(combineReq.getEmbEndorseNo());
                combineReq2.setIdpcountryapplyfrom(combineReq.getIdpcountryapplyfrom());
                combineReq2.setDupDlReasonName(combineReq.getDupDlReasonName());
                combineReq2.setDupDlReasonCode(combineReq.getDupDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDlHolderAltMobMum(combineReq.getDlHolderAltMobMum());
                combineReq2.setWilltoDonateOrgans(combineReq.getWilltoDonateOrgans());
                combineReq2.setMobileNumber(combineReq.getMobileNumber());
                combineReq2.setChangeOfAddReq(combineReq.getChangeOfAddReq());
                combineReq2.setPerHouseNo(combineReq.getPerHouseNo());
                combineReq2.setPerStreet(combineReq.getPerStreet());
                combineReq2.setPerLocation(combineReq.getPerLocation());
                combineReq2.setPermVillageOrTown(combineReq.getPermVillageOrTown());
                combineReq2.setPerSubDistrict(combineReq.getPerSubDistrict());
                combineReq2.setPerDistrict(combineReq.getPerDistrict());
                combineReq2.setPerState(combineReq.getPerState());
                combineReq2.setPerPinCode(combineReq.getPerPinCode());
                combineReq2.setPresHouseNo(combineReq.getPresHouseNo());
                combineReq2.setPresStreet(combineReq.getPresStreet());
                combineReq2.setPresLocation(combineReq.getPresLocation());
                combineReq2.setPresVillageOrTown(combineReq.getPresVillageOrTown());
                combineReq2.setPresSubDistrict(combineReq.getPresSubDistrict());
                combineReq2.setPresDistrict(combineReq.getPresDistrict());
                combineReq2.setPresState(combineReq.getPresState());
                combineReq2.setPresPincode(combineReq.getPresPincode());
                combineReq2.setApplDateOfBirth(combineReq.getApplDateOfBirth());
                combineReq2.setCodobDlReasonCode(combineReq.getCodobDlReasonCode());
                combineReq2.setCodobDlReasonName(combineReq.getCodobDlReasonName());
                combineReq2.setDeclaringcheck(combineReq.getDeclaringcheck());
                combineReq2.setHillcertificate(combineReq.getHillcertificate());
                combineReq2.setHillissueDate(combineReq.getHillissueDate());
                combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                combineReq2.setHillissby(combineReq.getHillissby());
                h0 h0Var2 = this.J;
                if (h0Var2 == null) {
                    l.v("binding");
                    h0Var2 = null;
                }
                combineReq2.setApplFirstName(h0Var2.f26576e.getText().toString());
                h0 h0Var3 = this.J;
                if (h0Var3 == null) {
                    l.v("binding");
                    h0Var3 = null;
                }
                combineReq2.setApplLastName(h0Var3.f26580i.getText().toString());
                h0 h0Var4 = this.J;
                if (h0Var4 == null) {
                    l.v("binding");
                    h0Var4 = null;
                }
                combineReq2.setRelFirstName(h0Var4.f26589r.getText().toString());
                h0 h0Var5 = this.J;
                if (h0Var5 == null) {
                    l.v("binding");
                    h0Var5 = null;
                }
                combineReq2.setRelLastName(h0Var5.f26590s.getText().toString());
                combineReq2.setConEffdate(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date()));
                combineReq2.setConDlReasonCode(Integer.valueOf(this.f21920d0));
                combineReq2.setRelationType(Y1());
                h0 h0Var6 = this.J;
                if (h0Var6 == null) {
                    l.v("binding");
                    h0Var6 = null;
                }
                combineReq2.setDlHolderNaturalName(h0Var6.D.getText().toString());
                combineReq2.setConDlReasonName(this.f21921e0);
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                edit.putString("MultiService", new i7.d().t(combineReq2));
                edit.commit();
                Object obj = X1().get(this.f21937u0);
                ld.c cVar3 = this.K;
                if (cVar3 == null) {
                    l.v("langSession");
                    cVar3 = null;
                }
                if (l.a(obj, cVar3.b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, DLDuplicateActivity.class));
                    intent = getIntent();
                    l.e(intent, "getIntent(...)");
                    str = this.W;
                    str2 = this.V;
                    str3 = "513";
                } else {
                    Object obj2 = X1().get(this.f21937u0);
                    ld.c cVar4 = this.K;
                    if (cVar4 == null) {
                        l.v("langSession");
                        cVar4 = null;
                    }
                    boolean a10 = l.a(obj2, cVar4.b("check_dl_serv_renewal_dl", "Renewal of DL"));
                    Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                    if (a10) {
                        setIntent(new Intent(this, cls2));
                        intent = getIntent();
                        l.e(intent, "getIntent(...)");
                        str = this.W;
                        str2 = this.V;
                        str3 = "514";
                    } else {
                        Object obj3 = X1().get(this.f21937u0);
                        ld.c cVar5 = this.K;
                        if (cVar5 == null) {
                            l.v("langSession");
                            cVar5 = null;
                        }
                        if (l.a(obj3, cVar5.b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                            setIntent(new Intent(this, cls2));
                            intent = getIntent();
                            l.e(intent, "getIntent(...)");
                            str = this.W;
                            str2 = this.V;
                            str3 = "537";
                        } else {
                            Object obj4 = X1().get(this.f21937u0);
                            ld.c cVar6 = this.K;
                            if (cVar6 == null) {
                                l.v("langSession");
                                cVar6 = null;
                            }
                            if (l.a(obj4, cVar6.b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                setIntent(new Intent(this, ChangeOfAddressActivity.class));
                                intent = getIntent();
                                l.e(intent, "getIntent(...)");
                                str = this.W;
                                str2 = this.V;
                                str3 = "515";
                            } else {
                                Object obj5 = X1().get(this.f21937u0);
                                ld.c cVar7 = this.K;
                                if (cVar7 == null) {
                                    l.v("langSession");
                                    cVar7 = null;
                                }
                                if (l.a(obj5, cVar7.b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                    setIntent(new Intent(this, DLReplecementActivity.class));
                                    intent = getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = this.W;
                                    str2 = this.V;
                                    str3 = "516";
                                } else {
                                    Object obj6 = X1().get(this.f21937u0);
                                    ld.c cVar8 = this.K;
                                    if (cVar8 == null) {
                                        l.v("langSession");
                                        cVar8 = null;
                                    }
                                    if (l.a(obj6, cVar8.b("check_dl_serv_extract_dl", "DL Extract"))) {
                                        setIntent(new Intent(this, DLExtractActivity.class));
                                        intent = getIntent();
                                        l.e(intent, "getIntent(...)");
                                        str = this.W;
                                        str2 = this.V;
                                        str3 = "523";
                                    } else {
                                        Object obj7 = X1().get(this.f21937u0);
                                        ld.c cVar9 = this.K;
                                        if (cVar9 == null) {
                                            l.v("langSession");
                                            cVar9 = null;
                                        }
                                        if (l.a(obj7, cVar9.b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                            setIntent(new Intent(this, HillReligion.class));
                                            intent = getIntent();
                                            l.e(intent, "getIntent(...)");
                                            str = this.W;
                                            str2 = this.V;
                                            str3 = "524";
                                        } else {
                                            Object obj8 = X1().get(this.f21937u0);
                                            ld.c cVar10 = this.K;
                                            if (cVar10 == null) {
                                                l.v("langSession");
                                                cVar10 = null;
                                            }
                                            if (l.a(obj8, cVar10.b("change_name_dl", "Change of Name in DL"))) {
                                                setIntent(new Intent(this, ChangeOfName.class));
                                                intent = getIntent();
                                                l.e(intent, "getIntent(...)");
                                                str = this.W;
                                                str2 = this.V;
                                                str3 = "526";
                                            } else {
                                                Object obj9 = X1().get(this.f21937u0);
                                                ld.c cVar11 = this.K;
                                                if (cVar11 == null) {
                                                    l.v("langSession");
                                                    cVar2 = null;
                                                } else {
                                                    cVar2 = cVar11;
                                                }
                                                if (l.a(obj9, cVar2.b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                                    setIntent(new Intent(this, DobChangeActivity.class));
                                                    intent = getIntent();
                                                    l.e(intent, "getIntent(...)");
                                                    str = this.W;
                                                    str2 = this.V;
                                                    str3 = "548";
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                j2(intent, str, str2, str3, X1());
            } catch (Exception unused) {
            }
        } else {
            h0 h0Var7 = this.J;
            if (h0Var7 == null) {
                l.v("binding");
                h0Var7 = null;
            }
            h0Var7.f26579h.c(true);
            CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), cls);
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                h0 h0Var8 = this.J;
                if (h0Var8 == null) {
                    l.v("binding");
                    h0Var8 = null;
                }
                h0Var8.f26579h.c(true);
                ArrayList arrayList = new ArrayList();
                int size = M1().getDlcovs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(String.valueOf(M1().getDlcovs().get(i10).getDcCovcd()));
                }
                ab.d dVar2 = this.f21941y0;
                if (dVar2 == null) {
                    l.v("mCombineViewModel");
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                boolean z10 = this.f21935s0;
                String str4 = this.f21939w0;
                l.c(str4);
                String str5 = this.f21940x0;
                l.c(str5);
                ArrayList X1 = X1();
                String applcatgDLserReq = combineReq3.getApplcatgDLserReq();
                l.c(applcatgDLserReq);
                String dlHolderAltMobMum = combineReq3.getDlHolderAltMobMum();
                l.c(dlHolderAltMobMum);
                String str6 = this.R;
                l.c(str6);
                String str7 = this.S;
                l.c(str7);
                String str8 = this.W;
                String willtoDonateOrgans = combineReq3.getWilltoDonateOrgans();
                l.c(willtoDonateOrgans);
                String Y1 = Y1();
                String valueOf = String.valueOf(this.f21920d0);
                String str9 = this.f21921e0;
                h0 h0Var9 = this.J;
                if (h0Var9 == null) {
                    l.v("binding");
                    h0Var9 = null;
                }
                String obj10 = h0Var9.D.getText().toString();
                String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                l.e(format, "format(...)");
                h0 h0Var10 = this.J;
                if (h0Var10 == null) {
                    l.v("binding");
                    h0Var10 = null;
                }
                String obj11 = h0Var10.f26576e.getText().toString();
                h0 h0Var11 = this.J;
                if (h0Var11 == null) {
                    l.v("binding");
                    h0Var11 = null;
                }
                String obj12 = h0Var11.f26580i.getText().toString();
                h0 h0Var12 = this.J;
                if (h0Var12 == null) {
                    l.v("binding");
                    h0Var12 = null;
                }
                String obj13 = h0Var12.f26589r.getText().toString();
                h0 h0Var13 = this.J;
                if (h0Var13 == null) {
                    l.v("binding");
                    h0Var = null;
                } else {
                    h0Var = h0Var13;
                }
                String obj14 = h0Var.f26590s.getText().toString();
                String str10 = this.T;
                l.c(str10);
                String changeOfAddReq = combineReq3.getChangeOfAddReq();
                l.c(changeOfAddReq);
                String perHouseNo = combineReq3.getPerHouseNo();
                l.c(perHouseNo);
                String perStreet = combineReq3.getPerStreet();
                l.c(perStreet);
                String perLocation = combineReq3.getPerLocation();
                l.c(perLocation);
                String permVillageOrTown = combineReq3.getPermVillageOrTown();
                l.c(permVillageOrTown);
                String perSubDistrict = combineReq3.getPerSubDistrict();
                l.c(perSubDistrict);
                String perDistrict = combineReq3.getPerDistrict();
                l.c(perDistrict);
                String perState = combineReq3.getPerState();
                l.c(perState);
                String perPinCode = combineReq3.getPerPinCode();
                l.c(perPinCode);
                String presHouseNo = combineReq3.getPresHouseNo();
                l.c(presHouseNo);
                String presStreet = combineReq3.getPresStreet();
                l.c(presStreet);
                String presLocation = combineReq3.getPresLocation();
                l.c(presLocation);
                String presVillageOrTown = combineReq3.getPresVillageOrTown();
                l.c(presVillageOrTown);
                String presSubDistrict = combineReq3.getPresSubDistrict();
                l.c(presSubDistrict);
                String presDistrict = combineReq3.getPresDistrict();
                l.c(presDistrict);
                String presState = combineReq3.getPresState();
                l.c(presState);
                String presPincode = combineReq3.getPresPincode();
                l.c(presPincode);
                String dleDlReasonCode = combineReq3.getDleDlReasonCode();
                l.c(dleDlReasonCode);
                String dleDlReasonName = combineReq3.getDleDlReasonName();
                l.c(dleDlReasonName);
                String dupDlReasonName = combineReq3.getDupDlReasonName();
                l.c(dupDlReasonName);
                String dupDlReasonCode = combineReq3.getDupDlReasonCode();
                l.c(dupDlReasonCode);
                String applDateOfBirth = combineReq3.getApplDateOfBirth();
                l.c(applDateOfBirth);
                String codobDlReasonName = combineReq3.getCodobDlReasonName();
                l.c(codobDlReasonName);
                String codobDlReasonCode = combineReq3.getCodobDlReasonCode();
                l.c(codobDlReasonCode);
                String declaringcheck = combineReq3.getDeclaringcheck();
                l.c(declaringcheck);
                String hillcertificate = combineReq3.getHillcertificate();
                l.c(hillcertificate);
                String hillissueDate = combineReq3.getHillissueDate();
                l.c(hillissueDate);
                String hillvalidFrom = combineReq3.getHillvalidFrom();
                l.c(hillvalidFrom);
                String hillvalidTo = combineReq3.getHillvalidTo();
                l.c(hillvalidTo);
                String hilldrivingschool = combineReq3.getHilldrivingschool();
                l.c(hilldrivingschool);
                String hillissby = combineReq3.getHillissby();
                l.c(hillissby);
                String pofbirth = combineReq3.getPofbirth();
                l.c(pofbirth);
                String country = combineReq3.getCountry();
                l.c(country);
                String passno = combineReq3.getPassno();
                l.c(passno);
                String passvaltill = combineReq3.getPassvaltill();
                l.c(passvaltill);
                String visano = combineReq3.getVisano();
                l.c(visano);
                String visavaltill = combineReq3.getVisavaltill();
                l.c(visavaltill);
                String tovisit = combineReq3.getTovisit();
                l.c(tovisit);
                String iscountryrestricted = combineReq3.getIscountryrestricted();
                l.c(iscountryrestricted);
                String countryRestrictedReason = combineReq3.getCountryRestrictedReason();
                l.c(countryRestrictedReason);
                String isDlSerdisqualified = combineReq3.isDlSerdisqualified();
                l.c(isDlSerdisqualified);
                String dlSerdisqualifiedReason = combineReq3.getDlSerdisqualifiedReason();
                l.c(dlSerdisqualifiedReason);
                String forAdd1 = combineReq3.getForAdd1();
                l.c(forAdd1);
                String forAdd2 = combineReq3.getForAdd2();
                l.c(forAdd2);
                String forAdd3 = combineReq3.getForAdd3();
                l.c(forAdd3);
                String forAddPinCode = combineReq3.getForAddPinCode();
                l.c(forAddPinCode);
                String forNationMobNum = combineReq3.getForNationMobNum();
                l.c(forNationMobNum);
                String emailID = combineReq3.getEmailID();
                l.c(emailID);
                String appliedIdpfromIndEmb = combineReq3.getAppliedIdpfromIndEmb();
                l.c(appliedIdpfromIndEmb);
                String indEmbName = combineReq3.getIndEmbName();
                l.c(indEmbName);
                String embPlace = combineReq3.getEmbPlace();
                l.c(embPlace);
                String dateOfVerifEmb = combineReq3.getDateOfVerifEmb();
                l.c(dateOfVerifEmb);
                String embEndorseNo = combineReq3.getEmbEndorseNo();
                l.c(embEndorseNo);
                String idpcountryapplyfrom = combineReq3.getIdpcountryapplyfrom();
                l.c(idpcountryapplyfrom);
                dVar.g(z10, arrayList, str4, str5, X1, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", applcatgDLserReq, dlHolderAltMobMum, str6, str7, str8, willtoDonateOrgans, Y1, valueOf, str9, obj10, format, obj11, obj12, obj13, obj14, str10, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, Z1().f(), Z1().g(), Z1().e(), Z1().h());
                return;
            }
            Context applicationContext = getApplicationContext();
            ld.c cVar12 = this.K;
            if (cVar12 == null) {
                l.v("langSession");
                cVar = null;
            } else {
                cVar = cVar12;
            }
            Toast.makeText(applicationContext, cVar.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
    }

    public final void A2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f21933q0 = arrayList;
    }

    public final void B2(String str) {
        l.f(str, "<set-?>");
        this.f21921e0 = str;
    }

    public final void C2(String str) {
        l.f(str, "<set-?>");
        this.f21919c0 = str;
    }

    public final void D2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.f21918b0 = fVar;
    }

    public final int L1() {
        return this.f21920d0;
    }

    public final DldetobjX M1() {
        DldetobjX dldetobjX = this.Z;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final String N1() {
        return this.R;
    }

    public final String O1() {
        return this.S;
    }

    public final String P1() {
        return this.W;
    }

    public final String Q1() {
        return this.U;
    }

    public final String R1() {
        return this.V;
    }

    public final String S1() {
        return this.X;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.f21934r0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface U1() {
        CombineServiceInterface combineServiceInterface = this.f21942z0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        l.v("mCombineServiceInterface");
        return null;
    }

    public final ld.g V1() {
        ld.g gVar = this.Q;
        if (gVar != null) {
            return gVar;
        }
        l.v("mSessionmanger");
        return null;
    }

    public final String W1() {
        return this.T;
    }

    public final ArrayList X1() {
        ArrayList arrayList = this.f21933q0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final String Y1() {
        String str = this.f21919c0;
        if (str != null) {
            return str;
        }
        l.v("relationCode");
        return null;
    }

    public final ld.f Z1() {
        ld.f fVar = this.f21918b0;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0 c10 = h0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.J = c10;
        h0 h0Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        y2(this);
        this.K = new ld.c(this);
        D2(new ld.f(this));
        z2(new ld.g(this));
        h0 h0Var2 = this.J;
        if (h0Var2 == null) {
            l.v("binding");
            h0Var2 = null;
        }
        h0Var2.f26577f.setText((CharSequence) null);
        h0 h0Var3 = this.J;
        if (h0Var3 == null) {
            l.v("binding");
            h0Var3 = null;
        }
        h0Var3.f26577f.setContentDescription((CharSequence) null);
        e.a aVar = v9.e.f17509a;
        h0 h0Var4 = this.J;
        if (h0Var4 == null) {
            l.v("binding");
            h0Var4 = null;
        }
        aVar.Q(this, h0Var4);
        a2();
        o2();
        if (l.a(Z1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            l2();
        }
        h0 h0Var5 = this.J;
        if (h0Var5 == null) {
            l.v("binding");
            h0Var5 = null;
        }
        h0Var5.f26585n.f29577d.setOnClickListener(new ij.e(this));
        K1();
        h0 h0Var6 = this.J;
        if (h0Var6 == null) {
            l.v("binding");
            h0Var6 = null;
        }
        h0Var6.f26576e.addTextChangedListener(new e(this));
        h0 h0Var7 = this.J;
        if (h0Var7 == null) {
            l.v("binding");
            h0Var7 = null;
        }
        h0Var7.f26584m.addTextChangedListener(new f(this));
        h0 h0Var8 = this.J;
        if (h0Var8 == null) {
            l.v("binding");
        } else {
            h0Var = h0Var8;
        }
        h0Var.f26580i.addTextChangedListener(new g(this));
    }

    public final void r2(String str) {
        if (str != null) {
            ld.c cVar = this.K;
            ld.c cVar2 = null;
            if (cVar == null) {
                l.v("langSession");
                cVar = null;
            }
            String b10 = cVar.b("nex_parivahan", getString(R.string.app_name));
            l.c(b10);
            ld.c cVar3 = this.K;
            if (cVar3 == null) {
                l.v("langSession");
            } else {
                cVar2 = cVar3;
            }
            String b11 = cVar2.b("btn_ok", getString(R.string.ok_txt));
            l.c(b11);
            oi.g.n1(this, b10, str, 1, b11, (String) null, i.f21953e, 16, (Object) null);
        }
    }

    public final void t2(String str) {
        l.f(str, "<set-?>");
        this.f21932p0 = str;
    }

    public final void u2(int i10) {
        this.f21920d0 = i10;
    }

    public final void v2(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.Z = dldetobjX;
    }

    public final void w2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f21934r0 = arrayList;
    }

    public final void x2(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "<set-?>");
        this.f21942z0 = combineServiceInterface;
    }

    public final void y2(Context context) {
        l.f(context, "<set-?>");
        this.f21931o0 = context;
    }

    public final void z2(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.Q = gVar;
    }
}
