package com.nic.mparivahan.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Checkpost.CheckPostReceiptStatus;
import com.nic.mparivahan.Checkpost.DownloadCheckPostReceipt2;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import ia.a0;
import ia.b0;
import ia.c0;
import ia.d0;
import ia.w;
import ia.x;
import ia.y;
import ia.z;
import ni.lc;

public final class OtherServices extends d {
    private lc G;

    /* access modifiers changed from: private */
    public static final void n1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        otherServices.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, AvailableFancyNumberStatus.class);
        intent.putExtra("ServiceName", "Available Fancy No. Status");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void p1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, AuctionStatusActivity.class);
        intent.putExtra("ServiceName", "Auction Status");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void q1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, FancyFeeReceipt.class);
        intent.putExtra("ServiceName", "View Fancy No. Fee Receipt");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void r1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, AllotmentLetterActivity.class);
        intent.putExtra("ServiceName", "View Allotment Letter");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void s1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, PUCCCertificateDownload.class);
        intent.putExtra("ServiceName", "Download PUC Certificate");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void t1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, CheckPostReceiptStatus.class);
        intent.putExtra("ServiceName", "CheckPost Receipt Status");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void u1(OtherServices otherServices, View view) {
        l.f(otherServices, "this$0");
        Intent intent = new Intent(otherServices, DownloadCheckPostReceipt2.class);
        intent.putExtra("ServiceName", "View CheckPost Tax Receipt");
        otherServices.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lc c10 = lc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        lc lcVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        lc lcVar2 = this.G;
        if (lcVar2 == null) {
            l.v("binding");
            lcVar2 = null;
        }
        lcVar2.f27360h.setOnClickListener(new w(this));
        lc lcVar3 = this.G;
        if (lcVar3 == null) {
            l.v("binding");
            lcVar3 = null;
        }
        lcVar3.f27359g.setOnClickListener(new x(this));
        lc lcVar4 = this.G;
        if (lcVar4 == null) {
            l.v("binding");
            lcVar4 = null;
        }
        lcVar4.f27358f.setOnClickListener(new y(this));
        lc lcVar5 = this.G;
        if (lcVar5 == null) {
            l.v("binding");
            lcVar5 = null;
        }
        lcVar5.f27356d.setOnClickListener(new z(this));
        lc lcVar6 = this.G;
        if (lcVar6 == null) {
            l.v("binding");
            lcVar6 = null;
        }
        lcVar6.f27364l.setOnClickListener(new a0(this));
        lc lcVar7 = this.G;
        if (lcVar7 == null) {
            l.v("binding");
            lcVar7 = null;
        }
        lcVar7.f27362j.setOnClickListener(new b0(this));
        lc lcVar8 = this.G;
        if (lcVar8 == null) {
            l.v("binding");
            lcVar8 = null;
        }
        lcVar8.f27354b.setOnClickListener(new c0(this));
        lc lcVar9 = this.G;
        if (lcVar9 == null) {
            l.v("binding");
        } else {
            lcVar = lcVar9;
        }
        lcVar.f27365m.setOnClickListener(new d0(this));
    }
}
