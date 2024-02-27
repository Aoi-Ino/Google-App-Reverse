package com.nic.mparivahan.NewDlScreen.DlAcknow;

import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.data.model.temp.ProofList;
import com.nic.mparivahan.dlservices.data.model.temp.ResponseBean;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import gc.a1;
import gc.b1;
import gc.c1;
import gc.d1;
import gc.f1;
import gc.w0;
import gc.x0;
import gc.y0;
import gc.z0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kk.e;
import pl.x;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9339d;

    /* renamed from: e  reason: collision with root package name */
    private final Application f9340e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f9341f;

    /* renamed from: g  reason: collision with root package name */
    private final C0120a f9342g;

    /* renamed from: h  reason: collision with root package name */
    private Calendar f9343h = Calendar.getInstance();

    /* renamed from: com.nic.mparivahan.NewDlScreen.DlAcknow.a$a  reason: collision with other inner class name */
    public interface C0120a {
        void a(int i10);

        void b(int i10, DocumentListItem documentListItem);

        void c(int i10, DocumentListItem documentListItem);
    }

    public static final class b extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final LinearLayout C;
        private final TextView D;
        private final EditText E;
        private final EditText F;
        private final EditText G;
        private final EditText H;
        private final EditText I;
        private final LinearLayout J;
        private final LinearLayout K;
        private final LinearLayout L;
        private final ImageView M;
        private final ImageView N;
        private final TextView O;
        private final TextView P;
        private final TextView Q;

        /* renamed from: y  reason: collision with root package name */
        private final LinearLayout f9344y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f9345z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "view");
            this.f9344y = (LinearLayout) view.findViewById(R.id.view_or_uploaded_doc_ll);
            this.f9345z = (ImageView) view.findViewById(R.id.doc_selected_iv);
            this.A = (TextView) view.findViewById(R.id.doc_selected_tv);
            this.B = (TextView) view.findViewById(R.id.txt_edit);
            this.C = (LinearLayout) view.findViewById(R.id.edit_doc_ll);
            this.D = (TextView) view.findViewById(R.id.title);
            this.E = (EditText) view.findViewById(R.id.proff_spinner);
            this.F = (EditText) view.findViewById(R.id.issue_design);
            this.G = (EditText) view.findViewById(R.id.contact_number);
            this.H = (EditText) view.findViewById(R.id.document_number);
            this.I = (EditText) view.findViewById(R.id.issued_date);
            this.J = (LinearLayout) view.findViewById(R.id.browse_button);
            this.K = (LinearLayout) view.findViewById(R.id.capture_button);
            this.L = (LinearLayout) view.findViewById(R.id.ll_layout);
            this.M = (ImageView) view.findViewById(R.id.arrow_down);
            this.N = (ImageView) view.findViewById(R.id.arrow_up);
            this.O = (TextView) view.findViewById(R.id.doc_documents);
            this.P = (TextView) view.findViewById(R.id.doc_capture);
            this.Q = (TextView) view.findViewById(R.id.doc_gallary);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[Catch:{ Exception -> 0x012d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[Catch:{ Exception -> 0x012d }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0091 A[SYNTHETIC, Splitter:B:28:0x0091] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[Catch:{ Exception -> 0x012d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void g0(com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r9) {
            /*
                r8 = this;
                android.widget.TextView r0 = r8.D     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = r9.getName()     // Catch:{ Exception -> 0x012d }
                r0.setText(r1)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.E     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = r9.getDocName()     // Catch:{ Exception -> 0x012d }
                r0.setText(r1)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.F     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = r9.getIssueAuthDesg()     // Catch:{ Exception -> 0x012d }
                r0.setText(r1)     // Catch:{ Exception -> 0x012d }
                java.lang.String r0 = r9.getIssueDate()     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = "null"
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x003c
                java.lang.String r0 = r9.getIssueDate()     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x003c
                int r0 = r0.length()     // Catch:{ Exception -> 0x012d }
                if (r0 != 0) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                java.lang.String r0 = r9.getIssueDate()     // Catch:{ Exception -> 0x012d }
                boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x0042
            L_0x003c:
                android.widget.EditText r0 = r8.I     // Catch:{ Exception -> 0x012d }
                r0.setText(r2)     // Catch:{ Exception -> 0x012d }
                goto L_0x004b
            L_0x0042:
                android.widget.EditText r0 = r8.I     // Catch:{ Exception -> 0x012d }
                java.lang.String r3 = r9.getIssueDate()     // Catch:{ Exception -> 0x012d }
                r0.setText(r3)     // Catch:{ Exception -> 0x012d }
            L_0x004b:
                java.lang.String r0 = r9.getContactNo()     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x0068
                java.lang.String r0 = r9.getContactNo()     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x0068
                int r0 = r0.length()     // Catch:{ Exception -> 0x012d }
                if (r0 != 0) goto L_0x005e
                goto L_0x0068
            L_0x005e:
                java.lang.String r0 = r9.getContactNo()     // Catch:{ Exception -> 0x012d }
                boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x006e
            L_0x0068:
                android.widget.EditText r0 = r8.G     // Catch:{ Exception -> 0x012d }
                r0.setText(r2)     // Catch:{ Exception -> 0x012d }
                goto L_0x0077
            L_0x006e:
                android.widget.EditText r0 = r8.G     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = r9.getContactNo()     // Catch:{ Exception -> 0x012d }
                r0.setText(r1)     // Catch:{ Exception -> 0x012d }
            L_0x0077:
                android.widget.EditText r0 = r8.H     // Catch:{ Exception -> 0x012d }
                java.lang.String r1 = r9.getDocNo()     // Catch:{ Exception -> 0x012d }
                r0.setText(r1)     // Catch:{ Exception -> 0x012d }
                boolean r0 = r9.isDocInsertedStatus()     // Catch:{ Exception -> 0x012d }
                r1 = 2131231389(0x7f08029d, float:1.8078858E38)
                r2 = 0
                r3 = 2
                java.lang.String r4 = ".pdf"
                r5 = 1
                r6 = 8
                r7 = 0
                if (r0 == 0) goto L_0x00e6
                android.widget.EditText r0 = r8.F     // Catch:{ Exception -> 0x012d }
                r0.setFocusable(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.F     // Catch:{ Exception -> 0x012d }
                r0.setFocusableInTouchMode(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.H     // Catch:{ Exception -> 0x012d }
                r0.setFocusable(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.H     // Catch:{ Exception -> 0x012d }
                r0.setFocusableInTouchMode(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.G     // Catch:{ Exception -> 0x012d }
                r0.setFocusable(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.EditText r0 = r8.G     // Catch:{ Exception -> 0x012d }
                r0.setFocusableInTouchMode(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r0 = r8.K     // Catch:{ Exception -> 0x012d }
                r0.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r0 = r8.J     // Catch:{ Exception -> 0x012d }
                r0.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r0 = r8.f9344y     // Catch:{ Exception -> 0x012d }
                r0.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                java.lang.String r0 = r9.getFileNmae()     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x00cf
                boolean r0 = km.q.F(r0, r4, r7, r3, r2)     // Catch:{ Exception -> 0x012d }
                if (r0 != r5) goto L_0x00cf
                android.widget.ImageView r0 = r8.f9345z     // Catch:{ Exception -> 0x012d }
                r0.setBackgroundResource(r1)     // Catch:{ Exception -> 0x012d }
            L_0x00cf:
                java.lang.String r9 = r9.getRemarks()     // Catch:{ Exception -> 0x012d }
                java.lang.String r0 = "Reject"
                boolean r9 = km.p.o(r9, r0, r5)     // Catch:{ Exception -> 0x012d }
                if (r9 == 0) goto L_0x012d
                android.widget.LinearLayout r9 = r8.J     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.K     // Catch:{ Exception -> 0x012d }
            L_0x00e2:
                r9.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                goto L_0x012d
            L_0x00e6:
                boolean r0 = r9.isBrowseStatus()     // Catch:{ Exception -> 0x012d }
                if (r0 == 0) goto L_0x011b
                java.lang.String r9 = r9.getFileNmae()     // Catch:{ Exception -> 0x012d }
                if (r9 == 0) goto L_0x00fe
                boolean r9 = km.q.F(r9, r4, r7, r3, r2)     // Catch:{ Exception -> 0x012d }
                if (r9 != r5) goto L_0x00fe
                android.widget.ImageView r9 = r8.f9345z     // Catch:{ Exception -> 0x012d }
                r9.setBackgroundResource(r1)     // Catch:{ Exception -> 0x012d }
                goto L_0x0106
            L_0x00fe:
                android.widget.ImageView r9 = r8.f9345z     // Catch:{ Exception -> 0x012d }
                r0 = 2131231080(0x7f080168, float:1.807823E38)
                r9.setBackgroundResource(r0)     // Catch:{ Exception -> 0x012d }
            L_0x0106:
                android.widget.LinearLayout r9 = r8.f9344y     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.C     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.K     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.J     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                goto L_0x012d
            L_0x011b:
                android.widget.LinearLayout r9 = r8.f9344y     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.C     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r6)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.K     // Catch:{ Exception -> 0x012d }
                r9.setVisibility(r7)     // Catch:{ Exception -> 0x012d }
                android.widget.LinearLayout r9 = r8.J     // Catch:{ Exception -> 0x012d }
                goto L_0x00e2
            L_0x012d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.DlAcknow.a.b.g0(com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem):void");
        }

        public final void O(DocumentListItem documentListItem) {
            l.f(documentListItem, "item");
            g0(documentListItem);
        }

        public final ImageView P() {
            return this.M;
        }

        public final ImageView Q() {
            return this.N;
        }

        public final LinearLayout R() {
            return this.J;
        }

        public final LinearLayout S() {
            return this.K;
        }

        public final EditText T() {
            return this.G;
        }

        public final LinearLayout U() {
            return this.C;
        }

        public final EditText V() {
            return this.H;
        }

        public final EditText W() {
            return this.E;
        }

        public final TextView X() {
            return this.P;
        }

        public final TextView Y() {
            return this.O;
        }

        public final TextView Z() {
            return this.Q;
        }

        public final EditText a0() {
            return this.F;
        }

        public final EditText b0() {
            return this.I;
        }

        public final LinearLayout c0() {
            return this.L;
        }

        public final TextView d0() {
            return this.B;
        }

        public final LinearLayout e0() {
            return this.f9344y;
        }

        public final TextView f0() {
            return this.A;
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DocumentListItem f9346e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9347f;

        c(DocumentListItem documentListItem, b bVar) {
            this.f9346e = documentListItem;
            this.f9347f = bVar;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "editable");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
            DocumentListItem documentListItem = this.f9346e;
            if (documentListItem != null) {
                documentListItem.setIssueAuthDesg(this.f9347f.a0().getText().toString());
            }
            DocumentListItem documentListItem2 = this.f9346e;
            Log.e("issue-aut", String.valueOf(documentListItem2 != null ? documentListItem2.getIssueAuthDesg() : null));
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DocumentListItem f9348e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9349f;

        d(DocumentListItem documentListItem, b bVar) {
            this.f9348e = documentListItem;
            this.f9349f = bVar;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "editable");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
            DocumentListItem documentListItem = this.f9348e;
            if (documentListItem != null) {
                documentListItem.setDocNo(this.f9349f.V().getText().toString());
            }
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DocumentListItem f9350e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9351f;

        e(DocumentListItem documentListItem, b bVar) {
            this.f9350e = documentListItem;
            this.f9351f = bVar;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "editable");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
            DocumentListItem documentListItem = this.f9350e;
            if (documentListItem != null) {
                documentListItem.setContactNo(this.f9351f.T().getText().toString());
            }
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DocumentListItem f9352e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9353f;

        f(DocumentListItem documentListItem, b bVar) {
            this.f9352e = documentListItem;
            this.f9353f = bVar;
        }

        public void afterTextChanged(Editable editable) {
            l.f(editable, "editable");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            l.f(charSequence, "charSequence");
            DocumentListItem documentListItem = this.f9352e;
            if (documentListItem != null) {
                documentListItem.setIssueDate(this.f9353f.b0().getText().toString());
            }
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f9354e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f9355f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f9356g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, b bVar, int i10) {
            super(1);
            this.f9354e = aVar;
            this.f9355f = bVar;
            this.f9356g = i10;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            Integer statusCode;
            ResponseBean responseBean = uploadDocListResponse.getResponseBean();
            if (responseBean != null && (statusCode = responseBean.getStatusCode()) != null && statusCode.intValue() == 200) {
                a aVar = this.f9354e;
                List<ProofList> proofList = uploadDocListResponse.getProofList();
                EditText W = this.f9355f.W();
                l.e(W, "<get-docType>(...)");
                aVar.Y(proofList, W, this.f9356g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    public static final class h implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f9357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f9358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f9360d;

        h(EditText editText, a aVar, int i10, List list) {
            this.f9357a = editText;
            this.f9358b = aVar;
            this.f9359c = i10;
            this.f9360d = list;
        }

        public void a(String str, int i10) {
            ProofList proofList;
            ProofList proofList2;
            ProofList proofList3;
            this.f9357a.setText(str);
            ArrayList L = this.f9358b.L();
            String str2 = null;
            DocumentListItem documentListItem = L != null ? (DocumentListItem) L.get(this.f9359c) : null;
            if (documentListItem != null) {
                List list = this.f9360d;
                documentListItem.setDocName((list == null || (proofList3 = (ProofList) list.get(i10)) == null) ? null : proofList3.getName());
            }
            ArrayList L2 = this.f9358b.L();
            DocumentListItem documentListItem2 = L2 != null ? (DocumentListItem) L2.get(this.f9359c) : null;
            if (documentListItem2 != null) {
                List list2 = this.f9360d;
                documentListItem2.setProofCode((list2 == null || (proofList2 = (ProofList) list2.get(i10)) == null) ? null : proofList2.getId());
            }
            ArrayList L3 = this.f9358b.L();
            DocumentListItem documentListItem3 = L3 != null ? (DocumentListItem) L3.get(this.f9359c) : null;
            if (documentListItem3 != null) {
                List list3 = this.f9360d;
                if (!(list3 == null || (proofList = (ProofList) list3.get(i10)) == null)) {
                    str2 = proofList.getCode();
                }
                documentListItem3.setDocCode(str2);
            }
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9361a;

        i(bm.l lVar) {
            l.f(lVar, "function");
            this.f9361a = lVar;
        }

        public final pl.c a() {
            return this.f9361a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9361a.invoke(obj);
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

    public a(Context context, Application application, ArrayList arrayList, C0120a aVar) {
        l.f(context, "context");
        l.f(application, "application");
        l.f(aVar, "itemListener");
        this.f9339d = context;
        this.f9340e = application;
        this.f9341f = arrayList;
        this.f9342g = aVar;
    }

    /* access modifiers changed from: private */
    public static final void N(DocumentListItem documentListItem, b bVar, a aVar, u uVar, int i10, View view) {
        l.f(bVar, "$holder");
        l.f(aVar, "this$0");
        l.f(uVar, "$mSession");
        if (documentListItem != null && documentListItem.isDocInsertedStatus() && !p.o(documentListItem.getRemarks(), "Reject", true)) {
            return;
        }
        if (bVar.W().getText().toString().length() <= 0) {
            Context context = aVar.f9339d;
            Toast.makeText(context, ((ld.c) uVar.f20234e).b("select_doc_type", context.getString(R.string.sel_doc_type)), 0).show();
        } else if (documentListItem != null) {
            aVar.f9342g.b(i10, documentListItem);
        }
    }

    /* access modifiers changed from: private */
    public static final void O(a aVar, int i10, View view) {
        l.f(aVar, "this$0");
        aVar.f9342g.a(i10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r5 = r17.getFileNmae();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P(com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r17, com.nic.mparivahan.NewDlScreen.DlAcknow.a r18, int r19, cm.u r20, com.nic.mparivahan.NewDlScreen.DlAcknow.a.b r21, android.view.View r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "this$0"
            cm.l.f(r0, r3)
            java.lang.String r3 = "$mSession"
            cm.l.f(r2, r3)
            java.lang.String r3 = "$holder"
            r4 = r21
            cm.l.f(r4, r3)
            r3 = 0
            if (r17 == 0) goto L_0x002f
            java.lang.String r5 = r17.getFileNmae()
            if (r5 == 0) goto L_0x002f
            java.lang.String r6 = "."
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            int r5 = km.q.Q(r5, r6, r7, r8, r9, r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0030
        L_0x002f:
            r5 = r3
        L_0x0030:
            cm.l.c(r5)
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0243
            kk.c r5 = new kk.c
            r5.<init>()
            boolean r6 = r17.isDocInsertedStatus()
            r7 = 2
            java.lang.String r8 = ".pdf"
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0168
            java.lang.String r4 = r17.getFileNmae()
            if (r4 == 0) goto L_0x006b
            java.lang.String r11 = r17.getFileNmae()
            cm.l.c(r11)
            java.lang.String r12 = "."
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            int r5 = km.q.V(r11, r12, r13, r14, r15, r16)
            java.lang.String r4 = r4.substring(r10, r5)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r5)
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.nic.mparivahan.dlservices.utilities.e.m()
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "&folderName="
            r5.append(r4)
            java.util.ArrayList r4 = r0.f9341f
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r4 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r4
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = r4.getApplication_no()
            goto L_0x0092
        L_0x0091:
            r4 = r3
        L_0x0092:
            r5.append(r4)
            java.lang.String r4 = "&stateCode="
            r5.append(r4)
            java.util.ArrayList r4 = r0.f9341f
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r1 = r4.get(r1)
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r1
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = r1.getStateCode()
            goto L_0x00ac
        L_0x00ab:
            r1 = r3
        L_0x00ac:
            r5.append(r1)
            java.lang.String r1 = "&status=NP&j_key=vVl%2FAz1yGsjOAG18WDeScg%3D%3D&j_securityKey="
            r5.append(r1)
            com.nic.mparivahan.APIController r1 = com.nic.mparivahan.APIController.a()
            java.lang.String r1 = r1.sarthiDMSKey()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = "DMS_URL_FOR_IMAGE"
            android.util.Log.d(r4, r1)
            java.lang.String r4 = r17.getFileNmae()
            if (r4 == 0) goto L_0x00d6
            boolean r4 = km.q.F(r4, r8, r10, r7, r3)
            if (r4 != r9) goto L_0x00d6
            goto L_0x0243
        L_0x00d6:
            android.app.Dialog r4 = new android.app.Dialog
            android.content.Context r5 = r0.f9339d
            r4.<init>(r5)
            r5 = 2131558760(0x7f0d0168, float:1.8742845E38)
            r4.setContentView(r5)
            android.view.Window r5 = r4.getWindow()
            cm.l.c(r5)
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r7 = -1
            r6.<init>(r7)
            r5.setBackgroundDrawable(r6)
            r5 = 2131361828(0x7f0a0024, float:1.834342E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "null cannot be cast to non-null type android.webkit.WebView"
            cm.l.d(r5, r6)
            android.webkit.WebView r5 = (android.webkit.WebView) r5
            r6 = 2131363620(0x7f0a0724, float:1.8347054E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.Button"
            cm.l.d(r6, r7)
            android.widget.Button r6 = (android.widget.Button) r6
            java.lang.Object r7 = r2.f20234e
            ld.c r7 = (ld.c) r7
            android.content.Context r8 = r0.f9339d
            r9 = 2132018596(0x7f1405a4, float:1.9675503E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "btn_ok"
            java.lang.String r7 = r7.b(r9, r8)
            r6.setText(r7)
            gc.e1 r7 = new gc.e1
            r7.<init>(r4)
            r6.setOnClickListener(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0149 }
            r6.<init>()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r7 = "<html><body><img src=\""
            r6.append(r7)     // Catch:{ Exception -> 0x0149 }
            r6.append(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = "\" width=\"100%\" height=\"100%\"\"/></body></html>"
            r6.append(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r6 = "text/html"
            r5.loadData(r1, r6, r3)     // Catch:{ Exception -> 0x0149 }
            goto L_0x0163
        L_0x0149:
            android.content.Context r0 = r0.f9339d
            java.lang.Object r1 = r2.f20234e
            ld.c r1 = (ld.c) r1
            r2 = 2132018516(0x7f140554, float:1.967534E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "service_is_not_present"
            java.lang.String r1 = r1.b(r3, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
            r0.show()
        L_0x0163:
            r4.show()
            goto L_0x0243
        L_0x0168:
            java.lang.String r1 = r17.getFileNmae()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0233
            boolean r1 = km.q.F(r1, r8, r10, r7, r3)
            if (r1 != r9) goto L_0x0233
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r3 = android.os.Environment.getExternalStoragePublicDirectory(r3)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "/mParivahan_doc/"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x019f
            r4.mkdirs()
        L_0x019f:
            java.lang.String r4 = r17.getFileNmae()
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r5.<init>(r1)
            boolean r1 = r5.exists()
            if (r1 != 0) goto L_0x01d8
            java.lang.String r1 = r17.getFileToUpload()
            byte[] r1 = android.util.Base64.decode(r1, r10)
            java.lang.String r4 = "decode(...)"
            cm.l.e(r1, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r5)
            r4.write(r1)
            r4.flush()
            r4.close()
        L_0x01d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r4 = android.os.Environment.getExternalStoragePublicDirectory(r4)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r17.getFileNmae()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            android.content.Context r1 = r0.f9339d
            java.lang.String r4 = "com.nic.mparivahan.provider"
            android.net.Uri r1 = androidx.core.content.FileProvider.g(r1, r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "create pdf uri path==>"
            android.util.Log.e(r3, r2)
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0243 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0243 }
            java.lang.String r3 = "application/pdf"
            r2.setDataAndType(r1, r3)     // Catch:{ Exception -> 0x0243 }
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2.setFlags(r1)     // Catch:{ Exception -> 0x0243 }
            r2.addFlags(r9)     // Catch:{ Exception -> 0x0243 }
            android.content.Context r0 = r0.f9339d     // Catch:{ Exception -> 0x0243 }
            r0.startActivity(r2)     // Catch:{ Exception -> 0x0243 }
            goto L_0x0243
        L_0x0233:
            android.widget.LinearLayout r0 = r21.e0()
            java.lang.String r1 = "<get-uploadImgLL>(...)"
            cm.l.e(r0, r1)
            java.lang.String r1 = r17.getFileToUpload()
            r5.c(r0, r2, r1)
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.DlAcknow.a.P(com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem, com.nic.mparivahan.NewDlScreen.DlAcknow.a, int, cm.u, com.nic.mparivahan.NewDlScreen.DlAcknow.a$b, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void Q(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void R(DocumentListItem documentListItem, a aVar, b bVar, View view) {
        l.f(aVar, "this$0");
        l.f(bVar, "$holder");
        if (documentListItem == null || !documentListItem.isDocInsertedStatus()) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(aVar.f9339d, new f1(bVar), aVar.f9343h.get(1), aVar.f9343h.get(2), aVar.f9343h.get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void S(b bVar, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(bVar, "$holder");
        EditText b02 = bVar.b0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        b02.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void T(DocumentListItem documentListItem, a aVar, b bVar, int i10, View view) {
        l.f(aVar, "this$0");
        l.f(bVar, "$holder");
        if (documentListItem == null || !documentListItem.isDocInsertedStatus()) {
            Application application = aVar.f9340e;
            String str = null;
            String stateCode = documentListItem != null ? documentListItem.getStateCode() : null;
            if (documentListItem != null) {
                str = documentListItem.getId();
            }
            new ti.h(application, stateCode, str).b().h(new i(new g(aVar, bVar, i10)));
        }
    }

    /* access modifiers changed from: private */
    public static final void U(b bVar, View view) {
        l.f(bVar, "$holder");
        bVar.Q().setVisibility(0);
        bVar.P().setVisibility(8);
        bVar.c0().setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void V(b bVar, View view) {
        l.f(bVar, "$holder");
        bVar.P().setVisibility(0);
        bVar.Q().setVisibility(8);
        bVar.c0().setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void W(DocumentListItem documentListItem, b bVar, a aVar, u uVar, int i10, View view) {
        l.f(bVar, "$holder");
        l.f(aVar, "this$0");
        l.f(uVar, "$mSession");
        if (documentListItem != null && documentListItem.isDocInsertedStatus() && !p.o(documentListItem.getRemarks(), "Reject", true)) {
            return;
        }
        if (bVar.W().getText().toString().length() <= 0) {
            Context context = aVar.f9339d;
            Toast.makeText(context, ((ld.c) uVar.f20234e).b("select_doc_type", context.getString(R.string.sel_doc_type)), 0).show();
        } else if (documentListItem != null) {
            aVar.f9342g.c(i10, documentListItem);
        }
    }

    /* access modifiers changed from: private */
    public final void Y(List list, EditText editText, int i10) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ProofList) it.next()).getName()));
            }
        }
        Context context = this.f9339d;
        l.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        kk.e a10 = kk.e.A0.a("Select Documents", arrayList);
        a10.k2(((j) context).F0(), "DocumentsPicker");
        a10.n2(new h(editText, this, i10, list));
    }

    public final ArrayList L() {
        return this.f9341f;
    }

    /* renamed from: M */
    public void p(b bVar, int i10) {
        l.f(bVar, "holder");
        ArrayList arrayList = this.f9341f;
        DocumentListItem documentListItem = arrayList != null ? (DocumentListItem) arrayList.get(i10) : null;
        if (documentListItem != null) {
            bVar.O(documentListItem);
        }
        u uVar = new u();
        uVar.f20234e = new ld.c(this.f9339d);
        bVar.W().setHint(((ld.c) uVar.f20234e).b("select_documents", this.f9339d.getString(R.string.select_documents)));
        bVar.a0().setHint(((ld.c) uVar.f20234e).b("issuer", this.f9339d.getString(R.string.issuer)));
        bVar.V().setHint(((ld.c) uVar.f20234e).b("doc_number", this.f9339d.getString(R.string.doc_number)));
        bVar.T().setHint(((ld.c) uVar.f20234e).b("con_number", this.f9339d.getString(R.string.con_number)));
        bVar.b0().setHint(((ld.c) uVar.f20234e).b("d_i_d", this.f9339d.getString(R.string.d_i_d)));
        bVar.Y().setText(((ld.c) uVar.f20234e).b("doc_documents", this.f9339d.getString(R.string.documents)));
        bVar.Z().setText(((ld.c) uVar.f20234e).b("label_gallery", this.f9339d.getString(R.string.gallery)));
        bVar.X().setText(((ld.c) uVar.f20234e).b("label_capture", this.f9339d.getString(R.string.capture)));
        bVar.f0().setText(((ld.c) uVar.f20234e).b("label_view", "View"));
        bVar.d0().setText(((ld.c) uVar.f20234e).b("label_edit", "Edit"));
        bVar.a0().addTextChangedListener(new c(documentListItem, bVar));
        bVar.V().addTextChangedListener(new d(documentListItem, bVar));
        bVar.T().addTextChangedListener(new e(documentListItem, bVar));
        bVar.b0().addTextChangedListener(new f(documentListItem, bVar));
        bVar.b0().setOnClickListener(new w0(documentListItem, this, bVar));
        bVar.W().setOnClickListener(new x0(documentListItem, this, bVar, i10));
        bVar.P().setOnClickListener(new y0(bVar));
        bVar.Q().setOnClickListener(new z0(bVar));
        DocumentListItem documentListItem2 = documentListItem;
        b bVar2 = bVar;
        u uVar2 = uVar;
        int i11 = i10;
        bVar.S().setOnClickListener(new a1(documentListItem2, bVar2, this, uVar2, i11));
        bVar.R().setOnClickListener(new b1(documentListItem2, bVar2, this, uVar2, i11));
        bVar.U().setOnClickListener(new c1(this, i10));
        bVar.e0().setOnClickListener(new d1(documentListItem, this, i10, uVar2, bVar));
    }

    /* renamed from: X */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_dl_renewal_doc, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public final void Z(int i10) {
        ArrayList arrayList = this.f9341f;
        if (arrayList != null) {
            DocumentListItem documentListItem = (DocumentListItem) arrayList.remove(i10);
        }
        n(i10);
        ArrayList arrayList2 = this.f9341f;
        if (arrayList2 != null) {
            m(i10, arrayList2.size());
        }
    }

    public int e() {
        ArrayList arrayList = this.f9341f;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }

    public long f(int i10) {
        return (long) i10;
    }

    public int g(int i10) {
        return i10;
    }
}
