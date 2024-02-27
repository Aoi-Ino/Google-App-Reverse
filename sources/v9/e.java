package v9;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import ld.c;
import ni.a1;
import ni.a4;
import ni.a5;
import ni.a6;
import ni.a9;
import ni.ab;
import ni.ac;
import ni.ad;
import ni.ae;
import ni.b0;
import ni.b3;
import ni.b4;
import ni.b9;
import ni.ba;
import ni.bc;
import ni.bd;
import ni.c2;
import ni.c5;
import ni.c8;
import ni.c9;
import ni.ca;
import ni.cb;
import ni.cc;
import ni.ce;
import ni.d;
import ni.d0;
import ni.d3;
import ni.d4;
import ni.d6;
import ni.d9;
import ni.db;
import ni.de;
import ni.e1;
import ni.e2;
import ni.e9;
import ni.eb;
import ni.ec;
import ni.f0;
import ni.f3;
import ni.f4;
import ni.f5;
import ni.f6;
import ni.f8;
import ni.f9;
import ni.fc;
import ni.fd;
import ni.g0;
import ni.g1;
import ni.g5;
import ni.g6;
import ni.g9;
import ni.gc;
import ni.h;
import ni.h0;
import ni.h3;
import ni.h4;
import ni.h6;
import ni.h9;
import ni.ha;
import ni.hc;
import ni.i;
import ni.i0;
import ni.i1;
import ni.i5;
import ni.i7;
import ni.ib;
import ni.ic;
import ni.j;
import ni.j0;
import ni.j1;
import ni.j2;
import ni.j6;
import ni.j7;
import ni.j8;
import ni.jc;
import ni.jd;
import ni.k;
import ni.k0;
import ni.k4;
import ni.k5;
import ni.k7;
import ni.k8;
import ni.ka;
import ni.kc;
import ni.kd;
import ni.l0;
import ni.l2;
import ni.l4;
import ni.l6;
import ni.l7;
import ni.l8;
import ni.l9;
import ni.la;
import ni.ld;
import ni.m;
import ni.m1;
import ni.m5;
import ni.md;
import ni.n0;
import ni.n1;
import ni.n4;
import ni.n6;
import ni.n7;
import ni.n9;
import ni.o;
import ni.o1;
import ni.o5;
import ni.o7;
import ni.o8;
import ni.o9;
import ni.oa;
import ni.ob;
import ni.p;
import ni.p2;
import ni.p3;
import ni.p4;
import ni.p6;
import ni.p7;
import ni.p8;
import ni.p9;
import ni.pc;
import ni.pd;
import ni.q;
import ni.q1;
import ni.q5;
import ni.q6;
import ni.q7;
import ni.q8;
import ni.q9;
import ni.qb;
import ni.qc;
import ni.r;
import ni.r2;
import ni.r3;
import ni.r4;
import ni.ra;
import ni.rd;
import ni.s;
import ni.s4;
import ni.s6;
import ni.s9;
import ni.sd;
import ni.t;
import ni.t1;
import ni.t4;
import ni.t7;
import ni.t8;
import ni.td;
import ni.u;
import ni.u6;
import ni.uc;
import ni.ud;
import ni.v;
import ni.v2;
import ni.v3;
import ni.v7;
import ni.v8;
import ni.va;
import ni.vd;
import ni.w1;
import ni.w4;
import ni.w8;
import ni.x;
import ni.x0;
import ni.x3;
import ni.x5;
import ni.x7;
import ni.x8;
import ni.x9;
import ni.xc;
import ni.xd;
import ni.y1;
import ni.y3;
import ni.y8;
import ni.y9;
import ni.yc;
import ni.yd;
import ni.z;
import ni.z0;
import ni.z2;
import ni.z3;
import ni.z5;
import ni.z8;
import ni.zb;
import ni.zc;
import v9.f;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17509a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void A(Context context, i iVar) {
            l.f(context, "context");
            l.f(iVar, "binding");
            c cVar = new c(context);
            iVar.T.setText(cVar.b("fancyNo_RegnNo", context.getString(R.string.reg_no)));
            iVar.f26734d.setText(cVar.b("fancyNo_AckNo", context.getString(R.string.acknowlegement_no)));
            iVar.E.setText(cVar.b("cp_receipt_number", context.getString(R.string.receipt_no)));
            iVar.f26755y.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            iVar.f26748r.setText(cVar.b("fancyNo_fatherName", context.getString(R.string.father_name)));
            iVar.f26752v.setText(cVar.b("label_dl_serv_mob_no", context.getString(R.string.mobile_no)));
            iVar.f26737g.setText(cVar.b("address", context.getString(R.string.address_l)));
            iVar.B.setText(cVar.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            iVar.O.setText(cVar.b("label_challan_state", context.getString(R.string.state)));
            iVar.L.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            iVar.I.setText(cVar.b("fancyNo_ReserveEmdPrice", context.getString(R.string.reserve_emd_price)));
            iVar.f26743m.setText(cVar.b("fancyNo_finalAuctionPrice", context.getString(R.string.final_auction_price)));
            iVar.f26746p.setText(cVar.b("fancyNo_BookingDate", context.getString(R.string.booking_date)));
            iVar.f26740j.setText(cVar.b("fancyNo_AllotmentType", context.getString(R.string.allotment_type)));
            iVar.R.setText(cVar.b("btn_challan_status", context.getString(R.string.status)));
        }

        public final void A0(Context context, x3 x3Var) {
            l.f(context, "context");
            l.f(x3Var, "binding");
            c cVar = new c(context);
            x3Var.f29293c.setText(cVar.b("cp_for_state", context.getString(R.string.for_state)));
            x3Var.f29298h.setText(cVar.b("fancyNo_SelectStateName", context.getString(R.string.select_state_name)));
            x3Var.f29302l.setText(cVar.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            x3Var.f29301k.setHint(cVar.b("label_challan_enter_vehicle_no", context.getString(R.string.enter_vehicle_number)));
            x3Var.f29296f.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            x3Var.f29294d.setText(cVar.b("vahan_get_details", context.getString(R.string.get_details)));
        }

        public final void A1(Context context, r3 r3Var) {
            l.f(context, "context");
            l.f(r3Var, "ps");
            c cVar = new c(context);
            r3Var.T.f27475c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            r3Var.T.f27476d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            r3Var.T.f27479g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            r3Var.T.f27477e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            r3Var.T.f27474b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            r3Var.f28369z0.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            r3Var.f28341b0.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            r3Var.f28352m0.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            r3Var.f28353n0.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            r3Var.f28351l0.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            r3Var.f28356q0.setText(cVar.b("label_name", context.getString(R.string.application_date)));
            r3Var.U.setText(cVar.b("label_sdf", context.getString(R.string.sdo_of)));
            r3Var.f28354o0.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            r3Var.f28363w0.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            r3Var.f28355p0.setText(cVar.b("label_Instructions", context.getString(R.string.instructions)));
            r3Var.f28357r0.setText(cVar.b("label_instructions_one", context.getString(R.string.step1)));
            r3Var.f28359t0.setText(cVar.b("label_instructions_three", context.getString(R.string.step3)));
            r3Var.f28360u0.setText(cVar.b("label_instructions_two", context.getString(R.string.step2)));
            r3Var.f28365x0.setText(cVar.b("label_spec_ps", context.getString(R.string.spec_ps)));
            r3Var.f28358s0.setText(cVar.b("label_photo_dimensions", context.getString(R.string.val_one)));
            r3Var.f28361v0.setText(cVar.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            r3Var.f28344e0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            r3Var.f28347h0.setText(cVar.b("label_app_photo", context.getString(R.string.applicant_photo)));
            r3Var.f28345f0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            r3Var.f28346g0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            r3Var.f28349j0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            r3Var.f28350k0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            r3Var.B0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final void A2(Context context, y8 y8Var) {
            l.f(context, "context");
            l.f(y8Var, "binding");
            c cVar = new c(context);
            y8Var.f29524t.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            y8Var.f29525u.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            y8Var.f29517m.f28308i.setText(cVar.b("duplicate_Permit", context.getString(R.string.duplicate_permit_certificate)));
            y8Var.f29506b.setText(cVar.b("apply_for_duplicate_permit", context.getString(R.string.apply_for_duplicate_permit_certificate)));
            y8Var.f29520p.setText(cVar.b("label_dl_serv_reason", ""));
            y8Var.f29523s.setText(cVar.b("required_document", context.getString(R.string.required_document)));
            y8Var.f29521q.setText(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            y8Var.f29513i.setHint(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            y8Var.f29522r.setText(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            y8Var.f29509e.setHint(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            y8Var.f29518n.setText(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            y8Var.f29508d.setHint(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            y8Var.f29519o.setText(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            y8Var.f29511g.setHint(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            y8Var.f29507c.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void B(Context context, j jVar) {
            l.f(context, "context");
            l.f(jVar, "binding");
            c cVar = new c(context);
            jVar.f26887b.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            jVar.f26893h.setHint(cVar.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            jVar.f26891f.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            jVar.f26889d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void B0(Context context, y3 y3Var) {
            l.f(context, "context");
            l.f(y3Var, "binding");
            c cVar = new c(context);
            y3Var.f29444f.setText(cVar.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            y3Var.f29440b.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
        }

        public final void B1(Context context, i7 i7Var) {
            l.f(context, "context");
            l.f(i7Var, "sw");
            c cVar = new c(context);
            i7Var.f26815h.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            i7Var.f26814g.setHint(cVar.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_vehicle_no)));
            i7Var.f26810c.setHint(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            i7Var.f26811d.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            i7Var.f26809b.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void B2(Context context, pd pdVar) {
            l.f(context, "context");
            l.f(pdVar, "binding");
            c cVar = new c(context);
            pdVar.f28096s.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            pdVar.f28097t.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            pdVar.f28090m.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            pdVar.f28088k.f28308i.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            pdVar.f28089l.setText(cVar.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            pdVar.f28093p.setText(cVar.b("label_dl_serv_reason", ""));
            pdVar.f28094q.setText(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            pdVar.f28086i.setHint(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            pdVar.f28095r.setText(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            pdVar.f28081d.setHint(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            pdVar.f28091n.setText(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            pdVar.f28080c.setHint(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            pdVar.f28092o.setText(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            pdVar.f28083f.setHint(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            pdVar.f28079b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            pdVar.f28084g.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            pdVar.f28084g.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            pdVar.f28084g.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            pdVar.f28084g.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void C(Context context, v8 v8Var) {
            l.f(context, "context");
            l.f(v8Var, "binding");
            c cVar = new c(context);
            v8Var.L.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            v8Var.M.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            v8Var.f29022g.setText(cVar.b("altVh_bodyType", context.getString(R.string.body_type)));
            v8Var.f29021f.setHint(cVar.b("altVh_bodyType", context.getString(R.string.body_type)));
            v8Var.D.setText(cVar.b("altVh_seatCap", context.getString(R.string.seating_capacity)));
            v8Var.C.setHint(cVar.b("altVh_seatCap", context.getString(R.string.seating_capacity)));
            v8Var.H.setText(cVar.b("altVh_standCap", context.getString(R.string.standing_capacity)));
            v8Var.G.setHint(cVar.b("altVh_standCap", context.getString(R.string.standing_capacity)));
            v8Var.F.setText(cVar.b("altVh_sleeperCap", context.getString(R.string.sleeper_capacity)));
            v8Var.E.setHint(cVar.b("altVh_sleeperCap", context.getString(R.string.sleeper_capacity)));
            v8Var.f29039x.setText(cVar.b("altVh_noCylnd", context.getString(R.string.no_of_cylinders)));
            v8Var.f29038w.setHint(cVar.b("altVh_noCylnd", context.getString(R.string.no_of_cylinders)));
            v8Var.K.setText(cVar.b("altVh_UnladenWght", context.getString(R.string.unladen_weight_kg)));
            v8Var.J.setHint(cVar.b("altVh_UnladenWght", context.getString(R.string.unladen_weight_kg)));
            v8Var.f29035t.setText(cVar.b("altVh_LadenWght", context.getString(R.string.laden_weight_kg)));
            v8Var.f29034s.setHint(cVar.b("altVh_LadenWght", context.getString(R.string.laden_weight_kg)));
            v8Var.f29033r.setText(cVar.b("altVh_HorsePower", context.getString(R.string.horse_power)));
            v8Var.f29032q.setHint(cVar.b("altVh_HorsePower", context.getString(R.string.horse_power)));
            v8Var.f29029n.setText(cVar.b("altVh_Fuel", context.getString(R.string.fuel)));
            v8Var.f29025j.setText(cVar.b("altVh_Color", context.getString(R.string.color)));
            v8Var.f29024i.setHint(cVar.b("altVh_Color", context.getString(R.string.color)));
            v8Var.Q.setText(cVar.b("altVh_Wheelbase", context.getString(R.string.wheelbase)));
            v8Var.P.setHint(cVar.b("altVh_Wheelbase", context.getString(R.string.wheelbase)));
            v8Var.f29027l.setText(cVar.b("altVh_CubicCap", context.getString(R.string.cubic_capacity)));
            v8Var.f29026k.setHint(cVar.b("altVh_CubicCap", context.getString(R.string.cubic_capacity)));
            v8Var.f29018c.setText(cVar.b("altVh_AcFitted", context.getString(R.string.ac_fitted)));
            v8Var.f29020e.setText(cVar.b("altVh_AudioFitted", context.getString(R.string.audio_fitted)));
            v8Var.O.setText(cVar.b("altVh_VideoFitted", context.getString(R.string.video_fitted)));
            v8Var.f29031p.setText(cVar.b("altVh_Heigthmm", context.getString(R.string.height_mm)));
            v8Var.f29030o.setHint(cVar.b("altVh_Heigthmm", context.getString(R.string.height_mm)));
            v8Var.f29037v.setText(cVar.b("altVh_Lengthmm", context.getString(R.string.length_mm)));
            v8Var.f29036u.setHint(cVar.b("altVh_Lengthmm", context.getString(R.string.length_mm)));
            v8Var.S.setText(cVar.b("altVh_Widthmm", context.getString(R.string.width_mm)));
            v8Var.R.setHint(cVar.b("altVh_Widthmm", context.getString(R.string.width_mm)));
            v8Var.f29023h.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void C0(Context context, z3 z3Var) {
            l.f(context, "context");
            l.f(z3Var, "binding");
            c cVar = new c(context);
            z3Var.M.f28308i.setText(cVar.b("label_view_forms", context.getString(R.string.view_forms)));
            z3Var.L.setText(cVar.b("no_forms_available", context.getString(R.string.no_forms_available)));
            z3Var.f29636c.setText(cVar.b("download_form_22", context.getString(R.string.download_form_22)));
            z3Var.f29656w.setText(cVar.b("download_from_14", context.getString(R.string.download_from_14)));
            z3Var.f29638e.setText(cVar.b("download_form_26", context.getString(R.string.download_form_26)));
            z3Var.f29657x.setText(cVar.b("download_From_28", context.getString(R.string.download_From_28)));
            z3Var.f29641h.setText(cVar.b("download_form_29", context.getString(R.string.download_form_29)));
            z3Var.f29643j.setText(cVar.b("download_form_30", context.getString(R.string.download_form_30)));
            z3Var.f29645l.setText(cVar.b("download_form_31", context.getString(R.string.download_form_31)));
            z3Var.f29647n.setText(cVar.b("download_form_32", context.getString(R.string.download_form_32)));
            z3Var.f29658y.setText(cVar.b("download_from_33", context.getString(R.string.download_from_33)));
            z3Var.f29650q.setText(cVar.b("download_form_34", context.getString(R.string.download_form_34)));
            z3Var.f29652s.setText(cVar.b("download_form_35", context.getString(R.string.download_form_35)));
            z3Var.f29654u.setText(cVar.b("download_form_36", context.getString(R.string.download_form_36)));
        }

        public final void C1(Context context, j7 j7Var) {
            l.f(context, "context");
            l.f(j7Var, "binding");
            c cVar = new c(context);
            j7Var.f26977p.setText(cVar.b("virtual_registration_certificate", context.getString(R.string.virtual_registration_certificate)));
            j7Var.f26965d.setText(cVar.b("my_rc", context.getString(R.string.my_rc)));
            j7Var.f26975n.setText(cVar.b("label_shared_rc", context.getString(R.string.shared_rc)));
            j7Var.f26972k.setText(cVar.b("label_dl_search", context.getString(R.string.received_rc)));
        }

        public final void C2(Context context, ib ibVar) {
            l.f(context, "context");
            l.f(ibVar, "binding");
            c cVar = new c(context);
            ibVar.f26844t.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            ibVar.f26845u.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            ibVar.f26838n.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            ibVar.f26836l.f28308i.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            ibVar.f26837m.setText(cVar.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            ibVar.f26841q.setText(cVar.b("label_dl_serv_reason", ""));
            ibVar.f26842r.setText(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            ibVar.f26833i.setHint(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            ibVar.f26843s.setText(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            ibVar.f26828d.setHint(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            ibVar.f26839o.setText(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            ibVar.f26827c.setHint(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            ibVar.f26840p.setText(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            ibVar.f26830f.setHint(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            ibVar.f26826b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            ibVar.f26831g.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            ibVar.f26831g.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            ibVar.f26831g.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            ibVar.f26831g.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void D(Context context, o oVar) {
            l.f(context, "context");
            l.f(oVar, "ad");
            c cVar = new c(context);
            oVar.f27714h.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no_mend)));
            oVar.f27709c.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            oVar.f27715i.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            oVar.f27708b.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            oVar.f27718l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            oVar.f27710d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void D0(Context context, b4 b4Var) {
            l.f(context, "context");
            l.f(b4Var, "cl_dup");
            c cVar = new c(context);
            b4Var.I.setText(cVar.b("view_cl_det", context.getString(R.string.view_cl_details)));
            b4Var.f25446w.setHint(cVar.b("label_dl_serv_reason", context.getString(R.string.enter_reason_to_duplicate_cl)));
            b4Var.H.setText(cVar.b("reason_apply_dup_cl", context.getString(R.string.reason_to_duplicate_cl)));
            b4Var.C.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            b4Var.f25448y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void D1(Context context, l7 l7Var) {
            l.f(context, "context");
            l.f(l7Var, "cl_renewal");
            c cVar = new c(context);
            l7Var.H.setText(cVar.b("view_cl_det", context.getString(R.string.view_cl_details)));
            l7Var.G.setText(cVar.b("reason_apply_dup_cl", context.getString(R.string.renewal_cl_app)));
            l7Var.f27277x.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            l7Var.f27278y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void D2(Context context, ib ibVar) {
            l.f(context, "context");
            l.f(ibVar, "binding");
            c cVar = new c(context);
            ibVar.f26844t.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            ibVar.f26845u.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            ibVar.f26838n.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            ibVar.f26836l.f28308i.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.vahan_duplicate_rc)));
            ibVar.f26837m.setText(cVar.b("lbl_Fill_detail", context.getString(R.string.vahan_details_duplicate_rc)));
            ibVar.f26841q.setText(cVar.b("label_dl_serv_reason", ""));
            ibVar.f26842r.setText(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            ibVar.f26833i.setHint(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            ibVar.f26843s.setText(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            ibVar.f26828d.setHint(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            ibVar.f26839o.setText(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            ibVar.f26827c.setHint(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            ibVar.f26840p.setText(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            ibVar.f26830f.setHint(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            ibVar.f26826b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            ibVar.f26831g.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            ibVar.f26831g.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            ibVar.f26831g.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            ibVar.f26831g.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void E(Context context, m mVar) {
            l.f(context, "context");
            l.f(mVar, "ad");
            c cVar = new c(context);
            mVar.f27380h.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            mVar.f27381i.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            mVar.f27378f.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            mVar.f27379g.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            mVar.f27375c.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void E0(Context context, d4 d4Var) {
            l.f(context, "context");
            l.f(d4Var, "dl_duplicate");
            c cVar = new c(context);
            d4Var.O.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            d4Var.O.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            d4Var.O.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            d4Var.O.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            d4Var.O.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            d4Var.X.setText(cVar.b("label_dl_serv_enter_reas_manul", context.getString(R.string.enter_reason)));
            d4Var.f25858z.setHint(cVar.b("label_dl_serv_reason", context.getString(R.string.reason)));
            d4Var.Y.setText(cVar.b("label_app_category", context.getString(R.string.app_category)));
            d4Var.U.setText(cVar.b("title_dl_serv_detail_duplicate", context.getString(R.string.details_for_duplicate_dl)));
            d4Var.Z.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            d4Var.W.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.reason)));
            d4Var.E.setHint(cVar.b("edit_dl_serv_sel_reason", context.getString(R.string.sel_rsn)));
            d4Var.V.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            d4Var.f25854a0.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            d4Var.M.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            d4Var.N.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            d4Var.G.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            d4Var.P.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void E1(Context context, v2 v2Var) {
            l.f(context, "context");
            l.f(v2Var, "dl_renewal");
            c cVar = new c(context);
            v2Var.H.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            v2Var.H.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            v2Var.H.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            v2Var.H.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            v2Var.H.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            v2Var.Z.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit_the_request_to)));
            v2Var.f28953c0.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            v2Var.Y.setText(cVar.b("label_dl_serv_state", context.getString(R.string.state)));
            v2Var.X.setText(cVar.b("label_dl_serv_rto", context.getString(R.string.rto)));
            v2Var.Q.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            v2Var.f28952b0.setText(cVar.b("label_app_category", context.getString(R.string.app_category)));
        }

        public final void E2(Context context, ld ldVar) {
            l.f(context, "context");
            l.f(ldVar, "binding");
            c cVar = new c(context);
            SpannableString spannableString = new SpannableString(cVar.b("redirect_link_to_application_status", context.getString(R.string.redirect_link_to_application_status)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            ldVar.f27367b.setText(spannableString);
            ldVar.f27371f.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            ldVar.f27370e.setText(cVar.b("label_home", context.getString(R.string.home)));
        }

        public final void F(Context context, f5 f5Var) {
            l.f(context, "context");
            l.f(f5Var, "ad");
            c cVar = new c(context);
            f5Var.f26244m.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_name)));
            f5Var.f26237f.setText(cVar.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            f5Var.f26235d.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            f5Var.f26238g.setText(cVar.b("appl_gender", context.getString(R.string.app_gender)));
            f5Var.f26233b.setText(cVar.b("age_in_year", context.getString(R.string.age)));
            f5Var.f26247p.setText(cVar.b("slot_date", context.getString(R.string.slot_date)));
            f5Var.f26248q.setText(cVar.b("slot_time", context.getString(R.string.slot_time)));
            f5Var.f26245n.setText(cVar.b("button_proceed", context.getString(R.string.proceed)));
            f5Var.f26240i.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void F0(Context context, h4 h4Var) {
            l.f(context, "context");
            l.f(h4Var, "ll_dup");
            c cVar = new c(context);
            h4Var.I.setText(cVar.b("view_ll", context.getString(R.string.view_ll_details)));
            h4Var.f26606w.setHint(cVar.b("label_dl_serv_reason", context.getString(R.string.enter_reason_to_duplicate_cl)));
            h4Var.H.setText(cVar.b("reason_app_duplicate_ll", context.getString(R.string.reason_to_duplicate_ll)));
            h4Var.C.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            h4Var.f26608y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void F1(Context context, b3 b3Var) {
            l.f(context, "context");
            l.f(b3Var, "dl_replace");
            c cVar = new c(context);
            b3Var.I.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            b3Var.I.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            b3Var.I.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            b3Var.I.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            b3Var.I.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            b3Var.P.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            b3Var.Q.setText(cVar.b("label_app_category", context.getString(R.string.app_category)));
            b3Var.N.setText(cVar.b("declaration", context.getString(R.string.declaration)));
            b3Var.O.setText(cVar.b("no_input_required", context.getString(R.string.no_input_req)));
            b3Var.f25442w.setText(cVar.b("i_here_by_declare", context.getString(R.string.rep_declaration)));
            b3Var.R.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            b3Var.A.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            b3Var.J.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            b3Var.S.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            b3Var.G.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            b3Var.f25442w.setText(cVar.b("i_here_by_declare", context.getString(R.string.rep_declaration)));
            b3Var.H.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void F2(Context context, a9 a9Var) {
            l.f(context, "context");
            l.f(a9Var, "binding");
            c cVar = new c(context);
            a9Var.f25261p.setText(cVar.b("pay_tax", ""));
            a9Var.f25253h.setText(cVar.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            a9Var.f25248c.setText(cVar.b("my_vehicles", context.getString(R.string.my_vehicles)));
            a9Var.f25249d.setText(cVar.b("other_new_vehicle", context.getString(R.string.other_new_vehicle)));
            a9Var.f25263r.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            a9Var.f25250e.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_five_digits)));
            a9Var.f25264s.setHint(cVar.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            a9Var.f25251f.setHint(cVar.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            a9Var.f25255j.setText(cVar.b("notes", context.getString(R.string.notes)));
            a9Var.f25254i.setText(cVar.b("dl_serv_note", context.getString(R.string.new_note)));
            a9Var.f25258m.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            a9Var.f25247b.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            a9Var.f25257l.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void G(Context context, p pVar) {
            l.f(context, "context");
            l.f(pVar, "ad");
            c cVar = new c(context);
            pVar.f27908w.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            pVar.f27889d.setText(cVar.b("vahan_application_name", context.getString(R.string.applicant_name)));
            pVar.f27891f.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            pVar.L.setText(cVar.b("label_appl_status_rto_code", "RTO Code"));
            pVar.G.setText(cVar.b("vahan_rto_name", context.getString(R.string.rto_name_2)));
            pVar.O.setText(cVar.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            pVar.P.setText(cVar.b("label_transaction_status", context.getString(R.string.transaction_status)));
        }

        public final void G0(Context context, n4 n4Var) {
            Context context2 = context;
            n4 n4Var2 = n4Var;
            l.f(context2, "context");
            l.f(n4Var2, "ela");
            c cVar = new c(context2);
            n4Var2.f27558h0.setText(cVar.b("label_dl_serv_present_addr", context2.getString(R.string.present_address_sarthi)));
            n4Var2.f27562l0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            n4Var2.f27575z.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            n4Var2.f27552b0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            n4Var2.f27574y.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            n4Var2.f27566p0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            n4Var2.f27573x.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            n4Var2.f27551a0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            n4Var2.M.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            n4Var2.f27554d0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            n4Var2.L.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            n4Var2.f27564n0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            n4Var2.P.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            n4Var2.f27556f0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            n4Var2.N.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            n4Var2.f27560j0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            n4Var2.O.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            n4Var2.X.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            n4Var2.f27559i0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            n4Var2.f27563m0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            n4Var2.G.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            n4Var2.f27567q0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            n4Var2.E.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            n4Var2.J.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            n4Var2.I.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            n4Var2.H.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            n4Var2.f27555e0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            n4Var2.A.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            n4Var2.f27565o0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            n4Var2.D.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            n4Var2.f27557g0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            n4Var2.B.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            n4Var2.f27561k0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            n4Var2.f27572w.setText(cVar.b("button_cancel", context2.getString(R.string.cancel)));
            n4Var2.C.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            n4Var2.Y.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            n4Var2.f27568r0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            n4Var2.Q.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.duration_stay_sarthi)));
            n4Var2.f27570t0.setHint(cVar.b("year_txt", context2.getString(R.string.year)));
            n4Var2.V.setHint(cVar.b("month_txt", context2.getString(R.string.month)));
        }

        public final void G1(Context context, t7 t7Var) {
            l.f(context, "context");
            l.f(t7Var, "binding");
            c cVar = new c(context);
            t7Var.f28687f.setText(cVar.b("lbl_State_Name", context.getString(R.string.state_name)));
            t7Var.f28690i.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            t7Var.f28683b.setText(cVar.b("btn_challan_get_details", context.getString(R.string.get_details)));
        }

        public final void G2(Context context, a9 a9Var) {
            l.f(context, "context");
            l.f(a9Var, "binding");
            c cVar = new c(context);
            a9Var.f25261p.setText(cVar.b("pay_tax", ""));
            a9Var.f25253h.setText(cVar.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            a9Var.f25248c.setText(cVar.b("my_vehicles", context.getString(R.string.my_vehicles)));
            a9Var.f25249d.setText(cVar.b("other_new_vehicle", context.getString(R.string.other_new_vehicle)));
            a9Var.f25263r.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            a9Var.f25250e.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_five_digits)));
            a9Var.f25264s.setHint(cVar.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            a9Var.f25251f.setHint(cVar.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            a9Var.f25255j.setText(cVar.b("notes", context.getString(R.string.notes)));
            a9Var.f25254i.setText(cVar.b("dl_serv_note", context.getString(R.string.new_note)));
            a9Var.f25258m.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            a9Var.f25247b.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            a9Var.f25257l.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void H(Context context, q qVar) {
            l.f(context, "context");
            l.f(qVar, "appStatus");
            c cVar = new c(context);
            qVar.f28099b.setHint(cVar.b("edit_dl_serv_dob", "Enter Date of Birth"));
            qVar.f28106i.setText(cVar.b("lbl_dob", "Date of Birth"));
            qVar.f28105h.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            qVar.f28100c.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            qVar.f28109l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            qVar.f28101d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void H0(Context context, p4 p4Var) {
            l.f(context, "context");
            l.f(p4Var, "el_ap");
            c cVar = new c(context);
            p4Var.f27928x.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            p4Var.B.setText(cVar.b("lbl_dob", context.getString(R.string.dob_sarthi)));
            p4Var.A.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            p4Var.f27930z.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            p4Var.f27927w.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            p4Var.C.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
        }

        public final void H1(Context context, v3 v3Var) {
            l.f(context, "context");
            l.f(v3Var, "mBnding");
            c cVar = new c(context);
            v3Var.f28965g.f28452f.setText(cVar.b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            v3Var.f28975q.setText(cVar.b("label_challan_dl_number", "Driving Licence No."));
            v3Var.f28966h.setText(cVar.b("label_dl_serv_appl_no", "Application Number"));
            v3Var.f28962d.setText(cVar.b("vahan_application_date", "Application Date"));
            v3Var.f28973o.setText(cVar.b("lbl_Receipt_No", "Receipt Number"));
            v3Var.f28972n.setText(cVar.b("receipt_date", "Receipt Date"));
            v3Var.f28960b.setText(cVar.b("vahan_amount", "Amount"));
            v3Var.f28974p.setText(cVar.b("label_transaction_name", "Transaction Name"));
        }

        public final void H2(Context context, vd vdVar) {
            l.f(context, "context");
            l.f(vdVar, "binding");
            c cVar = new c(context);
            vdVar.X.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            vdVar.Y.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            vdVar.O.setText(cVar.b("no_objection_certificate_noc", context.getString(R.string.vahan_noc)));
            vdVar.F.f28308i.setText(cVar.b("no_objection_certificate_noc", context.getString(R.string.vahan_noc)));
            vdVar.f29108t.setText(cVar.b("hypothecation_option", context.getString(R.string.hypothecation_option)));
            vdVar.f29094f.setText(cVar.b("vahan_continuation_of_hypothecation", context.getString(R.string.vahan_continuation_of_hypothecation)));
            vdVar.E.setText(cVar.b("vahan_termination_of_hypothecation", context.getString(R.string.vahan_termination_of_hypothecation)));
            vdVar.P.setText(cVar.b("vahan_reason_for_taking_noc", context.getString(R.string.vahan_reason_for_taking_noc)));
            vdVar.Q.setText(cVar.b("vahan_state_to", context.getString(R.string.vahan_state_to)));
            vdVar.J.setText(cVar.b("vahan_authority_to", context.getString(R.string.vahan_authority_to)));
            vdVar.f29111w.setText(cVar.b("ncrb_clearance_no", context.getString(R.string.ncrb_clearance_no)));
            vdVar.f29112x.setHint(cVar.b("enter_the_ncrb_clearance_no", context.getString(R.string.enter_the_ncrb_clearance_no)));
            vdVar.H.setText(cVar.b("transferee_name", context.getString(R.string.transferee_name)));
            vdVar.G.setHint(cVar.b("enter_the_transferee_name", context.getString(R.string.enter_the_transferee_name)));
            vdVar.f29103o.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            vdVar.N.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            vdVar.M.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            vdVar.L.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            vdVar.K.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            vdVar.f29099k.setText(cVar.b("finance_upto_date", context.getString(R.string.finance_upto_date)));
            vdVar.f29098j.setText(cVar.b("select_date", context.getString(R.string.select_date)));
            vdVar.f29104p.setText(cVar.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            vdVar.U.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            vdVar.S.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            vdVar.R.setText(cVar.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            vdVar.T.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            vdVar.f29093e.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            vdVar.f29114z.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            vdVar.f29114z.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            vdVar.f29114z.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            vdVar.f29114z.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void I(Context context, r rVar) {
            l.f(context, "context");
            l.f(rVar, "binding");
            c cVar = new c(context);
            rVar.f28310b.setText(cVar.b("fancyNo_AckNo", context.getString(R.string.acknowledgement_no)));
            rVar.f28316h.setHint(cVar.b("fancyNo_enterAckNo", context.getString(R.string.enter_acknowledgement_no)));
            rVar.f28314f.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            rVar.f28312d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void I0(Context context, ra raVar) {
            l.f(context, "context");
            l.f(raVar, "elp");
            c cVar = new c(context);
            raVar.J.setText(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            raVar.E.setText(cVar.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            raVar.I.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            raVar.L.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            raVar.B.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            raVar.f28429w.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            raVar.A.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            raVar.G.setText(cVar.b("here_by_declare", context.getString(R.string.self_declartion)));
            raVar.C.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void I1(Context context, c8 c8Var) {
            l.f(context, "context");
            l.f(c8Var, "binding");
            c cVar = new c(context);
            if (p.o(cVar.b("dl_search_txt", context.getString(R.string.dl_search_txt)), "driving Licence Search", true)) {
                c8Var.F.setText("Driving Licence Search");
            } else {
                c8Var.F.setText(cVar.b("dl_search_txt", context.getString(R.string.dl_search_txt)));
            }
            c8Var.f25650s.setText(cVar.b("label_dl_holder_name", context.getString(R.string.owner_name_for_dl)));
            c8Var.I.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            c8Var.H.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            c8Var.f25651t.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            c8Var.f25639h.setText(cVar.b("makerTitle", context.getString(R.string.valid_upto_v3)));
            c8Var.f25643l.setText(cVar.b("registeringAuthTitle", context.getString(R.string.rto_code_l)));
            c8Var.f25644m.setText(cVar.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            c8Var.D.setText(cVar.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            c8Var.f25652u.setText(cVar.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            c8Var.f25648q.setText(cVar.b("create_a_virtual_dl", context.getString(R.string.create_a_virtual_dl)));
            c8Var.f25653v.setText(cVar.b("label_view_challan", context.getString(R.string.view_challan)));
            c8Var.f25645n.setText(cVar.b("valid_till_trans", context.getString(R.string.transportValidity)));
        }

        public final void I2(Context context, z8 z8Var, AppCompatButton appCompatButton, AppCompatButton appCompatButton2) {
            l.f(context, "context");
            l.f(z8Var, "binding");
            l.f(appCompatButton, "reset");
            l.f(appCompatButton2, "generate");
            c cVar = new c(context);
            z8Var.f29731s.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_number)));
            z8Var.f29717e.setText(cVar.b("lbl_registered_mobile_no", "Registered Mobile No."));
            z8Var.f29730r.setText(cVar.b("update_Mobile_No", context.getString(R.string.update2)));
            z8Var.f29719g.setText(cVar.b("mobile_number_is_added", context.getString(R.string.mobile_correct_added)));
            appCompatButton.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            appCompatButton2.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
            z8Var.f29721i.setText(cVar.b("vehicle_service", context.getString(R.string.vehicle_service)));
            SpannableString spannableString = new SpannableString(cVar.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            z8Var.f29714b.setText(spannableString);
        }

        public final void J(Context context, s sVar) {
            l.f(context, "context");
            l.f(sVar, "binding");
            c cVar = new c(context);
            sVar.f28481c.setHint(cVar.b("label_search", context.getString(R.string.search)));
            sVar.f28483e.setText(cVar.b("label_search", context.getString(R.string.search)));
        }

        public final void J0(Context context, k4 k4Var) {
            l.f(context, "context");
            l.f(k4Var, "el_otp");
            c cVar = new c(context);
            k4Var.f27075c.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            k4Var.f27081i.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            k4Var.f27080h.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            k4Var.f27076d.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            k4Var.f27077e.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void J1(Context context, f8 f8Var) {
            l.f(context, "context");
            l.f(f8Var, "binding");
            c cVar = new c(context);
            f8Var.f26280e0.setText(cVar.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            f8Var.f26276c0.setText(cVar.b("sez_doc_details", context.getString(R.string.seizure_doc_details)));
            f8Var.f26284g0.setText(cVar.b("vehicle_search", "Vehicle Search"));
            f8Var.X.setText(cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            f8Var.W.setText(cVar.b("label_challan_owner_name", "Owner Name"));
            f8Var.N.setText(cVar.b(f.f17510a.l0(), "Registering Authority"));
            f8Var.f26290j0.setText(cVar.b("vehicle_class", "Vehicle Class"));
            f8Var.f26305u.setText(cVar.b("fuel_type", "Fuel Type"));
            f8Var.P.setText(cVar.b("vehicle_age", "Vehicle Age"));
            f8Var.f26274b0.setText(cVar.b("vehicle_status", "Vehicle Status"));
            f8Var.Y.setText(cVar.b("vehicle_impound_status", "Tap to Check the Vehicle Impound and Seizure Document Status"));
            f8Var.f26286h0.setText(cVar.b("registration_date", "Registration Date"));
            f8Var.f26285h.setText(cVar.b("fitness_valid_upto", "Fitness Valid Upto"));
            f8Var.S.setText(cVar.b("tax_valid_upto", "Tax Valid Upto"));
            f8Var.f26291k.setText(cVar.b("insurance_valid_upto", "Insurance Valid UpTo"));
            f8Var.E.setText(cVar.b("pucc_valid_upto", "PUCC Valid UpTo"));
            f8Var.C.setText(cVar.b("permit_valid_upto", "Permit Valid UpTo"));
            f8Var.f26308x.setText(cVar.b("national_permit_no", "National Permit No."));
            f8Var.f26307w.setText(cVar.b("national_permit_valid_upto", "National Permit Valid Upto."));
            f8Var.f26273b.setText(cVar.b("create_vir_rc", "Create Virtual RC"));
            f8Var.f26275c.setText(cVar.b("label_view_challan", "View Challan"));
            f8Var.G.setText(cVar.b("emmission_norm_lbl", "Emission Norm"));
            f8Var.V.setText(cVar.b("black_list_status", context.getString(R.string.black_list_status)));
        }

        public final void J2(Context context, c9 c9Var) {
            l.f(context, "context");
            l.f(c9Var, "binding");
            c cVar = new c(context);
            c9Var.f25664g.setText(cVar.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            c9Var.f25663f.setHint(cVar.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            c9Var.f25673p.setText(cVar.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
            c9Var.f25682y.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
            c9Var.f25680w.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            c9Var.f25674q.setText(cVar.b("vehicle_service", context.getString(R.string.vehicle_service)));
            c9Var.A.setText(cVar.b("vehicle_number", context.getString(R.string.vehicle_number)));
            c9Var.f25665h.setText(cVar.b("please_enter_aadhaar", context.getString(R.string.please_enter_aadhaar)));
            c9Var.f25660c.setText(cVar.b("aadhar_no", context.getString(R.string.aadhar_no)));
            c9Var.C.setText(cVar.b("vid", context.getString(R.string.vid)));
            c9Var.f25666i.setHint(cVar.b("enter_aadhaar_number", context.getString(R.string.enter_aadhaar_number)));
            SpannableString spannableString = new SpannableString(cVar.b("agree_with_aadhar_terms", context.getString(R.string.agree_with_aadhar_terms)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            c9Var.f25677t.setText(spannableString);
            c9Var.f25664g.setText(cVar.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            c9Var.f25663f.setHint(cVar.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            c9Var.f25673p.setText(cVar.b("resend_otp", context.getString(R.string.resend_otp)));
            c9Var.f25669l.setText(cVar.b("notes", context.getString(R.string.notes)));
            c9Var.f25667j.setText(cVar.b("faceless_services", context.getString(R.string.faceless_services)));
            c9Var.B.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            c9Var.f25681x.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            c9Var.f25659b.setText(cVar.b("aadharBasedEkyc", context.getString(R.string.addherTitle)));
        }

        public final void K(Context context, t tVar) {
            l.f(context, "context");
            l.f(tVar, "binding");
            c cVar = new c(context);
            tVar.f28600f.setText(cVar.b("lbl_State_Name", context.getString(R.string.state_name)));
            tVar.f28604j.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            tVar.f28596b.setText(cVar.b("btn_challan_get_details", context.getString(R.string.get_details)));
        }

        public final void K0(Context context, l4 l4Var) {
            l.f(context, "context");
            l.f(l4Var, "elp");
            c cVar = new c(context);
            l4Var.V.setText(cVar.b("appl_name", context.getString(R.string.name_of_applicant_ll)));
            l4Var.f27267y.setHint(cVar.b("first_name", context.getString(R.string.first_name)));
            l4Var.F.setHint(cVar.b("middle_name", context.getString(R.string.middle_name)));
            l4Var.C.setHint(cVar.b("last_name", context.getString(R.string.last_name)));
            l4Var.f27253e0.setText(cVar.b("full_name", context.getString(R.string.full_name_as_per_record_ll)));
            l4Var.f27254f0.setHint(cVar.b("enter_full_name", context.getString(R.string.new_full_name)));
            l4Var.f27264p0.setText(cVar.b("label_relation", context.getString(R.string.relation_ll)));
            l4Var.f27268z.setHint(cVar.b("first_name", context.getString(R.string.first_name)));
            l4Var.G.setHint(cVar.b("middle_name", context.getString(R.string.middle_name)));
            l4Var.D.setHint(cVar.b("last_name", context.getString(R.string.last_name)));
            l4Var.f27255g0.setHint(cVar.b("appl_gender", context.getString(R.string.gender)));
            l4Var.I.setText(cVar.b("appl_female", context.getString(R.string.female)));
            l4Var.K.setText(cVar.b("appl_male", context.getString(R.string.male)));
            l4Var.L.setText(cVar.b("appl_trans", context.getString(R.string.transgender)));
            l4Var.Y.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            l4Var.Z.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            l4Var.S.setText(cVar.b("age_in_year", context.getString(R.string.age)));
            l4Var.f27261m0.setText(cVar.b("label_dl_serv_birth_place", context.getString(R.string.birthplace_ll)));
            l4Var.W.setText(cVar.b("country_birth", context.getString(R.string.country_birth_ll)));
            l4Var.f27263o0.setText(cVar.b("education_qualification", context.getString(R.string.education_qualification_ll)));
            l4Var.X.setText(cVar.b("blood_group", context.getString(R.string.blood_group_sarthi)));
            l4Var.f27256h0.setText(cVar.b("blood_group", context.getString(R.string.landline_number_sarthi)));
            l4Var.f27249a0.setText(cVar.b("Email_id", context.getString(R.string.email_id)));
            l4Var.T.setText(cVar.b("alt_mob_number", context.getString(R.string.alt_mobile_no)));
            l4Var.f27251c0.setText(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_mob_number_ll)));
            l4Var.f27258j0.setText(cVar.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            l4Var.N.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            l4Var.A.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            l4Var.f27265w.setHint(cVar.b("age_in_year", context.getString(R.string.age)));
            l4Var.f27262n0.setHint(cVar.b("label_dl_serv_birth_place", context.getString(R.string.birthplace)));
            l4Var.U.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            l4Var.f27252d0.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            l4Var.f27259k0.setHint(cVar.b("ident_mark_1", context.getString(R.string.identification_mark_1)));
            l4Var.f27260l0.setHint(cVar.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
        }

        public final void K1(Context context, yc ycVar) {
            l.f(context, "context");
            l.f(ycVar, "binding");
            c cVar = new c(context);
            ycVar.f29605w.setText(cVar.b("toApplBySeller", "Application by Seller"));
            ycVar.f29602t.setText(cVar.b("toApplByBuyer", "Application by Buyer"));
        }

        public final void K2(Context context, qc qcVar) {
            l.f(context, "context");
            l.f(qcVar, "binding");
            c cVar = new c(context);
            qcVar.f28298j.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            qcVar.f28299k.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            qcVar.f28290b.setText(cVar.b("apply_for_rc_cancellation", context.getString(R.string.apply_for_rc_cancellation)));
            qcVar.f28295g.f28308i.setText(cVar.b("rc_cancellation", context.getString(R.string.rc_cancellation)));
            qcVar.f28296h.setText(cVar.b("rc_cancellation_date", context.getString(R.string.rc_cancellation_date)));
            qcVar.f28292d.setHint(cVar.b("rc_cancellation_date", context.getString(R.string.rc_cancellation_date)));
            qcVar.f28297i.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            qcVar.f28294f.setHint(cVar.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            qcVar.f28291c.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }

        public final void L(Context context, u uVar) {
            l.f(context, "context");
            l.f(uVar, "mBnding");
            c cVar = new c(context);
            uVar.f28797y.setText(cVar.b("Challan_Transactions", "Challan Transactions"));
            uVar.B.setText(cVar.b("radio_btn_challan_no", "Challan No."));
            uVar.f28778f.setText(cVar.b("label_challan_date", "Challan Date"));
            uVar.f28776d.setText(cVar.b("label_challan_amount", "Challan Amount"));
            uVar.f28783k.setText(cVar.b("label_challan_status", "Challan Status"));
            uVar.f28782j.setText(cVar.b("label_challan_state", "Challan State"));
            uVar.f28774b.setText(cVar.b("vahan_amount", "Amount"));
            uVar.A.setText(cVar.b("vahan_transaction_id", "Transaction ID"));
            uVar.f28794v.setText(cVar.b("lbl_Receipt_No", "Receipt Number"));
            uVar.f28792t.setText(cVar.b("paymentDate", "Payment Date"));
            uVar.D.setText(cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            uVar.f28786n.setText(cVar.b("radio_btn_dl_no", "Driving Licence Number"));
        }

        public final void L0(Context context, cc ccVar) {
            l.f(context, "context");
            l.f(ccVar, "binding");
            c cVar = new c(context);
            ccVar.f25775n.setText(cVar.b("title_security_mpin", context.getString(R.string.sec_pin)));
            ccVar.f25778q.setText(cVar.b("title_security_mpin", context.getString(R.string.sec_pin)));
            ccVar.f25781t.setText(cVar.b("label_verify_otp", context.getString(R.string.verify_otp)));
            ccVar.f25767f.setHint(cVar.b("edit_enter_otp", context.getString(R.string.enter_otp)));
            ccVar.f25782u.setText(cVar.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            ccVar.f25777p.setText(cVar.b("label_refresh_close", context.getString(R.string.ref_close)));
            ccVar.f25780s.setText(cVar.b("button_verify", context.getString(R.string.verify)));
            ccVar.f25776o.setText(cVar.b("label_get_otp", context.getString(R.string.did_not_get_otp)));
            ccVar.f25771j.setText(cVar.b("label_resend_otp", context.getString(R.string.resend_otp)));
            ccVar.f25764c.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void L1(Context context, bd bdVar) {
            l.f(context, "context");
            l.f(bdVar, "binding");
            c cVar = new c(context);
            bdVar.f25572i.f28308i.setText(cVar.b("label_setting", "Settings"));
            bdVar.f25574k.setText(cVar.b(f.f17510a.d(), "Change MPIN"));
        }

        public final void L2(Context context, k7 k7Var) {
            l.f(context, "context");
            l.f(k7Var, "binding");
            c cVar = new c(context);
            k7Var.f27097l.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            k7Var.f27098m.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            k7Var.f27095j.f28308i.setText(cVar.b("rc_release", context.getString(R.string.rc_release)));
            k7Var.f27096k.setText(cVar.b("release_details", context.getString(R.string.release_details)));
            k7Var.f27094i.setText(cVar.b("release_date", context.getString(R.string.release_date)));
            k7Var.f27091f.setHint(cVar.b("release_date", context.getString(R.string.release_date)));
            k7Var.f27092g.setText(cVar.b("file_reference_no", context.getString(R.string.file_reference_no)));
            k7Var.f27092g.setText(cVar.b("file_reference_no", context.getString(R.string.file_reference_no)));
            k7Var.f27090e.setHint(cVar.b("file_reference_no", context.getString(R.string.file_reference_no)));
            k7Var.f27087b.setText(cVar.b("approved_by", context.getString(R.string.approved_by)));
            k7Var.f27089d.setHint(cVar.b("approved_by", context.getString(R.string.approved_by)));
            k7Var.f27088c.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final String M(Context context, String str, String str2) {
            String str3;
            l.f(context, "context");
            l.f(str, "service_code");
            l.f(str2, "serve_value");
            c cVar = new c(context);
            if (str.equals("111")) {
                str3 = "label_challan_status";
            } else if (str.equals("112")) {
                str3 = "label_challan_payment";
            } else if (str.equals("113")) {
                str3 = "label_verify_challan_payment";
            } else if (str.equals("114")) {
                str3 = "label_challan_download";
            } else if (!str.equals("115")) {
                return str2;
            } else {
                str3 = "View_Payment_Receipt";
            }
            return String.valueOf(cVar.b(str3, str2));
        }

        public final void M0(Context context, l2 l2Var) {
            l.f(context, "context");
            l.f(l2Var, "dl_extract");
            c cVar = new c(context);
            l2Var.J.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            l2Var.J.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            l2Var.J.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            l2Var.J.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            l2Var.J.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            l2Var.R.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            l2Var.N.setText(cVar.b("title_dl_serv_detail_extr", context.getString(R.string.extract_dl_details)));
            l2Var.P.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.reason)));
            l2Var.B.setHint(cVar.b("edit_dl_serv_sel_reason", context.getString(R.string.sel_rsn)));
            l2Var.D.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            l2Var.K.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void M1(Context context, j8 j8Var) {
            l.f(context, "context");
            l.f(j8Var, "binding");
            c cVar = new c(context);
            j8Var.f26990m.setText(cVar.b("label_shared_rc", context.getString(R.string.shared_rc)));
            j8Var.f26983f.setHint(cVar.b("enter_the_mobile_number", context.getString(R.string.enter_the_mobile_number)));
            j8Var.f26987j.setText(cVar.b("label_shared_rc", context.getString(R.string.shared_rc)));
        }

        public final void M2(Context context, d9 d9Var) {
            l.f(context, "context");
            l.f(d9Var, "binding");
            c cVar = new c(context);
            d9Var.f25923s.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            d9Var.f25924t.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            d9Var.f25920p.f28308i.setText(cVar.b("rc_Surrender", context.getString(R.string.rc_surrender)));
            d9Var.f25921q.setText(cVar.b("apply_for_rc_surrender", context.getString(R.string.apply_for_rc_surrender)));
            d9Var.f25922r.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            d9Var.f25915k.setHint(cVar.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            d9Var.f25912h.setText(cVar.b("rp_optional_details", context.getString(R.string.optional_details)));
            d9Var.f25916l.setText(cVar.b("vahan_label_rc", context.getString(R.string.f19027rc)));
            d9Var.f25911g.setText(cVar.b("fitness_certificate", context.getString(R.string.fitness_certificate)));
            d9Var.f25913i.setText(cVar.b("rc_Surrender_Permit", context.getString(R.string.permit)));
            d9Var.f25906b.setText(cVar.b("applying_for_tax_exemption", context.getString(R.string.applying_for_tax_exemption)));
            d9Var.f25917m.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            d9Var.f25918n.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            d9Var.f25907c.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            d9Var.f25910f.setHint(cVar.b("enter_rc_serial_no", "Enter rc serial no."));
            d9Var.f25908d.setHint(cVar.b("enter_fitness_certificate_no", "Enter Fitness certificate no"));
            d9Var.f25909e.setHint(cVar.b("rc_Surr_enter_PermitNo", "Enter permit no"));
        }

        public final void N(Context context, x9 x9Var) {
            l.f(context, "context");
            l.f(x9Var, "binding");
            c cVar = new c(context);
            AppCompatTextView appCompatTextView = x9Var.f29394j;
            f.a aVar = f.f17510a;
            appCompatTextView.setText(cVar.b(aVar.d(), "Change MPIN"));
            x9Var.f29389e.setHint(cVar.b(aVar.s(), context.getString(R.string.enter_old_mpin)));
            x9Var.f29388d.setHint(cVar.b(aVar.r(), context.getString(R.string.enter_new_mpin)));
            x9Var.f29387c.setHint(cVar.b(aVar.h(), context.getString(R.string.confirm_new_mpin)));
            x9Var.f29386b.setText(cVar.b(aVar.d(), "Change MPIN"));
        }

        public final void N0(Context context, r4 r4Var) {
            l.f(context, "context");
            l.f(r4Var, "binding");
            c cVar = new c(context);
            r4Var.f28374e.setText(cVar.b("lbl_State_Name", context.getString(R.string.state_name)));
            r4Var.f28371b.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            r4Var.f28377h.setHint(cVar.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            r4Var.f28372c.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void N1(Context context, gc gcVar) {
            l.f(context, "context");
            l.f(gcVar, "binding");
            c cVar = new c(context);
            gcVar.f26542h.setText(cVar.b("title_sign_in_to", context.getString(R.string.sing_in_into)));
            gcVar.f26543i.setText(cVar.b("title_your_account", context.getString(R.string.your_account)));
            gcVar.f26540f.setText(cVar.b("title_sign_desc", context.getString(R.string.sign_in_txt)));
            gcVar.f26536b.setText(cVar.b("label_signin", context.getString(R.string.sing_in)));
            gcVar.f26541g.setText(cVar.b("btn_new_mparivahan", context.getString(R.string.new_to_app)));
            gcVar.f26537c.setText(cVar.b("title_create_account", context.getString(R.string.creat_acc)));
        }

        public final void N2(Context context, n7 n7Var) {
            l.f(context, "context");
            l.f(n7Var, "binding");
            c cVar = new c(context);
            n7Var.f27629w.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            n7Var.f27630x.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            n7Var.f27610d.setText(cVar.b("authorization_details", context.getString(R.string.authorization_details)));
            n7Var.f27624r.setText(cVar.b("previous_permit_no", context.getString(R.string.previous_permit_no)));
            n7Var.f27623q.setHint(cVar.b("enter_previous_permit_no", context.getString(R.string.enter_previous_permit_no)));
            n7Var.f27625s.setHint(cVar.b("enter_previous_registration_no", context.getString(R.string.enter_previous_registration_no)));
            n7Var.f27626t.setText(cVar.b("previous_registration_no", context.getString(R.string.previous_registration_no)));
            n7Var.f27620n.setText(cVar.b("previous_authorization_upto", context.getString(R.string.previous_authorization_upto)));
            n7Var.f27617k.setHint(cVar.b("enter_previous_authorization_order_no", context.getString(R.string.enter_previous_authorization_order_no)));
            n7Var.f27616j.setText(cVar.b("previous_authorization_form", context.getString(R.string.previous_authorization_form)));
            n7Var.f27615i.setHint(cVar.b("enter_previous_authorization_form", context.getString(R.string.enter_previous_authorization_form)));
            n7Var.f27616j.setText(cVar.b("previous_authorization_form", context.getString(R.string.previous_authorization_form)));
            n7Var.f27615i.setHint(cVar.b("enter_previous_authorization_form", context.getString(R.string.enter_previous_authorization_form)));
            n7Var.f27622p.setText(cVar.b("previous_issuing_date", context.getString(R.string.previous_issuing_date)));
            n7Var.f27621o.setHint(cVar.b("enter_previous_issuing_date", context.getString(R.string.enter_previous_issuing_date)));
            n7Var.f27614h.setText(cVar.b("previous_authorization_upto", context.getString(R.string.period_details)));
            n7Var.f27611e.setHint(cVar.b("enter_authorization_upto", context.getString(R.string.enter_authorization_upto)));
            n7Var.f27609c.setText(cVar.b("allotment_office", context.getString(R.string.allotment_office)));
            n7Var.f27608b.setHint(cVar.b("enter_allotment_office", context.getString(R.string.enter_allotment_office)));
            n7Var.f27613g.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            n7Var.f27619m.setHint(cVar.b("enter_previous_authorization_upto", context.getString(R.string.enter_previous_authorization_upto)));
            n7Var.f27612f.setText(cVar.b("authorization_upto", context.getString(R.string.authorization_upto)));
            n7Var.f27618l.setText(cVar.b("previous_authorization_order_no", context.getString(R.string.previous_authorization_order_no)));
        }

        public final String O(Context context, String str) {
            String str2;
            String str3;
            String b10;
            String str4;
            l.f(context, "context");
            l.f(str, "serve_value");
            c cVar = new c(context);
            if (str.equals("View Fee Receipt")) {
                str4 = "label_view_fee_Receipt";
            } else if (str.equals("902")) {
                str4 = "lbl_Verify_Payment_Status";
            } else if (p.o(str, "Hypothecation Addition", true)) {
                str4 = "hypothecation_addition";
            } else if (p.o(str, "Hypothecation Termination", true)) {
                str4 = "hypothecation_termination";
            } else if (p.o(str, "Hypothecation Continuation", true)) {
                str4 = "hypothecation_continuation";
            } else if (str.equals("RC Particulars against Fee")) {
                str4 = "lbl_rc_particular_against_fee";
            } else if (p.o(str, "Change of Address in RC", true)) {
                str4 = "change_of_address_in_rc2";
            } else if (p.o(str, "No Objection Certificate (NOC)", true)) {
                str4 = "no_objection_certificate_noc";
            } else if (str.equals("104")) {
                str4 = "update_Mobile_No";
            } else if (p.o(str, "Issue of Duplicate RC", true)) {
                str4 = "issue_of_duplicate_rc";
            } else if (str.equals("Dispose Application")) {
                str4 = "vahan_dispose_application";
            } else if (str.equals("Application Status") || str.equals("Application Status")) {
                b10 = cVar.b("label_application_status", str);
                return String.valueOf(b10);
            } else if (str.equals("View Forms")) {
                str4 = "label_view_forms";
            } else {
                if (str.equals(context.getString(R.string.duplicate_fitness))) {
                    str3 = "duplicate_FitnessCert";
                    str2 = context.getString(R.string.duplicate_fitness);
                } else if (p.o(str, "Duplicate Permit Certificate", true)) {
                    str2 = context.getString(R.string.duplicate_permit_certificate);
                    str3 = "duplicate_Permit";
                } else if (p.o(str, "RC Surrender", true)) {
                    str2 = context.getString(R.string.rc_surrender);
                    str3 = "rc_Surrender";
                } else {
                    str2 = "RC Cancellation";
                    if (p.o(str, str2, true)) {
                        str3 = "rc_cancellation";
                    } else {
                        str2 = "Pay Tax";
                        if (p.o(str, str2, true)) {
                            str3 = "pay_TaxService";
                        } else {
                            str2 = "Tax Assessment";
                            if (p.o(str, str2, true)) {
                                str3 = "tax_Assessment";
                            } else {
                                str2 = "RC Release";
                                if (p.o(str, str2, true)) {
                                    str3 = "rc_release";
                                } else {
                                    str2 = "Temporary Permit";
                                    if (p.o(str, str2, true)) {
                                        str3 = "temporary_permit";
                                    } else {
                                        str2 = "Renewal of NP Authorization Permit";
                                        if (p.o(str, str2, true)) {
                                            str3 = "renewalNpAuthorization_Permit";
                                        } else {
                                            str2 = "Permit Renewal";
                                            if (p.o(str, str2, true)) {
                                                str3 = "rp_header_title";
                                            } else {
                                                str2 = "Transfer of Ownership";
                                                if (p.o(str, str2, true)) {
                                                    str3 = "toSellerBuyer";
                                                } else {
                                                    str2 = "Alteration of Vehicle";
                                                    if (p.o(str, str2, true)) {
                                                        str3 = "altVh_ServiceName";
                                                    } else {
                                                        str2 = "Miscellaneous Fee Payment";
                                                        if (p.o(str, str2, true)) {
                                                            str3 = "misc_FeePayment";
                                                        } else {
                                                            str2 = "Compounding Fee Payment";
                                                            if (p.o(str, str2, true)) {
                                                                str3 = "comp_FeePayment";
                                                            } else {
                                                                str2 = "Addition of Nominee";
                                                                if (p.o(str, str2, true)) {
                                                                    str3 = "to_nominee_header";
                                                                } else {
                                                                    str2 = "Update Mobile No";
                                                                    if (p.o(str, str2, true)) {
                                                                        str3 = "label_dl_serv_update_mob";
                                                                    } else {
                                                                        str2 = "RC Services";
                                                                        if (!p.o(str, str2, true)) {
                                                                            return str;
                                                                        }
                                                                        str3 = "rcServices";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b10 = cVar.b(str3, str2);
                return String.valueOf(b10);
            }
            b10 = cVar.b(str4, str);
            return String.valueOf(b10);
        }

        public final void O0(Context context, s4 s4Var) {
            l.f(context, "context");
            l.f(s4Var, "binding");
            c cVar = new c(context);
            s4Var.f28509g.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            s4Var.A.setText(cVar.b("btn_pay_now", context.getString(R.string.pay_now)));
            s4Var.I.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_number)));
            s4Var.J.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            s4Var.f28506d.setText(cVar.b("description", context.getString(R.string.description)));
            s4Var.f28525w.setText(cVar.b("service_charges", context.getString(R.string.service_charges)));
            s4Var.f28508f.setText(cVar.b("fee_amount", context.getString(R.string.fee_amount)));
            s4Var.f28514l.setText(cVar.b("fine_amount", context.getString(R.string.fine_amount)));
            s4Var.E.setText(cVar.b("total_amount", context.getString(R.string.total_amount)));
            s4Var.f28516n.setText(cVar.b("new_current_address", context.getString(R.string.new_current_address)));
            s4Var.f28517o.setText(cVar.b("new_permanent_address", context.getString(R.string.new_permanent_address)));
            s4Var.f28528z.setText(cVar.b("skip", context.getString(R.string.skip)));
            s4Var.f28522t.f26534g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            s4Var.f28522t.f26531d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            s4Var.f28522t.f26530c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            s4Var.f28522t.f26533f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void O1(Context context, fc fcVar) {
            l.f(context, "context");
            l.f(fcVar, "binding");
            c cVar = new c(context);
            fcVar.f26346g.setText(Q0(context));
            fcVar.f26359t.setText(cVar.b("title_sign_in_to", context.getString(R.string.sing_in_into)));
            EditText editText = fcVar.f26349j;
            f.a aVar = f.f17510a;
            editText.setHint(cVar.b(aVar.n(), context.getString(R.string.six_pin)));
            fcVar.f26358s.setText(cVar.b(aVar.b(), "Generate MPIN"));
            fcVar.f26348i.setHint(cVar.b("label_log_entr_mob_no", "Enter the Mobile Number"));
            fcVar.f26360u.setText(cVar.b("title_your_account", context.getString(R.string.your_account)));
            fcVar.f26343d.setText(cVar.b("label_another_account", context.getString(R.string.use_another)));
            fcVar.f26345f.setText(cVar.b("label_forgot_mpin", context.getString(R.string.forgot_pin)));
            fcVar.f26357r.setText(cVar.b("butt_signin_mpin", context.getString(R.string.sign_in_pin)));
            fcVar.f26356q.setText(cVar.b("label_dont_account", context.getString(R.string.dont_have_account)));
            fcVar.f26354o.setText(cVar.b("label_signup", context.getString(R.string.sign_up)));
        }

        public final void O2(Context context, p7 p7Var) {
            l.f(context, "context");
            l.f(p7Var, "binding");
            c cVar = new c(context);
            p7Var.f27969j.setText(cVar.b("rp_previousPermit_detail", context.getString(R.string.previous_permit_details)));
            p7Var.I.f28308i.setText(cVar.b("Renewal_Permit", "Renewal of State Permit"));
            p7Var.f27975p.setText(cVar.b("rp_previousPermit_detail", context.getString(R.string.permit_no)));
            p7Var.f27974o.setHint(cVar.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            p7Var.f27979t.setText(cVar.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            p7Var.f27978s.setHint(cVar.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            p7Var.f27981v.setText(cVar.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            p7Var.f27980u.setHint(cVar.b("enter_permit_valid_upto", context.getString(R.string.enter_permit_valid_upto)));
            p7Var.f27976q.setText(cVar.b("permit_type", context.getString(R.string.permit_type)));
            p7Var.f27972m.setText(cVar.b("rp_permitCategory", context.getString(R.string.permit_category)));
            p7Var.M.setText(cVar.b("rp_mode", context.getString(R.string.yearly_mode)));
            p7Var.f27971l.setText(cVar.b("temp_select_period", context.getString(R.string.period)));
            p7Var.f27970k.setText(cVar.b("temp_select_period", context.getString(R.string.period)));
            p7Var.f27961b.setText(cVar.b("allotment_office", context.getString(R.string.allotment_office)));
            p7Var.G.setText(cVar.b("services_type", context.getString(R.string.services_type)));
            p7Var.f27968i.setText(cVar.b("temp_NatureGoodsCarried", context.getString(R.string.nature_of_goods_to_be_carried)));
            p7Var.f27965f.setText(cVar.b("temp_Goods", context.getString(R.string.goods)));
            p7Var.f27963d.setHint(cVar.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_detail_if_goods_is_other_please_mention_here)));
            p7Var.f27983x.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            p7Var.f27966g.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void P(Context context, x xVar) {
            Context context2 = context;
            x xVar2 = xVar;
            l.f(context2, "context");
            l.f(xVar2, "cn");
            c cVar = new c(context2);
            xVar2.P.setText(cVar.b("view_cl_det", context2.getString(R.string.view_cl_details)));
            xVar2.N.setText(cVar.b("label_dl_serv_reason", context2.getString(R.string.reason)));
            xVar2.M.setText(cVar.b("new_name", context2.getString(R.string.new_name)));
            xVar2.R.setText(cVar.b("first_name", context2.getString(R.string.first_name)));
            xVar2.S.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            xVar2.f29249b0.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            xVar2.f29250c0.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            xVar2.X.setText(cVar.b("last_name", context2.getString(R.string.last_name)));
            xVar2.Y.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            xVar2.T.setText(cVar.b("full_name", context2.getString(R.string.full_name_txt)));
            xVar2.U.setHint(cVar.b("enter_full_name", context2.getString(R.string.enter_full_name_as_per_record)));
            xVar2.f29252e0.setText(cVar.b("relation", context2.getString(R.string.relation_is)));
            xVar2.Q.setText(cVar.b("first_name", context2.getString(R.string.first_name)));
            xVar2.f29251d0.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            xVar2.Z.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            xVar2.f29248a0.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            xVar2.V.setText(cVar.b("last_name", context2.getString(R.string.last_name)));
            xVar2.W.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            xVar2.G.setText(cVar.b("vahan_btn_cancel", context2.getString(R.string.cancel)));
            xVar2.A.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.submit)));
        }

        public final void P0(Context context, ac acVar) {
            l.f(context, "context");
            l.f(acVar, "binding");
            c cVar = new c(context);
            acVar.f25330f.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            acVar.f25349y.setText(cVar.b("btn_pay_now", context.getString(R.string.pay_now)));
            acVar.G.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_number)));
            acVar.H.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            acVar.f25346v.setText(cVar.b("service_charges", context.getString(R.string.service_charges)));
            acVar.f25329e.setText(cVar.b("fee_amount", context.getString(R.string.fee_amount)));
            acVar.f25335k.setText(cVar.b("fine_amount", context.getString(R.string.fine_amount)));
            acVar.C.setText(cVar.b("total_amount", context.getString(R.string.total_amount)));
            acVar.f25337m.setText(cVar.b("new_current_address", context.getString(R.string.new_current_address)));
            acVar.f25338n.setText(cVar.b("new_permanent_address", context.getString(R.string.new_permanent_address)));
            acVar.f25348x.setText(cVar.b("skip", context.getString(R.string.skip)));
            acVar.f25343s.f26534g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            acVar.f25343s.f26531d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            acVar.f25343s.f26530c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            acVar.f25343s.f26533f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void P1(Context context, h3 h3Var) {
            l.f(context, "context");
            l.f(h3Var, "slot");
            c cVar = new c(context);
            h3Var.f26605z.setText(cVar.b("label_avaialble", context.getString(R.string.app_details)));
            h3Var.H.setText(cVar.b("label_app_booking_successfully", context.getString(R.string.app_booking_successful)));
            h3Var.I.setText(cVar.b("label_app_date", context.getString(R.string.app_date)));
            h3Var.J.setText(cVar.b("label_app_time", context.getString(R.string.app_time)));
            h3Var.A.setText(cVar.b("view_slip", context.getString(R.string.app_slip)));
            h3Var.E.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void P2(Context context, o7 o7Var) {
            l.f(context, "context");
            l.f(o7Var, "binding");
            c cVar = new c(context);
            o7Var.f27782r.f28308i.setText(cVar.b("Renewal_Permit", "Renewal of State Permit"));
            o7Var.f27766b.setText(cVar.b("rp_previousPermit_detail", context.getString(R.string.previous_permit_details)));
            o7Var.f27785u.setText(cVar.b("within_gujarat", context.getString(R.string.within_gujarat)));
            o7Var.f27774j.setText(cVar.b("rp_otherArea", context.getString(R.string.other_area)));
            o7Var.f27768d.setText(cVar.b("rp_otherArea", context.getString(R.string.area_selected)));
            o7Var.f27773i.setText(cVar.b("rp_optional_details", context.getString(R.string.optional_details)));
            o7Var.f27771g.setText(cVar.b("rp_parking_title", context.getString(R.string.parking_place)));
            o7Var.f27770f.setHint(cVar.b("rp_parking", context.getString(R.string.enter_parking_place)));
            o7Var.f27777m.setText(cVar.b("rp_purpose_title", context.getString(R.string.purpose_of_journey)));
            o7Var.f27776l.setHint(cVar.b("rp_purpose_journey", context.getString(R.string.enter_purpose_of_journey)));
            o7Var.f27779o.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            o7Var.f27772h.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void Q(Context context, h0 h0Var) {
            Context context2 = context;
            h0 h0Var2 = h0Var;
            l.f(context2, "context");
            l.f(h0Var2, "cn");
            c cVar = new c(context2);
            h0Var2.f26587p.f27679b.setText(cVar.b("logo_dl_details", context2.getString(R.string.dl_det)));
            h0Var2.f26587p.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context2.getString(R.string.dms_upload_doc)));
            h0Var2.f26587p.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context2.getString(R.string.upload_photo_signature)));
            h0Var2.f26587p.f27681d.setText(cVar.b("logo_dl_fee_details", context2.getString(R.string.fee_details)));
            h0Var2.f26587p.f27683f.setText(cVar.b("logo_dl_appointment_book", context2.getString(R.string.app_booking)));
            h0Var2.J.setText(cVar.b("title_dl_serv_view_details", context2.getString(R.string.view_dl_details)));
            h0Var2.f26595x.setText(cVar.b("label_dl_serv_reason", context2.getString(R.string.reason)));
            h0Var2.f26594w.setText(cVar.b("new_name", context2.getString(R.string.new_name)));
            h0Var2.B.setText(cVar.b("first_name", context2.getString(R.string.first_name)));
            h0Var2.f26576e.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            h0Var2.H.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            h0Var2.f26584m.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            h0Var2.F.setText(cVar.b("last_name", context2.getString(R.string.last_name)));
            h0Var2.f26580i.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            h0Var2.C.setText(cVar.b("full_name", context2.getString(R.string.full_name_txt)));
            h0Var2.D.setHint(cVar.b("enter_full_name", context2.getString(R.string.enter_full_name_as_per_record)));
            h0Var2.I.setText(cVar.b("relation", context2.getString(R.string.relation_is)));
            h0Var2.A.setText(cVar.b("first_name", context2.getString(R.string.first_name)));
            h0Var2.f26589r.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            h0Var2.G.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            h0Var2.f26591t.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            h0Var2.E.setText(cVar.b("last_name", context2.getString(R.string.last_name)));
            h0Var2.f26590s.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            h0Var2.f26588q.setText(cVar.b("vahan_btn_cancel", context2.getString(R.string.cancel)));
            h0Var2.f26579h.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.submit)));
        }

        public final String Q0(Context context) {
            l.f(context, "context");
            c cVar = new c(context);
            if (p.p(cVar.d(), "gujarati", false, 2, (Object) null)) {
                return "બાયોમેટ્રિક સાથે લોગિન કરો";
            }
            if (p.p(cVar.d(), "bengali", false, 2, (Object) null)) {
                return "বায়োমেট্রিক দিয়ে লগইন করুন";
            }
            if (p.p(cVar.d(), "hindi", false, 2, (Object) null)) {
                return "बायोमेट्रिक से लॉगिन करें";
            }
            if (p.p(cVar.d(), "tamil", false, 2, (Object) null)) {
                return "பயோமெட்ரிக் மூலம் உள்நுழைக";
            }
            return p.p(cVar.d(), "malayalam", false, 2, (Object) null) ? "ബയോമെട്രിക് ഉപയോഗിച്ച് ലോഗിൻ ചെയ്യുക" : "Login with Biometric";
        }

        public final void Q1(Context context, z2 z2Var) {
            l.f(context, "context");
            l.f(z2Var, "slot");
            c cVar = new c(context);
            z2Var.N.f26523c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            z2Var.N.f26524d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            z2Var.N.f26527g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            z2Var.N.f26525e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            z2Var.N.f26522b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            z2Var.f29631x.setText(cVar.b("label_avaialble", context.getString(R.string.available)));
            z2Var.f29633z.setText(cVar.b("label_booked", context.getString(R.string.booked)));
            z2Var.G.setText(cVar.b("label_holiday", context.getString(R.string.holiday)));
            z2Var.M.setText(cVar.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void Q2(Context context, fd fdVar) {
            l.f(context, "context");
            l.f(fdVar, "binding");
            c cVar = new c(context);
            fdVar.P.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            fdVar.Q.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            fdVar.N.setText(cVar.b("allotment_office", context.getString(R.string.allotment_office)));
            fdVar.L.setText(cVar.b("temp_period_Mode", context.getString(R.string.period_mode)));
            fdVar.M.setText(cVar.b("temp_select_period", context.getString(R.string.period)));
            fdVar.J.setText(cVar.b("temp_validFrmDate", context.getString(R.string.valid_from_date)));
            fdVar.f26367e.setText(cVar.b("temp_validFrmDate", context.getString(R.string.valid_from_date)));
            fdVar.F.setText(cVar.b("temp_trvelFrom", context.getString(R.string.travel_from)));
            fdVar.E.setHint(cVar.b("temp_trvelFrom", context.getString(R.string.travel_from)));
            fdVar.H.setText(cVar.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            fdVar.G.setHint(cVar.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            fdVar.H.setText(cVar.b("temp_trvelUpTo", context.getString(R.string.travel_upto)));
            fdVar.f26376n.setText(cVar.b("temp_NatureGoodsCarried", context.getString(R.string.nature_of_goods_to_be_carried)));
            fdVar.f26370h.setText(cVar.b("temp_Goods", context.getString(R.string.goods)));
            fdVar.f26368f.setText(cVar.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_details_if_goods_is_other_please_mention_here)));
            fdVar.f26371i.setHint(cVar.b("temp_Goods_DetailsDesc", context.getString(R.string.goods_details)));
            fdVar.f26385w.setText(cVar.b("temp_Goods_DetailPlaceHolder", context.getString(R.string.goods_details)));
            fdVar.f26388z.setHint(cVar.b("temp_RouteDesc", context.getString(R.string.route_description)));
            fdVar.f26383u.setText(cVar.b("temp_PurposeJourney", context.getString(R.string.purpose_of_journey)));
            fdVar.f26387y.setText(cVar.b("temp_routLength", context.getString(R.string.route_length)));
            fdVar.f26386x.setHint(cVar.b("temp_routLength", context.getString(R.string.route_length)));
            fdVar.C.setText(cVar.b("temp_ServiceType", context.getString(R.string.services_types)));
            fdVar.f26365c.setText(cVar.b("add_passanger_list", context.getString(R.string.add_passanger_list)));
            fdVar.f26366d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            fdVar.R.setText(cVar.b("view_added_passanger", context.getString(R.string.view_added_passanger)));
            fdVar.K.setText(cVar.b("temp_validUptoDate", context.getString(R.string.valid_upto_date)));
            fdVar.O.setText(cVar.b("temp_validUptoDate", context.getString(R.string.valid_upto_date)));
        }

        public final void R(Context context, z zVar) {
            Context context2 = context;
            z zVar2 = zVar;
            l.f(context2, "context");
            l.f(zVar2, "cn");
            c cVar = new c(context2);
            zVar2.L.setText(cVar.b("view_ll", context2.getString(R.string.view_ll_details)));
            MyTextView myTextView = zVar2.K;
            myTextView.setText(cVar.b("label_dl_serv_reason", "Reason") + " * ");
            zVar2.I.setText(cVar.b("new_name", context2.getString(R.string.new_name)));
            TextView textView = zVar2.N;
            textView.setText(cVar.b("first_name", "First Name") + " * ");
            zVar2.O.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            zVar2.X.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            zVar2.Y.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            zVar2.T.setText(cVar.b("last_name", "Last Name"));
            zVar2.U.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            zVar2.P.setText(cVar.b("full_name", context2.getString(R.string.full_name_txt)));
            zVar2.Q.setHint(cVar.b("enter_full_name", context2.getString(R.string.enter_full_name_as_per_record)));
            TextView textView2 = zVar2.f29616a0;
            textView2.setText(cVar.b("relation", "Relation") + " * ");
            TextView textView3 = zVar2.M;
            textView3.setText(cVar.b("first_name", "First Name") + " * ");
            zVar2.Z.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.first_name)));
            zVar2.V.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            zVar2.W.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            zVar2.R.setText(cVar.b("last_name", "Last Name"));
            zVar2.S.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            zVar2.E.setText(cVar.b("vahan_btn_cancel", context2.getString(R.string.cancel)));
            zVar2.f29619y.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.submit)));
        }

        public final void R0(Context context, t4 t4Var) {
            l.f(context, "context");
            l.f(t4Var, "hillreg");
            c cVar = new c(context);
            t4Var.L.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            t4Var.L.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            t4Var.L.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            t4Var.L.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            t4Var.L.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            t4Var.O.setText(cVar.b("endor_to_drive", context.getString(R.string.endor_to_drive)));
            t4Var.R.setText(cVar.b("certificate_number", context.getString(R.string.certificate_number)));
            t4Var.f28672x.setHint(cVar.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            t4Var.T.setText(cVar.b("doi", context.getString(R.string.issue_date)));
            t4Var.U.setHint(cVar.b("enter_issue_date", context.getString(R.string.enter_issue_date)));
            t4Var.Y.setText(cVar.b("valid_to_date", context.getString(R.string.valid_to_date)));
            t4Var.X.setHint(cVar.b("valid_to_date", context.getString(R.string.valid_to_date)));
            t4Var.Q.setText(cVar.b("issued_by", context.getString(R.string.issued_by)));
            t4Var.P.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            t4Var.f28670a0.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            t4Var.J.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            t4Var.K.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            t4Var.E.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            t4Var.N.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            t4Var.Z.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
        }

        public final void R1(Context context, xd xdVar) {
            l.f(context, "context");
            l.f(xdVar, "binding");
            c cVar = new c(context);
            xdVar.f29428p.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            xdVar.f29426n.setText(cVar.b("friday_13_november", context.getString(R.string.friday_13_november)));
            xdVar.f29423k.setText(cVar.b("selected_date", context.getString(R.string.selected_date)));
            xdVar.f29420h.setText(cVar.b("view_Details", context.getString(R.string.view_Details)));
            xdVar.f29417e.f27014b.setText(cVar.b("label_avaialble", "Available"));
            xdVar.f29417e.f27015c.setText(cVar.b("label_booked", "Booked"));
            xdVar.f29417e.f27016d.setText(cVar.b("label_holiday", "Holiday"));
            xdVar.f29425m.f28308i.setText(cVar.b("lbl_Book_Appointment", "Book Appointment"));
        }

        public final void R2(Context context, rd rdVar) {
            l.f(context, "context");
            l.f(rdVar, "binding");
            c cVar = new c(context);
            rdVar.f28478z.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            rdVar.A.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            rdVar.f28476x.setText(cVar.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            rdVar.f28470r.f28308i.setText(cVar.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            rdVar.f28475w.setText(cVar.b("lbl_Hypothecation_Addition_Details", context.getString(R.string.vahan_hypothecation_add_details)));
            rdVar.f28477y.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            rdVar.f28474v.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            rdVar.f28460h.setHint(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            rdVar.f28473u.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            rdVar.f28459g.setHint(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            rdVar.f28472t.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            rdVar.f28462j.setText(cVar.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            rdVar.f28461i.setHint(cVar.b("lbl_Enter_the_House_no", context.getString(R.string.enter_the_house_no)));
            rdVar.C.setText(cVar.b("village_town_city", context.getString(R.string.village_town_city)));
            rdVar.B.setHint(cVar.b("lbl_Enter_the_Village_Town_City", context.getString(R.string.enter_the_village_town_city)));
            rdVar.f28465m.setText(cVar.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            rdVar.f28464l.setHint(cVar.b("lbl_Enter_the_Landmark_Police_station", context.getString(R.string.enter_the_landmark_police_station)));
            rdVar.f28469q.setText(cVar.b("vahan_state", context.getString(R.string.state)));
            rdVar.f28457e.setText(cVar.b("label_dl_serv_district", context.getString(R.string.district)));
            rdVar.f28466n.setText(cVar.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            rdVar.f28456d.setHint(cVar.b("lbl_Enter_the_pincode", context.getString(R.string.enter_the_pincode)));
            rdVar.f28471s.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            rdVar.f28458f.setHint(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            rdVar.f28454b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            rdVar.f28467o.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            rdVar.f28467o.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            rdVar.f28467o.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            rdVar.f28467o.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final String S(Context context, String str, String str2) {
            String str3;
            l.f(context, "context");
            l.f(str, "service_code");
            l.f(str2, "serve_value");
            c cVar = new c(context);
            if (str.equals("2002")) {
                str3 = "fancyNo_AvailableStatus";
            } else if (str.equals("2003")) {
                str3 = "fancyNo_AucStatus";
            } else if (str.equals("2004")) {
                str3 = "FancyNo_FeeReceipt";
            } else if (str.equals("2005")) {
                str3 = "fancyNo_ViewAllotmentLetter";
            } else if (str.equals("2001")) {
                str3 = "pucc_header_download";
            } else if (str.equals("2007")) {
                str3 = "checkPostReceiptStatus";
            } else if (str.equals("2008")) {
                str3 = "cp_header_download_receipt";
            } else if (!str.equals("2006")) {
                return str2;
            } else {
                str3 = "fancyNo_ShowAuctionStatus";
            }
            return String.valueOf(cVar.b(str3, str2));
        }

        public final void S0(Context context, sd sdVar) {
            l.f(context, "context");
            l.f(sdVar, "binding");
            c cVar = new c(context);
            sdVar.F.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            sdVar.G.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            sdVar.f28594z.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            sdVar.f28588t.f28308i.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            sdVar.f28579k.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            sdVar.E.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            sdVar.f28593y.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            sdVar.f28592x.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            sdVar.f28591w.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            sdVar.f28590v.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            sdVar.f28580l.setText(cVar.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            sdVar.D.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            sdVar.B.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            sdVar.A.setText(cVar.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            sdVar.C.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            sdVar.f28572d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            sdVar.f28585q.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            sdVar.f28585q.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            sdVar.f28585q.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            sdVar.f28585q.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void S1(Context context, yd ydVar) {
            l.f(context, "context");
            l.f(ydVar, "binding");
            c cVar = new c(context);
            ydVar.f29614f.setText(cVar.b("download_appointment_receipt", context.getString(R.string.download_appointment_receipt)));
            ydVar.f29611c.setText(cVar.b("label_home", context.getString(R.string.home)));
            ydVar.f29615g.f28308i.setText(cVar.b("download_appointment_receipt", "Download Appointment Receipt"));
        }

        public final void S2(Context context, f9 f9Var) {
            l.f(context, "context");
            l.f(f9Var, "binding");
            c cVar = new c(context);
            f9Var.f26324n.f28308i.setText(cVar.b("label_dl_serv_update_mob", context.getString(R.string.update_mobile_no)));
            f9Var.f26321k.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            f9Var.f26318h.setHint(cVar.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            f9Var.f26312b.setText(cVar.b("vahan_chassis_no", context.getString(R.string.chassis_no)));
            f9Var.f26313c.setHint(cVar.b("vahan_enter_chassis_no", context.getString(R.string.enter_chasis_no)));
            f9Var.f26314d.setText(cVar.b("vahan_engine_no", context.getString(R.string.engine_no)));
            f9Var.f26315e.setHint(cVar.b("lbl_vahan_enter_engine_no", context.getString(R.string.enter_engine_no)));
            f9Var.f26320j.setText(cVar.b("registration_date", context.getString(R.string.registration_dt)));
            f9Var.f26319i.setHint(cVar.b("dd_mm_yyyy", context.getString(R.string.dd_mm_yyyy)));
            f9Var.f26322l.setText(cVar.b("lbl_vahan_registration_upto_date", context.getString(R.string.registration_upto_date)));
            f9Var.f26323m.setHint(cVar.b("dd_mm_yyyy", context.getString(R.string.dd_mm_yyyy)));
            f9Var.f26317g.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            f9Var.f26316f.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final String T(Context context, String str, String str2) {
            String str3;
            String b10;
            l.f(context, "context");
            l.f(str, "service_code");
            l.f(str2, "serve_value");
            c cVar = new c(context);
            if (str.equals("901")) {
                str3 = "label_view_fee_Receipt";
            } else if (str.equals("902")) {
                str3 = "lbl_Verify_Payment_Status";
            } else if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                str3 = "hypothecation_addition";
            } else if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
                str3 = "hypothecation_termination";
            } else if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
                str3 = "hypothecation_continuation";
            } else if (str.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
                str3 = "lbl_rc_particular_against_fee";
            } else if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
                str3 = "change_of_address_in_rc2";
            } else if (str.equals(VContant.NOC_PURPOSE_CODE)) {
                str3 = "no_objection_certificate_noc";
            } else if (str.equals("104")) {
                str3 = "update_Mobile_No";
            } else if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                str3 = "issue_of_duplicate_rc";
            } else if (str.equals("102")) {
                str3 = "vahan_dispose_application";
            } else if (str.equals("103")) {
                str3 = "label_application_status";
            } else if (str.equals("903")) {
                str3 = "label_view_forms";
            } else if (str.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE)) {
                str3 = "duplicate_FitnessCert";
            } else if (p.o(str, VContant.DUPLICATE_PERMIT_PURPOSE_CODE, true)) {
                str3 = "duplicate_Permit";
            } else if (p.o(str, VContant.RC_SURRENDER_PURPOSE_CODE, true)) {
                str3 = "rc_Surrender";
            } else if (p.o(str, VContant.RC_CACELLATION_PURPOSE_CODE, true)) {
                str3 = "rc_cancellation";
            } else if (p.o(str, VContant.Tax_PURPOSE_CODE, true) || p.o(str, "101", true)) {
                str3 = "pay_TaxService";
            } else if (p.o(str2, "Tax Assessment", true)) {
                b10 = cVar.b("tax_Assessment", "Tax Assessment");
                return String.valueOf(b10);
            } else if (p.o(str, VContant.RC_RELEASE_PURPOSE_CODE, true)) {
                str3 = "rc_release";
            } else if (p.o(str, VContant.TempPermit_PURPOSE_CODE, true)) {
                str3 = "temporary_permit";
            } else if (p.o(str, VContant.RenewalNpAuthorization_CODE, true)) {
                str3 = "renewalNpAuthorization_Permit";
            } else if (p.o(str, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE, true)) {
                str3 = "rp_header_title";
            } else if (p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true)) {
                str3 = "toSellerBuyer";
            } else if (p.o(str, VContant.ALTERATION_PURPOSE_CODE, true)) {
                str3 = "altVh_ServiceName";
            } else if (p.o(str, VContant.MISELL_PURPOSE_CODE, true)) {
                str3 = "misc_FeePayment";
            } else if (p.o(str, VContant.NOMINEE_PURPOSE_CODE, true)) {
                str3 = "to_nominee_header";
            } else if (p.o(str, "907", true)) {
                str3 = "download_Noc";
            } else if (p.o(str, "904", true)) {
                str3 = "btn_Download_Appointment_Slip";
            } else if (p.o(str, VContant.MULTISERVICE_PURPOSE_CODE, true)) {
                str3 = "multipleServices";
            } else if (p.o(str, "910", true)) {
                str3 = "download_fitness_cert";
            } else if (!p.o(str, VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE, true)) {
                return str2;
            } else {
                str3 = "comp_FeePayment";
            }
            b10 = cVar.b(str3, str2);
            return String.valueOf(b10);
        }

        public final void T0(Context context, db dbVar) {
            l.f(context, "context");
            l.f(dbVar, "binding");
            c cVar = new c(context);
            dbVar.G.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            dbVar.H.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            dbVar.A.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            dbVar.f25949u.f28308i.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            dbVar.f25939k.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            dbVar.F.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            dbVar.f25954z.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            dbVar.f25953y.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            dbVar.f25952x.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            dbVar.f25951w.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            dbVar.f25940l.setText(cVar.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            dbVar.E.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            dbVar.C.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            dbVar.B.setText(cVar.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            dbVar.D.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            dbVar.f25932d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            dbVar.f25945q.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            dbVar.f25945q.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            dbVar.f25945q.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            dbVar.f25945q.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void T1(Context context, k8 k8Var) {
            l.f(context, "context");
            l.f(k8Var, "binding");
            c cVar = new c(context);
            k8Var.f27115q.setText(cVar.b("Emergency_Service", "Emergency Service"));
            k8Var.f27102d.setText(cVar.b("create_ep", "Create Emergency Profile"));
            k8Var.f27119u.setText(cVar.b("quick_access", "For quick access during an emergency, add emergency contact"));
            k8Var.f27120v.setText(cVar.b("manage_contact", "Manage Contact"));
            k8Var.f27117s.setText(cVar.b("Call_Ambulance", "Call Ambulance"));
            k8Var.f27121w.setText(cVar.b("tap_102", "Tap here to dial 102"));
            k8Var.f27122x.setText(cVar.b("tap_contacts", "Tap To Notify Contacts"));
        }

        public final void T2(Context context, ab abVar) {
            l.f(context, "context");
            l.f(abVar, "binding");
            c cVar = new c(context);
            abVar.f25276b0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            abVar.f25278c0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            abVar.f25275b.setText(cVar.b("btn_dl_serv_close", context.getString(R.string.close)));
            abVar.I0.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_details)));
            abVar.f25315v.setText(cVar.b("owner_details", context.getString(R.string.owner_details)));
            abVar.f25276b0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            abVar.f25318w0.setText(cVar.b("relation", context.getString(R.string.relation)));
            abVar.A0.setText(cVar.b("as_per_aadhar", context.getString(R.string.as_per_aadhar)));
            abVar.f25278c0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            abVar.f25279d.setText(cVar.b("current_address", context.getString(R.string.current_add)));
            abVar.f25321y.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_details)));
            abVar.F0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            abVar.E0.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_category)));
            abVar.P.setText(cVar.b("maker_name", context.getString(R.string.maker_name)));
            abVar.N.setText(cVar.b("maker_model", context.getString(R.string.maker_model)));
            abVar.f25314u0.setText(cVar.b("registration_date", context.getString(R.string.registration_date)));
            abVar.f25307r.setText(cVar.b("fuel_type", context.getString(R.string.fuel_type)));
            abVar.Z.setText(cVar.b("norms_description", context.getString(R.string.norms_description)));
            abVar.f25303p.setText(cVar.b("fitness_valid_upto", context.getString(R.string.fitness_valid_upto)));
            abVar.f25320x0.setText(cVar.b("tax_valid_upto", context.getString(R.string.tax_valid_upto)));
            abVar.f25319x.setText(cVar.b("pucc_details", context.getString(R.string.pucc_details)));
            abVar.f25310s0.setText(cVar.b("pucc_valid_upto", context.getString(R.string.pucc_valid_upto)));
            abVar.f25311t.setText(cVar.b("insurance_details", context.getString(R.string.insurance_details)));
            abVar.C.setText(cVar.b("insurance_policy_no", context.getString(R.string.insurance_policy_no)));
            abVar.A.setText(cVar.b("insurance_company_name", context.getString(R.string.insurance_company_name)));
            abVar.E.setText(cVar.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            abVar.f25313u.setText(cVar.b("financer_details", context.getString(R.string.financer_details)));
            abVar.f25295l.setText(cVar.b("financed_from", context.getString(R.string.financed_from)));
            abVar.f25317w.setText(cVar.b("permit_details", context.getString(R.string.permit_details)));
            abVar.f25290i0.setText(cVar.b("permit_no", context.getString(R.string.permit_no)));
            abVar.f25294k0.setText(cVar.b("permit_type", context.getString(R.string.permit_type)));
            abVar.f25286g0.setText(cVar.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            abVar.f25300n0.setText(cVar.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            abVar.f25304p0.setText(cVar.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            abVar.S.setText(cVar.b("national_permit_no", context.getString(R.string.national_permit_no)));
            abVar.Q.setText(cVar.b("national_permit_issued_by", context.getString(R.string.national_permit_issued_by)));
            abVar.V.setText(cVar.b("national_permit_valid_upto", context.getString(R.string.national_permit_valid_upto)));
        }

        public final void U(Context context, f0 f0Var) {
            l.f(context, "context");
            l.f(f0Var, "binding");
            c cVar = new c(context);
            f0Var.f26172c.setText(cVar.b("btn_ok", context.getString(R.string.text_ok)));
            f0Var.f26171b.setText(cVar.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
        }

        public final void U0(Context context, db dbVar) {
            l.f(context, "context");
            l.f(dbVar, "binding");
            c cVar = new c(context);
            dbVar.G.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            dbVar.H.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            dbVar.A.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            dbVar.f25949u.f28308i.setText(cVar.b("hypothecation_continuation", context.getString(R.string.vahan_hypothecation_continuation)));
            dbVar.f25939k.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            dbVar.F.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            dbVar.f25954z.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            dbVar.f25953y.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            dbVar.f25952x.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            dbVar.f25951w.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            dbVar.f25940l.setText(cVar.b("vahan_hypothecation_continuation_details", context.getString(R.string.vahan_hypothecation_continuation_details)));
            dbVar.E.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            dbVar.C.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            dbVar.B.setText(cVar.b("vahan_term_branch_add", context.getString(R.string.vahan_term_branch_add)));
            dbVar.D.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            dbVar.f25932d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            dbVar.f25945q.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            dbVar.f25945q.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            dbVar.f25945q.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            dbVar.f25945q.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void U1(Context context, j6 j6Var) {
            l.f(context, "context");
            l.f(j6Var, "st");
            c cVar = new c(context);
            j6Var.E.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            j6Var.D.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void U2(Context context, h9 h9Var) {
            l.f(context, "context");
            l.f(h9Var, "binding");
            c cVar = new c(context);
            h9Var.f26651o.setText(cVar.b("button_verify", context.getString(R.string.verify)));
            h9Var.f26648l.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            h9Var.f26650n.setText(cVar.b("edit_mobile_no", context.getString(R.string.otp_sent)));
            h9Var.f26642f.setHint(cVar.b("edit_enter_otp", context.getString(R.string.otp_sent)));
            h9Var.f26653q.setText(cVar.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            h9Var.f26649m.setText(cVar.b("label_refresh_close", context.getString(R.string.ref_close)));
            h9Var.f26651o.setText(cVar.b("label_get_otp", context.getString(R.string.verify)));
            h9Var.f26647k.setText(cVar.b("button_verify", context.getString(R.string.did_not_get_otp)));
            h9Var.f26645i.setText(cVar.b("label_resend_otp", context.getString(R.string.resend_otp)));
            h9Var.f26639c.setText(cVar.b("button_verify", context.getString(R.string.verify)));
        }

        public final void V(Context context, i0 i0Var) {
            l.f(context, "context");
            l.f(i0Var, "binding");
            c cVar = new c(context);
            i0Var.f26764h.f28452f.setText(cVar.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            i0Var.E.setText(cVar.b("lbl_State_Name", context.getString(R.string.state_name)));
            i0Var.F.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            i0Var.N.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            i0Var.f26777u.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            i0Var.f26768l.setText(cVar.b("paymentDate", context.getString(R.string.payment_date)));
            i0Var.K.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            i0Var.I.setText(cVar.b("cp_vehicle_type", context.getString(R.string.vehcile_type)));
            i0Var.f26763g.setText(cVar.b("vahan_chassis_no", context.getString(R.string.chasis_no)));
            i0Var.f26780x.setText(cVar.b("lbl_tax_from", context.getString(R.string.tax_from)));
            i0Var.D.setText(cVar.b("tax_upto", context.getString(R.string.tax_upto)));
            i0Var.f26760d.setText(cVar.b("vahan_amount", context.getString(R.string.amount)));
            i0Var.A.setText(cVar.b("tax_mode", context.getString(R.string.tax_mode)));
            i0Var.f26771o.setText(cVar.b("cp_payment_mode", context.getString(R.string.payment_mode)));
            i0Var.f26774r.setText(cVar.b("vahan_payment_status", context.getString(R.string.payment_status)));
        }

        public final void V0(Context context, td tdVar) {
            l.f(context, "context");
            l.f(tdVar, "binding");
            c cVar = new c(context);
            tdVar.H.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            tdVar.I.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            tdVar.B.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            tdVar.f28768v.f28308i.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            tdVar.f28759m.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            tdVar.G.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            tdVar.A.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            tdVar.f28772z.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            tdVar.f28771y.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            tdVar.f28770x.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            tdVar.f28760n.setText(cVar.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            tdVar.F.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            tdVar.D.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            tdVar.E.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            tdVar.f28750d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            tdVar.f28765s.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            tdVar.f28765s.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            tdVar.f28765s.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            tdVar.f28765s.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void V1(Context context, u6 u6Var) {
            l.f(context, "context");
            l.f(u6Var, "nominee");
            c cVar = new c(context);
            u6Var.f28824c.setText(cVar.b("to_nominee_header", context.getString(R.string.add_nominee_detail_s)));
            u6Var.f28826e.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            u6Var.f28825d.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            u6Var.G.setText(cVar.b("add_NomnName", context.getString(R.string.nominee_name)));
            u6Var.f28840s.setHint(cVar.b("enterAdd_NomnName", context.getString(R.string.enter_nominee_name)));
            u6Var.F.setText(cVar.b("to_nominee_relation", context.getString(R.string.select_relation_with_nominee)));
            u6Var.E.setText(cVar.b("to_nomineeDOB_title", context.getString(R.string.nominee_date_of_birth)));
            u6Var.f28838q.setText(cVar.b("to_nominee_dob", context.getString(R.string.enter_nominee_date_of_birth)));
        }

        public final void V2(Context context, ce ceVar) {
            l.f(context, "context");
            l.f(ceVar, "binding");
            c cVar = new c(context);
            ceVar.f25793e.setText(cVar.b("label_view_challan", context.getString(R.string.view_challan)));
            ceVar.f25791c.setText(cVar.b("label_no_challan_found", context.getString(R.string.no_challan_found)));
        }

        public final void W(Context context, j0 j0Var) {
            l.f(context, "context");
            l.f(j0Var, "binding");
            c cVar = new c(context);
            j0Var.f26904k.f28308i.setText(cVar.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            j0Var.f26898e.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            j0Var.f26907n.setText(cVar.b("label_challan_vehicle_no", context.getString(R.string.vehicle_no)));
            j0Var.f26897d.setHint(cVar.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_no)));
            j0Var.f26902i.setText(cVar.b("cp_for_state", context.getString(R.string.for_state)));
            j0Var.f26895b.setHint(cVar.b("enter_vehicle_no", context.getString(R.string.enter_vehicle_no)));
            j0Var.f26896c.setText(cVar.b("vahan_get_details", context.getString(R.string.get_details)));
        }

        public final void W0(Context context, cb cbVar) {
            l.f(context, "context");
            l.f(cbVar, "binding");
            c cVar = new c(context);
            cbVar.I.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            cbVar.J.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            cbVar.C.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            cbVar.f25758w.f28308i.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            cbVar.f25748m.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            cbVar.H.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            cbVar.B.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            cbVar.A.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            cbVar.f25761z.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            cbVar.f25760y.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            cbVar.f25749n.setText(cVar.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            cbVar.G.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            cbVar.E.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            cbVar.F.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            cbVar.f25739d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            cbVar.f25754s.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            cbVar.f25754s.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            cbVar.f25754s.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            cbVar.f25754s.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void W1(Context context, va vaVar) {
            l.f(context, "context");
            l.f(vaVar, "binding");
            c cVar = new c(context);
            vaVar.f29058g.setText(cVar.b("label_challan_no_trans_found", "No transaction found"));
            vaVar.f29059h.setText(cVar.b(f.f17510a.W(), "There is no Transaction (s) found \n for your account"));
        }

        public final void W2(Context context, de deVar) {
            l.f(context, "context");
            l.f(deVar, "binding");
            c cVar = new c(context);
            deVar.f26001r0.setText(cVar.b("v_dl_l", context.getString(R.string.v_r_d)));
            deVar.A.setText(cVar.b("indian_lic", context.getString(R.string.indian_lic)));
            deVar.G.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            deVar.S.setText(cVar.b("validity_nt", context.getString(R.string.validity_nt)));
            deVar.f25999q0.setText(cVar.b("validity_nt", context.getString(R.string.validity)));
            deVar.O.setText(cVar.b("label_name", context.getString(R.string.name)));
            deVar.f25973d0.setText(cVar.b("label_sdf", context.getString(R.string.relation)));
            deVar.f25970c.setText(cVar.b("address", context.getString(R.string.address)));
            deVar.f26010y.setText(cVar.b("date_of_birth", context.getString(R.string.dob)));
            deVar.f26009x.setText(cVar.b("date_of_birth", context.getString(R.string.dob)));
            deVar.f25976f.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            deVar.f25976f.setText(cVar.b("Licensing_authority", context.getString(R.string.registering_auth_l)));
            deVar.f26003s0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            deVar.H.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            deVar.f25968b.setText(cVar.b("aadhaarNo", context.getString(R.string.aadhaar_no)));
            deVar.f25972d.setText(cVar.b("authority_sign", context.getString(R.string.authority_sign)));
            deVar.f25980h.setText(cVar.b("My_Virtual_RC", context.getString(R.string.My_Virtual_RC)));
            deVar.f25982i.setText(cVar.b("My_Virtual_DL", context.getString(R.string.My_Virtual_DL)));
            deVar.f25977f0.setText(cVar.b("share", context.getString(R.string.menu_share)));
            deVar.I.setText(cVar.b("label_virtual_documents", "Virtual Documents"));
            deVar.f25981h0.setText(cVar.b("label_shared_rc", context.getString(R.string.shared_rc)));
            deVar.f25969b0.setText(cVar.b("label_received_rc", context.getString(R.string.received_rc)));
            deVar.N.setText(cVar.b("my_rc", context.getString(R.string.my_rc)));
        }

        public final void X(Context context, k0 k0Var) {
            l.f(context, "context");
            l.f(k0Var, "binding");
            c cVar = new c(context);
            k0Var.f27065j.f28308i.setText(cVar.b("checkPostReceiptStatus", context.getString(R.string.verify_check_post_details)));
            k0Var.f27060e.setHint(cVar.b("enter_FancyRecpNo", context.getString(R.string.enter_receipt_number)));
            k0Var.f27062g.setText(cVar.b("label_search", context.getString(R.string.search)));
            k0Var.f27066k.setText(cVar.b("total_checkpost_status", context.getString(R.string.total_checkpost_status)));
            k0Var.f27058c.setText(cVar.b("total_checkpost_status", context.getString(R.string.no_checkpost_receipt_found)));
        }

        public final void X0(Context context, cb cbVar) {
            l.f(context, "context");
            l.f(cbVar, "binding");
            c cVar = new c(context);
            cbVar.I.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            cbVar.J.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            cbVar.C.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            cbVar.f25758w.f28308i.setText(cVar.b("hypothecation_termination", context.getString(R.string.vahan_hypothecation_termination)));
            cbVar.f25748m.setText(cVar.b("vahan_hypothecation_details", context.getString(R.string.vahan_hypothecation_details)));
            cbVar.H.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            cbVar.B.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            cbVar.A.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            cbVar.f25761z.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            cbVar.f25760y.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            cbVar.f25749n.setText(cVar.b("vahan_hypothecation_termination_details", context.getString(R.string.vahan_hypothecation_termination_details)));
            cbVar.G.setText(cVar.b("vahan_termination_bank_name", context.getString(R.string.vahan_termination_bank_name)));
            cbVar.E.setText(cVar.b("vahan_term_branch_name", context.getString(R.string.vahan_term_branch_name)));
            cbVar.F.setText(cVar.b("vahan_term_noc_date", context.getString(R.string.vahan_term_noc_date)));
            cbVar.f25739d.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            cbVar.f25754s.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            cbVar.f25754s.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            cbVar.f25754s.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            cbVar.f25754s.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void X1(Context context, t8 t8Var) {
            l.f(context, "context");
            l.f(t8Var, "binding");
            c cVar = new c(context);
            com.nic.mparivahan.MyTextView myTextView = t8Var.K;
            f.a aVar = f.f17510a;
            myTextView.setText(cVar.b(aVar.Y0(), "View Profile"));
            t8Var.f28697g.setText(cVar.b(aVar.m(), "Edit Profile"));
            t8Var.f28708r.setText(cVar.b("edit_mobile_no", "Mobile No."));
            t8Var.E.setText(cVar.b("label_name", "Name"));
            t8Var.A.setText(cVar.b("Email_id", "Email Id"));
            t8Var.f28714x.setText(cVar.b("vahan_state", "State"));
            t8Var.G.f25961g.setText(cVar.b("my_profile", "My Profile"));
        }

        public final void X2(Context context, q9 q9Var) {
            l.f(context, "context");
            l.f(q9Var, "binding");
            c cVar = new c(context);
            com.nic.mparivahan.MyTextView myTextView = q9Var.f28237k0;
            f.a aVar = f.f17510a;
            myTextView.setText(cVar.b(aVar.L(), context.getString(R.string.name)));
            q9Var.f28220c.setText(cVar.b("vahan_chassis_no", "Chassis No."));
            q9Var.f28228g.setText(cVar.b("vahan_engine_no", "Engine No."));
            q9Var.O.setText(cVar.b(aVar.J(), "Model Name"));
            q9Var.B0.setText(cVar.b(aVar.V0(), "Vehicle Description"));
            q9Var.f28224e.setText(cVar.b("color", "Color"));
            q9Var.f28221c0.setText(cVar.b(aVar.o0(), "Seat Capacity"));
            q9Var.f28227f0.setText(cVar.b(aVar.y0(), "Standing Capacity"));
            q9Var.f28232i.setText(cVar.b(aVar.v(), "Financier"));
            q9Var.f28248q.setText(cVar.b("insurance_company", "Insurance Company"));
            q9Var.f28254t.setText(cVar.b("insurance_policy_no", "Insurance Policy No."));
            q9Var.Z.setText(cVar.b(aVar.l0(), "Registering Authority"));
            q9Var.f28245o0.setText(cVar.b("permit_valid_upto", "Permit Valid UpTo"));
            q9Var.f28241m0.setText(cVar.b("national_permit_valid_upto", "National Permit Valid UpTo"));
            q9Var.f28265y0.setText(cVar.b("label_virtual_rc", context.getString(R.string.virtual_rc)));
            q9Var.f28243n0.setText(cVar.b("owner_details", context.getString(R.string.owner_details)));
            q9Var.X.setText(cVar.b("relation", context.getString(R.string.relation)));
            q9Var.M.setText(cVar.b("maker_name", context.getString(R.string.rc_maker_desc)));
            q9Var.V.setText(cVar.b("registration_date", context.getString(R.string.registration_dt)));
            q9Var.f28231h0.setText(cVar.b("tax_valid_upto", context.getString(R.string.valid_upto_t)));
            q9Var.f28267z0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            q9Var.B0.setText(cVar.b(aVar.V0(), context.getString(R.string.vehicle_desc)));
            q9Var.f28240m.setText(cVar.b("fuel_type", context.getString(R.string.fuel_type)));
            q9Var.f28224e.setText(cVar.b("color", context.getString(R.string.color)));
            q9Var.f28256u.setText(cVar.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            q9Var.f28236k.setText(cVar.b("fitness_valid_upto", context.getString(R.string.fitness_up)));
            q9Var.H.setText(cVar.b("pucc_no", context.getString(R.string.pucc_number)));
            q9Var.I.setText(cVar.b("pucc_valid_upto", context.getString(R.string.pucc)));
            q9Var.f28239l0.setText(cVar.b("national_permit_no", context.getString(R.string.national_permit_new)));
            q9Var.f28241m0.setText(cVar.b("national_permit_valid_upto", context.getString(R.string.national_permit_upto)));
            q9Var.f28235j0.setText(cVar.b("black_list_status", context.getString(R.string.black_list_status)));
            q9Var.f28246p.setText(cVar.b("vehicle_impound_status", context.getString(R.string.tap_check_impound)));
            q9Var.f28261w0.setText(cVar.b("vehicle_impound", context.getString(R.string.vehicle_impound)));
            q9Var.f28263x0.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            q9Var.f28257u0.setText(cVar.b("seizure_doc_details", context.getString(R.string.seizure_doc_details)));
            q9Var.C.setText(cVar.b("notes_new", context.getString(R.string.notes_new)));
            q9Var.D.setText(cVar.b("note1", context.getString(R.string.note1)));
            q9Var.f28218b.setText(cVar.b("SAVE_AND_RETURN", context.getString(R.string.save_and_return)));
            q9Var.P.setText(cVar.b("emmission_norm_lbl", "Emission Norm"));
        }

        public final void Y(Context context, l0 l0Var) {
            l.f(context, "context");
            l.f(l0Var, "binding");
            c cVar = new c(context);
            l0Var.Q.setText(cVar.b("personal_details", context.getString(R.string.personal_details)));
            l0Var.f27234p0.setText(cVar.b(f.f17510a.L(), context.getString(R.string.name)));
            l0Var.f27225g0.setText(cVar.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            l0Var.f27231m0.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            l0Var.f27221c0.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            l0Var.f27219a0.setText(cVar.b("address", context.getString(R.string.address)));
            l0Var.V.setText(cVar.b("licence_details", context.getString(R.string.licence_details)));
            l0Var.f27227i0.setText(cVar.b("licence_details", context.getString(R.string.conductor_driving_license_numb)));
            l0Var.f27229k0.setText(cVar.b("validity_nt", context.getString(R.string.validity)));
            l0Var.f27222d0.setText(cVar.b("issue_date", context.getString(R.string.doi)));
            TextView textView = l0Var.f27224f0;
            textView.setText(cVar.b("stay_duration", "Duration of stay at present Address") + " * ");
            l0Var.f27236r0.setHint(cVar.b("year_txt", context.getString(R.string.year)));
            l0Var.f27233o0.setHint(cVar.b("month_txt", context.getString(R.string.month)));
            l0Var.Z.setText(cVar.b("mother_name", "Mother Name"));
            l0Var.E.setHint(cVar.b("enter_mother_name", context.getString(R.string.enter_mother_name)));
            TextView textView2 = l0Var.W;
            textView2.setText(cVar.b("mar_status", "Marital Status") + " * ");
            TextView textView3 = l0Var.Y;
            textView3.setText(cVar.b("appl_religion", "Religion") + " * ");
            TextView textView4 = l0Var.R;
            textView4.setText(cVar.b("label_dl_serv_birth_place", "Birth Place") + " * ");
            l0Var.F.setHint(cVar.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enterbirthplace)));
            TextView textView5 = l0Var.S;
            textView5.setText(cVar.b("category", "Category") + " * ");
            TextView textView6 = l0Var.X;
            textView6.setText(cVar.b("lbl_Police_Station", "Police Station") + " * ");
            TextView textView7 = l0Var.U;
            textView7.setText(cVar.b("lbl_Police_Station", "Criminal History") + " * ");
            l0Var.A.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            l0Var.B.setText(cVar.b("button_proceed", context.getString(R.string.proceed)));
        }

        public final void Y0(Context context, w4 w4Var) {
            l.f(context, "context");
            l.f(w4Var, "idp");
            c cVar = new c(context);
            w4Var.f29155i0.f26334b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            w4Var.f29155i0.f26335c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            w4Var.f29155i0.f26339g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            w4Var.f29155i0.f26336d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            w4Var.f29155i0.f26338f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            w4Var.f29158l0.setText(cVar.b("label_international_driv_permit", context.getString(R.string.international_driving_permit)));
            w4Var.f29156j0.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            w4Var.T.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            w4Var.K0.setText(cVar.b("label_app_category", context.getString(R.string.app_category)));
            w4Var.L0.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            w4Var.V.setText(cVar.b("label_dl_serv_rto", context.getString(R.string.rto)));
            w4Var.f29164r0.setText(cVar.b("label_dl_serv_birth_place", context.getString(R.string.birth_place)));
            w4Var.U.setHint(cVar.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enter_birth_place)));
            w4Var.f29163q0.setText(cVar.b("label_dl_serv_birth_country", context.getString(R.string.birth_country)));
            w4Var.E.setHint(cVar.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            w4Var.F0.setText(cVar.b("label_dl_serv_pass_no", context.getString(R.string.passport_no)));
            w4Var.f29153g0.setHint(cVar.b("edit_dl_serv_enter_pass_no", context.getString(R.string.select_possport)));
            w4Var.H0.setText(cVar.b("label_dl_serv_valid_upto", context.getString(R.string.pass_valid_to)));
            w4Var.f29154h0.setHint(cVar.b("edit_dl_serv_selc_pass_valid", context.getString(R.string.select_possport_val)));
            w4Var.D0.setText(cVar.b("label_dl_serv_disqu_dl_drive", context.getString(R.string.txt_issue_international_disquilified_for_dl)));
            w4Var.Y.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            w4Var.W.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            w4Var.B.setHint(cVar.b("label_dl_serv_what_reason", context.getString(R.string.if_so_what_reason)));
            w4Var.C0.setText(cVar.b("label_dl_serv_barred_curr_count_drive", context.getString(R.string.txt_iidp_reasonSecond)));
            w4Var.f29148b0.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            w4Var.X.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            w4Var.D.setHint(cVar.b("label_dl_serv_what_reason", context.getString(R.string.if_so_what_reason)));
            w4Var.f29166t0.setText(cVar.b("label_dl_serv_count_visa_grant", context.getString(R.string.country_for_which_visa_is_granted)));
            w4Var.H.setHint(cVar.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            w4Var.G.setText(cVar.b("label_dl_serv_click_restr_countr", context.getString(R.string.click_here_to_view_the_list_of_restricted_countries)));
            w4Var.I0.setText(cVar.b("label_dl_serv_visa_no", context.getString(R.string.rep_declaration)));
            w4Var.M0.setHint(cVar.b("edit_dl_serv_enter_visa_no", context.getString(R.string.visa_no)));
            w4Var.J0.setText(cVar.b("label_dl_serv_valid_upto", context.getString(R.string.valid_upto_v2)));
            w4Var.N0.setHint(cVar.b("edit_dl_serv_selc_visa_valid", context.getString(R.string.select_visa_val)));
            w4Var.f29167u0.setText(cVar.b("label_dl_serv_cov_grades_idp", context.getString(R.string.cov_grades_for_which_idp_is_requested)));
            w4Var.F.setHint(cVar.b("edit_dl_serv_selc_cov_grade", context.getString(R.string.select_cov_val)));
            w4Var.f29171x.setText(cVar.b("check_dl_serv_im_indian_embas", context.getString(R.string.indian_amb)));
            w4Var.f29174y0.setText(cVar.b("label_dl_serv_indian_embas_name", context.getString(R.string.ind_emm_name)));
            w4Var.Q.setHint(cVar.b("edit_dl_serv_enter_ind_embas_name", context.getString(R.string.enter_indian_amb)));
            w4Var.f29176z0.setText(cVar.b("label_dl_serv_embas_place", context.getString(R.string.ind_emm_place)));
            w4Var.R.setHint(cVar.b("edit_dl_serv_enter_embas_place", context.getString(R.string.enter_indian_amb_place)));
            w4Var.A0.setText(cVar.b("label_dl_serv_fore_nat_mob_no", context.getString(R.string.for_nat_mn)));
            w4Var.O.setHint(cVar.b("edit_dl_serv_enter_fore_mob_no", context.getString(R.string.enter_indian_amb_number)));
            w4Var.f29170w0.setText(cVar.b("Email_id", context.getString(R.string.idp_email)));
        }

        public final void Y1(Context context, s9 s9Var) {
            l.f(context, "context");
            l.f(s9Var, "binding");
            c cVar = new c(context);
            s9Var.f28549e.f28308i.setText(cVar.b("label_application_status", "Application Status"));
            s9Var.f28548d.setText(cVar.b("vahan_application_no", "Application Number"));
            s9Var.f28560p.setText(cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            s9Var.f28546b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            s9Var.f28554j.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            s9Var.f28550f.setText(cVar.b("lbl_vahan_chassisNo_full", "Enter Full Chassis No."));
            s9Var.f28553i.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            s9Var.f28551g.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            s9Var.f28556l.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
            s9Var.f28558n.setHint(cVar.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            s9Var.f28557m.setHint(cVar.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void Z(Context context, n0 n0Var) {
            l.f(context, "context");
            l.f(n0Var, "binding");
            c cVar = new c(context);
            n0Var.f27512e0.setText(cVar.b("personal_details", context.getString(R.string.personal_details)));
            n0Var.W.setText(cVar.b(f.f17510a.L(), context.getString(R.string.name)));
            n0Var.U.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            n0Var.f27511d0.setText(cVar.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            n0Var.X.setText(cVar.b("con_lic_info", context.getString(R.string.coi)));
            n0Var.f27510c0.setText(cVar.b("validity_nt", context.getString(R.string.validity)));
            n0Var.f27508a0.setText(cVar.b("label_dl_serv_issue_authority", context.getString(R.string.issue_authority)));
            n0Var.f27509b0.setText(cVar.b("label_challan_pay_status", context.getString(R.string.status)));
            n0Var.f27509b0.setText(cVar.b("label_challan_pay_status", context.getString(R.string.status)));
            n0Var.N.setText(cVar.b("btn_dl_serv_close", context.getString(R.string.close)));
        }

        public final void Z0(Context context, a5 a5Var) {
            l.f(context, "context");
            l.f(a5Var, "binding");
            c cVar = new c(context);
            a5Var.N.setText(cVar.b("label_dl_serv_state", context.getString(R.string.state)));
            a5Var.M.setHint(cVar.b("edit_dl_serv_selc_state", context.getString(R.string.select_state)));
            a5Var.L.setText(cVar.b("label_dl_serv_rto", context.getString(R.string.rto)));
            a5Var.Q.setText(cVar.b("submit_without_aadhar", context.getString(R.string.submit_without_aadhaar_authentication)));
            a5Var.P.setText(cVar.b("submit_with_aadhar", context.getString(R.string.submit_via_aadhaar_authentication)));
            a5Var.G.setText(cVar.b("applicant_mob_no", context.getString(R.string.applicant_mobile_no)));
            a5Var.F.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            a5Var.I.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            a5Var.C.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void Z1(Context context, ob obVar) {
            l.f(context, "context");
            l.f(obVar, "binding");
            c cVar = new c(context);
            obVar.f27859k.f28308i.setText(cVar.b("label_application_status", "Application Status"));
            obVar.f27858j.setText(cVar.b("vahan_application_no", "Application Number"));
            obVar.f27857i.setText(cVar.b("label_applicant_name", "Applicant Name"));
            obVar.f27852e.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            obVar.f27854f.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            obVar.F.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            obVar.P.setText(cVar.b("lbl_State_Name", context.getString(R.string.state_name)));
            obVar.I.setText(cVar.b("vahan_rto_name", context.getString(R.string.rto)));
            obVar.W.setText(cVar.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            obVar.X.setText(cVar.b("label_transaction_status", context.getString(R.string.transaction_status)));
            obVar.f27867s.setText(cVar.b("vahan_fee_payment", context.getString(R.string.fee_payment)));
            obVar.f27845a0.setText(cVar.b("vahan_upload_document", context.getString(R.string.upload_doc)));
            obVar.K.setText(cVar.b("vahan_slot_booking", context.getString(R.string.slot_booking)));
            obVar.f27869u.setText(cVar.b("label_challan_pending", context.getString(R.string.pending_1)));
            obVar.O.setText(cVar.b("label_challan_pending", context.getString(R.string.pending_1)));
            obVar.f27853e0.setText(cVar.b("label_challan_pending", context.getString(R.string.pending_1)));
            obVar.L.setText(cVar.b("lbl_Book_Appointment", context.getString(R.string.slot1)));
            obVar.f27865q.setText(cVar.b("btn_pay_now", context.getString(R.string.paynow)));
            obVar.Z.setText(cVar.b("vahan_upload_document", context.getString(R.string.update_doc1)));
        }

        public final void a(Context context, d dVar) {
            l.f(context, "context");
            l.f(dVar, "binding");
            c cVar = new c(context);
            dVar.f25805l.setText(cVar.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            dVar.f25804k.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            dVar.f25806m.setText(cVar.b("cs_repAccdnt_regaccHistory", "Reported Accident History"));
            dVar.f25809p.setText(cVar.b("cs_repAccdnt_lastRepAccdnt", "Last Accident Report"));
            dVar.f25808o.setText(cVar.b("cs_repAccdnt_AccdntID", "Accident ID"));
            dVar.f25813t.setText(cVar.b("vehicle_number", context.getString(R.string.vehicle_number)));
            dVar.f25814u.setText(cVar.b("cs_DateTime", "Date &amp; Time"));
            dVar.f25812s.setText(cVar.b("btn_challan_status", context.getString(R.string.status)));
            dVar.f25810q.setText(cVar.b("cs_Location", context.getString(R.string.location_txt)));
            dVar.f25819z.setText(cVar.b("view_details", "View Details"));
        }

        public final void a0(Context context, f6 f6Var) {
            l.f(context, "context");
            l.f(f6Var, "binding");
            c cVar = new c(context);
            f6Var.f26264o.setText(cVar.b("conductor_licence_no", context.getString(R.string.conductor_driving_license_number)));
            f6Var.f26265p.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            f6Var.f26258i.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            f6Var.f26251b.setText(cVar.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            f6Var.f26259j.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            f6Var.f26253d.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void a1(Context context, c5 c5Var) {
            Context context2 = context;
            c5 c5Var2 = c5Var;
            l.f(context2, "context");
            l.f(c5Var2, "binding");
            c cVar = new c(context2);
            c5Var2.f25608h0.setText(cVar.b("label_dl_serv_present_addr", context2.getString(R.string.present_address_sarthi)));
            TextView textView = c5Var2.f25612l0;
            textView.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)) + " *");
            c5Var2.f25625z.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView2 = c5Var2.f25602b0;
            textView2.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)) + " *");
            c5Var2.f25624y.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView3 = c5Var2.f25616p0;
            textView3.setText(cVar.b("select_taluka_sarthi", context2.getString(R.string.select_taluka_sarthi)) + " *");
            c5Var2.f25623x.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            c5Var2.f25601a0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            c5Var2.M.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            c5Var2.f25604d0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            c5Var2.L.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            c5Var2.f25614n0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            c5Var2.P.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView4 = c5Var2.f25606f0;
            textView4.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)) + " *");
            c5Var2.N.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView5 = c5Var2.f25610j0;
            textView5.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)) + " *");
            c5Var2.O.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            c5Var2.X.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            c5Var2.f25609i0.setText(cVar.b("permanent_address", context2.getString(R.string.perm_add_det)));
            TextView textView6 = c5Var2.f25613m0;
            textView6.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)) + " *");
            c5Var2.G.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView7 = c5Var2.f25603c0;
            textView7.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)) + " *");
            c5Var2.F.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView8 = c5Var2.f25617q0;
            textView8.setText(cVar.b("select_taluka_sarthi", context2.getString(R.string.select_taluka_sarthi)) + " *");
            c5Var2.E.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            c5Var2.J.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            c5Var2.I.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            c5Var2.H.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            c5Var2.f25605e0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            c5Var2.A.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            c5Var2.f25615o0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            c5Var2.D.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView9 = c5Var2.f25607g0;
            textView9.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)) + " *");
            c5Var2.B.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView10 = c5Var2.f25611k0;
            textView10.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)) + " *");
            c5Var2.f25622w.setText(cVar.b("button_cancel", context2.getString(R.string.cancel)));
            c5Var2.C.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            c5Var2.Y.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            c5Var2.f25618r0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            c5Var2.Q.setText(cVar.b("stay_duration", context2.getString(R.string.duration_stay_sarthi)));
            c5Var2.f25620t0.setHint(cVar.b("year_txt", context2.getString(R.string.year)));
            c5Var2.V.setHint(cVar.b("month_txt", context2.getString(R.string.month)));
        }

        public final void a2(Context context, oa oaVar) {
            l.f(context, "context");
            l.f(oaVar, "binding");
            c cVar = new c(context);
            oaVar.f27830e.f28308i.setText(cVar.b("download_appointment_receipt", "Download Appointment Slip"));
            oaVar.f27827b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            oaVar.f27834i.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            oaVar.f27832g.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            oaVar.f27839n.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
        }

        public final void b(Context context, ni.e eVar) {
            l.f(context, "context");
            l.f(eVar, "binding");
            c cVar = new c(context);
            TextView textView = eVar.f26023l;
            f.a aVar = f.f17510a;
            textView.setText(cVar.b(aVar.L(), context.getString(R.string.name)));
            eVar.f26022k.setText(cVar.b("Email_id", context.getString(R.string.email_id)));
            eVar.f26021j.setText(cVar.b("cs_FeedbackDesc", "Description ( Max 250 Characters )"));
            eVar.f26015d.setHint(cVar.b(aVar.B(), "Enter feedback ( Minimum 30 Characters )"));
            eVar.f26014c.setText(cVar.b("cs_EnterFeedback", "Send Feedback"));
        }

        public final void b0(Context context, x0 x0Var) {
            l.f(context, "context");
            l.f(x0Var, "ps");
            c cVar = new c(context);
            x0Var.R.f25268c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            x0Var.R.f25269d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            x0Var.R.f25272g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            x0Var.R.f25270e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            x0Var.R.f25267b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            x0Var.X.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            x0Var.f29265i0.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            x0Var.f29266j0.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            x0Var.f29264h0.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            x0Var.f29269m0.setText(cVar.b("label_name", context.getString(R.string.application_date)));
            x0Var.S.setText(cVar.b("label_sdf", context.getString(R.string.sdo_of)));
            x0Var.f29267k0.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            x0Var.f29275s0.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            x0Var.f29268l0.setText(cVar.b("label_Instructions", context.getString(R.string.instructions)));
            x0Var.f29270n0.setText(cVar.b("label_instructions_one", context.getString(R.string.step1)));
            x0Var.f29272p0.setText(cVar.b("label_instructions_three", context.getString(R.string.step3)));
            x0Var.f29273q0.setText(cVar.b("label_instructions_two", context.getString(R.string.step2)));
            x0Var.f29276t0.setText(cVar.b("label_spec_ps", context.getString(R.string.spec_ps)));
            x0Var.f29271o0.setText(cVar.b("label_photo_dimensions", context.getString(R.string.val_one)));
            x0Var.f29274r0.setText(cVar.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            x0Var.f29257a0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            x0Var.f29260d0.setText(cVar.b("label_app_photo", context.getString(R.string.applicant_photo)));
            x0Var.f29258b0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            x0Var.f29259c0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            x0Var.f29262f0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            x0Var.f29263g0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            x0Var.f29280w0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final void b1(Context context, q6 q6Var) {
            l.f(context, "context");
            l.f(q6Var, "binding");
            c cVar = new c(context);
            q6Var.V.setText(cVar.b("name_of_applicant", context.getString(R.string.name_of_applicant_ll)));
            q6Var.f28174y.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            q6Var.F.setHint(cVar.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            q6Var.C.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            q6Var.f28160e0.setText(cVar.b("full_name_as_per_records", context.getString(R.string.full_name_txt)));
            q6Var.f28161f0.setHint(cVar.b("enter_full_name_as_record", context.getString(R.string.enter_full_name_as_per_record)));
            TextView textView = q6Var.f28171p0;
            textView.setText(cVar.b("label_relation", context.getString(R.string.relation_is)) + " *");
            q6Var.f28175z.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            q6Var.G.setHint(cVar.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            q6Var.D.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            TextView textView2 = q6Var.f28162g0;
            textView2.setText(cVar.b("appl_gender", context.getString(R.string.gender)) + " *");
            q6Var.I.setText(cVar.b("appl_female", context.getString(R.string.female)));
            q6Var.K.setText(cVar.b("appl_male", context.getString(R.string.male)));
            q6Var.L.setText(cVar.b("appl_trans", context.getString(R.string.transgender)));
            TextView textView3 = q6Var.Y;
            textView3.setText(cVar.b("lbl_dob", context.getString(R.string.dob_txt)) + " *");
            q6Var.Z.setText(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            q6Var.f28168m0.setText(cVar.b("place_of_birth", context.getString(R.string.birthplace_ll)));
            q6Var.f28169n0.setHint(cVar.b("place_of_birth", context.getString(R.string.birthplace_ll)));
            q6Var.W.setText(cVar.b("country_of_birth", context.getString(R.string.country_birth_ll)));
            AppCompatTextView appCompatTextView = q6Var.f28170o0;
            appCompatTextView.setText(cVar.b("education_qualification", context.getString(R.string.education_qualification_ll)) + " *");
            AppCompatTextView appCompatTextView2 = q6Var.X;
            appCompatTextView2.setText(cVar.b("blood_group", context.getString(R.string.blood_group_sarthi)) + " *");
            q6Var.f28163h0.setText(cVar.b("landline_number", context.getString(R.string.landline_number_sarthi)));
            q6Var.f28156a0.setText(cVar.b("Email_id", context.getString(R.string.email_id)));
            q6Var.f28157b0.setHint(cVar.b("enter_email_id", context.getString(R.string.enter_email)));
            AppCompatTextView appCompatTextView3 = q6Var.T;
            appCompatTextView3.setText(cVar.b("applicant_mob_no", context.getString(R.string.applicant_mobile_no)) + " *");
            q6Var.U.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            q6Var.f28158c0.setText(cVar.b("emergency_mobile_no", context.getString(R.string.emergency_mob_number_ll)));
            q6Var.f28159d0.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            q6Var.f28165j0.setText(cVar.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            q6Var.f28166k0.setHint(cVar.b("ident_mark_1", context.getString(R.string.ll_identification_mark_1)));
            q6Var.f28167l0.setHint(cVar.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
            q6Var.A.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            q6Var.N.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void b2(Context context, qb qbVar) {
            l.f(context, "context");
            l.f(qbVar, "binding");
            c cVar = new c(context);
            qbVar.f28278b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            qbVar.f28284h.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            qbVar.f28280d.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chasis_no_last5_digits)));
            qbVar.f28283g.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            qbVar.f28281e.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            qbVar.f28286j.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
            qbVar.f28288l.setHint(cVar.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            qbVar.f28287k.setHint(cVar.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void c(Context context, ni.f fVar) {
            l.f(context, "context");
            l.f(fVar, "binding");
            c cVar = new c(context);
            fVar.f26165l.setText(cVar.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            fVar.f26164k.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            fVar.f26166m.setText(cVar.b("reported_acc_history", "Reported Accident History"));
            fVar.f26168o.setText(cVar.b("cs_repAccdnt_History", "Accident Report History"));
            fVar.f26159f.setHint(cVar.b("cs_repAccdnt_His_StartDate", "Start Date"));
            fVar.f26158e.setHint(cVar.b("cs_repAccdnt_His_EndDate", "End Date"));
            fVar.f26169p.setHint(cVar.b("cs_show", "Show"));
        }

        public final void c0(Context context, z0 z0Var) {
            l.f(context, "context");
            l.f(z0Var, "binding");
            c cVar = new c(context);
            z0Var.f29626f.setText(cVar.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            z0Var.f29627g.setText(cVar.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            z0Var.f29628h.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            z0Var.f29629i.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void c1(Context context, s6 s6Var) {
            l.f(context, "context");
            l.f(s6Var, "binding");
            c cVar = new c(context);
            MyTextView myTextView = s6Var.f28536x;
            myTextView.setText(cVar.b("label_app_category", context.getString(R.string.app_category)) + " *");
            s6Var.f28531c0.setText(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            s6Var.U.setText(cVar.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            s6Var.f28535w.setText(cVar.b("dl_add_driving_school", context.getString(R.string.add_driving_school)));
            s6Var.f28530b0.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            s6Var.f28534f0.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            s6Var.Q.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            s6Var.W.setText(cVar.b("here_by_declare", context.getString(R.string.self_declartion)));
            s6Var.B.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            s6Var.P.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            s6Var.R.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
        }

        public final void c2(Context context, md mdVar) {
            l.f(context, "context");
            l.f(mdVar, "binding");
            c cVar = new c(context);
            mdVar.f27495p.setText(cVar.b("vahan_upload_document", "Upload Document"));
            mdVar.f27488i.setText(cVar.b("btn_dl_serv_next", "Next"));
            mdVar.f27493n.setText(cVar.b("title_dl_serv_upload_req_doc", "Upload Required Documents"));
            mdVar.f27481b.setText(cVar.b("vahan_application_no", "Application Number"));
            mdVar.f27494o.setText(cVar.b("title_dl_serv_allow_file_size", "Allow file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."));
            mdVar.f27482c.f27885g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            mdVar.f27482c.f27882d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            mdVar.f27482c.f27881c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            mdVar.f27482c.f27884f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void d(Context context, ni.g gVar) {
            l.f(context, "context");
            l.f(gVar, "binding");
            c cVar = new c(context);
            gVar.f26405q.setText(cVar.b("cs_repAccdntReport", context.getString(R.string.register_report)));
            gVar.f26404p.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            gVar.f26406r.setText(cVar.b("reported_acc_history", "Reported Accident History"));
            gVar.f26413y.setText(cVar.b("cs_note", "Note: Video size must be equal or less than 8 MB"));
            gVar.B.setText(cVar.b("cs_repAccdnt_vehicleNo", "Vehicle No. (Max. 10 Characters)"));
            gVar.f26412x.setText(cVar.b("cs_repAccdnt_acdntLocation", "Accident Location (Max. 250 Characters)"));
            gVar.f26411w.setText(cVar.b("cs_date", "Date"));
            gVar.A.setText(cVar.b("cs_time", "Time"));
            gVar.f26414z.setText(cVar.b("vahan_state", "State"));
            gVar.f26410v.setText(cVar.b("cs_repAccdnt_comment", "Comment (Max. 500 Characters)"));
            gVar.f26409u.setText(cVar.b("cs_regBtnTitle", "Register"));
        }

        public final void d0(Context context, a1 a1Var) {
            l.f(context, "context");
            l.f(a1Var, "binding");
            c cVar = new c(context);
            a1Var.f25171w.setText(cVar.b("enter_con_lic_number", context.getString(R.string.enter_conductor_driving_license_number)));
            a1Var.G.setText(cVar.b("conductor_licence_no", context.getString(R.string.conductor_driving_license_number)));
            a1Var.A.setHint(cVar.b("enter_con_lic_number", context.getString(R.string.enter_conductor_driving_license_number)));
            a1Var.f25174z.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            a1Var.f25172x.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            a1Var.f25173y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void d1(Context context, o5 o5Var) {
            l.f(context, "context");
            l.f(o5Var, "dms");
            c cVar = new c(context);
            o5Var.J.f28562b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            o5Var.J.f28563c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            o5Var.J.f28567g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            o5Var.J.f28564d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            o5Var.J.f28566f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            o5Var.L.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            o5Var.Q.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            o5Var.P.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            o5Var.O.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.app_date)));
            o5Var.S.setText(cVar.b("label_name", context.getString(R.string.your_name)));
            o5Var.T.setText(cVar.b("label_sdf", context.getString(R.string.sdo_of)));
            o5Var.M.setText(cVar.b("title_dl_serv_upload_req_doc", context.getString(R.string.upload)));
            o5Var.N.setText(cVar.b("title_dl_serv_allow_file_size", context.getString(R.string.allow_file_types)));
            o5Var.U.setText(cVar.b("btn_dl_serv_upload_doc", context.getString(R.string.upload_doc)));
            o5Var.R.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
        }

        public final void d2(Context context, ud udVar) {
            l.f(context, "context");
            l.f(udVar, "binding");
            c cVar = new c(context);
            udVar.f28906p.setText(cVar.b("vahan_upload_document", "Upload Document"));
            udVar.f28898h.setText(cVar.b("btn_dl_serv_next", "Next"));
            udVar.f28903m.setText(cVar.b("title_dl_serv_upload_req_doc", "Upload Required Documents"));
            udVar.f28892b.setText(cVar.b("vahan_application_no", "Application Number"));
            udVar.f28904n.setText(cVar.b("title_dl_serv_allow_file_size", "Allow file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."));
            udVar.f28893c.f27885g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            udVar.f28893c.f27882d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            udVar.f28893c.f27881c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            udVar.f28893c.f27884f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void e(Context context, y1 y1Var) {
            l.f(context, "context");
            l.f(y1Var, "binding");
            c cVar = new c(context);
            y1Var.E.setText(cVar.b("lrng_lic_number", context.getString(R.string.ll_driving_license_number)));
            y1Var.A.setHint(cVar.b("edit_ll_number_text", context.getString(R.string.enter_ll_driving_license_number)));
            y1Var.f29438z.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            y1Var.f29436x.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            y1Var.f29437y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            y1Var.B.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
        }

        public final void e0(Context context, e1 e1Var) {
            l.f(context, "context");
            l.f(e1Var, "slot");
            c cVar = new c(context);
            e1Var.L.f26523c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            e1Var.L.f26524d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            e1Var.L.f26527g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            e1Var.L.f26525e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            e1Var.L.f26522b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            e1Var.f26025x.setText(cVar.b("label_avaialble", context.getString(R.string.available)));
            e1Var.f26027z.setText(cVar.b("label_booked", context.getString(R.string.booked)));
            e1Var.G.setText(cVar.b("label_holiday", context.getString(R.string.holiday)));
            e1Var.K.setText(cVar.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void e1(Context context, m5 m5Var) {
            l.f(context, "context");
            l.f(m5Var, "binding");
            c cVar = new c(context);
            m5Var.f27405a0.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            m5Var.S.setText(cVar.b("blood_group", context.getString(R.string.blood_group_text)));
            m5Var.f27411g0.setText(cVar.b("personal_details", context.getString(R.string.personal_details)));
            m5Var.X.setText(cVar.b("ll_holder_name", context.getString(R.string.ll_holder_name)));
            m5Var.f27406b0.setText(cVar.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            m5Var.V.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            m5Var.f27417m0.setText(cVar.b("blood_group", context.getString(R.string.blood_group_text)));
            m5Var.f27410f0.setText(cVar.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            m5Var.Y.setText(cVar.b("ll_info", context.getString(R.string.ll_information)));
            m5Var.f27409e0.setText(cVar.b("validity_nt", context.getString(R.string.validity)));
            m5Var.Z.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            m5Var.f27407c0.setText(cVar.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
            m5Var.f27408d0.setText(cVar.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            m5Var.T.setText(cVar.b("title_dl_serv_class_vehicle", context.getString(R.string.class_vehicle)));
            m5Var.M.setText(cVar.b("btn_dl_serv_close", context.getString(R.string.close)));
        }

        public final void e2(Context context, oa oaVar) {
            l.f(context, "context");
            l.f(oaVar, "binding");
            c cVar = new c(context);
            oaVar.f27830e.f28308i.setText(cVar.b("download_forms", "Download Forms"));
            oaVar.f27827b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            oaVar.f27834i.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            oaVar.f27832g.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            oaVar.f27839n.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
        }

        public final void f(Context context, o8 o8Var) {
            l.f(context, "context");
            l.f(o8Var, "binding");
            c cVar = new c(context);
            o8Var.f27795j.setText(cVar.b("cs_TrafficReport", "Register Complaint"));
            o8Var.f27794i.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            o8Var.f27793h.setText(cVar.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            o8Var.f27798m.setText(cVar.b("cs_trafficReport_lastRepViolation", "Last Reported Violation"));
            o8Var.f27803r.setText(cVar.b("cs_repAccdnt_AccdntID", "Violation ID"));
            o8Var.f27801p.setText(cVar.b("vehicle_number", context.getString(R.string.vehicle_number)));
            o8Var.f27802q.setText(cVar.b("cs_DateTime", "Date & Time"));
            o8Var.f27800o.setText(cVar.b("btn_challan_status", context.getString(R.string.status)));
            o8Var.f27797l.setText(cVar.b("cs_Location", context.getString(R.string.location_txt)));
            o8Var.f27808w.setText(cVar.b("view_details", "View Details"));
            o8Var.f27799n.setText(cVar.b("Statistics", "Statistics"));
        }

        public final void f0(Context context, g1 g1Var) {
            l.f(context, "context");
            l.f(g1Var, "clsl");
            c cVar = new c(context);
            g1Var.E.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            g1Var.D.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void f1(Context context, q5 q5Var) {
            l.f(context, "context");
            l.f(q5Var, "binding");
            c cVar = new c(context);
            q5Var.f28153o.setText(cVar.b("ll_number_text", context.getString(R.string.enter_ll_driving_license)));
            q5Var.f28154p.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            q5Var.f28147i.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            q5Var.f28140b.setText(cVar.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            q5Var.f28148j.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            q5Var.f28142d.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final String f2(Context context, String str, String str2) {
            String str3;
            String string;
            String b10;
            String str4;
            String str5;
            l.f(context, "context");
            l.f(str, "service_code");
            l.f(str2, "serve_value");
            c cVar = new c(context);
            if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                string = context.getString(R.string.hypothecation_addition);
                str3 = "hypothecation_addition";
            } else {
                if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
                    str4 = "hypothecation_termination";
                    str5 = "Hypothecation Termination";
                } else if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
                    string = context.getString(R.string.hypothecation_continuation);
                    str3 = "hypothecation_continuation";
                } else if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
                    string = context.getString(R.string.change_of_address);
                    str3 = "change_of_address_in_rc2";
                } else {
                    if (str.equals(VContant.NOC_PURPOSE_CODE)) {
                        b10 = cVar.b("no_objection_certificate_noc", str2);
                    } else if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                        str4 = "issue_of_duplicate_rc";
                        str5 = "Issue of Duplicate RC";
                    } else {
                        if (p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true)) {
                            if (!p.o(str2, "SM", true)) {
                                str3 = "toSellerBuyer";
                                string = context.getString(R.string.transfer_of_ownership);
                            }
                        } else if (!p.o(str2, "S", true)) {
                            if (!p.o(str2, "B", true)) {
                                return " ";
                            }
                            str3 = "toBuyerHeader";
                            string = context.getString(R.string.transfer_of_ownership);
                        }
                        b10 = cVar.b("toSellerHeader", context.getString(R.string.transfer_of_ownership_seller));
                    }
                    return String.valueOf(b10);
                }
                b10 = cVar.b(str4, str5);
                return String.valueOf(b10);
            }
            b10 = cVar.b(str3, string);
            return String.valueOf(b10);
        }

        public final void g(Context context, p8 p8Var) {
            l.f(context, "context");
            l.f(p8Var, "binding");
            c cVar = new c(context);
            p8Var.f27997l.setText(cVar.b(f.f17510a.L(), context.getString(R.string.name)));
            p8Var.f27996k.setText(cVar.b("Email_id", context.getString(R.string.email_id)));
            p8Var.f27995j.setText(cVar.b("cs_FeedbackDesc", "Description ( Max 250 Characters )"));
            p8Var.f27988c.setHint(cVar.b("cs_EnterFeedback", "Enter feedback ( Minimum 30 Characters )"));
            p8Var.f27987b.setText(cVar.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void g0(Context context, i1 i1Var) {
            l.f(context, "context");
            l.f(i1Var, "binding");
            c cVar = new c(context);
            TextView textView = i1Var.f26790h.f25961g;
            f.a aVar = f.f17510a;
            textView.setText(cVar.b(aVar.g0(), "Raise a complaint"));
            i1Var.f26798p.setHint((CharSequence) cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            i1Var.f26784b.setHint((CharSequence) cVar.b("label_dl_serv_appl_no", "Application Number"));
            i1Var.f26794l.setHint((CharSequence) cVar.b(aVar.t(), "Enter Remarks"));
            i1Var.f26785c.setText(cVar.b(aVar.a(), "Attach"));
            i1Var.f26786d.setText(cVar.b(aVar.g0(), "Raise a complaint"));
        }

        public final void g1(Context context, x5 x5Var) {
            l.f(context, "context");
            l.f(x5Var, "ps");
            c cVar = new c(context);
            x5Var.R.f28729c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            x5Var.R.f28730d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            x5Var.R.f28733g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            x5Var.R.f28731e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            x5Var.R.f28728b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            x5Var.X.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            x5Var.f29311i0.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            x5Var.f29312j0.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            x5Var.f29310h0.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.application_date)));
            x5Var.f29315m0.setText(cVar.b("label_name", context.getString(R.string.application_date)));
            x5Var.S.setText(cVar.b("label_sdf", context.getString(R.string.sdo_of)));
            x5Var.f29313k0.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            x5Var.f29321s0.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            x5Var.f29314l0.setText(cVar.b("label_Instructions", context.getString(R.string.instructions)));
            x5Var.f29316n0.setText(cVar.b("label_instructions_one", context.getString(R.string.step1)));
            x5Var.f29318p0.setText(cVar.b("label_instructions_three", context.getString(R.string.step3)));
            x5Var.f29319q0.setText(cVar.b("label_instructions_two", context.getString(R.string.step2)));
            x5Var.f29322t0.setText(cVar.b("label_spec_ps", context.getString(R.string.spec_ps)));
            x5Var.f29317o0.setText(cVar.b("label_photo_dimensions", context.getString(R.string.val_one)));
            x5Var.f29320r0.setText(cVar.b("label_upload_clear_photo", context.getString(R.string.val_two)));
            x5Var.f29303a0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            x5Var.f29306d0.setText(cVar.b("label_app_photo", context.getString(R.string.applicant_photo)));
            x5Var.f29304b0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            x5Var.f29305c0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            x5Var.f29308f0.setText(cVar.b("label_capture", context.getString(R.string.capture)));
            x5Var.f29309g0.setText(cVar.b("label_gallery", context.getString(R.string.gallery)));
            x5Var.f29326w0.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
        }

        public final String g2(Context context, String str, String str2) {
            String string;
            String str3;
            String str4;
            String str5;
            String b10;
            l.f(context, "context");
            l.f(str, "service_code");
            l.f(str2, "serve_value");
            c cVar = new c(context);
            if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                string = context.getString(R.string.hypothecation_addition);
                str3 = "hypothecation_addition";
            } else {
                if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
                    str4 = "hypothecation_termination";
                    str5 = "Hypothecation Termination";
                } else if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
                    string = context.getString(R.string.hypothecation_continuation);
                    str3 = "hypothecation_continuation";
                } else if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
                    string = context.getString(R.string.change_of_address);
                    str3 = "change_of_address_in_rc2";
                } else if (str.equals(VContant.NOC_PURPOSE_CODE)) {
                    b10 = cVar.b("no_objection_certificate_noc", str2);
                    return String.valueOf(b10);
                } else if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                    str4 = "issue_of_duplicate_rc";
                    str5 = "Issue of Duplicate RC";
                } else if (!p.o(str, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, true)) {
                    return " ";
                } else {
                    string = context.getString(R.string.transfer_of_ownership);
                    str3 = "to_header_title";
                }
                b10 = cVar.b(str4, str5);
                return String.valueOf(b10);
            }
            b10 = cVar.b(str3, string);
            return String.valueOf(b10);
        }

        public final void h(Context context, q8 q8Var) {
            l.f(context, "context");
            l.f(q8Var, "binding");
            c cVar = new c(context);
            q8Var.f28211j.setText(cVar.b("cs_TrafficReport", "Register Complaint"));
            q8Var.f28210i.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            q8Var.f28209h.setText(cVar.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            q8Var.f28213l.setText(cVar.b("cs_TrafficReportCompHistory", "Complaint History"));
            q8Var.f28204c.setHint(cVar.b("cs_repAccdnt_His_StartDate", "Start Date"));
            q8Var.f28203b.setHint(cVar.b("cs_repAccdnt_His_EndDate", "End Date"));
            q8Var.f28215n.setText(cVar.b("cs_show", "Show"));
        }

        public final void h0(Context context, j1 j1Var) {
            l.f(context, "context");
            l.f(j1Var, "binding");
            c cVar = new c(context);
            j1Var.f26922o.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            j1Var.f26923p.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            j1Var.f26909b.setText(cVar.b("fee_amount", context.getString(R.string.fee_amount)));
            j1Var.f26914g.setText(cVar.b("fine_amount", context.getString(R.string.fine_amount)));
            j1Var.f26918k.setText(cVar.b("total_amount", context.getString(R.string.total_amount)));
            j1Var.f26917j.setText(cVar.b("btn_pay_now", context.getString(R.string.pay_now)));
        }

        public final void h1(Context context, z5 z5Var) {
            l.f(context, "context");
            l.f(z5Var, "binding");
            c cVar = new c(context);
            z5Var.F.setText(cVar.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            z5Var.G.setText(cVar.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            z5Var.H.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            z5Var.I.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            z5Var.C.setText(cVar.b("last_end_rto", context.getString(R.string.last_rto)));
            z5Var.D.setText(cVar.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
        }

        public final void h2(Context context, oa oaVar) {
            l.f(context, "context");
            l.f(oaVar, "binding");
            c cVar = new c(context);
            oaVar.f27830e.f28308i.setText(cVar.b("download_Noc", "NOC Download"));
            oaVar.f27827b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            oaVar.f27834i.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            oaVar.f27832g.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            oaVar.f27839n.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
        }

        public final void i(Context context, q7 q7Var) {
            l.f(context, "context");
            l.f(q7Var, "binding");
            c cVar = new c(context);
            q7Var.f28194s.setText(cVar.b("cs_TrafficReport", "Register Complaint"));
            q7Var.f28193r.setText(cVar.b("cs_dashboard", context.getString(R.string.dashboard)));
            q7Var.f28192q.setText(cVar.b("cs_TrafficReportCompHistory", context.getString(R.string.comp_history)));
            q7Var.f28201z.setText(cVar.b("cs_note", "Note: Video size must be equal or less than 8 MB"));
            q7Var.C.setText(cVar.b("cs_repAccdnt_vehicleNo", "Vehicle No. (Max. 10 Characters)"));
            q7Var.f28200y.setText(cVar.b("cs_tr_OffenceLocation", "Offence Location"));
            q7Var.f28199x.setText(cVar.b("cs_date", "Date"));
            q7Var.B.setText(cVar.b("cs_time", "Time"));
            q7Var.A.setText(cVar.b("vahan_state", "State"));
            q7Var.f28198w.setText(cVar.b("cs_repAccdnt_comment", "Comment (Max. 500 Characters)"));
            q7Var.f28179d.setText(cVar.b("cs_regBtnTitle", "Register"));
            q7Var.D.setText(cVar.b("cs_TrfReportViolType", "Violation Type"));
        }

        public final void i0(Context context, m1 m1Var) {
            l.f(context, "context");
            l.f(m1Var, "binding");
            c cVar = new c(context);
            TextView textView = m1Var.f27401q.f25961g;
            f.a aVar = f.f17510a;
            textView.setText(cVar.b(aVar.y(), "Help & Support"));
            m1Var.f27395k.setText(cVar.b(aVar.A(), "For any query regarding NextGen mParivahan app, Please contact us."));
            m1Var.f27400p.setText(cVar.b(aVar.z(), "Please call us at"));
            m1Var.f27394j.setText(cVar.b(aVar.B(), "Write to us at"));
            m1Var.f27398n.setText(cVar.b(aVar.g0(), "Raise a complaint"));
        }

        public final void i1(Context context, k5 k5Var) {
            l.f(context, "context");
            l.f(k5Var, "binding");
            c cVar = new c(context);
            k5Var.f27082w.setText(cVar.b("ll_number_text", context.getString(R.string.enter_ll_driving_license)));
            k5Var.G.setText(cVar.b("lrng_lic_number", context.getString(R.string.ll_driving_license_number)));
            k5Var.A.setHint(cVar.b("edit_ll_number_text", context.getString(R.string.enter_ll_driving_license_number)));
            k5Var.f27085z.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            k5Var.f27083x.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            k5Var.f27084y.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void i2(Context context, b9 b9Var) {
            l.f(context, "context");
            l.f(b9Var, "binding");
            c cVar = new c(context);
            b9Var.f25494d.setText(cVar.b("vahan_application_no", "Application Number"));
            b9Var.f25492b.setText(cVar.b("vahan_amount", context.getString(R.string.amount)));
            b9Var.f25504n.setText(cVar.b("lbl_Receipt_No", context.getString(R.string.receipt_no)));
            b9Var.f25500j.setText(cVar.b("label_challan_owner_name", context.getString(R.string.owner_name)));
            b9Var.f25507q.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            b9Var.f25496f.setText(cVar.b("btn_Download_Fee_Receipt", "Download Fee Receipt"));
            b9Var.f25497g.setText(cVar.b("View_Forms", "View Forms"));
            b9Var.f25499i.setText(cVar.b("btn_dl_serv_next", "Next"));
        }

        public final void j(Context context, o9 o9Var) {
            l.f(context, "context");
            l.f(o9Var, "binding");
            c cVar = new c(context);
            o9Var.f27820i.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            o9Var.f27819h.setText(cVar.b("btn_challan_status", context.getString(R.string.status)));
            o9Var.f27818g.setText(cVar.b("cs_Location", context.getString(R.string.location_txt)));
            o9Var.f27813b.setText(cVar.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void j0(Context context, o1 o1Var) {
            Context context2 = context;
            o1 o1Var2 = o1Var;
            l.f(context2, "context");
            l.f(o1Var2, "ac");
            c cVar = new c(context2);
            o1Var2.J0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state)));
            o1Var2.K0.setText(cVar.b("label_dl_serv_rto", context2.getString(R.string.rto)));
            o1Var2.L0.setText(cVar.b("personal_details", context2.getString(R.string.personal_details)));
            o1Var2.f27751x0.setText(cVar.b("first_name", context2.getString(R.string.first_name)));
            o1Var2.H0.setText(cVar.b("relation", context2.getString(R.string.relation_is)));
            o1Var2.M0.setText(cVar.b("relation", context2.getString(R.string.relative_name)));
            o1Var2.E0.setText(cVar.b("appl_gender", context2.getString(R.string.gender)));
            o1Var2.U.setText(cVar.b("appl_male", context2.getString(R.string.male)));
            o1Var2.Q.setText(cVar.b("appl_female", context2.getString(R.string.female)));
            o1Var2.B0.setText(cVar.b("lbl_dob", context2.getString(R.string.dob_txt)));
            o1Var2.f27753y0.setText(cVar.b("birth_place", context2.getString(R.string.birth_place)));
            o1Var2.C0.setText(cVar.b("education_qualification", context2.getString(R.string.education_qualification)));
            o1Var2.f27755z0.setText(cVar.b("blood_group", context2.getString(R.string.blood_group)));
            o1Var2.D0.setText(cVar.b("Email_id", context2.getString(R.string.email_id)));
            o1Var2.F0.setText(cVar.b("edit_mobile_no", context2.getString(R.string.mobile_number_txt)));
            o1Var2.f27749w0.setText(cVar.b("alt_mob_number", context2.getString(R.string.alt_mobile_no)));
            o1Var2.A0.setText(cVar.b("label_dl_serv_present_addr", context2.getString(R.string.present_address)));
            o1Var2.f27745t0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state)));
            o1Var2.f27734i0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            o1Var2.f27747v0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            o1Var2.f27735j0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            o1Var2.f27746u0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            o1Var2.f27736k0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            o1Var2.f27744s0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            o1Var2.G0.setText(cVar.b("label_dl_serv_permn_addr", context2.getString(R.string.permanent_address)));
            o1Var2.f27737l0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state)));
            o1Var2.f27738m0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            o1Var2.f27743r0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            o1Var2.f27739n0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            o1Var2.f27742q0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            o1Var2.f27740o0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            o1Var2.f27741p0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            o1Var2.A.setText(cVar.b("btn_dl_serv_next", context2.getString(R.string.next)));
        }

        public final void j1(Context context, a6 a6Var) {
            l.f(context, "context");
            l.f(a6Var, "slot");
            c cVar = new c(context);
            a6Var.f25198z.setText(cVar.b("label_avaialble", context.getString(R.string.app_details)));
            a6Var.H.setText(cVar.b("label_app_booking_successfully", context.getString(R.string.app_booking_successful)));
            a6Var.I.setText(cVar.b("label_app_date", context.getString(R.string.app_date)));
            a6Var.J.setText(cVar.b("label_app_time", context.getString(R.string.app_time)));
            a6Var.A.setText(cVar.b("label_yet_to_open", context.getString(R.string.app_slip)));
            a6Var.E.setText(cVar.b("label_yet_to_open", context.getString(R.string.next)));
        }

        public final void j2(Context context, g0 g0Var) {
            Context context2 = context;
            g0 g0Var2 = g0Var;
            l.f(context2, "context");
            l.f(g0Var2, "binding");
            c cVar = new c(context2);
            g0Var2.E.setText(cVar.b("vehicle_no", context2.getString(R.string.vehicle_no)));
            g0Var2.f26425k.setText(cVar.b("current_address", context2.getString(R.string.current_address)));
            g0Var2.f26423i.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            g0Var2.f26422h.setHint(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            g0Var2.G.setText(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            g0Var2.f26420f.setHint(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            g0Var2.f26424j.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            g0Var2.f26417c.setHint(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            g0Var2.f26440z.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            g0Var2.f26418d.setHint(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            g0Var2.C.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            g0Var2.f26421g.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            g0Var2.B.setText(cVar.b("same_as_current_address", context2.getString(R.string.same_as_current_address)));
            g0Var2.f26439y.setText(cVar.b("permanent_address", "Permanent Address"));
            g0Var2.f26430p.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            g0Var2.f26429o.setHint(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            g0Var2.f26438x.setText(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            g0Var2.f26437w.setHint(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            g0Var2.f26432r.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            g0Var2.f26431q.setHint(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            g0Var2.f26434t.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            g0Var2.f26428n.setHint(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            g0Var2.f26435u.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            g0Var2.f26421g.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            g0Var2.f26426l.setText(cVar.b("btn_dl_serv_next", "Next"));
            g0Var2.A.setText(cVar.b("to_btn_previous", "Previous"));
        }

        public final void k(Context context, n9 n9Var) {
            l.f(context, "context");
            l.f(n9Var, "binding");
            c cVar = new c(context);
            n9Var.f27664h.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            n9Var.f27663g.setText(cVar.b("btn_challan_status", context.getString(R.string.status)));
            n9Var.f27662f.setText(cVar.b("cs_Location", context.getString(R.string.location_txt)));
            n9Var.f27659c.setText(cVar.b("cs_sendFeedback", "Send Feedback"));
        }

        public final void k0(Context context, hc hcVar) {
            l.f(context, "context");
            l.f(hcVar, "binding");
            c cVar = new c(context);
            hcVar.f26723s.setText(cVar.b("title_create_new", context.getString(R.string.create_account)));
            hcVar.f26724t.setText(cVar.b("title_fast_easy", context.getString(R.string.fast_easy)));
            hcVar.f26710f.setHint(cVar.b("edit_full_name", context.getString(R.string.full_name)));
            hcVar.f26711g.setHint(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            hcVar.f26712h.setHint(cVar.b("edit_securityMpin", context.getString(R.string.set_six_pin)));
            hcVar.f26725u.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            hcVar.f26722r.setText(cVar.b("label_already_account", context.getString(R.string.already_have_account)));
            hcVar.f26718n.setText(cVar.b("label_signin", context.getString(R.string.sign_in)));
            hcVar.f26720p.setText(cVar.b("label_privacy_policy", context.getString(R.string.agree_terms)));
        }

        public final void k1(Context context, i5 i5Var) {
            l.f(context, "context");
            l.f(i5Var, "slot");
            c cVar = new c(context);
            i5Var.L.f26523c.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            i5Var.L.f26524d.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            i5Var.L.f26527g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            i5Var.L.f26525e.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            i5Var.L.f26522b.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            i5Var.f26802x.setText(cVar.b("label_avaialble", context.getString(R.string.available)));
            i5Var.f26804z.setText(cVar.b("label_booked", context.getString(R.string.booked)));
            i5Var.G.setText(cVar.b("label_holiday", context.getString(R.string.holiday)));
            i5Var.K.setText(cVar.b("label_yet_to_open", context.getString(R.string.yet_to_open)));
        }

        public final void k2(Context context, g9 g9Var) {
            l.f(context, "context");
            l.f(g9Var, "mBnding");
            c cVar = new c(context);
            g9Var.f26509f.f28452f.setText(cVar.b("Vehicle_Transactions", "Vehicle Transactions"));
            g9Var.f26519p.setText(cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            g9Var.f26510g.setText(cVar.b("label_dl_serv_appl_no", "Application Number"));
            g9Var.f26507d.setText(cVar.b("vahan_application_date", "Application Date"));
            g9Var.f26517n.setText(cVar.b("lbl_Receipt_No", "Receipt Number"));
            g9Var.f26516m.setText(cVar.b("receipt_date", "Receipt Date"));
            g9Var.f26505b.setText(cVar.b("vahan_amount", "Amount"));
            g9Var.f26518o.setText(cVar.b("vahan_transaction_name", "Transaction Name"));
        }

        public final void l(Context context, k kVar) {
            l.f(context, "context");
            l.f(kVar, "vd");
            c cVar = new c(context);
            kVar.f27048n.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.application_no)));
            kVar.f27038d.setText(cVar.b("vahan_application_name", context.getString(R.string.applicant_name)));
            kVar.f27040f.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            kVar.f27053s.setText(cVar.b("label_appl_status_rto_code", "RTO Code"));
            kVar.f27051q.setText(cVar.b("vahan_rto_name", context.getString(R.string.rto_name_2)));
            kVar.f27055u.setText(cVar.b("label_transaction_s_applied", context.getString(R.string.transaction_s_applied)));
            kVar.f27043i.setText(cVar.b("button_proceed", context.getString(R.string.proceed)));
            kVar.f27042h.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void l0(Context context, ec ecVar) {
            l.f(context, "context");
            l.f(ecVar, "binding");
            c cVar = new c(context);
            ecVar.f26150j.setText(cVar.b("title_create_new", context.getString(R.string.create_new)));
            ecVar.f26152l.setText(cVar.b("title_secu_mpin", context.getString(R.string.sec_pin_)));
            EditText editText = ecVar.f26145e;
            f.a aVar = f.f17510a;
            editText.setHint(cVar.b(aVar.n(), context.getString(R.string.six_pin)));
            ecVar.f26143c.setHint(cVar.b(aVar.i(), context.getString(R.string.confirm_six_pin)));
            ecVar.f26151k.setText(cVar.b("edit_enter_mpin", context.getString(R.string.please_enter_pin)));
            ecVar.f26153m.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void l1(Context context, g5 g5Var) {
            l.f(context, "context");
            l.f(g5Var, "clsl");
            c cVar = new c(context);
            g5Var.F.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            g5Var.E.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void l2(Context context, ae aeVar) {
            l.f(context, "context");
            l.f(aeVar, "binding");
            c cVar = new c(context);
            aeVar.D.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            aeVar.f25369j.f25961g.setText(cVar.b("toSellerBuyer", "Transfer of OwnerShip"));
            aeVar.f25364e.setText(cVar.b("to_newOwner_srNo", "New Owner Serial No."));
            aeVar.f25363d.setHint(cVar.b("to_newOwner_srNo", "New Owner Serial No."));
            aeVar.f25380u.setText(cVar.b("to_purpose", "Purpose"));
            aeVar.f25376q.setText(cVar.b("to_ownership_type", "Ownership Type"));
            aeVar.f25371l.setText(cVar.b("to_owner_category", "New Owner Category"));
            aeVar.f25373n.setText(cVar.b("to_newOwner_name_buyer", "New Owner Name(Buyer)"));
            aeVar.f25372m.setHint(cVar.b("to_newOwner_name_buyer", "Enter new Owner Name(Buyer)"));
            aeVar.f25366g.setText(cVar.b("to_father_name", "Father/Husband Name"));
            aeVar.f25365f.setHint(cVar.b("to_father_name", "Father/Husband Name"));
            aeVar.A.setText(cVar.b("to_sale_amount", "Sale Amount"));
            aeVar.f25385z.setHint(cVar.b("to_sale_amount", "Sale Amount"));
            aeVar.C.setText(cVar.b("to_sale_date", "Sale Date"));
            aeVar.B.setHint(cVar.b("to_sale_date", "Sale Date"));
            aeVar.f25368i.setText(cVar.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            aeVar.f25367h.setHint(cVar.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            aeVar.f25378s.setText(cVar.b("to_pan_number", "PAN Number"));
            aeVar.f25377r.setHint(cVar.b("to_pan_number", "PAN Number"));
            aeVar.f25362c.setText(cVar.b("Email_id", "Email ID"));
            aeVar.f25361b.setHint(cVar.b("Email_id", "Email ID"));
            aeVar.f25374o.setText(cVar.b("btn_dl_serv_next", "Next"));
            aeVar.f25381v.setText(cVar.b("btn_reset", "Reset"));
        }

        public final void m(Context context, ni.l lVar) {
            l.f(context, "context");
            l.f(lVar, "vd");
            c cVar = new c(context);
            lVar.f27207b.setHint(cVar.b("edit_dl_serv_dob", "Enter Date of Birth"));
            lVar.f27214i.setText(cVar.b("lbl_dob", "Date of Birth"));
            lVar.f27213h.setText(cVar.b("vahan_application_name", context.getString(R.string.application_no_mend)));
            lVar.f27208c.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            lVar.f27217l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            lVar.f27209d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void m0(Context context, ba baVar) {
            l.f(context, "context");
            l.f(baVar, "binding");
            c cVar = new c(context);
            baVar.f25528q.setText(cVar.b("create_vir_rc", context.getString(R.string.create_virtual_rc)));
            baVar.f25527p.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            baVar.f25518g.setHint(cVar.b("enter_rc_no_for_pending_transaction", context.getString(R.string.enter_rc_no_for_pending_transaction)));
            baVar.f25523l.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chassis_no_last_5_digits)));
            baVar.f25515d.setHint(cVar.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            baVar.f25524m.setText(cVar.b("label_challan_engine_no", context.getString(R.string.engine_no_last_5_digits)));
            baVar.f25517f.setHint(cVar.b("enter_last_five_digits", context.getString(R.string.enter_last_five_digits)));
            baVar.f25516e.setText(cVar.b("ADD_MY_VEHICLE_S", context.getString(R.string.add_my_vehicle_s)));
            baVar.f25526o.setText(cVar.b("MY_VIRTUAL_RC_S", context.getString(R.string.my_virtual_rc_s)));
            baVar.f25522k.setText(cVar.b("alert", context.getString(R.string.alert)));
        }

        public final void m1(Context context, d6 d6Var) {
            l.f(context, "context");
            l.f(d6Var, "binding");
            c cVar = new c(context);
            d6Var.f25873l.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            d6Var.f25868g.setText(cVar.b("misc_feeTobePaid", context.getString(R.string.miscellaneous_fee_to_be_paid)));
            d6Var.f25865d.setText(cVar.b("fee_amount", context.getString(R.string.fee_amount)));
            d6Var.f25864c.setHint(cVar.b("misc_EnterFee", context.getString(R.string.enter_fee_amount)));
            d6Var.f25867f.setText(cVar.b("fine_amount", context.getString(R.string.fine_amount)));
            d6Var.f25866e.setHint(cVar.b("misc_EnterFine", context.getString(R.string.enter_fine_amount)));
            d6Var.f25872k.setText(cVar.b("total_amount", context.getString(R.string.total_amount)));
            d6Var.f25871j.setHint(cVar.b("total_amount", context.getString(R.string.total_amount)));
            d6Var.f25869h.setText(cVar.b("misc_FeeNote", context.getString(R.string.note_please_enter_the_fee_details_to_be_paid)));
            d6Var.f25863b.setText(cVar.b("btn_pay_now", context.getString(R.string.pay_now)));
        }

        public final void m2(Context context, kd kdVar) {
            l.f(context, "context");
            l.f(kdVar, "binding");
            c cVar = new c(context);
            kdVar.E.setText(cVar.b("vehicle_no", context.getString(R.string.vehicle_no)));
            kdVar.f27184e.setText(cVar.b("to_newOwner_srNo", "New Owner Serial No."));
            kdVar.f27183d.setHint(cVar.b("to_newOwner_srNo", "New Owner Serial No."));
            kdVar.f27199t.setText(cVar.b("to_purpose", "Purpose"));
            kdVar.f27195p.setText(cVar.b("to_ownership_type", "Ownership Type"));
            kdVar.f27190k.setText(cVar.b("to_owner_category", "New Owner Category"));
            kdVar.f27192m.setText(cVar.b("to_newOwner_name_buyer", "New Owner Name(Buyer)"));
            kdVar.f27191l.setHint(cVar.b("to_newOwner_name_buyer", "Enter new Owner Name(Buyer)"));
            kdVar.f27186g.setText(cVar.b("to_father_name", "Father/Husband Name"));
            kdVar.f27185f.setHint(cVar.b("to_father_name", "Father/Husband Name"));
            kdVar.A.setText(cVar.b("to_sale_amount", "Sale Amount"));
            kdVar.f27205z.setHint(cVar.b("to_sale_amount", "Sale Amount"));
            kdVar.C.setText(cVar.b("to_sale_date", "Sale Date"));
            kdVar.B.setHint(cVar.b("to_sale_date", "Sale Date"));
            kdVar.f27188i.setText(cVar.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            kdVar.f27187h.setHint(cVar.b("to_mobile_buyer", "Mobile No. (Buyer)"));
            kdVar.f27197r.setText(cVar.b("to_pan_number", "PAN Number"));
            kdVar.f27196q.setHint(cVar.b("to_pan_number", "PAN Number"));
            kdVar.f27182c.setText(cVar.b("Email_id", "Email ID"));
            kdVar.f27181b.setHint(cVar.b("Email_id", "Email ID"));
            kdVar.f27193n.setText(cVar.b("btn_dl_serv_next", "Next"));
            kdVar.f27201v.setText(cVar.b("btn_reset", "Reset"));
        }

        public final void n(Context context, p9 p9Var) {
            l.f(context, "context");
            l.f(p9Var, "vd");
            p9Var.f28002e.setText(new c(context).b("upload_doc_list", context.getString(R.string.uploaded_doc_list)));
        }

        public final void n0(Context context, f3 f3Var) {
            l.f(context, "context");
            l.f(f3Var, "dl_ack");
            c cVar = new c(context);
            f3Var.f26212y.setText(cVar.b("btn_dl_serv_downl_ackno", context.getString(R.string.download_ack)));
            f3Var.L.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
            f3Var.K.setText(cVar.b("label_view_forms", context.getString(R.string.view_forms)));
            f3Var.G.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void n1(Context context, p2 p2Var) {
            l.f(context, "context");
            l.f(p2Var, "mobupdate2");
            c cVar = new c(context);
            p2Var.O.setText(cVar.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            p2Var.f27919z.setHint(cVar.b("label_challan_enter_dl_no", context.getString(R.string.enter_driving_license_no)));
            p2Var.f27916w.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            p2Var.G.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile)));
            p2Var.S.setText(cVar.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            p2Var.A.setHint(cVar.b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
            p2Var.I.setHint(cVar.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
            p2Var.M.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            p2Var.J.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            p2Var.I.setText(cVar.b("vahan_resend_otp", context.getString(R.string.resend_otp)));
        }

        public final void n2(Context context, l9 l9Var) {
            l.f(context, "context");
            l.f(l9Var, "binding");
            c cVar = new c(context);
            l9Var.f27312g.f25961g.setText(cVar.b("lbl_Verify_Payment_Status", "Verify Payment Status"));
            l9Var.f27317l.setText(cVar.b("vahan_application_no", "Application Number"));
            l9Var.f27308c.setText(cVar.b("vahan_application_no", "Application Number"));
            l9Var.f27314i.setText(cVar.b("vahan_registration_no", "Registration Number"));
            l9Var.f27307b.setText(cVar.b("vahan_chassis_no_last_five", "Chassis No. (Last 5 digits)"));
            l9Var.f27309d.setText(cVar.b("vahan_get_details", context.getString(R.string.get_details)));
            l9Var.f27311f.setHint(cVar.b(f.f17510a.E(), "Enter application no."));
            l9Var.f27310e.setHint(cVar.b("vahan_enter_chassis_no", "Enter chassis no."));
        }

        public final void o(Context context, zc zcVar) {
            l.f(context, "context");
            l.f(zcVar, "sw");
            c cVar = new c(context);
            zcVar.f29770b.setHint(cVar.b("edit_dl_serv_dob", "Enter Date of Birth"));
            zcVar.f29777i.setText(cVar.b("lbl_dob", "Date of Birth"));
            zcVar.f29776h.setText(cVar.b("vahan_application_name", context.getString(R.string.application_no_mend)));
            zcVar.f29771c.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            zcVar.f29780l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            zcVar.f29772d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void o0(Context context, w1 w1Var) {
            Context context2 = context;
            w1 w1Var2 = w1Var;
            l.f(context2, "context");
            l.f(w1Var2, "binding");
            c cVar = new c(context2);
            w1Var2.f29122h0.setText(cVar.b("current_address", context2.getString(R.string.current_address)));
            w1Var2.f29126l0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            w1Var2.f29116b0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            w1Var2.f29130p0.setText(cVar.b("select_state_rto", context2.getString(R.string.taluka_block_sarthi)));
            w1Var2.f29132r0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            w1Var2.f29115a0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            w1Var2.f29118d0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            w1Var2.f29128n0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            w1Var2.f29120f0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_sarthi)));
            w1Var2.f29124j0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            w1Var2.Q.setText(cVar.b("stay_duration", context2.getString(R.string.duration_stay_sarthi)));
            w1Var2.f29134t0.setHint(cVar.b("year_txt", context2.getString(R.string.year)));
            w1Var2.V.setHint(cVar.b("month_txt", context2.getString(R.string.month)));
            w1Var2.f29123i0.setText(cVar.b("permanent_address", context2.getString(R.string.permanent_address_sarthi)));
            w1Var2.f29127m0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            w1Var2.f29117c0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            w1Var2.f29131q0.setText(cVar.b("select_state_rto", context2.getString(R.string.taluka_block_sarthi)));
            w1Var2.J.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            w1Var2.I.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            w1Var2.f29119e0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            w1Var2.f29129o0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            w1Var2.f29121g0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_sarthi)));
            w1Var2.f29125k0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            w1Var2.Y.setText(cVar.b("btn_dl_serv_next", context2.getString(R.string.next)));
        }

        public final void o1(Context context, v7 v7Var) {
            l.f(context, "context");
            l.f(v7Var, "mobupdate");
            c cVar = new c(context);
            v7Var.G.setText(cVar.b("update_Mobile_No", context.getString(R.string.update_mobile)));
            v7Var.J.setText(cVar.b("label_dl_serv_old_mob_no", context.getString(R.string.old_mobile)));
            v7Var.I.setText(cVar.b("label_dl_serv_new_mob_no", context.getString(R.string.new_mobile)));
            v7Var.C.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.new_mobile)));
            v7Var.K.setText(cVar.b("label_dl_serv_rem_rea", context.getString(R.string.vahan_remark)));
            v7Var.E.setHint(cVar.b("edit_dl_serv_enter_reason", context.getString(R.string.enter_reason)));
            v7Var.H.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            v7Var.f29012w.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void o2(Context context, eb ebVar) {
            l.f(context, "context");
            l.f(ebVar, "binding");
            c cVar = new c(context);
            ebVar.A.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            ebVar.B.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            ebVar.f26139y.setText(cVar.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            ebVar.f26133s.f28308i.setText(cVar.b("lbl_Hypothecation_Addition", context.getString(R.string.vahan_hypothecation_addition)));
            ebVar.f26138x.setText(cVar.b("lbl_Hypothecation_Addition_Details", context.getString(R.string.vahan_hypothecation_add_details)));
            ebVar.f26140z.setText(cVar.b("lbl_Type", context.getString(R.string.vahan_type)));
            ebVar.f26137w.setText(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            ebVar.f26122h.setHint(cVar.b("lbl_Financer_Name", context.getString(R.string.vahan_financer_name)));
            ebVar.f26136v.setText(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            ebVar.f26121g.setHint(cVar.b("vahan_financer_branch", context.getString(R.string.vahan_financer_branch)));
            ebVar.f26135u.setText(cVar.b("lbl_Financer_Address", context.getString(R.string.vahan_financer_add)));
            ebVar.f26124j.setText(cVar.b("house_no_and_street_name", context.getString(R.string.house_no_and_street_name)));
            ebVar.f26123i.setHint(cVar.b("lbl_Enter_the_House_no", context.getString(R.string.enter_the_house_no)));
            ebVar.D.setText(cVar.b("village_town_city", context.getString(R.string.village_town_city)));
            ebVar.C.setHint(cVar.b("lbl_Enter_the_Village_Town_City", context.getString(R.string.enter_the_village_town_city)));
            ebVar.f26127m.setText(cVar.b("landmark_police_station", context.getString(R.string.landmark_police_station)));
            ebVar.f26126l.setHint(cVar.b("lbl_Enter_the_Landmark_Police_station", context.getString(R.string.enter_the_landmark_police_station)));
            ebVar.f26131q.setText(cVar.b("vahan_state", context.getString(R.string.state)));
            ebVar.f26119e.setText(cVar.b("label_dl_serv_district", context.getString(R.string.district)));
            ebVar.f26128n.setText(cVar.b("label_dl_serv_pincode", context.getString(R.string.pincode)));
            ebVar.f26118d.setHint(cVar.b("lbl_Enter_the_pincode", context.getString(R.string.enter_the_pincode)));
            ebVar.f26134t.setText(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            ebVar.f26120f.setHint(cVar.b("lbl_Finance_From_Date", context.getString(R.string.vahan_finance_from_date)));
            ebVar.f26116b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
            ebVar.f26129o.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            ebVar.f26129o.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            ebVar.f26129o.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            ebVar.f26129o.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void p(Context context, xc xcVar) {
            l.f(context, "context");
            l.f(xcVar, "sw");
            c cVar = new c(context);
            xcVar.f29403d.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            xcVar.f29408i.setText(cVar.b("label_applicant_name", context.getString(R.string.applicant_name)));
            xcVar.f29406g.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            xcVar.f29405f.setText(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            xcVar.f29412m.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
        }

        public final void p0(Context context, x7 x7Var) {
            l.f(context, "context");
            l.f(x7Var, "dl_dob");
            c cVar = new c(context);
            x7Var.f29357r.f27679b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            x7Var.f29357r.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            x7Var.f29357r.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            x7Var.f29357r.f27681d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            x7Var.f29357r.f27683f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            x7Var.f29364y.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            x7Var.f29343d.setText(cVar.b("change_dob_text", context.getString(R.string.change_of_dob_dl)));
            x7Var.f29361v.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.reason)));
            x7Var.f29346g.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            x7Var.f29344e.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            x7Var.f29360u.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            x7Var.f29365z.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            x7Var.f29355p.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            x7Var.f29356q.setHint(cVar.b("edit_dl_serv_emer_cont_no", context.getString(R.string.emergency_contact)));
            x7Var.f29358s.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            x7Var.f29351l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void p1(Context context, View view) {
            Context context2 = context;
            View view2 = view;
            String str = "label_dl_replacement";
            String str2 = "label_dl_extract";
            l.f(context2, "context");
            l.f(view2, "root");
            try {
                c cVar = new c(context2);
                View findViewById = view2.findViewById(R.id.welcome);
                l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById2 = view2.findViewById(R.id.trans_services);
                l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById3 = view2.findViewById(R.id.my_docs);
                l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById4 = view2.findViewById(R.id.cit_sen);
                l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById4;
                View findViewById5 = view2.findViewById(R.id.inf_Serv);
                l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById6 = view2.findViewById(R.id.txt_ts);
                l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById7 = view2.findViewById(R.id.txt_md);
                l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById8 = view2.findViewById(R.id.txt_cs);
                l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById9 = view2.findViewById(R.id.txt_is);
                l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById10 = view2.findViewById(R.id.virtual_rc_textview);
                l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) findViewById10;
                View findViewById11 = view2.findViewById(R.id.nodocument);
                l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) findViewById11;
                View findViewById12 = view2.findViewById(R.id.virtual_dl_textview);
                l.d(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView4 = (TextView) findViewById12;
                View findViewById13 = view2.findViewById(R.id.txt_process);
                l.d(findViewById13, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView5 = (TextView) findViewById9;
                View findViewById14 = view2.findViewById(R.id.home);
                l.d(findViewById14, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById15 = view2.findViewById(R.id.payment);
                l.d(findViewById15, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView6 = (TextView) findViewById8;
                View findViewById16 = view2.findViewById(R.id.documents);
                l.d(findViewById16, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView7 = (TextView) findViewById7;
                View findViewById17 = view2.findViewById(R.id.settings);
                l.d(findViewById17, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById18 = view2.findViewById(R.id.my_virtual_rc);
                l.d(findViewById18, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView8 = (TextView) findViewById6;
                View findViewById19 = view2.findViewById(R.id.my_virtual_dl);
                l.d(findViewById19, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView9 = (TextView) findViewById5;
                View findViewById20 = view2.findViewById(R.id.alerts_title);
                l.d(findViewById20, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView10 = (TextView) findViewById3;
                View findViewById21 = view2.findViewById(R.id.about_nexgen);
                l.d(findViewById21, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView11 = (TextView) findViewById21;
                View findViewById22 = view2.findViewById(R.id.txt_virtual_rc);
                l.d(findViewById22, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView12 = (TextView) findViewById22;
                View findViewById23 = view2.findViewById(R.id.txt_virtual_dl);
                l.d(findViewById23, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView13 = (TextView) findViewById23;
                View findViewById24 = view2.findViewById(R.id.txt_shared_rc);
                l.d(findViewById24, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView14 = (TextView) findViewById24;
                View findViewById25 = view2.findViewById(R.id.txt_rcv_rc);
                l.d(findViewById25, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView15 = (TextView) findViewById25;
                View findViewById26 = view2.findViewById(R.id.txt_rc_search);
                l.d(findViewById26, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView16 = (TextView) findViewById26;
                View findViewById27 = view2.findViewById(R.id.txt_dl_search);
                l.d(findViewById27, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView17 = (TextView) findViewById27;
                View findViewById28 = view2.findViewById(R.id.txt_dup_rc);
                l.d(findViewById28, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView18 = (TextView) findViewById28;
                View findViewById29 = view2.findViewById(R.id.txt_ht);
                l.d(findViewById29, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView19 = (TextView) findViewById29;
                View findViewById30 = view2.findViewById(R.id.txt_too);
                l.d(findViewById30, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView20 = (TextView) findViewById30;
                View findViewById31 = view2.findViewById(R.id.txt_rc_pert);
                l.d(findViewById31, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView21 = (TextView) findViewById31;
                View findViewById32 = view2.findViewById(R.id.txt_coa);
                l.d(findViewById32, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView22 = (TextView) findViewById32;
                View findViewById33 = view2.findViewById(R.id.txt_hp_end);
                l.d(findViewById33, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView23 = (TextView) findViewById33;
                View findViewById34 = view2.findViewById(R.id.txt_hc);
                l.d(findViewById34, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView24 = (TextView) findViewById34;
                View findViewById35 = view2.findViewById(R.id.txt_noc);
                l.d(findViewById35, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView25 = (TextView) findViewById35;
                View findViewById36 = view2.findViewById(R.id.about_licence);
                l.d(findViewById36, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView26 = (TextView) findViewById36;
                View findViewById37 = view2.findViewById(R.id.txt_renewal);
                l.d(findViewById37, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView27 = (TextView) findViewById37;
                View findViewById38 = view2.findViewById(R.id.txt_dup_dl);
                l.d(findViewById38, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView28 = (TextView) findViewById38;
                View findViewById39 = view2.findViewById(R.id.txt_coa_dl);
                l.d(findViewById39, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView29 = (TextView) findViewById39;
                View findViewById40 = view2.findViewById(R.id.txt_idp);
                l.d(findViewById40, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView30 = (TextView) findViewById40;
                View findViewById41 = view2.findViewById(R.id.txt_dl_extract);
                l.d(findViewById41, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView31 = (TextView) findViewById41;
                View findViewById42 = view2.findViewById(R.id.txt_replace_dl);
                l.d(findViewById42, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView32 = (TextView) findViewById42;
                View findViewById43 = view2.findViewById(R.id.txt_renewal2);
                l.d(findViewById43, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView33 = (TextView) findViewById43;
                View findViewById44 = view2.findViewById(R.id.txt_dup_dl2);
                l.d(findViewById44, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView34 = (TextView) findViewById44;
                View findViewById45 = view2.findViewById(R.id.aod);
                l.d(findViewById45, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView35 = (TextView) findViewById45;
                View findViewById46 = view2.findViewById(R.id.txt_idp2);
                l.d(findViewById46, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView36 = (TextView) findViewById46;
                View findViewById47 = view2.findViewById(R.id.txt_idp3);
                l.d(findViewById47, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView37 = (TextView) findViewById47;
                View findViewById48 = view2.findViewById(R.id.txt_dl_extract2);
                l.d(findViewById48, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView38 = (TextView) findViewById48;
                View findViewById49 = view2.findViewById(R.id.txt_dl_extract3);
                l.d(findViewById49, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView39 = (TextView) findViewById49;
                View findViewById50 = view2.findViewById(R.id.txt_replace_dl2);
                l.d(findViewById50, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView40 = (TextView) findViewById50;
                View findViewById51 = view2.findViewById(R.id.about_na);
                l.d(findViewById51, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView41 = (TextView) findViewById51;
                View findViewById52 = view2.findViewById(R.id.txt_notification);
                l.d(findViewById52, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView42 = (TextView) findViewById52;
                View findViewById53 = view2.findViewById(R.id.txt_advisory);
                l.d(findViewById53, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView43 = (TextView) findViewById53;
                View findViewById54 = view2.findViewById(R.id.txt_draft_not);
                l.d(findViewById54, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView44 = (TextView) findViewById54;
                View findViewById55 = view2.findViewById(R.id.view_more);
                l.d(findViewById55, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView45 = (TextView) findViewById55;
                View findViewById56 = view2.findViewById(R.id.view_more_2);
                l.d(findViewById56, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView46 = (TextView) findViewById56;
                View findViewById57 = view2.findViewById(R.id.all_forms);
                l.d(findViewById57, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView47 = (TextView) findViewById57;
                View findViewById58 = view2.findViewById(R.id.txt_dl);
                l.d(findViewById58, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView48 = (TextView) findViewById58;
                View findViewById59 = view2.findViewById(R.id.m_v_d);
                l.d(findViewById59, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView49 = (TextView) findViewById59;
                View findViewById60 = view2.findViewById(R.id.permit);
                l.d(findViewById60, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView50 = (TextView) findViewById60;
                View findViewById61 = view2.findViewById(R.id.v_r);
                l.d(findViewById61, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView51 = (TextView) findViewById61;
                View findViewById62 = view2.findViewById(R.id.vehicle_recall);
                l.d(findViewById62, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView52 = (TextView) findViewById62;
                View findViewById63 = view2.findViewById(R.id.tr_text);
                l.d(findViewById63, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView53 = (TextView) findViewById63;
                View findViewById64 = view2.findViewById(R.id.ts_text);
                l.d(findViewById64, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView54 = (TextView) findViewById64;
                View findViewById65 = view2.findViewById(R.id.doc_text);
                l.d(findViewById65, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView55 = (TextView) findViewById65;
                View findViewById66 = view2.findViewById(R.id.doc_text2);
                l.d(findViewById66, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView56 = (TextView) findViewById66;
                View findViewById67 = view2.findViewById(R.id.is_text);
                l.d(findViewById67, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView57 = (TextView) findViewById67;
                View findViewById68 = view2.findViewById(R.id.is_text2);
                l.d(findViewById68, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView58 = (TextView) findViewById68;
                View findViewById69 = view2.findViewById(R.id.ld_text);
                l.d(findViewById69, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView59 = (TextView) findViewById69;
                View findViewById70 = view2.findViewById(R.id.vd_text);
                l.d(findViewById70, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView60 = (TextView) findViewById70;
                View findViewById71 = view2.findViewById(R.id.ap_text);
                l.d(findViewById71, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView61 = (TextView) findViewById71;
                View findViewById72 = view2.findViewById(R.id.act_text);
                l.d(findViewById72, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView62 = (TextView) findViewById72;
                View findViewById73 = view2.findViewById(R.id.fee_text);
                l.d(findViewById73, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView63 = (TextView) findViewById73;
                View findViewById74 = view2.findViewById(R.id.fee_text2);
                l.d(findViewById74, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView64 = (TextView) findViewById74;
                View findViewById75 = view2.findViewById(R.id.fee_text3);
                l.d(findViewById75, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView65 = (TextView) findViewById75;
                View findViewById76 = view2.findViewById(R.id.manual_text);
                l.d(findViewById76, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView66 = (TextView) findViewById76;
                View findViewById77 = view2.findViewById(R.id.faq_text);
                l.d(findViewById77, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView67 = (TextView) findViewById77;
                View findViewById78 = view2.findViewById(R.id.about_vehicle);
                l.d(findViewById78, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView68 = (TextView) findViewById78;
                View findViewById79 = view2.findViewById(R.id.pay_tax_text);
                l.d(findViewById79, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) findViewById20).setText(cVar.b("view_alert", "Alerts"));
                ((TextView) findViewById18).setText(cVar.b("My_Virtual_RC", context2.getString(R.string.My_Virtual_RC)));
                ((TextView) findViewById19).setText(cVar.b("My_Virtual_DL", context2.getString(R.string.My_Virtual_DL)));
                ((TextView) findViewById17).setText(cVar.b("label_setting", context2.getString(R.string.settings)));
                ((TextView) findViewById16).setText(cVar.b("documents", context2.getString(R.string.documents)));
                ((TextView) findViewById15).setText(cVar.b("logo_challan_payment", "Payment"));
                ((TextView) findViewById14).setText(cVar.b("label_home", "Home"));
                ((TextView) findViewById13).setText(cVar.b("avail_soon", "Available Soon\n(Under Development)"));
                ((TextView) findViewById).setText(cVar.b("welcome", "Welcome"));
                ((TextView) findViewById2).setText(cVar.b("trans_services", context2.getString(R.string.trans_services)));
                textView10.setText(cVar.b("my_docs", context2.getString(R.string.my_docs)));
                textView9.setText(cVar.b("inf_Serv", context2.getString(R.string.inf_Serv)));
                textView8.setText(cVar.b("trans_services", context2.getString(R.string.trans_services)));
                String str3 = "txt_md";
                textView7.setText(cVar.b(str3, context2.getString(R.string.txt_md)));
                textView6.setText(cVar.b(str3, context2.getString(R.string.virtual_documents)));
                String str4 = "txt_is";
                textView5.setText(cVar.b(str4, context2.getString(R.string.inf_Serv)));
                textView3.setText(cVar.b(str4, context2.getString(R.string.no_doc)));
                String str5 = "label_virtual_rc";
                textView2.setText(cVar.b(str5, context2.getString(R.string.virtual_rc)));
                String str6 = "label_virtual_dl";
                textView4.setText(cVar.b(str6, context2.getString(R.string.virtual_dl)));
                String str7 = "Transport Services";
                String str8 = "label_transport_services";
                textView53.setText(cVar.b(str8, str7));
                textView54.setText(cVar.b(str8, str7));
                String str9 = "My Documents";
                String str10 = "label_my_documents";
                textView55.setText(cVar.b(str10, str9));
                textView56.setText(cVar.b(str10, str9));
                String str11 = "Informational Services";
                String str12 = "label_informational_services";
                textView57.setText(cVar.b(str12, str11));
                textView58.setText(cVar.b(str12, str11));
                textView59.setText(cVar.b("logo_dl_details", "Driving Licence Details"));
                textView60.setText(cVar.b("vehicle_details", "Vehicle Details"));
                textView61.setText(cVar.b("About_Permit", "About Permit"));
                textView62.setText(cVar.b("Act_Rules_Policies", "Act, Rules & Policies"));
                textView63.setText(cVar.b("Fees_User_Charges", "Fees & User Charges"));
                textView64.setText(cVar.b("License_Related_Fees_and_Charges", "License Related Fees and Charges"));
                textView65.setText(cVar.b("License_Related_Fees_and_Charges", "License Related Fees and Charges"));
                textView66.setText(cVar.b("faq_text", "FAQ"));
                textView68.setText(cVar.b("label_about_vehicle", "About Vehicle"));
                textView67.setText(cVar.b("manual", "Manual"));
                ((TextView) findViewById79).setText(cVar.b("label_pay_tax", "Pay Your Tax"));
                textView35.setText(cVar.b("Addition_of_Class", "Addition_of_Class"));
                textView11.setText(cVar.b("about_nexgen", "About NextGen mParivahan"));
                textView12.setText(cVar.b(str5, context2.getString(R.string.virtual_rc)));
                textView13.setText(cVar.b(str6, context2.getString(R.string.virtual_dl)));
                textView14.setText(cVar.b("label_shared_rc", context2.getString(R.string.share_rc)));
                textView15.setText(cVar.b("label_received_rc", context2.getString(R.string.received_rc)));
                textView16.setText(cVar.b("label_rc_search", context2.getString(R.string.rc_switch)));
                textView17.setText(cVar.b("label_dl_search", context2.getString(R.string.dl_switch)));
                textView18.setText(cVar.b("label_duplicate_rc", context2.getString(R.string.duplicate_rc)));
                textView19.setText(cVar.b("label_hypothetication_termination", context2.getString(R.string.vahan_hypothecation_termination)));
                textView20.setText(cVar.b("label_transfer_ownership", "Transfer of Ownership"));
                textView21.setText(cVar.b("rc_perticular", context2.getString(R.string.rc_pert)));
                textView22.setText(cVar.b("label_change_of_address", context2.getString(R.string.change_of_address)));
                textView23.setText(cVar.b("Hypothetication_endorsement", context2.getString(R.string.hp_endorsment)));
                textView24.setText(cVar.b("label_hypothetication_continuation", context2.getString(R.string.vahan_hypothecation_continuation)));
                textView25.setText(cVar.b("label_noc", context2.getString(R.string.vahan_noc)));
                textView26.setText(cVar.b("label_about_licence", "About Licence"));
                textView27.setText(cVar.b("title_dl_serv_renewal", context2.getString(R.string.renewal_dl)));
                textView28.setText(cVar.b("title_dl_serv_duplicate_dl", context2.getString(R.string.i_o_dl)));
                textView29.setText(cVar.b("label_coa_in_dl", context2.getString(R.string.change_Add)));
                String str13 = "label_international_driv_permit";
                textView30.setText(cVar.b(str13, context2.getString(R.string.international_driving_permit)));
                String str14 = str2;
                textView31.setText(cVar.b(str14, context2.getString(R.string.dlextract)));
                String str15 = str;
                textView32.setText(cVar.b(str15, context2.getString(R.string.rep_of_dl)));
                textView33.setText(cVar.b("title_dl_serv_renewal", context2.getString(R.string.renewal_dl)));
                textView34.setText(cVar.b("title_dl_serv_duplicate_dl", context2.getString(R.string.i_o_dl)));
                textView36.setText(cVar.b(str13, context2.getString(R.string.international_driving_permit)));
                textView37.setText(cVar.b(str13, context2.getString(R.string.international_driving_permit)));
                textView38.setText(cVar.b(str14, context2.getString(R.string.dlextract)));
                textView39.setText(cVar.b(str14, context2.getString(R.string.dlextract)));
                textView40.setText(cVar.b(str15, context2.getString(R.string.rep_of_dl)));
                textView41.setText(cVar.b("label_notifications", context2.getString(R.string.notifications)));
                textView42.setText(cVar.b("label_notifications", context2.getString(R.string.notifications)));
                textView43.setText(cVar.b("advisory", context2.getString(R.string.advisory_new)));
                textView44.setText(cVar.b("Draft_Notifications", context2.getString(R.string.draft_not)));
                textView45.setText(cVar.b("label_view_more", context2.getString(R.string.view_more)));
                textView46.setText(cVar.b("label_view_more", context2.getString(R.string.view_more)));
                textView47.setText(cVar.b("ALL_FORMS", context2.getString(R.string.rep_of_dl)));
                textView48.setText(cVar.b("label_challan_status", context2.getString(R.string.driving_license)));
                textView49.setText(cVar.b("motor_vehicle_dealers", context2.getString(R.string.m_v_d)));
                textView50.setText(cVar.b("permit", context2.getString(R.string.permit)));
                textView51.setText(cVar.b("vehicle_registration", context2.getString(R.string.v_reg)));
                textView52.setText(cVar.b(str15, context2.getString(R.string.v_r)));
            } catch (Exception unused) {
            }
        }

        public final void p2(Context context, zb zbVar) {
            l.f(context, "context");
            l.f(zbVar, "binding");
            c cVar = new c(context);
            zbVar.f29766b.setText(cVar.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            zbVar.f29767c.setText(cVar.b("btn_ok", context.getString(R.string.ok_text)));
        }

        public final void q(Context context, ad adVar) {
            l.f(context, "context");
            l.f(adVar, "sw");
            c cVar = new c(context);
            adVar.f25358h.setText(cVar.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            adVar.f25359i.setText(cVar.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            adVar.f25359i.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            adVar.f25356f.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_no)));
            adVar.f25357g.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            adVar.f25353c.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void q0(Context context, ha haVar) {
            l.f(context, "context");
            l.f(haVar, "dl_holder_details");
            c cVar = new c(context);
            haVar.f26662h0.setText(cVar.b("title_dl_serv_personal_info", context.getString(R.string.personal_info)));
            haVar.Y.setText(cVar.b("title_dl_serv_information", context.getString(R.string.dl_info)));
            haVar.T.setText(cVar.b("title_dl_serv_class_vehicle", context.getString(R.string.class_vehicle)));
            haVar.M.setText(cVar.b("btn_dl_serv_close", context.getString(R.string.close)));
            haVar.X.setText(cVar.b("label_dl_holder_name", context.getString(R.string.driver_details_)));
            haVar.f26656b0.setText(cVar.b("label_dl_serv_father_name", context.getString(R.string.father_name)));
            haVar.f26661g0.setText(cVar.b("label_dl_serv_permn_addr", context.getString(R.string.permanent_address)));
            haVar.f26655a0.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            haVar.S.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            haVar.Z.setText(cVar.b("label_dl_serv_issue_date", context.getString(R.string.dl_issue_date)));
            haVar.f26660f0.setText(cVar.b("label_dl_serv_nt_valid_upto", context.getString(R.string.nt_valid_upto)));
            haVar.f26657c0.setText(cVar.b("label_dl_serv_issue_authority", context.getString(R.string.issue_authority)));
            haVar.f26666l0.setText(cVar.b("label_dl_serv_tr_valid_upto", context.getString(R.string.tr_valid_upto)));
            haVar.f26659e0.setText(cVar.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            haVar.f26658d0.setText(cVar.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
        }

        public final void q1(Context context, ic icVar) {
            l.f(context, "context");
            l.f(icVar, "mBnding");
            c cVar = new c(context);
            icVar.I.f28308i.setText(cVar.b("txt_md", context.getString(R.string.txt_md)));
            icVar.C.setText(cVar.b("Vehicle_Search_History", "Vehicle Search History"));
            icVar.f26871z.setText(cVar.b("Driving_Licence_Search_History", "Driving Licence Search History"));
            icVar.J.setText(cVar.b("Vehicle_Transactions", "Vehicle Transactions"));
            icVar.f26861p.setText(cVar.b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            icVar.f26854i.setText(cVar.b("Challan_Transactions", "Challan Transactions"));
        }

        public final void q2(Context context, bc bcVar) {
            l.f(context, "context");
            l.f(bcVar, "binding");
            c cVar = new c(context);
            SpannableString spannableString = new SpannableString(cVar.b("rcServices", context.getString(R.string.rc_service)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            bcVar.f25561f.f28308i.setText(spannableString);
            bcVar.f25563h.setText(cVar.b("selectServiceToApply", context.getString(R.string.selectservice)));
            bcVar.f25559d.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            bcVar.f25558c.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
        }

        public final void r(Context context, h hVar) {
            l.f(context, "context");
            l.f(hVar, "binding");
            c cVar = new c(context);
            hVar.f26556b.setText(cVar.b("Emergency_Service", "Add Alarm"));
            hVar.f26571q.setText(cVar.b("create_ep", "Manage your emergency contacts"));
            hVar.f26569o.setText(cVar.b("add_emergency_contact", "Create Emergency Profile"));
            hVar.f26570p.setText(cVar.b("i_can_help", "I can help best during critical moments if I have someone to reach out to. Go ahead and tap the (+) button to add someone."));
            hVar.f26566l.setText(cVar.b("Emergency_Contact", "Emergency Contact"));
        }

        public final void r0(Context context, c2 c2Var) {
            l.f(context, "context");
            l.f(c2Var, "binding");
            c cVar = new c(context);
            c2Var.M.setText(cVar.b("label_dl_serv_state", context.getString(R.string.state)));
            c2Var.F.setText(cVar.b("label_dl_serv_rto", context.getString(R.string.rto)));
            c2Var.O.setText(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            c2Var.I.setText(cVar.b("selelcted_class_vehicle", context.getString(R.string.selected_following_learner_class)));
            c2Var.f25597w.setText(cVar.b("dl_add_driving_school", context.getString(R.string.add_driving_school)));
            c2Var.N.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            c2Var.Q.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            c2Var.D.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            c2Var.K.setText(cVar.b("here_by_declare", context.getString(R.string.self_declartion)));
            c2Var.f25600z.setText(cVar.b("button_cancel", context.getString(R.string.cancel)));
            c2Var.C.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void r1(Context context, g6 g6Var) {
            l.f(context, "context");
            l.f(g6Var, "binding");
            c cVar = new c(context);
            TextView textView = g6Var.f26496o;
            f.a aVar = f.f17510a;
            textView.setText(cVar.b(aVar.C0(), "Nearest Pollution Checking Centre"));
            g6Var.f26498q.setText(cVar.b(aVar.D0(), "Nearest RTO"));
            g6Var.f26492k.setText(cVar.b(aVar.A0(), "Nearest Fuel Pump"));
            g6Var.f26495n.setText(cVar.b(aVar.B0(), "Nearest Hospital"));
            g6Var.f26497p.setText(cVar.b(aVar.X0(), "View map"));
            g6Var.f26499r.setText(cVar.b(aVar.X0(), "View map"));
            g6Var.f26493l.setText(cVar.b(aVar.X0(), "View map"));
            g6Var.f26494m.setText(cVar.b(aVar.X0(), "View map"));
            g6Var.f26491j.f25961g.setText(cVar.b("near_by", "Near By"));
        }

        public final void r2(Context context, e9 e9Var) {
            l.f(context, "context");
            l.f(e9Var, "binding");
            c cVar = new c(context);
            e9Var.f26113r.setText(cVar.b("vehicle_service", context.getString(R.string.vehicle_service)));
            e9Var.f26114s.setText(cVar.b("vehicle_number", context.getString(R.string.vehicle_number)));
            e9Var.f26112q.setText(cVar.b("vehicle_number", context.getString(R.string.vehicle_number)));
            e9Var.f26105j.setText(cVar.b("label_dl_serv_state", context.getString(R.string.state)));
            e9Var.f26104i.setText(cVar.b("label_dl_serv_rto", context.getString(R.string.rto)));
            e9Var.f26098c.setText(cVar.b("issue_of_duplicate_rc", context.getString(R.string.issue_of_duplicate_rc)));
            e9Var.f26097b.setText(cVar.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            e9Var.f26107l.setText(cVar.b("label_transfer_ownership", context.getString(R.string.transfer_of_ownership)));
            e9Var.f26103h.setText(cVar.b("label_rc_particular", context.getString(R.string.rc_particular)));
            e9Var.f26110o.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            e9Var.f26108m.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            e9Var.f26099d.setText(cVar.b("hypothecation_addition", context.getString(R.string.hypothecation_addition)));
            e9Var.f26101f.setText(cVar.b("hypothecation_termination", context.getString(R.string.hypothecation_termination)));
            e9Var.f26100e.setText(cVar.b("hypothecation_continuation", context.getString(R.string.hypothecation_continuation)));
            e9Var.f26102g.setText(cVar.b("no_objection_certificate_noc", context.getString(R.string.no_objection_certificate_noc)));
        }

        public final void s(Context context, n1 n1Var) {
            l.f(context, "context");
            l.f(n1Var, "ac");
            c cVar = new c(context);
            n1Var.f27537h.setText(cVar.b("vahan_application_name", context.getString(R.string.application_no_mend)));
            n1Var.f27532c.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            n1Var.f27538i.setText(cVar.b("lbl_dob", "Date of Birth"));
            n1Var.f27531b.setHint(cVar.b("edit_dl_serv_dob", "Enter Date of Birth"));
            n1Var.f27541l.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            n1Var.f27533d.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void s0(Context context, uc ucVar) {
            l.f(context, "context");
            l.f(ucVar, "dl_mob");
            c cVar = new c(context);
            ucVar.f28889y.setText(cVar.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            ucVar.f28867c.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            ucVar.A.setText(cVar.b("label_dl_serv_update_mob", context.getString(R.string.update2)));
            ucVar.f28878n.setHint(cVar.b("label_mb", context.getString(R.string.enter_mobile_number)));
            ucVar.f28866b.setText(cVar.b("title_dl_serv_terms_cond", context.getString(R.string.agree_terms_cond)));
            ucVar.f28884t.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            ucVar.f28872h.setText(cVar.b("btn_dl_serv_gen_otp", context.getString(R.string.generate_otp)));
        }

        public final void s1(Context context, h6 h6Var) {
            Context context2 = context;
            h6 h6Var2 = h6Var;
            l.f(context2, "context");
            l.f(h6Var2, "cl_one");
            c cVar = new c(context2);
            MyTextView myTextView = h6Var2.f26620k0;
            myTextView.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            MyTextView myTextView2 = h6Var2.f26621l0;
            myTextView2.setText(cVar.b("label_dl_serv_rto", "RTO Name") + " * ");
            h6Var2.f26622m0.setText(cVar.b("personal_details", context2.getString(R.string.personal_details)));
            TextView textView = h6Var2.V;
            textView.setText(cVar.b("first_name", "First Name") + " * ");
            h6Var2.B.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.enter_first_name)));
            h6Var2.X.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            h6Var2.D.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            h6Var2.W.setText(cVar.b("last_name", "Last Name"));
            h6Var2.C.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            h6Var2.f26618i0.setText(cVar.b("relation", context2.getString(R.string.relation)));
            TextView textView2 = h6Var2.f26623n0;
            textView2.setText(cVar.b("first_name", "First Name") + " * ");
            h6Var2.f26624o0.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context2.getString(R.string.enter_first_name)));
            h6Var2.f26627r0.setText(cVar.b("middle_name", context2.getString(R.string.middle_name)));
            h6Var2.f26628s0.setHint(cVar.b("enter_mdl_name", context2.getString(R.string.enter_middle_name)));
            h6Var2.f26625p0.setText(cVar.b("last_name", "Last Name"));
            h6Var2.f26626q0.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context2.getString(R.string.enter_last_name)));
            TextView textView3 = h6Var2.f26613d0;
            textView3.setText(cVar.b("appl_gender", context2.getString(R.string.gender)) + " * ");
            h6Var2.N.setText(cVar.b("appl_male", context2.getString(R.string.male)));
            h6Var2.K.setText(cVar.b("appl_female", context2.getString(R.string.female)));
            h6Var2.T.setText(cVar.b("appl_trans", context2.getString(R.string.transgender)));
            TextView textView4 = h6Var2.f26610a0;
            textView4.setText(cVar.b("lbl_dob", context2.getString(R.string.dob_txt)) + " * ");
            TextView textView5 = h6Var2.Y;
            textView5.setText(cVar.b("birth_place", "Birth Place") + " * ");
            TextView textView6 = h6Var2.f26619j0;
            textView6.setText(cVar.b("appl_religion", "Religion") + " * ");
            TextView textView7 = h6Var2.f26611b0;
            textView7.setText(cVar.b("education_qualification", "Education Qualification") + " * ");
            TextView textView8 = h6Var2.Z;
            textView8.setText(cVar.b("blood_group", "Blood Group") + " * ");
            h6Var2.f26617h0.setText(cVar.b("phone_number", context2.getString(R.string.phone_number1)));
            h6Var2.J.setHint(cVar.b("enter_phone_number", context2.getString(R.string.enter_phone_no)));
            h6Var2.f26612c0.setText(cVar.b("Email_id", context2.getString(R.string.email_id)));
            h6Var2.F.setHint(cVar.b("enter_email_id", context2.getString(R.string.enter_email)));
            TextView textView9 = h6Var2.f26616g0;
            textView9.setText(cVar.b("edit_mobile_no", "Mobile No.") + " * ");
            h6Var2.I.setHint(cVar.b("edit_dl_serv_mob_no", context2.getString(R.string.enter_mobile_number_hint)));
            h6Var2.U.setText(cVar.b("alt_mob_number", context2.getString(R.string.alt_mobile_no)));
            h6Var2.A.setHint(cVar.b("enter_alt_mob_number", context2.getString(R.string.enter_alt_mobile_number_hint)));
            h6Var2.f26614e0.setText(cVar.b("MARK_ONE", "Identification Mark 1"));
            h6Var2.f26615f0.setText(cVar.b("MARK_TWO", "Identification Mark 2"));
            h6Var2.G.setHint(cVar.b("MARK_TWO", context2.getString(R.string.enter_identification_mark_1)));
            h6Var2.H.setHint(cVar.b("MARK_TWO", context2.getString(R.string.enter_identification_mark_1)));
            h6Var2.f26629w.setText(cVar.b("btn_dl_serv_next", context2.getString(R.string.next)));
        }

        public final void s2(Context context, w8 w8Var) {
            Context context2 = context;
            w8 w8Var2 = w8Var;
            l.f(context2, "context");
            l.f(w8Var2, "binding");
            c cVar = new c(context2);
            w8Var2.f29207o.setText(cVar.b("title_dl_serv_exist_addr", context2.getString(R.string.existing_address)));
            w8Var2.P.setText(cVar.b("label_dl_serv_valid_from", context2.getString(R.string.valid_from)));
            w8Var2.f29212t.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            w8Var2.L.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            w8Var2.f29203k.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            w8Var2.G.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            w8Var2.f29213u.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.new_permanent_address_details)));
            w8Var2.M.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            w8Var2.f29203k.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            w8Var2.G.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            w8Var2.S.setText(cVar.b("vehicle_no_dlyyxx0000", ""));
            w8Var2.T.setText(cVar.b("view_vehicle_details", context2.getString(R.string.view_vehicle_details)));
            w8Var2.O.f28308i.setText(cVar.b("change_of_address_in_rc2", context2.getString(R.string.change_of_address_in_rc2)));
            w8Var2.f29207o.setText(cVar.b("existing_address", context2.getString(R.string.existing_address)));
            w8Var2.f29197e.setText(cVar.b("current_address", context2.getString(R.string.current_address)));
            w8Var2.f29215w.setText(cVar.b("permanent_address", context2.getString(R.string.permanent_address)));
            w8Var2.f29216x.setText(cVar.b("permanent_address", context2.getString(R.string.permanent_address)));
            w8Var2.Q.setHint(cVar.b("select_date", context2.getString(R.string.select_date)));
            w8Var2.f29211s.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            w8Var2.U.setText(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            w8Var2.J.setText(cVar.b("same_as_current_address", context2.getString(R.string.same_as_current_address)));
            w8Var2.f29209q.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            w8Var2.f29208p.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            w8Var2.V.setText(cVar.b("village_town_city", "Village/Town/City"));
            w8Var2.f29210r.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            w8Var2.M.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            w8Var2.f29204l.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            w8Var2.H.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            w8Var2.N.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.submit)));
            w8Var2.I.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            w8Var2.I.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            w8Var2.I.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            w8Var2.I.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void t(Context context, q1 q1Var) {
            l.f(context, "context");
            l.f(q1Var, "ac");
            c cVar = new c(context);
            q1Var.f28126m0.setText(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            q1Var.f28133z.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            q1Var.T.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void t0(Context context, r2 r2Var) {
            l.f(context, "context");
            l.f(r2Var, "binding");
            c cVar = new c(context);
            r2Var.f28332i0.setText(cVar.b("personal_details", context.getString(R.string.personal_details)));
            r2Var.U.setText(cVar.b("name_of_applicant", context.getString(R.string.name_of_applicant_ll)));
            r2Var.f28339z.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            r2Var.B.setHint(cVar.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            r2Var.A.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            r2Var.T.setText(cVar.b("full_name_as_per_records", context.getString(R.string.full_name_txt)));
            r2Var.f28324a0.setHint(cVar.b("enter_full_name_as_record", context.getString(R.string.enter_full_name_as_per_record)));
            r2Var.f28330g0.setText(cVar.b("label_relation", context.getString(R.string.relation_is)));
            r2Var.f28333j0.setHint(cVar.b("PLEASE_ENTER_FIRST_NAME", context.getString(R.string.enter_first_name)));
            r2Var.f28335l0.setHint(cVar.b("enter_mdl_name", context.getString(R.string.enter_middle_name)));
            r2Var.f28334k0.setHint(cVar.b("PLEASE_ENTER_LAST_NAME", context.getString(R.string.enter_last_name)));
            r2Var.f28325b0.setText(cVar.b("appl_gender", context.getString(R.string.gender)));
            r2Var.L.setText(cVar.b("appl_female", context.getString(R.string.female)));
            r2Var.O.setText(cVar.b("appl_male", context.getString(R.string.male)));
            r2Var.R.setText(cVar.b("appl_trans", context.getString(R.string.transgender)));
            r2Var.X.setText(cVar.b("lbl_dob", context.getString(R.string.dob_txt)));
            r2Var.f28337x.setText(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            r2Var.V.setText(cVar.b("birth_place", context.getString(R.string.birth_place)));
            r2Var.C.setHint(cVar.b("edit_dl_serv_enter_birth_plac", context.getString(R.string.enter_birth_place)));
            r2Var.f28331h0.setText(cVar.b("country_of_birth", context.getString(R.string.country_birth_ll)));
            r2Var.E.setHint(cVar.b("edit_dl_serv_selc_country", context.getString(R.string.select_country)));
            r2Var.Y.setText(cVar.b("education_qualification", context.getString(R.string.education_qualification)));
            r2Var.W.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            r2Var.Z.setText(cVar.b("Email_id", context.getString(R.string.email_id)));
            r2Var.G.setHint(cVar.b("enter_email_id", context.getString(R.string.enter_email)));
            r2Var.f28328e0.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_number_txt)));
            r2Var.J.setHint(cVar.b("edit_dl_serv_mob_no", context.getString(R.string.enter_mobile_number_hint)));
            r2Var.S.setText(cVar.b("emergency_mobile_no", context.getString(R.string.emergency_mob_number_ll)));
            r2Var.f28338y.setHint(cVar.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            r2Var.f28338y.setHint(cVar.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            r2Var.f28338y.setHint(cVar.b("enter_alt_mob_number", context.getString(R.string.enter_alt_mobile_number_hint)));
            r2Var.f28326c0.setText(cVar.b("id_marks_ll", context.getString(R.string.id_marks_ll)));
            r2Var.f28327d0.setText(cVar.b("ident_mark_2", context.getString(R.string.identification_mark_2)));
            r2Var.f28336w.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void t1(Context context, l6 l6Var) {
            l.f(context, "context");
            l.f(l6Var, "clf");
            c cVar = new c(context);
            l6Var.V.setText(cVar.b("first_aid_Details", context.getString(R.string.first_aid_details)));
            TextView textView = l6Var.U;
            textView.setText(cVar.b("fa_issuing_name", "FA Issuing Institution Name") + " * ");
            l6Var.C.setHint(cVar.b("enter_in", context.getString(R.string.institute_name)));
            TextView textView2 = l6Var.P;
            textView2.setText(cVar.b("certification_number", "Certification No.") + " * ");
            l6Var.f27274y.setHint(cVar.b("enter_certification_no", context.getString(R.string.enter_certification_no)));
            TextView textView3 = l6Var.Y;
            textView3.setText(cVar.b("place_of_issued", "Place of Issued") + " * ");
            l6Var.E.setHint(cVar.b("enter_place_issue", context.getString(R.string.enter_place_of_issued)));
            TextView textView4 = l6Var.X;
            textView4.setText(cVar.b("issue_date", "Issue Date") + " * ");
            l6Var.f27270b0.setText(cVar.b("is_it_perm", context.getString(R.string.is_it_permanent)));
            l6Var.K.setText(cVar.b("radio_dl_serv_yes", context.getString(R.string.yes)));
            l6Var.F.setText(cVar.b("radio_dl_serv_no", context.getString(R.string.f19026no)));
            l6Var.Z.setText(cVar.b("medical_fitt_details", context.getString(R.string.medical_fitness_details)));
            TextView textView5 = l6Var.W;
            textView5.setText(cVar.b("fitness_Cert_no", "Fitness Certificate No.") + " * ");
            l6Var.D.setHint(cVar.b("enter_fitness_certificate", context.getString(R.string.enter_fitness_cert_no)));
            TextView textView6 = l6Var.S;
            textView6.setText(cVar.b("doc_name", "Doctor Name") + " * ");
            l6Var.A.setHint(cVar.b("enter_doc_name", context.getString(R.string.enter_doc_name)));
            l6Var.T.setText(cVar.b("doctor_registeration", context.getString(R.string.doc_reg_no)));
            l6Var.B.setHint(cVar.b("enter_doc_reg_no", context.getString(R.string.reg_num_hint)));
            TextView textView7 = l6Var.Q;
            textView7.setText(cVar.b("clinic_name_place", "Clinic Name and Place") + " * ");
            l6Var.f27275z.setHint(cVar.b("enter_clinic_np", context.getString(R.string.enter_clinic_name_place)));
            TextView textView8 = l6Var.f27269a0;
            textView8.setText(cVar.b("issue_date", "Issue Date") + " * ");
            l6Var.L.setText(cVar.b("enter_issue_date", context.getString(R.string.enter_issue_date)));
            l6Var.R.setText(cVar.b("declaration", context.getString(R.string.declaration)));
            l6Var.f27271c0.setText(cVar.b("label_dl_serv_note_detail", context.getString(R.string.willing_to_donate)));
            l6Var.f27273x.setText(cVar.b("cl_submit_dec", context.getString(R.string.cl_declaration)));
            l6Var.f27272w.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void t2(Context context, y9 y9Var) {
            Context context2 = context;
            y9 y9Var2 = y9Var;
            l.f(context2, "context");
            l.f(y9Var2, "binding");
            c cVar = new c(context2);
            y9Var2.f29540o.setText(cVar.b("title_dl_serv_exist_addr", context2.getString(R.string.existing_address)));
            y9Var2.Q.setText(cVar.b("label_dl_serv_valid_from", context2.getString(R.string.valid_from)));
            y9Var2.f29545t.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            y9Var2.L.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            y9Var2.f29536k.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            y9Var2.G.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            y9Var2.f29546u.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.new_permanent_address_details)));
            y9Var2.M.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            y9Var2.f29536k.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            y9Var2.G.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            y9Var2.T.setText(cVar.b("vehicle_no_dlyyxx0000", ""));
            y9Var2.U.setText(cVar.b("view_vehicle_details", context2.getString(R.string.view_vehicle_details)));
            y9Var2.P.f28308i.setText(cVar.b("change_of_address_in_rc2", context2.getString(R.string.change_of_address_in_rc2)));
            y9Var2.f29540o.setText(cVar.b("existing_address", context2.getString(R.string.existing_address)));
            y9Var2.f29530e.setText(cVar.b("current_address", context2.getString(R.string.current_address)));
            y9Var2.f29548w.setText(cVar.b("permanent_address", context2.getString(R.string.permanent_address)));
            y9Var2.f29549x.setText(cVar.b("permanent_address", context2.getString(R.string.permanent_address)));
            y9Var2.R.setHint(cVar.b("select_date", context2.getString(R.string.select_date)));
            y9Var2.f29544s.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            y9Var2.V.setText(cVar.b("village_town_city", context2.getString(R.string.village_town_city)));
            y9Var2.J.setText(cVar.b("same_as_current_address", context2.getString(R.string.same_as_current_address)));
            y9Var2.f29542q.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            y9Var2.f29541p.setText(cVar.b("house_no_and_street_name", context2.getString(R.string.house_no_and_street_name)));
            y9Var2.W.setText(cVar.b("village_town_city", "Village/Town/City"));
            y9Var2.f29543r.setText(cVar.b("landmark_police_station", context2.getString(R.string.landmark_police_station)));
            y9Var2.M.setText(cVar.b("vahan_state", context2.getString(R.string.state)));
            y9Var2.f29537l.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district)));
            y9Var2.H.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode)));
            y9Var2.O.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.submit)));
            y9Var2.I.f27164g.setText(cVar.b("vehicle_details", "Vehicle Details"));
            y9Var2.I.f27161d.setText(cVar.b("logo_dl_fee_details", "Fee Details"));
            y9Var2.I.f27160c.setText(cVar.b("logo_dl_dms_upload_doc", "DMS (Upload Docs)"));
            y9Var2.I.f27163f.setText(cVar.b("logo_dl_appointment_book", "Appointment Booking"));
        }

        public final void u(Context context, j2 j2Var) {
            l.f(context, "context");
            l.f(j2Var, "binding");
            c cVar = new c(context);
            j2Var.D.setText(cVar.b("vehicle_class_training", context.getString(R.string.class_of_vehicle_for_which_training_taken)));
            j2Var.X.setHint(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            j2Var.Q.setText(cVar.b("state_school_list", context.getString(R.string.state_wise_driving_school)));
            j2Var.G.setHint(cVar.b("select_d_school", context.getString(R.string.select_d_school)));
            j2Var.L.setText(cVar.b("enrollment_no", context.getString(R.string.enrollment_no)));
            j2Var.K.setHint(cVar.b("enter_enrollement_no", context.getString(R.string.enter_enrollment_no)));
            j2Var.I.setText(cVar.b("enrollement_date", context.getString(R.string.enrollment_date)));
            j2Var.H.setHint(cVar.b("enter_enrollement_date", context.getString(R.string.enter_enrollment_date)));
            j2Var.C.setText(cVar.b("certificate_no", context.getString(R.string.certificate_no)));
            j2Var.B.setHint(cVar.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            j2Var.A.setText(cVar.b("certificate_date", context.getString(R.string.certificate_date)));
            j2Var.f26927z.setHint(cVar.b("enter_certificate_date", context.getString(R.string.enter_certificate_date)));
            j2Var.U.setText(cVar.b("trained_from", context.getString(R.string.trained_from)));
            j2Var.T.setHint(cVar.b("enter_trained_from", context.getString(R.string.enter_trained_from)));
            j2Var.W.setText(cVar.b("trained_to", context.getString(R.string.trained_to)));
            j2Var.V.setHint(cVar.b("enter_trained_to", context.getString(R.string.enter_trained_to)));
            j2Var.N.setText(cVar.b("save_add_more", context.getString(R.string.save_add_more)));
            j2Var.O.setText(cVar.b("label_save", context.getString(R.string.save)));
            j2Var.f26926y.setText(cVar.b("btn_go_back", context.getString(R.string.back)));
        }

        public final void u0(Context context, ka kaVar) {
            l.f(context, "context");
            l.f(kaVar, "dl_Service_list");
            c cVar = new c(context);
            kaVar.f27157z.setText(cVar.b("label_dl_serv_last_endor_state", context.getString(R.string.last_state)));
            kaVar.f27156y.setText(cVar.b("label_dl_serv_last_endor_rto", context.getString(R.string.last_rto)));
            kaVar.B.setText(cVar.b("label_dl_serv_req_sub_state", context.getString(R.string.current_state)));
            kaVar.C.setText(cVar.b("label_dl_serv_req_sub_rto", context.getString(R.string.current_rto)));
            kaVar.D.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            kaVar.E.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void u1(Context context, n6 n6Var) {
            Context context2 = context;
            n6 n6Var2 = n6Var;
            l.f(context2, "context");
            l.f(n6Var2, "cl_coa");
            c cVar = new c(context2);
            n6Var2.f27587k0.setText(cVar.b("title_dl_serv_exist_curr_addr", context2.getString(R.string.existing_current_address)));
            n6Var2.f27588l0.setText(cVar.b("title_dl_serv_exist_perm_addr", context2.getString(R.string.existing_permanent_address)));
            TextView textView = n6Var2.f27597u0;
            textView.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            n6Var2.f27603y.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView2 = n6Var2.f27585i0;
            textView2.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            n6Var2.f27601x.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView3 = n6Var2.f27604y0;
            textView3.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            n6Var2.f27599w.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            n6Var2.f27584h0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            n6Var2.L.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            n6Var2.f27589m0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            n6Var2.K.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            n6Var2.f27600w0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            n6Var2.O.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView4 = n6Var2.f27591o0;
            textView4.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            n6Var2.M.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView5 = n6Var2.f27595s0;
            textView5.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            n6Var2.N.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            n6Var2.S.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            n6Var2.f27582f0.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            n6Var2.f27594r0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            n6Var2.f27594r0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            TextView textView6 = n6Var2.f27598v0;
            textView6.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            n6Var2.F.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView7 = n6Var2.f27586j0;
            textView7.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            n6Var2.E.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView8 = n6Var2.f27606z0;
            textView8.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            n6Var2.D.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            n6Var2.I.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            n6Var2.H.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            n6Var2.G.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            n6Var2.f27590n0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            n6Var2.f27605z.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            n6Var2.f27602x0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            n6Var2.C.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView9 = n6Var2.f27592p0;
            textView9.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            n6Var2.A.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView10 = n6Var2.f27596t0;
            textView10.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            n6Var2.B.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            n6Var2.f27583g0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            n6Var2.f27593q0.setText(cVar.b("current_add_details", context2.getString(R.string.current_address_details)));
            n6Var2.A0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            n6Var2.f27583g0.setText(cVar.b("btn_dl_serv_next", context2.getString(R.string.next)));
        }

        public final void u2(Context context, f0 f0Var) {
            l.f(context, "context");
            l.f(f0Var, "binding");
            c cVar = new c(context);
            f0Var.f26171b.setText(cVar.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            f0Var.f26172c.setText(cVar.b("btn_ok", context.getString(R.string.text_ok)));
        }

        public final void v(Context context, j2 j2Var) {
            l.f(context, "context");
            l.f(j2Var, "binding");
            c cVar = new c(context);
            j2Var.D.setText(cVar.b("vehicle_class_training", context.getString(R.string.class_of_vehicle_for_which_training_taken)));
            j2Var.X.setHint(cVar.b("select_class_vehicle", context.getString(R.string.select_class_of_vehcile)));
            j2Var.Q.setText(cVar.b("state_school_list", context.getString(R.string.state_wise_driving_school)));
            j2Var.G.setHint(cVar.b("select_d_school", context.getString(R.string.select_d_school)));
            j2Var.L.setText(cVar.b("enrollment_no", context.getString(R.string.enrollment_no)));
            j2Var.K.setHint(cVar.b("enter_enrollement_no", context.getString(R.string.enter_enrollment_no)));
            j2Var.I.setText(cVar.b("enrollement_date", context.getString(R.string.enrollment_date)));
            j2Var.H.setHint(cVar.b("enter_enrollement_date", context.getString(R.string.enter_enrollment_date)));
            j2Var.C.setText(cVar.b("certificate_no", context.getString(R.string.certificate_no)));
            j2Var.B.setHint(cVar.b("enter_certificate_number", context.getString(R.string.enter_certificate_number)));
            j2Var.A.setText(cVar.b("certificate_date", context.getString(R.string.certificate_date)));
            j2Var.f26927z.setHint(cVar.b("enter_certificate_date", context.getString(R.string.enter_certificate_date)));
            j2Var.U.setText(cVar.b("trained_from", context.getString(R.string.trained_from)));
            j2Var.T.setHint(cVar.b("enter_trained_from", context.getString(R.string.enter_trained_from)));
            j2Var.W.setText(cVar.b("trained_to", context.getString(R.string.trained_to)));
            j2Var.V.setHint(cVar.b("enter_trained_to", context.getString(R.string.enter_trained_to)));
            j2Var.N.setText(cVar.b("save_add_more", context.getString(R.string.save_add_more)));
            j2Var.O.setText(cVar.b("label_save", context.getString(R.string.save)));
            j2Var.f26926y.setText(cVar.b("btn_go_back", context.getString(R.string.back)));
        }

        public final void v0(Context context, d3 d3Var) {
            l.f(context, "context");
            l.f(d3Var, "dl_main_binding");
            c cVar = new c(context);
            d3Var.f25850w.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            d3Var.f25851x.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
            d3Var.G.setText(cVar.b("title_dl_serv_go_aval", context.getString(R.string.go_for_available_services)));
            d3Var.Q.setText(cVar.b("title_dl_services", context.getString(R.string.driving_license_services)));
            d3Var.D.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            d3Var.O.setText(cVar.b("title_dl_serv_no", context.getString(R.string.driving_license_no)));
            d3Var.f25852y.setText(cVar.b("title_dl_serv_my_dl", context.getString(R.string.driving_license_services)));
            d3Var.A.setText(cVar.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            d3Var.f25853z.setText(cVar.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            d3Var.P.setText(cVar.b("label_note", context.getString(R.string.notes)));
            d3Var.M.setText(cVar.b("dl_serv_note", context.getString(R.string.new_note)));
            d3Var.H.setHint(cVar.b("title_dl_serv_enter_dl", context.getString(R.string.enter_driving_license_no)));
            d3Var.F.setHint(cVar.b("edit_dl_serv_dob", context.getString(R.string.enter_date_of_birth)));
            d3Var.B.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            d3Var.C.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
        }

        public final void v1(Context context, p6 p6Var) {
            l.f(context, "context");
            l.f(p6Var, "binding");
            c cVar = new c(context);
            p6Var.f27959z.setText(cVar.b("create_a_virtual_dl", context.getString(R.string.create_a_virtual_dl)));
            p6Var.f27954u.setText(cVar.b("dl_number", context.getString(R.string.dl_no)));
            p6Var.f27942i.setHint(cVar.b("title_dl_serv_enter_dl", context.getString(R.string.other_driving_license)));
            p6Var.f27955v.setText(cVar.b("lbl_dob", context.getString(R.string.date_of_birth)));
            p6Var.f27952s.setText(cVar.b("addMyDl", "Add My Driving Licence"));
            p6Var.f27957x.setText(cVar.b("My_Virtual_DL", context.getString(R.string.my_virtual_dl)));
            p6Var.f27958y.setText(cVar.b("dl_number", context.getString(R.string.dl_no)));
            p6Var.A.setText(cVar.b("view_virtual_dl", context.getString(R.string.view_virtual_dl)));
            p6Var.f27953t.setText(cVar.b("view_alert", context.getString(R.string.alert)));
            p6Var.A.setText(cVar.b(f.f17510a.G(), context.getString(R.string.view_virtual_dl)));
        }

        public final void v2(Context context, jd jdVar) {
            l.f(context, "context");
            l.f(jdVar, "binding");
            c cVar = new c(context);
            jdVar.f27030b.setText(cVar.b("change_of_address_in_rc", context.getString(R.string.change_of_address_in_rc)));
            jdVar.f27033e.setText(cVar.b("btn_dl_serv_save_image", context.getString(R.string.save_as_image)));
        }

        public final void w(Context context, d0 d0Var) {
            Context context2 = context;
            d0 d0Var2 = d0Var;
            l.f(context2, "context");
            l.f(d0Var2, "cl_coa");
            c cVar = new c(context2);
            d0Var2.C0.setText(cVar.b("view_cl_det", context2.getString(R.string.view_cl_details)));
            d0Var2.f25832m0.setText(cVar.b("title_dl_serv_exist_curr_addr", context2.getString(R.string.existing_current_address)));
            d0Var2.f25833n0.setText(cVar.b("title_dl_serv_exist_perm_addr", context2.getString(R.string.existing_permanent_address)));
            TextView textView = d0Var2.f25843w0;
            textView.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            d0Var2.f25846y.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView2 = d0Var2.f25830k0;
            textView2.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            d0Var2.f25844x.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView3 = d0Var2.A0;
            textView3.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            d0Var2.f25842w.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            d0Var2.f25828i0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            d0Var2.L.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            d0Var2.f25834o0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            d0Var2.K.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            d0Var2.f25847y0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            d0Var2.O.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView4 = d0Var2.f25836q0;
            textView4.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            d0Var2.M.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView5 = d0Var2.f25840u0;
            textView5.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            d0Var2.N.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            d0Var2.S.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            d0Var2.f25826g0.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            d0Var2.f25839t0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            d0Var2.f25839t0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            TextView textView6 = d0Var2.f25845x0;
            textView6.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            d0Var2.F.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView7 = d0Var2.f25831l0;
            textView7.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            d0Var2.E.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView8 = d0Var2.B0;
            textView8.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            d0Var2.D.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            d0Var2.I.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            d0Var2.H.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            d0Var2.G.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            d0Var2.f25835p0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            d0Var2.f25848z.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            d0Var2.f25849z0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            d0Var2.C.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView9 = d0Var2.f25837r0;
            textView9.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            d0Var2.A.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView10 = d0Var2.f25841v0;
            textView10.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            d0Var2.B.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            d0Var2.f25827h0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            d0Var2.f25838s0.setText(cVar.b("current_add_details", context2.getString(R.string.current_address_details)));
            d0Var2.D0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            d0Var2.f25827h0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
        }

        public final void w0(Context context, e2 e2Var) {
            l.f(context, "context");
            l.f(e2Var, "binding");
            c cVar = new c(context);
            e2Var.T.setText(cVar.b("v_d_l_c", context.getString(R.string.v_d_l_c)));
            e2Var.f26036e.setText(cVar.b("label_search", context.getString(R.string.search)));
            e2Var.f26057y.setText(cVar.b("rc_dashboard", "RC Dashboard"));
            e2Var.f26056x.setText(cVar.b("dl_dashboard", "DL Dashboard"));
            e2Var.f26043k.setText(cVar.b("dl_number", "DL Number"));
            e2Var.f26049q.setHint(cVar.b("label_challan_enter_dl_no", "Enter Driving Licence No"));
            e2Var.f26045m.setText(cVar.b("lbl_dob", "Date of Birth"));
            e2Var.N.setText(cVar.b("label_search", "Search"));
            e2Var.f26050r.setText(cVar.b("holder_name", context.getString(R.string.owner_name_for_dl)));
            e2Var.f26035d0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            e2Var.f26052t.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            e2Var.f26058z.setText(cVar.b("makerTitle", context.getString(R.string.valid_upto_v3)));
            e2Var.L.setText(cVar.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            e2Var.K.setText(cVar.b("registeringAuthTitle", context.getString(R.string.rto_code_l)));
            e2Var.O.setText(cVar.b("registeringAuthTitle", context.getString(R.string.driving_licence_tap_text)));
            e2Var.f26030b.setText(cVar.b("add_to_dash", context.getString(R.string.add_to_dl)));
            e2Var.f26034d.setText(cVar.b("label_view_challan", context.getString(R.string.view_challan)));
            e2Var.P.setText(cVar.b("tr_valid", context.getString(R.string.view_challan)));
            e2Var.S.setText(cVar.b("not_create_v_dl", context.getString(R.string.v_r_d_not)));
            e2Var.V.setText(cVar.b("not_create_v_dl", context.getString(R.string.v_dl11)));
            e2Var.H.setText(cVar.b("recent_search", context.getString(R.string.recent_search)));
            e2Var.U.setText(cVar.b("clear_all", context.getString(R.string.clear_all)));
        }

        public final void w1(Context context, jc jcVar) {
            l.f(context, "context");
            l.f(jcVar, "binding");
            c cVar = new c(context);
            jcVar.f27023g.setText(cVar.b("add_NomnName", context.getString(R.string.nominee_name)));
            jcVar.f27025i.setHint(cVar.b("enterAdd_NomnName", context.getString(R.string.enter_nominee_name)));
            jcVar.f27018b.setText(cVar.b("Add_NomnWithRelation", context.getString(R.string.relation_with_nominee)));
            jcVar.f27021e.setText(cVar.b("Add_NomnDate", context.getString(R.string.nomination_date)));
            jcVar.f27022f.setText(cVar.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            jcVar.f27020d.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            jcVar.f27019c.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void w2(Context context, x8 x8Var) {
            l.f(context, "context");
            l.f(x8Var, "binding");
            c cVar = new c(context);
            x8Var.f29381p.f28308i.setText(cVar.b("label_dl_serv_update_mob", context.getString(R.string.update_mobile_no_1)));
            x8Var.f29382q.setText(cVar.b("update_Mobile_No", context.getString(R.string.update_mobile_no)));
            x8Var.f29368c.setText(cVar.b("enter_aadhaar_no", context.getString(R.string.enter_aadhaar_no)));
            x8Var.f29367b.setHint(cVar.b("enter_aadhaar_no", context.getString(R.string.enter_aadhaar_no)));
            x8Var.f29378m.setHint(cVar.b("enter_name_as_per_aadhar", context.getString(R.string.enter_name_as_per_aadhar)));
            x8Var.f29377l.setText(cVar.b("enter_mobile_as_per_aadhar", context.getString(R.string.enter_mobile_as_per_aadhar)));
            x8Var.f29371f.setHint(cVar.b("enter_mobile_as_per_aadhar", context.getString(R.string.enter_mobile_as_per_aadhar)));
            x8Var.f29373h.setText(cVar.b("enter_new_mobile_no", context.getString(R.string.enter_new_mobile_no)));
            x8Var.f29372g.setHint(cVar.b("enter_new_mobile_no", context.getString(R.string.enter_new_mobile_no)));
            x8Var.f29369d.setText(cVar.b("agree_terms_cond", context.getString(R.string.agree_terms_cond)));
            x8Var.f29375j.setText(cVar.b("notes", context.getString(R.string.notes)));
            x8Var.f29374i.setText(cVar.b("dl_serv_note", context.getString(R.string.new_note)));
            x8Var.f29383r.setText(cVar.b("update_Mobile_No", context.getString(R.string.update_mobile_no)));
            x8Var.f29370e.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void x(Context context, b0 b0Var) {
            Context context2 = context;
            b0 b0Var2 = b0Var;
            l.f(context2, "context");
            l.f(b0Var2, "dl_coa");
            c cVar = new c(context2);
            b0Var2.f25425n0.f27679b.setText(cVar.b("logo_dl_details", context2.getString(R.string.dl_det)));
            b0Var2.f25425n0.f27680c.setText(cVar.b("logo_dl_dms_upload_doc", context2.getString(R.string.dms_upload_doc)));
            b0Var2.f25425n0.f27684g.setText(cVar.b("logo_dl_upload_photo_sign", context2.getString(R.string.upload_photo_signature)));
            b0Var2.f25425n0.f27681d.setText(cVar.b("logo_dl_fee_details", context2.getString(R.string.fee_details)));
            b0Var2.f25425n0.f27683f.setText(cVar.b("logo_dl_appointment_book", context2.getString(R.string.app_booking)));
            b0Var2.P0.setText(cVar.b("label_app_category", context2.getString(R.string.app_category)));
            b0Var2.Q0.setText(cVar.b("title_dl_serv_view_details", context2.getString(R.string.view_dl_details)));
            b0Var2.f25435w0.setText(cVar.b("title_dl_serv_exist_addr", context2.getString(R.string.existing_address)));
            b0Var2.f25437x0.setText(cVar.b("title_dl_serv_exist_curr_addr", context2.getString(R.string.existing_current_address)));
            b0Var2.f25439y0.setText(cVar.b("title_dl_serv_exist_perm_addr", context2.getString(R.string.existing_permanent_address)));
            b0Var2.I0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            b0Var2.f25438y.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            b0Var2.f25432u0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            b0Var2.f25436x.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            b0Var2.M0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            b0Var2.f25434w.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            b0Var2.f25431t0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            b0Var2.M.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            b0Var2.f25441z0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            b0Var2.L.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            b0Var2.K0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            b0Var2.P.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            b0Var2.B0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            b0Var2.N.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            b0Var2.G0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            b0Var2.O.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            b0Var2.W.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            b0Var2.f25427p0.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            b0Var2.E0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            b0Var2.E0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            b0Var2.J0.setText(cVar.b("label_dl_serv_state", context2.getString(R.string.state_coa)));
            b0Var2.G.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            b0Var2.f25433v0.setText(cVar.b("label_dl_serv_district", context2.getString(R.string.district_coa)));
            b0Var2.F.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            b0Var2.N0.setText(cVar.b("label_dl_serv_block", context2.getString(R.string.taluka_block)));
            b0Var2.E.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            b0Var2.J.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            b0Var2.I.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            b0Var2.H.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            b0Var2.A0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            b0Var2.A.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            b0Var2.L0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            b0Var2.D.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            b0Var2.C0.setText(cVar.b("label_loc_mark", context2.getString(R.string.landmark_coa)));
            b0Var2.B.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            b0Var2.H0.setText(cVar.b("label_dl_serv_pincode", context2.getString(R.string.pincode_coa)));
            b0Var2.C.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            b0Var2.f25430s0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            b0Var2.D0.setText(cVar.b("current_add_details", context2.getString(R.string.current_address_details)));
            b0Var2.R0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
        }

        public final void x0(Context context, la laVar) {
            l.f(context, "context");
            l.f(laVar, "binding");
            c cVar = new c(context);
            laVar.W.setText(cVar.b("v_d_l_c", context.getString(R.string.dr_lic_alert)));
            laVar.f27330h.setText(cVar.b("virtual_dl", context.getString(R.string.virtual_dl)));
            laVar.P.setText(cVar.b("label_challan_state", context.getString(R.string.state)));
            laVar.f27341s.setText(cVar.b("last_update", context.getString(R.string.last_update)));
            laVar.f27336n.setText(cVar.b("label_challan_owner_name", context.getString(R.string.owner_name)));
            laVar.I.setText(cVar.b("label_sdf", context.getString(R.string.relation)));
            laVar.B.setText(cVar.b("label_dl_serv_present_addr", context.getString(R.string.present_address)));
            laVar.f27348z.setText(cVar.b("permanent_address", context.getString(R.string.permanent_address)));
            laVar.f27339q.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            laVar.f27326e.setText(cVar.b("dl_number", context.getString(R.string.dl_no)));
            laVar.Y.setText(cVar.b("valid_till", context.getString(R.string.valid_till)));
            laVar.S.setText(cVar.b("valid_till_trans", context.getString(R.string.transport_validity_)));
            laVar.f27331i.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            laVar.f27320b.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            laVar.L.setText(cVar.b("registering_auth_title", context.getString(R.string.rto_code_l)));
            laVar.f27319a0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            laVar.M.setText(cVar.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            laVar.f27338p.setText(cVar.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            laVar.f27323c0.setText(cVar.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            laVar.G.setText(cVar.b("recent_challan", context.getString(R.string.recent_challan_details)));
            laVar.f27345w.setText(cVar.b("label_no_challan_found", context.getString(R.string.no_challan_found)));
            laVar.U.setText(cVar.b("label_no_challan_found", context.getString(R.string.dl_note)));
            laVar.R.setText(cVar.b("tap_notify", context.getString(R.string.tap_notify)));
            laVar.f27335m.setText(cVar.b("holder_name", "DL Number Holder Name"));
        }

        public final void x1(Context context, kc kcVar) {
            l.f(context, "context");
            l.f(kcVar, "binding");
            c cVar = new c(context);
            kcVar.f27175k.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            kcVar.f27172h.setHint(cVar.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            kcVar.f27166b.setText(cVar.b("lbl_vahan_chassisNo_full", context.getString(R.string.chassis_no_full)));
            kcVar.f27167c.setHint(cVar.b("vahan_enter_chassis_no", context.getString(R.string.enter_chasis_no)));
            kcVar.f27168d.setText(cVar.b("lbl_vahan_engineNo_full", context.getString(R.string.engine_no_full)));
            kcVar.f27169e.setHint(cVar.b("lbl_vahan_enter_engine_no", context.getString(R.string.enter_engine_no)));
            kcVar.f27174j.setText(cVar.b("registration_date", context.getString(R.string.registration_dt)));
            kcVar.f27173i.setHint(cVar.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            kcVar.f27176l.setText(cVar.b("lbl_vahan_registration_upto_date", context.getString(R.string.registration_upto_date)));
            kcVar.f27177m.setHint(cVar.b("edit_enter_dob", context.getString(R.string.dd_mm_yyyy)));
            kcVar.f27171g.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            kcVar.f27170f.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void x2(Context context, pc pcVar) {
            l.f(context, "context");
            l.f(pcVar, "binding");
            c cVar = new c(context);
            pcVar.K0.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_details)));
            pcVar.f28068v.setText(cVar.b("owner_details", context.getString(R.string.owner_details)));
            pcVar.f28031c0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            pcVar.f28075y0.setText(cVar.b("relation", context.getString(R.string.relation)));
            pcVar.C0.setText(cVar.b("as_per_aadhar", context.getString(R.string.as_per_aadhar)));
            pcVar.f28033d0.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            pcVar.f28032d.setText(cVar.b("current_address", context.getString(R.string.current_add)));
            pcVar.B0.setText(cVar.b("current_address", context.getString(R.string.current_add)));
            pcVar.f28074y.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_details)));
            pcVar.H0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            pcVar.G0.setText(cVar.b("vehicle_details", context.getString(R.string.vehicle_category)));
            pcVar.P.setText(cVar.b("maker_name", context.getString(R.string.maker_name)));
            pcVar.N.setText(cVar.b("maker_model", context.getString(R.string.maker_model)));
            pcVar.f28071w0.setText(cVar.b("registration_date", context.getString(R.string.registration_date)));
            pcVar.f28060r.setText(cVar.b("fuel_type", context.getString(R.string.fuel_type)));
            pcVar.f28027a0.setText(cVar.b("norms_description", context.getString(R.string.norms_description)));
            pcVar.f28056p.setText(cVar.b("fitness_valid_upto", context.getString(R.string.fitness_valid_upto)));
            pcVar.f28077z0.setText(cVar.b("tax_valid_upto", context.getString(R.string.tax_valid_upto)));
            pcVar.f28072x.setText(cVar.b("pucc_details", context.getString(R.string.pucc_details)));
            pcVar.f28067u0.setText(cVar.b("pucc_valid_upto", context.getString(R.string.pucc_valid_upto)));
            pcVar.f28069v0.setHint(cVar.b("pucc_valid_upto", context.getString(R.string.enter_pucc_valid_upto)));
            pcVar.f28064t.setText(cVar.b("insurance_details", context.getString(R.string.insurance_details)));
            pcVar.C.setText(cVar.b("insurance_policy_no", context.getString(R.string.insurance_policy_no)));
            pcVar.D.setText(cVar.b("enter_insurance_policy_number", context.getString(R.string.enter_insurance_policy_number)));
            pcVar.A.setText(cVar.b("insurance_company_name", context.getString(R.string.insurance_company_name)));
            pcVar.f28076z.setText(cVar.b("insurance_company", context.getString(R.string.insurance_company)));
            pcVar.E.setText(cVar.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            pcVar.F.setText(cVar.b("insurance_valid_upto", context.getString(R.string.insurance_valid_upto)));
            pcVar.f28066u.setText(cVar.b("financer_details", context.getString(R.string.financer_details)));
            pcVar.f28048l.setText(cVar.b("financed_from", context.getString(R.string.financed_from)));
            pcVar.f28070w.setText(cVar.b("permit_details", context.getString(R.string.permit_details)));
            pcVar.f28045j0.setText(cVar.b("permit_no", context.getString(R.string.permit_no)));
            pcVar.f28047k0.setHint(cVar.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            pcVar.f28049l0.setText(cVar.b("permit_type", context.getString(R.string.permit_type)));
            pcVar.f28051m0.setHint(cVar.b("enter_permit_type", context.getString(R.string.enter_permit_type)));
            pcVar.f28041h0.setText(cVar.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            pcVar.f28043i0.setHint(cVar.b("permit_issue_date", context.getString(R.string.permit_issue_date)));
            pcVar.f28055o0.setText(cVar.b("permit_valid_from", context.getString(R.string.permit_valid_from)));
            pcVar.f28057p0.setHint(cVar.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            pcVar.f28059q0.setText(cVar.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            pcVar.f28057p0.setHint(cVar.b("enter_permit_valid_from", context.getString(R.string.enter_permit_valid_from)));
            pcVar.S.setText(cVar.b("national_permit_no", context.getString(R.string.national_permit_no)));
            pcVar.T.setHint(cVar.b("rc_Surr_enter_PermitNo", context.getString(R.string.enter_permit_no)));
            pcVar.Q.setText(cVar.b("national_permit_issued_by", context.getString(R.string.national_permit_issued_by)));
            pcVar.R.setHint(cVar.b("enter_permit_issued_by", context.getString(R.string.enter_permit_issued_by)));
            pcVar.V.setText(cVar.b("national_permit_valid_upto", context.getString(R.string.national_permit_valid_upto)));
            pcVar.U.setHint(cVar.b("permit_valid_upto", context.getString(R.string.permit_valid_upto)));
            pcVar.W.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
        }

        public final void y(Context context, v vVar) {
            Context context2 = context;
            v vVar2 = vVar;
            l.f(context2, "context");
            l.f(vVar2, "ll_coa");
            c cVar = new c(context2);
            vVar2.C0.setText(cVar.b("view_ll", context2.getString(R.string.view_ll_details)));
            vVar2.f28927m0.setText(cVar.b("title_dl_serv_exist_curr_addr", context2.getString(R.string.existing_current_address)));
            vVar2.f28928n0.setText(cVar.b("title_dl_serv_exist_perm_addr", context2.getString(R.string.existing_permanent_address)));
            TextView textView = vVar2.f28938w0;
            textView.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            vVar2.f28941y.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView2 = vVar2.f28925k0;
            textView2.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            vVar2.f28939x.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView3 = vVar2.A0;
            textView3.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            vVar2.f28937w.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            vVar2.f28923i0.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.town)));
            vVar2.L.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            vVar2.f28929o0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            vVar2.K.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            vVar2.f28942y0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            vVar2.O.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView4 = vVar2.f28931q0;
            textView4.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            vVar2.M.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView5 = vVar2.f28935u0;
            textView5.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            vVar2.N.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            vVar2.S.setText(cVar.b("title_dl_serv_new_curr_addr_detail", context2.getString(R.string.new_current_address_details)));
            vVar2.f28921g0.setText(cVar.b("check_dl_serv_same_curr_addr", context2.getString(R.string.same_as_curr_add)));
            vVar2.f28934t0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            vVar2.f28934t0.setText(cVar.b("title_dl_serv_new_perm_addr", context2.getString(R.string.perm_add_det)));
            TextView textView6 = vVar2.f28940x0;
            textView6.setText(cVar.b("label_dl_serv_state", "State") + " * ");
            vVar2.F.setHint(cVar.b("edit_dl_serv_selc_state", context2.getString(R.string.select_state)));
            TextView textView7 = vVar2.f28926l0;
            textView7.setText(cVar.b("label_dl_serv_district", "District") + " * ");
            vVar2.E.setHint(cVar.b("edit_dl_serv_selc_district", context2.getString(R.string.select_district)));
            TextView textView8 = vVar2.B0;
            textView8.setText(cVar.b("label_dl_serv_block", "Taluka / Block") + " * ");
            vVar2.D.setHint(cVar.b("edit_dl_serv_selc_block", context2.getString(R.string.select_taluka)));
            vVar2.I.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            vVar2.H.setText(cVar.b("radio_dl_serv_town", context2.getString(R.string.taluka)));
            vVar2.G.setHint(cVar.b("edit_dl_serv_selc_town", context2.getString(R.string.select_v_t)));
            vVar2.f28930p0.setText(cVar.b("label_house_flat_door", context2.getString(R.string.house_door_flatno)));
            vVar2.f28943z.setHint(cVar.b("edit_dl_serv_hous_door_flat", context2.getString(R.string.enter_h_d_f)));
            vVar2.f28944z0.setText(cVar.b("label_street_loc_ps", context2.getString(R.string.street_local_ps)));
            vVar2.C.setHint(cVar.b("edit_dl_serv_stree_loca_polic", context2.getString(R.string.enter_s_l_p)));
            TextView textView9 = vVar2.f28932r0;
            textView9.setText(cVar.b("label_loc_mark", "Location/Landmark (Address 3)") + " * ");
            vVar2.A.setHint(cVar.b("edit_dl_serv_enter_landmark", context2.getString(R.string.enter_landmark)));
            TextView textView10 = vVar2.f28936v0;
            textView10.setText(cVar.b("label_dl_serv_pincode", "Pincode") + " * ");
            vVar2.B.setHint(cVar.b("edit_dl_serv_enter_pincode", context2.getString(R.string.enter_pincode)));
            vVar2.f28922h0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
            vVar2.f28933s0.setText(cVar.b("current_add_details", context2.getString(R.string.current_address_details)));
            vVar2.D0.setText(cVar.b("radio_dl_serv_village", context2.getString(R.string.village)));
            vVar2.f28922h0.setText(cVar.b("vahan_btn_submit", context2.getString(R.string.next)));
        }

        public final void y0(Context context, t1 t1Var) {
            l.f(context, "context");
            l.f(t1Var, "binding");
            c cVar = new c(context);
            t1Var.W.setText(cVar.b("label_virtual_dl", context.getString(R.string.virtual_dl)));
            t1Var.R.setText(cVar.b("vahan_state", context.getString(R.string.state)));
            t1Var.f28635v.setText(cVar.b("last_update", context.getString(R.string.last_update)));
            t1Var.f28626m.setText(cVar.b("holder_name", context.getString(R.string.driver_details_)));
            t1Var.f28627n.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            t1Var.K.setText(cVar.b("label_sdf", context.getString(R.string.relation)));
            t1Var.D.setText(cVar.b("label_dl_serv_present_addr", context.getString(R.string.present_address)));
            t1Var.B.setText(cVar.b("permanent_add_details", context.getString(R.string.permanent_address)));
            t1Var.f28632s.setText(cVar.b("issue_date", context.getString(R.string.issue_date)));
            t1Var.Y.setText(cVar.b("makerTitle", context.getString(R.string.valid_upto_v3_)));
            t1Var.T.setText(cVar.b("makerTitle_t", context.getString(R.string.transport_validity)));
            t1Var.f28622i.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
            t1Var.f28611b.setText(cVar.b("blood_group", context.getString(R.string.blood_group)));
            t1Var.f28610a0.setText(cVar.b("vehicle_class", context.getString(R.string.vehicle_class)));
            t1Var.N.setText(cVar.b("vahan_rto", context.getString(R.string.rto)));
            t1Var.O.setText(cVar.b("registeringAuthTitle", context.getString(R.string.registering_auth_l)));
            t1Var.f28631r.setText(cVar.b("tap_to_check", context.getString(R.string.driving_licence_tap_text)));
            t1Var.f28614c0.setText(cVar.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            t1Var.f28614c0.setText(cVar.b("driving_licence_impound", context.getString(R.string.driving_licence_impound)));
            t1Var.I.setText(cVar.b("recent_challan", context.getString(R.string.recent_challan_details)));
            t1Var.V.setText(cVar.b("note2", context.getString(R.string.dl_note)));
        }

        public final void y1(Context context, h9 h9Var) {
            l.f(context, "context");
            l.f(h9Var, "binding");
            c cVar = new c(context);
            h9Var.f26651o.setText(cVar.b("button_verify", context.getString(R.string.verify)));
            h9Var.f26648l.setText(cVar.b("edit_mobile_no", context.getString(R.string.mobile_no)));
            h9Var.f26650n.setText(cVar.b("edit_mobile_no", context.getString(R.string.otp_sent)));
            h9Var.f26642f.setHint(cVar.b("edit_mobile_no", context.getString(R.string.otp_sent)));
            h9Var.f26653q.setText(cVar.b("label_wait_otp", context.getString(R.string.wait_for_otp)));
            h9Var.f26649m.setText(cVar.b("label_refresh_close", context.getString(R.string.ref_close)));
            h9Var.f26651o.setText(cVar.b("label_get_otp", context.getString(R.string.verify)));
            h9Var.f26647k.setText(cVar.b("button_verify", context.getString(R.string.did_not_get_otp)));
            h9Var.f26645i.setText(cVar.b("label_resend_otp", context.getString(R.string.resend_otp)));
            h9Var.f26639c.setText(cVar.b("button_verify", context.getString(R.string.verify)));
        }

        public final void y2(Context context, a4 a4Var) {
            l.f(context, "context");
            l.f(a4Var, "binding");
            c cVar = new c(context);
            a4Var.f25184f.setText(cVar.b("logo_reprint_receipt", context.getString(R.string.reprint_receipt)));
            a4Var.f25180b.setText(cVar.b("vahan_application_no", context.getString(R.string.application_no)));
            a4Var.f25188j.setHint(cVar.b("vahan_enter_application_no", context.getString(R.string.enter_application_no)));
            a4Var.f25190l.setHint(cVar.b("vahan_enter_registration_no", context.getString(R.string.enter_registration_no)));
            a4Var.f25186h.setText(cVar.b("vahan_registration_no", context.getString(R.string.registration_no)));
            a4Var.f25182d.setText(cVar.b("vahan_chassis_no_last_five", context.getString(R.string.chasis_no_last5_digits)));
            a4Var.f25189k.setHint(cVar.b("vahan_enter_chassis_no", context.getString(R.string.enter_chassis_no)));
            a4Var.f25185g.setText(cVar.b("vahan_btn_submit", context.getString(R.string.submit)));
            a4Var.f25183e.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        }

        public final void z(Context context, ca caVar) {
            l.f(context, "context");
            l.f(caVar, "binding");
            c cVar = new c(context);
            caVar.f25725u0.setText(cVar.b("vehicle_alerts", "Vehicle Alerts"));
            caVar.f25705k0.setText(cVar.b("radio_btn_vehicle_no", "Vehicle Number"));
            caVar.f25704k.setText(cVar.b("fitness_valid_upto", "Fitness Valid Upto"));
            caVar.f25687b0.setText(cVar.b("tax_valid_upto", "Tax Valid Upto"));
            caVar.f25720s.setText(cVar.b("insurance_valid_upto", "Insurance Valid UpTo"));
            caVar.H.setText(cVar.b("pucc_valid_upto", "PUCC Valid UpTo"));
            caVar.f25703j0.setText(cVar.b("permit_valid_upto", "Permit Valid UpTo"));
            caVar.f25699h0.setText(cVar.b("national_permit_no", "National Permit No."));
            caVar.C.setText(cVar.b("tap_notify", "We will notify you 30 days before the any validity expiry."));
        }

        public final void z0(Context context, p3 p3Var) {
            l.f(context, "context");
            l.f(p3Var, "dms");
            c cVar = new c(context);
            p3Var.L.f26327b.setText(cVar.b("logo_dl_details", context.getString(R.string.dl_det)));
            p3Var.L.f26328c.setText(cVar.b("logo_dl_dms_upload_doc", context.getString(R.string.dms_upload_doc)));
            p3Var.L.f26332g.setText(cVar.b("logo_dl_upload_photo_sign", context.getString(R.string.upload_photo_signature)));
            p3Var.L.f26329d.setText(cVar.b("logo_dl_fee_details", context.getString(R.string.fee_details)));
            p3Var.L.f26331f.setText(cVar.b("logo_dl_appointment_book", context.getString(R.string.app_booking)));
            p3Var.Y.setText(cVar.b("title_dl_serv_view_details", context.getString(R.string.view_dl_details)));
            p3Var.P.setText(cVar.b("btn_dl_serv_next", context.getString(R.string.next)));
            p3Var.U.setText(cVar.b("label_dl_serv_appl_no", context.getString(R.string.app_number)));
            p3Var.T.setText(cVar.b("title_dl_serv_applicant_detail", context.getString(R.string.applicant_details)));
            p3Var.S.setText(cVar.b("label_dl_serv_appl_date", context.getString(R.string.app_date)));
            p3Var.W.setText(cVar.b("label_name", context.getString(R.string.your_name)));
            p3Var.X.setText(cVar.b("label_sdf", context.getString(R.string.sdo_of)));
            p3Var.Q.setText(cVar.b("title_dl_serv_upload_req_doc", context.getString(R.string.upload)));
            p3Var.R.setText(cVar.b("title_dl_serv_allow_file_size", context.getString(R.string.allow_file_types)));
            p3Var.Z.setText(cVar.b("btn_dl_serv_upload_doc", context.getString(R.string.upload_doc)));
            p3Var.V.setText(cVar.b("lbl_dob", context.getString(R.string.dob)));
        }

        public final void z1(Context context, l8 l8Var) {
            l.f(context, "context");
            l.f(l8Var, "payTax");
            c cVar = new c(context);
            l8Var.f27292m.setText(cVar.b("vahan_owner_name", context.getString(R.string.owner_name)));
            l8Var.X.setText(cVar.b("view_vehicle_details", "View Vehicle Details"));
            l8Var.f27302w.setText(cVar.b("btn_reset", context.getString(R.string.reset)));
            AppCompatTextView appCompatTextView = l8Var.N;
            appCompatTextView.setText(cVar.b("vehicle_no", "Vehicle No.:") + ' ');
            AppCompatTextView appCompatTextView2 = l8Var.X;
            appCompatTextView2.setPaintFlags(appCompatTextView2.getPaintFlags() | 8);
            l8Var.T.setText(cVar.b("vehicle_class", context.getString(R.string.owner_name)));
            l8Var.f27296q.setText(cVar.b("permit_type", context.getString(R.string.permit_type)));
            l8Var.I.setText(cVar.b("lbl_tax_from", context.getString(R.string.tax_from_date)));
            l8Var.K.setText(cVar.b("tax_upto", context.getString(R.string.tax_upto)));
            l8Var.f27301v.setText(cVar.b("receipt_date", context.getString(R.string.receipt_date)));
            l8Var.f27281b.setText(cVar.b("calculate_tax_details", context.getString(R.string.calculate_tax_details)));
            l8Var.A.setText(cVar.b("enter_the_no_of_m_y_q", context.getString(R.string.select_no_of_m_y_q)));
            l8Var.f27282c.setText(cVar.b("calculate_tax", context.getString(R.string.calculate_tax)));
            l8Var.f27298s.setText(cVar.b("label_challan_please_wait", context.getString(R.string.please_wait)));
            l8Var.Q.setText(cVar.b("user_charges", context.getString(R.string.user_charges)));
            l8Var.R.setText(cVar.b("user_charges", context.getString(R.string.user_charges)));
            l8Var.L.setText(cVar.b("transaction_charges", context.getString(R.string.transaction_charges)));
            l8Var.M.setText(cVar.b("transaction_charges", context.getString(R.string.transaction_charges)));
            l8Var.P.setText(cVar.b("final_amount", context.getString(R.string.final_amount)));
            l8Var.f27285f.setText(cVar.b("final_amount", context.getString(R.string.final_amount)));
            l8Var.O.setText(cVar.b("vahan_amount", context.getString(R.string.amount)));
        }

        public final void z2(Context context, f4 f4Var) {
            l.f(context, "context");
            l.f(f4Var, "binding");
            c cVar = new c(context);
            f4Var.f26230q.setText(cVar.b("vehicle_no_dlyyxx0000", context.getString(R.string.vehicle_no_dlyyxx0000)));
            f4Var.f26231r.setText(cVar.b("view_vehicle_details", context.getString(R.string.view_vehicle_details)));
            f4Var.f26223j.f28308i.setText(cVar.b("duplicate_FitnessCert", context.getString(R.string.duplicate_fitness)));
            f4Var.f26224k.setText(cVar.b("apply_for_duplicate_fitness_certificate", context.getString(R.string.apply_for_duplicate_fitness_certificate)));
            f4Var.f26227n.setText(cVar.b("label_dl_serv_reason", context.getString(R.string.vahan_reason)));
            f4Var.f26229p.setText(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            f4Var.f26217d.setHint(cVar.b("lbl_FIR_No_Police_Report_No", context.getString(R.string.vahan_report_no)));
            f4Var.f26225l.setText(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            f4Var.f26216c.setHint(cVar.b("lbl_FIR_Date", context.getString(R.string.vahan_fir_date)));
            f4Var.f26226m.setText(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            f4Var.f26219f.setHint(cVar.b("lbl_Police_Station", context.getString(R.string.vahan_police_station)));
            f4Var.f26228o.setText(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            f4Var.f26221h.setHint(cVar.b("lbl_Remarks", context.getString(R.string.vahan_remark)));
            f4Var.f26215b.setText(cVar.b("btn_Submit_Request", context.getString(R.string.submit_request)));
        }
    }
}
