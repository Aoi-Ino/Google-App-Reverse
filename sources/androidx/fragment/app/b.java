package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.x;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.Map;

final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int[] f2936e;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList f2937f;

    /* renamed from: g  reason: collision with root package name */
    final int[] f2938g;

    /* renamed from: h  reason: collision with root package name */
    final int[] f2939h;

    /* renamed from: i  reason: collision with root package name */
    final int f2940i;

    /* renamed from: j  reason: collision with root package name */
    final String f2941j;

    /* renamed from: k  reason: collision with root package name */
    final int f2942k;

    /* renamed from: l  reason: collision with root package name */
    final int f2943l;

    /* renamed from: m  reason: collision with root package name */
    final CharSequence f2944m;

    /* renamed from: n  reason: collision with root package name */
    final int f2945n;

    /* renamed from: o  reason: collision with root package name */
    final CharSequence f2946o;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList f2947p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList f2948q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f2949r;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(Parcel parcel) {
        this.f2936e = parcel.createIntArray();
        this.f2937f = parcel.createStringArrayList();
        this.f2938g = parcel.createIntArray();
        this.f2939h = parcel.createIntArray();
        this.f2940i = parcel.readInt();
        this.f2941j = parcel.readString();
        this.f2942k = parcel.readInt();
        this.f2943l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2944m = (CharSequence) creator.createFromParcel(parcel);
        this.f2945n = parcel.readInt();
        this.f2946o = (CharSequence) creator.createFromParcel(parcel);
        this.f2947p = parcel.createStringArrayList();
        this.f2948q = parcel.createStringArrayList();
        this.f2949r = parcel.readInt() != 0;
    }

    private void c(a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f2936e.length) {
                x.a aVar2 = new x.a();
                int i12 = i10 + 1;
                aVar2.f3224a = this.f2936e[i10];
                if (q.J0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2936e[i12]);
                }
                aVar2.f3231h = k.b.values()[this.f2938g[i11]];
                aVar2.f3232i = k.b.values()[this.f2939h[i11]];
                int[] iArr = this.f2936e;
                int i13 = i10 + 2;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                aVar2.f3226c = z10;
                int i14 = iArr[i13];
                aVar2.f3227d = i14;
                int i15 = iArr[i10 + 3];
                aVar2.f3228e = i15;
                int i16 = i10 + 5;
                int i17 = iArr[i10 + 4];
                aVar2.f3229f = i17;
                i10 += 6;
                int i18 = iArr[i16];
                aVar2.f3230g = i18;
                aVar.f3208d = i14;
                aVar.f3209e = i15;
                aVar.f3210f = i17;
                aVar.f3211g = i18;
                aVar.f(aVar2);
                i11++;
            } else {
                aVar.f3212h = this.f2940i;
                aVar.f3215k = this.f2941j;
                aVar.f3213i = true;
                aVar.f3216l = this.f2943l;
                aVar.f3217m = this.f2944m;
                aVar.f3218n = this.f2945n;
                aVar.f3219o = this.f2946o;
                aVar.f3220p = this.f2947p;
                aVar.f3221q = this.f2948q;
                aVar.f3222r = this.f2949r;
                return;
            }
        }
    }

    public a d(q qVar) {
        a aVar = new a(qVar);
        c(aVar);
        aVar.f2928v = this.f2942k;
        for (int i10 = 0; i10 < this.f2937f.size(); i10++) {
            String str = (String) this.f2937f.get(i10);
            if (str != null) {
                ((x.a) aVar.f3207c.get(i10)).f3225b = qVar.e0(str);
            }
        }
        aVar.t(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public a e(q qVar, Map map) {
        a aVar = new a(qVar);
        c(aVar);
        for (int i10 = 0; i10 < this.f2937f.size(); i10++) {
            String str = (String) this.f2937f.get(i10);
            if (str != null) {
                i iVar = (i) map.get(str);
                if (iVar != null) {
                    ((x.a) aVar.f3207c.get(i10)).f3225b = iVar;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f2941j + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2936e);
        parcel.writeStringList(this.f2937f);
        parcel.writeIntArray(this.f2938g);
        parcel.writeIntArray(this.f2939h);
        parcel.writeInt(this.f2940i);
        parcel.writeString(this.f2941j);
        parcel.writeInt(this.f2942k);
        parcel.writeInt(this.f2943l);
        TextUtils.writeToParcel(this.f2944m, parcel, 0);
        parcel.writeInt(this.f2945n);
        TextUtils.writeToParcel(this.f2946o, parcel, 0);
        parcel.writeStringList(this.f2947p);
        parcel.writeStringList(this.f2948q);
        parcel.writeInt(this.f2949r ? 1 : 0);
    }

    b(a aVar) {
        int size = aVar.f3207c.size();
        this.f2936e = new int[(size * 6)];
        if (aVar.f3213i) {
            this.f2937f = new ArrayList(size);
            this.f2938g = new int[size];
            this.f2939h = new int[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                x.a aVar2 = (x.a) aVar.f3207c.get(i11);
                int i12 = i10 + 1;
                this.f2936e[i10] = aVar2.f3224a;
                ArrayList arrayList = this.f2937f;
                i iVar = aVar2.f3225b;
                arrayList.add(iVar != null ? iVar.f3052j : null);
                int[] iArr = this.f2936e;
                iArr[i12] = aVar2.f3226c;
                iArr[i10 + 2] = aVar2.f3227d;
                iArr[i10 + 3] = aVar2.f3228e;
                int i13 = i10 + 5;
                iArr[i10 + 4] = aVar2.f3229f;
                i10 += 6;
                iArr[i13] = aVar2.f3230g;
                this.f2938g[i11] = aVar2.f3231h.ordinal();
                this.f2939h[i11] = aVar2.f3232i.ordinal();
            }
            this.f2940i = aVar.f3212h;
            this.f2941j = aVar.f3215k;
            this.f2942k = aVar.f2928v;
            this.f2943l = aVar.f3216l;
            this.f2944m = aVar.f3217m;
            this.f2945n = aVar.f3218n;
            this.f2946o = aVar.f3219o;
            this.f2947p = aVar.f3220p;
            this.f2948q = aVar.f3221q;
            this.f2949r = aVar.f3222r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
