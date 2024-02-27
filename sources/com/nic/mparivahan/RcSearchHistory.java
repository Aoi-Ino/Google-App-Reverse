package com.nic.mparivahan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.RC.Model.RecentSearch;
import com.nic.mparivahan.RC.SearchRC;
import java.text.ParseException;
import java.util.ArrayList;
import m8.e;
import m8.g;
import m8.h;
import ni.b8;
import v9.f;
import va.i;
import wa.c;
import wc.p0;
import zc.a;

public final class RcSearchHistory extends d implements a, c {
    private b8 G;
    public DatabaseHelper H;
    public ArrayList I;
    public ld.c J;
    private int K = 1;

    /* access modifiers changed from: private */
    public static final void p1(RcSearchHistory rcSearchHistory, View view) {
        l.f(rcSearchHistory, "this$0");
        if (rcSearchHistory.K == 1) {
            rcSearchHistory.r1(rcSearchHistory);
        } else {
            rcSearchHistory.u1(rcSearchHistory);
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(RcSearchHistory rcSearchHistory, View view) {
        l.f(rcSearchHistory, "this$0");
        rcSearchHistory.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, RcSearchHistory rcSearchHistory, View view) {
        l.f(dialog, "$d");
        l.f(rcSearchHistory, "this$0");
        dialog.dismiss();
        if (rcSearchHistory.l1().F0("RC") != null) {
            ArrayList F0 = rcSearchHistory.l1().F0("RC");
            l.e(F0, "getRecentSearch(...)");
            rcSearchHistory.A1(F0);
            b8 b8Var = null;
            if (rcSearchHistory.m1() != null || !rcSearchHistory.m1().isEmpty()) {
                int size = rcSearchHistory.m1().size();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        rcSearchHistory.l1().Y(((RecentSearch) rcSearchHistory.m1().get(i10)).getSearchNumber(), "RC");
                        b8 b8Var2 = rcSearchHistory.G;
                        if (b8Var2 == null) {
                            l.v("binding");
                            b8Var2 = null;
                        }
                        b8Var2.f25477b.setVisibility(8);
                        rcSearchHistory.o1();
                    } catch (Exception unused) {
                    }
                }
                rcSearchHistory.m1().clear();
            }
            b8 b8Var3 = rcSearchHistory.G;
            if (b8Var3 == null) {
                l.v("binding");
            } else {
                b8Var = b8Var3;
            }
            b8Var.f25485j.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(Dialog dialog, RcSearchHistory rcSearchHistory, View view) {
        l.f(dialog, "$d");
        l.f(rcSearchHistory, "this$0");
        dialog.dismiss();
        if (rcSearchHistory.l1().F0("DL") != null) {
            ArrayList F0 = rcSearchHistory.l1().F0("DL");
            l.e(F0, "getRecentSearch(...)");
            rcSearchHistory.A1(F0);
            b8 b8Var = null;
            if (rcSearchHistory.m1() != null || !rcSearchHistory.m1().isEmpty()) {
                int size = rcSearchHistory.m1().size();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        rcSearchHistory.l1().Y(((RecentSearch) rcSearchHistory.m1().get(i10)).getSearchNumber(), "DL");
                        b8 b8Var2 = rcSearchHistory.G;
                        if (b8Var2 == null) {
                            l.v("binding");
                            b8Var2 = null;
                        }
                        b8Var2.f25477b.setVisibility(8);
                        rcSearchHistory.o1();
                    } catch (Exception unused) {
                    }
                }
                rcSearchHistory.m1().clear();
            }
            b8 b8Var3 = rcSearchHistory.G;
            if (b8Var3 == null) {
                l.v("binding");
            } else {
                b8Var = b8Var3;
            }
            b8Var.f25478c.setVisibility(8);
        }
    }

    public final void A1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.I = arrayList;
    }

    public final void B1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public void G(String str) {
        try {
            l1().B(str);
            x1();
        } catch (Exception unused) {
        }
    }

    public void K(String str) {
        if (str != null && str.length() != 0) {
            if (a.f9624a.a(this)) {
                Intent intent = new Intent(this, SearchRC.class);
                intent.putExtra("RC_Number", str);
                startActivity(intent);
                return;
            }
            Toast.makeText(this, getString(R.string.kindly_check_your_internet_connection), 0).show();
        }
    }

    public final DatabaseHelper l1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final ArrayList m1() {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("recentSearchList");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final void o1() {
        TextView textView;
        ld.c n12;
        String N;
        try {
            b8 b8Var = this.G;
            b8 b8Var2 = null;
            if (b8Var == null) {
                l.v("binding");
                b8Var = null;
            }
            b8Var.f25488m.setVisibility(0);
            int i10 = this.K;
            if (i10 == 1) {
                b8 b8Var3 = this.G;
                if (b8Var3 == null) {
                    l.v("binding");
                    b8Var3 = null;
                }
                TextView textView2 = b8Var3.f25484i;
                ld.c n13 = n1();
                f.a aVar = f.f17510a;
                textView2.setText(n13.b(aVar.R(), "There is no Search(s) History \nfound for your account."));
                b8 b8Var4 = this.G;
                if (b8Var4 == null) {
                    l.v("binding");
                } else {
                    b8Var2 = b8Var4;
                }
                textView = b8Var2.f25481f;
                n12 = n1();
                N = aVar.N();
            } else if (i10 == 2) {
                b8 b8Var5 = this.G;
                if (b8Var5 == null) {
                    l.v("binding");
                    b8Var5 = null;
                }
                TextView textView3 = b8Var5.f25484i;
                ld.c n14 = n1();
                f.a aVar2 = f.f17510a;
                textView3.setText(n14.b(aVar2.R(), "There is no Search(s) History \nfound for your account."));
                b8 b8Var6 = this.G;
                if (b8Var6 == null) {
                    l.v("binding");
                } else {
                    b8Var2 = b8Var6;
                }
                textView = b8Var2.f25481f;
                n12 = n1();
                N = aVar2.N();
            } else {
                return;
            }
            textView.setText(n12.b(N, "No History Found."));
        } catch (Exception unused) {
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
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        y1(A0);
        B1(new ld.c(this));
        b8 b8Var2 = this.G;
        if (b8Var2 == null) {
            l.v("binding");
            b8Var2 = null;
        }
        b8Var2.f25477b.setText(n1().b("clear_all", "Clear All"));
        try {
            int intExtra = getIntent().getIntExtra("RC", 0);
            this.K = intExtra;
            if (intExtra == 1) {
                b8 b8Var3 = this.G;
                if (b8Var3 == null) {
                    l.v("binding");
                    b8Var3 = null;
                }
                b8Var3.f25480e.setText(n1().b("Vehicle_Search_History", "Vehicle Search History"));
                z1();
            } else {
                b8 b8Var4 = this.G;
                if (b8Var4 == null) {
                    l.v("binding");
                    b8Var4 = null;
                }
                b8Var4.f25480e.setText(n1().b("Driving_Licence_Search_History", "Driving Licence Search History"));
                x1();
            }
            b8 b8Var5 = this.G;
            if (b8Var5 == null) {
                l.v("binding");
                b8Var5 = null;
            }
            b8Var5.f25477b.setOnClickListener(new m8.c(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        b8 b8Var6 = this.G;
        if (b8Var6 == null) {
            l.v("binding");
        } else {
            b8Var = b8Var6;
        }
        b8Var.f25482g.setOnClickListener(new m8.d(this));
    }

    public final void r1(Context context) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.cancle);
        l.d(findViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView = (MyTextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.ok_dlt);
        l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView2 = (MyTextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_msg);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n1().b("clear_all_history", "Are you sure you want to delete all the search history ?"));
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(n1().b("nex_parivahan", "NextGen mParivahan"));
        myTextView2.setText(n1().b("btn_ok", "OK"));
        myTextView.setText(n1().b("button_cancel", "Cancel"));
        myTextView.setOnClickListener(new e(dialog));
        myTextView2.setOnClickListener(new m8.f(dialog, this));
        dialog.show();
    }

    public void s(String str) {
        if (a.f9624a.a(this)) {
            Intent intent = new Intent(this, SearchDL.class);
            intent.putExtra("DLNumber", str);
            startActivity(intent);
            return;
        }
        Toast.makeText(this, getString(R.string.kindly_check_your_internet_connection), 0).show();
    }

    public final void u1(Context context) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.cancle);
        l.d(findViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View findViewById2 = dialog.findViewById(R.id.ok_dlt);
        l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_msg);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        ((MyTextView) findViewById).setOnClickListener(new g(dialog));
        ((MyTextView) findViewById2).setOnClickListener(new h(dialog, this));
        dialog.show();
    }

    public void w(String str) {
        try {
            l1().B(str);
            z1();
        } catch (Exception unused) {
        }
    }

    public final void x1() {
        try {
            b8 b8Var = null;
            if (l1().F0("DL") != null) {
                b8 b8Var2 = this.G;
                if (b8Var2 == null) {
                    l.v("binding");
                    b8Var2 = null;
                }
                b8Var2.f25478c.setVisibility(0);
                b8 b8Var3 = this.G;
                if (b8Var3 == null) {
                    l.v("binding");
                    b8Var3 = null;
                }
                b8Var3.f25485j.setVisibility(8);
                b8 b8Var4 = this.G;
                if (b8Var4 == null) {
                    l.v("binding");
                    b8Var4 = null;
                }
                b8Var4.f25488m.setVisibility(8);
                ArrayList F0 = l1().F0("DL");
                l.e(F0, "getRecentSearch(...)");
                A1(F0);
                if (m1() != null) {
                    b8 b8Var5 = this.G;
                    if (b8Var5 == null) {
                        l.v("binding");
                        b8Var5 = null;
                    }
                    b8Var5.f25477b.setVisibility(0);
                    b8 b8Var6 = this.G;
                    if (b8Var6 == null) {
                        l.v("binding");
                        b8Var6 = null;
                    }
                    b8Var6.f25486k.setLayoutManager(new LinearLayoutManager(this));
                    i iVar = new i(this, m1(), this);
                    b8 b8Var7 = this.G;
                    if (b8Var7 == null) {
                        l.v("binding");
                    } else {
                        b8Var = b8Var7;
                    }
                    b8Var.f25486k.setAdapter(iVar);
                    iVar.j();
                    return;
                }
                return;
            }
            b8 b8Var8 = this.G;
            if (b8Var8 == null) {
                l.v("binding");
                b8Var8 = null;
            }
            b8Var8.f25478c.setVisibility(8);
            b8 b8Var9 = this.G;
            if (b8Var9 == null) {
                l.v("binding");
                b8Var9 = null;
            }
            b8Var9.f25485j.setVisibility(8);
            b8 b8Var10 = this.G;
            if (b8Var10 == null) {
                l.v("binding");
            } else {
                b8Var = b8Var10;
            }
            b8Var.f25477b.setVisibility(8);
            o1();
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    public final void y1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void z1() {
        try {
            DatabaseHelper A0 = DatabaseHelper.A0(this);
            l.e(A0, "getInstance(...)");
            y1(A0);
            b8 b8Var = null;
            if (l1().F0("RC") != null) {
                b8 b8Var2 = this.G;
                if (b8Var2 == null) {
                    l.v("binding");
                    b8Var2 = null;
                }
                b8Var2.f25485j.setVisibility(0);
                b8 b8Var3 = this.G;
                if (b8Var3 == null) {
                    l.v("binding");
                    b8Var3 = null;
                }
                b8Var3.f25478c.setVisibility(8);
                b8 b8Var4 = this.G;
                if (b8Var4 == null) {
                    l.v("binding");
                    b8Var4 = null;
                }
                b8Var4.f25477b.setVisibility(0);
                b8 b8Var5 = this.G;
                if (b8Var5 == null) {
                    l.v("binding");
                    b8Var5 = null;
                }
                b8Var5.f25488m.setVisibility(8);
                ArrayList F0 = l1().F0("RC");
                l.e(F0, "getRecentSearch(...)");
                A1(F0);
                if (m1() != null) {
                    b8 b8Var6 = this.G;
                    if (b8Var6 == null) {
                        l.v("binding");
                        b8Var6 = null;
                    }
                    b8Var6.f25477b.setVisibility(0);
                    b8 b8Var7 = this.G;
                    if (b8Var7 == null) {
                        l.v("binding");
                        b8Var7 = null;
                    }
                    b8Var7.f25487l.setLayoutManager(new LinearLayoutManager(this));
                    p0 p0Var = new p0(this, m1(), this);
                    b8 b8Var8 = this.G;
                    if (b8Var8 == null) {
                        l.v("binding");
                    } else {
                        b8Var = b8Var8;
                    }
                    b8Var.f25487l.setAdapter(p0Var);
                    return;
                }
                return;
            }
            o1();
            b8 b8Var9 = this.G;
            if (b8Var9 == null) {
                l.v("binding");
                b8Var9 = null;
            }
            b8Var9.f25485j.setVisibility(8);
            b8 b8Var10 = this.G;
            if (b8Var10 == null) {
                l.v("binding");
                b8Var10 = null;
            }
            b8Var10.f25478c.setVisibility(8);
            b8 b8Var11 = this.G;
            if (b8Var11 == null) {
                l.v("binding");
            } else {
                b8Var = b8Var11;
            }
            b8Var.f25477b.setVisibility(8);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }
}
