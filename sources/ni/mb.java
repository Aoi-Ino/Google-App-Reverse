package ni;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.e;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public class mb extends lb {
    private static final SparseIntArray S;
    private final CardView Q;
    private long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.doc_documents, 1);
        sparseIntArray.put(R.id.arrow_down, 2);
        sparseIntArray.put(R.id.arrow_up, 3);
        sparseIntArray.put(R.id.ll_layout, 4);
        sparseIntArray.put(R.id.title, 5);
        sparseIntArray.put(R.id.proff_spinner, 6);
        sparseIntArray.put(R.id.issue_design, 7);
        sparseIntArray.put(R.id.document_number, 8);
        sparseIntArray.put(R.id.contact_number, 9);
        sparseIntArray.put(R.id.issued_date, 10);
        sparseIntArray.put(R.id.menu_layout, 11);
        sparseIntArray.put(R.id.view_or_uploaded_doc_ll, 12);
        sparseIntArray.put(R.id.doc_selected_iv, 13);
        sparseIntArray.put(R.id.doc_selected_tv, 14);
        sparseIntArray.put(R.id.edit_doc_ll, 15);
        sparseIntArray.put(R.id.txt_edit, 16);
        sparseIntArray.put(R.id.capture_button, 17);
        sparseIntArray.put(R.id.doc_capture, 18);
        sparseIntArray.put(R.id.browse_button, 19);
        sparseIntArray.put(R.id.doc_gallary, 20);
    }

    public mb(e eVar, View view) {
        this(eVar, view, h.r(eVar, view, 21, (h.i) null, S));
    }

    /* access modifiers changed from: protected */
    public void i() {
        synchronized (this) {
            this.R = 0;
        }
    }

    public boolean n() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.R = 2;
        }
        u();
    }

    private mb(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[3], objArr[19], objArr[17], objArr[9], objArr[18], objArr[1], objArr[20], objArr[13], objArr[14], objArr[8], objArr[15], objArr[7], objArr[10], objArr[4], objArr[11], objArr[6], objArr[5], objArr[16], objArr[12]);
        this.R = -1;
        CardView cardView = objArr[0];
        this.Q = cardView;
        cardView.setTag((Object) null);
        w(view);
        x();
    }
}
