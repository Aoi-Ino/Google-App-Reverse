package le;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import java.util.Calendar;
import java.util.List;

public final class k extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f24813d;

    /* renamed from: e  reason: collision with root package name */
    private final VahanDmsReupload f24814e;

    /* renamed from: f  reason: collision with root package name */
    private final List f24815f;

    /* renamed from: g  reason: collision with root package name */
    private Calendar f24816g = Calendar.getInstance();

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;
        private final LinearLayout B;
        private final LinearLayout C;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f24817y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f24818z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "view");
            this.f24817y = (TextView) view.findViewById(R.id.title);
            this.f24818z = (TextView) view.findViewById(R.id.proff_spinner);
            this.A = (ImageView) view.findViewById(R.id.upload_doc_img);
            this.B = (LinearLayout) view.findViewById(R.id.view);
            this.C = (LinearLayout) view.findViewById(R.id.update);
        }

        public final TextView O() {
            return this.f24818z;
        }

        public final TextView P() {
            return this.f24817y;
        }

        public final LinearLayout Q() {
            return this.C;
        }

        public final ImageView R() {
            return this.A;
        }

        public final LinearLayout S() {
            return this.B;
        }
    }

    public k(Context context, VahanDmsReupload vahanDmsReupload, List list) {
        l.f(context, "context");
        l.f(vahanDmsReupload, "itemListener");
        this.f24813d = context;
        this.f24814e = vahanDmsReupload;
        this.f24815f = list;
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, k kVar, Context context, String str, View view) {
        l.f(dialog, "$d");
        l.f(kVar, "this$0");
        l.f(context, "$context");
        l.f(str, "$obj_id");
        dialog.dismiss();
        kVar.K(context, "", str);
    }

    /* access modifiers changed from: private */
    public static final void J(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L(Dialog dialog, k kVar, String str, View view) {
        l.f(dialog, "$d");
        l.f(kVar, "this$0");
        l.f(str, "$obj_id");
        dialog.dismiss();
        kVar.f24814e.e2(str, 1);
    }

    /* access modifiers changed from: private */
    public static final void M(Dialog dialog, k kVar, String str, View view) {
        l.f(dialog, "$d");
        l.f(kVar, "this$0");
        l.f(str, "$obj_id");
        dialog.dismiss();
        kVar.f24814e.e2(str, 2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(le.k r0, int r1, android.view.View r2) {
        /*
            java.lang.String r2 = "this$0"
            cm.l.f(r0, r2)
            com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r0.f24814e
            java.util.List r0 = r0.f24815f
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.getObjectId()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.k.O(le.k, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P(le.k r0, int r1, android.view.View r2) {
        /*
            java.lang.String r2 = "this$0"
            cm.l.f(r0, r2)
            com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r0.f24814e
            java.util.List r0 = r0.f24815f
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.getObjectId()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.k.P(le.k, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Q(le.k r1, int r2, android.view.View r3) {
        /*
            java.lang.String r3 = "this$0"
            cm.l.f(r1, r3)
            android.content.Context r3 = r1.f24813d
            java.util.List r0 = r1.f24815f
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r0.get(r2)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r2
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.getObjectId()
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Are you sure you want to update the Document?"
            r1.H(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.k.Q(le.k, int, android.view.View):void");
    }

    public final void H(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str2, "obj_id");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_diloge_choose);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new g(dialog, this, context, str2));
        ((TextView) findViewById3).setOnClickListener(new h(dialog));
        dialog.show();
    }

    public final void K(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str2, "obj_id");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_gallery);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.galler);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById2 = dialog.findViewById(R.id.camera);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById).setOnClickListener(new i(dialog, this, str2));
        ((LinearLayout) findViewById2).setOnClickListener(new j(dialog, this, str2));
        dialog.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r5);
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(le.k.a r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r4, r0)
            java.util.List r0 = r3.f24815f
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r5)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.getCatName()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.widget.TextView r2 = r4.P()
            r2.setText(r0)
            java.util.List r0 = r3.f24815f
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r0.get(r5)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x0039
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataXX r0 = r0.getSubcategoryMasterData()
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r0.getSub_cat_name()
        L_0x0039:
            android.widget.TextView r0 = r4.O()
            r0.setText(r1)
            android.widget.ImageView r0 = r4.R()
            le.d r1 = new le.d
            r1.<init>(r3, r5)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r4.S()
            le.e r1 = new le.e
            r1.<init>(r3, r5)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r4 = r4.Q()
            le.f r0 = new le.f
            r0.<init>(r3, r5)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.k.p(le.k$a, int):void");
    }

    /* renamed from: R */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reupload_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        List list = this.f24815f;
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }
}
