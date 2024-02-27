package md;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.Sos.AddContactScreen;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f14010e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Dialog f14011f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AddContactScreen f14012g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f14013h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f14014i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f14015j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f14016k;

    public /* synthetic */ e(Dialog dialog, Dialog dialog2, AddContactScreen addContactScreen, String str, String str2, String str3, String str4) {
        this.f14010e = dialog;
        this.f14011f = dialog2;
        this.f14012g = addContactScreen;
        this.f14013h = str;
        this.f14014i = str2;
        this.f14015j = str3;
        this.f14016k = str4;
    }

    public final void onClick(View view) {
        AddContactScreen.V1(this.f14010e, this.f14011f, this.f14012g, this.f14013h, this.f14014i, this.f14015j, this.f14016k, view);
    }
}
