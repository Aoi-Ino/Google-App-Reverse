package com.nic.mparivahan;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.databinding.h;
import java.util.ArrayList;
import java.util.List;
import ni.a0;
import ni.a3;
import ni.b1;
import ni.b2;
import ni.b5;
import ni.b6;
import ni.c0;
import ni.c3;
import ni.c4;
import ni.d1;
import ni.d2;
import ni.d5;
import ni.e0;
import ni.e3;
import ni.e4;
import ni.e7;
import ni.ea;
import ni.ed;
import ni.f1;
import ni.g2;
import ni.g3;
import ni.g7;
import ni.h1;
import ni.h5;
import ni.h8;
import ni.hd;
import ni.i2;
import ni.i3;
import ni.i4;
import ni.i6;
import ni.ia;
import ni.j5;
import ni.j9;
import ni.k2;
import ni.k3;
import ni.k6;
import ni.l1;
import ni.l5;
import ni.m0;
import ni.m2;
import ni.m3;
import ni.m4;
import ni.m6;
import ni.m7;
import ni.mb;
import ni.n5;
import ni.o0;
import ni.o2;
import ni.o3;
import ni.o4;
import ni.o6;
import ni.p1;
import ni.p5;
import ni.q0;
import ni.q2;
import ni.q3;
import ni.q4;
import ni.r1;
import ni.r6;
import ni.s0;
import ni.s2;
import ni.s3;
import ni.s5;
import ni.s7;
import ni.s8;
import ni.sa;
import ni.t6;
import ni.u0;
import ni.u2;
import ni.u3;
import ni.u4;
import ni.u5;
import ni.u9;
import ni.v1;
import ni.vb;
import ni.w;
import ni.w0;
import ni.w2;
import ni.w5;
import ni.w7;
import ni.x1;
import ni.x4;
import ni.xb;
import ni.y;
import ni.y0;
import ni.y2;
import ni.y5;
import ni.z1;
import ni.z4;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f8529a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(89);
        f8529a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_change_address_ll, 1);
        sparseIntArray.put(R.layout.activity_change_name_cl, 2);
        sparseIntArray.put(R.layout.activity_change_name_ll, 3);
        sparseIntArray.put(R.layout.activity_change_of_address, 4);
        sparseIntArray.put(R.layout.activity_change_of_address_cl, 5);
        sparseIntArray.put(R.layout.activity_cl_details, 6);
        sparseIntArray.put(R.layout.activity_cl_details_top, 7);
        sparseIntArray.put(R.layout.activity_cl_documents_upload, 8);
        sparseIntArray.put(R.layout.activity_cl_fee_payment, 9);
        sparseIntArray.put(R.layout.activity_cl_mobile_update, 10);
        sparseIntArray.put(R.layout.activity_cl_otpmobile, 11);
        sparseIntArray.put(R.layout.activity_cl_photo_signature, 12);
        sparseIntArray.put(R.layout.activity_cl_services_ms, 13);
        sparseIntArray.put(R.layout.activity_cl_slots_acknow, 14);
        sparseIntArray.put(R.layout.activity_cl_sots, 15);
        sparseIntArray.put(R.layout.activity_cl_submit_screen, 16);
        sparseIntArray.put(R.layout.activity_confirm_mob_no, 17);
        sparseIntArray.put(R.layout.activity_cov_details, 18);
        sparseIntArray.put(R.layout.activity_cov_list, 19);
        sparseIntArray.put(R.layout.activity_dl_acknowled_slip, 20);
        sparseIntArray.put(R.layout.activity_dl_address_details, 21);
        sparseIntArray.put(R.layout.activity_dl_app, 22);
        sparseIntArray.put(R.layout.activity_dl_application_screen, 23);
        sparseIntArray.put(R.layout.activity_dl_cov, 24);
        sparseIntArray.put(R.layout.activity_dl_details, 25);
        sparseIntArray.put(R.layout.activity_dl_doc_upload, 26);
        sparseIntArray.put(R.layout.activity_dl_driving_school, 27);
        sparseIntArray.put(R.layout.activity_dl_extract, 28);
        sparseIntArray.put(R.layout.activity_dl_fee_payment, 29);
        sparseIntArray.put(R.layout.activity_dl_mob_update_otp, 30);
        sparseIntArray.put(R.layout.activity_dl_personal_details, 31);
        sparseIntArray.put(R.layout.activity_dl_photo_sign, 32);
        sparseIntArray.put(R.layout.activity_dl_renewal, 33);
        sparseIntArray.put(R.layout.activity_dl_renewal_fee_payment, 34);
        sparseIntArray.put(R.layout.activity_dl_renewal_slots, 35);
        sparseIntArray.put(R.layout.activity_dl_replacement, 36);
        sparseIntArray.put(R.layout.activity_dl_servcies_main_view_screen, 37);
        sparseIntArray.put(R.layout.activity_dl_service_acknow, 38);
        sparseIntArray.put(R.layout.activity_dl_slots, 39);
        sparseIntArray.put(R.layout.activity_dl_slots_acknow, 40);
        sparseIntArray.put(R.layout.activity_dl_slots_next, 41);
        sparseIntArray.put(R.layout.activity_dl_status_details, 42);
        sparseIntArray.put(R.layout.activity_dl_status_documents, 43);
        sparseIntArray.put(R.layout.activity_dl_status_photo_sign, 44);
        sparseIntArray.put(R.layout.activity_dl_submit_request_success, 45);
        sparseIntArray.put(R.layout.activity_duplicate_cl, 46);
        sparseIntArray.put(R.layout.activity_duplicate_dl, 47);
        sparseIntArray.put(R.layout.activity_duplicate_ll, 48);
        sparseIntArray.put(R.layout.activity_edit_app_personal_details, 49);
        sparseIntArray.put(R.layout.activity_edit_appl_address, 50);
        sparseIntArray.put(R.layout.activity_edit_learner_appl, 51);
        sparseIntArray.put(R.layout.activity_hill_religion, 52);
        sparseIntArray.put(R.layout.activity_issue_international_permit, 53);
        sparseIntArray.put(R.layout.activity_learner_download, 54);
        sparseIntArray.put(R.layout.activity_learner_licence_aadhar, 55);
        sparseIntArray.put(R.layout.activity_learner_licence_address, 56);
        sparseIntArray.put(R.layout.activity_ll, 57);
        sparseIntArray.put(R.layout.activity_ll_application_number, 58);
        sparseIntArray.put(R.layout.activity_ll_appointment, 59);
        sparseIntArray.put(R.layout.activity_ll_details, 60);
        sparseIntArray.put(R.layout.activity_ll_document_upload, 61);
        sparseIntArray.put(R.layout.activity_ll_mobile_update, 62);
        sparseIntArray.put(R.layout.activity_ll_otp_mobile, 63);
        sparseIntArray.put(R.layout.activity_ll_payment, 64);
        sparseIntArray.put(R.layout.activity_ll_photo_signature, 65);
        sparseIntArray.put(R.layout.activity_ll_stolts_ack, 66);
        sparseIntArray.put(R.layout.activity_new_cl_one, 67);
        sparseIntArray.put(R.layout.activity_new_cl_submit_screen, 68);
        sparseIntArray.put(R.layout.activity_new_cl_three, 69);
        sparseIntArray.put(R.layout.activity_new_cl_two, 70);
        sparseIntArray.put(R.layout.activity_new_learner_personal_details, 71);
        sparseIntArray.put(R.layout.activity_new_learner_training, 72);
        sparseIntArray.put(R.layout.activity_pdf, 73);
        sparseIntArray.put(R.layout.activity_pdfview_internal_acitvity, 74);
        sparseIntArray.put(R.layout.activity_renewal_cl, 75);
        sparseIntArray.put(R.layout.activity_reprint, 76);
        sparseIntArray.put(R.layout.activity_sarathi_mobile_update, 77);
        sparseIntArray.put(R.layout.activity_select_cl_service, 78);
        sparseIntArray.put(R.layout.activity_user_adhar_details, 79);
        sparseIntArray.put(R.layout.activity_verify_notice_payment_response, 80);
        sparseIntArray.put(R.layout.application_submitted, 81);
        sparseIntArray.put(R.layout.declaration_form, 82);
        sparseIntArray.put(R.layout.dl_service_view_details, 83);
        sparseIntArray.put(R.layout.edit_appl_selected_cov_details, 84);
        sparseIntArray.put(R.layout.items_dl_renewal_doc, 85);
        sparseIntArray.put(R.layout.ll_test_activity, 86);
        sparseIntArray.put(R.layout.mislinessfeepayment, 87);
        sparseIntArray.put(R.layout.taxpaymentscreen, 88);
        sparseIntArray.put(R.layout.test_photo, 89);
    }

    private final h d(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_change_address_ll_0".equals(obj)) {
                    return new w(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_address_ll is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_change_name_cl_0".equals(obj)) {
                    return new y(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_name_cl is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_change_name_ll_0".equals(obj)) {
                    return new a0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_name_ll is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_change_of_address_0".equals(obj)) {
                    return new c0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_of_address is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_change_of_address_cl_0".equals(obj)) {
                    return new e0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_change_of_address_cl is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_cl_details_0".equals(obj)) {
                    return new m0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_details is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_cl_details_top_0".equals(obj)) {
                    return new o0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_details_top is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_cl_documents_upload_0".equals(obj)) {
                    return new q0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_documents_upload is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_cl_fee_payment_0".equals(obj)) {
                    return new s0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_fee_payment is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_cl_mobile_update_0".equals(obj)) {
                    return new u0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_mobile_update is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_cl_otpmobile_0".equals(obj)) {
                    return new w0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_otpmobile is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_cl_photo_signature_0".equals(obj)) {
                    return new y0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_photo_signature is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_cl_services_ms_0".equals(obj)) {
                    return new b1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_services_ms is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_cl_slots_acknow_0".equals(obj)) {
                    return new d1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_slots_acknow is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_cl_sots_0".equals(obj)) {
                    return new f1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_sots is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_cl_submit_screen_0".equals(obj)) {
                    return new h1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cl_submit_screen is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_confirm_mob_no_0".equals(obj)) {
                    return new l1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_confirm_mob_no is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_cov_details_0".equals(obj)) {
                    return new p1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cov_details is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_cov_list_0".equals(obj)) {
                    return new r1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cov_list is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_dl_acknowled_slip_0".equals(obj)) {
                    return new v1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_acknowled_slip is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_dl_address_details_0".equals(obj)) {
                    return new x1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_address_details is invalid. Received: " + obj);
            case 22:
                if ("layout/activity_dl_app_0".equals(obj)) {
                    return new z1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_app is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_dl_application_screen_0".equals(obj)) {
                    return new b2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_application_screen is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_dl_cov_0".equals(obj)) {
                    return new d2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_cov is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_dl_details_0".equals(obj)) {
                    return new g2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_details is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_dl_doc_upload_0".equals(obj)) {
                    return new i2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_doc_upload is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_dl_driving_school_0".equals(obj)) {
                    return new k2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_driving_school is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_dl_extract_0".equals(obj)) {
                    return new m2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_extract is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_dl_fee_payment_0".equals(obj)) {
                    return new o2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_fee_payment is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_dl_mob_update_otp_0".equals(obj)) {
                    return new q2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_mob_update_otp is invalid. Received: " + obj);
            case 31:
                if ("layout/activity_dl_personal_details_0".equals(obj)) {
                    return new s2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_personal_details is invalid. Received: " + obj);
            case 32:
                if ("layout/activity_dl_photo_sign_0".equals(obj)) {
                    return new u2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_photo_sign is invalid. Received: " + obj);
            case 33:
                if ("layout/activity_dl_renewal_0".equals(obj)) {
                    return new w2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal is invalid. Received: " + obj);
            case 34:
                if ("layout/activity_dl_renewal_fee_payment_0".equals(obj)) {
                    return new y2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal_fee_payment is invalid. Received: " + obj);
            case 35:
                if ("layout/activity_dl_renewal_slots_0".equals(obj)) {
                    return new a3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_renewal_slots is invalid. Received: " + obj);
            case 36:
                if ("layout/activity_dl_replacement_0".equals(obj)) {
                    return new c3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_replacement is invalid. Received: " + obj);
            case 37:
                if ("layout/activity_dl_servcies_main_view_screen_0".equals(obj)) {
                    return new e3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_servcies_main_view_screen is invalid. Received: " + obj);
            case 38:
                if ("layout/activity_dl_service_acknow_0".equals(obj)) {
                    return new g3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_service_acknow is invalid. Received: " + obj);
            case 39:
                if ("layout/activity_dl_slots_0".equals(obj)) {
                    return new k3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots is invalid. Received: " + obj);
            case 40:
                if ("layout/activity_dl_slots_acknow_0".equals(obj)) {
                    return new i3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots_acknow is invalid. Received: " + obj);
            case 41:
                if ("layout/activity_dl_slots_next_0".equals(obj)) {
                    return new m3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_slots_next is invalid. Received: " + obj);
            case 42:
                if ("layout/activity_dl_status_details_0".equals(obj)) {
                    return new o3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_details is invalid. Received: " + obj);
            case 43:
                if ("layout/activity_dl_status_documents_0".equals(obj)) {
                    return new q3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_documents is invalid. Received: " + obj);
            case 44:
                if ("layout/activity_dl_status_photo_sign_0".equals(obj)) {
                    return new s3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_status_photo_sign is invalid. Received: " + obj);
            case 45:
                if ("layout/activity_dl_submit_request_success_0".equals(obj)) {
                    return new u3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_dl_submit_request_success is invalid. Received: " + obj);
            case 46:
                if ("layout/activity_duplicate_cl_0".equals(obj)) {
                    return new c4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_cl is invalid. Received: " + obj);
            case 47:
                if ("layout/activity_duplicate_dl_0".equals(obj)) {
                    return new e4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_dl is invalid. Received: " + obj);
            case 48:
                if ("layout/activity_duplicate_ll_0".equals(obj)) {
                    return new i4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_duplicate_ll is invalid. Received: " + obj);
            case 49:
                if ("layout/activity_edit_app_personal_details_0".equals(obj)) {
                    return new m4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_app_personal_details is invalid. Received: " + obj);
            case 50:
                if ("layout/activity_edit_appl_address_0".equals(obj)) {
                    return new o4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_appl_address is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final h e(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/activity_edit_learner_appl_0".equals(obj)) {
                    return new q4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_learner_appl is invalid. Received: " + obj);
            case 52:
                if ("layout/activity_hill_religion_0".equals(obj)) {
                    return new u4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_hill_religion is invalid. Received: " + obj);
            case 53:
                if ("layout/activity_issue_international_permit_0".equals(obj)) {
                    return new x4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_issue_international_permit is invalid. Received: " + obj);
            case 54:
                if ("layout/activity_learner_download_0".equals(obj)) {
                    return new z4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_learner_download is invalid. Received: " + obj);
            case 55:
                if ("layout/activity_learner_licence_aadhar_0".equals(obj)) {
                    return new b5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_learner_licence_aadhar is invalid. Received: " + obj);
            case 56:
                if ("layout/activity_learner_licence_address_0".equals(obj)) {
                    return new d5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_learner_licence_address is invalid. Received: " + obj);
            case 57:
                if ("layout/activity_ll_0".equals(obj)) {
                    return new l5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll is invalid. Received: " + obj);
            case 58:
                if ("layout/activity_ll_application_number_0".equals(obj)) {
                    return new h5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_application_number is invalid. Received: " + obj);
            case 59:
                if ("layout/activity_ll_appointment_0".equals(obj)) {
                    return new j5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_appointment is invalid. Received: " + obj);
            case 60:
                if ("layout/activity_ll_details_0".equals(obj)) {
                    return new n5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_details is invalid. Received: " + obj);
            case 61:
                if ("layout/activity_ll_document_upload_0".equals(obj)) {
                    return new p5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_document_upload is invalid. Received: " + obj);
            case 62:
                if ("layout/activity_ll_mobile_update_0".equals(obj)) {
                    return new s5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_mobile_update is invalid. Received: " + obj);
            case 63:
                if ("layout/activity_ll_otp_mobile_0".equals(obj)) {
                    return new u5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_otp_mobile is invalid. Received: " + obj);
            case 64:
                if ("layout/activity_ll_payment_0".equals(obj)) {
                    return new w5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_payment is invalid. Received: " + obj);
            case 65:
                if ("layout/activity_ll_photo_signature_0".equals(obj)) {
                    return new y5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_photo_signature is invalid. Received: " + obj);
            case 66:
                if ("layout/activity_ll_stolts_ack_0".equals(obj)) {
                    return new b6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_ll_stolts_ack is invalid. Received: " + obj);
            case 67:
                if ("layout/activity_new_cl_one_0".equals(obj)) {
                    return new i6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_one is invalid. Received: " + obj);
            case 68:
                if ("layout/activity_new_cl_submit_screen_0".equals(obj)) {
                    return new k6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_submit_screen is invalid. Received: " + obj);
            case 69:
                if ("layout/activity_new_cl_three_0".equals(obj)) {
                    return new m6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_three is invalid. Received: " + obj);
            case 70:
                if ("layout/activity_new_cl_two_0".equals(obj)) {
                    return new o6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_cl_two is invalid. Received: " + obj);
            case 71:
                if ("layout/activity_new_learner_personal_details_0".equals(obj)) {
                    return new r6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_learner_personal_details is invalid. Received: " + obj);
            case 72:
                if ("layout/activity_new_learner_training_0".equals(obj)) {
                    return new t6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_learner_training is invalid. Received: " + obj);
            case 73:
                if ("layout/activity_pdf_0".equals(obj)) {
                    return new e7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_pdf is invalid. Received: " + obj);
            case 74:
                if ("layout/activity_pdfview_internal_acitvity_0".equals(obj)) {
                    return new g7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_pdfview_internal_acitvity is invalid. Received: " + obj);
            case 75:
                if ("layout/activity_renewal_cl_0".equals(obj)) {
                    return new m7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_renewal_cl is invalid. Received: " + obj);
            case 76:
                if ("layout/activity_reprint_0".equals(obj)) {
                    return new s7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_reprint is invalid. Received: " + obj);
            case 77:
                if ("layout/activity_sarathi_mobile_update_0".equals(obj)) {
                    return new w7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_sarathi_mobile_update is invalid. Received: " + obj);
            case 78:
                if ("layout/activity_select_cl_service_0".equals(obj)) {
                    return new h8(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_cl_service is invalid. Received: " + obj);
            case 79:
                if ("layout/activity_user_adhar_details_0".equals(obj)) {
                    return new s8(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_user_adhar_details is invalid. Received: " + obj);
            case 80:
                if ("layout/activity_verify_notice_payment_response_0".equals(obj)) {
                    return new j9(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_verify_notice_payment_response is invalid. Received: " + obj);
            case 81:
                if ("layout/application_submitted_0".equals(obj)) {
                    return new u9(eVar, view);
                }
                throw new IllegalArgumentException("The tag for application_submitted is invalid. Received: " + obj);
            case 82:
                if ("layout/declaration_form_0".equals(obj)) {
                    return new ea(eVar, view);
                }
                throw new IllegalArgumentException("The tag for declaration_form is invalid. Received: " + obj);
            case 83:
                if ("layout/dl_service_view_details_0".equals(obj)) {
                    return new ia(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dl_service_view_details is invalid. Received: " + obj);
            case 84:
                if ("layout/edit_appl_selected_cov_details_0".equals(obj)) {
                    return new sa(eVar, view);
                }
                throw new IllegalArgumentException("The tag for edit_appl_selected_cov_details is invalid. Received: " + obj);
            case 85:
                if ("layout/items_dl_renewal_doc_0".equals(obj)) {
                    return new mb(eVar, view);
                }
                throw new IllegalArgumentException("The tag for items_dl_renewal_doc is invalid. Received: " + obj);
            case 86:
                if ("layout/ll_test_activity_0".equals(obj)) {
                    return new vb(eVar, view);
                }
                throw new IllegalArgumentException("The tag for ll_test_activity is invalid. Received: " + obj);
            case 87:
                if ("layout/mislinessfeepayment_0".equals(obj)) {
                    return new xb(eVar, view);
                }
                throw new IllegalArgumentException("The tag for mislinessfeepayment is invalid. Received: " + obj);
            case 88:
                if ("layout/taxpaymentscreen_0".equals(obj)) {
                    return new ed(eVar, view);
                }
                throw new IllegalArgumentException("The tag for taxpaymentscreen is invalid. Received: " + obj);
            case 89:
                if ("layout/test_photo_0".equals(obj)) {
                    return new hd(eVar, view);
                }
                throw new IllegalArgumentException("The tag for test_photo is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public h b(e eVar, View view, int i10) {
        int i11 = f8529a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            int i12 = (i11 - 1) / 50;
            if (i12 == 0) {
                return d(eVar, view, i11, tag);
            }
            if (i12 != 1) {
                return null;
            }
            return e(eVar, view, i11, tag);
        }
        throw new RuntimeException("view must have a tag");
    }

    public h c(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f8529a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
