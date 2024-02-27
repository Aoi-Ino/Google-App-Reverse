package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class f1 extends n0 {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1380c = false;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f1381b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.f1381b = new WeakReference(context);
    }

    public static boolean b() {
        return f1380c;
    }

    public static void c(boolean z10) {
        f1380c = z10;
    }

    public static boolean d() {
        b();
        return false;
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i10) {
        return super.getAnimation(i10);
    }

    public /* bridge */ /* synthetic */ boolean getBoolean(int i10) {
        return super.getBoolean(i10);
    }

    public /* bridge */ /* synthetic */ int getColor(int i10) {
        return super.getColor(i10);
    }

    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i10) {
        return super.getColorStateList(i10);
    }

    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    public /* bridge */ /* synthetic */ float getDimension(int i10) {
        return super.getDimension(i10);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i10) {
        return super.getDimensionPixelOffset(i10);
    }

    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i10) {
        return super.getDimensionPixelSize(i10);
    }

    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    public Drawable getDrawable(int i10) {
        Context context = (Context) this.f1381b.get();
        return context != null ? m0.g().s(context, this, i10) : a(i10);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i10, int i11) {
        return super.getDrawableForDensity(i10, i11);
    }

    public /* bridge */ /* synthetic */ float getFraction(int i10, int i11, int i12) {
        return super.getFraction(i10, i11, i12);
    }

    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ int[] getIntArray(int i10) {
        return super.getIntArray(i10);
    }

    public /* bridge */ /* synthetic */ int getInteger(int i10) {
        return super.getInteger(i10);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i10) {
        return super.getLayout(i10);
    }

    public /* bridge */ /* synthetic */ Movie getMovie(int i10) {
        return super.getMovie(i10);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i10, int i11) {
        return super.getQuantityString(i10, i11);
    }

    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i10, int i11) {
        return super.getQuantityText(i10, i11);
    }

    public /* bridge */ /* synthetic */ String getResourceEntryName(int i10) {
        return super.getResourceEntryName(i10);
    }

    public /* bridge */ /* synthetic */ String getResourceName(int i10) {
        return super.getResourceName(i10);
    }

    public /* bridge */ /* synthetic */ String getResourcePackageName(int i10) {
        return super.getResourcePackageName(i10);
    }

    public /* bridge */ /* synthetic */ String getResourceTypeName(int i10) {
        return super.getResourceTypeName(i10);
    }

    public /* bridge */ /* synthetic */ String getString(int i10) {
        return super.getString(i10);
    }

    public /* bridge */ /* synthetic */ String[] getStringArray(int i10) {
        return super.getStringArray(i10);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i10) {
        return super.getText(i10);
    }

    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i10) {
        return super.getTextArray(i10);
    }

    public /* bridge */ /* synthetic */ void getValue(int i10, TypedValue typedValue, boolean z10) {
        super.getValue(i10, typedValue, z10);
    }

    public /* bridge */ /* synthetic */ void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) {
        super.getValueForDensity(i10, i11, typedValue, z10);
    }

    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i10) {
        return super.getXml(i10);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i10) {
        return super.obtainTypedArray(i10);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i10) {
        return super.openRawResource(i10);
    }

    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i10) {
        return super.openRawResourceFd(i10);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawable(int i10, Resources.Theme theme) {
        return super.getDrawable(i10, theme);
    }

    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return super.getDrawableForDensity(i10, i11, theme);
    }

    public /* bridge */ /* synthetic */ String getQuantityString(int i10, int i11, Object[] objArr) {
        return super.getQuantityString(i10, i11, objArr);
    }

    public /* bridge */ /* synthetic */ String getString(int i10, Object[] objArr) {
        return super.getString(i10, objArr);
    }

    public /* bridge */ /* synthetic */ CharSequence getText(int i10, CharSequence charSequence) {
        return super.getText(i10, charSequence);
    }

    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z10) {
        super.getValue(str, typedValue, z10);
    }

    public /* bridge */ /* synthetic */ InputStream openRawResource(int i10, TypedValue typedValue) {
        return super.openRawResource(i10, typedValue);
    }
}
