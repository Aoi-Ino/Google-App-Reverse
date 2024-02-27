package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f1785a;

    /* renamed from: b  reason: collision with root package name */
    int f1786b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f1787c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f1788d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f1789e = new SparseArray();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1790a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f1791b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        int f1792c = -1;

        /* renamed from: d  reason: collision with root package name */
        e f1793d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f1961f7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f1970g7) {
                    this.f1790a = obtainStyledAttributes.getResourceId(index, this.f1790a);
                } else if (index == i.f1979h7) {
                    this.f1792c = obtainStyledAttributes.getResourceId(index, this.f1792c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1792c);
                    context.getResources().getResourceName(this.f1792c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1793d = eVar;
                        eVar.e(context, this.f1792c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f1791b.add(bVar);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f1794a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f1795b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f1796c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f1797d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f1798e = -1;

        /* renamed from: f  reason: collision with root package name */
        e f1799f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.D7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.E7) {
                    this.f1798e = obtainStyledAttributes.getResourceId(index, this.f1798e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1798e);
                    context.getResources().getResourceName(this.f1798e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f1799f = eVar;
                        eVar.e(context, this.f1798e);
                    }
                } else if (index == i.F7) {
                    this.f1797d = obtainStyledAttributes.getDimension(index, this.f1797d);
                } else if (index == i.G7) {
                    this.f1795b = obtainStyledAttributes.getDimension(index, this.f1795b);
                } else if (index == i.H7) {
                    this.f1796c = obtainStyledAttributes.getDimension(index, this.f1796c);
                } else if (index == i.I7) {
                    this.f1794a = obtainStyledAttributes.getDimension(index, this.f1794a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f1785a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r1 = 0
        L_0x000d:
            r2 = 1
            if (r0 == r2) goto L_0x008d
            if (r0 == 0) goto L_0x007e
            r3 = 2
            if (r0 == r3) goto L_0x0017
            goto L_0x0081
        L_0x0017:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0050;
                case 80204913: goto L_0x0046;
                case 1382829617: goto L_0x003d;
                case 1657696882: goto L_0x0033;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
        L_0x0024:
            goto L_0x005a
        L_0x0025:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r6
            goto L_0x005b
        L_0x002f:
            r8 = move-exception
            goto L_0x0086
        L_0x0031:
            r8 = move-exception
            goto L_0x008a
        L_0x0033:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = 0
            goto L_0x005b
        L_0x003d:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            goto L_0x005b
        L_0x0046:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r3
            goto L_0x005b
        L_0x0050:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r0 == 0) goto L_0x005a
            r2 = r5
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            if (r2 == r3) goto L_0x0071
            if (r2 == r6) goto L_0x0066
            if (r2 == r5) goto L_0x0062
            goto L_0x0081
        L_0x0062:
            r7.b(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x0066:
            androidx.constraintlayout.widget.d$b r0 = new androidx.constraintlayout.widget.d$b     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            if (r1 == 0) goto L_0x0081
            r1.a(r0)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x0071:
            androidx.constraintlayout.widget.d$a r1 = new androidx.constraintlayout.widget.d$a     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r1.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            android.util.SparseArray r0 = r7.f1788d     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            int r2 = r1.f1790a     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x0081
        L_0x007e:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
        L_0x0081:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x0031, IOException -> 0x002f }
            goto L_0x000d
        L_0x0086:
            r8.printStackTrace()
            goto L_0x008d
        L_0x008a:
            r8.printStackTrace()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.l(context, xmlPullParser);
                this.f1789e.put(i10, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
