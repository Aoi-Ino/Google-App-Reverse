package ej;

import android.view.View;
import cm.u;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ InsertedDocBeanItem f23031e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f23032f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f23033g;

    public /* synthetic */ t(InsertedDocBeanItem insertedDocBeanItem, w wVar, u uVar) {
        this.f23031e = insertedDocBeanItem;
        this.f23032f = wVar;
        this.f23033g = uVar;
    }

    public final void onClick(View view) {
        w.E(this.f23031e, this.f23032f, this.f23033g, view);
    }
}
