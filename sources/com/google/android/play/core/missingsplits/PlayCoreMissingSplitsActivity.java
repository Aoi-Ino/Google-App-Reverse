package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import t5.a;
import t5.r;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    private final String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    private final void b(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 66);
        sb2.append("market://details?id=");
        sb2.append(str);
        sb2.append("&referrer=utm_source%3Dplay.core.missingsplits");
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb2.toString())).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e10) {
            new a(getClass().getName()).c(e10, "Couldn't start missing splits activity for %s", str);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            b(getPackageName());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (r.b(this)) {
            String a10 = a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 91);
            sb2.append("The app ");
            sb2.append(a10);
            sb2.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb2.toString()).setPositiveButton("Reinstall", this);
        } else {
            String a11 = a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(a11).length() + 87);
            sb3.append("The app ");
            sb3.append(a11);
            sb3.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb3.toString());
        }
        neutralButton.create().show();
    }
}
