package le;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.Calendar;
import java.util.List;

public final class c extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f24790d;

    /* renamed from: e  reason: collision with root package name */
    private final a f24791e;

    /* renamed from: f  reason: collision with root package name */
    private final List f24792f;

    /* renamed from: g  reason: collision with root package name */
    private Calendar f24793g = Calendar.getInstance();

    public interface a {
        void p(String str);
    }

    public static final class b extends RecyclerView.d0 {
        private final ImageView A;
        private final LinearLayout B;
        private final TextView C;
        private final TextView D;
        private final TextView E;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f24794y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f24795z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "view");
            this.f24794y = (TextView) view.findViewById(R.id.title);
            this.f24795z = (TextView) view.findViewById(R.id.proff_spinner);
            this.A = (ImageView) view.findViewById(R.id.upload_doc_img);
            this.B = (LinearLayout) view.findViewById(R.id.view);
            this.C = (TextView) view.findViewById(R.id.doc_type_title);
            this.D = (TextView) view.findViewById(R.id.doc_name_title);
            this.E = (TextView) view.findViewById(R.id.view_title);
        }

        public final TextView O() {
            return this.D;
        }

        public final TextView P() {
            return this.C;
        }

        public final TextView Q() {
            return this.f24795z;
        }

        public final TextView R() {
            return this.f24794y;
        }

        public final ImageView S() {
            return this.A;
        }

        public final LinearLayout T() {
            return this.B;
        }

        public final TextView U() {
            return this.E;
        }
    }

    public c(Context context, a aVar, List list) {
        l.f(context, "context");
        l.f(aVar, "itemListener");
        this.f24790d = context;
        this.f24791e = aVar;
        this.f24792f = list;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(le.c r0, int r1, android.view.View r2) {
        /*
            java.lang.String r2 = "this$0"
            cm.l.f(r0, r2)
            le.c$a r2 = r0.f24791e
            java.util.List r0 = r0.f24792f
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
        throw new UnsupportedOperationException("Method not decompiled: le.c.D(le.c, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(le.c r0, int r1, android.view.View r2) {
        /*
            java.lang.String r2 = "this$0"
            cm.l.f(r0, r2)
            le.c$a r2 = r0.f24791e
            java.util.List r0 = r0.f24792f
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
        throw new UnsupportedOperationException("Method not decompiled: le.c.E(le.c, int, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003e, code lost:
        r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0.get(r6);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(le.c.b r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r5, r0)
            ld.c r0 = new ld.c
            android.content.Context r1 = r4.f24790d
            r0.<init>(r1)
            android.widget.TextView r1 = r5.P()
            java.lang.String r2 = "Document_type_Text"
            java.lang.String r3 = " Document Type"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r5.O()
            java.lang.String r2 = "Document_Name_Text"
            java.lang.String r3 = "Document Name"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r5.U()
            java.lang.String r2 = "label_view"
            java.lang.String r3 = "View"
            java.lang.String r0 = r0.b(r2, r3)
            r1.setText(r0)
            java.util.List r0 = r4.f24792f
            r1 = 0
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r0.get(r6)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.getCatName()
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.widget.TextView r2 = r5.R()
            r2.setText(r0)
            java.util.List r0 = r4.f24792f
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r0.get(r6)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded) r0
            if (r0 == 0) goto L_0x006d
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataXX r0 = r0.getSubcategoryMasterData()
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r0.getSub_cat_name()
        L_0x006d:
            android.widget.TextView r0 = r5.Q()
            r0.setText(r1)
            android.widget.ImageView r0 = r5.S()
            le.a r1 = new le.a
            r1.<init>(r4, r6)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r5 = r5.T()
            le.b r0 = new le.b
            r0.<init>(r4, r6)
            r5.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.c.p(le.c$b, int):void");
    }

    /* renamed from: F */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uploaded_documents_dms, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public int e() {
        List list = this.f24792f;
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }
}
