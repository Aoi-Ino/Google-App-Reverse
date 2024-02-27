package t0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import cm.g;
import cm.l;
import cm.m;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t0.b0;

@b0.b("activity")
public class b extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16238e = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f16239c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f16240d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: t0.b$b  reason: collision with other inner class name */
    public static class C0216b extends p {

        /* renamed from: p  reason: collision with root package name */
        private Intent f16241p;

        /* renamed from: q  reason: collision with root package name */
        private String f16242q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0216b(b0 b0Var) {
            super(b0Var);
            l.f(b0Var, "activityNavigator");
        }

        private final String u0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            l.e(packageName, "context.packageName");
            return p.w(str, "${applicationId}", packageName, false, 4, (Object) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            r2 = r4.f16241p;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r5 == 0) goto L_0x0038
                boolean r2 = r5 instanceof t0.b.C0216b
                if (r2 != 0) goto L_0x000c
                goto L_0x0038
            L_0x000c:
                boolean r2 = super.equals(r5)
                if (r2 == 0) goto L_0x0036
                android.content.Intent r2 = r4.f16241p
                if (r2 == 0) goto L_0x0022
                r3 = r5
                t0.b$b r3 = (t0.b.C0216b) r3
                android.content.Intent r3 = r3.f16241p
                boolean r2 = r2.filterEquals(r3)
                if (r2 == 0) goto L_0x0036
                goto L_0x0029
            L_0x0022:
                r2 = r5
                t0.b$b r2 = (t0.b.C0216b) r2
                android.content.Intent r2 = r2.f16241p
                if (r2 != 0) goto L_0x0036
            L_0x0029:
                java.lang.String r2 = r4.f16242q
                t0.b$b r5 = (t0.b.C0216b) r5
                java.lang.String r5 = r5.f16242q
                boolean r5 = cm.l.a(r2, r5)
                if (r5 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r0 = r1
            L_0x0037:
                return r0
            L_0x0038:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.b.C0216b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f16241p;
            int i10 = 0;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f16242q;
            if (str != null) {
                i10 = str.hashCode();
            }
            return filterHashCode + i10;
        }

        public void k0(Context context, AttributeSet attributeSet) {
            l.f(context, "context");
            l.f(attributeSet, "attrs");
            super.k0(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g0.f16275a);
            l.e(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            z0(u0(context, obtainAttributes.getString(g0.f16280f)));
            String string = obtainAttributes.getString(g0.f16276b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                w0(new ComponentName(context, string));
            }
            v0(obtainAttributes.getString(g0.f16277c));
            String u02 = u0(context, obtainAttributes.getString(g0.f16278d));
            if (u02 != null) {
                x0(Uri.parse(u02));
            }
            y0(u0(context, obtainAttributes.getString(g0.f16279e)));
            obtainAttributes.recycle();
        }

        public boolean p0() {
            return false;
        }

        public final String q0() {
            Intent intent = this.f16241p;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName r0() {
            Intent intent = this.f16241p;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String s0() {
            return this.f16242q;
        }

        public final Intent t0() {
            return this.f16241p;
        }

        public String toString() {
            String q02;
            ComponentName r02 = r0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (r02 != null) {
                sb2.append(" class=");
                q02 = r02.getClassName();
            } else {
                q02 = q0();
                if (q02 != null) {
                    sb2.append(" action=");
                }
                String sb3 = sb2.toString();
                l.e(sb3, "sb.toString()");
                return sb3;
            }
            sb2.append(q02);
            String sb32 = sb2.toString();
            l.e(sb32, "sb.toString()");
            return sb32;
        }

        public final C0216b v0(String str) {
            if (this.f16241p == null) {
                this.f16241p = new Intent();
            }
            Intent intent = this.f16241p;
            l.c(intent);
            intent.setAction(str);
            return this;
        }

        public final C0216b w0(ComponentName componentName) {
            if (this.f16241p == null) {
                this.f16241p = new Intent();
            }
            Intent intent = this.f16241p;
            l.c(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final C0216b x0(Uri uri) {
            if (this.f16241p == null) {
                this.f16241p = new Intent();
            }
            Intent intent = this.f16241p;
            l.c(intent);
            intent.setData(uri);
            return this;
        }

        public final C0216b y0(String str) {
            this.f16242q = str;
            return this;
        }

        public final C0216b z0(String str) {
            if (this.f16241p == null) {
                this.f16241p = new Intent();
            }
            Intent intent = this.f16241p;
            l.c(intent);
            intent.setPackage(str);
            return this;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final c f16243e = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final Context invoke(Context context) {
            l.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public b(Context context) {
        Object obj;
        l.f(context, "context");
        this.f16239c = context;
        Iterator it = m.d(context, c.f16243e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f16240d = (Activity) obj;
    }

    public boolean k() {
        Activity activity = this.f16240d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public C0216b a() {
        return new C0216b(this);
    }

    /* renamed from: m */
    public p d(C0216b bVar, Bundle bundle, v vVar, b0.a aVar) {
        Intent intent;
        int intExtra;
        l.f(bVar, "destination");
        if (bVar.t0() != null) {
            Intent intent2 = new Intent(bVar.t0());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String s02 = bVar.s0();
                if (!(s02 == null || s02.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(s02);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + s02);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (this.f16240d == null) {
                intent2.addFlags(268435456);
            }
            if (vVar != null && vVar.h()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f16240d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.H());
            Resources resources = this.f16239c.getResources();
            if (vVar != null) {
                int c10 = vVar.c();
                int d10 = vVar.d();
                if ((c10 <= 0 || !l.a(resources.getResourceTypeName(c10), "animator")) && (d10 <= 0 || !l.a(resources.getResourceTypeName(d10), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d10);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c10) + " and popExit resource " + resources.getResourceName(d10) + " when launching " + bVar);
                }
            }
            this.f16239c.startActivity(intent2);
            if (vVar == null || this.f16240d == null) {
                return null;
            }
            int a10 = vVar.a();
            int b10 = vVar.b();
            if ((a10 > 0 && l.a(resources.getResourceTypeName(a10), "animator")) || (b10 > 0 && l.a(resources.getResourceTypeName(b10), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a10) + " and exit resource " + resources.getResourceName(b10) + "when launching " + bVar);
                return null;
            } else if (a10 < 0 && b10 < 0) {
                return null;
            } else {
                this.f16240d.overridePendingTransition(f.b(a10, 0), f.b(b10, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(("Destination " + bVar.H() + " does not have an Intent set.").toString());
        }
    }
}
