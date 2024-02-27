package og;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX;
import java.util.ArrayList;

public final class w extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f30085d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30086e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f30087f;

    public interface a {
        void a(int i10);

        void d(int i10, String str, String str2);

        void e(int i10, String str, String str2, Bitmap bitmap);

        void g(int i10);

        void h(int i10, String str, String str2);
    }

    public static final class b extends RecyclerView.d0 {
        private final LinearLayout A;
        private final LinearLayout B;
        private final Spinner C;
        private final LinearLayout D;
        private final LinearLayout E;
        private final LinearLayout F;
        private final LinearLayout G;
        private final TextView H;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f30088y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f30089z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "view");
            this.f30088y = (TextView) view.findViewById(R.id.title);
            this.f30089z = (ImageView) view.findViewById(R.id.delet_proff);
            this.A = (LinearLayout) view.findViewById(R.id.browser_button);
            this.B = (LinearLayout) view.findViewById(R.id.camera);
            this.C = (Spinner) view.findViewById(R.id.proff_spinner);
            this.D = (LinearLayout) view.findViewById(R.id.menu_layout);
            this.E = (LinearLayout) view.findViewById(R.id.upload_image);
            this.F = (LinearLayout) view.findViewById(R.id.upload_doc_img);
            this.G = (LinearLayout) view.findViewById(R.id.update);
            this.H = (TextView) view.findViewById(R.id.mandatory_icon);
        }

        public final LinearLayout O() {
            return this.A;
        }

        public final LinearLayout P() {
            return this.B;
        }

        public final ImageView Q() {
            return this.f30089z;
        }

        public final TextView R() {
            return this.H;
        }

        public final LinearLayout S() {
            return this.D;
        }

        public final Spinner T() {
            return this.C;
        }

        public final TextView U() {
            return this.f30088y;
        }

        public final LinearLayout V() {
            return this.G;
        }

        public final LinearLayout W() {
            return this.F;
        }

        public final LinearLayout X() {
            return this.E;
        }
    }

    public w(Context context, a aVar, ArrayList arrayList) {
        l.f(context, "context");
        l.f(aVar, "itemListener");
        this.f30085d = context;
        this.f30086e = aVar;
        this.f30087f = arrayList;
    }

    /* access modifiers changed from: private */
    public static final void I(w wVar, int i10, u uVar, View view) {
        l.f(wVar, "this$0");
        l.f(uVar, "$testval");
        wVar.f30086e.d(i10, ((SubcategoryMasterDataX) uVar.f20234e).getCat_id(), ((SubcategoryMasterDataX) uVar.f20234e).getSub_cat_id());
    }

    /* access modifiers changed from: private */
    public static final void J(w wVar, int i10, u uVar, View view) {
        l.f(wVar, "this$0");
        l.f(uVar, "$testval");
        wVar.f30086e.h(i10, ((SubcategoryMasterDataX) uVar.f20234e).getCat_id(), ((SubcategoryMasterDataX) uVar.f20234e).getSub_cat_id());
    }

    /* access modifiers changed from: private */
    public static final void K(w wVar, int i10, View view) {
        l.f(wVar, "this$0");
        wVar.f30086e.a(i10);
    }

    /* access modifiers changed from: private */
    public static final void L(w wVar, int i10, View view) {
        l.f(wVar, "this$0");
        wVar.f30086e.g(i10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void M(og.w r1, int r2, android.view.View r3) {
        /*
            java.lang.String r3 = "this$0"
            cm.l.f(r1, r3)
            java.util.ArrayList r3 = r1.f30087f
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r3.get(r2)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            if (r3 == 0) goto L_0x003a
            java.lang.Boolean r3 = r3.isAttached()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r3 = cm.l.a(r3, r0)
            if (r3 == 0) goto L_0x003a
            android.content.Context r3 = r1.f30085d     // Catch:{ Exception -> 0x0030 }
            java.util.ArrayList r0 = r1.f30087f     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0030 }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r2     // Catch:{ Exception -> 0x0030 }
            if (r2 == 0) goto L_0x0032
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r1 = move-exception
            goto L_0x0037
        L_0x0032:
            r2 = 0
        L_0x0033:
            r1.P(r3, r2)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003a
        L_0x0037:
            r1.printStackTrace()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.w.M(og.w, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(og.w r1, int r2, cm.u r3, android.view.View r4) {
        /*
            java.lang.String r4 = "this$0"
            cm.l.f(r1, r4)
            java.lang.String r4 = "$testval"
            cm.l.f(r3, r4)
            og.w$a r4 = r1.f30086e
            java.lang.Object r0 = r3.f20234e
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r0
            java.lang.String r0 = r0.getSub_cat_id()
            java.lang.Object r3 = r3.f20234e
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r3
            java.lang.String r3 = r3.getCat_id()
            java.util.ArrayList r1 = r1.f30087f
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r1.get(r2)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
            if (r1 == 0) goto L_0x002d
            android.graphics.Bitmap r1 = r1.getBitmap()
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            r4.e(r2, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.w.N(og.w, int, cm.u, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void Q(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1.get(r9);
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(og.w.b r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "calling3 "
            r0.append(r1)
            r0.append(r9)
            java.util.ArrayList r1 = r7.f30087f
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r1.get(r9)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
            if (r1 == 0) goto L_0x0024
            java.lang.Boolean r1 = r1.isAttached()
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "calling1"
            android.util.Log.e(r1, r0)
            java.util.ArrayList r0 = r7.f30087f
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r0.get(r9)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.getCatName()
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.ArrayList r1 = r7.f30087f
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r1.get(r9)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r1.getMandatory()
            if (r1 == 0) goto L_0x0074
            java.lang.String r5 = "Y"
            r6 = 1
            boolean r1 = km.p.o(r1, r5, r6)
            if (r1 != r6) goto L_0x0074
            android.widget.TextView r1 = r8.U()
            r1.setText(r0)
            android.widget.TextView r0 = r8.R()
            r0.setVisibility(r3)
            goto L_0x0082
        L_0x0074:
            android.widget.TextView r1 = r8.U()
            r1.setText(r0)
            android.widget.TextView r0 = r8.R()
            r0.setVisibility(r4)
        L_0x0082:
            java.util.ArrayList r0 = r7.f30087f
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r0.get(r9)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            if (r0 == 0) goto L_0x0092
            java.util.List r2 = r0.getSubcategoryMasterDataList()
        L_0x0092:
            le.l r0 = new le.l
            android.content.Context r1 = r7.f30085d
            r0.<init>(r1, r2)
            android.widget.Spinner r1 = r8.T()
            r1.setAdapter(r0)
            cm.u r0 = new cm.u
            r0.<init>()
            android.widget.Spinner r1 = r8.T()
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX"
            cm.l.d(r1, r2)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r1
            r0.f20234e = r1
            java.lang.String r2 = "test"
            java.lang.String r1 = r1.getSub_cat_id()
            android.util.Log.e(r2, r1)
            java.util.ArrayList r1 = r7.f30087f
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r1.get(r9)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
            if (r1 == 0) goto L_0x00f4
            java.lang.Boolean r1 = r1.isAttached()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = cm.l.a(r1, r2)
            if (r1 == 0) goto L_0x00f4
            android.widget.LinearLayout r1 = r8.S()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r8.W()
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r8.X()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r8.V()
            r1.setVisibility(r3)
            goto L_0x0110
        L_0x00f4:
            android.widget.LinearLayout r1 = r8.S()
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r8.W()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r8.X()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r8.V()
            r1.setVisibility(r4)
        L_0x0110:
            android.widget.LinearLayout r1 = r8.O()
            og.p r2 = new og.p
            r2.<init>(r7, r9, r0)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r8.P()
            og.q r2 = new og.q
            r2.<init>(r7, r9, r0)
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r8.Q()
            og.r r2 = new og.r
            r2.<init>(r7, r9)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r8.V()
            og.s r2 = new og.s
            r2.<init>(r7, r9)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r8.W()
            og.t r2 = new og.t
            r2.<init>(r7, r9)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r8 = r8.X()
            og.u r1 = new og.u
            r1.<init>(r7, r9, r0)
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.w.p(og.w$b, int):void");
    }

    /* renamed from: O */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vahan_non_upload_reupload, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public final void P(Context context, Bitmap bitmap) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.show_dms_doc);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.images_upload);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById2).setImageBitmap(bitmap);
        ((TextView) findViewById).setOnClickListener(new v(dialog));
        dialog.show();
    }

    public int e() {
        ArrayList arrayList = this.f30087f;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }
}
