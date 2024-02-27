package ja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cm.l;
import com.nic.mparivahan.PushNotification.BannerModel.MparBanner;
import com.nic.mparivahan.R;
import com.smarteist.autoimageslider.d;
import gl.t;
import gl.x;
import java.util.ArrayList;

public final class g extends d {

    /* renamed from: e  reason: collision with root package name */
    private final Context f12796e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f12797f;

    /* renamed from: g  reason: collision with root package name */
    private final ra.a f12798g;

    public static final class a extends d.b {

        /* renamed from: b  reason: collision with root package name */
        private final ImageView f12799b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f22636a.findViewById(R.id.idIVSliderItem);
            l.e(findViewById, "findViewById(...)");
            this.f12799b = (ImageView) findViewById;
        }

        public final ImageView a() {
            return this.f12799b;
        }
    }

    public g(Context context, ArrayList arrayList, ra.a aVar) {
        l.f(context, "context");
        l.f(aVar, "bannerClick");
        this.f12796e = context;
        this.f12797f = arrayList;
        this.f12798g = aVar;
    }

    /* access modifiers changed from: private */
    public static final void w(g gVar, int i10, View view) {
        l.f(gVar, "this$0");
        ra.a aVar = gVar.f12798g;
        ArrayList arrayList = gVar.f12797f;
        l.c(arrayList);
        aVar.e(String.valueOf(((MparBanner) arrayList.get(i10)).getImgDesc()));
    }

    public int d() {
        ArrayList arrayList = this.f12797f;
        l.c(arrayList);
        return arrayList.size();
    }

    /* renamed from: v */
    public void s(a aVar, int i10) {
        try {
            t p10 = t.p(this.f12796e);
            ArrayList arrayList = this.f12797f;
            l.c(arrayList);
            x g10 = p10.k(((MparBanner) arrayList.get(i10)).getImgUrl()).g(new e(32.0f));
            l.c(aVar);
            g10.c(aVar.a());
            aVar.a().setOnClickListener(new f(this, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public a t(ViewGroup viewGroup) {
        l.c(viewGroup);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.slider_item, (ViewGroup) null);
        l.e(inflate, "inflate(...)");
        return new a(inflate);
    }
}
