package p3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.n;
import t3.c;

public final class a extends t3.a {
    public static final Parcelable.Creator<a> CREATOR = new r();

    /* renamed from: i  reason: collision with root package name */
    public static final a f14623i = new a(0);

    /* renamed from: e  reason: collision with root package name */
    final int f14624e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14625f;

    /* renamed from: g  reason: collision with root package name */
    private final PendingIntent f14626g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14627h;

    public a(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    static String h(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int c() {
        return this.f14625f;
    }

    public String d() {
        return this.f14627h;
    }

    public PendingIntent e() {
        return this.f14626g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14625f == aVar.f14625f && n.a(this.f14626g, aVar.f14626g) && n.a(this.f14627h, aVar.f14627h);
    }

    public boolean f() {
        return (this.f14625f == 0 || this.f14626g == null) ? false : true;
    }

    public boolean g() {
        return this.f14625f == 0;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f14625f), this.f14626g, this.f14627h);
    }

    public String toString() {
        n.a c10 = n.c(this);
        c10.a("statusCode", h(this.f14625f));
        c10.a("resolution", this.f14626g);
        c10.a("message", this.f14627h);
        return c10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f14624e);
        c.j(parcel, 2, c());
        c.n(parcel, 3, e(), i10, false);
        c.o(parcel, 4, d(), false);
        c.b(parcel, a10);
    }

    a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f14624e = i10;
        this.f14625f = i11;
        this.f14626g = pendingIntent;
        this.f14627h = str;
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public a(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
