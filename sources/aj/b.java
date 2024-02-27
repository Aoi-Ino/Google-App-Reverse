package aj;

import a8.f;
import a8.s;
import a8.t;
import a8.u;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import e8.c;
import e8.c2;
import e8.j;
import java.io.File;
import java.io.FileOutputStream;

public class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    Context f19320a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f19321b;

    public b(Context context) {
        this.f19320a = context;
    }

    private String c(Context context, String str, ResultItemSubmit resultItemSubmit) {
        f fVar = new f(s.f334k, 50.0f, 50.0f, 50.0f, 50.0f);
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/mParivahan_doc";
            File file = new File(str2, "AcknowledgementSlip");
            if (!file.exists() && !file.mkdirs()) {
                Log.d("PDF_SUMMARY", "Failed to create directory!");
            }
            String str3 = file.getPath() + "/" + str + ".pdf";
            Log.e("PDF_DIR_PATH", file.getPath());
            File file2 = new File(str2, "FONTS");
            if (!file2.exists() && !file2.mkdirs()) {
                Log.d("mparivahan", "Failed to create font directory");
            }
            String str4 = file2.getPath() + "/number.ttf";
            Log.v("FONT_PATH", str4);
            c.c(new File(str4), context);
            c g10 = d.g(str4, "Identity-H", false);
            c2 D = c2.D(fVar, new FileOutputStream(str3));
            fVar.a();
            fVar.f("NIC");
            fVar.g();
            t tVar = new t((u) new t(c.b(), d.h(g10, 8.0f, 0, new j(0, 0, 0, 255))));
            tVar.A0(0);
            fVar.b(tVar);
            fVar.k("Acknowledgement Slip");
            fVar.j("Acknowledgement Slip");
            t tVar2 = new t((u) new t("Acknowledgement Slip", d.h(g10, 14.0f, 1, new j(0, 0, 0, 255))));
            tVar2.A0(1);
            fVar.b(tVar2);
            fVar.b(new t("\n"));
            fVar.b(d.f(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 0, new j(0, 0, 0, 255)), false));
            fVar.b(d.d("Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 1, new j(0, 0, 0, 255)), true));
            fVar.b(d.e(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 1, new j(0, 0, 0, 255)), true));
            fVar.b(d.c(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 1, new j(0, 0, 0, 255)), true));
            t tVar3 = new t((u) new t(resultItemSubmit.getReferenceLink(), d.h(g10, 8.0f, 1, new j(0, 0, 0, 255))));
            tVar3.A0(1);
            fVar.b(tVar3);
            fVar.b(new t("\n"));
            fVar.b(d.a("Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 1, new j(0, 0, 0, 255)), false));
            fVar.b(d.b(resultItemSubmit, "Transaction No :", "result", "Receipt", "result.getReceiptNumber()", d.h(g10, 8.0f, 1, new j(0, 0, 0, 255)), false));
            fVar.close();
            D.close();
            Log.e("Tag-123", str3);
            return str3;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Dialog dialog, Context context, String str, View view) {
        dialog.dismiss();
        f(context, str);
    }

    private void f(Context context, String str) {
        Uri g10 = FileProvider.g(context, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/mParivahan_DOC/AcknowledgementSlip/" + str + ".pdf"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(g10);
        Log.e("create pdf uri path==>", sb2.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, "No Application available to view pdf", 1).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String doInBackground(ResultItemSubmit... resultItemSubmitArr) {
        ResultItemSubmit resultItemSubmit = resultItemSubmitArr[0];
        c(this.f19320a, resultItemSubmit.getApplicationNo(), resultItemSubmit);
        if (!TextUtils.isEmpty(resultItemSubmit.getApplicationNo())) {
            return resultItemSubmit.getApplicationNo();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        ProgressDialog progressDialog = this.f19321b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (!TextUtils.isEmpty(str)) {
            g(this.f19320a, "Acknowledgement slip successfully saved in storage", str);
        }
    }

    public void g(Context context, String str, String str2) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validation_diloge);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        ((TextView) dialog.findViewById(R.id.text2)).setText(str);
        ((TextView) dialog.findViewById(R.id.f19013ok)).setOnClickListener(new a(this, dialog, context, str2));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        ProgressDialog progressDialog = new ProgressDialog(this.f19320a);
        this.f19321b = progressDialog;
        progressDialog.setMessage("Please wait..");
        this.f19321b.setCancelable(true);
        this.f19321b.setProgressStyle(0);
        this.f19321b.show();
    }
}
