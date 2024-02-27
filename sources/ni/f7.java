package ni;

import android.view.View;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.h;
import com.github.barteksc.pdfviewer.PDFView;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

public abstract class f7 extends h {
    public final ProgressBar A;

    /* renamed from: w  reason: collision with root package name */
    public final CustomWegetLayout f26267w;

    /* renamed from: x  reason: collision with root package name */
    public final qd f26268x;

    /* renamed from: y  reason: collision with root package name */
    public final CoordinatorLayout f26269y;

    /* renamed from: z  reason: collision with root package name */
    public final PDFView f26270z;

    protected f7(Object obj, View view, int i10, CustomWegetLayout customWegetLayout, qd qdVar, CoordinatorLayout coordinatorLayout, PDFView pDFView, ProgressBar progressBar) {
        super(obj, view, i10);
        this.f26267w = customWegetLayout;
        this.f26268x = qdVar;
        this.f26269y = coordinatorLayout;
        this.f26270z = pDFView;
        this.A = progressBar;
    }
}
