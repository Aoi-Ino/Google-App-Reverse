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

public final class r extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13950d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13951e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13952f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13953y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13954z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13953y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13954z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13953y;
        }

        public final LinearLayout Q() {
            return this.f13954z;
        }
    }

    public r(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "state_code");
        this.f13950d = arrayList;
        this.f13951e = context;
        this.f13952f = str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c8, code lost:
        r11.r(r10.P().getText().toString(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004e, code lost:
        r9.r(r10.P().getText().toString(), "910");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        r8.f13951e.startActivity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x037a, code lost:
        r9.r(r10, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void F(com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice r7, ma.r r8, ld.c r9, ma.r.a r10, android.view.View r11) {
        /*
            java.lang.String r11 = "$mModel"
            cm.l.f(r7, r11)
            java.lang.String r11 = "this$0"
            cm.l.f(r8, r11)
            java.lang.String r11 = "$langSession"
            cm.l.f(r9, r11)
            java.lang.String r11 = "$holder"
            cm.l.f(r10, r11)
            java.lang.String r7 = r7.getServCode()
            int r11 = r7.hashCode()
            java.lang.String r0 = "4"
            java.lang.Class<com.nic.mparivahan.LLMainScreen.LLMain> r1 = com.nic.mparivahan.LLMainScreen.LLMain.class
            java.lang.Class<com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity> r2 = com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity.class
            java.lang.String r3 = "910"
            java.lang.Class<com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen> r4 = com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen.class
            java.lang.String r5 = "state_code"
            java.lang.Class<com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen> r6 = com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen.class
            switch(r11) {
                case 49587: goto L_0x05d5;
                case 49589: goto L_0x05ac;
                case 49590: goto L_0x0585;
                case 51694: goto L_0x0553;
                case 52470: goto L_0x0524;
                case 52471: goto L_0x04f7;
                case 52473: goto L_0x04ca;
                case 52501: goto L_0x04a0;
                case 52503: goto L_0x0478;
                case 52504: goto L_0x0450;
                case 52505: goto L_0x0428;
                case 52506: goto L_0x0400;
                case 52534: goto L_0x03d8;
                case 52535: goto L_0x03a8;
                case 52536: goto L_0x037f;
                case 52537: goto L_0x0354;
                case 52601: goto L_0x0324;
                case 52625: goto L_0x02f4;
                case 52626: goto L_0x02c6;
                case 52627: goto L_0x0298;
                case 52628: goto L_0x026a;
                case 52633: goto L_0x023c;
                case 52690: goto L_0x021d;
                case 56314: goto L_0x01e9;
                case 56315: goto L_0x01cf;
                case 56316: goto L_0x0113;
                case 56320: goto L_0x00f8;
                case 56321: goto L_0x00d8;
                case 56322: goto L_0x00a9;
                case 56344: goto L_0x008b;
                case 56468: goto L_0x0064;
                case 56499: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x05fc
        L_0x002f:
            java.lang.String r9 = "960"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0039
            goto L_0x05fc
        L_0x0039:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity.class
            r7.<init>(r9, r11)
            java.lang.String r9 = r8.f13952f
            r7.putExtra(r5, r9)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
        L_0x004e:
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            r9.r(r10, r3)
        L_0x005d:
            android.content.Context r8 = r8.f13951e
            r8.startActivity(r7)
            goto L_0x05fc
        L_0x0064:
            java.lang.String r10 = "950"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x006e
            goto L_0x05fc
        L_0x006e:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            r7.<init>(r11, r6)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
            java.lang.String r0 = "dl_services"
            java.lang.String r1 = "DL Services"
            java.lang.String r9 = r9.b(r0, r1)
            cm.l.c(r9)
            r11.r(r9, r10)
            goto L_0x005d
        L_0x008b:
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0093
            goto L_0x05fc
        L_0x0093:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenseTestActivity.class
            r7.<init>(r9, r11)
            java.lang.String r9 = r8.f13952f
            r7.putExtra(r5, r9)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            goto L_0x004e
        L_0x00a9:
            java.lang.String r9 = "909"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x00b3
            goto L_0x05fc
        L_0x00b3:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.AddCov.View.CovApplication> r0 = com.nic.mparivahan.AddCov.View.CovApplication.class
            r7.<init>(r11, r0)
            java.lang.String r11 = r8.f13952f
            r7.putExtra(r5, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
        L_0x00c8:
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            r11.r(r10, r9)
            goto L_0x005d
        L_0x00d8:
            java.lang.String r9 = "908"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x00e2
            goto L_0x05fc
        L_0x00e2:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen> r0 = com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen.class
            r7.<init>(r11, r0)
            java.lang.String r11 = r8.f13952f
            r7.putExtra(r5, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
            goto L_0x00c8
        L_0x00f8:
            java.lang.String r9 = "907"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0102
            goto L_0x05fc
        L_0x0102:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen> r0 = com.nic.mparivahan.LLServices.editlearnerlicence.Activity.EditLearnerAppScreen.class
            r7.<init>(r11, r0)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
            goto L_0x00c8
        L_0x0113:
            java.lang.String r10 = "903"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x011d
            goto L_0x05fc
        L_0x011d:
            android.app.Dialog r7 = new android.app.Dialog
            android.content.Context r10 = r8.f13951e
            r7.<init>(r10)
            r10 = 2131558765(0x7f0d016d, float:1.8742855E38)
            r7.setContentView(r10)
            android.view.Window r10 = r7.getWindow()
            cm.l.c(r10)
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r11.<init>(r1)
            r10.setBackgroundDrawable(r11)
            r10 = 2131362213(0x7f0a01a5, float:1.83442E38)
            android.view.View r10 = r7.findViewById(r10)
            java.lang.String r11 = "null cannot be cast to non-null type android.widget.ImageView"
            cm.l.d(r10, r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r11 = 2131363089(0x7f0a0511, float:1.8345977E38)
            android.view.View r11 = r7.findViewById(r11)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r11, r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 2131363093(0x7f0a0515, float:1.8345985E38)
            android.view.View r2 = r7.findViewById(r2)
            cm.l.d(r2, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131365224(0x7f0a0d68, float:1.8350307E38)
            android.view.View r3 = r7.findViewById(r3)
            cm.l.d(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r1 = "nex_parivahan"
            java.lang.String r4 = "NextGen mParivahan"
            java.lang.String r1 = r9.b(r1, r4)
            r3.setText(r1)
            java.lang.String r1 = "label_view_form_1"
            java.lang.String r3 = "View Form 1-A"
            java.lang.String r1 = r9.b(r1, r3)
            r11.setText(r1)
            java.lang.String r1 = "label_view_form_2"
            java.lang.String r3 = "View Form 2"
            java.lang.String r4 = r9.b(r1, r3)
            r2.setText(r4)
            ld.f r4 = new ld.f
            android.content.Context r5 = r8.f13951e
            r4.<init>(r5)
            java.lang.String r4 = r4.b()
            r5 = 1
            boolean r0 = km.p.o(r4, r0, r5)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "label_form_4"
            java.lang.String r1 = "View Form 4-A"
            java.lang.String r0 = r9.b(r0, r1)
        L_0x01a9:
            r2.setText(r0)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r0 = r9.b(r1, r3)
            goto L_0x01a9
        L_0x01b2:
            ma.o r0 = new ma.o
            r0.<init>(r7)
            r10.setOnClickListener(r0)
            ma.p r10 = new ma.p
            r10.<init>(r7, r8, r9)
            r11.setOnClickListener(r10)
            ma.q r10 = new ma.q
            r10.<init>(r7, r8, r9)
            r2.setOnClickListener(r10)
            r7.show()
            goto L_0x05fc
        L_0x01cf:
            java.lang.String r9 = "902"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x01d9
            goto L_0x05fc
        L_0x01d9:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            r7.<init>(r11, r2)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
            goto L_0x00c8
        L_0x01e9:
            java.lang.String r9 = "901"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x01f3
            goto L_0x05fc
        L_0x01f3:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r11, r2)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x0217:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x05fc
        L_0x021d:
            java.lang.String r9 = "574"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0227
            goto L_0x05fc
        L_0x0227:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r11 = r8.f13951e
            r7.<init>(r11, r1)
            java.lang.String r11 = r8.f13952f
            r7.putExtra(r5, r11)
            ld.f r11 = new ld.f
            android.content.Context r0 = r8.f13951e
            r11.<init>(r0)
            goto L_0x00c8
        L_0x023c:
            java.lang.String r9 = "559"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0246
            goto L_0x05fc
        L_0x0246:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r11, r4)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x026a:
            java.lang.String r9 = "554"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0274
            goto L_0x05fc
        L_0x0274:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r11, r4)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x0298:
            java.lang.String r9 = "553"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x02a2
            goto L_0x05fc
        L_0x02a2:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r11, r4)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x02c6:
            java.lang.String r9 = "552"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x02d0
            goto L_0x05fc
        L_0x02d0:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r11, r4)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x02f4:
            java.lang.String r9 = "551"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x02fe
            goto L_0x05fc
        L_0x02fe:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.NewCl.NewClOne> r0 = com.nic.mparivahan.ClServices.View.NewCl.NewClOne.class
            r7.<init>(r11, r0)     // Catch:{ Exception -> 0x0217 }
            ld.f r11 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r0 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            r11.r(r10, r9)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x0324:
            java.lang.String r9 = "548"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x032e
            goto L_0x05fc
        L_0x032e:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r9 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r9, r6)     // Catch:{ Exception -> 0x0217 }
            ld.f r9 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r9.<init>(r11)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r11 = "548"
            r9.r(r10, r11)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x0354:
            java.lang.String r9 = "526"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x035e
            goto L_0x05fc
        L_0x035e:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "526"
        L_0x037a:
            r9.r(r10, r11)
            goto L_0x005d
        L_0x037f:
            java.lang.String r9 = "525"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0389
            goto L_0x05fc
        L_0x0389:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            r9.r(r10, r0)
            goto L_0x005d
        L_0x03a8:
            java.lang.String r9 = "524"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x03b2
            goto L_0x05fc
        L_0x03b2:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r9 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r7.<init>(r9, r6)     // Catch:{ Exception -> 0x0217 }
            ld.f r9 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r9.<init>(r11)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r11 = "524"
            r9.r(r10, r11)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x03d8:
            java.lang.String r9 = "523"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x03e2
            goto L_0x05fc
        L_0x03e2:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "5"
            goto L_0x037a
        L_0x0400:
            java.lang.String r9 = "516"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x040a
            goto L_0x05fc
        L_0x040a:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "6"
            goto L_0x037a
        L_0x0428:
            java.lang.String r9 = "515"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0432
            goto L_0x05fc
        L_0x0432:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "3"
            goto L_0x037a
        L_0x0450:
            java.lang.String r9 = "514"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x045a
            goto L_0x05fc
        L_0x045a:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "1"
            goto L_0x037a
        L_0x0478:
            java.lang.String r9 = "513"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0482
            goto L_0x05fc
        L_0x0482:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "2"
            goto L_0x037a
        L_0x04a0:
            java.lang.String r9 = "511"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x04aa
            goto L_0x05fc
        L_0x04aa:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity> r11 = com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity.class
            r7.<init>(r9, r11)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "511"
            goto L_0x037a
        L_0x04ca:
            java.lang.String r9 = "504"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x04d4
            goto L_0x05fc
        L_0x04d4:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r1)
            java.lang.String r9 = r8.f13952f
            r7.putExtra(r5, r9)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "504"
            goto L_0x037a
        L_0x04f7:
            java.lang.String r9 = "502"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0501
            goto L_0x05fc
        L_0x0501:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r1)
            java.lang.String r9 = r8.f13952f
            r7.putExtra(r5, r9)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "502"
            goto L_0x037a
        L_0x0524:
            java.lang.String r9 = "501"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x052e
            goto L_0x05fc
        L_0x052e:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen> r11 = com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.class
            r7.<init>(r9, r11)
            java.lang.String r9 = r8.f13952f
            r7.putExtra(r5, r9)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "501"
            goto L_0x037a
        L_0x0553:
            java.lang.String r9 = "460"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x055d
            goto L_0x05fc
        L_0x055d:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0217 }
            android.content.Context r9 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel> r11 = com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel.class
            r7.<init>(r9, r11)     // Catch:{ Exception -> 0x0217 }
            ld.f r9 = new ld.f     // Catch:{ Exception -> 0x0217 }
            android.content.Context r11 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r9.<init>(r11)     // Catch:{ Exception -> 0x0217 }
            android.widget.TextView r10 = r10.P()     // Catch:{ Exception -> 0x0217 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r11 = "460"
            r9.r(r10, r11)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r8 = r8.f13951e     // Catch:{ Exception -> 0x0217 }
            r8.startActivity(r7)     // Catch:{ Exception -> 0x0217 }
            goto L_0x05fc
        L_0x0585:
            java.lang.String r9 = "204"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x058e
            goto L_0x05fc
        L_0x058e:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r6)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "204"
            goto L_0x037a
        L_0x05ac:
            java.lang.String r9 = "203"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x05b5
            goto L_0x05fc
        L_0x05b5:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            java.lang.Class<com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails> r11 = com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails.class
            r7.<init>(r9, r11)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "203"
            goto L_0x037a
        L_0x05d5:
            java.lang.String r9 = "201"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x05de
            goto L_0x05fc
        L_0x05de:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r9 = r8.f13951e
            r7.<init>(r9, r2)
            ld.f r9 = new ld.f
            android.content.Context r11 = r8.f13951e
            r9.<init>(r11)
            android.widget.TextView r10 = r10.P()
            java.lang.CharSequence r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "201"
            goto L_0x037a
        L_0x05fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.r.F(com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice, ma.r, ld.c, ma.r$a, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void G(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void H(Dialog dialog, r rVar, c cVar, View view) {
        l.f(dialog, "$d");
        l.f(rVar, "this$0");
        l.f(cVar, "$langSession");
        dialog.dismiss();
        Intent intent = new Intent(rVar.f13951e, ApplicationStatusActivity.class);
        f fVar = new f(rVar.f13951e);
        String b10 = cVar.b("label_view_form_1", "View Form 1-A");
        l.c(b10);
        fVar.r(b10, "1000");
        rVar.f13951e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, r rVar, c cVar, View view) {
        l.f(dialog, "$d");
        l.f(rVar, "this$0");
        l.f(cVar, "$langSession");
        dialog.dismiss();
        Intent intent = new Intent(rVar.f13951e, ApplicationStatusActivity.class);
        f fVar = new f(rVar.f13951e);
        String b10 = cVar.b("label_view_form_2", "View Form 2");
        l.c(b10);
        fVar.r(b10, "1002");
        rVar.f13951e.startActivity(intent);
    }

    /* renamed from: E */
    public void p(a aVar, int i10) {
        TextView P;
        String servName;
        String str;
        l.f(aVar, "holder");
        c cVar = new c(this.f13951e);
        Object obj = this.f13950d.get(i10);
        l.e(obj, "get(...)");
        Enabledservice enabledservice = (Enabledservice) obj;
        if (l.a(enabledservice.getServCode(), "513")) {
            P = aVar.P();
            str = "check_dl_serv_dupl_dl";
        } else if (l.a(enabledservice.getServCode(), "514")) {
            P = aVar.P();
            str = "check_dl_serv_renewal_dl";
        } else if (l.a(enabledservice.getServCode(), "515")) {
            P = aVar.P();
            str = "check_dl_serv_change_addr";
        } else if (l.a(enabledservice.getServCode(), "516")) {
            P = aVar.P();
            str = "check_dl_serv_replacement_dl";
        } else if (l.a(enabledservice.getServCode(), "523")) {
            P = aVar.P();
            str = "check_dl_serv_extract_dl";
        } else if (l.a(enabledservice.getServCode(), "525")) {
            P = aVar.P();
            str = "check_dl_serv_intern_dl_perm";
        } else if (l.a(enabledservice.getServCode(), "524")) {
            P = aVar.P();
            str = "hill_region_title";
        } else if (l.a(enabledservice.getServCode(), "548")) {
            P = aVar.P();
            str = "change_birth_dl";
        } else if (l.a(enabledservice.getServCode(), "551")) {
            P = aVar.P();
            str = "new_cl";
        } else if (l.a(enabledservice.getServCode(), "559")) {
            P = aVar.P();
            str = "change_name_in_cl";
        } else if (l.a(enabledservice.getServCode(), "504")) {
            P = aVar.P();
            str = "coa_ll";
        } else if (l.a(enabledservice.getServCode(), "203")) {
            P = aVar.P();
            str = "service_withdraw";
        } else if (l.a(enabledservice.getServCode(), "201")) {
            P = aVar.P();
            str = "label_application_status";
        } else if (l.a(enabledservice.getServCode(), "553")) {
            P = aVar.P();
            str = "coa_in_cl";
        } else if (l.a(enabledservice.getServCode(), "554")) {
            P = aVar.P();
            str = "duplicate_cl";
        } else if (l.a(enabledservice.getServCode(), "204")) {
            P = aVar.P();
            str = "label_dl_serv_update_mob";
        } else if (l.a(enabledservice.getServCode(), "902")) {
            P = aVar.P();
            str = "btn_Download_Appointment_Slip";
        } else if (l.a(enabledservice.getServCode(), "901")) {
            P = aVar.P();
            str = "btn_challan_print_receipt";
        } else if (l.a(enabledservice.getServCode(), "903")) {
            P = aVar.P();
            str = "download_forms";
        } else if (l.a(enabledservice.getServCode(), "502")) {
            P = aVar.P();
            str = "duplicate_ll";
        } else if (l.a(enabledservice.getServCode(), "552")) {
            P = aVar.P();
            str = "renewal_of_cl";
        } else if (l.a(enabledservice.getServCode(), "511")) {
            P = aVar.P();
            str = "new_driving_licence";
        } else if (l.a(enabledservice.getServCode(), "908")) {
            P = aVar.P();
            str = "view_docs";
        } else if (l.a(enabledservice.getServCode(), "909")) {
            P = aVar.P();
            str = "add_class_of_vehicle";
        } else if (l.a(enabledservice.getServCode(), "526")) {
            P = aVar.P();
            str = "change_name_dl";
        } else if (l.a(enabledservice.getServCode(), "460")) {
            P = aVar.P();
            str = "app_cancel_service";
        } else if (l.a(enabledservice.getServCode(), "907")) {
            P = aVar.P();
            str = "edit_app_in_ll";
        } else if (l.a(enabledservice.getServCode(), "574")) {
            P = aVar.P();
            str = "change_name_in_ll";
        } else {
            P = aVar.P();
            servName = enabledservice.getServName();
            P.setText(servName);
            K(enabledservice.getServCode(), aVar);
            aVar.Q().setOnClickListener(new n(enabledservice, this, cVar, aVar));
        }
        servName = cVar.b(str, enabledservice.getServName());
        P.setText(servName);
        K(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new n(enabledservice, this, cVar, aVar));
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0091, code lost:
        if (r7.equals("574") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        r7 = r8.O();
        r8 = r6.f13951e.getResources().getDrawable(com.nic.mparivahan.R.drawable.coname);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        if (r7.equals("559") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b4, code lost:
        if (r7.equals("553") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        r7 = r8.O();
        r8 = r6.f13951e.getResources().getDrawable(com.nic.mparivahan.R.drawable.cao_new);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0100, code lost:
        if (r7.equals("526") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013c, code lost:
        if (r7.equals("523") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r7.equals("905") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0140, code lost:
        r7 = r8.O();
        r8 = r6.f13951e.getResources().getDrawable(com.nic.mparivahan.R.drawable.mvvm_ic_addres);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016f, code lost:
        if (r7.equals("515") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0178, code lost:
        r7 = r8.O();
        r8 = r6.f13951e.getResources().getDrawable(com.nic.mparivahan.R.drawable.ic_learnerr);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        r7 = r8.O();
        r8 = r6.f13951e.getResources().getDrawable(com.nic.mparivahan.R.drawable.check_list);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a6, code lost:
        if (r7.equals("504") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c7, code lost:
        if (r7.equals("201") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        r7.setImageDrawable(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        r8 = r8.getDrawable(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.String r7, ma.r.a r8) {
        /*
            r6 = this;
            java.lang.String r0 = "servCode"
            cm.l.f(r7, r0)
            java.lang.String r0 = "holder"
            cm.l.f(r8, r0)
            int r0 = r7.hashCode()
            r1 = 2131231152(0x7f0801b0, float:1.8078377E38)
            r2 = 2131231306(0x7f08024a, float:1.807869E38)
            r3 = 2131230914(0x7f0800c2, float:1.8077894E38)
            r4 = 2131230925(0x7f0800cd, float:1.8077917E38)
            r5 = 2131230965(0x7f0800f5, float:1.8077998E38)
            switch(r0) {
                case 49587: goto L_0x01c1;
                case 49590: goto L_0x01a9;
                case 52473: goto L_0x01a0;
                case 52503: goto L_0x0188;
                case 52504: goto L_0x0172;
                case 52505: goto L_0x0169;
                case 52506: goto L_0x0150;
                case 52534: goto L_0x0136;
                case 52535: goto L_0x011d;
                case 52536: goto L_0x0104;
                case 52537: goto L_0x00fa;
                case 52601: goto L_0x00e1;
                case 52625: goto L_0x00c8;
                case 52627: goto L_0x00ae;
                case 52633: goto L_0x00a4;
                case 52690: goto L_0x008b;
                case 53430: goto L_0x0073;
                case 56314: goto L_0x005b;
                case 56315: goto L_0x003f;
                case 56318: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x01c9
        L_0x0022:
            java.lang.String r0 = "905"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002c
            goto L_0x01c9
        L_0x002c:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r4)
        L_0x003a:
            r7.setImageDrawable(r8)
            goto L_0x01ca
        L_0x003f:
            java.lang.String r0 = "902"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0049
            goto L_0x01c9
        L_0x0049:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131230845(0x7f08007d, float:1.8077754E38)
        L_0x0056:
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r0)
            goto L_0x003a
        L_0x005b:
            java.lang.String r0 = "901"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0065
            goto L_0x01c9
        L_0x0065:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231400(0x7f0802a8, float:1.807888E38)
            goto L_0x0056
        L_0x0073:
            java.lang.String r0 = "600"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x007d
            goto L_0x01c9
        L_0x007d:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131230999(0x7f080117, float:1.8078067E38)
            goto L_0x0056
        L_0x008b:
            java.lang.String r0 = "574"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0095
            goto L_0x01c9
        L_0x0095:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r5)
            goto L_0x003a
        L_0x00a4:
            java.lang.String r0 = "559"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0095
            goto L_0x01c9
        L_0x00ae:
            java.lang.String r0 = "553"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b8
            goto L_0x01c9
        L_0x00b8:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r3)
            goto L_0x003a
        L_0x00c8:
            java.lang.String r0 = "551"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00d2
            goto L_0x01c9
        L_0x00d2:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231341(0x7f08026d, float:1.807876E38)
            goto L_0x0056
        L_0x00e1:
            java.lang.String r0 = "548"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00eb
            goto L_0x01c9
        L_0x00eb:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131230945(0x7f0800e1, float:1.8077957E38)
            goto L_0x0056
        L_0x00fa:
            java.lang.String r0 = "526"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0095
            goto L_0x01c9
        L_0x0104:
            java.lang.String r0 = "525"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x010e
            goto L_0x01c9
        L_0x010e:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x0056
        L_0x011d:
            java.lang.String r0 = "524"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0127
            goto L_0x01c9
        L_0x0127:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231065(0x7f080159, float:1.80782E38)
            goto L_0x0056
        L_0x0136:
            java.lang.String r0 = "523"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0140
            goto L_0x01c9
        L_0x0140:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r2)
            goto L_0x003a
        L_0x0150:
            java.lang.String r0 = "516"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x015a
            goto L_0x01c9
        L_0x015a:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231139(0x7f0801a3, float:1.807835E38)
            goto L_0x0056
        L_0x0169:
            java.lang.String r0 = "515"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0140
            goto L_0x01c9
        L_0x0172:
            java.lang.String r0 = "514"
            boolean r7 = r7.equals(r0)
        L_0x0178:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r1)
            goto L_0x003a
        L_0x0188:
            java.lang.String r0 = "513"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0191
            goto L_0x01c9
        L_0x0191:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231172(0x7f0801c4, float:1.8078418E38)
            goto L_0x0056
        L_0x01a0:
            java.lang.String r0 = "504"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b8
            goto L_0x01c9
        L_0x01a9:
            java.lang.String r0 = "204"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x01b2
            goto L_0x01c9
        L_0x01b2:
            android.widget.ImageView r7 = r8.O()
            android.content.Context r8 = r6.f13951e
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131231494(0x7f080306, float:1.807907E38)
            goto L_0x0056
        L_0x01c1:
            java.lang.String r0 = "201"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002c
        L_0x01c9:
            goto L_0x0178
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.r.K(java.lang.String, ma.r$a):void");
    }

    public int e() {
        return this.f13950d.size();
    }
}
