package com.nic.mparivahan.ProfileDetails.ProfileViews;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.Model.SaveProfileModel;
import com.nic.mparivahan.ProfileDetails.Model.UpdateCitizenProfile;
import com.nic.mparivahan.ProfileDetails.Model.UploadProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.ProfileService.SaveCitizenProfileService;
import com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ka.c;
import nc.a;
import ni.t8;
import oc.p;
import oc.q;
import oc.r;
import oc.s;
import oc.t;
import oc.u;
import pl.x;
import v9.e;

public final class UserDetails extends androidx.appcompat.app.d {

    /* renamed from: t0  reason: collision with root package name */
    public static final a f9381t0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public Context G;
    public qc.b H;
    public UserBloodDetails I;
    public EditText J;
    public TextView K;
    public EditText L;
    public EditText M;
    /* access modifiers changed from: private */
    public RadioButton N;
    /* access modifiers changed from: private */
    public RadioButton O;
    /* access modifiers changed from: private */
    public RadioButton P;
    /* access modifiers changed from: private */
    public Spinner Q;
    private LinearLayout R;
    private DatePickerDialog.OnDateSetListener S;
    private Calendar T;
    public String U;
    public String V;
    public String W;
    /* access modifiers changed from: private */
    public int X;
    /* access modifiers changed from: private */
    public int Y;
    public ImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public ImageView f9382a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f9383b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f9384c0;

    /* renamed from: d0  reason: collision with root package name */
    public TextView f9385d0;

    /* renamed from: e0  reason: collision with root package name */
    public TextView f9386e0;

    /* renamed from: f0  reason: collision with root package name */
    public ld.g f9387f0;

    /* renamed from: g0  reason: collision with root package name */
    public ProgressDialog f9388g0;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList f9389h0;

    /* renamed from: i0  reason: collision with root package name */
    public CircleImageView f9390i0;

    /* renamed from: j0  reason: collision with root package name */
    private String f9391j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f9392k0 = "";
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public t8 f9393l0;

    /* renamed from: m0  reason: collision with root package name */
    public v8.b f9394m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f9395n0;

    /* renamed from: o0  reason: collision with root package name */
    public CreateAccountServices f9396o0;

    /* renamed from: p0  reason: collision with root package name */
    private ArrayList f9397p0 = new ArrayList();

    /* renamed from: q0  reason: collision with root package name */
    public ld.g f9398q0;

    /* renamed from: r0  reason: collision with root package name */
    public ld.c f9399r0;

    /* renamed from: s0  reason: collision with root package name */
    private d.c f9400s0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9401e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserDetails userDetails) {
            super(1);
            this.f9401e = userDetails;
        }

        public final void b(SaveProfileModel saveProfileModel) {
            Context context = null;
            if (cm.l.a(saveProfileModel.getStatusDesc(), "Success")) {
                this.f9401e.j2().w(String.valueOf(this.f9401e.Y));
                t8 C1 = this.f9401e.f9393l0;
                if (C1 == null) {
                    cm.l.v("mBinding");
                    C1 = null;
                }
                String obj = C1.f28700j.getText().toString();
                t8 C12 = this.f9401e.f9393l0;
                if (C12 == null) {
                    cm.l.v("mBinding");
                    C12 = null;
                }
                String obj2 = C12.f28706p.getText().toString();
                t8 C13 = this.f9401e.f9393l0;
                if (C13 == null) {
                    cm.l.v("mBinding");
                    C13 = null;
                }
                String obj3 = C13.f28707q.getText().toString();
                c.a aVar = ka.c.f13158a;
                if (!aVar.m(obj)) {
                    this.f9401e.j2().z(obj);
                }
                if (!aVar.m(obj2)) {
                    this.f9401e.j2().E(obj2);
                }
                if (!aVar.m(obj3)) {
                    this.f9401e.j2().y(obj3);
                }
                this.f9401e.p2().dismiss();
                UserDetails userDetails = this.f9401e;
                Context D1 = userDetails.G;
                if (D1 == null) {
                    cm.l.v("mContext");
                } else {
                    context = D1;
                }
                userDetails.K2(context, this.f9401e.h2().b(v9.f.f17510a.e0(), "Your profile has been updated successfully"));
                return;
            }
            this.f9401e.q2().setText("Submit");
            this.f9401e.p2().dismiss();
            UserDetails userDetails2 = this.f9401e;
            Context D12 = userDetails2.G;
            if (D12 == null) {
                cm.l.v("mContext");
            } else {
                context = D12;
            }
            userDetails2.I2(context, saveProfileModel.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SaveProfileModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserDetails userDetails) {
            super(1);
            this.f9402e = userDetails;
        }

        public final void b(UpdateCitizenProfile updateCitizenProfile) {
            this.f9402e.p2().dismiss();
            Context context = null;
            if (cm.l.a(updateCitizenProfile.getStatusDesc(), "Success")) {
                this.f9402e.j2().w(String.valueOf(this.f9402e.Y));
                this.f9402e.j2().w(String.valueOf(this.f9402e.Y));
                t8 C1 = this.f9402e.f9393l0;
                if (C1 == null) {
                    cm.l.v("mBinding");
                    C1 = null;
                }
                String obj = C1.f28700j.getText().toString();
                t8 C12 = this.f9402e.f9393l0;
                if (C12 == null) {
                    cm.l.v("mBinding");
                    C12 = null;
                }
                String obj2 = C12.f28706p.getText().toString();
                t8 C13 = this.f9402e.f9393l0;
                if (C13 == null) {
                    cm.l.v("mBinding");
                    C13 = null;
                }
                String obj3 = C13.f28707q.getText().toString();
                c.a aVar = ka.c.f13158a;
                if (!aVar.m(obj)) {
                    this.f9402e.j2().z(obj);
                }
                if (!aVar.m(obj2)) {
                    this.f9402e.j2().E(obj2);
                }
                if (!aVar.m(obj3)) {
                    this.f9402e.j2().y(obj3);
                }
                UserDetails userDetails = this.f9402e;
                Context D1 = userDetails.G;
                if (D1 == null) {
                    cm.l.v("mContext");
                } else {
                    context = D1;
                }
                userDetails.M2(context, this.f9402e.h2().b(v9.f.f17510a.e0(), "Your profile has been updated successfully"));
                return;
            }
            this.f9402e.p2().dismiss();
            UserDetails userDetails2 = this.f9402e;
            Context D12 = userDetails2.G;
            if (D12 == null) {
                cm.l.v("mContext");
            } else {
                context = D12;
            }
            userDetails2.I2(context, updateCitizenProfile.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateCitizenProfile) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9403e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UserDetails userDetails) {
            super(1);
            this.f9403e = userDetails;
        }

        public final void b(StateUpdateResponse stateUpdateResponse) {
            if (this.f9403e.p2().isShowing()) {
                this.f9403e.p2().dismiss();
            }
            Context context = null;
            if (cm.l.a(stateUpdateResponse.getStatusDesc(), "Success")) {
                this.f9403e.j2().b(String.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzRecordId()), stateUpdateResponse.getMparCitizenUser().getCtzMobile(), stateUpdateResponse.getMparCitizenUser().getCtzDispName(), stateUpdateResponse.getMparCitizenUser().getCtzEmail(), this.f9403e.v2().m().toString(), this.f9403e.s2(), Boolean.TRUE, Boolean.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzMpinStatus()));
                UserDetails userDetails = this.f9403e;
                Context D1 = userDetails.G;
                if (D1 == null) {
                    cm.l.v("mContext");
                } else {
                    context = D1;
                }
                userDetails.M2(context, this.f9403e.h2().b(v9.f.f17510a.e0(), "Your profile has been updated successfully"));
                return;
            }
            this.f9403e.p2().dismiss();
            UserDetails userDetails2 = this.f9403e;
            Context D12 = userDetails2.G;
            if (D12 == null) {
                cm.l.v("mContext");
            } else {
                context = D12;
            }
            userDetails2.I2(context, stateUpdateResponse.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateUpdateResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9404e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UserDetails userDetails) {
            super(1);
            this.f9404e = userDetails;
        }

        public final void b(String str) {
            if (this.f9404e.p2().isShowing()) {
                this.f9404e.p2().dismiss();
            }
            UserDetails userDetails = this.f9404e;
            Context D1 = userDetails.G;
            if (D1 == null) {
                cm.l.v("mContext");
                D1 = null;
            }
            userDetails.I2(D1, this.f9404e.h2().b("service_is_not_present", "Something went wrong, Try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(UserDetails userDetails) {
            super(1);
            this.f9405e = userDetails;
        }

        public final void b(FetchProfileImgResponseModel fetchProfileImgResponseModel) {
            try {
                if (this.f9405e.p2().isShowing()) {
                    this.f9405e.p2().dismiss();
                }
                if (p.o(fetchProfileImgResponseModel.getStatusCode(), "CTZN001", true)) {
                    this.f9405e.l3(fetchProfileImgResponseModel.getCtzImage());
                    Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(fetchProfileImgResponseModel.getCtzImage());
                    if (c10 != null) {
                        this.f9405e.u2().setImageBitmap(c10);
                    }
                    this.f9405e.j2().B(fetchProfileImgResponseModel.getCtzImage());
                    this.f9405e.e3();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FetchProfileImgResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9406e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(UserDetails userDetails) {
            super(1);
            this.f9406e = userDetails;
        }

        public final void b(UploadProfileImgResponseModel uploadProfileImgResponseModel) {
            try {
                if (this.f9406e.p2().isShowing()) {
                    this.f9406e.p2().dismiss();
                }
                boolean unused = p.o(uploadProfileImgResponseModel.getStatusCode(), "CTZN001", true);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadProfileImgResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(UserDetails userDetails) {
            super(1);
            this.f9407e = userDetails;
        }

        public final void b(String str) {
            if (this.f9407e.p2().isShowing()) {
                this.f9407e.p2().dismiss();
            }
            UserDetails userDetails = this.f9407e;
            Toast.makeText(userDetails, userDetails.h2().b(v9.f.f17510a.D(), "There is some error in uploading"), 0).show();
            this.f9407e.l3("");
            this.f9407e.e3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9408e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(UserDetails userDetails) {
            super(1);
            this.f9408e = userDetails;
        }

        public final void b(String str) {
            if (this.f9408e.p2().isShowing()) {
                this.f9408e.p2().dismiss();
            }
            this.f9408e.l3("");
            this.f9408e.e3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(UserDetails userDetails) {
            super(1);
            this.f9409e = userDetails;
        }

        public final void b(kc.b bVar) {
            if (this.f9409e.p2().isShowing()) {
                this.f9409e.p2().dismiss();
            }
            Spinner spinner = null;
            try {
                throw null;
            } catch (Exception unused) {
                ArrayList arrayList = new ArrayList();
                kc.a aVar = new kc.a();
                aVar.b("Select Blood Group");
                arrayList.add(0, aVar);
                Context D1 = this.f9409e.G;
                if (D1 == null) {
                    cm.l.v("mContext");
                    D1 = null;
                }
                lc.a aVar2 = new lc.a(D1, arrayList);
                aVar2.setDropDownViewResource(R.layout.custom_spinner);
                Spinner E1 = this.f9409e.Q;
                if (E1 == null) {
                    cm.l.v("mSpinner");
                } else {
                    spinner = E1;
                }
                spinner.setAdapter(aVar2);
                if (com.nic.mparivahan.a.f9624a.a(this.f9409e)) {
                    this.f9409e.k2().g(Long.parseLong(this.f9409e.j2().k()), this.f9409e);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((kc.b) null);
            return x.f30437a;
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(UserDetails userDetails) {
            super(1);
            this.f9410e = userDetails;
        }

        public final void b(String str) {
            if (this.f9410e.p2().isShowing()) {
                this.f9410e.p2().dismiss();
            }
            ArrayList arrayList = new ArrayList();
            kc.a aVar = new kc.a();
            aVar.b("Select Blood Group");
            arrayList.add(0, aVar);
            Context D1 = this.f9410e.G;
            Spinner spinner = null;
            if (D1 == null) {
                cm.l.v("mContext");
                D1 = null;
            }
            lc.a aVar2 = new lc.a(D1, arrayList);
            aVar2.setDropDownViewResource(R.layout.custom_spinner);
            Spinner E1 = this.f9410e.Q;
            if (E1 == null) {
                cm.l.v("mSpinner");
            } else {
                spinner = E1;
            }
            spinner.setAdapter(aVar2);
            if (com.nic.mparivahan.a.f9624a.a(this.f9410e)) {
                this.f9410e.k2().g(Long.parseLong(this.f9410e.j2().k()), this.f9410e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9411e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(UserDetails userDetails) {
            super(1);
            this.f9411e = userDetails;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0193, code lost:
            if (r13 == null) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0199, code lost:
            r4 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cb, code lost:
            if (r13 == null) goto L_0x0195;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails r13) {
            /*
                r12 = this;
                java.lang.String r0 = "\\s"
                java.lang.String r1 = ""
                java.lang.String r2 = r13.getStatusDesc()
                java.lang.String r3 = "Success"
                boolean r2 = cm.l.a(r2, r3)
                r3 = 1
                if (r2 == 0) goto L_0x01fd
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r2 = r12.f9411e
                android.app.ProgressDialog r2 = r2.p2()
                r2.dismiss()
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r2 = r12.f9411e
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r4 = r13.getMparCitizenProfile()
                int r4 = r4.getCpRecordId()
                r2.X = r4
                r2 = 0
                r4 = 0
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r5 = r13.getMparCitizenProfile()     // Catch:{ Exception -> 0x008a }
                java.lang.String r5 = r5.getCpBloodGrp()     // Catch:{ Exception -> 0x008a }
                java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x008a }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x008a }
                ld.g r6 = new ld.g     // Catch:{ Exception -> 0x008a }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r7 = r12.f9411e     // Catch:{ Exception -> 0x008a }
                r6.<init>(r7)     // Catch:{ Exception -> 0x008a }
                r6.w(r5)     // Catch:{ Exception -> 0x008a }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r6 = r12.f9411e     // Catch:{ Exception -> 0x008a }
                java.util.ArrayList r6 = r6.Q1()     // Catch:{ Exception -> 0x008a }
                int r6 = r6.size()     // Catch:{ Exception -> 0x008a }
                r7 = r2
            L_0x004e:
                if (r7 >= r6) goto L_0x0096
                km.f r8 = new km.f     // Catch:{ Exception -> 0x008a }
                r8.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x008a }
                java.lang.String r8 = r8.b(r5, r1)     // Catch:{ Exception -> 0x008a }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r9 = r12.f9411e     // Catch:{ Exception -> 0x008a }
                java.util.ArrayList r9 = r9.Q1()     // Catch:{ Exception -> 0x008a }
                java.lang.Object r9 = r9.get(r7)     // Catch:{ Exception -> 0x008a }
                kc.a r9 = (kc.a) r9     // Catch:{ Exception -> 0x008a }
                java.lang.String r9 = r9.f13179a     // Catch:{ Exception -> 0x008a }
                java.lang.String r10 = "bldgrpName"
                cm.l.e(r9, r10)     // Catch:{ Exception -> 0x008a }
                km.f r10 = new km.f     // Catch:{ Exception -> 0x008a }
                r10.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x008a }
                java.lang.String r9 = r10.b(r9, r1)     // Catch:{ Exception -> 0x008a }
                boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x008a }
                if (r8 == 0) goto L_0x0090
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e     // Catch:{ Exception -> 0x008a }
                android.widget.Spinner r0 = r0.Q     // Catch:{ Exception -> 0x008a }
                if (r0 != 0) goto L_0x008c
                java.lang.String r0 = "mSpinner"
                cm.l.v(r0)     // Catch:{ Exception -> 0x008a }
                r0 = r4
                goto L_0x008c
            L_0x008a:
                r0 = move-exception
                goto L_0x0093
            L_0x008c:
                r0.setSelection(r7)     // Catch:{ Exception -> 0x008a }
                goto L_0x0096
            L_0x0090:
                int r7 = r7 + 1
                goto L_0x004e
            L_0x0093:
                r0.printStackTrace()
            L_0x0096:
                z9.a$a r0 = z9.a.f18947a     // Catch:{ Exception -> 0x00e1 }
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r5 = r13.getMparCitizenProfile()     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r5 = r5.getCpDob()     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r6 = r0.b(r5)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r0 = "-"
                r7[r2] = r0     // Catch:{ Exception -> 0x00e1 }
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                java.util.List r0 = km.q.l0(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00e1 }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r5 = r12.f9411e     // Catch:{ Exception -> 0x00e1 }
                android.widget.TextView r5 = r5.T1()     // Catch:{ Exception -> 0x00e1 }
                r6 = 2
                java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x00e1 }
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00e1 }
                r5.setText(r6)     // Catch:{ Exception -> 0x00e1 }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r5 = r12.f9411e     // Catch:{ Exception -> 0x00e1 }
                android.widget.TextView r5 = r5.U1()     // Catch:{ Exception -> 0x00e1 }
                java.lang.Object r6 = r0.get(r3)     // Catch:{ Exception -> 0x00e1 }
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00e1 }
                r5.setText(r6)     // Catch:{ Exception -> 0x00e1 }
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r5 = r12.f9411e     // Catch:{ Exception -> 0x00e1 }
                android.widget.TextView r5 = r5.V1()     // Catch:{ Exception -> 0x00e1 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00e1 }
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x00e1 }
                r5.setText(r0)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00fe
            L_0x00e1:
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.TextView r0 = r0.T1()
                java.lang.String r5 = " "
                r0.setText(r5)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.TextView r0 = r0.U1()
                r0.setText(r5)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.TextView r0 = r0.V1()
                r0.setText(r5)
            L_0x00fe:
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r0 = r13.getMparCitizenProfile()
                int r0 = r0.getCpWeight()
                if (r0 != 0) goto L_0x0112
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.EditText r0 = r0.n2()
                r0.setText(r1)
                goto L_0x0127
            L_0x0112:
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.EditText r0 = r0.n2()
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r5 = r13.getMparCitizenProfile()
                int r5 = r5.getCpWeight()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r0.setText(r5)
            L_0x0127:
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r0 = r13.getMparCitizenProfile()
                int r0 = r0.getCpHeight()
                if (r0 != 0) goto L_0x013b
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.EditText r0 = r0.i2()
            L_0x0137:
                r0.setText(r1)
                goto L_0x014e
            L_0x013b:
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.EditText r0 = r0.i2()
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r1 = r13.getMparCitizenProfile()
                int r1 = r1.getCpHeight()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x0137
            L_0x014e:
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                android.widget.TextView r0 = r0.q2()
                java.lang.String r1 = "Update Profile"
                r0.setText(r1)
                com.nic.mparivahan.ProfileDetails.ModleRef.mparCitizenProfile r13 = r13.getMparCitizenProfile()
                java.lang.String r13 = r13.getCpGender()
                java.lang.String r0 = "M"
                boolean r0 = cm.l.a(r13, r0)
                java.lang.String r1 = "otherRadioButton"
                java.lang.String r5 = "femaleRadioButton"
                java.lang.String r6 = "maleRadioButton"
                if (r0 == 0) goto L_0x019f
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.N
                if (r13 != 0) goto L_0x017b
                cm.l.v(r6)
                r13 = r4
            L_0x017b:
                r13.setChecked(r3)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.O
                if (r13 != 0) goto L_0x018a
                cm.l.v(r5)
                r13 = r4
            L_0x018a:
                r13.setChecked(r2)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.P
                if (r13 != 0) goto L_0x0199
            L_0x0195:
                cm.l.v(r1)
                goto L_0x019a
            L_0x0199:
                r4 = r13
            L_0x019a:
                r4.setChecked(r2)
                goto L_0x0248
            L_0x019f:
                java.lang.String r0 = "F"
                boolean r13 = cm.l.a(r13, r0)
                if (r13 == 0) goto L_0x01ce
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.N
                if (r13 != 0) goto L_0x01b3
                cm.l.v(r6)
                r13 = r4
            L_0x01b3:
                r13.setChecked(r2)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.O
                if (r13 != 0) goto L_0x01c2
                cm.l.v(r5)
                r13 = r4
            L_0x01c2:
                r13.setChecked(r3)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.P
                if (r13 != 0) goto L_0x0199
                goto L_0x0195
            L_0x01ce:
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.N
                if (r13 != 0) goto L_0x01da
                cm.l.v(r6)
                r13 = r4
            L_0x01da:
                r13.setChecked(r2)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.O
                if (r13 != 0) goto L_0x01e9
                cm.l.v(r5)
                r13 = r4
            L_0x01e9:
                r13.setChecked(r2)
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.RadioButton r13 = r13.P
                if (r13 != 0) goto L_0x01f8
                cm.l.v(r1)
                goto L_0x01f9
            L_0x01f8:
                r4 = r13
            L_0x01f9:
                r4.setChecked(r3)
                goto L_0x0248
            L_0x01fd:
                java.lang.String r0 = r13.getStatusCode()
                java.lang.String r1 = "CTZN002"
                boolean r0 = km.p.o(r0, r1, r3)
                java.lang.String r1 = "Submit"
                if (r0 == 0) goto L_0x021e
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.app.ProgressDialog r13 = r13.p2()
                r13.dismiss()
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.TextView r13 = r13.q2()
                r13.setText(r1)
                goto L_0x0248
            L_0x021e:
                java.lang.String r13 = r13.getStatusDesc()
                java.lang.String r0 = "No Record(s) Found."
                boolean r13 = cm.l.a(r13, r0)
                if (r13 == 0) goto L_0x0248
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.app.ProgressDialog r13 = r13.p2()
                r13.dismiss()
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r13 = r12.f9411e
                android.widget.TextView r13 = r13.q2()
                com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r0 = r12.f9411e
                ld.c r0 = r0.h2()
                java.lang.String r2 = "vahan_btn_submit"
                java.lang.String r0 = r0.b(r2, r1)
                r13.setText(r0)
            L_0x0248:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails.l.b(com.nic.mparivahan.ProfileDetails.ModleRef.profiledetails):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((profiledetails) obj);
            return x.f30437a;
        }
    }

    public static final class m implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9412e;

        m(UserDetails userDetails) {
            this.f9412e = userDetails;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            UserDetails userDetails = this.f9412e;
            Spinner E1 = userDetails.Q;
            if (E1 == null) {
                cm.l.v("mSpinner");
                E1 = null;
            }
            userDetails.h3(E1.getSelectedItem().toString());
            this.f9412e.Y = i10;
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class n implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserDetails f9413e;

        n(UserDetails userDetails) {
            this.f9413e = userDetails;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            if (this.f9413e.t2().size() > 0) {
                UserDetails userDetails = this.f9413e;
                userDetails.j3(((State) userDetails.t2().get(i10)).getStateCode());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class o implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9414a;

        o(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f9414a = lVar;
        }

        public final pl.c a() {
            return this.f9414a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9414a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public UserDetails() {
        d.c y02 = y0(new e.d(), new oc.a(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f9400s0 = y02;
    }

    /* access modifiers changed from: private */
    public static final void A2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        t8 t8Var = userDetails.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28697g.setBackground(userDetails.getResources().getDrawable(R.drawable.edit_button_brown));
        t8 t8Var3 = userDetails.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.K.setBackground(userDetails.getResources().getDrawable(R.drawable.blue_button_style));
        t8 t8Var4 = userDetails.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.K.setTextColor(androidx.core.content.a.c(userDetails, R.color.white));
        t8 t8Var5 = userDetails.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.f28697g.setTextColor(androidx.core.content.a.c(userDetails, R.color.black));
        t8 t8Var6 = userDetails.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var6;
        }
        t8Var2.f28703m.setVisibility(8);
        userDetails.O1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:71|(1:73)|74|(1:76)|77|78|(1:80)|81|(1:83)|84|85|86|(1:88)(1:89)|90|100) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f2 */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f6 A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fa A[Catch:{ Exception -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B2(com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails r17, android.view.View r18) {
        /*
            r0 = r17
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            com.nic.mparivahan.a$a r1 = com.nic.mparivahan.a.f9624a
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L_0x022c
            android.widget.EditText r1 = r17.l2()     // Catch:{ Exception -> 0x0029 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0029 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0029 }
            r2 = 3
            java.lang.String r3 = "mContext"
            r4 = 0
            if (r1 >= r2) goto L_0x0042
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x002c
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            goto L_0x0228
        L_0x002c:
            r4 = r1
        L_0x002d:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            v9.f$a r2 = v9.f.f17510a     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = r2.S0()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r3 = "Please enter valid name"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0029 }
        L_0x003d:
            r0.I2(r4, r1)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0244
        L_0x0042:
            ni.t8 r1 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "mBinding"
            if (r1 != 0) goto L_0x004c
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r1 = r4
        L_0x004c:
            android.widget.EditText r1 = r1.f28707q     // Catch:{ Exception -> 0x0029 }
            int r1 = r1.getVisibility()     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0087
            ni.t8 r1 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x005c
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r1 = r4
        L_0x005c:
            android.widget.EditText r1 = r1.f28707q     // Catch:{ Exception -> 0x0029 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r5 = "getText(...)"
            cm.l.e(r1, r5)     // Catch:{ Exception -> 0x0029 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0087
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0075
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0076
        L_0x0075:
            r4 = r1
        L_0x0076:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            v9.f$a r2 = v9.f.f17510a     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = r2.p()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r3 = "Please enter email Id"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x003d
        L_0x0087:
            t8.c$a r1 = t8.c.f16582a     // Catch:{ Exception -> 0x0029 }
            ni.t8 r5 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r5 != 0) goto L_0x0091
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r5 = r4
        L_0x0091:
            android.widget.EditText r5 = r5.f28707q     // Catch:{ Exception -> 0x0029 }
            android.text.Editable r5 = r5.getText()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0029 }
            boolean r5 = r1.r(r5)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r6 = "Please enter the valid email Id"
            java.lang.String r7 = "label_log_entr_valid_email"
            if (r5 != 0) goto L_0x00b7
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x00ad
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = r1.b(r7, r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x003d
        L_0x00b7:
            ni.t8 r5 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r5 != 0) goto L_0x00bf
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r5 = r4
        L_0x00bf:
            android.widget.EditText r5 = r5.f28707q     // Catch:{ Exception -> 0x0029 }
            int r5 = r5.getVisibility()     // Catch:{ Exception -> 0x0029 }
            if (r5 != 0) goto L_0x00f2
            ni.t8 r5 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r5 != 0) goto L_0x00cf
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r5 = r4
        L_0x00cf:
            android.widget.EditText r5 = r5.f28707q     // Catch:{ Exception -> 0x0029 }
            android.text.Editable r5 = r5.getText()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0029 }
            boolean r1 = r1.r(r5)     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x00f2
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x00e7
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x00e8
        L_0x00e7:
            r4 = r1
        L_0x00e8:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = r1.b(r7, r6)     // Catch:{ Exception -> 0x0029 }
            goto L_0x003d
        L_0x00f2:
            ni.t8 r1 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x00fa
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r1 = r4
        L_0x00fa:
            android.widget.Spinner r1 = r1.f28711u     // Catch:{ Exception -> 0x0029 }
            int r1 = r1.getSelectedItemPosition()     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0119
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x010a
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x010b
        L_0x010a:
            r4 = r1
        L_0x010b:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "label_log_sel_state"
            java.lang.String r3 = "Please select state"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x003d
        L_0x0119:
            android.widget.TextView r1 = r17.q2()     // Catch:{ Exception -> 0x0029 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x0029 }
            ld.c r5 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r6 = "vahan_btn_submit"
            java.lang.String r7 = "Submit"
            java.lang.String r5 = r5.b(r6, r7)     // Catch:{ Exception -> 0x0029 }
            boolean r1 = cm.l.a(r1, r5)     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x020f
            ni.t8 r1 = r0.f9393l0     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x013b
            cm.l.v(r2)     // Catch:{ Exception -> 0x0029 }
            r1 = r4
        L_0x013b:
            android.widget.EditText r1 = r1.f28707q     // Catch:{ Exception -> 0x0029 }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0029 }
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x0029 }
            boolean r1 = r1.m(r10)     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0154
            ld.g r1 = r17.j2()     // Catch:{ Exception -> 0x0029 }
            r1.y(r10)     // Catch:{ Exception -> 0x0029 }
        L_0x0154:
            ni.t8 r1 = r0.f9393l0     // Catch:{ Exception -> 0x01f2 }
            if (r1 != 0) goto L_0x015c
            cm.l.v(r2)     // Catch:{ Exception -> 0x01f2 }
            r1 = r4
        L_0x015c:
            android.widget.Spinner r1 = r1.f28711u     // Catch:{ Exception -> 0x01f2 }
            java.lang.Object r1 = r1.getSelectedItem()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r5 = "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State"
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x01f2 }
            com.nic.mparivahan.Account.Model.State r1 = (com.nic.mparivahan.Account.Model.State) r1     // Catch:{ Exception -> 0x01f2 }
            ld.g r5 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r6 = r1.getStateCode()     // Catch:{ Exception -> 0x01f2 }
            r5.C(r6)     // Catch:{ Exception -> 0x01f2 }
            ld.g r5 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            ni.t8 r6 = r0.f9393l0     // Catch:{ Exception -> 0x01f2 }
            if (r6 != 0) goto L_0x0180
            cm.l.v(r2)     // Catch:{ Exception -> 0x01f2 }
            r6 = r4
        L_0x0180:
            android.widget.EditText r2 = r6.f28702l     // Catch:{ Exception -> 0x01f2 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01f2 }
            r5.A(r2)     // Catch:{ Exception -> 0x01f2 }
            android.content.ContentResolver r2 = r17.getContentResolver()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r5 = "android_id"
            java.lang.String r13 = android.provider.Settings.Secure.getString(r2, r5)     // Catch:{ Exception -> 0x01f2 }
            nc.a$a r5 = nc.a.f14255a     // Catch:{ Exception -> 0x01f2 }
            ld.g r2 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = r2.k()     // Catch:{ Exception -> 0x01f2 }
            long r6 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x01f2 }
            ld.g r2 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r8 = r2.l()     // Catch:{ Exception -> 0x01f2 }
            android.widget.EditText r2 = r17.l2()     // Catch:{ Exception -> 0x01f2 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r11 = r1.getStateCode()     // Catch:{ Exception -> 0x01f2 }
            ld.g r1 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            boolean r12 = r1.d()     // Catch:{ Exception -> 0x01f2 }
            cm.l.c(r13)     // Catch:{ Exception -> 0x01f2 }
            ld.g r1 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r14 = r1.l()     // Catch:{ Exception -> 0x01f2 }
            ld.g r1 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r15 = r1.e()     // Catch:{ Exception -> 0x01f2 }
            ld.g r1 = r17.j2()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r16 = r1.m()     // Catch:{ Exception -> 0x01f2 }
            org.json.JSONObject r1 = r5.d(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = "toString(...)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x01f2 }
            com.nic.mparivahan.ProfileDetails.ProfileService.SaveCitizenProfileService$a r2 = com.nic.mparivahan.ProfileDetails.ProfileService.SaveCitizenProfileService.f9376k     // Catch:{ Exception -> 0x01f2 }
            r2.a(r0, r1)     // Catch:{ Exception -> 0x01f2 }
        L_0x01f2:
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x01fa
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x01fb
        L_0x01fa:
            r4 = r1
        L_0x01fb:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            v9.f$a r2 = v9.f.f17510a     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = r2.e0()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r3 = "Your profile has been updated successfully"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0029 }
            r0.M2(r4, r1)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0244
        L_0x020f:
            android.content.Context r1 = r0.G     // Catch:{ Exception -> 0x0029 }
            if (r1 != 0) goto L_0x0217
            cm.l.v(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0218
        L_0x0217:
            r4 = r1
        L_0x0218:
            ld.c r1 = r17.h2()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "label_want_to_proceed"
            java.lang.String r3 = "Are you sure, You want to proceed ?"
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0029 }
            r0.F2(r4, r1)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0244
        L_0x0228:
            r0.printStackTrace()
            goto L_0x0244
        L_0x022c:
            android.content.Context r1 = r17.getApplicationContext()
            ld.c r0 = r17.h2()
            java.lang.String r2 = "label_log_check_internet"
            java.lang.String r3 = "Please check your internet connection"
            java.lang.String r0 = r0.b(r2, r3)
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L_0x0244:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails.B2(com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void C2(UserDetails userDetails, StateMaster stateMaster) {
        cm.l.f(userDetails, "this$0");
        t8 t8Var = null;
        try {
            if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                userDetails.p2().dismiss();
                ArrayList<State> states = stateMaster.getStates();
                cm.l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
                userDetails.f9397p0 = states;
                states.add(0, new State("Select State", "0", false, false, 1));
                q8.a aVar = new q8.a(userDetails, userDetails.f9397p0);
                t8 t8Var2 = userDetails.f9393l0;
                if (t8Var2 == null) {
                    cm.l.v("mBinding");
                    t8Var2 = null;
                }
                t8Var2.f28711u.setAdapter(aVar);
                int size = userDetails.f9397p0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (cm.l.a(((State) userDetails.f9397p0.get(i10)).getStateCode(), userDetails.j2().q())) {
                        t8 t8Var3 = userDetails.f9393l0;
                        if (t8Var3 == null) {
                            cm.l.v("mBinding");
                            t8Var3 = null;
                        }
                        t8Var3.f28711u.setSelection(i10);
                        return;
                    }
                }
                return;
            }
            userDetails.p2().dismiss();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new State("Select State", "0", false, false, 1));
            q8.a aVar2 = new q8.a(userDetails, arrayList);
            t8 t8Var4 = userDetails.f9393l0;
            if (t8Var4 == null) {
                cm.l.v("mBinding");
                t8Var4 = null;
            }
            t8Var4.f28711u.setAdapter(aVar2);
        } catch (Exception e10) {
            userDetails.p2().dismiss();
            e10.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            q8.a aVar3 = new q8.a(userDetails, arrayList2);
            t8 t8Var5 = userDetails.f9393l0;
            if (t8Var5 == null) {
                cm.l.v("mBinding");
            } else {
                t8Var = t8Var5;
            }
            t8Var.f28711u.setAdapter(aVar3);
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(UserDetails userDetails, String str) {
        cm.l.f(userDetails, "this$0");
        userDetails.p2().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new State("Select State", "0", false, false, 1));
        q8.a aVar = new q8.a(userDetails, arrayList);
        t8 t8Var = userDetails.f9393l0;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28711u.setAdapter(aVar);
    }

    private final void E2() {
        Context context;
        DatePickerDialog.OnDateSetListener onDateSetListener;
        Calendar instance = Calendar.getInstance();
        instance.set(2008, 1, 1);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(1911, 12, 31);
        Context context2 = this.G;
        Calendar calendar = null;
        if (context2 == null) {
            cm.l.v("mContext");
            context = null;
        } else {
            context = context2;
        }
        DatePickerDialog.OnDateSetListener onDateSetListener2 = this.S;
        if (onDateSetListener2 == null) {
            cm.l.v("date");
            onDateSetListener = null;
        } else {
            onDateSetListener = onDateSetListener2;
        }
        Calendar calendar2 = this.T;
        if (calendar2 == null) {
            cm.l.v("myCalendar");
            calendar2 = null;
        }
        int i10 = calendar2.get(1);
        Calendar calendar3 = this.T;
        if (calendar3 == null) {
            cm.l.v("myCalendar");
            calendar3 = null;
        }
        int i11 = calendar3.get(2);
        Calendar calendar4 = this.T;
        if (calendar4 == null) {
            cm.l.v("myCalendar");
        } else {
            calendar = calendar4;
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, onDateSetListener, i10, i11, calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(instance.getTimeInMillis());
        datePickerDialog.getDatePicker().setMinDate(instance2.getTimeInMillis());
        datePickerDialog.show();
    }

    private final void F2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(h2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(h2().b("radio_dl_serv_yes", "Yes"));
        textView2.setText(h2().b("radio_dl_serv_no", "No"));
        ((TextView) findViewById).setText(str);
        textView2.setOnClickListener(new t(dialog));
        textView.setOnClickListener(new u(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void G2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, UserDetails userDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(userDetails, "this$0");
        dialog.dismiss();
        if (com.nic.mparivahan.a.f9624a.a(userDetails)) {
            t8 t8Var = userDetails.f9393l0;
            Context context = null;
            if (t8Var == null) {
                cm.l.v("mBinding");
                t8Var = null;
            }
            String obj = t8Var.f28707q.getText().toString();
            if (!ka.c.f13158a.m(obj)) {
                userDetails.j2().y(obj);
            }
            try {
                t8 t8Var2 = userDetails.f9393l0;
                if (t8Var2 == null) {
                    cm.l.v("mBinding");
                    t8Var2 = null;
                }
                Object selectedItem = t8Var2.f28711u.getSelectedItem();
                cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                userDetails.j2().C(state.getStateCode());
                ld.g j22 = userDetails.j2();
                t8 t8Var3 = userDetails.f9393l0;
                if (t8Var3 == null) {
                    cm.l.v("mBinding");
                    t8Var3 = null;
                }
                j22.A(t8Var3.f28702l.getText().toString());
                String string = Settings.Secure.getString(userDetails.getContentResolver(), "android_id");
                a.C0190a aVar = nc.a.f14255a;
                long parseLong = Long.parseLong(userDetails.j2().k());
                String l10 = userDetails.j2().l();
                String obj2 = userDetails.l2().getText().toString();
                String stateCode = state.getStateCode();
                boolean d10 = userDetails.j2().d();
                cm.l.c(string);
                String jSONObject = aVar.d(parseLong, l10, obj2, obj, stateCode, d10, string, userDetails.j2().l(), userDetails.j2().e(), userDetails.j2().m()).toString();
                cm.l.e(jSONObject, "toString(...)");
                SaveCitizenProfileService.f9376k.a(userDetails, jSONObject);
            } catch (Exception unused) {
            }
            Context context2 = userDetails.G;
            if (context2 == null) {
                cm.l.v("mContext");
            } else {
                context = context2;
            }
            userDetails.K2(context, userDetails.h2().b(v9.f.f17510a.e0(), "Your profile has been updated successfully"));
            return;
        }
        Toast.makeText(userDetails.getApplicationContext(), userDetails.h2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
    }

    /* access modifiers changed from: private */
    public final void I2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById3).setText(h2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(h2().b("btn_ok", "OK"));
        textView.setOnClickListener(new s(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void J2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void K2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(h2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(h2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new oc.b(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void L2(Dialog dialog, UserDetails userDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(userDetails, "this$0");
        dialog.dismiss();
        t8 t8Var = userDetails.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28697g.setBackground(userDetails.getResources().getDrawable(R.drawable.edit_button_brown));
        t8 t8Var3 = userDetails.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.K.setBackground(userDetails.getResources().getDrawable(R.drawable.blue_button_style));
        t8 t8Var4 = userDetails.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.K.setTextColor(androidx.core.content.a.c(userDetails, R.color.white));
        t8 t8Var5 = userDetails.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.f28697g.setTextColor(androidx.core.content.a.c(userDetails, R.color.black));
        t8 t8Var6 = userDetails.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var6;
        }
        t8Var2.f28703m.setVisibility(8);
        userDetails.O1();
    }

    /* access modifiers changed from: private */
    public final void M2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(h2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(h2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new oc.m(dialog, this));
        dialog.show();
    }

    private final void N1() {
        this.f9392k0 = "gallery";
        this.f9400s0.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
    }

    /* access modifiers changed from: private */
    public static final void N2(Dialog dialog, UserDetails userDetails, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(userDetails, "this$0");
        dialog.dismiss();
        t8 t8Var = userDetails.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28697g.setBackground(userDetails.getResources().getDrawable(R.drawable.edit_button_brown));
        t8 t8Var3 = userDetails.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.K.setBackground(userDetails.getResources().getDrawable(R.drawable.blue_button_style));
        t8 t8Var4 = userDetails.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.K.setTextColor(androidx.core.content.a.c(userDetails, R.color.white));
        t8 t8Var5 = userDetails.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.f28697g.setTextColor(androidx.core.content.a.c(userDetails, R.color.black));
        t8 t8Var6 = userDetails.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var6;
        }
        t8Var2.f28703m.setVisibility(8);
        userDetails.O1();
    }

    private final void O2(String str) {
        RadioButton radioButton;
        String str2;
        RadioButton radioButton2 = null;
        if (str.equals("M")) {
            radioButton = this.N;
            if (radioButton == null) {
                str2 = "maleRadioButton";
            }
            radioButton2 = radioButton;
            radioButton2.setChecked(true);
        } else if (str.equals("F")) {
            radioButton = this.O;
            if (radioButton == null) {
                str2 = "femaleRadioButton";
            }
            radioButton2 = radioButton;
            radioButton2.setChecked(true);
        } else if (str.equals("T")) {
            radioButton = this.P;
            if (radioButton == null) {
                str2 = "otherRadioButton";
            }
            radioButton2 = radioButton;
            radioButton2.setChecked(true);
        } else {
            return;
        }
        cm.l.v(str2);
        radioButton2.setChecked(true);
    }

    private final void R1() {
        String str;
        RadioButton radioButton = this.N;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            cm.l.v("maleRadioButton");
            radioButton = null;
        }
        if (radioButton.isChecked()) {
            str = "M";
        } else {
            RadioButton radioButton3 = this.O;
            if (radioButton3 == null) {
                cm.l.v("femaleRadioButton");
            } else {
                radioButton2 = radioButton3;
            }
            str = radioButton2.isChecked() ? "F" : "T";
        }
        m3(str);
    }

    private final void W1() {
        View findViewById = findViewById(R.id.em_name);
        cm.l.e(findViewById, "findViewById(...)");
        Z2((EditText) findViewById);
        View findViewById2 = findViewById(R.id.em_dob);
        cm.l.e(findViewById2, "findViewById(...)");
        V2((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.em_height);
        cm.l.e(findViewById3, "findViewById(...)");
        W2((EditText) findViewById3);
        View findViewById4 = findViewById(R.id.em_weight);
        cm.l.e(findViewById4, "findViewById(...)");
        b3((EditText) findViewById4);
        View findViewById5 = findViewById(R.id.em_spn);
        cm.l.e(findViewById5, "findViewById(...)");
        this.Q = (Spinner) findViewById5;
        View findViewById6 = findViewById(R.id.em_next);
        cm.l.e(findViewById6, "findViewById(...)");
        this.R = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.profile_txt);
        cm.l.e(findViewById7, "findViewById(...)");
        f3((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.uploadIv);
        cm.l.e(findViewById8, "findViewById(...)");
        k3((CircleImageView) findViewById8);
        View findViewById9 = findViewById(R.id.mvvm_Back);
        cm.l.e(findViewById9, "findViewById(...)");
        c3((ImageView) findViewById9);
        o2().setOnClickListener(new oc.c(this));
        t8 t8Var = this.f9393l0;
        RadioButton radioButton = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28709s.setText(j2().l());
        c.a aVar = ka.c.f13158a;
        if (!aVar.m(j2().h())) {
            t8 t8Var2 = this.f9393l0;
            if (t8Var2 == null) {
                cm.l.v("mBinding");
                t8Var2 = null;
            }
            t8Var2.A.setVisibility(0);
            t8 t8Var3 = this.f9393l0;
            if (t8Var3 == null) {
                cm.l.v("mBinding");
                t8Var3 = null;
            }
            t8Var3.f28707q.setVisibility(0);
            t8 t8Var4 = this.f9393l0;
            if (t8Var4 == null) {
                cm.l.v("mBinding");
                t8Var4 = null;
            }
            t8Var4.f28707q.setText(j2().h());
        } else {
            t8 t8Var5 = this.f9393l0;
            if (t8Var5 == null) {
                cm.l.v("mBinding");
                t8Var5 = null;
            }
            t8Var5.A.setVisibility(0);
            t8 t8Var6 = this.f9393l0;
            if (t8Var6 == null) {
                cm.l.v("mBinding");
                t8Var6 = null;
            }
            t8Var6.f28707q.setVisibility(0);
        }
        if (!aVar.m(j2().j())) {
            t8 t8Var7 = this.f9393l0;
            if (t8Var7 == null) {
                cm.l.v("mBinding");
                t8Var7 = null;
            }
            t8Var7.f28700j.setText(j2().j());
        }
        if (!aVar.m(j2().s())) {
            t8 t8Var8 = this.f9393l0;
            if (t8Var8 == null) {
                cm.l.v("mBinding");
                t8Var8 = null;
            }
            t8Var8.f28706p.setText(j2().j());
        }
        u2().setOnClickListener(new oc.d(this));
        View findViewById10 = findViewById(R.id.em_male);
        cm.l.e(findViewById10, "findViewById(...)");
        this.N = (RadioButton) findViewById10;
        View findViewById11 = findViewById(R.id.em_female);
        cm.l.e(findViewById11, "findViewById(...)");
        this.O = (RadioButton) findViewById11;
        View findViewById12 = findViewById(R.id.em_other);
        cm.l.e(findViewById12, "findViewById(...)");
        this.P = (RadioButton) findViewById12;
        RadioButton radioButton2 = this.N;
        if (radioButton2 == null) {
            cm.l.v("maleRadioButton");
            radioButton2 = null;
        }
        radioButton2.setOnClickListener(new oc.e(this));
        RadioButton radioButton3 = this.O;
        if (radioButton3 == null) {
            cm.l.v("femaleRadioButton");
            radioButton3 = null;
        }
        radioButton3.setOnClickListener(new oc.f(this));
        RadioButton radioButton4 = this.P;
        if (radioButton4 == null) {
            cm.l.v("otherRadioButton");
        } else {
            radioButton = radioButton4;
        }
        radioButton.setOnClickListener(new oc.g(this));
        View findViewById13 = findViewById(R.id.dob_cal);
        cm.l.e(findViewById13, "findViewById(...)");
        Q2((ImageView) findViewById13);
        View findViewById14 = findViewById(R.id.applicant_date);
        cm.l.e(findViewById14, "findViewById(...)");
        R2((TextView) findViewById14);
        View findViewById15 = findViewById(R.id.applicant_month);
        cm.l.e(findViewById15, "findViewById(...)");
        S2((TextView) findViewById15);
        View findViewById16 = findViewById(R.id.applicant_year);
        cm.l.e(findViewById16, "findViewById(...)");
        T2((TextView) findViewById16);
        S1().setOnClickListener(new oc.h(this));
        T1().setOnClickListener(new oc.i());
        U1().setOnClickListener(new oc.j());
        V1().setOnClickListener(new oc.k());
        if (j2().n() != null) {
            l2().setText(j2().n());
        }
        if (!aVar.m(j2().f())) {
            try {
                List l02 = q.l0(j2().f(), new String[]{"-"}, false, 0, 6, (Object) null);
                T1().setText((CharSequence) l02.get(2));
                U1().setText((CharSequence) l02.get(1));
                V1().setText((CharSequence) l02.get(0));
            } catch (Exception unused) {
            }
        }
        O2(j2().i());
        e3();
    }

    /* access modifiers changed from: private */
    public static final void X1(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        RadioButton radioButton = userDetails.N;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            cm.l.v("maleRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = userDetails.O;
        if (radioButton3 == null) {
            cm.l.v("femaleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void Y1(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        userDetails.E2();
    }

    /* access modifiers changed from: private */
    public static final void Z1(View view) {
    }

    /* access modifiers changed from: private */
    public static final void a2(View view) {
    }

    /* access modifiers changed from: private */
    public static final void b2(View view) {
    }

    /* access modifiers changed from: private */
    public static final void c2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        userDetails.finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || userDetails.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            userDetails.N1();
        } else {
            userDetails.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        RadioButton radioButton = userDetails.P;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            cm.l.v("otherRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = userDetails.O;
        if (radioButton3 == null) {
            cm.l.v("femaleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    /* access modifiers changed from: private */
    public final void e3() {
        if (j2().p().length() <= 0 || cm.l.a(j2().p(), "0")) {
            u2().setImageResource(R.drawable.add_profile);
            return;
        }
        Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(j2().p());
        if (c10 != null) {
            u2().setImageBitmap(c10);
        }
        this.f9391j0 = j2().p();
    }

    /* access modifiers changed from: private */
    public static final void f2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        RadioButton radioButton = userDetails.P;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            cm.l.v("otherRadioButton");
            radioButton = null;
        }
        radioButton.setChecked(false);
        RadioButton radioButton3 = userDetails.N;
        if (radioButton3 == null) {
            cm.l.v("maleRadioButton");
        } else {
            radioButton2 = radioButton3;
        }
        radioButton2.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void g2(UserDetails userDetails, d.a aVar) {
        cm.l.f(userDetails, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = userDetails.f9392k0;
            if (cm.l.a(str, "camera")) {
                if (c10 != null) {
                    userDetails.p3(c10);
                }
            } else if (cm.l.a(str, "gallery") && c10 != null) {
                userDetails.x2(c10);
            }
        }
    }

    private final void p3(Intent intent) {
        Bundle extras = intent.getExtras();
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        cm.l.c(bitmap);
        this.f9391j0 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        u2().setImageBitmap(bitmap);
        if (this.f9391j0.length() > 0) {
            new ld.g(this).B(this.f9391j0);
        }
    }

    private final void q3() {
        this.f9392k0 = "camera";
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.f9400s0.a(getIntent());
        }
    }

    private final void x2(Intent intent) {
        Bitmap bitmap;
        Uri data = intent.getData();
        try {
            if (Build.VERSION.SDK_INT > 27) {
                ContentResolver contentResolver = getContentResolver();
                cm.l.c(data);
                ImageDecoder.Source a10 = ImageDecoder.createSource(contentResolver, data);
                cm.l.e(a10, "createSource(...)");
                bitmap = ImageDecoder.decodeBitmap(a10);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
            }
            cm.l.c(bitmap);
            u2().setImageBitmap(bitmap);
            String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
            this.f9391j0 = f10;
            if (f10.length() > 0) {
                new ld.g(this).B(this.f9391j0);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            Toast.makeText(this, "Failed!", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(UserDetails userDetails, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(userDetails, "this$0");
        Calendar calendar = userDetails.T;
        Calendar calendar2 = null;
        if (calendar == null) {
            cm.l.v("myCalendar");
            calendar = null;
        }
        calendar.set(1, i10);
        Calendar calendar3 = userDetails.T;
        if (calendar3 == null) {
            cm.l.v("myCalendar");
            calendar3 = null;
        }
        calendar3.set(2, i11);
        Calendar calendar4 = userDetails.T;
        if (calendar4 == null) {
            cm.l.v("myCalendar");
        } else {
            calendar2 = calendar4;
        }
        calendar2.set(5, i12);
        userDetails.r3();
    }

    /* access modifiers changed from: private */
    public static final void z2(UserDetails userDetails, View view) {
        cm.l.f(userDetails, "this$0");
        t8 t8Var = userDetails.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28697g.setBackground(userDetails.getResources().getDrawable(R.drawable.blue_button_style));
        t8 t8Var3 = userDetails.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.K.setBackground(userDetails.getResources().getDrawable(R.drawable.edit_button_brown));
        t8 t8Var4 = userDetails.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.f28697g.setTextColor(androidx.core.content.a.c(userDetails, R.color.white));
        t8 t8Var5 = userDetails.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.K.setTextColor(androidx.core.content.a.c(userDetails, R.color.black));
        t8 t8Var6 = userDetails.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
            t8Var6 = null;
        }
        t8Var6.f28703m.setVisibility(0);
        t8 t8Var7 = userDetails.f9393l0;
        if (t8Var7 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var7;
        }
        t8Var2.f28710t.setText(userDetails.h2().b(v9.f.f17510a.Q0(), "Update Profile"));
        userDetails.P1();
    }

    public final void O1() {
        t8 t8Var = this.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28702l.setClickable(false);
        t8 t8Var3 = this.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.f28702l.setCursorVisible(false);
        t8 t8Var4 = this.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.f28702l.setFocusableInTouchMode(false);
        t8 t8Var5 = this.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.f28707q.setClickable(false);
        t8 t8Var6 = this.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
            t8Var6 = null;
        }
        t8Var6.f28707q.setCursorVisible(false);
        t8 t8Var7 = this.f9393l0;
        if (t8Var7 == null) {
            cm.l.v("mBinding");
            t8Var7 = null;
        }
        t8Var7.f28707q.setFocusableInTouchMode(false);
        t8 t8Var8 = this.f9393l0;
        if (t8Var8 == null) {
            cm.l.v("mBinding");
            t8Var8 = null;
        }
        t8Var8.f28696f.setEnabled(false);
        t8 t8Var9 = this.f9393l0;
        if (t8Var9 == null) {
            cm.l.v("mBinding");
            t8Var9 = null;
        }
        t8Var9.f28701k.setEnabled(false);
        t8 t8Var10 = this.f9393l0;
        if (t8Var10 == null) {
            cm.l.v("mBinding");
            t8Var10 = null;
        }
        t8Var10.f28699i.setEnabled(false);
        t8 t8Var11 = this.f9393l0;
        if (t8Var11 == null) {
            cm.l.v("mBinding");
            t8Var11 = null;
        }
        t8Var11.f28704n.setEnabled(false);
        t8 t8Var12 = this.f9393l0;
        if (t8Var12 == null) {
            cm.l.v("mBinding");
            t8Var12 = null;
        }
        t8Var12.f28711u.setEnabled(false);
        t8 t8Var13 = this.f9393l0;
        if (t8Var13 == null) {
            cm.l.v("mBinding");
            t8Var13 = null;
        }
        t8Var13.f28705o.setEnabled(false);
        t8 t8Var14 = this.f9393l0;
        if (t8Var14 == null) {
            cm.l.v("mBinding");
            t8Var14 = null;
        }
        t8Var14.f28700j.setCursorVisible(false);
        t8 t8Var15 = this.f9393l0;
        if (t8Var15 == null) {
            cm.l.v("mBinding");
            t8Var15 = null;
        }
        t8Var15.f28706p.setCursorVisible(false);
        t8 t8Var16 = this.f9393l0;
        if (t8Var16 == null) {
            cm.l.v("mBinding");
            t8Var16 = null;
        }
        t8Var16.f28700j.setFocusableInTouchMode(false);
        t8 t8Var17 = this.f9393l0;
        if (t8Var17 == null) {
            cm.l.v("mBinding");
            t8Var17 = null;
        }
        t8Var17.f28706p.setFocusableInTouchMode(false);
        t8 t8Var18 = this.f9393l0;
        if (t8Var18 == null) {
            cm.l.v("mBinding");
            t8Var18 = null;
        }
        t8Var18.f28700j.setClickable(false);
        t8 t8Var19 = this.f9393l0;
        if (t8Var19 == null) {
            cm.l.v("mBinding");
            t8Var19 = null;
        }
        t8Var19.f28706p.setClickable(false);
        t8 t8Var20 = this.f9393l0;
        if (t8Var20 == null) {
            cm.l.v("mBinding");
            t8Var20 = null;
        }
        t8Var20.f28692b.setClickable(false);
        t8 t8Var21 = this.f9393l0;
        if (t8Var21 == null) {
            cm.l.v("mBinding");
            t8Var21 = null;
        }
        t8Var21.f28694d.setClickable(false);
        t8 t8Var22 = this.f9393l0;
        if (t8Var22 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var22;
        }
        t8Var2.f28695e.setClickable(false);
        S1().setClickable(false);
        T1().setClickable(false);
        U1().setClickable(false);
        V1().setClickable(false);
    }

    public final void P1() {
        t8 t8Var = this.f9393l0;
        t8 t8Var2 = null;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        t8Var.f28702l.setClickable(true);
        t8 t8Var3 = this.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.f28702l.setCursorVisible(true);
        t8 t8Var4 = this.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.f28702l.setEnabled(true);
        t8 t8Var5 = this.f9393l0;
        if (t8Var5 == null) {
            cm.l.v("mBinding");
            t8Var5 = null;
        }
        t8Var5.f28702l.setFocusableInTouchMode(true);
        t8 t8Var6 = this.f9393l0;
        if (t8Var6 == null) {
            cm.l.v("mBinding");
            t8Var6 = null;
        }
        t8Var6.f28707q.setClickable(true);
        t8 t8Var7 = this.f9393l0;
        if (t8Var7 == null) {
            cm.l.v("mBinding");
            t8Var7 = null;
        }
        t8Var7.f28707q.setCursorVisible(true);
        t8 t8Var8 = this.f9393l0;
        if (t8Var8 == null) {
            cm.l.v("mBinding");
            t8Var8 = null;
        }
        t8Var8.f28707q.setEnabled(true);
        t8 t8Var9 = this.f9393l0;
        if (t8Var9 == null) {
            cm.l.v("mBinding");
            t8Var9 = null;
        }
        t8Var9.f28707q.setFocusableInTouchMode(true);
        t8 t8Var10 = this.f9393l0;
        if (t8Var10 == null) {
            cm.l.v("mBinding");
            t8Var10 = null;
        }
        t8Var10.f28696f.setEnabled(true);
        t8 t8Var11 = this.f9393l0;
        if (t8Var11 == null) {
            cm.l.v("mBinding");
            t8Var11 = null;
        }
        t8Var11.f28701k.setEnabled(true);
        t8 t8Var12 = this.f9393l0;
        if (t8Var12 == null) {
            cm.l.v("mBinding");
            t8Var12 = null;
        }
        t8Var12.f28699i.setEnabled(true);
        t8 t8Var13 = this.f9393l0;
        if (t8Var13 == null) {
            cm.l.v("mBinding");
            t8Var13 = null;
        }
        t8Var13.f28704n.setEnabled(true);
        t8 t8Var14 = this.f9393l0;
        if (t8Var14 == null) {
            cm.l.v("mBinding");
            t8Var14 = null;
        }
        t8Var14.f28711u.setEnabled(true);
        t8 t8Var15 = this.f9393l0;
        if (t8Var15 == null) {
            cm.l.v("mBinding");
            t8Var15 = null;
        }
        t8Var15.f28705o.setEnabled(true);
        t8 t8Var16 = this.f9393l0;
        if (t8Var16 == null) {
            cm.l.v("mBinding");
            t8Var16 = null;
        }
        t8Var16.f28700j.setCursorVisible(true);
        t8 t8Var17 = this.f9393l0;
        if (t8Var17 == null) {
            cm.l.v("mBinding");
            t8Var17 = null;
        }
        t8Var17.f28706p.setCursorVisible(true);
        t8 t8Var18 = this.f9393l0;
        if (t8Var18 == null) {
            cm.l.v("mBinding");
            t8Var18 = null;
        }
        t8Var18.f28700j.setClickable(true);
        t8 t8Var19 = this.f9393l0;
        if (t8Var19 == null) {
            cm.l.v("mBinding");
            t8Var19 = null;
        }
        t8Var19.f28706p.setClickable(true);
        t8 t8Var20 = this.f9393l0;
        if (t8Var20 == null) {
            cm.l.v("mBinding");
            t8Var20 = null;
        }
        t8Var20.f28692b.setClickable(true);
        t8 t8Var21 = this.f9393l0;
        if (t8Var21 == null) {
            cm.l.v("mBinding");
            t8Var21 = null;
        }
        t8Var21.f28694d.setClickable(true);
        t8 t8Var22 = this.f9393l0;
        if (t8Var22 == null) {
            cm.l.v("mBinding");
            t8Var22 = null;
        }
        t8Var22.f28695e.setClickable(true);
        S1().setClickable(true);
        T1().setClickable(true);
        U1().setClickable(true);
        V1().setClickable(true);
        t8 t8Var23 = this.f9393l0;
        if (t8Var23 == null) {
            cm.l.v("mBinding");
            t8Var23 = null;
        }
        t8Var23.f28700j.setFocusableInTouchMode(true);
        t8 t8Var24 = this.f9393l0;
        if (t8Var24 == null) {
            cm.l.v("mBinding");
        } else {
            t8Var2 = t8Var24;
        }
        t8Var2.f28706p.setFocusableInTouchMode(true);
    }

    public final void P2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final ArrayList Q1() {
        ArrayList arrayList = this.f9389h0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("bloodgroup");
        return null;
    }

    public final void Q2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.Z = imageView;
    }

    public final void R2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f9383b0 = textView;
    }

    public final ImageView S1() {
        ImageView imageView = this.Z;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("dobCalendar");
        return null;
    }

    public final void S2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f9384c0 = textView;
    }

    public final TextView T1() {
        TextView textView = this.f9383b0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dobDate");
        return null;
    }

    public final void T2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f9385d0 = textView;
    }

    public final TextView U1() {
        TextView textView = this.f9384c0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dobMonth");
        return null;
    }

    public final void U2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9399r0 = cVar;
    }

    public final TextView V1() {
        TextView textView = this.f9385d0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dobYear");
        return null;
    }

    public final void V2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void W2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.L = editText;
    }

    public final void X2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f9387f0 = gVar;
    }

    public final void Y2(qc.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void Z2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.J = editText;
    }

    public final void a3(UserBloodDetails userBloodDetails) {
        cm.l.f(userBloodDetails, "<set-?>");
        this.I = userBloodDetails;
    }

    public final void b3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.M = editText;
    }

    public final void c3(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f9382a0 = imageView;
    }

    public final void d3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f9388g0 = progressDialog;
    }

    public final void f3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f9386e0 = textView;
    }

    public final void g3(CreateAccountServices createAccountServices) {
        cm.l.f(createAccountServices, "<set-?>");
        this.f9396o0 = createAccountServices;
    }

    public final ld.c h2() {
        ld.c cVar = this.f9399r0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void h3(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final EditText i2() {
        EditText editText = this.L;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mHeight");
        return null;
    }

    public final void i3(StateMaster stateMaster) {
        cm.l.f(stateMaster, "it");
        t8 t8Var = null;
        try {
            if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                p2().dismiss();
                ArrayList<State> states = stateMaster.getStates();
                cm.l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
                this.f9397p0 = states;
                Collections.sort(states);
                this.f9397p0.add(0, new State("Select State", "0", false, false, 1));
                q8.a aVar = new q8.a(this, this.f9397p0);
                t8 t8Var2 = this.f9393l0;
                if (t8Var2 == null) {
                    cm.l.v("mBinding");
                    t8Var2 = null;
                }
                t8Var2.f28711u.setAdapter(aVar);
                int size = this.f9397p0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (cm.l.a(((State) this.f9397p0.get(i10)).getStateCode(), j2().q())) {
                        t8 t8Var3 = this.f9393l0;
                        if (t8Var3 == null) {
                            cm.l.v("mBinding");
                            t8Var3 = null;
                        }
                        t8Var3.f28711u.setSelection(i10);
                        return;
                    }
                }
                return;
            }
            p2().dismiss();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new State("Select State", "0", false, false, 1));
            q8.a aVar2 = new q8.a(this, arrayList);
            t8 t8Var4 = this.f9393l0;
            if (t8Var4 == null) {
                cm.l.v("mBinding");
                t8Var4 = null;
            }
            t8Var4.f28711u.setAdapter(aVar2);
        } catch (Exception e10) {
            p2().dismiss();
            e10.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            q8.a aVar3 = new q8.a(this, arrayList2);
            t8 t8Var5 = this.f9393l0;
            if (t8Var5 == null) {
                cm.l.v("mBinding");
            } else {
                t8Var = t8Var5;
            }
            t8Var.f28711u.setAdapter(aVar3);
        }
    }

    public final ld.g j2() {
        ld.g gVar = this.f9387f0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final void j3(String str) {
        cm.l.f(str, "<set-?>");
        this.f9395n0 = str;
    }

    public final qc.b k2() {
        qc.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mUserBloodViewModel");
        return null;
    }

    public final void k3(CircleImageView circleImageView) {
        cm.l.f(circleImageView, "<set-?>");
        this.f9390i0 = circleImageView;
    }

    public final EditText l2() {
        EditText editText = this.J;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mUserName");
        return null;
    }

    public final void l3(String str) {
        cm.l.f(str, "<set-?>");
        this.f9391j0 = str;
    }

    public final UserBloodDetails m2() {
        UserBloodDetails userBloodDetails = this.I;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        cm.l.v("mUserService");
        return null;
    }

    public final void m3(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final EditText n2() {
        EditText editText = this.M;
        if (editText != null) {
            return editText;
        }
        cm.l.v("mWeight");
        return null;
    }

    public final void n3(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f9398q0 = gVar;
    }

    public final ImageView o2() {
        ImageView imageView = this.f9382a0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("mvvm_back");
        return null;
    }

    public final void o3(v8.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.f9394m0 = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t8 c10 = t8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f9393l0 = c10;
        LinearLayout linearLayout = null;
        if (c10 == null) {
            cm.l.v("mBinding");
            c10 = null;
        }
        setContentView((View) c10.b());
        this.G = this;
        e.a aVar = v9.e.f17509a;
        t8 t8Var = this.f9393l0;
        if (t8Var == null) {
            cm.l.v("mBinding");
            t8Var = null;
        }
        aVar.X1(this, t8Var);
        U2(new ld.c(this));
        X2(new ld.g(this));
        n3(new ld.g(this));
        CreateAccountServices.a aVar2 = CreateAccountServices.f7640a;
        Context context = this.G;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        g3(aVar2.c(context));
        UserBloodDetails.a aVar3 = UserBloodDetails.f9372a;
        Context context2 = this.G;
        if (context2 == null) {
            cm.l.v("mContext");
            context2 = null;
        }
        a3(aVar3.c(context2));
        W1();
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.T = instance;
        O1();
        this.S = new oc.l(this);
        Y2((qc.b) new u0((x0) this, (u0.b) new qc.a(new pc.a(m2()))).a(qc.b.class));
        a.C0121a aVar4 = com.nic.mparivahan.a.f9624a;
        if (aVar4.a(this)) {
            Log.e("ProfileCalling", "test");
            Context context3 = this.G;
            if (context3 == null) {
                cm.l.v("mContext");
                context3 = null;
            }
            d3(new ProgressDialog(context3));
            p2().setMessage("Please wait...");
            p2().setCancelable(false);
            p2().setCanceledOnTouchOutside(false);
            p2().show();
            k2().u();
        } else {
            Toast.makeText(getApplicationContext(), h2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
        }
        t8 t8Var2 = this.f9393l0;
        if (t8Var2 == null) {
            cm.l.v("mBinding");
            t8Var2 = null;
        }
        t8Var2.f28697g.setOnClickListener(new oc.n(this));
        t8 t8Var3 = this.f9393l0;
        if (t8Var3 == null) {
            cm.l.v("mBinding");
            t8Var3 = null;
        }
        t8Var3.K.setOnClickListener(new oc.o(this));
        k2().m().g(this, new o(new j(this)));
        k2().l().g(this, new o(new k(this)));
        k2().p().g(this, new o(new l(this)));
        R1();
        Spinner spinner = this.Q;
        if (spinner == null) {
            cm.l.v("mSpinner");
            spinner = null;
        }
        spinner.setOnItemSelectedListener(new m(this));
        t8 t8Var4 = this.f9393l0;
        if (t8Var4 == null) {
            cm.l.v("mBinding");
            t8Var4 = null;
        }
        t8Var4.f28711u.setOnItemSelectedListener(new n(this));
        LinearLayout linearLayout2 = this.R;
        if (linearLayout2 == null) {
            cm.l.v("em_next");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setOnClickListener(new p(this));
        k2().o().g(this, new o(new b(this)));
        k2().q().g(this, new o(new c(this)));
        k2().s().g(this, new o(new d(this)));
        k2().r().g(this, new o(new e(this)));
        k2().k().g(this, new o(new f(this)));
        k2().t().g(this, new o(new g(this)));
        k2().j().g(this, new o(new h(this)));
        k2().h().g(this, new o(new i(this)));
        o3((v8.b) new u0((x0) this, (u0.b) new v8.a(new s8.a(r2()))).a(v8.b.class));
        if (aVar4.a(this)) {
            String f10 = new ld.e(this).f();
            if (f10.equals("0")) {
                p2().show();
                w2().q();
            } else {
                try {
                    Object j10 = new i7.d().j(f10, StateMaster.class);
                    cm.l.e(j10, "fromJson(...)");
                    i3((StateMaster) j10);
                } catch (Exception unused) {
                }
            }
        } else {
            Toast.makeText(getApplicationContext(), h2().b("label_log_check_internet", "Please check your internet connection"), 1).show();
        }
        w2().p().g(this, new q(this));
        w2().s().g(this, new r(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String string;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                string = getString(R.string.enable_manual_setting);
            } else {
                q3();
                return;
            }
        } else if (i10 == 10001) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                string = "Permission denied";
            } else {
                N1();
                return;
            }
        } else {
            return;
        }
        Toast.makeText(this, string, 0).show();
    }

    public final ProgressDialog p2() {
        ProgressDialog progressDialog = this.f9388g0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView q2() {
        TextView textView = this.f9386e0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("profile_txt");
        return null;
    }

    public final CreateAccountServices r2() {
        CreateAccountServices createAccountServices = this.f9396o0;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public void r3() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        TextView T1 = T1();
        Calendar calendar = this.T;
        Calendar calendar2 = null;
        if (calendar == null) {
            cm.l.v("myCalendar");
            calendar = null;
        }
        CharSequence format = DateFormat.format("dd", calendar.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        T1.setText((String) format);
        TextView U1 = U1();
        Calendar calendar3 = this.T;
        if (calendar3 == null) {
            cm.l.v("myCalendar");
            calendar3 = null;
        }
        CharSequence format2 = DateFormat.format("MM", calendar3.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        U1.setText((String) format2);
        TextView V1 = V1();
        Calendar calendar4 = this.T;
        if (calendar4 == null) {
            cm.l.v("myCalendar");
            calendar4 = null;
        }
        CharSequence format3 = DateFormat.format("yyyy", calendar4.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        V1.setText((String) format3);
        StringBuilder sb2 = new StringBuilder();
        Calendar calendar5 = this.T;
        if (calendar5 == null) {
            cm.l.v("myCalendar");
            calendar5 = null;
        }
        CharSequence format4 = DateFormat.format("dd", calendar5.getTime());
        cm.l.d(format4, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) format4);
        sb2.append('-');
        Calendar calendar6 = this.T;
        if (calendar6 == null) {
            cm.l.v("myCalendar");
            calendar6 = null;
        }
        CharSequence format5 = DateFormat.format("MM", calendar6.getTime());
        cm.l.d(format5, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) format5);
        sb2.append('-');
        Calendar calendar7 = this.T;
        if (calendar7 == null) {
            cm.l.v("myCalendar");
        } else {
            calendar2 = calendar7;
        }
        CharSequence format6 = DateFormat.format("yyyy", calendar2.getTime());
        cm.l.d(format6, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) format6);
        P2(sb2.toString());
    }

    public final String s2() {
        String str = this.f9395n0;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final ArrayList t2() {
        return this.f9397p0;
    }

    public final CircleImageView u2() {
        CircleImageView circleImageView = this.f9390i0;
        if (circleImageView != null) {
            return circleImageView;
        }
        cm.l.v("uploadIv");
        return null;
    }

    public final ld.g v2() {
        ld.g gVar = this.f9398q0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("userSessionManager");
        return null;
    }

    public final v8.b w2() {
        v8.b bVar = this.f9394m0;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
