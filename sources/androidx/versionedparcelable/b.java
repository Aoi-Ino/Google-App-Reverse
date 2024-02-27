package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import o.a;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4036d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4037e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4038f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4039g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4040h;

    /* renamed from: i  reason: collision with root package name */
    private int f4041i;

    /* renamed from: j  reason: collision with root package name */
    private int f4042j;

    /* renamed from: k  reason: collision with root package name */
    private int f4043k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f4037e.writeInt(bArr.length);
            this.f4037e.writeByteArray(bArr);
            return;
        }
        this.f4037e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4037e, 0);
    }

    public void E(int i10) {
        this.f4037e.writeInt(i10);
    }

    public void G(Parcelable parcelable) {
        this.f4037e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f4037e.writeString(str);
    }

    public void a() {
        int i10 = this.f4041i;
        if (i10 >= 0) {
            int i11 = this.f4036d.get(i10);
            int dataPosition = this.f4037e.dataPosition();
            this.f4037e.setDataPosition(i11);
            this.f4037e.writeInt(dataPosition - i11);
            this.f4037e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f4037e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4042j;
        if (i10 == this.f4038f) {
            i10 = this.f4039g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f4040h + "  ", this.f4033a, this.f4034b, this.f4035c);
    }

    public boolean g() {
        return this.f4037e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f4037e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4037e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4037e);
    }

    public boolean m(int i10) {
        while (this.f4042j < this.f4039g) {
            int i11 = this.f4043k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4037e.setDataPosition(this.f4042j);
            int readInt = this.f4037e.readInt();
            this.f4043k = this.f4037e.readInt();
            this.f4042j += readInt;
        }
        return this.f4043k == i10;
    }

    public int o() {
        return this.f4037e.readInt();
    }

    public Parcelable q() {
        return this.f4037e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f4037e.readString();
    }

    public void w(int i10) {
        a();
        this.f4041i = i10;
        this.f4036d.put(i10, this.f4037e.dataPosition());
        E(0);
        E(i10);
    }

    public void y(boolean z10) {
        this.f4037e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, a aVar, a aVar2, a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4036d = new SparseIntArray();
        this.f4041i = -1;
        this.f4043k = -1;
        this.f4037e = parcel;
        this.f4038f = i10;
        this.f4039g = i11;
        this.f4042j = i10;
        this.f4040h = str;
    }
}
