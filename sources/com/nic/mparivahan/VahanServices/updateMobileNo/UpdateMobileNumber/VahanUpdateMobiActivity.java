package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.ApiMessage;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.VtOwnerIdentitificationEntity;
import ei.f;
import ei.g;
import ei.i;
import ei.j;
import ei.k;
import java.util.Calendar;
import java.util.List;
import ni.f9;
import pl.x;
import v9.e;

public final class VahanUpdateMobiActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public f9 G;
    public fi.b H;
    public UpdateMobileUpdated I;
    /* access modifiers changed from: private */
    public ProgressDialog J;
    private String K = "";
    private String L = "";
    public ld.c M;
    public NrvDetails N;
    public VahanProService O;
    public h P;
    private UpdateModelVehDetails Q;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobiActivity f21609e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanUpdateMobiActivity vahanUpdateMobiActivity) {
            super(1);
            this.f21609e = vahanUpdateMobiActivity;
        }

        public final void b(String str) {
            ProgressDialog q12 = this.f21609e.J;
            ProgressDialog progressDialog = null;
            if (q12 == null) {
                cm.l.v("dialog");
                q12 = null;
            }
            if (q12.isShowing()) {
                ProgressDialog q13 = this.f21609e.J;
                if (q13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = q13;
                }
                progressDialog.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobiActivity f21610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanUpdateMobiActivity vahanUpdateMobiActivity) {
            super(1);
            this.f21610e = vahanUpdateMobiActivity;
        }

        public final void b(String str) {
            ProgressDialog q12 = this.f21610e.J;
            ProgressDialog progressDialog = null;
            if (q12 == null) {
                cm.l.v("dialog");
                q12 = null;
            }
            if (q12.isShowing()) {
                ProgressDialog q13 = this.f21610e.J;
                if (q13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = q13;
                }
                progressDialog.dismiss();
            }
            VahanUpdateMobiActivity vahanUpdateMobiActivity = this.f21610e;
            vahanUpdateMobiActivity.S1(vahanUpdateMobiActivity, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobiActivity f21611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanUpdateMobiActivity vahanUpdateMobiActivity) {
            super(1);
            this.f21611e = vahanUpdateMobiActivity;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [android.app.Dialog] */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails r11) {
            /*
                r10 = this;
                r0 = 0
                if (r11 == 0) goto L_0x00d0
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.ApiMessage r1 = r11.getApiMessage()
                if (r1 == 0) goto L_0x00d0
                java.lang.Integer r1 = r1.getStatusCode()
                if (r1 != 0) goto L_0x0011
                goto L_0x00d0
            L_0x0011:
                int r1 = r1.intValue()
                r2 = 200(0xc8, float:2.8E-43)
                if (r1 != r2) goto L_0x00d0
                ka.c$a r1 = ka.c.f13158a
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data r2 = r11.getData()
                if (r2 == 0) goto L_0x0026
                java.util.List r2 = r2.getOwnerDetailEntity()
                goto L_0x0027
            L_0x0026:
                r2 = r0
            L_0x0027:
                cm.l.c(r2)
                r3 = 0
                java.lang.Object r2 = r2.get(r3)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity r2 = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity) r2
                java.lang.String r2 = r2.getRegn_no()
                boolean r2 = r1.m(r2)
                if (r2 != 0) goto L_0x00d0
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data r2 = r11.getData()
                if (r2 == 0) goto L_0x0046
                java.util.List r2 = r2.getOwnerDetailEntity()
                goto L_0x0047
            L_0x0046:
                r2 = r0
            L_0x0047:
                cm.l.c(r2)
                java.lang.Object r2 = r2.get(r3)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity r2 = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity) r2
                java.lang.String r2 = r2.getState_cd()
                boolean r1 = r1.m(r2)
                if (r1 != 0) goto L_0x00d0
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r1 = r10.f21611e
                ni.f9 r1 = r1.G
                if (r1 != 0) goto L_0x0068
                java.lang.String r1 = "binding"
                cm.l.v(r1)
                r1 = r0
            L_0x0068:
                androidx.appcompat.widget.AppCompatEditText r1 = r1.f26313c
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r2 = r10.f21611e
                bi.h r4 = r2.x1()
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r5 = r10.f21611e
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data r2 = r11.getData()
                if (r2 == 0) goto L_0x0085
                java.util.List r2 = r2.getOwnerDetailEntity()
                goto L_0x0086
            L_0x0085:
                r2 = r0
            L_0x0086:
                cm.l.c(r2)
                java.lang.Object r2 = r2.get(r3)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity r2 = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity) r2
                java.lang.String r2 = r2.getRegn_no()
                java.lang.String r6 = java.lang.String.valueOf(r2)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data r2 = r11.getData()
                if (r2 == 0) goto L_0x00a1
                java.util.List r0 = r2.getOwnerDetailEntity()
            L_0x00a1:
                cm.l.c(r0)
                java.lang.Object r0 = r0.get(r3)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity r0 = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity) r0
                java.lang.String r0 = r0.getState_cd()
                java.lang.String r7 = java.lang.String.valueOf(r0)
                java.lang.String r8 = "135"
                int r0 = r1.length()
                int r0 = r0 + -5
                int r2 = r1.length()
                java.lang.String r9 = r1.substring(r0, r2)
                java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
                cm.l.e(r9, r0)
                r4.A0(r5, r6, r7, r8, r9)
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r0 = r10.f21611e
                r0.O1(r11)
                goto L_0x00f4
            L_0x00d0:
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r11 = r10.f21611e
                android.app.ProgressDialog r11 = r11.J
                java.lang.String r1 = "dialog"
                if (r11 != 0) goto L_0x00de
                cm.l.v(r1)
                r11 = r0
            L_0x00de:
                boolean r11 = r11.isShowing()
                if (r11 == 0) goto L_0x00f4
                com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity r11 = r10.f21611e
                android.app.ProgressDialog r11 = r11.J
                if (r11 != 0) goto L_0x00f0
                cm.l.v(r1)
                goto L_0x00f1
            L_0x00f0:
                r0 = r11
            L_0x00f1:
                r0.dismiss()
            L_0x00f4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity.c.b(com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateModelVehDetails) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobiActivity f21612e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanUpdateMobiActivity vahanUpdateMobiActivity) {
            super(1);
            this.f21612e = vahanUpdateMobiActivity;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            ApiMessage apiMessage;
            Data data;
            try {
                ProgressDialog q12 = this.f21612e.J;
                List<VtOwnerIdentitificationEntity> list = null;
                if (q12 == null) {
                    cm.l.v("dialog");
                    q12 = null;
                }
                if (q12.isShowing()) {
                    ProgressDialog q13 = this.f21612e.J;
                    if (q13 == null) {
                        cm.l.v("dialog");
                        q13 = null;
                    }
                    q13.dismiss();
                }
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no == null) {
                    return;
                }
                if (regn_no.length() != 0) {
                    VahanUpdateMobiActivity vahanUpdateMobiActivity = this.f21612e;
                    VContant.Companion companion = VContant.Companion;
                    cm.l.c(ownerDetailPuccPermit);
                    vahanUpdateMobiActivity.M1(companion.c(ownerDetailPuccPermit));
                    UpdateModelVehDetails v12 = this.f21612e.v1();
                    if (v12 != null && (apiMessage = v12.getApiMessage()) != null) {
                        Integer statusCode = apiMessage.getStatusCode();
                        if (statusCode != null) {
                            if (statusCode.intValue() == 200) {
                                Intent intent = new Intent(this.f21612e, VahanValidateUpdateMobileActivity.class);
                                UpdateModelVehDetails v13 = this.f21612e.v1();
                                cm.l.c(v13);
                                Data data2 = v13.getData();
                                intent.putExtra("isAadharEnable", data2 != null ? Boolean.valueOf(data2.getRenderAdharDtls()) : null);
                                intent.putExtra("RC", this.f21612e.t1().getRc_regn_no());
                                intent.putExtra("RcDetails", this.f21612e.t1());
                                intent.putExtra("off_code", this.f21612e.t1().getRc_off_cd());
                                UpdateModelVehDetails v14 = this.f21612e.v1();
                                cm.l.c(v14);
                                Data data3 = v14.getData();
                                intent.putExtra(VContant.NEXGEN_isFACELESS, data3 != null ? Boolean.valueOf(data3.getRenderAdharDtls()) : null);
                                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                                UpdateModelVehDetails v15 = this.f21612e.v1();
                                cm.l.c(v15);
                                Data data4 = v15.getData();
                                if ((data4 != null ? data4.getOwnerDetailEntity() : null) != null) {
                                    UpdateModelVehDetails v16 = this.f21612e.v1();
                                    cm.l.c(v16);
                                    Data data5 = v16.getData();
                                    List<OwnerDetailEntity> ownerDetailEntity = data5 != null ? data5.getOwnerDetailEntity() : null;
                                    cm.l.c(ownerDetailEntity);
                                    if (ownerDetailEntity.size() > 0) {
                                        UpdateModelVehDetails v17 = this.f21612e.v1();
                                        List<OwnerDetailEntity> ownerDetailEntity2 = (v17 == null || (data = v17.getData()) == null) ? null : data.getOwnerDetailEntity();
                                        cm.l.c(ownerDetailEntity2);
                                        OwnerDetailEntity ownerDetailEntity3 = ownerDetailEntity2.get(0);
                                        intent.putExtra("regNo", ownerDetailEntity3 != null ? ownerDetailEntity3.getRegn_no() : null);
                                        UpdateModelVehDetails v18 = this.f21612e.v1();
                                        cm.l.c(v18);
                                        Data data6 = v18.getData();
                                        List<OwnerDetailEntity> ownerDetailEntity4 = data6 != null ? data6.getOwnerDetailEntity() : null;
                                        cm.l.c(ownerDetailEntity4);
                                        intent.putExtra("stateCd", ownerDetailEntity4.get(0).getState_cd());
                                        UpdateModelVehDetails v19 = this.f21612e.v1();
                                        cm.l.c(v19);
                                        Data data7 = v19.getData();
                                        List<OwnerDetailEntity> ownerDetailEntity5 = data7 != null ? data7.getOwnerDetailEntity() : null;
                                        cm.l.c(ownerDetailEntity5);
                                        intent.putExtra("stateName", ownerDetailEntity5.get(0).getState_name());
                                        UpdateModelVehDetails v110 = this.f21612e.v1();
                                        cm.l.c(v110);
                                        Data data8 = v110.getData();
                                        List<OwnerDetailEntity> ownerDetailEntity6 = data8 != null ? data8.getOwnerDetailEntity() : null;
                                        cm.l.c(ownerDetailEntity6);
                                        intent.putExtra("ownerName", ownerDetailEntity6.get(0).getOwner_name());
                                    }
                                }
                                UpdateModelVehDetails v111 = this.f21612e.v1();
                                cm.l.c(v111);
                                Data data9 = v111.getData();
                                if ((data9 != null ? data9.getVtOwnerIdentitificationEntity() : null) != null) {
                                    UpdateModelVehDetails v112 = this.f21612e.v1();
                                    cm.l.c(v112);
                                    Data data10 = v112.getData();
                                    List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity = data10 != null ? data10.getVtOwnerIdentitificationEntity() : null;
                                    cm.l.c(vtOwnerIdentitificationEntity);
                                    if (vtOwnerIdentitificationEntity.size() > 0) {
                                        UpdateModelVehDetails v113 = this.f21612e.v1();
                                        cm.l.c(v113);
                                        Data data11 = v113.getData();
                                        List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity2 = data11 != null ? data11.getVtOwnerIdentitificationEntity() : null;
                                        cm.l.c(vtOwnerIdentitificationEntity2);
                                        vtOwnerIdentitificationEntity2.get(0).getMobileNo();
                                        UpdateModelVehDetails v114 = this.f21612e.v1();
                                        cm.l.c(v114);
                                        Data data12 = v114.getData();
                                        List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity3 = data12 != null ? data12.getVtOwnerIdentitificationEntity() : null;
                                        cm.l.c(vtOwnerIdentitificationEntity3);
                                        intent.putExtra("mobileNo", String.valueOf(vtOwnerIdentitificationEntity3.get(0).getMobileNo()));
                                        UpdateModelVehDetails v115 = this.f21612e.v1();
                                        cm.l.c(v115);
                                        Data data13 = v115.getData();
                                        List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity4 = data13 != null ? data13.getVtOwnerIdentitificationEntity() : null;
                                        cm.l.c(vtOwnerIdentitificationEntity4);
                                        if (vtOwnerIdentitificationEntity4.get(0).getAadharNo() != null) {
                                            UpdateModelVehDetails v116 = this.f21612e.v1();
                                            cm.l.c(v116);
                                            Data data14 = v116.getData();
                                            List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity5 = data14 != null ? data14.getVtOwnerIdentitificationEntity() : null;
                                            cm.l.c(vtOwnerIdentitificationEntity5);
                                            intent.putExtra("aadharNo", vtOwnerIdentitificationEntity5.get(0).getAadharNo());
                                        } else {
                                            intent.putExtra("aadharNo", "");
                                        }
                                        UpdateModelVehDetails v117 = this.f21612e.v1();
                                        cm.l.c(v117);
                                        Data data15 = v117.getData();
                                        List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity6 = data15 != null ? data15.getVtOwnerIdentitificationEntity() : null;
                                        cm.l.c(vtOwnerIdentitificationEntity6);
                                        if (vtOwnerIdentitificationEntity6.get(0).getEmailId() != null) {
                                            UpdateModelVehDetails v118 = this.f21612e.v1();
                                            cm.l.c(v118);
                                            Data data16 = v118.getData();
                                            if (data16 != null) {
                                                list = data16.getVtOwnerIdentitificationEntity();
                                            }
                                            cm.l.c(list);
                                            intent.putExtra("emailId", list.get(0).getEmailId());
                                        } else {
                                            intent.putExtra("emailId", "");
                                        }
                                    }
                                }
                                this.f21612e.startActivity(intent);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21613a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f21613a = lVar;
        }

        public final pl.c a() {
            return this.f21613a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21613a.invoke(obj);
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
    public static final void A1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        vahanUpdateMobiActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        vahanUpdateMobiActivity.G1();
    }

    /* access modifiers changed from: private */
    public static final void C1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        if (vahanUpdateMobiActivity.V1()) {
            ProgressDialog progressDialog = vahanUpdateMobiActivity.J;
            f9 f9Var = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            fi.b y12 = vahanUpdateMobiActivity.y1();
            f9 f9Var2 = vahanUpdateMobiActivity.G;
            if (f9Var2 == null) {
                cm.l.v("binding");
                f9Var2 = null;
            }
            String obj = q.B0(String.valueOf(f9Var2.f26318h.getText())).toString();
            f9 f9Var3 = vahanUpdateMobiActivity.G;
            if (f9Var3 == null) {
                cm.l.v("binding");
                f9Var3 = null;
            }
            String obj2 = q.B0(String.valueOf(f9Var3.f26313c.getText())).toString();
            f9 f9Var4 = vahanUpdateMobiActivity.G;
            if (f9Var4 == null) {
                cm.l.v("binding");
            } else {
                f9Var = f9Var4;
            }
            y12.k(obj, obj2, q.B0(String.valueOf(f9Var.f26315e.getText())).toString(), vahanUpdateMobiActivity.K, vahanUpdateMobiActivity.L);
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        vahanUpdateMobiActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void E1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        vahanUpdateMobiActivity.J1();
    }

    /* access modifiers changed from: private */
    public static final void F1(VahanUpdateMobiActivity vahanUpdateMobiActivity, View view) {
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        vahanUpdateMobiActivity.H1();
    }

    private final void G1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void H1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new j(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void I1(u uVar, u uVar2, VahanUpdateMobiActivity vahanUpdateMobiActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        vahanUpdateMobiActivity.K = sb4.toString();
        f9 f9Var = vahanUpdateMobiActivity.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        AppCompatEditText appCompatEditText = f9Var.f26319i;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatEditText.setText(sb5.toString());
    }

    private final void J1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new i(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void K1(u uVar, u uVar2, VahanUpdateMobiActivity vahanUpdateMobiActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(vahanUpdateMobiActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        vahanUpdateMobiActivity.L = sb4.toString();
        f9 f9Var = vahanUpdateMobiActivity.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        AppCompatEditText appCompatEditText = f9Var.f26323m;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatEditText.setText(sb5.toString());
    }

    /* access modifiers changed from: private */
    public final void S1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", "ok"));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new k(dialog));
        textView2.setOnClickListener(new ei.b(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r0 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r0 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0170, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean V1() {
        /*
            r7 = this;
            ni.f9 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            android.text.Editable r0 = r0.getText()
            r3 = 0
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0047
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0022
            cm.l.v(r2)
            r0 = r1
        L_0x0022:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            ld.c r4 = r7.s1()
            r5 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_REG"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            cm.l.v(r2)
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26318h
        L_0x0043:
            r0.requestFocus()
            return r3
        L_0x0047:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x004f
            cm.l.v(r2)
            r0 = r1
        L_0x004f:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 4
            if (r0 >= r4) goto L_0x007e
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0068
            cm.l.v(r2)
            r0 = r1
        L_0x0068:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            ld.c r4 = r7.s1()
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r6 = "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0040
            goto L_0x003c
        L_0x007e:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0086
            cm.l.v(r2)
            r0 = r1
        L_0x0086:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00be
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00be
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x009c
            cm.l.v(r2)
            r0 = r1
        L_0x009c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            ld.c r4 = r7.s1()
            r5 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_CHASSI"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00ba
        L_0x00b6:
            cm.l.v(r2)
            goto L_0x00bb
        L_0x00ba:
            r1 = r0
        L_0x00bb:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26313c
            goto L_0x0043
        L_0x00be:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00c6
            cm.l.v(r2)
            r0 = r1
        L_0x00c6:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 2132018203(0x7f14041b, float:1.9674706E38)
            r5 = 5
            if (r0 >= r5) goto L_0x00fa
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00e2
            cm.l.v(r2)
            r0 = r1
        L_0x00e2:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            ld.c r5 = r7.s1()
            java.lang.String r6 = "INVALID_CHASSI"
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00ba
            goto L_0x00b6
        L_0x00fa:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0102
            cm.l.v(r2)
            r0 = r1
        L_0x0102:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0138
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0138
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0118
            cm.l.v(r2)
            r0 = r1
        L_0x0118:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            ld.c r5 = r7.s1()
            java.lang.String r6 = "label_challan_enter_engine_no"
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0133
        L_0x012f:
            cm.l.v(r2)
            goto L_0x0134
        L_0x0133:
            r1 = r0
        L_0x0134:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26315e
            goto L_0x0043
        L_0x0138:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0140
            cm.l.v(r2)
            r0 = r1
        L_0x0140:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x0173
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0158
            cm.l.v(r2)
            r0 = r1
        L_0x0158:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            ld.c r4 = r7.s1()
            r5 = 2132018204(0x7f14041c, float:1.9674708E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "INVALID_ENGINE"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0133
            goto L_0x012f
        L_0x0173:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x017b
            cm.l.v(r2)
            r0 = r1
        L_0x017b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26319i
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x01b4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b4
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0191
            cm.l.v(r2)
            r0 = r1
        L_0x0191:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26319i
            ld.c r4 = r7.s1()
            r5 = 2132018752(0x7f140640, float:1.967582E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "REG_DATE"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01af
            cm.l.v(r2)
            goto L_0x01b0
        L_0x01af:
            r1 = r0
        L_0x01b0:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26319i
            goto L_0x0043
        L_0x01b4:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01bc
            cm.l.v(r2)
            r0 = r1
        L_0x01bc:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26323m
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01f5
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01d2
            cm.l.v(r2)
            r0 = r1
        L_0x01d2:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26323m
            ld.c r4 = r7.s1()
            r5 = 2132018754(0x7f140642, float:1.9675824E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "REG_UPTO"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01f0
            cm.l.v(r2)
            goto L_0x01f1
        L_0x01f0:
            r1 = r0
        L_0x01f1:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26323m
            goto L_0x0043
        L_0x01f5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity.V1():boolean");
    }

    private final void z1() {
        R1((fi.b) new u0((x0) this, (u0.b) new bi.d(new fi.a(u1()))).a(fi.b.class));
        f9 f9Var = this.G;
        f9 f9Var2 = null;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        f9Var.f26319i.setFocusable(0);
        f9 f9Var3 = this.G;
        if (f9Var3 == null) {
            cm.l.v("binding");
            f9Var3 = null;
        }
        f9Var3.f26323m.setFocusable(0);
        f9 f9Var4 = this.G;
        if (f9Var4 == null) {
            cm.l.v("binding");
            f9Var4 = null;
        }
        f9Var4.f26324n.f28305f.setOnClickListener(new ei.c(this));
        f9 f9Var5 = this.G;
        if (f9Var5 == null) {
            cm.l.v("binding");
            f9Var5 = null;
        }
        f9Var5.f26324n.f28306g.setOnClickListener(new ei.d(this));
        f9 f9Var6 = this.G;
        if (f9Var6 == null) {
            cm.l.v("binding");
            f9Var6 = null;
        }
        f9Var6.f26317g.setOnClickListener(new ei.e(this));
        f9 f9Var7 = this.G;
        if (f9Var7 == null) {
            cm.l.v("binding");
            f9Var7 = null;
        }
        f9Var7.f26316f.setOnClickListener(new f(this));
        y1().g().g(this, new e(new b(this)));
        f9 f9Var8 = this.G;
        if (f9Var8 == null) {
            cm.l.v("binding");
            f9Var8 = null;
        }
        f9Var8.f26323m.setOnClickListener(new g(this));
        y1().h().g(this, new e(new c(this)));
        f9 f9Var9 = this.G;
        if (f9Var9 == null) {
            cm.l.v("binding");
        } else {
            f9Var2 = f9Var9;
        }
        f9Var2.f26319i.setOnClickListener(new ei.h(this));
        x1().D0().g(this, new e(new d(this)));
        x1().C0().g(this, new e(new a(this)));
    }

    public final void L1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void M1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.N = nrvDetails;
    }

    public final void N1(UpdateMobileUpdated updateMobileUpdated) {
        cm.l.f(updateMobileUpdated, "<set-?>");
        this.I = updateMobileUpdated;
    }

    public final void O1(UpdateModelVehDetails updateModelVehDetails) {
        this.Q = updateModelVehDetails;
    }

    public final void P1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.O = vahanProService;
    }

    public final void Q1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.P = hVar;
    }

    public final void R1(fi.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_update_mobile);
        f9 c10 = f9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        ProgressDialog progressDialog = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        e.a aVar = v9.e.f17509a;
        f9 f9Var = this.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        aVar.S2(this, f9Var);
        L1(new ld.c(this));
        N1(UpdateMobileUpdated.f21193a.b(this));
        P1(VahanProService.f21196b.b(this));
        Q1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(w1()))).a(h.class));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.J = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.J;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.J;
        if (progressDialog4 == null) {
            cm.l.v("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage(s1().b("label_challan_please_wait", "Please wait..."));
        z1();
    }

    public final ld.c s1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final UpdateMobileUpdated u1() {
        UpdateMobileUpdated updateMobileUpdated = this.I;
        if (updateMobileUpdated != null) {
            return updateMobileUpdated;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final UpdateModelVehDetails v1() {
        return this.Q;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.O;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final h x1() {
        h hVar = this.P;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final fi.b y1() {
        fi.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
