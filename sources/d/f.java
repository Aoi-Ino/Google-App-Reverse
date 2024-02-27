package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import cm.g;
import cm.l;

public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final c f9648i = new c((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final IntentSender f9649e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f9650f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9651g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9652h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f9653a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f9654b;

        /* renamed from: c  reason: collision with root package name */
        private int f9655c;

        /* renamed from: d  reason: collision with root package name */
        private int f9656d;

        public a(IntentSender intentSender) {
            l.f(intentSender, "intentSender");
            this.f9653a = intentSender;
        }

        public final f a() {
            return new f(this.f9653a, this.f9654b, this.f9655c, this.f9656d);
        }

        public final a b(Intent intent) {
            this.f9654b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f9656d = i10;
            this.f9655c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            l.f(parcel, "inParcel");
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }
    }

    public f(IntentSender intentSender, Intent intent, int i10, int i11) {
        l.f(intentSender, "intentSender");
        this.f9649e = intentSender;
        this.f9650f = intent;
        this.f9651g = i10;
        this.f9652h = i11;
    }

    public final Intent c() {
        return this.f9650f;
    }

    public final int d() {
        return this.f9651g;
    }

    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f9652h;
    }

    public final IntentSender f() {
        return this.f9649e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "dest");
        parcel.writeParcelable(this.f9649e, i10);
        parcel.writeParcelable(this.f9650f, i10);
        parcel.writeInt(this.f9651g);
        parcel.writeInt(this.f9652h);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            cm.l.f(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            cm.l.c(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.f.<init>(android.os.Parcel):void");
    }
}
