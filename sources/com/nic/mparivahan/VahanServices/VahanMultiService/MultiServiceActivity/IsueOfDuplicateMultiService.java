package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.VmServiceReasonEntityById;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.ib;
import og.a0;
import pg.g;
import pl.x;
import tg.f1;
import tg.g1;
import tg.h1;
import tg.i1;
import tg.j1;
import tg.k1;
import tg.l1;
import tg.m1;
import tg.n1;
import v9.e;
import z9.a;

public final class IsueOfDuplicateMultiService extends androidx.appcompat.app.d {
    public ib G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public String K;
    public NrvDetails L;
    public String M;
    public String N;
    public String O;
    private Calendar P = Calendar.getInstance();
    public String Q;
    private boolean R;
    public ld.c S;
    private ArrayList T = new ArrayList();
    private MultiServiceDraft U;
    public MultiSelectionViewModel V;
    public MultiService W;
    private MultiServiceDraft X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiService f21077e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IsueOfDuplicateMultiService isueOfDuplicateMultiService) {
            super(1);
            this.f21077e = isueOfDuplicateMultiService;
        }

        public final void b(DReasonResponse dReasonResponse) {
            this.f21077e.u1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", (VmServiceReasonEntityById) null));
                    IsueOfDuplicateMultiService isueOfDuplicateMultiService = this.f21077e;
                    cm.l.c(dReasonResponse);
                    this.f21077e.q1().f26832h.setAdapter(new a0(isueOfDuplicateMultiService, dReasonResponse));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DReasonResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiService f21078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(IsueOfDuplicateMultiService isueOfDuplicateMultiService) {
            super(1);
            this.f21078e = isueOfDuplicateMultiService;
        }

        public final void b(String str) {
            this.f21078e.u1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiService f21079e;

        c(IsueOfDuplicateMultiService isueOfDuplicateMultiService) {
            this.f21079e = isueOfDuplicateMultiService;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            LinearLayout linearLayout;
            int i11;
            cm.l.f(view, "view");
            Object selectedItem = this.f21079e.q1().f26832h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (p.o(dReasonResponseItem.getReason_desc(), "OTHER", true) || p.o(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                linearLayout = this.f21079e.q1().f26829e;
                i11 = 8;
            } else {
                linearLayout = this.f21079e.q1().f26829e;
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21080a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f21080a = lVar;
        }

        public final pl.c a() {
            return this.f21080a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21080a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, View view) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        Intent intent = new Intent(isueOfDuplicateMultiService, VahanVehicleDetailsService.class);
        intent.putExtra("RC", isueOfDuplicateMultiService.v1());
        intent.putExtra("RcDetails", isueOfDuplicateMultiService.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, isueOfDuplicateMultiService.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, isueOfDuplicateMultiService.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, isueOfDuplicateMultiService.o1());
        isueOfDuplicateMultiService.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void B1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, View view) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        try {
            g.f30363a.e(isueOfDuplicateMultiService, isueOfDuplicateMultiService.T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        isueOfDuplicateMultiService.P.set(1, i10);
        isueOfDuplicateMultiService.P.set(2, i11);
        isueOfDuplicateMultiService.P.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", isueOfDuplicateMultiService.P.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", isueOfDuplicateMultiService.P.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", isueOfDuplicateMultiService.P.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        isueOfDuplicateMultiService.N1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        isueOfDuplicateMultiService.q1().f26827c.setText(simpleDateFormat.format(isueOfDuplicateMultiService.P.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void D1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(isueOfDuplicateMultiService, onDateSetListener, isueOfDuplicateMultiService.P.get(1), isueOfDuplicateMultiService.P.get(2), isueOfDuplicateMultiService.P.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void E1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, View view) {
        String str;
        String b10;
        IsueOfDuplicateMultiService isueOfDuplicateMultiService2 = isueOfDuplicateMultiService;
        cm.l.f(isueOfDuplicateMultiService2, "this$0");
        ld.c cVar = new ld.c(isueOfDuplicateMultiService2);
        try {
            String obj = isueOfDuplicateMultiService.q1().f26833i.getText().toString();
            String obj2 = isueOfDuplicateMultiService.q1().f26828d.getText().toString();
            String obj3 = isueOfDuplicateMultiService.q1().f26827c.getText().toString();
            String obj4 = isueOfDuplicateMultiService.q1().f26830f.getText().toString();
            Object selectedItem = isueOfDuplicateMultiService.q1().f26832h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (isueOfDuplicateMultiService.q1().f26832h.getSelectedItemPosition() == 0) {
                b10 = cVar.b("please_Select_the_reason", isueOfDuplicateMultiService2.getString(R.string.please_Select_the_reason));
            } else if (obj.length() < 3) {
                b10 = cVar.b("please_enter_the_remark", isueOfDuplicateMultiService2.getString(R.string.please_enter_the_remark));
            } else {
                if (obj2.length() < 3) {
                    if (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true)) {
                        b10 = cVar.b("please_enter_the_valid_fir_no", isueOfDuplicateMultiService2.getString(R.string.please_enter_the_valid_fir_no));
                    }
                }
                if (obj3.length() < 3 && (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    b10 = cVar.b("please_enter_fir_date", isueOfDuplicateMultiService2.getString(R.string.please_enter_fir_date));
                } else if (obj4.length() >= 3 || (!p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) && !p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    a.C0251a aVar = z9.a.f18947a;
                    String h10 = aVar.h(obj3);
                    int parseInt = Integer.parseInt(isueOfDuplicateMultiService.t1());
                    String m10 = v9.d.f17494a.m();
                    int parseInt2 = Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String h11 = aVar.h(obj3);
                    String valueOf = String.valueOf(dReasonResponseItem.getReason_desc());
                    String v12 = isueOfDuplicateMultiService.v1();
                    String valueOf2 = String.valueOf(isueOfDuplicateMultiService.w1().getState_cd());
                    String rc_vh_class_cd = isueOfDuplicateMultiService.w1().getRc_vh_class_cd();
                    cm.l.c(rc_vh_class_cd);
                    Durcdto durcdto = new Durcdto("", 0, h10, obj2, 0, " ", 0, " ", "", parseInt, m10, obj4, obj2, parseInt2, h11, " ", 0, valueOf, v12, valueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
                    MultiServiceDraft multiServiceDraft = isueOfDuplicateMultiService2.U;
                    cm.l.c(multiServiceDraft);
                    isueOfDuplicateMultiService2.X = MultiServiceDraft.copy$default(multiServiceDraft, (String) null, (ChanngeOfAdressDto) null, durcdto, (HpaDto) null, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2043, (Object) null);
                    VContant.Companion companion = VContant.Companion;
                    if (p.o(companion.r(VContant.DUPLICATE_RC_PURPOSE_CODE, isueOfDuplicateMultiService2.T), VContant.REDIRECT, true)) {
                        isueOfDuplicateMultiService.u1().show();
                        MultiSelectionViewModel z12 = isueOfDuplicateMultiService.z1();
                        MultiServiceDraft multiServiceDraft2 = isueOfDuplicateMultiService2.X;
                        cm.l.c(multiServiceDraft2);
                        z12.v(multiServiceDraft2);
                        return;
                    }
                    Intent intent = new Intent();
                    if (companion.u(VContant.DUPLICATE_RC_PURPOSE_CODE, isueOfDuplicateMultiService2.T)) {
                        str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.r(VContant.DUPLICATE_RC_PURPOSE_CODE, isueOfDuplicateMultiService2.T);
                    } else {
                        str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.r(VContant.DUPLICATE_RC_PURPOSE_CODE, isueOfDuplicateMultiService2.T);
                    }
                    intent.setClass(isueOfDuplicateMultiService2, Class.forName(str));
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, isueOfDuplicateMultiService2.T);
                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, isueOfDuplicateMultiService2.X);
                    intent.putExtra("RC", isueOfDuplicateMultiService.v1());
                    intent.putExtra("RcDetails", isueOfDuplicateMultiService.w1());
                    intent.putExtra("off_code", isueOfDuplicateMultiService.t1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, isueOfDuplicateMultiService2.R);
                    intent.putExtra(VContant.NEXGEN_addahar_name, isueOfDuplicateMultiService.p1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, isueOfDuplicateMultiService.o1());
                    isueOfDuplicateMultiService2.startActivity(intent);
                    isueOfDuplicateMultiService.finish();
                    return;
                } else {
                    b10 = cVar.b("please_enter_police_station", isueOfDuplicateMultiService2.getString(R.string.please_enter_police_station));
                }
            }
            Toast.makeText(isueOfDuplicateMultiService2, b10, 0).show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, View view) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        VUtility.Companion.v(isueOfDuplicateMultiService, isueOfDuplicateMultiService.r1().b("are_you_sure_you_want_to_leave", isueOfDuplicateMultiService.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void G1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, View view) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        isueOfDuplicateMultiService.J1();
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H1(com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService r17, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse r18) {
        /*
            r0 = r17
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            android.app.ProgressDialog r1 = r17.u1()
            r1.dismiss()
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage r1 = r18.getApiMessage()
            r2 = 0
            if (r1 == 0) goto L_0x00b8
            int r1 = r1.getStatusCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x00b8
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = r1.getApplNo()
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x0036
            r1.getTransferOwnershipDto()
        L_0x0036:
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x0042
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto r1 = r1.getChanngeOfAdressDto()
            r5 = r1
            goto L_0x0043
        L_0x0042:
            r5 = r2
        L_0x0043:
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x004f
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto r1 = r1.getHpaDto()
            r7 = r1
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x005c
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto r1 = r1.getHptDto()
            r8 = r1
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data r1 = r18.getData()
            if (r1 == 0) goto L_0x0069
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto r1 = r1.getDurcdto()
            r6 = r1
            goto L_0x006a
        L_0x0069:
            r6 = r2
        L_0x006a:
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft r3 = r0.U
            if (r3 == 0) goto L_0x007c
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2016(0x7e0, float:2.825E-42)
            r16 = 0
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft r2 = com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x007c:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen> r3 = com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen.class
            r1.<init>(r0, r3)
            java.lang.String r3 = "MULTIARRAY"
            java.util.ArrayList r4 = r0.T
            r1.putExtra(r3, r4)
            java.lang.String r3 = "MULTIDRAFT"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "RcDetails"
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r3 = r17.w1()
            r1.putExtra(r2, r3)
            java.lang.String r2 = "Face_Less_Staus"
            boolean r3 = r0.R
            r1.putExtra(r2, r3)
            java.lang.String r2 = "aadhaarName"
            java.lang.String r3 = r17.p1()
            r1.putExtra(r2, r3)
            java.lang.String r2 = "aadhaarAddress"
            java.lang.String r3 = r17.o1()
            r1.putExtra(r2, r3)
            r0.startActivity(r1)
            r17.finish()
            goto L_0x00c7
        L_0x00b8:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r1 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage r3 = r18.getApiMessage()
            if (r3 == 0) goto L_0x00c4
            java.lang.String r2 = r3.getDeveloperMessage()
        L_0x00c4:
            r1.K(r0, r2)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService.H1(com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService, com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void I1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, String str) {
        cm.l.f(isueOfDuplicateMultiService, "this$0");
        isueOfDuplicateMultiService.u1().dismiss();
        VContant.Companion.K(isueOfDuplicateMultiService, str);
    }

    private final void J1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void M1(ib ibVar) {
        cm.l.f(ibVar, "<set-?>");
        this.G = ibVar;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void O1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void P1(MultiService multiService) {
        cm.l.f(multiService, "<set-?>");
        this.W = multiService;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void R1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void T1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void U1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void V1(String str, ArrayList arrayList) {
        cm.l.f(str, "purCode");
        try {
            cm.l.c(arrayList);
            int indexOf = arrayList.indexOf(str);
            if (arrayList.size() == 4) {
                q1().f26835k.f29783b.setVisibility(0);
                TextView textView = q1().f26835k.f29785d;
                VContant.Companion companion = VContant.Companion;
                Object obj = arrayList.get(0);
                cm.l.e(obj, "get(...)");
                textView.setText(companion.B(this, (String) obj));
                TextView textView2 = q1().f26835k.f29787f;
                Object obj2 = arrayList.get(1);
                cm.l.e(obj2, "get(...)");
                textView2.setText(companion.B(this, (String) obj2));
                TextView textView3 = q1().f26835k.f29792k;
                Object obj3 = arrayList.get(2);
                cm.l.e(obj3, "get(...)");
                textView3.setText(companion.B(this, (String) obj3));
                TextView textView4 = q1().f26835k.f29795n;
                Object obj4 = arrayList.get(3);
                cm.l.e(obj4, "get(...)");
                textView4.setText(companion.B(this, (String) obj4));
                if (indexOf == 3) {
                    q1().f26835k.f29784c.setChecked(true);
                    q1().f26835k.f29786e.setChecked(true);
                    q1().f26835k.f29789h.setChecked(true);
                    q1().f26835k.f29794m.setChecked(false);
                }
                if (indexOf == 2) {
                    q1().f26835k.f29784c.setChecked(true);
                    q1().f26835k.f29786e.setChecked(true);
                    q1().f26835k.f29789h.setChecked(false);
                    q1().f26835k.f29794m.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 1) {
                    q1().f26835k.f29784c.setChecked(true);
                    q1().f26835k.f29786e.setChecked(false);
                    Drawable e10 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    q1().f26835k.f29789h.setCheckMarkDrawable(e10);
                    q1().f26835k.f29794m.setCheckMarkDrawable(e10);
                }
                if (indexOf == 0) {
                    q1().f26835k.f29784c.setChecked(false);
                    Drawable e11 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    q1().f26835k.f29786e.setCheckMarkDrawable(e11);
                    q1().f26835k.f29789h.setCheckMarkDrawable(e11);
                    q1().f26835k.f29794m.setCheckMarkDrawable(e11);
                }
            }
            if (arrayList.size() == 3) {
                q1().f26835k.f29802u.setVisibility(0);
                TextView textView5 = q1().f26835k.f29807z;
                VContant.Companion companion2 = VContant.Companion;
                Object obj5 = arrayList.get(2);
                cm.l.e(obj5, "get(...)");
                textView5.setText(companion2.B(this, (String) obj5));
                TextView textView6 = q1().f26835k.f29804w;
                Object obj6 = arrayList.get(1);
                cm.l.e(obj6, "get(...)");
                textView6.setText(companion2.B(this, (String) obj6));
                TextView textView7 = q1().f26835k.f29791j;
                Object obj7 = arrayList.get(0);
                cm.l.e(obj7, "get(...)");
                textView7.setText(companion2.B(this, (String) obj7));
                if (indexOf == 2) {
                    q1().f26835k.f29790i.setChecked(true);
                    q1().f26835k.f29803v.setChecked(true);
                    q1().f26835k.f29806y.setChecked(false);
                }
                if (indexOf == 1) {
                    q1().f26835k.f29790i.setChecked(true);
                    q1().f26835k.f29803v.setChecked(false);
                    q1().f26835k.f29806y.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 0) {
                    q1().f26835k.f29790i.setChecked(false);
                    Drawable e12 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    q1().f26835k.f29803v.setCheckMarkDrawable(e12);
                    q1().f26835k.f29806y.setCheckMarkDrawable(e12);
                }
            }
            if (arrayList.size() == 2) {
                q1().f26835k.A.setVisibility(0);
                TextView textView8 = q1().f26835k.f29801t;
                VContant.Companion companion3 = VContant.Companion;
                Object obj8 = arrayList.get(1);
                cm.l.e(obj8, "get(...)");
                textView8.setText(companion3.B(this, (String) obj8));
                TextView textView9 = q1().f26835k.f29799r;
                Object obj9 = arrayList.get(0);
                cm.l.e(obj9, "get(...)");
                textView9.setText(companion3.B(this, (String) obj9));
                if (indexOf == 1) {
                    q1().f26835k.f29798q.setChecked(true);
                    q1().f26835k.f29800s.setChecked(false);
                }
                if (indexOf == 0) {
                    q1().f26835k.f29798q.setChecked(false);
                    q1().f26835k.f29800s.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public final void W1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void X1(MultiSelectionViewModel multiSelectionViewModel) {
        cm.l.f(multiSelectionViewModel, "<set-?>");
        this.V = multiSelectionViewModel;
    }

    public final String o1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.issueofduplicate_rc_multi);
        ib c10 = ib.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        M1(c10);
        setContentView((View) q1().b());
        e.f17509a.D2(this, q1());
        U1(VahanProService.f21196b.b(this));
        O1(new ld.c(this));
        R1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        W1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(x1()))).a(h.class));
        P1(MultiService.f21070a.b(this));
        X1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(s1()))).a(MultiSelectionViewModel.class));
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.R = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        S1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        T1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.U = (MultiServiceDraft) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.T = arrayList;
        cm.l.c(arrayList);
        if (arrayList.size() <= 1) {
            O1(new ld.c(this));
            q1().f26836l.f28308i.setText(r1().b("issue_of_duplicate_rc", getString(R.string.vahan_duplicate_rc)));
        } else {
            SpannableString spannableString = new SpannableString(r1().b("rcServices", getString(R.string.rc_service)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            q1().f26836l.f28308i.setText(spannableString);
        }
        if (this.R) {
            q1().f26831g.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.R;
        LinearLayout linearLayout = q1().f26831g.f27159b;
        cm.l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        O1(new ld.c(this));
        q1().f26836l.f28304e.setVisibility(0);
        q1().f26836l.f28304e.setText(v1());
        SpannableString spannableString2 = new SpannableString(v1());
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        q1().f26836l.f28304e.setText(spannableString2);
        q1().f26845u.setText(r1().b("view_vehicle_details", "View Vehicle Details"));
        V1(VContant.DUPLICATE_RC_PURPOSE_CODE, this.T);
        q1().f26845u.setPaintFlags(q1().f26845u.getPaintFlags() | 8);
        q1().f26836l.f28304e.setOnClickListener(new f1(this));
        q1().f26836l.f28308i.setOnClickListener(new g1(this));
        try {
            u1().show();
            y1().I0(this, VContant.DUPLICATE_RC_PURPOSE_CODE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        q1().f26827c.setOnClickListener(new i1(this, new h1(this)));
        y1().H().g(this, new d(new a(this)));
        y1().I().g(this, new d(new b(this)));
        q1().f26832h.setOnItemSelectedListener(new c(this));
        q1().f26826b.setOnClickListener(new j1(this));
        q1().f26836l.f28305f.setOnClickListener(new k1(this));
        q1().f26836l.f28306g.setOnClickListener(new l1(this));
        z1().l().g(this, new m1(this));
        z1().m().g(this, new n1(this));
    }

    public final String p1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final ib q1() {
        ib ibVar = this.G;
        if (ibVar != null) {
            return ibVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final MultiService s1() {
        MultiService multiService = this.W;
        if (multiService != null) {
            return multiService;
        }
        cm.l.v("multiService");
        return null;
    }

    public final String t1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String v1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h y1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final MultiSelectionViewModel z1() {
        MultiSelectionViewModel multiSelectionViewModel = this.V;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        cm.l.v("viewModelMulti");
        return null;
    }
}
