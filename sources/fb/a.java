package fb;

import android.content.Context;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import ld.c;
import ni.a8;
import ni.b7;
import ni.d8;
import ni.e8;
import ni.j4;
import ni.k9;
import ni.pa;
import ni.qa;
import ni.v9;
import ni.vc;
import ni.wc;
import ni.y7;
import ni.z7;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0148a f11584a = new C0148a((g) null);

    /* renamed from: fb.a$a  reason: collision with other inner class name */
    public static final class C0148a {
        private C0148a() {
        }

        public /* synthetic */ C0148a(g gVar) {
            this();
        }

        public final void a(Context context, b7 b7Var) {
            l.f(context, "context");
            l.f(b7Var, "binding");
            try {
                c cVar = new c(context);
                b7Var.E.f28308i.setText(cVar.b("label_challan_payment_search", context.getString(R.string.online_challan_payment)));
                b7Var.f25467r.setText(cVar.b("logo_challan_payment", context.getString(R.string.payment)));
                b7Var.f25457h.setText(cVar.b("logo_challan_details", context.getString(R.string.challan_details)));
                b7Var.f25475z.setText(cVar.b("logo_challan_receipt", context.getString(R.string.receipt)));
                b7Var.f25456g.setText(cVar.b("label_challan_detail", context.getString(R.string.challan_details_)));
                b7Var.f25464o.setText(cVar.b("label_challan_owner_name", context.getString(R.string.owner_name)));
                b7Var.f25462m.setText(cVar.b("label_challan_dl_rc_number", context.getString(R.string.dl_rc_number)));
                b7Var.B.setText(cVar.b("label_challan_state", context.getString(R.string.state)));
                b7Var.f25460k.setText(cVar.b("label_challan_no", context.getString(R.string.challan_no)));
                b7Var.f25454e.setText(cVar.b("label_challan_date", context.getString(R.string.challan_date)));
                b7Var.f25451b.setText(cVar.b("label_challan_amount", context.getString(R.string.amount)));
                b7Var.f25471v.setText(cVar.b("label_challan_payment_status", context.getString(R.string.payment_Status)));
                b7Var.f25466q.setText(cVar.b("label_challan_pay_now", context.getString(R.string.pay_now)));
                b7Var.f25459j.setText(cVar.b("label_challan_download", context.getString(R.string.challan_print)));
                b7Var.A.setText(cVar.b("label_challan_download_receipt", "Download Payment Receipt"));
                b7Var.f25458i.setText(cVar.b("label_challan_download", context.getString(R.string.challan_print)));
                b7Var.f25469t.setText(cVar.b("paymentDate", context.getString(R.string.payment_date)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void b(Context context, z7 z7Var) {
            l.f(context, "context");
            l.f(z7Var, "binding");
            try {
                c cVar = new c(context);
                z7Var.f29710l.setText(cVar.b("label_challan_payment_search", context.getString(R.string.online_challan_payment)));
                z7Var.f29705g.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                z7Var.f29708j.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                z7Var.f29700b.setText(cVar.b("label_challan_all", context.getString(R.string.all)));
                z7Var.f29706h.setText(cVar.b("label_challan_pending", context.getString(R.string.pending_1)));
                z7Var.f29702d.setText(cVar.b("label_challan_disposed", context.getString(R.string.dispose)));
                z7Var.f29712n.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                z7Var.f29704f.setText(cVar.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void c(Context context, y7 y7Var) {
            l.f(context, "context");
            l.f(y7Var, "binding");
            try {
                c cVar = new c(context);
                y7Var.E.f28308i.setText(cVar.b("label_challan_payment_search", context.getString(R.string.online_challan_payment)));
                y7Var.f29496r.setText(cVar.b("label_pay_your_challan", context.getString(R.string.pay_your_challan)));
                y7Var.f29493o.setText(cVar.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                y7Var.L.setText(cVar.b("label_challan_dl_no", "Driving Licence No"));
                y7Var.G.setText(cVar.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                y7Var.B.setText(cVar.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
                y7Var.f29497s.setText(cVar.b("logo_challan_payment", context.getString(R.string.payment)));
                y7Var.f29481c.setText(cVar.b("logo_challan_details", context.getString(R.string.challan_details)));
                y7Var.f29502x.setText(cVar.b("logo_challan_receipt", context.getString(R.string.receipt)));
                y7Var.f29480b.setText(cVar.b("label_challan_detail", context.getString(R.string.challan_details_)));
                y7Var.f29483e.setText(cVar.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                y7Var.O.setText(cVar.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                y7Var.f29485g.setText(cVar.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                y7Var.K.setText(cVar.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                y7Var.f29493o.setText(cVar.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                y7Var.P.setText(cVar.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                y7Var.f29491m.setHint(cVar.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                y7Var.I.setText(cVar.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                y7Var.f29484f.setHint(cVar.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                y7Var.J.setText(cVar.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                y7Var.f29488j.setHint(cVar.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                y7Var.f29489k.setText(cVar.b("label_challan_get_details", context.getString(R.string.get_details)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void d(Context context, pa paVar) {
            l.f(context, "context");
            l.f(paVar, "binding");
            try {
                c cVar = new c(context);
                paVar.f28010g.setText(cVar.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
                paVar.f28006c.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                paVar.f28009f.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                paVar.f28012i.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                paVar.f28005b.setText(cVar.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void e(Context context, v9 v9Var) {
            l.f(context, "context");
            l.f(v9Var, "binding");
            try {
                c cVar = new c(context);
                v9Var.f29049h.setText(cVar.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                v9Var.f29046e.setText(cVar.b("label_challan_no", context.getString(R.string.challan_num)));
                v9Var.f29043b.setText(cVar.b("label_challan_amount", context.getString(R.string.amount)));
                v9Var.f29051j.setText(cVar.b("label_challan_vehicle_no", context.getString(R.string.vehicle_number)));
                v9Var.f29045d.setText(cVar.b("label_challan_reprint_receipt", context.getString(R.string.reprint_receipt)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void f(Context context, vc vcVar) {
            l.f(context, "context");
            l.f(vcVar, "binding");
            try {
                c cVar = new c(context);
                vcVar.f29087y.f28308i.setText(cVar.b("label_challan_status", context.getString(R.string.challan1)));
                vcVar.f29077o.setText(cVar.b("logo_challan_payment", context.getString(R.string.payment)));
                vcVar.f29069g.setText(cVar.b("logo_challan_details", context.getString(R.string.challan_details)));
                vcVar.f29083u.setText(cVar.b("logo_challan_receipt", context.getString(R.string.receipt)));
                vcVar.f29068f.setText(cVar.b("label_challan_detail", context.getString(R.string.challan_details_)));
                vcVar.f29075m.setText(cVar.b("label_challan_owner_name", context.getString(R.string.owner_name)));
                vcVar.f29073k.setText(cVar.b("label_challan_dl_rc_number", context.getString(R.string.dl_rc_number)));
                vcVar.f29084v.setText(cVar.b("label_challan_state", context.getString(R.string.state)));
                vcVar.f29071i.setText(cVar.b("label_challan_no", context.getString(R.string.challan_no)));
                vcVar.f29066d.setText(cVar.b("label_challan_date", context.getString(R.string.challan_date)));
                vcVar.f29064b.setText(cVar.b("label_challan_amount", context.getString(R.string.amount)));
                vcVar.f29079q.setText(cVar.b("label_challan_payment_status", context.getString(R.string.payment_Status)));
                vcVar.f29070h.setText(cVar.b("label_challan_download", context.getString(R.string.challan_print)));
                vcVar.f29078p.setText(cVar.b("label_challan_download_receipt", "Download Payment Receipt"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void g(Context context, a8 a8Var) {
            l.f(context, "context");
            l.f(a8Var, "binding");
            try {
                c cVar = new c(context);
                a8Var.f25236q.f28308i.setText(cVar.b("label_challan_status", context.getString(R.string.challan_status)));
                a8Var.f25222c.setText(cVar.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                a8Var.f25243x.setText(cVar.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                a8Var.f25224e.setText(cVar.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                a8Var.f25239t.setText(cVar.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                a8Var.f25232m.setText(cVar.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                a8Var.f25244y.setText(cVar.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                a8Var.f25230k.setHint(cVar.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                a8Var.f25237r.setText(cVar.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                a8Var.f25223d.setHint(cVar.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                a8Var.f25238s.setText(cVar.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                a8Var.f25227h.setHint(cVar.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                a8Var.f25228i.setText(cVar.b("label_challan_get_details", context.getString(R.string.get_details)));
                a8Var.f25240u.setText(cVar.b("label_challan_dl_no", "Driving Licence No"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void h(Context context, wc wcVar) {
            l.f(context, "context");
            l.f(wcVar, "binding");
            try {
                c cVar = new c(context);
                wcVar.f29243m.f28308i.setText(cVar.b("label_challan_status", context.getString(R.string.challan1)));
                wcVar.f29237g.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                wcVar.f29240j.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                wcVar.f29232b.setText(cVar.b("label_challan_all", context.getString(R.string.all)));
                wcVar.f29238h.setText(cVar.b("label_challan_pending", context.getString(R.string.pending_1)));
                wcVar.f29234d.setText(cVar.b("label_challan_disposed", context.getString(R.string.dispose)));
                wcVar.f29244n.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                wcVar.f29236f.setText(cVar.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void i(Context context, e8 e8Var) {
            l.f(context, "context");
            l.f(e8Var, "binding");
            try {
                c cVar = new c(context);
                e8Var.f26094i.f28308i.setText(cVar.b("label_challan_print_receipt", context.getString(R.string.print_receipt)));
                e8Var.f26090e.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                e8Var.f26092g.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                e8Var.f26095j.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                e8Var.f26089d.setText(cVar.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void j(Context context, d8 d8Var) {
            l.f(context, "context");
            l.f(d8Var, "binding");
            try {
                c cVar = new c(context);
                d8Var.f25888j.f28308i.setText(cVar.b("label_challan_print_receipt", context.getString(R.string.print_receipt)));
                d8Var.f25881c.setText(cVar.b("label_challan_number", context.getString(R.string.echallan_challan_number)));
                d8Var.f25902x.setText(cVar.b("label_challan_vehicle_number", context.getString(R.string.echallan_vehicle_number)));
                d8Var.f25883e.setText(cVar.b("label_challan_dl_number", context.getString(R.string.echallan_driving_licence_number)));
                d8Var.f25898t.setText(cVar.b("label_challan_my_vehicle_no", "My Vehicle(s)"));
                d8Var.f25892n.setText(cVar.b("label_challan_my_dl_number", context.getString(R.string.my_driving_license)));
                d8Var.f25903y.setText(cVar.b("label_view_challan", context.getString(R.string.show_recent_challan)));
                d8Var.f25890l.setHint(cVar.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
                d8Var.f25896r.setText(cVar.b("label_challan_chassis_no", "Chassis No. (Enter last five digits)"));
                d8Var.f25882d.setHint(cVar.b("label_challan_enter_chassis_no", context.getString(R.string.echallan_enter_chassis_number)));
                d8Var.f25897s.setText(cVar.b("label_challan_engine_no", "Engine No. (Enter last five digits)"));
                d8Var.f25886h.setHint(cVar.b("label_challan_enter_engine_no", context.getString(R.string.echallan_enter_engine_number)));
                d8Var.f25887i.setText(cVar.b("label_challan_get_details", context.getString(R.string.get_details)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void k(Context context, qa qaVar) {
            l.f(context, "context");
            l.f(qaVar, "binding");
            try {
                c cVar = new c(context);
                qaVar.f28273f.setText(cVar.b("label_challan_transaction_status", context.getString(R.string.transaction_status)));
                qaVar.f28270c.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                qaVar.f28272e.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                qaVar.f28275h.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                qaVar.f28269b.setText(cVar.b("label_challan_not_found", context.getString(R.string.no_challan_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void l(Context context, k9 k9Var) {
            l.f(context, "context");
            l.f(k9Var, "binding");
            try {
                c cVar = new c(context);
                k9Var.f27130h.f28308i.setText(cVar.b("label_challan_verify_payment_status", context.getString(R.string.verify_challan_payment)));
                k9Var.f27126d.setHint(cVar.b("label_challan_enter_dl_get_details", context.getString(R.string.enter_any_dl_no)));
                k9Var.f27128f.setText(cVar.b("label_challan_search", context.getString(R.string.search)));
                k9Var.f27131i.setText(cVar.b("label_challan_total", context.getString(R.string.total_challan)));
                k9Var.f27125c.setText(cVar.b("label_challan_no_payment_trans_pending", context.getString(R.string.no_transcation_found)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void m(Context context, j4 j4Var) {
            l.f(context, "context");
            l.f(j4Var, "binding");
            try {
                c cVar = new c(context);
                j4Var.f26950s.setText(cVar.b("label_challan_send_to_court", "Send To Court Data"));
                j4Var.A.setText(cVar.b("label_challan_no", context.getString(R.string.challan_no)));
                j4Var.f26956y.setText(cVar.b("label_challan_amount", context.getString(R.string.amount)));
                j4Var.F.setText(cVar.b("label_challan_court_name", "Court Name"));
                j4Var.E.setText(cVar.b("label_challan_court_add", "Court Address"));
                j4Var.O.setText(cVar.b("label_challan_send_to_court_on", "Send To Court On"));
                j4Var.S.setText(cVar.b("label_challan_virtual_court_link", context.getString(R.string.virtual_court_link)));
                j4Var.P.setText(cVar.b("label_challan_status_from_court", "Status from virtual court"));
                j4Var.N.setText(cVar.b("label_challan_proceeding_data", "Proceeding Data"));
                j4Var.I.setText(cVar.b("label_challan_proceeding_date", "Date of Proceeding"));
                j4Var.K.setText(cVar.b("label_challan_fine_imposed", "Fine Imposed"));
                j4Var.M.setText(cVar.b("label_challan_party_name", "Party Name"));
                j4Var.C.setText(cVar.b("label_challan_contested_data", "Contested Data"));
                j4Var.f26957z.setText(cVar.b("label_challan_case_no", "Case No"));
                j4Var.D.setText(cVar.b("label_challan_court_name", "Court Name"));
                j4Var.J.setText(cVar.b("label_challan_fine_imposed", "Fine Imposed"));
                j4Var.R.setText(cVar.b("label_challan_transfer_to_regular_court", "Transferred to Regular Court Data"));
                j4Var.G.setText(cVar.b("label_challan_court_name", "Court Name"));
                j4Var.B.setText(cVar.b("label_challan_ci_no", "CI Number"));
                j4Var.Q.setText(cVar.b("label_challan_transfer_to_regular_court", "Transferred to Regular Court Data"));
                j4Var.H.setText(cVar.b("label_challan_court_number", "Court Number"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
