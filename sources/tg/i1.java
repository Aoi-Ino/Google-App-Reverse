package tg;

import android.app.DatePickerDialog;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService;

public final /* synthetic */ class i1 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IsueOfDuplicateMultiService f31366e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f31367f;

    public /* synthetic */ i1(IsueOfDuplicateMultiService isueOfDuplicateMultiService, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f31366e = isueOfDuplicateMultiService;
        this.f31367f = onDateSetListener;
    }

    public final void onClick(View view) {
        IsueOfDuplicateMultiService.D1(this.f31366e, this.f31367f, view);
    }
}
