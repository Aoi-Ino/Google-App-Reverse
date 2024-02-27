package s3;

import android.content.Context;
import android.content.res.Resources;
import p3.o;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f16030a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16031b;

    public r(Context context) {
        o.i(context);
        Resources resources = context.getResources();
        this.f16030a = resources;
        this.f16031b = resources.getResourcePackageName(o.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f16030a.getIdentifier(str, "string", this.f16031b);
        if (identifier == 0) {
            return null;
        }
        return this.f16030a.getString(identifier);
    }
}
