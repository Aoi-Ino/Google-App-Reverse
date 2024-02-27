package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w.d;

abstract class f {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2332a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2333b;

        a(int i10, int i11) {
            this.f2332a = new int[]{i10, i11};
            this.f2333b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f2332a = new int[]{i10, i11, i12};
            this.f2333b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List list, List list2) {
            int size = list.size();
            this.f2332a = new int[size];
            this.f2333b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f2332a[i10] = ((Integer) list.get(i10)).intValue();
                this.f2333b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return aVar2;
        }
        aVar2 = new a(i10, i11);
        return aVar2;
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray i10 = k.i(resources, theme2, attributeSet, d.A);
            float f10 = k.f(i10, xmlPullParser2, "startX", d.J, 0.0f);
            float f11 = k.f(i10, xmlPullParser2, "startY", d.K, 0.0f);
            float f12 = k.f(i10, xmlPullParser2, "endX", d.L, 0.0f);
            float f13 = k.f(i10, xmlPullParser2, "endY", d.M, 0.0f);
            float f14 = k.f(i10, xmlPullParser2, "centerX", d.E, 0.0f);
            float f15 = k.f(i10, xmlPullParser2, "centerY", d.F, 0.0f);
            int g10 = k.g(i10, xmlPullParser2, "type", d.D, 0);
            int b10 = k.b(i10, xmlPullParser2, "startColor", d.B, 0);
            boolean h10 = k.h(xmlPullParser2, "centerColor");
            int b11 = k.b(i10, xmlPullParser2, "centerColor", d.I, 0);
            int b12 = k.b(i10, xmlPullParser2, "endColor", d.C, 0);
            int g11 = k.g(i10, xmlPullParser2, "tileMode", d.H, 0);
            float f16 = f14;
            float f17 = k.f(i10, xmlPullParser2, "gradientRadius", d.G, 0.0f);
            i10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, h10, b11);
            if (g10 == 1) {
                float f18 = f16;
                if (f17 > 0.0f) {
                    int[] iArr = a10.f2332a;
                    return new RadialGradient(f18, f15, f17, iArr, a10.f2333b, d(g11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g10 != 2) {
                return new LinearGradient(f10, f11, f12, f13, a10.f2332a, a10.f2333b, d(g11));
            } else {
                return new SweepGradient(f16, f15, a10.f2332a, a10.f2333b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = w.d.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.i(r9, r12, r11, r3)
            int r5 = w.d.O
            boolean r6 = r3.hasValue(r5)
            int r7 = w.d.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List) r4, (java.util.List) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }
}
