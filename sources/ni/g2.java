package ni;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;

public class g2 extends f2 {

    /* renamed from: u1  reason: collision with root package name */
    private static final SparseIntArray f26445u1;

    /* renamed from: g1  reason: collision with root package name */
    private final LinearLayout f26446g1;

    /* renamed from: h1  reason: collision with root package name */
    private androidx.databinding.g f26447h1;

    /* renamed from: i1  reason: collision with root package name */
    private androidx.databinding.g f26448i1;

    /* renamed from: j1  reason: collision with root package name */
    private androidx.databinding.g f26449j1;

    /* renamed from: k1  reason: collision with root package name */
    private androidx.databinding.g f26450k1;

    /* renamed from: l1  reason: collision with root package name */
    private androidx.databinding.g f26451l1;

    /* renamed from: m1  reason: collision with root package name */
    private androidx.databinding.g f26452m1;

    /* renamed from: n1  reason: collision with root package name */
    private androidx.databinding.g f26453n1;

    /* renamed from: o1  reason: collision with root package name */
    private androidx.databinding.g f26454o1;

    /* renamed from: p1  reason: collision with root package name */
    private androidx.databinding.g f26455p1;

    /* renamed from: q1  reason: collision with root package name */
    private androidx.databinding.g f26456q1;

    /* renamed from: r1  reason: collision with root package name */
    private androidx.databinding.g f26457r1;

    /* renamed from: s1  reason: collision with root package name */
    private androidx.databinding.g f26458s1;

    /* renamed from: t1  reason: collision with root package name */
    private long f26459t1;

    class a implements androidx.databinding.g {
        a() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26199t0);
            DlAddress dlAddress = g2.this.f26183e1;
            if (dlAddress != null) {
                dlAddress.setStreet(a10);
            }
        }
    }

    class b implements androidx.databinding.g {
        b() {
        }

        public void a() {
            synchronized (g2.this) {
                g2.x(g2.this, 16);
            }
            g2.this.u();
        }
    }

    class c implements androidx.databinding.g {
        c() {
        }

        public void a() {
            synchronized (g2.this) {
                g2.x(g2.this, 8);
            }
            g2.this.u();
        }
    }

    class d implements androidx.databinding.g {
        d() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.F);
            DlAddress dlAddress = g2.this.f26183e1;
            if (dlAddress != null) {
                dlAddress.setState(a10);
            }
        }
    }

    class e implements androidx.databinding.g {
        e() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26176b0);
            DlAddress dlAddress = g2.this.f26185f1;
            if (dlAddress != null) {
                dlAddress.setHouseNo(a10);
            }
        }
    }

    class f implements androidx.databinding.g {
        f() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26178c0);
            DlAddress dlAddress = g2.this.f26185f1;
            if (dlAddress != null) {
                dlAddress.setLocation(a10);
            }
        }
    }

    class g implements androidx.databinding.g {
        g() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26180d0);
            DlAddress dlAddress = g2.this.f26185f1;
            if (dlAddress != null) {
                dlAddress.setPinCode(a10);
            }
        }
    }

    class h implements androidx.databinding.g {
        h() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26182e0);
            DlAddress dlAddress = g2.this.f26185f1;
            if (dlAddress != null) {
                dlAddress.setStreet(a10);
            }
        }
    }

    class i implements androidx.databinding.g {
        i() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26187h0);
            DlAddress dlAddress = g2.this.f26185f1;
            if (dlAddress != null) {
                dlAddress.setState(a10);
            }
        }
    }

    class j implements androidx.databinding.g {
        j() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26195p0);
            DlAddress dlAddress = g2.this.f26183e1;
            if (dlAddress != null) {
                dlAddress.setHouseNo(a10);
            }
        }
    }

    class k implements androidx.databinding.g {
        k() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26197r0);
            DlAddress dlAddress = g2.this.f26183e1;
            if (dlAddress != null) {
                dlAddress.setLocation(a10);
            }
        }
    }

    class l implements androidx.databinding.g {
        l() {
        }

        public void a() {
            String a10 = d0.c.a(g2.this.f26198s0);
            DlAddress dlAddress = g2.this.f26183e1;
            if (dlAddress != null) {
                dlAddress.setPinCode(a10);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26445u1 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 27);
        sparseIntArray.put(R.id.dl_details_title, 28);
        sparseIntArray.put(R.id.dl_details_checked, 29);
        sparseIntArray.put(R.id.view, 30);
        sparseIntArray.put(R.id.dl_details_unchecked1, 31);
        sparseIntArray.put(R.id.view2, 32);
        sparseIntArray.put(R.id.dl_details_unchecked2, 33);
        sparseIntArray.put(R.id.dl_details_tv, 34);
        sparseIntArray.put(R.id.textView5, 35);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 36);
        sparseIntArray.put(R.id.dl_num_label, 37);
        sparseIntArray.put(R.id.dl_holder_label, 38);
        sparseIntArray.put(R.id.dl_holder_s_d_w_label, 39);
        sparseIntArray.put(R.id.dl_holder_dob_label, 40);
        sparseIntArray.put(R.id.dl_blood_label, 41);
        sparseIntArray.put(R.id.dl_present_add_label, 42);
        sparseIntArray.put(R.id.view3, 43);
        sparseIntArray.put(R.id.dl_vehicle_class_label, 44);
        sparseIntArray.put(R.id.dl_cov_abbr_tv, 45);
        sparseIntArray.put(R.id.dl_issuing_authority_label, 46);
        sparseIntArray.put(R.id.view4, 47);
        sparseIntArray.put(R.id.lmv_label, 48);
        sparseIntArray.put(R.id.dl_lmv_tv, 49);
        sparseIntArray.put(R.id.trans_label, 50);
        sparseIntArray.put(R.id.dl_trans_tv, 51);
        sparseIntArray.put(R.id.view5, 52);
        sparseIntArray.put(R.id.valid_period_label, 53);
        sparseIntArray.put(R.id.view6, 54);
        sparseIntArray.put(R.id.non_tranport_label, 55);
        sparseIntArray.put(R.id.trans_validity_label, 56);
        sparseIntArray.put(R.id.review_all_details_label, 57);
        sparseIntArray.put(R.id.dl_licence_holder_label, 58);
        sparseIntArray.put(R.id.view7, 59);
        sparseIntArray.put(R.id.dl_licence_holder_name_label, 60);
        sparseIntArray.put(R.id.dl_state_et, 61);
        sparseIntArray.put(R.id.dl_state_rto_et, 62);
        sparseIntArray.put(R.id.dl_current_pic_img, 63);
        sparseIntArray.put(R.id.delete_verification_img, 64);
        sparseIntArray.put(R.id.aplicant_label, 65);
        sparseIntArray.put(R.id.tab_to_click_label, 66);
        sparseIntArray.put(R.id.upload_img_for_verify_bt, 67);
        sparseIntArray.put(R.id.want_to_change_add_cb, 68);
        sparseIntArray.put(R.id.current_address_to_be_printed_label, 69);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 70);
        sparseIntArray.put(R.id.dl_current_address_city_et, 71);
        sparseIntArray.put(R.id.village_town_rg, 72);
        sparseIntArray.put(R.id.village_rb, 73);
        sparseIntArray.put(R.id.town_rb, 74);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 75);
        sparseIntArray.put(R.id.parmanent_address_to_be_printed_label, 76);
        sparseIntArray.put(R.id.same_as_current_address_cb, 77);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 78);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 79);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 80);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 81);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 82);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 83);
        sparseIntArray.put(R.id.i_have_decleare_all_details_cb, 84);
        sparseIntArray.put(R.id.save_continue_to_next, 85);
    }

    public g2(androidx.databinding.e eVar, View view) {
        this(eVar, view, androidx.databinding.h.r(eVar, view, 86, (h.i) null, f26445u1));
    }

    static /* synthetic */ long x(g2 g2Var, long j10) {
        long j11 = j10 | g2Var.f26459t1;
        g2Var.f26459t1 = j11;
        return j11;
    }

    public void A() {
        synchronized (this) {
            this.f26459t1 = 32;
        }
        u();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r39 = this;
            r1 = r39
            monitor-enter(r39)
            long r2 = r1.f26459t1     // Catch:{ all -> 0x031d }
            r4 = 0
            r1.f26459t1 = r4     // Catch:{ all -> 0x031d }
            monitor-exit(r39)     // Catch:{ all -> 0x031d }
            com.nic.mparivahan.dlservices.data.model.DlAddress r0 = r1.f26185f1
            com.nic.mparivahan.dlservices.data.model.DlRenewalResponse r6 = r1.f26181d1
            com.nic.mparivahan.dlservices.data.model.DlAddress r7 = r1.f26183e1
            r8 = 40
            long r10 = r2 & r8
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r12 = 0
            if (r10 == 0) goto L_0x0030
            android.widget.CheckBox r13 = r1.f26175a1
            boolean r13 = r13.isChecked()
            if (r10 == 0) goto L_0x002a
            if (r13 == 0) goto L_0x0027
            r14 = 128(0x80, double:6.32E-322)
        L_0x0025:
            long r2 = r2 | r14
            goto L_0x002a
        L_0x0027:
            r14 = 64
            goto L_0x0025
        L_0x002a:
            if (r13 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r10 = 8
            goto L_0x0031
        L_0x0030:
            r10 = r12
        L_0x0031:
            r13 = 33
            long r15 = r2 & r13
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            java.lang.String r15 = r0.getHouseNo()
            java.lang.String r17 = r0.getPinCode()
            java.lang.String r18 = r0.getStreet()
            java.lang.String r19 = r0.getLocation()
            java.lang.String r0 = r0.getState()
            r8 = r17
            r9 = r18
            r20 = r19
            goto L_0x005c
        L_0x0056:
            r0 = 0
            r8 = 0
            r9 = 0
            r15 = 0
            r20 = 0
        L_0x005c:
            r21 = 34
            long r23 = r2 & r21
            int r19 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x018d
            if (r6 == 0) goto L_0x006b
            com.nic.mparivahan.dlservices.data.model.Dlresponse r6 = r6.getDlresponse()
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 == 0) goto L_0x0073
            java.util.List r6 = r6.getDldetobj()
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r6.get(r12)
            com.nic.mparivahan.dlservices.data.model.DldetobjItem r6 = (com.nic.mparivahan.dlservices.data.model.DldetobjItem) r6
            goto L_0x007e
        L_0x007d:
            r6 = 0
        L_0x007e:
            if (r6 == 0) goto L_0x008d
            com.nic.mparivahan.dlservices.data.model.BioImgObj r19 = r6.getBioImgObj()
            com.nic.mparivahan.dlservices.data.model.BioObj r23 = r6.getBioObj()
            com.nic.mparivahan.dlservices.data.model.Dlobj r6 = r6.getDlobj()
            goto L_0x0092
        L_0x008d:
            r6 = 0
            r19 = 0
            r23 = 0
        L_0x0092:
            if (r19 == 0) goto L_0x009d
            java.lang.String r24 = r19.getBiSignature()
            java.lang.String r19 = r19.getBiPhoto()
            goto L_0x00a1
        L_0x009d:
            r19 = 0
            r24 = 0
        L_0x00a1:
            if (r23 == 0) goto L_0x00c6
            java.lang.String r25 = r23.getBioFullName()
            java.lang.String r26 = r23.getBioTempAdd2()
            java.lang.String r27 = r23.getBioTempAdd3()
            java.lang.String r28 = r23.getBioDob()
            java.lang.String r29 = r23.getBioBloodGroupname()
            java.lang.String r30 = r23.getBioSwdFullName()
            java.lang.String r23 = r23.getBioTempAdd1()
            r12 = r23
            r13 = r26
            r14 = r27
            goto L_0x00d1
        L_0x00c6:
            r12 = 0
            r13 = 0
            r14 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x00d1:
            if (r6 == 0) goto L_0x00f0
            java.lang.String r31 = r6.getDlLicno()
            java.lang.String r32 = r6.getDlTrValdfrDt()
            java.lang.String r33 = r6.getDlTrValdtoDt()
            java.lang.String r34 = r6.getDlNtValdfrDt()
            java.lang.Object r6 = r6.getDlNtValdtoDate()
            r35 = r10
            r11 = r32
            r4 = r33
            r5 = r34
            goto L_0x00f8
        L_0x00f0:
            r35 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r11 = 0
            r31 = 0
        L_0x00f8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            java.lang.String r12 = " "
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = " to "
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r5 = " to "
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r13)
            java.lang.String r10 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r4)
            java.lang.String r11 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r6)
            java.lang.String r5 = r12.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            java.lang.String r10 = " "
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r14)
            java.lang.String r6 = r10.toString()
            r10 = r19
            r12 = r24
            r13 = r25
            r14 = r28
            r19 = r0
            r25 = r8
            r24 = r9
            r0 = r29
            r9 = r30
            r8 = r31
            goto L_0x01a0
        L_0x018d:
            r35 = r10
            r19 = r0
            r25 = r8
            r24 = r9
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x01a0:
            r28 = 48
            long r30 = r2 & r28
            r33 = 0
            int r30 = (r30 > r33 ? 1 : (r30 == r33 ? 0 : -1))
            r31 = r15
            if (r30 == 0) goto L_0x01c8
            android.widget.CheckBox r15 = r1.G0
            boolean r15 = r15.isChecked()
            if (r30 == 0) goto L_0x01be
            if (r15 == 0) goto L_0x01bb
            r36 = 512(0x200, double:2.53E-321)
        L_0x01b8:
            long r2 = r2 | r36
            goto L_0x01be
        L_0x01bb:
            r36 = 256(0x100, double:1.265E-321)
            goto L_0x01b8
        L_0x01be:
            if (r15 == 0) goto L_0x01c3
            r16 = 8
            goto L_0x01c5
        L_0x01c3:
            r16 = 0
        L_0x01c5:
            r15 = r16
            goto L_0x01c9
        L_0x01c8:
            r15 = 0
        L_0x01c9:
            r36 = 36
            long r36 = r2 & r36
            r33 = 0
            int r16 = (r36 > r33 ? 1 : (r36 == r33 ? 0 : -1))
            if (r16 == 0) goto L_0x01f4
            if (r7 == 0) goto L_0x01f4
            java.lang.String r23 = r7.getPinCode()
            java.lang.String r30 = r7.getLocation()
            java.lang.String r36 = r7.getStreet()
            java.lang.String r37 = r7.getHouseNo()
            java.lang.String r7 = r7.getState()
            r38 = r36
            r36 = r30
            r30 = r23
            r23 = r15
            r15 = r37
            goto L_0x01fe
        L_0x01f4:
            r23 = r15
            r7 = 0
            r15 = 0
            r30 = 0
            r36 = 0
            r38 = 0
        L_0x01fe:
            long r21 = r2 & r21
            r33 = 0
            int r21 = (r21 > r33 ? 1 : (r21 == r33 ? 0 : -1))
            if (r21 == 0) goto L_0x024a
            r21 = r2
            android.widget.TextView r2 = r1.B
            d0.c.c(r2, r0)
            android.widget.TextView r0 = r1.N
            d0.c.c(r0, r14)
            android.widget.TextView r0 = r1.Q
            d0.c.c(r0, r9)
            android.widget.TextView r0 = r1.R
            d0.c.c(r0, r13)
            android.widget.TextView r0 = r1.V
            d0.c.c(r0, r13)
            android.widget.TextView r0 = r1.W
            d0.c.c(r0, r8)
            android.widget.TextView r0 = r1.Y
            d0.c.c(r0, r8)
            android.widget.TextView r0 = r1.Z
            d0.c.c(r0, r5)
            android.widget.TextView r0 = r1.f26193n0
            d0.c.c(r0, r6)
            com.nic.mparivahan.dlservices.widget.CircleImageView r0 = r1.f26194o0
            com.nic.mparivahan.dlservices.utilities.a.c(r0, r10)
            android.widget.TextView r0 = r1.f26205x0
            d0.c.c(r0, r11)
            android.widget.TextView r0 = r1.f26207y0
            com.nic.mparivahan.dlservices.utilities.a.a(r0, r4)
            android.widget.ImageView r0 = r1.I0
            com.nic.mparivahan.dlservices.utilities.a.c(r0, r12)
            goto L_0x024c
        L_0x024a:
            r21 = r2
        L_0x024c:
            if (r16 == 0) goto L_0x026d
            android.widget.EditText r0 = r1.F
            d0.c.c(r0, r7)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26195p0
            d0.c.c(r0, r15)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26197r0
            r2 = r36
            d0.c.c(r0, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26198s0
            r2 = r30
            d0.c.c(r0, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26199t0
            r2 = r38
            d0.c.c(r0, r2)
        L_0x026d:
            r2 = 32
            long r2 = r21 & r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02cc
            android.widget.EditText r0 = r1.F
            androidx.databinding.g r2 = r1.f26447h1
            r3 = 0
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26176b0
            androidx.databinding.g r2 = r1.f26448i1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26178c0
            androidx.databinding.g r2 = r1.f26449j1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26180d0
            androidx.databinding.g r2 = r1.f26450k1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26182e0
            androidx.databinding.g r2 = r1.f26451l1
            d0.c.d(r0, r3, r3, r3, r2)
            android.widget.EditText r0 = r1.f26187h0
            androidx.databinding.g r2 = r1.f26452m1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26195p0
            androidx.databinding.g r2 = r1.f26453n1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26197r0
            androidx.databinding.g r2 = r1.f26454o1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26198s0
            androidx.databinding.g r2 = r1.f26455p1
            d0.c.d(r0, r3, r3, r3, r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26199t0
            androidx.databinding.g r2 = r1.f26456q1
            d0.c.d(r0, r3, r3, r3, r2)
            android.widget.CheckBox r0 = r1.G0
            androidx.databinding.g r2 = r1.f26457r1
            d0.a.b(r0, r3, r2)
            android.widget.CheckBox r0 = r1.f26175a1
            androidx.databinding.g r2 = r1.f26458s1
            d0.a.b(r0, r3, r2)
        L_0x02cc:
            r2 = 33
            long r2 = r21 & r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02f9
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26176b0
            r15 = r31
            d0.c.c(r0, r15)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26178c0
            r11 = r20
            d0.c.c(r0, r11)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26180d0
            r11 = r25
            d0.c.c(r0, r11)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26182e0
            r11 = r24
            d0.c.c(r0, r11)
            android.widget.EditText r0 = r1.f26187h0
            r11 = r19
            d0.c.c(r0, r11)
        L_0x02f9:
            long r2 = r21 & r28
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0308
            android.widget.LinearLayout r0 = r1.f26446g1
            r2 = r23
            r0.setVisibility(r2)
        L_0x0308:
            r2 = 40
            long r2 = r21 & r2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x031c
            android.widget.LinearLayout r0 = r1.f26177b1
            r10 = r35
            r0.setVisibility(r10)
            android.widget.FrameLayout r0 = r1.f26179c1
            r0.setVisibility(r10)
        L_0x031c:
            return
        L_0x031d:
            r0 = move-exception
            monitor-exit(r39)     // Catch:{ all -> 0x031d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.g2.i():void");
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.f26459t1 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g2(androidx.databinding.e r91, android.view.View r92, java.lang.Object[] r93) {
        /*
            r90 = this;
            r15 = r90
            r3 = 0
            r0 = 36
            r0 = r93[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 65
            r0 = r93[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 69
            r0 = r93[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 64
            r0 = r93[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 41
            r0 = r93[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r93[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 45
            r0 = r93[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 71
            r0 = r93[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = 70
            r0 = r93[r0]
            r12 = r0
            android.widget.EditText r12 = (android.widget.EditText) r12
            r0 = 15
            r0 = r93[r0]
            r13 = r0
            android.widget.EditText r13 = (android.widget.EditText) r13
            r0 = 63
            r0 = r93[r0]
            r14 = r0
            com.nic.mparivahan.dlservices.widget.CircleImageView r14 = (com.nic.mparivahan.dlservices.widget.CircleImageView) r14
            r0 = 29
            r0 = r93[r0]
            r16 = r0
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r0 = 28
            r0 = r93[r0]
            r17 = r0
            com.nic.mparivahan.MyTextView r17 = (com.nic.mparivahan.MyTextView) r17
            r0 = 34
            r0 = r93[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 31
            r0 = r93[r0]
            r19 = r0
            android.widget.ImageView r19 = (android.widget.ImageView) r19
            r0 = 33
            r0 = r93[r0]
            r20 = r0
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            r0 = 40
            r0 = r93[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 6
            r0 = r93[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 38
            r0 = r93[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 39
            r0 = r93[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 5
            r0 = r93[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 4
            r0 = r93[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 46
            r0 = r93[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 58
            r0 = r93[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 60
            r0 = r93[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 13
            r0 = r93[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 12
            r0 = r93[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 49
            r0 = r93[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 2
            r0 = r93[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r0 = 10
            r0 = r93[r0]
            r34 = r0
            android.widget.TextView r34 = (android.widget.TextView) r34
            r0 = 37
            r0 = r93[r0]
            r35 = r0
            android.widget.TextView r35 = (android.widget.TextView) r35
            r0 = 23
            r0 = r93[r0]
            r36 = r0
            androidx.appcompat.widget.AppCompatEditText r36 = (androidx.appcompat.widget.AppCompatEditText) r36
            r0 = 25
            r0 = r93[r0]
            r37 = r0
            androidx.appcompat.widget.AppCompatEditText r37 = (androidx.appcompat.widget.AppCompatEditText) r37
            r0 = 26
            r0 = r93[r0]
            r38 = r0
            androidx.appcompat.widget.AppCompatEditText r38 = (androidx.appcompat.widget.AppCompatEditText) r38
            r0 = 24
            r0 = r93[r0]
            r39 = r0
            androidx.appcompat.widget.AppCompatEditText r39 = (androidx.appcompat.widget.AppCompatEditText) r39
            r0 = 79
            r0 = r93[r0]
            r40 = r0
            android.widget.EditText r40 = (android.widget.EditText) r40
            r0 = 78
            r0 = r93[r0]
            r41 = r0
            android.widget.EditText r41 = (android.widget.EditText) r41
            r0 = 22
            r0 = r93[r0]
            r42 = r0
            android.widget.EditText r42 = (android.widget.EditText) r42
            r0 = 83
            r0 = r93[r0]
            r43 = r0
            android.widget.EditText r43 = (android.widget.EditText) r43
            r0 = 82
            r0 = r93[r0]
            r44 = r0
            android.widget.RadioButton r44 = (android.widget.RadioButton) r44
            r0 = 81
            r0 = r93[r0]
            r45 = r0
            android.widget.RadioButton r45 = (android.widget.RadioButton) r45
            r0 = 80
            r0 = r93[r0]
            r46 = r0
            android.widget.RadioGroup r46 = (android.widget.RadioGroup) r46
            r0 = 42
            r0 = r93[r0]
            r47 = r0
            android.widget.TextView r47 = (android.widget.TextView) r47
            r0 = 8
            r0 = r93[r0]
            r48 = r0
            android.widget.TextView r48 = (android.widget.TextView) r48
            r0 = 1
            r0 = r93[r0]
            r49 = r0
            com.nic.mparivahan.dlservices.widget.CircleImageView r49 = (com.nic.mparivahan.dlservices.widget.CircleImageView) r49
            r0 = 16
            r0 = r93[r0]
            r50 = r0
            androidx.appcompat.widget.AppCompatEditText r50 = (androidx.appcompat.widget.AppCompatEditText) r50
            r0 = 75
            r0 = r93[r0]
            r51 = r0
            android.widget.EditText r51 = (android.widget.EditText) r51
            r0 = 18
            r0 = r93[r0]
            r52 = r0
            androidx.appcompat.widget.AppCompatEditText r52 = (androidx.appcompat.widget.AppCompatEditText) r52
            r0 = 19
            r0 = r93[r0]
            r53 = r0
            androidx.appcompat.widget.AppCompatEditText r53 = (androidx.appcompat.widget.AppCompatEditText) r53
            r0 = 17
            r0 = r93[r0]
            r54 = r0
            androidx.appcompat.widget.AppCompatEditText r54 = (androidx.appcompat.widget.AppCompatEditText) r54
            r0 = 61
            r0 = r93[r0]
            r55 = r0
            android.widget.EditText r55 = (android.widget.EditText) r55
            r0 = 62
            r0 = r93[r0]
            r56 = r0
            android.widget.EditText r56 = (android.widget.EditText) r56
            r0 = 51
            r0 = r93[r0]
            r57 = r0
            android.widget.TextView r57 = (android.widget.TextView) r57
            r0 = 11
            r0 = r93[r0]
            r58 = r0
            android.widget.TextView r58 = (android.widget.TextView) r58
            r0 = 9
            r0 = r93[r0]
            r59 = r0
            android.widget.TextView r59 = (android.widget.TextView) r59
            r0 = 44
            r0 = r93[r0]
            r60 = r0
            android.widget.TextView r60 = (android.widget.TextView) r60
            r0 = 27
            r0 = r93[r0]
            r2 = 0
            if (r0 == 0) goto L_0x01c2
            android.view.View r0 = (android.view.View) r0
            ni.dc r0 = ni.dc.a(r0)
            r89 = r0
            goto L_0x01c4
        L_0x01c2:
            r89 = r2
        L_0x01c4:
            r0 = 84
            r0 = r93[r0]
            r61 = r0
            android.widget.CheckBox r61 = (android.widget.CheckBox) r61
            r0 = 48
            r0 = r93[r0]
            r62 = r0
            android.widget.TextView r62 = (android.widget.TextView) r62
            r0 = 55
            r0 = r93[r0]
            r63 = r0
            android.widget.TextView r63 = (android.widget.TextView) r63
            r0 = 76
            r0 = r93[r0]
            r64 = r0
            android.widget.TextView r64 = (android.widget.TextView) r64
            r0 = 57
            r0 = r93[r0]
            r65 = r0
            android.widget.TextView r65 = (android.widget.TextView) r65
            r0 = 77
            r0 = r93[r0]
            r66 = r0
            android.widget.CheckBox r66 = (android.widget.CheckBox) r66
            r0 = 85
            r0 = r93[r0]
            r67 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r67 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r67
            r0 = 3
            r0 = r93[r0]
            r68 = r0
            android.widget.ImageView r68 = (android.widget.ImageView) r68
            r0 = 0
            r0 = r93[r0]
            r69 = r0
            android.widget.LinearLayout r69 = (android.widget.LinearLayout) r69
            r0 = 66
            r0 = r93[r0]
            r70 = r0
            android.widget.TextView r70 = (android.widget.TextView) r70
            r0 = 35
            r0 = r93[r0]
            r71 = r0
            android.widget.TextView r71 = (android.widget.TextView) r71
            r0 = 74
            r0 = r93[r0]
            r72 = r0
            android.widget.RadioButton r72 = (android.widget.RadioButton) r72
            r0 = 50
            r0 = r93[r0]
            r73 = r0
            android.widget.TextView r73 = (android.widget.TextView) r73
            r0 = 56
            r0 = r93[r0]
            r74 = r0
            android.widget.TextView r74 = (android.widget.TextView) r74
            r0 = 67
            r0 = r93[r0]
            r75 = r0
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r75 = (com.nic.mparivahan.dlservices.widget.CustomWegetLayout) r75
            r0 = 53
            r0 = r93[r0]
            r76 = r0
            android.widget.TextView r76 = (android.widget.TextView) r76
            r0 = 30
            r0 = r93[r0]
            r77 = r0
            android.view.View r77 = (android.view.View) r77
            r0 = 32
            r0 = r93[r0]
            r78 = r0
            android.view.View r78 = (android.view.View) r78
            r0 = 43
            r0 = r93[r0]
            r79 = r0
            android.view.View r79 = (android.view.View) r79
            r0 = 47
            r0 = r93[r0]
            r80 = r0
            android.view.View r80 = (android.view.View) r80
            r0 = 52
            r0 = r93[r0]
            r81 = r0
            android.view.View r81 = (android.view.View) r81
            r0 = 54
            r0 = r93[r0]
            r82 = r0
            android.view.View r82 = (android.view.View) r82
            r0 = 59
            r0 = r93[r0]
            r83 = r0
            android.view.View r83 = (android.view.View) r83
            r0 = 73
            r0 = r93[r0]
            r84 = r0
            android.widget.RadioButton r84 = (android.widget.RadioButton) r84
            r0 = 72
            r0 = r93[r0]
            r85 = r0
            android.widget.RadioGroup r85 = (android.widget.RadioGroup) r85
            r0 = 68
            r0 = r93[r0]
            r86 = r0
            android.widget.CheckBox r86 = (android.widget.CheckBox) r86
            r0 = 14
            r0 = r93[r0]
            r87 = r0
            android.widget.LinearLayout r87 = (android.widget.LinearLayout) r87
            r0 = 20
            r0 = r93[r0]
            r88 = r0
            android.widget.FrameLayout r88 = (android.widget.FrameLayout) r88
            r0 = r90
            r1 = r91
            r2 = r92
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r44
            r44 = r45
            r45 = r46
            r46 = r47
            r47 = r48
            r48 = r49
            r49 = r50
            r50 = r51
            r51 = r52
            r52 = r53
            r53 = r54
            r54 = r55
            r55 = r56
            r56 = r57
            r57 = r58
            r58 = r59
            r59 = r60
            r60 = r89
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88)
            ni.g2$d r0 = new ni.g2$d
            r1 = r90
            r0.<init>()
            r1.f26447h1 = r0
            ni.g2$e r0 = new ni.g2$e
            r0.<init>()
            r1.f26448i1 = r0
            ni.g2$f r0 = new ni.g2$f
            r0.<init>()
            r1.f26449j1 = r0
            ni.g2$g r0 = new ni.g2$g
            r0.<init>()
            r1.f26450k1 = r0
            ni.g2$h r0 = new ni.g2$h
            r0.<init>()
            r1.f26451l1 = r0
            ni.g2$i r0 = new ni.g2$i
            r0.<init>()
            r1.f26452m1 = r0
            ni.g2$j r0 = new ni.g2$j
            r0.<init>()
            r1.f26453n1 = r0
            ni.g2$k r0 = new ni.g2$k
            r0.<init>()
            r1.f26454o1 = r0
            ni.g2$l r0 = new ni.g2$l
            r0.<init>()
            r1.f26455p1 = r0
            ni.g2$a r0 = new ni.g2$a
            r0.<init>()
            r1.f26456q1 = r0
            ni.g2$b r0 = new ni.g2$b
            r0.<init>()
            r1.f26457r1 = r0
            ni.g2$c r0 = new ni.g2$c
            r0.<init>()
            r1.f26458s1 = r0
            r2 = -1
            r1.f26459t1 = r2
            android.widget.TextView r0 = r1.B
            r2 = 0
            r0.setTag(r2)
            android.widget.EditText r0 = r1.F
            r0.setTag(r2)
            android.widget.TextView r0 = r1.N
            r0.setTag(r2)
            android.widget.TextView r0 = r1.Q
            r0.setTag(r2)
            android.widget.TextView r0 = r1.R
            r0.setTag(r2)
            android.widget.TextView r0 = r1.V
            r0.setTag(r2)
            android.widget.TextView r0 = r1.W
            r0.setTag(r2)
            android.widget.TextView r0 = r1.Y
            r0.setTag(r2)
            android.widget.TextView r0 = r1.Z
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26176b0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26178c0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26180d0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26182e0
            r0.setTag(r2)
            android.widget.EditText r0 = r1.f26187h0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.f26193n0
            r0.setTag(r2)
            com.nic.mparivahan.dlservices.widget.CircleImageView r0 = r1.f26194o0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26195p0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26197r0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26198s0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26199t0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.f26205x0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.f26207y0
            r0.setTag(r2)
            r0 = 21
            r0 = r93[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f26446g1 = r0
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.I0
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.J0
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f26177b1
            r0.setTag(r2)
            android.widget.FrameLayout r0 = r1.f26179c1
            r0.setTag(r2)
            r0 = r92
            r1.w(r0)
            r90.A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.g2.<init>(androidx.databinding.e, android.view.View, java.lang.Object[]):void");
    }
}
