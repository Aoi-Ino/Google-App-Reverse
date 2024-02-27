package bo;

import ap.h;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class b extends BasicPermission {

    /* renamed from: e  reason: collision with root package name */
    private final String f20026e;

    /* renamed from: f  reason: collision with root package name */
    private final int f20027f;

    public b(String str, String str2) {
        super(str, str2);
        this.f20026e = str2;
        this.f20027f = a(str2);
    }

    private int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(h.e(str), " ,");
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i10 |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i10 |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i10 |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i10 |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i10 |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i10 |= 32;
            } else if (nextToken.equals("all")) {
                i10 |= 63;
            }
        }
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20027f == bVar.f20027f && getName().equals(bVar.getName());
    }

    public String getActions() {
        return this.f20026e;
    }

    public int hashCode() {
        return getName().hashCode() + this.f20027f;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i10 = this.f20027f;
        int i11 = ((b) permission).f20027f;
        return (i10 & i11) == i11;
    }
}
