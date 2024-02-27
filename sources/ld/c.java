package ld;

import android.content.Context;
import android.content.SharedPreferences;
import cm.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f13487a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f13488b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13489c;

    public c(Context context) {
        if (context != null) {
            e(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("language_key", 0);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            this.f13487a = sharedPreferences;
        }
    }

    public final void a() {
        SharedPreferences.Editor clear;
        SharedPreferences sharedPreferences = this.f13487a;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null && (clear = edit.clear()) != null) {
            clear.apply();
        }
    }

    public final String b(String str, String str2) {
        SharedPreferences sharedPreferences = this.f13487a;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.f13487a;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString("TempLangCode", "english");
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.f13487a;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString("LangCode", "english");
    }

    public final void e(Context context) {
        l.f(context, "<set-?>");
        this.f13489c = context;
    }

    public final void f(String str) {
        SharedPreferences sharedPreferences = this.f13487a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l.e(edit, "edit(...)");
        this.f13488b = edit;
        if (edit == null) {
            l.v("prefsEditor");
            edit = null;
        }
        edit.putString("LangCode", str);
        SharedPreferences.Editor editor2 = this.f13488b;
        if (editor2 == null) {
            l.v("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }

    public final void g(String str, String str2) {
        SharedPreferences sharedPreferences = this.f13487a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l.e(edit, "edit(...)");
        this.f13488b = edit;
        if (edit == null) {
            l.v("prefsEditor");
            edit = null;
        }
        edit.putString(str, str2);
        SharedPreferences.Editor editor2 = this.f13488b;
        if (editor2 == null) {
            l.v("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }

    public final void h(String str) {
        SharedPreferences sharedPreferences = this.f13487a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            l.v("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l.e(edit, "edit(...)");
        this.f13488b = edit;
        if (edit == null) {
            l.v("prefsEditor");
            edit = null;
        }
        edit.putString("TempLangCode", str);
        SharedPreferences.Editor editor2 = this.f13488b;
        if (editor2 == null) {
            l.v("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }
}
