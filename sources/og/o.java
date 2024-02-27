package og;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import ld.c;

public final class o extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f30063d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30064e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f30065f;

    /* renamed from: g  reason: collision with root package name */
    private c f30066g;

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
        private final TextView I;
        private final TextView J;
        private final TextView K;
        private final TextView L;
        private final TextView M;
        private final TextView N;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f30067y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f30068z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "view");
            this.f30067y = (TextView) view.findViewById(R.id.title);
            this.f30068z = (ImageView) view.findViewById(R.id.delet_proff);
            this.A = (LinearLayout) view.findViewById(R.id.browser_button);
            this.B = (LinearLayout) view.findViewById(R.id.camera);
            this.C = (Spinner) view.findViewById(R.id.proff_spinner);
            this.D = (LinearLayout) view.findViewById(R.id.menu_layout);
            this.E = (LinearLayout) view.findViewById(R.id.upload_image);
            this.F = (LinearLayout) view.findViewById(R.id.upload_doc_img);
            this.G = (LinearLayout) view.findViewById(R.id.update);
            this.H = (TextView) view.findViewById(R.id.mandatory_icon);
            this.I = (TextView) view.findViewById(R.id.doc_type_title);
            this.J = (TextView) view.findViewById(R.id.doc_name_title);
            this.K = (TextView) view.findViewById(R.id.gallery);
            this.L = (TextView) view.findViewById(R.id.capture);
            this.M = (TextView) view.findViewById(R.id.edit_txt);
            this.N = (TextView) view.findViewById(R.id.preview);
        }

        public final LinearLayout O() {
            return this.A;
        }

        public final LinearLayout P() {
            return this.B;
        }

        public final TextView Q() {
            return this.L;
        }

        public final ImageView R() {
            return this.f30068z;
        }

        public final TextView S() {
            return this.J;
        }

        public final TextView T() {
            return this.I;
        }

        public final TextView U() {
            return this.M;
        }

        public final TextView V() {
            return this.K;
        }

        public final TextView W() {
            return this.H;
        }

        public final LinearLayout X() {
            return this.D;
        }

        public final TextView Y() {
            return this.N;
        }

        public final Spinner Z() {
            return this.C;
        }

        public final TextView a0() {
            return this.f30067y;
        }

        public final LinearLayout b0() {
            return this.G;
        }

        public final LinearLayout c0() {
            return this.F;
        }

        public final LinearLayout d0() {
            return this.E;
        }
    }

    public o(Context context, a aVar, ArrayList arrayList) {
        l.f(context, "context");
        l.f(aVar, "itemListener");
        this.f30063d = context;
        this.f30064e = aVar;
        this.f30065f = arrayList;
        this.f30066g = new c(context);
    }

    /* access modifiers changed from: private */
    public static final void I(o oVar, int i10, u uVar, View view) {
        l.f(oVar, "this$0");
        l.f(uVar, "$testval");
        oVar.f30064e.d(i10, ((SubcategoryMasterDataX) uVar.f20234e).getCat_id(), ((SubcategoryMasterDataX) uVar.f20234e).getSub_cat_id());
    }

    /* access modifiers changed from: private */
    public static final void J(o oVar, int i10, u uVar, View view) {
        l.f(oVar, "this$0");
        l.f(uVar, "$testval");
        oVar.f30064e.h(i10, ((SubcategoryMasterDataX) uVar.f20234e).getCat_id(), ((SubcategoryMasterDataX) uVar.f20234e).getSub_cat_id());
    }

    /* access modifiers changed from: private */
    public static final void K(o oVar, int i10, View view) {
        l.f(oVar, "this$0");
        oVar.f30064e.a(i10);
    }

    /* access modifiers changed from: private */
    public static final void L(o oVar, int i10, View view) {
        l.f(oVar, "this$0");
        oVar.f30064e.g(i10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4.get(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void M(og.o r2, int r3, android.view.View r4) {
        /*
            java.lang.String r4 = "this$0"
            cm.l.f(r2, r4)
            java.util.ArrayList r4 = r2.f30065f
            r0 = 0
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r4.get(r3)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            if (r4 == 0) goto L_0x0054
            java.lang.Boolean r4 = r4.isAttached()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r4 = cm.l.a(r4, r1)
            if (r4 == 0) goto L_0x0054
            java.util.ArrayList r4 = r2.f30065f
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r4.get(r3)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            if (r4 == 0) goto L_0x0054
            java.lang.Integer r4 = r4.getDocType()
            if (r4 != 0) goto L_0x0031
            goto L_0x0054
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x0054
            android.content.Context r4 = r2.f30063d     // Catch:{ Exception -> 0x004a }
            java.util.ArrayList r1 = r2.f30065f     // Catch:{ Exception -> 0x004a }
            if (r1 == 0) goto L_0x004c
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x004a }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3     // Catch:{ Exception -> 0x004a }
            if (r3 == 0) goto L_0x004c
            android.graphics.Bitmap r0 = r3.getBitmap()     // Catch:{ Exception -> 0x004a }
            goto L_0x004c
        L_0x004a:
            r2 = move-exception
            goto L_0x0050
        L_0x004c:
            r2.Q(r4, r0)     // Catch:{ Exception -> 0x004a }
            goto L_0x00b3
        L_0x0050:
            r2.printStackTrace()
            goto L_0x00b3
        L_0x0054:
            java.util.ArrayList r4 = r2.f30065f
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r4.get(r3)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            if (r4 == 0) goto L_0x00b3
            java.lang.Boolean r4 = r4.isAttached()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r4 = cm.l.a(r4, r1)
            if (r4 == 0) goto L_0x00b3
            java.util.ArrayList r4 = r2.f30065f
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r4.get(r3)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            if (r4 == 0) goto L_0x00b3
            java.lang.Integer r4 = r4.getDocType()
            if (r4 != 0) goto L_0x007f
            goto L_0x00b3
        L_0x007f:
            int r4 = r4.intValue()
            r1 = 1
            if (r4 != r1) goto L_0x00b3
            java.util.ArrayList r4 = r2.f30065f     // Catch:{ Exception -> 0x00b3 }
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x00b3 }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4     // Catch:{ Exception -> 0x00b3 }
            if (r4 == 0) goto L_0x0097
            java.lang.String r4 = r4.getFile_name()     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0098
        L_0x0097:
            r4 = r0
        L_0x0098:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00b3 }
            java.util.ArrayList r1 = r2.f30065f     // Catch:{ Exception -> 0x00b3 }
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x00b3 }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3     // Catch:{ Exception -> 0x00b3 }
            if (r3 == 0) goto L_0x00ac
            java.lang.String r0 = r3.getDocBase64()     // Catch:{ Exception -> 0x00b3 }
        L_0x00ac:
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00b3 }
            r2.P(r4, r3)     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o.M(og.o, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(og.o r1, int r2, cm.u r3, android.view.View r4) {
        /*
            java.lang.String r4 = "this$0"
            cm.l.f(r1, r4)
            java.lang.String r4 = "$testval"
            cm.l.f(r3, r4)
            og.o$a r4 = r1.f30064e
            java.lang.Object r0 = r3.f20234e
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r0
            java.lang.String r0 = r0.getSub_cat_id()
            java.lang.Object r3 = r3.f20234e
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r3
            java.lang.String r3 = r3.getCat_id()
            java.util.ArrayList r1 = r1.f30065f
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
        throw new UnsupportedOperationException("Method not decompiled: og.o.N(og.o, int, cm.u, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void R(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x006b, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0.get(r8);
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(og.o.b r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r7, r0)
            ld.c r0 = new ld.c
            android.content.Context r1 = r6.f30063d
            r0.<init>(r1)
            android.widget.TextView r1 = r7.U()
            java.lang.String r2 = "label_edit"
            java.lang.String r3 = "Edit"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r7.Y()
            java.lang.String r2 = "label_Preview"
            java.lang.String r3 = "Preview"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r7.T()
            java.lang.String r2 = "Document_type_Text"
            java.lang.String r3 = "Document Type"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r7.S()
            java.lang.String r2 = "Document_Name_Text"
            java.lang.String r3 = "Document Name"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r7.Q()
            java.lang.String r2 = "label_capture"
            java.lang.String r3 = "Capture"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r7.V()
            java.lang.String r2 = "label_gallery"
            java.lang.String r3 = "Gallery"
            java.lang.String r0 = r0.b(r2, r3)
            r1.setText(r0)
            java.util.ArrayList r0 = r6.f30065f
            r1 = 0
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r0.get(r8)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r0.getCatName()
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.ArrayList r2 = r6.f30065f
            r3 = 0
            r4 = 8
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r2.get(r8)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r2
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = r2.getMandatory()
            if (r2 == 0) goto L_0x00aa
            java.lang.String r5 = "Y"
            boolean r2 = r2.equals(r5)
            r5 = 1
            if (r2 != r5) goto L_0x00aa
            android.widget.TextView r2 = r7.a0()
            r2.setText(r0)
            android.widget.TextView r0 = r7.W()
            r0.setVisibility(r3)
            goto L_0x00b8
        L_0x00aa:
            android.widget.TextView r2 = r7.a0()
            r2.setText(r0)
            android.widget.TextView r0 = r7.W()
            r0.setVisibility(r4)
        L_0x00b8:
            java.util.ArrayList r0 = r6.f30065f
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r0.get(r8)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            if (r0 == 0) goto L_0x00c8
            java.util.List r1 = r0.getSubcategoryMasterDataList()
        L_0x00c8:
            le.l r0 = new le.l
            android.content.Context r2 = r6.f30063d
            r0.<init>(r2, r1)
            android.widget.Spinner r1 = r7.Z()
            r1.setAdapter(r0)
            cm.u r0 = new cm.u
            r0.<init>()
            android.widget.Spinner r1 = r7.Z()
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX"
            cm.l.d(r1, r2)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r1
            r0.f20234e = r1
            java.lang.String r2 = "test"
            java.lang.String r1 = r1.getSub_cat_id()
            android.util.Log.e(r2, r1)
            java.util.ArrayList r1 = r6.f30065f
            if (r1 == 0) goto L_0x012a
            java.lang.Object r1 = r1.get(r8)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
            if (r1 == 0) goto L_0x012a
            java.lang.Boolean r1 = r1.isAttached()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = cm.l.a(r1, r2)
            if (r1 == 0) goto L_0x012a
            android.widget.LinearLayout r1 = r7.X()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r7.c0()
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r7.d0()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r7.b0()
            r1.setVisibility(r3)
            goto L_0x0146
        L_0x012a:
            android.widget.LinearLayout r1 = r7.X()
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r7.c0()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r7.d0()
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r7.b0()
            r1.setVisibility(r4)
        L_0x0146:
            android.widget.LinearLayout r1 = r7.O()
            og.h r2 = new og.h
            r2.<init>(r6, r8, r0)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r7.P()
            og.i r2 = new og.i
            r2.<init>(r6, r8, r0)
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r7.R()
            og.j r2 = new og.j
            r2.<init>(r6, r8)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r7.b0()
            og.k r2 = new og.k
            r2.<init>(r6, r8)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r7.c0()
            og.l r2 = new og.l
            r2.<init>(r6, r8)
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r7 = r7.d0()
            og.m r1 = new og.m
            r1.<init>(r6, r8, r0)
            r7.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.o.p(og.o$b, int):void");
    }

    /* renamed from: O */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_vahan_dms_doc, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public final void P(String str, String str2) {
        l.f(str, "file_name");
        l.f(str2, "base64Pdf");
        String str3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str3 + str);
        if (!file2.exists()) {
            byte[] decode = Base64.decode(str2, 0);
            l.e(decode, "decode(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        Uri g10 = FileProvider.g(this.f30063d, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(g10);
        Log.e("create pdf uri path==>", sb2.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this.f30063d.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void Q(Context context, Bitmap bitmap) {
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
        ((TextView) findViewById).setOnClickListener(new n(dialog));
        dialog.show();
    }

    public int e() {
        ArrayList arrayList = this.f30065f;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }
}
