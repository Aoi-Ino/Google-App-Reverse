package tg;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService;

public final /* synthetic */ class h1 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IsueOfDuplicateMultiService f31363a;

    public /* synthetic */ h1(IsueOfDuplicateMultiService isueOfDuplicateMultiService) {
        this.f31363a = isueOfDuplicateMultiService;
    }

    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        IsueOfDuplicateMultiService.C1(this.f31363a, datePicker, i10, i11, i12);
    }
}
