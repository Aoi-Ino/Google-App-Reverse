package ma;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import java.util.ArrayList;
import ld.c;
import ld.f;

public final class m extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13933d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13934e;

    /* renamed from: f  reason: collision with root package name */
    private String f13935f;

    /* renamed from: g  reason: collision with root package name */
    private String f13936g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13937y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13938z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13937y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13938z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13937y;
        }

        public final LinearLayout Q() {
            return this.f13938z;
        }
    }

    public m(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "state_code");
        this.f13933d = arrayList;
        this.f13934e = context;
        this.f13935f = str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        r10.r(r9.P().getText().toString(), "910");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x05cf, code lost:
        r7 = new android.content.Intent(r8.f13934e, com.nic.mparivahan.Dashboard.EnabledServices.EsActivity.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bb, code lost:
        r11.r(r9.P().getText().toString(), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x036c, code lost:
        r10.r(r9, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F(int r7, ma.m r8, ma.m.a r9, ld.c r10, android.view.View r11) {
        /*
            java.lang.String r11 = "this$0"
            cm.l.f(r8, r11)
            java.lang.String r11 = "$holder"
            cm.l.f(r9, r11)
            java.lang.String r11 = "$langSession"
            cm.l.f(r10, r11)
            r11 = 3
            java.lang.String r0 = "state_code"
            if (r7 != r11) goto L_0x0029
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.Dashboard.EsSectionActivity> r10 = com.nic.mparivahan.Dashboard.EsSectionActivity.class
            r7.<init>(r9, r10)
        L_0x001d:
            java.lang.String r9 = r8.f13935f
            r7.putExtra(r0, r9)
        L_0x0022:
            android.content.Context r8 = r8.f13934e
            r8.startActivity(r7)
            goto L_0x05f8
        L_0x0029:
            java.util.ArrayList r11 = r8.f13933d
            java.lang.Object r7 = r11.get(r7)
            java.lang.String r11 = "get(...)"
            cm.l.e(r7, r11)
            com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice r7 = (com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice) r7
            java.lang.String r7 = r7.getServCode()
            int r11 = r7.hashCode()
            java.lang.String r1 = "4"
            java.lang.Class<com.nic.mparivahan.LLMainScreen.LLMain> r2 = com.nic.mparivahan.LLMainScreen.LLMain.class
            java.lang.Class<com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity> r3 = com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity.class
            java.lang.String r4 = "910"
            java.lang.Class<com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen> r5 = com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen.class
            java.lang.Class<com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen> r6 = com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen.class
            switch(r11) {
                case 49587: goto L_0x05c7;
                case 49589: goto L_0x059e;
                case 49590: goto L_0x0577;
                case 51694: goto L_0x0545;
                case 52470: goto L_0x0516;
                case 52471: goto L_0x04e9;
                case 52473: goto L_0x04bc;
                case 52501: goto L_0x0492;
                case 52503: goto L_0x046a;
                case 52504: goto L_0x0442;
                case 52505: goto L_0x041a;
                case 52506: goto L_0x03f2;
                case 52534: goto L_0x03ca;
                case 52535: goto L_0x039a;
                case 52536: goto L_0x0371;
                case 52537: goto L_0x0346;
                case 52601: goto L_0x0318;
                case 52625: goto L_0x02e8;
                case 52626: goto L_0x02ba;
                case 52627: goto L_0x028c;
                case 52628: goto L_0x025e;
                case 52633: goto L_0x0230;
                case 52690: goto L_0x0211;
                case 56314: goto L_0x01dd;
                case 56315: goto L_0x01c3;
                case 56316: goto L_0x0107;
                case 56320: goto L_0x00ec;
                case 56321: goto L_0x00cc;
                case 56322: goto L_0x009c;
                case 56344: goto L_0x007e;
                case 56499: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x05cf
        L_0x004f:
            java.lang.String r10 = "960"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0059
            goto L_0x05cf
        L_0x0059:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity.class
            r7.<init>(r10, r11)
            java.lang.String r10 = r8.f13935f
            r7.putExtra(r0, r10)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
        L_0x006e:
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            r10.r(r9, r4)
            goto L_0x0022
        L_0x007e:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0086
            goto L_0x05cf
        L_0x0086:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity.class
            r7.<init>(r10, r11)
            java.lang.String r10 = r8.f13935f
            r7.putExtra(r0, r10)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            goto L_0x006e
        L_0x009c:
            java.lang.String r10 = "909"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x00a6
            goto L_0x05cf
        L_0x00a6:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.AddCov.View.CovApplication> r1 = com.nic.mparivahan.AddCov.View.CovApplication.class
            r7.<init>(r11, r1)
            java.lang.String r11 = r8.f13935f
            r7.putExtra(r0, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13934e
            r11.<init>(r0)
        L_0x00bb:
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            r11.r(r9, r10)
            goto L_0x0022
        L_0x00cc:
            java.lang.String r10 = "908"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x00d6
            goto L_0x05cf
        L_0x00d6:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen> r1 = com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen.class
            r7.<init>(r11, r1)
            java.lang.String r11 = r8.f13935f
            r7.putExtra(r0, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13934e
            r11.<init>(r0)
            goto L_0x00bb
        L_0x00ec:
            java.lang.String r10 = "907"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x00f6
            goto L_0x05cf
        L_0x00f6:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen> r0 = com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen.class
            r7.<init>(r11, r0)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13934e
            r11.<init>(r0)
            goto L_0x00bb
        L_0x0107:
            java.lang.String r9 = "903"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0111
            goto L_0x05cf
        L_0x0111:
            android.app.Dialog r7 = new android.app.Dialog
            android.content.Context r9 = r8.f13934e
            r7.<init>(r9)
            r9 = 2131558765(0x7f0d016d, float:1.8742855E38)
            r7.setContentView(r9)
            android.view.Window r9 = r7.getWindow()
            cm.l.c(r9)
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable
            r0 = 0
            r11.<init>(r0)
            r9.setBackgroundDrawable(r11)
            r9 = 2131362213(0x7f0a01a5, float:1.83442E38)
            android.view.View r9 = r7.findViewById(r9)
            java.lang.String r11 = "null cannot be cast to non-null type android.widget.ImageView"
            cm.l.d(r9, r11)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r11 = 2131363089(0x7f0a0511, float:1.8345977E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r11, r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 2131363093(0x7f0a0515, float:1.8345985E38)
            android.view.View r2 = r7.findViewById(r2)
            cm.l.d(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131365224(0x7f0a0d68, float:1.8350307E38)
            android.view.View r3 = r7.findViewById(r3)
            cm.l.d(r3, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r0 = "nex_parivahan"
            java.lang.String r4 = "NextGen mParivahan"
            java.lang.String r0 = r10.b(r0, r4)
            r3.setText(r0)
            java.lang.String r0 = "label_view_form_1"
            java.lang.String r3 = "View Form 1-A"
            java.lang.String r0 = r10.b(r0, r3)
            r11.setText(r0)
            java.lang.String r0 = "label_view_form_2"
            java.lang.String r3 = "View Form 2"
            java.lang.String r4 = r10.b(r0, r3)
            r2.setText(r4)
            ld.f r4 = new ld.f
            android.content.Context r5 = r8.f13934e
            r4.<init>(r5)
            java.lang.String r4 = r4.b()
            r5 = 1
            boolean r1 = km.p.o(r4, r1, r5)
            if (r1 == 0) goto L_0x01a1
            java.lang.String r0 = "label_form_4"
            java.lang.String r1 = "View Form 4-A"
            java.lang.String r0 = r10.b(r0, r1)
        L_0x019d:
            r2.setText(r0)
            goto L_0x01a6
        L_0x01a1:
            java.lang.String r0 = r10.b(r0, r3)
            goto L_0x019d
        L_0x01a6:
            ma.j r0 = new ma.j
            r0.<init>(r7)
            r9.setOnClickListener(r0)
            ma.k r9 = new ma.k
            r9.<init>(r7, r8, r10)
            r11.setOnClickListener(r9)
            ma.l r9 = new ma.l
            r9.<init>(r7, r8, r10)
            r2.setOnClickListener(r9)
            r7.show()
            goto L_0x05f8
        L_0x01c3:
            java.lang.String r10 = "902"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x01cd
            goto L_0x05cf
        L_0x01cd:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13934e
            r7.<init>(r11, r3)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13934e
            r11.<init>(r0)
            goto L_0x00bb
        L_0x01dd:
            java.lang.String r10 = "901"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x01e7
            goto L_0x05cf
        L_0x01e7:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r3)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x020b:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x05f8
        L_0x0211:
            java.lang.String r10 = "574"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x021b
            goto L_0x05cf
        L_0x021b:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13934e
            r7.<init>(r11, r2)
            java.lang.String r11 = r8.f13935f
            r7.putExtra(r0, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13934e
            r11.<init>(r0)
            goto L_0x00bb
        L_0x0230:
            java.lang.String r10 = "559"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x023a
            goto L_0x05cf
        L_0x023a:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r5)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x025e:
            java.lang.String r10 = "554"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0268
            goto L_0x05cf
        L_0x0268:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r5)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x028c:
            java.lang.String r10 = "553"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0296
            goto L_0x05cf
        L_0x0296:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r5)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x02ba:
            java.lang.String r10 = "552"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x02c4
            goto L_0x05cf
        L_0x02c4:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r5)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x02e8:
            java.lang.String r10 = "551"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x02f2
            goto L_0x05cf
        L_0x02f2:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            java.lang.Class<com.nic.mparivahan.ClServices.View.NewCl.NewClOne> r0 = com.nic.mparivahan.ClServices.View.NewCl.NewClOne.class
            r7.<init>(r11, r0)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x0318:
            java.lang.String r10 = "548"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0322
            goto L_0x05cf
        L_0x0322:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r11, r6)     // Catch:{ Exception -> 0x020b }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r0 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r11.<init>(r0)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r11.r(r9, r10)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x0346:
            java.lang.String r10 = "526"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0350
            goto L_0x05cf
        L_0x0350:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "526"
        L_0x036c:
            r10.r(r9, r11)
            goto L_0x0022
        L_0x0371:
            java.lang.String r10 = "525"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x037b
            goto L_0x05cf
        L_0x037b:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            r10.r(r9, r1)
            goto L_0x0022
        L_0x039a:
            java.lang.String r10 = "524"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x03a4
            goto L_0x05cf
        L_0x03a4:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r10 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r7.<init>(r10, r6)     // Catch:{ Exception -> 0x020b }
            ld.f r10 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r10.<init>(r11)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            java.lang.String r11 = "524"
            r10.r(r9, r11)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x03ca:
            java.lang.String r10 = "523"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x03d4
            goto L_0x05cf
        L_0x03d4:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "5"
            goto L_0x036c
        L_0x03f2:
            java.lang.String r10 = "516"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x03fc
            goto L_0x05cf
        L_0x03fc:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "6"
            goto L_0x036c
        L_0x041a:
            java.lang.String r10 = "515"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0424
            goto L_0x05cf
        L_0x0424:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "3"
            goto L_0x036c
        L_0x0442:
            java.lang.String r10 = "514"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x044c
            goto L_0x05cf
        L_0x044c:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "1"
            goto L_0x036c
        L_0x046a:
            java.lang.String r10 = "513"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0474
            goto L_0x05cf
        L_0x0474:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "2"
            goto L_0x036c
        L_0x0492:
            java.lang.String r10 = "511"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x049c
            goto L_0x05cf
        L_0x049c:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity> r11 = com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity.class
            r7.<init>(r10, r11)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "511"
            goto L_0x036c
        L_0x04bc:
            java.lang.String r10 = "504"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x04c6
            goto L_0x05cf
        L_0x04c6:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r2)
            java.lang.String r10 = r8.f13935f
            r7.putExtra(r0, r10)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "504"
            goto L_0x036c
        L_0x04e9:
            java.lang.String r10 = "502"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x04f3
            goto L_0x05cf
        L_0x04f3:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r2)
            java.lang.String r10 = r8.f13935f
            r7.putExtra(r0, r10)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "502"
            goto L_0x036c
        L_0x0516:
            java.lang.String r10 = "501"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0520
            goto L_0x05cf
        L_0x0520:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.class
            r7.<init>(r10, r11)
            java.lang.String r10 = r8.f13935f
            r7.putExtra(r0, r10)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "501"
            goto L_0x036c
        L_0x0545:
            java.lang.String r10 = "460"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x054f
            goto L_0x05cf
        L_0x054f:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x020b }
            android.content.Context r10 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel> r11 = com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel.class
            r7.<init>(r10, r11)     // Catch:{ Exception -> 0x020b }
            ld.f r10 = new ld.f     // Catch:{ Exception -> 0x020b }
            android.content.Context r11 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r10.<init>(r11)     // Catch:{ Exception -> 0x020b }
            android.widget.TextView r9 = r9.P()     // Catch:{ Exception -> 0x020b }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x020b }
            java.lang.String r11 = "460"
            r10.r(r9, r11)     // Catch:{ Exception -> 0x020b }
            android.content.Context r8 = r8.f13934e     // Catch:{ Exception -> 0x020b }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x020b }
            goto L_0x05f8
        L_0x0577:
            java.lang.String r10 = "204"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0580
            goto L_0x05cf
        L_0x0580:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r6)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "204"
            goto L_0x036c
        L_0x059e:
            java.lang.String r10 = "203"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x05a7
            goto L_0x05cf
        L_0x05a7:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails> r11 = com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails.class
            r7.<init>(r10, r11)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "203"
            goto L_0x036c
        L_0x05c7:
            java.lang.String r10 = "201"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x05da
        L_0x05cf:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13934e
            java.lang.Class<com.nic.mparivahan.Dashboard.EnabledServices.EsActivity> r10 = com.nic.mparivahan.Dashboard.EnabledServices.EsActivity.class
            r7.<init>(r9, r10)
            goto L_0x001d
        L_0x05da:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r10 = r8.f13934e
            r7.<init>(r10, r3)
            ld.f r10 = new ld.f
            android.content.Context r11 = r8.f13934e
            r10.<init>(r11)
            android.widget.TextView r9 = r9.P()
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "201"
            goto L_0x036c
        L_0x05f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.m.F(int, ma.m, ma.m$a, ld.c, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void G(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void H(Dialog dialog, m mVar, c cVar, View view) {
        l.f(dialog, "$d");
        l.f(mVar, "this$0");
        l.f(cVar, "$langSession");
        dialog.dismiss();
        Intent intent = new Intent(mVar.f13934e, ApplicationStatusActivity.class);
        f fVar = new f(mVar.f13934e);
        String b10 = cVar.b("label_view_form_1", "View Form 1-A");
        l.c(b10);
        fVar.r(b10, "1000");
        mVar.f13934e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, m mVar, c cVar, View view) {
        l.f(dialog, "$d");
        l.f(mVar, "this$0");
        l.f(cVar, "$langSession");
        dialog.dismiss();
        Intent intent = new Intent(mVar.f13934e, ApplicationStatusActivity.class);
        f fVar = new f(mVar.f13934e);
        String b10 = cVar.b("label_view_form_2", "View Form 2");
        l.c(b10);
        fVar.r(b10, "1002");
        mVar.f13934e.startActivity(intent);
    }

    /* renamed from: E */
    public void p(a aVar, int i10) {
        TextView P;
        String servName;
        l.f(aVar, "holder");
        c cVar = new c(this.f13934e);
        if (!l.a(this.f13936g, "T") || i10 != 3) {
            try {
                Object obj = this.f13933d.get(i10);
                l.e(obj, "get(...)");
                Enabledservice enabledservice = (Enabledservice) obj;
                if (l.a(enabledservice.getServCode(), "513")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_dupl_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "514")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_renewal_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "515")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_change_addr", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "516")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_replacement_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "523")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_extract_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "525")) {
                    P = aVar.P();
                    servName = cVar.b("check_dl_serv_intern_dl_perm", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "524")) {
                    P = aVar.P();
                    servName = cVar.b("hill_region_title", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "548")) {
                    P = aVar.P();
                    servName = cVar.b("change_birth_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "551")) {
                    P = aVar.P();
                    servName = cVar.b("new_cl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "559")) {
                    P = aVar.P();
                    servName = cVar.b("change_name_in_cl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "504")) {
                    P = aVar.P();
                    servName = cVar.b("coa_ll", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "203")) {
                    P = aVar.P();
                    servName = cVar.b("service_withdraw", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "201")) {
                    P = aVar.P();
                    servName = cVar.b("label_application_status", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "553")) {
                    P = aVar.P();
                    servName = cVar.b("coa_in_cl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "554")) {
                    P = aVar.P();
                    servName = cVar.b("duplicate_cl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "204")) {
                    P = aVar.P();
                    servName = cVar.b("label_dl_serv_update_mob", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "902")) {
                    P = aVar.P();
                    servName = cVar.b("btn_Download_Appointment_Slip", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "901")) {
                    P = aVar.P();
                    servName = cVar.b("btn_challan_print_receipt", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "903")) {
                    P = aVar.P();
                    servName = cVar.b("download_forms", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "502")) {
                    P = aVar.P();
                    servName = cVar.b("duplicate_ll", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "552")) {
                    P = aVar.P();
                    servName = cVar.b("renewal_of_cl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "511")) {
                    P = aVar.P();
                    servName = cVar.b("new_driving_licence", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "908")) {
                    P = aVar.P();
                    servName = cVar.b("view_docs", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "909")) {
                    P = aVar.P();
                    servName = cVar.b("add_class_of_vehicle", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "526")) {
                    P = aVar.P();
                    servName = cVar.b("change_name_dl", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "460")) {
                    P = aVar.P();
                    servName = cVar.b("app_cancel_service", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "907")) {
                    P = aVar.P();
                    servName = cVar.b("edit_app_in_ll", enabledservice.getServName());
                } else if (l.a(enabledservice.getServCode(), "574")) {
                    P = aVar.P();
                    servName = cVar.b("change_name_in_ll", enabledservice.getServName());
                } else {
                    P = aVar.P();
                    servName = enabledservice.getServName();
                }
                P.setText(servName);
                K(enabledservice.getServCode(), aVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            aVar.P().setText(cVar.b("label_view_more", "View More"));
            aVar.O().setImageDrawable(this.f13934e.getResources().getDrawable(R.drawable.ic_view));
        }
        aVar.Q().setOnClickListener(new i(i10, this, aVar, cVar));
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r4 = r4.getDrawable(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        r3.setImageDrawable(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r3 = r4.O();
        r4 = r2.f13934e.getResources().getDrawable(com.nic.mparivahan.R.drawable.mvvm_ic_addres);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.String r3, ma.m.a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "servCode"
            cm.l.f(r3, r0)
            java.lang.String r0 = "holder"
            cm.l.f(r4, r0)
            int r0 = r3.hashCode()
            r1 = 2131231306(0x7f08024a, float:1.807869E38)
            switch(r0) {
                case 49587: goto L_0x00d0;
                case 49588: goto L_0x00b8;
                case 49590: goto L_0x00a0;
                case 52503: goto L_0x0089;
                case 52504: goto L_0x0071;
                case 52505: goto L_0x0067;
                case 52506: goto L_0x004f;
                case 52534: goto L_0x0036;
                case 52536: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x00e8
        L_0x0016:
            java.lang.String r0 = "525"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0020
            goto L_0x00e8
        L_0x0020:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131231301(0x7f080245, float:1.807868E38)
        L_0x002d:
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r0)
        L_0x0031:
            r3.setImageDrawable(r4)
            goto L_0x00e8
        L_0x0036:
            java.lang.String r0 = "523"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0040
            goto L_0x00e8
        L_0x0040:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            goto L_0x0031
        L_0x004f:
            java.lang.String r0 = "516"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0059
            goto L_0x00e8
        L_0x0059:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131231139(0x7f0801a3, float:1.807835E38)
            goto L_0x002d
        L_0x0067:
            java.lang.String r0 = "515"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0040
            goto L_0x00e8
        L_0x0071:
            java.lang.String r0 = "514"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x007b
            goto L_0x00e8
        L_0x007b:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131231152(0x7f0801b0, float:1.8078377E38)
            goto L_0x002d
        L_0x0089:
            java.lang.String r0 = "513"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0092
            goto L_0x00e8
        L_0x0092:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131231172(0x7f0801c4, float:1.8078418E38)
            goto L_0x002d
        L_0x00a0:
            java.lang.String r0 = "204"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00a9
            goto L_0x00e8
        L_0x00a9:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131231494(0x7f080306, float:1.807907E38)
            goto L_0x002d
        L_0x00b8:
            java.lang.String r0 = "202"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00c1
            goto L_0x00e8
        L_0x00c1:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131230999(0x7f080117, float:1.8078067E38)
            goto L_0x002d
        L_0x00d0:
            java.lang.String r0 = "201"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x00d9
            goto L_0x00e8
        L_0x00d9:
            android.widget.ImageView r3 = r4.O()
            android.content.Context r4 = r2.f13934e
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131230925(0x7f0800cd, float:1.8077917E38)
            goto L_0x002d
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.m.K(java.lang.String, ma.m$a):void");
    }

    public int e() {
        if (this.f13933d.size() >= 3) {
            this.f13936g = "T";
            return 4;
        }
        this.f13936g = "F";
        return this.f13933d.size();
    }
}
