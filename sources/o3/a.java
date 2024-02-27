package o3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.c;

public final class a extends t3.a {
    public static final Parcelable.Creator<a> CREATOR = new h();

    /* renamed from: e  reason: collision with root package name */
    final Intent f14360e;

    public a(Intent intent) {
        this.f14360e = intent;
    }

    public Intent c() {
        return this.f14360e;
    }

    public String d() {
        String stringExtra = this.f14360e.getStringExtra("google.message_id");
        return stringExtra == null ? this.f14360e.getStringExtra("message_id") : stringExtra;
    }

    /* access modifiers changed from: package-private */
    public final Integer e() {
        if (this.f14360e.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f14360e.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f14360e, i10, false);
        c.b(parcel, a10);
    }
}
