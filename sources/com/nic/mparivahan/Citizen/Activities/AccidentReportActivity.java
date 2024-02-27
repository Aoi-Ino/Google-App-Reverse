package com.nic.mparivahan.Citizen.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import cm.m;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.R;
import d9.a0;
import d9.c0;
import d9.d0;
import d9.e0;
import d9.f0;
import d9.g0;
import d9.h0;
import d9.i0;
import d9.j0;
import d9.t;
import d9.u;
import d9.v;
import d9.w;
import d9.y;
import d9.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import pl.x;
import v9.e;

public final class AccidentReportActivity extends androidx.appcompat.app.d {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f7766b0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public ni.g G;
    public Context H;
    public ld.g I;
    public k9.b J;
    private OffenceInterface K;
    public String L;
    public ArrayList M;
    public String N;
    public EditText O;
    public TextView P;
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private boolean V;
    public ld.c W;
    private String X = "NA";
    private String Y = "";
    private d.c Z;

    /* renamed from: a0  reason: collision with root package name */
    private d.c f7767a0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7768e;

        b(AccidentReportActivity accidentReportActivity) {
            this.f7768e = accidentReportActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            AccidentReportActivity accidentReportActivity = this.f7768e;
            accidentReportActivity.w2(i10 == 0 ? "Select State" : ((Name) accidentReportActivity.T1().get(i10)).getStateCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7769e = accidentReportActivity;
        }

        public final void b(VerifyVehicleResponseModel verifyVehicleResponseModel) {
            AccidentReportActivity accidentReportActivity;
            ni.g w12 = this.f7769e.G;
            ni.g gVar = null;
            if (w12 == null) {
                l.v("binding");
                w12 = null;
            }
            w12.f26390b.setVisibility(8);
            try {
                if (p.o(verifyVehicleResponseModel.getStatusCode(), "NP001", true)) {
                    ni.g w13 = this.f7769e.G;
                    if (w13 == null) {
                        l.v("binding");
                    } else {
                        gVar = w13;
                    }
                    gVar.f26390b.setVisibility(8);
                    this.f7769e.t2(true);
                    this.f7769e.C2();
                    return;
                }
                if (p.o(verifyVehicleResponseModel.getStatusCode(), "NR005", true)) {
                    ni.g w14 = this.f7769e.G;
                    if (w14 == null) {
                        l.v("binding");
                    } else {
                        gVar = w14;
                    }
                    gVar.f26390b.setVisibility(8);
                    this.f7769e.t2(false);
                    accidentReportActivity = this.f7769e;
                } else {
                    ni.g w15 = this.f7769e.G;
                    if (w15 == null) {
                        l.v("binding");
                    } else {
                        gVar = w15;
                    }
                    gVar.f26390b.setVisibility(8);
                    this.f7769e.t2(false);
                    accidentReportActivity = this.f7769e;
                }
                accidentReportActivity.i2(verifyVehicleResponseModel.getStatusDesc());
            } catch (Exception unused) {
                AccidentReportActivity accidentReportActivity2 = this.f7769e;
                accidentReportActivity2.i2(accidentReportActivity2.R1().b("vehicle_not_found", "Vehicle Data Not Found"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VerifyVehicleResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7770e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7770e = accidentReportActivity;
        }

        public final void b(String str) {
            ni.g w12 = this.f7770e.G;
            if (w12 == null) {
                l.v("binding");
                w12 = null;
            }
            w12.f26390b.setVisibility(8);
            this.f7770e.t2(false);
            AccidentReportActivity accidentReportActivity = this.f7770e;
            accidentReportActivity.i2(accidentReportActivity.R1().b("vehicle_not_found", "Vehicle Data Not Found"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7771e = accidentReportActivity;
        }

        public final void b(SubmitOffenceReport submitOffenceReport) {
            try {
                ni.g w12 = this.f7771e.G;
                ni.g gVar = null;
                if (w12 == null) {
                    l.v("binding");
                    w12 = null;
                }
                w12.f26390b.setVisibility(8);
                if (l.a(submitOffenceReport.getStatusCode(), "ACCD001")) {
                    ni.g w13 = this.f7771e.G;
                    if (w13 == null) {
                        l.v("binding");
                    } else {
                        gVar = w13;
                    }
                    gVar.f26408t.setSelection(0);
                    this.f7771e.k2("Accident Report has been submitted successfully");
                    return;
                }
                this.f7771e.i2(submitOffenceReport.getStatusDesc());
            } catch (Exception unused) {
                this.f7771e.i2("Something went wrong, Please try after some time!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitOffenceReport) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7772e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7772e = accidentReportActivity;
        }

        public final void b(String str) {
            ni.g w12 = this.f7772e.G;
            if (w12 == null) {
                l.v("binding");
                w12 = null;
            }
            w12.f26390b.setVisibility(8);
            this.f7772e.i2("Something went wrong, Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7773e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7773e = accidentReportActivity;
        }

        public final void b(GetStated getStated) {
            ni.g gVar = null;
            try {
                if (p.o(getStated.getStatusCode(), "MSTR001", true)) {
                    ni.g w12 = this.f7773e.G;
                    if (w12 == null) {
                        l.v("binding");
                        w12 = null;
                    }
                    w12.f26390b.setVisibility(8);
                    this.f7773e.v2(getStated.getStates());
                    ArrayList T1 = this.f7773e.T1();
                    String string = this.f7773e.getResources().getString(R.string.select_state);
                    l.e(string, "getString(...)");
                    T1.add(0, new Name(string, "0", false));
                    AccidentReportActivity accidentReportActivity = this.f7773e;
                    e9.c cVar = new e9.c(accidentReportActivity, accidentReportActivity.T1());
                    ni.g w13 = this.f7773e.G;
                    if (w13 == null) {
                        l.v("binding");
                        w13 = null;
                    }
                    w13.f26408t.setAdapter((SpinnerAdapter) cVar);
                    return;
                }
                ni.g w14 = this.f7773e.G;
                if (w14 == null) {
                    l.v("binding");
                    w14 = null;
                }
                w14.f26390b.setVisibility(8);
            } catch (Exception e10) {
                ni.g w15 = this.f7773e.G;
                if (w15 == null) {
                    l.v("binding");
                } else {
                    gVar = w15;
                }
                gVar.f26390b.setVisibility(8);
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStated) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7774e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AccidentReportActivity accidentReportActivity) {
            super(1);
            this.f7774e = accidentReportActivity;
        }

        public final void b(String str) {
            ni.g w12 = this.f7774e.G;
            if (w12 == null) {
                l.v("binding");
                w12 = null;
            }
            w12.f26390b.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7775a;

        i(bm.l lVar) {
            l.f(lVar, "function");
            this.f7775a = lVar;
        }

        public final pl.c a() {
            return this.f7775a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7775a.invoke(obj);
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

    public static final class j extends i4.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccidentReportActivity f7776a;

        j(AccidentReportActivity accidentReportActivity) {
            this.f7776a = accidentReportActivity;
        }

        public void b(LocationResult locationResult) {
            l.f(locationResult, "locationResult");
            super.b(locationResult);
            for (Location location : locationResult.c()) {
                this.f7776a.N1(location.getLatitude(), location.getLongitude());
            }
        }
    }

    public AccidentReportActivity() {
        d.c y02 = y0(new e.d(), new u(this));
        l.e(y02, "registerForActivityResult(...)");
        this.Z = y02;
        d.c y03 = y0(new e.d(), new v(this));
        l.e(y03, "registerForActivityResult(...)");
        this.f7767a0 = y03;
    }

    private final void A1() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.enable_gps_location);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_allow);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new w(dialog));
        ((TextView) findViewById).setOnClickListener(new d9.x(dialog, this));
        dialog.show();
    }

    private final void A2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        builder.setItems((CharSequence[]) (this.T.length() > 0 ? new String[]{"Select video from gallery", "Capture video from camera", "Remove photo"} : new String[]{"Select video from gallery", "Capture video from camera"}), new c0(this));
        builder.show();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void B2(AccidentReportActivity accidentReportActivity, DialogInterface dialogInterface, int i10) {
        l.f(accidentReportActivity, "this$0");
        if (i10 == 0) {
            accidentReportActivity.m2();
        } else if (i10 == 1) {
            accidentReportActivity.E2();
        } else if (i10 == 2) {
            accidentReportActivity.F1();
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(Dialog dialog, AccidentReportActivity accidentReportActivity, View view) {
        l.f(dialog, "$d");
        l.f(accidentReportActivity, "this$0");
        dialog.dismiss();
        accidentReportActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* access modifiers changed from: private */
    public final void C2() {
        k9.b P1;
        String k10;
        String str;
        String Q1;
        String valueOf;
        String obj;
        String valueOf2;
        String obj2;
        String obj3;
        String U1;
        String n10;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        String l10;
        String e10;
        try {
            ni.g gVar = this.G;
            ni.g gVar2 = null;
            if (gVar == null) {
                l.v("binding");
                gVar = null;
            }
            gVar.f26390b.setVisibility(0);
            String string = Settings.Secure.getString(O1().getContentResolver(), "android_id");
            Object systemService = getSystemService("location");
            l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                j9.a aVar = new j9.a(this);
                if (Q1() != null) {
                    if (l.a(Q1(), getResources().getString(R.string.location_not_find))) {
                        ni.g gVar3 = this.G;
                        if (gVar3 == null) {
                            l.v("binding");
                            gVar3 = null;
                        }
                        gVar3.f26390b.setVisibility(0);
                        P1 = P1();
                        k10 = S1().k();
                        str = "1";
                        Q1 = J1().getText().toString();
                        valueOf = String.valueOf(aVar.f12765j);
                        obj = J1().getText().toString();
                        valueOf2 = String.valueOf(aVar.f12766k);
                        ni.g gVar4 = this.G;
                        if (gVar4 == null) {
                            l.v("binding");
                            gVar4 = null;
                        }
                        obj2 = gVar4.f26397i.getText().toString();
                        ni.g gVar5 = this.G;
                        if (gVar5 == null) {
                            l.v("binding");
                        } else {
                            gVar2 = gVar5;
                        }
                        obj3 = gVar2.f26393e.getText().toString();
                        U1 = U1();
                        n10 = S1().n();
                        str2 = this.R;
                        str3 = this.S;
                        str4 = this.T;
                        str5 = this.U;
                        z10 = this.V;
                        l10 = S1().l();
                        l.c(string);
                        e10 = S1().e();
                    } else {
                        ni.g gVar6 = this.G;
                        if (gVar6 == null) {
                            l.v("binding");
                            gVar6 = null;
                        }
                        gVar6.f26390b.setVisibility(0);
                        P1 = P1();
                        k10 = S1().k();
                        str = "1";
                        Q1 = Q1();
                        valueOf = String.valueOf(aVar.f12765j);
                        obj = J1().getText().toString();
                        valueOf2 = String.valueOf(aVar.f12766k);
                        ni.g gVar7 = this.G;
                        if (gVar7 == null) {
                            l.v("binding");
                            gVar7 = null;
                        }
                        obj2 = gVar7.f26397i.getText().toString();
                        ni.g gVar8 = this.G;
                        if (gVar8 == null) {
                            l.v("binding");
                        } else {
                            gVar2 = gVar8;
                        }
                        obj3 = gVar2.f26393e.getText().toString();
                        U1 = U1();
                        n10 = S1().n();
                        str2 = this.R;
                        str3 = this.S;
                        str4 = this.T;
                        str5 = this.U;
                        z10 = this.V;
                        l10 = S1().l();
                        l.c(string);
                        e10 = S1().e();
                    }
                    P1.Y(k10, str, Q1, valueOf, obj, valueOf2, obj2, obj3, U1, n10, str2, str3, str4, str5, z10, l10, string, e10);
                    return;
                }
            }
            A1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final void D1() {
        try {
            this.Q = "gallery";
            this.Z.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        } catch (Exception unused) {
        }
    }

    private final void D2() {
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.Z.a(getIntent());
        }
    }

    private final void E1() {
        this.R = "";
        this.S = "";
        ni.g gVar = this.G;
        if (gVar == null) {
            l.v("binding");
            gVar = null;
        }
        gVar.f26399k.setImageResource(R.drawable.ic_photo_add);
    }

    private final void E2() {
        this.Y = "videoType";
        this.Q = "";
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            setIntent(new Intent("android.media.action.VIDEO_CAPTURE"));
            getIntent().putExtra("android.intent.extra.sizeLimit", 8388608);
            getIntent().putExtra("return-data", true);
            getIntent().putExtra("android.intent.extra.videoQuality", 0);
            this.f7767a0.a(getIntent());
        }
    }

    private final void F1() {
        this.T = "";
        this.U = "";
        ni.g gVar = this.G;
        if (gVar == null) {
            l.v("binding");
            gVar = null;
        }
        gVar.f26400l.setImageResource(R.drawable.ic_video_add);
    }

    private final void G1(Uri uri) {
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            l.c(openInputStream);
            byte[] H1 = H1(openInputStream);
            l.c(H1);
            String encodeToString = Base64.encodeToString(H1, 0);
            l.e(encodeToString, "encodeToString(...)");
            this.T = encodeToString;
            this.T = p.w(p.w(encodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final String L1(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        l.e(contentResolver, "getContentResolver(...)");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        l.e(singleton, "getSingleton(...)");
        l.c(uri);
        return singleton.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    /* access modifiers changed from: private */
    public static final void M1(AccidentReportActivity accidentReportActivity, d.a aVar) {
        l.f(accidentReportActivity, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = accidentReportActivity.Q;
            if (l.a(str, "camera")) {
                if (c10 != null) {
                    accidentReportActivity.x2(c10);
                }
            } else if (l.a(str, "gallery") && c10 != null) {
                accidentReportActivity.a2(c10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(Calendar calendar, AccidentReportActivity accidentReportActivity, TimePicker timePicker, int i10, int i11) {
        l.f(accidentReportActivity, "this$0");
        calendar.set(11, i10);
        calendar.set(12, i11);
        accidentReportActivity.K1().setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void X1(View view) {
    }

    /* access modifiers changed from: private */
    public static final void Z1(AccidentReportActivity accidentReportActivity, d.a aVar) {
        Long l10;
        l.f(accidentReportActivity, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            ni.g gVar = null;
            Uri data = c10 != null ? c10.getData() : null;
            if (data != null) {
                try {
                    l10 = Long.valueOf(accidentReportActivity.Y1(data));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                l10 = null;
            }
            if (!ka.c.f13158a.m(String.valueOf(l10))) {
                l.c(l10);
                if (((int) l10.longValue()) <= 8000000) {
                    ni.g gVar2 = accidentReportActivity.G;
                    if (gVar2 == null) {
                        l.v("binding");
                    } else {
                        gVar = gVar2;
                    }
                    gVar.f26400l.setImageResource(R.drawable.video_uploaded);
                    accidentReportActivity.G1(data);
                    StringBuilder sb2 = new StringBuilder();
                    String lastPathSegment = data.getLastPathSegment();
                    l.c(lastPathSegment);
                    sb2.append(lastPathSegment);
                    sb2.append('.');
                    sb2.append(accidentReportActivity.L1(data));
                    accidentReportActivity.U = sb2.toString();
                    return;
                }
            }
            accidentReportActivity.i2(accidentReportActivity.R1().b("cs_note", "Video size must be equal or less than 8mb"));
        }
    }

    private final void a2(Intent intent) {
        Bitmap bitmap;
        Uri data = intent.getData();
        try {
            if (Build.VERSION.SDK_INT > 27) {
                ContentResolver contentResolver = getContentResolver();
                l.c(data);
                ImageDecoder.Source a10 = ImageDecoder.createSource(contentResolver, data);
                l.e(a10, "createSource(...)");
                bitmap = ImageDecoder.decodeBitmap(a10);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
            }
            l.c(bitmap);
            ni.g gVar = this.G;
            String str = null;
            if (gVar == null) {
                l.v("binding");
                gVar = null;
            }
            gVar.f26399k.setImageResource(R.drawable.uploaded_img);
            this.R = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
            StringBuilder sb2 = new StringBuilder();
            if (data != null) {
                str = data.getLastPathSegment();
            }
            l.c(str);
            sb2.append(str);
            sb2.append('.');
            sb2.append(L1(data));
            this.S = sb2.toString();
        } catch (IOException e10) {
            e10.printStackTrace();
            Toast.makeText(this, "Failed!", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(AccidentReportActivity accidentReportActivity, View view) {
        l.f(accidentReportActivity, "this$0");
        accidentReportActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(AccidentReportActivity accidentReportActivity, View view) {
        l.f(accidentReportActivity, "this$0");
        accidentReportActivity.startActivity(new Intent(accidentReportActivity, AccidentDashboardActivity.class));
        accidentReportActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(AccidentReportActivity accidentReportActivity, View view) {
        l.f(accidentReportActivity, "this$0");
        accidentReportActivity.startActivity(new Intent(accidentReportActivity, AccidentHistoryActivity.class));
        accidentReportActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void e2(View view) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r12 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r0.f26397i.requestFocus();
        r12 = r11.R1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r12 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f2(com.nic.mparivahan.Citizen.Activities.AccidentReportActivity r11, android.view.View r12) {
        /*
            java.lang.String r12 = "this$0"
            cm.l.f(r11, r12)
            ni.g r12 = r11.G
            r0 = 0
            java.lang.String r1 = "binding"
            if (r12 != 0) goto L_0x0010
            cm.l.v(r1)
            r12 = r0
        L_0x0010:
            android.widget.EditText r12 = r12.f26397i
            android.text.Editable r12 = r12.getText()
            java.lang.String r2 = "getText(...)"
            cm.l.e(r12, r2)
            int r12 = r12.length()
            java.lang.String r3 = "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"
            java.lang.String r4 = "label_challan_rc_validation"
            if (r12 != 0) goto L_0x0026
            goto L_0x003b
        L_0x0026:
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x002e
            cm.l.v(r1)
            r12 = r0
        L_0x002e:
            android.widget.EditText r12 = r12.f26397i
            android.text.Editable r12 = r12.getText()
            int r12 = r12.length()
            r5 = 4
            if (r12 >= r5) goto L_0x0056
        L_0x003b:
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x0043
        L_0x003f:
            cm.l.v(r1)
            goto L_0x0044
        L_0x0043:
            r0 = r12
        L_0x0044:
            android.widget.EditText r12 = r0.f26397i
            r12.requestFocus()
            ld.c r12 = r11.R1()
            java.lang.String r12 = r12.b(r4, r3)
        L_0x0051:
            r11.i2(r12)
            goto L_0x0192
        L_0x0056:
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x005e
            cm.l.v(r1)
            r12 = r0
        L_0x005e:
            android.widget.EditText r12 = r12.f26397i
            android.text.Editable r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            km.f r5 = new km.f
            java.lang.String r6 = "[a-zA-Z0-9]*"
            r5.<init>((java.lang.String) r6)
            boolean r12 = r5.a(r12)
            if (r12 != 0) goto L_0x007a
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x0043
            goto L_0x003f
        L_0x007a:
            android.widget.EditText r12 = r11.J1()
            android.text.Editable r12 = r12.getText()
            cm.l.e(r12, r2)
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0097
            android.widget.EditText r12 = r11.J1()
            r12.requestFocus()
            r11.A1()
            goto L_0x0192
        L_0x0097:
            java.lang.String r12 = r11.U1()
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2132019090(0x7f140792, float:1.9676505E38)
            java.lang.String r3 = r3.getString(r4)
            boolean r12 = cm.l.a(r12, r3)
            if (r12 == 0) goto L_0x00b9
            ld.c r12 = r11.R1()
            java.lang.String r0 = "label_log_sel_state"
            java.lang.String r1 = "Please select state"
        L_0x00b4:
            java.lang.String r12 = r12.b(r0, r1)
            goto L_0x0051
        L_0x00b9:
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x00c1
            cm.l.v(r1)
            r12 = r0
        L_0x00c1:
            android.widget.EditText r12 = r12.f26393e
            android.text.Editable r12 = r12.getText()
            cm.l.e(r12, r2)
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00d9
            ld.c r12 = r11.R1()
            java.lang.String r0 = "enter_comments"
            java.lang.String r1 = "Please enter comments"
            goto L_0x00b4
        L_0x00d9:
            java.util.ArrayList r12 = r11.I1(r11)
            java.lang.String r2 = r11.X
            boolean r12 = r12.contains(r2)
            r2 = 0
            if (r12 == 0) goto L_0x0149
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x00ee
            cm.l.v(r1)
            r12 = r0
        L_0x00ee:
            android.widget.EditText r12 = r12.f26397i
            r3 = 1
            r12.setEnabled(r3)
            android.content.Context r12 = r11.O1()
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.lang.String r3 = "android_id"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r12, r3)
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x010a
            cm.l.v(r1)
            r12 = r0
        L_0x010a:
            android.widget.ProgressBar r12 = r12.f26390b
            r12.setVisibility(r2)
            k9.b r4 = r11.P1()
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x011b
            cm.l.v(r1)
            goto L_0x011c
        L_0x011b:
            r0 = r12
        L_0x011c:
            android.widget.EditText r12 = r0.f26397i
            android.text.Editable r12 = r12.getText()
            java.lang.String r5 = r12.toString()
            ld.g r12 = r11.S1()
            java.lang.String r12 = r12.k()
            long r6 = java.lang.Long.parseLong(r12)
            ld.g r12 = r11.S1()
            java.lang.String r8 = r12.l()
            cm.l.c(r9)
            ld.g r11 = r11.S1()
            java.lang.String r10 = r11.e()
            r4.b0(r5, r6, r8, r9, r10)
            goto L_0x0192
        L_0x0149:
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x0151
            cm.l.v(r1)
            r12 = r0
        L_0x0151:
            androidx.appcompat.widget.AppCompatButton r12 = r12.f26409u
            r3 = 1056964608(0x3f000000, float:0.5)
            r12.setAlpha(r3)
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x0160
            cm.l.v(r1)
            r12 = r0
        L_0x0160:
            androidx.appcompat.widget.AppCompatButton r12 = r12.f26409u
            r12.setEnabled(r2)
            ni.g r12 = r11.G
            if (r12 != 0) goto L_0x016d
            cm.l.v(r1)
            goto L_0x016e
        L_0x016d:
            r0 = r12
        L_0x016e:
            android.widget.EditText r12 = r0.f26397i
            r12.setEnabled(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            ld.c r0 = r11.R1()
            java.lang.String r1 = "reportAcc_availMsg"
            java.lang.String r2 = "Report accident service service is not available in "
            java.lang.String r0 = r0.b(r1, r2)
            r12.append(r0)
            java.lang.String r0 = r11.X
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            goto L_0x0051
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.AccidentReportActivity.f2(com.nic.mparivahan.Citizen.Activities.AccidentReportActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void g2(AccidentReportActivity accidentReportActivity, View view) {
        l.f(accidentReportActivity, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || accidentReportActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != -1) {
            accidentReportActivity.A2();
        } else {
            accidentReportActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 10003);
        }
        x xVar = x.f30437a;
    }

    /* access modifiers changed from: private */
    public static final void h2(AccidentReportActivity accidentReportActivity, View view) {
        l.f(accidentReportActivity, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || accidentReportActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            accidentReportActivity.y2();
        } else {
            accidentReportActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
        }
    }

    /* access modifiers changed from: private */
    public final void i2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new d9.b0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void j2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void k2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new a0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, AccidentReportActivity accidentReportActivity, View view) {
        l.f(dialog, "$d");
        l.f(accidentReportActivity, "this$0");
        dialog.dismiss();
        ni.g gVar = accidentReportActivity.G;
        ni.g gVar2 = null;
        if (gVar == null) {
            l.v("binding");
            gVar = null;
        }
        gVar.f26397i.setText("");
        ni.g gVar3 = accidentReportActivity.G;
        if (gVar3 == null) {
            l.v("binding");
            gVar3 = null;
        }
        gVar3.f26408t.setPrompt("Select State");
        ni.g gVar4 = accidentReportActivity.G;
        if (gVar4 == null) {
            l.v("binding");
            gVar4 = null;
        }
        gVar4.f26408t.setSelection(0);
        ni.g gVar5 = accidentReportActivity.G;
        if (gVar5 == null) {
            l.v("binding");
        } else {
            gVar2 = gVar5;
        }
        gVar2.f26393e.setText("");
    }

    private final void m2() {
        Intent intent = l.a(Environment.getExternalStorageState(), "mounted") ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        intent.setType("video/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.sizeLimit", 8388608);
        intent.putExtra("return-data", true);
        this.f7767a0.a(intent);
    }

    private final void p2() {
        i4.b a10 = i4.e.a(this);
        l.e(a10, "getFusedLocationProviderClient(...)");
        LocationRequest q10 = new LocationRequest().p(600000).o(600000).q(100);
        l.e(q10, "setPriority(...)");
        if (androidx.core.content.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            a10.a(q10, new j(this), Looper.myLooper());
        }
    }

    private final void x2(Intent intent) {
        Bundle extras = intent.getExtras();
        ni.g gVar = null;
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        ni.g gVar2 = this.G;
        if (gVar2 == null) {
            l.v("binding");
        } else {
            gVar = gVar2;
        }
        gVar.f26399k.setImageResource(R.drawable.uploaded_img);
        l.c(bitmap);
        this.R = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        this.S = "img_" + System.currentTimeMillis() + ".jpg";
    }

    private final void y2() {
        String[] strArr;
        Log.v("Image Popup", "test");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        if (this.R.length() > 0) {
            strArr = p.o(this.X, "odisha", true) ? new String[]{"Capture photo from camera", "Remove photo"} : new String[]{"Select photo from gallery", "Capture photo from camera", "Remove photo"};
        } else {
            boolean o10 = p.o(this.X, "odisha", true);
            strArr = new String[]{"Capture photo from camera"};
        }
        builder.setItems((CharSequence[]) strArr, new d0(this));
        builder.show();
    }

    /* access modifiers changed from: private */
    public static final void z2(AccidentReportActivity accidentReportActivity, DialogInterface dialogInterface, int i10) {
        l.f(accidentReportActivity, "this$0");
        if (i10 == 0) {
            accidentReportActivity.D1();
        } else if (i10 == 1) {
            accidentReportActivity.D2();
        } else if (i10 == 2) {
            accidentReportActivity.E1();
        }
    }

    public final byte[] H1(InputStream inputStream) {
        l.f(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public final ArrayList I1(Context context) {
        l.f(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            Object j10 = new i7.d().j(new ld.e(context).f().toString(), StateMaster.class);
            l.e(j10, "fromJson(...)");
            ArrayList<State> states = ((StateMaster) j10).getStates();
            l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            int size = states.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (states.get(i10).isSentinal()) {
                    arrayList.add(states.get(i10).getName());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final EditText J1() {
        EditText editText = this.O;
        if (editText != null) {
            return editText;
        }
        l.v("evLocation");
        return null;
    }

    public final TextView K1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        l.v("evTime");
        return null;
    }

    public final void N1(double d10, double d11) {
        try {
            List<Address> fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(d10, d11, 1);
            l.c(fromLocation);
            String adminArea = fromLocation.get(0).getAdminArea();
            l.e(adminArea, "getAdminArea(...)");
            this.X = adminArea;
            if (fromLocation.isEmpty()) {
                String string = getResources().getString(R.string.location_not_find);
                l.e(string, "getString(...)");
                s2(string);
                return;
            }
            String addressLine = fromLocation.get(0).getAddressLine(0);
            l.e(addressLine, "getAddressLine(...)");
            s2(addressLine);
            J1().setText(Q1());
        } catch (IOException e10) {
            String string2 = getResources().getString(R.string.location_not_find);
            l.e(string2, "getString(...)");
            s2(string2);
            e10.printStackTrace();
        }
    }

    public final Context O1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final k9.b P1() {
        k9.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        l.v("mOffenceViewModel");
        return null;
    }

    public final String Q1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("myLocation");
        return null;
    }

    public final ld.c R1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final ld.g S1() {
        ld.g gVar = this.I;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final ArrayList T1() {
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("stateList");
        return null;
    }

    public final String U1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("stateValue");
        return null;
    }

    public final void V1(TextView textView, Context context) {
        l.f(textView, "textView");
        l.f(context, "context");
        new y(Calendar.getInstance(), this);
        K1().setOnClickListener(new z());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        zl.b.a(r8, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Y1(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = "contentUri"
            cm.l.f(r8, r0)
            android.content.ContentResolver r1 = r7.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            cm.l.c(r8)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "_size"
            int r0 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0027 }
            r8.moveToFirst()     // Catch:{ all -> 0x0027 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x0027 }
            r2 = 0
            zl.b.a(r8, r2)
            return r0
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            zl.b.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.AccidentReportActivity.Y1(android.net.Uri):long");
    }

    public final void n2(EditText editText) {
        l.f(editText, "<set-?>");
        this.O = editText;
    }

    public final void o2(TextView textView) {
        l.f(textView, "<set-?>");
        this.P = textView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ni.g c10 = ni.g.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        ni.g gVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        ni.g gVar2 = this.G;
        if (gVar2 == null) {
            l.v("binding");
            gVar2 = null;
        }
        gVar2.f26398j.f25961g.setText("Report Accident");
        ni.g gVar3 = this.G;
        if (gVar3 == null) {
            l.v("binding");
            gVar3 = null;
        }
        gVar3.f26398j.f25959e.setOnClickListener(new e0(this));
        try {
            Object systemService = getSystemService("location");
            l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                p2();
            } else {
                A1();
            }
        } catch (Exception unused) {
        }
        q2(this);
        u2(new ld.g(this));
        e.a aVar = v9.e.f17509a;
        ni.g gVar4 = this.G;
        if (gVar4 == null) {
            l.v("binding");
            gVar4 = null;
        }
        aVar.d(this, gVar4);
        this.K = OffenceInterface.f7826a.b(this);
        View findViewById = findViewById(R.id.ev_location);
        l.e(findViewById, "findViewById(...)");
        n2((EditText) findViewById);
        View findViewById2 = findViewById(R.id.ev_time_picker);
        l.e(findViewById2, "findViewById(...)");
        o2((TextView) findViewById2);
        ni.g gVar5 = this.G;
        if (gVar5 == null) {
            l.v("binding");
            gVar5 = null;
        }
        gVar5.f26402n.setOnClickListener(new f0(this));
        ni.g gVar6 = this.G;
        if (gVar6 == null) {
            l.v("binding");
            gVar6 = null;
        }
        gVar6.f26401m.setOnClickListener(new g0(this));
        ni.g gVar7 = this.G;
        if (gVar7 == null) {
            l.v("binding");
            gVar7 = null;
        }
        gVar7.f26390b.setVisibility(0);
        ni.g gVar8 = this.G;
        if (gVar8 == null) {
            l.v("binding");
            gVar8 = null;
        }
        gVar8.f26394f.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        K1().setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        V1(K1(), O1());
        OffenceInterface offenceInterface = this.K;
        if (offenceInterface == null) {
            l.v("mOffenceInterface");
            offenceInterface = null;
        }
        r2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(offenceInterface))).a(k9.b.class));
        ni.g gVar9 = this.G;
        if (gVar9 == null) {
            l.v("binding");
            gVar9 = null;
        }
        gVar9.f26394f.setOnClickListener(new h0());
        ni.g gVar10 = this.G;
        if (gVar10 == null) {
            l.v("binding");
            gVar10 = null;
        }
        gVar10.f26409u.setOnClickListener(new i0(this));
        P1().K().g(this, new i(new e(this)));
        P1().J().g(this, new i(new f(this)));
        P1().R("1");
        P1().z().g(this, new i(new g(this)));
        P1().r().g(this, new i(new h(this)));
        ni.g gVar11 = this.G;
        if (gVar11 == null) {
            l.v("binding");
            gVar11 = null;
        }
        gVar11.f26408t.setOnItemSelectedListener(new b(this));
        ni.g gVar12 = this.G;
        if (gVar12 == null) {
            l.v("binding");
            gVar12 = null;
        }
        gVar12.f26400l.setOnClickListener(new j0(this));
        ni.g gVar13 = this.G;
        if (gVar13 == null) {
            l.v("binding");
        } else {
            gVar = gVar13;
        }
        gVar.f26399k.setOnClickListener(new t(this));
        P1().T().g(this, new i(new c(this)));
        P1().t().g(this, new i(new d(this)));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Toast makeText;
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 222) {
            if (i10 == 10001) {
                if ((!(iArr.length == 0)) && iArr[0] == 0) {
                    y2();
                    return;
                }
            } else if (i10 == 10003) {
                if ((!(iArr.length == 0)) && iArr[0] == 0) {
                    A2();
                    return;
                }
            } else {
                return;
            }
            makeText = Toast.makeText(this, "Permission denied", 0);
        } else {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                makeText = Toast.makeText(this, R1().b("go_to_settings", getString(R.string.enable_manual_setting)), 0);
            } else {
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                this.Z.a(getIntent());
                return;
            }
        }
        makeText.show();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("location");
        l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isProviderEnabled("gps")) {
            p2();
        }
    }

    public final void q2(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void r2(k9.b bVar) {
        l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void s2(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void t2(boolean z10) {
        this.V = z10;
    }

    public final void u2(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    public final void v2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.M = arrayList;
    }

    public final void w2(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }
}
