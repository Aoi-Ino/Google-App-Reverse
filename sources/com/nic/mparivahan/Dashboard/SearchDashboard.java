package com.nic.mparivahan.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.SearchRC;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import ia.l0;
import ni.b8;

public final class SearchDashboard extends d {
    private b8 G;

    /* access modifiers changed from: private */
    public static final void g1(SearchDashboard searchDashboard, View view) {
        l.f(searchDashboard, "this$0");
        searchDashboard.finish();
    }

    public final void h1(String str, String str2) {
        l.f(str, "selection");
        l.f(str2, "value");
        if (str.equals("DL001")) {
            Intent intent = new Intent(this, SearchDL.class);
            intent.putExtra("DLNumber", str2);
            startActivity(intent);
            finish();
        }
        Class<SearchRC> cls = SearchRC.class;
        if (str.equals("INS002")) {
            Intent intent2 = new Intent(this, cls);
            intent2.putExtra("RC_Number", str2);
            intent2.putExtra("RCSERVICE", "INS002");
            finish();
        }
        if (str.equals("PUCC003")) {
            Intent intent3 = new Intent(this, cls);
            intent3.putExtra("RC_Number", str2);
            intent3.putExtra("RCSERVICE", "PUCC003");
            finish();
        }
        if (str.equals("RC001")) {
            new Intent(this, cls).putExtra("RC_Number", str2);
            finish();
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_dashboard);
        b8 c10 = b8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        b8 b8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        Log.e("Text", VContant.DUPLICATE_RC_PURPOSE_CODE);
        if (getIntent() != null) {
            h1(String.valueOf(getIntent().getStringExtra("RCSERVICE")), String.valueOf(getIntent().getStringExtra("Value")));
        }
        b8 b8Var2 = this.G;
        if (b8Var2 == null) {
            l.v("binding");
        } else {
            b8Var = b8Var2;
        }
        b8Var.f25482g.setOnClickListener(new l0(this));
    }
}
