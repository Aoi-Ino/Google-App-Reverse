package aj;

import a8.b;
import a8.g;
import a8.k;
import a8.p;
import a8.q;
import a8.t;
import a8.u;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.utilities.e;
import e8.c;
import e8.k1;
import e8.n1;
import java.io.IOException;
import java.util.Objects;

public abstract class d {
    public static n1 a(String str, String str2, String str3, String str4, k kVar, boolean z10) {
        try {
            n1 n1Var = new n1(2);
            n1Var.V(100.0f);
            n1Var.S(1.0f);
            n1Var.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var.W(new float[]{1.0f, 1.0f});
            k1 k1Var = new k1((u) new t("Applicant Address:", kVar));
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(5.0f);
            k1Var.o0(1);
            k1Var.u0(1);
            k1 k1Var2 = new k1((u) new t("RTO Location :", kVar));
            k1Var2.G(bVar);
            k1Var2.E(i10);
            k1Var2.q0(5.0f);
            k1Var2.o0(1);
            k1Var2.u0(1);
            n1Var.a(k1Var);
            n1Var.a(k1Var2);
            return n1Var;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static n1 b(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, k kVar, boolean z10) {
        try {
            n1 n1Var = new n1(2);
            n1Var.V(100.0f);
            n1Var.S(1.0f);
            n1Var.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var.W(new float[]{1.0f, 1.0f});
            k1 k1Var = new k1((u) new t(resultItemSubmit.getApplicantAddress(), kVar));
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(5.0f);
            k1Var.o0(1);
            k1Var.u0(1);
            k1 k1Var2 = new k1((u) new t(resultItemSubmit.getRtoLocation(), kVar));
            k1Var2.G(bVar);
            k1Var2.E(i10);
            k1Var2.q0(5.0f);
            k1Var2.o0(1);
            k1Var2.u0(1);
            n1Var.a(k1Var);
            n1Var.a(k1Var2);
            return n1Var;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static n1 c(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, k kVar, boolean z10) {
        try {
            n1 n1Var = new n1(1);
            n1Var.V(100.0f);
            n1 n1Var2 = new n1(1);
            n1Var2.V(100.0f);
            n1Var2.S(1.0f);
            n1Var2.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var2.W(new float[]{1.0f});
            p pVar = new p();
            pVar.i("*");
            q qVar = new q("Your Application for Services on Driving Licence is accepted for Processing. For all future references quote this Application Number : " + resultItemSubmit.getApplicationNo());
            q qVar2 = new q(resultItemSubmit.getSmsConfirmation());
            q qVar3 = new q("Applicant should take print out of the Application Form (pre filled) and duly signed with all required Documents to be concerned RTO office");
            q qVar4 = new q("The online facility of application submission, upload documents, payment of fees, slot booking etc., does not complete the process of issue of Driving Licence or any other Service requested. The applicant has to compulsorily visit the concerned Road Transport Office to finish the process of issue of Driving Licence and/or any other associated services.   ");
            q qVar5 = new q("Applicants are requested to note that after completion of all stages mentioned under `Applicant Stages’, the applicant has to visit the concerned Road Transport Office on the scheduled date of appointment, along with the necessary documents to complete the remaining process (or) In cases where online slot booking facility is not available for any particular RTO, the applicant has to go to the concerned Road Transport Office at the earliest along with the necessary documents, to complete the remaining process.  ");
            pVar.a(qVar);
            pVar.a(qVar2);
            pVar.a(qVar3);
            pVar.a(qVar4);
            pVar.a(qVar5);
            k1 k1Var = new k1();
            k1Var.M(pVar);
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(8.0f);
            k1Var.l0(3);
            k1Var.o0(1);
            k1Var.u0(1);
            n1Var2.a(k1Var);
            k1 k1Var2 = new k1(n1Var2);
            k1Var2.G(bVar);
            k1Var2.E(0);
            k1Var2.o0(1);
            k1Var2.u0(1);
            n1Var.a(k1Var2);
            return n1Var;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static n1 d(String str, String str2, String str3, String str4, k kVar, boolean z10) {
        try {
            n1 n1Var = new n1(1);
            n1Var.V(100.0f);
            n1Var.S(1.0f);
            n1Var.R(1.0f);
            n1 n1Var2 = new n1(2);
            n1Var2.V(100.0f);
            n1Var2.S(1.0f);
            n1Var2.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var2.W(new float[]{1.0f, 1.0f});
            k1 k1Var = new k1((u) new t("Services Requested", kVar));
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(2.0f);
            k1Var.o0(1);
            k1Var.u0(1);
            k1 k1Var2 = new k1((u) new t("Documnetary Proof Required", kVar));
            k1Var2.G(bVar);
            k1Var2.E(i10);
            k1Var2.q0(2.0f);
            k1Var2.o0(1);
            k1Var2.u0(1);
            n1Var2.a(k1Var);
            n1Var2.a(k1Var2);
            k1 k1Var3 = new k1(n1Var2);
            k1Var3.G(bVar);
            k1Var3.E(15);
            k1Var3.q0(2.0f);
            k1Var3.o0(1);
            k1Var3.u0(1);
            n1Var.a(k1Var3);
            return n1Var;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static n1 e(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, k kVar, boolean z10) {
        try {
            n1 n1Var = new n1(1);
            n1Var.V(100.0f);
            n1 n1Var2 = new n1(2);
            n1Var2.V(100.0f);
            n1Var2.S(1.0f);
            n1Var2.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var2.W(new float[]{1.0f, 1.0f});
            p pVar = new p();
            pVar.i("1. ");
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember513().isEmpty()) {
                    pVar.a(new q("Issue of Duplicate DL"));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember514().isEmpty()) {
                    pVar.a(new q("Renewal of DL"));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember515().isEmpty()) {
                    pVar.a(new q("Change of Address in DL"));
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember516().isEmpty()) {
                    pVar.a(new q("Replacement of DL"));
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember523().isEmpty()) {
                    pVar.a(new q("DL Extract"));
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember525().isEmpty()) {
                    pVar.a(new q("International Driving Permit"));
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember537().isEmpty()) {
                    pVar.a(new q("RE-VALIDATION OF EXPIRED DL"));
                }
            } catch (Exception e16) {
                e16.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember548().isEmpty()) {
                    pVar.a(new q("Change of Date of Birth in DL"));
                }
            } catch (Exception e17) {
                e17.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember524().isEmpty()) {
                    pVar.a(new q("Endorsement to Drive in Hill Region"));
                }
            } catch (Exception e18) {
                e18.printStackTrace();
            }
            try {
                if (!resultItemSubmit.getServicesRequested().getJsonMember526().isEmpty()) {
                    pVar.a(new q("Change of Name in DL"));
                }
            } catch (Exception e19) {
                e19.printStackTrace();
            }
            p pVar2 = new p();
            pVar2.i("");
            q qVar = new q(resultItemSubmit.getDocumentaryProofsRequired());
            q qVar2 = new q("   ");
            pVar2.a(qVar);
            pVar2.a(qVar2);
            k1 k1Var = new k1();
            k1Var.M(pVar);
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(5.0f);
            k1Var.o0(1);
            k1Var.u0(1);
            k1 k1Var2 = new k1();
            k1Var2.M(pVar2);
            k1Var2.G(bVar);
            k1Var2.E(i10);
            k1Var2.q0(8.0f);
            k1Var2.l0(3);
            k1Var2.o0(1);
            k1Var2.u0(1);
            n1Var2.a(k1Var);
            n1Var2.a(k1Var2);
            k1 k1Var3 = new k1(n1Var2);
            k1Var3.G(bVar);
            k1Var3.E(0);
            k1Var3.o0(1);
            k1Var3.u0(1);
            n1Var.a(k1Var3);
            return n1Var;
        } catch (g e20) {
            e20.printStackTrace();
            return null;
        } catch (Exception e21) {
            e21.printStackTrace();
            return null;
        }
    }

    public static n1 f(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, k kVar, boolean z10) {
        q qVar;
        q qVar2;
        q qVar3;
        try {
            n1 n1Var = new n1(1);
            n1Var.V(100.0f);
            n1Var.S(1.0f);
            n1Var.R(1.0f);
            n1 n1Var2 = new n1(4);
            n1Var2.V(100.0f);
            n1Var2.S(1.0f);
            n1Var2.R(1.0f);
            int i10 = z10 ? 15 : 0;
            n1Var2.W(new float[]{1.0f, 1.0f, 1.0f, 1.0f});
            p pVar = new p();
            pVar.i("");
            q qVar4 = new q("Application No :");
            q qVar5 = new q("Application Date :");
            q qVar6 = new q("Blood Group :");
            q qVar7 = new q("Gender :");
            q qVar8 = new q("TR Validity :");
            q qVar9 = new q("DL COVs:");
            pVar.a(qVar4);
            pVar.a(qVar5);
            pVar.a(qVar6);
            pVar.a(qVar7);
            pVar.a(qVar8);
            pVar.a(qVar9);
            p pVar2 = new p();
            pVar2.i("");
            q qVar10 = new q(resultItemSubmit.getApplicationNo());
            q qVar11 = resultItemSubmit.getApplicationDate().isEmpty() ? new q(c.b()) : new q(resultItemSubmit.getApplicationDate());
            q qVar12 = resultItemSubmit.getBloodGroup().isEmpty() ? new q("NA") : new q(resultItemSubmit.getBloodGroup());
            q qVar13 = resultItemSubmit.getApplicantGender().isEmpty() ? new q("NA") : new q(resultItemSubmit.getApplicantGender());
            if (resultItemSubmit.getTRValidities().isEmpty()) {
                qVar = new q("NA");
            } else {
                String[] split = resultItemSubmit.getTRValidities().split("to");
                qVar = split.length >= 2 ? new q(split[1].trim()) : new q(resultItemSubmit.getTRValidities());
            }
            q qVar14 = resultItemSubmit.getDLCOVNames().isEmpty() ? new q("NA") : new q(resultItemSubmit.getDLCOVNames());
            pVar2.a(qVar10);
            pVar2.a(qVar11);
            pVar2.a(qVar12);
            pVar2.a(qVar13);
            pVar2.a(qVar);
            pVar2.a(qVar14);
            p pVar3 = new p();
            pVar3.i("");
            q qVar15 = new q("Name : ");
            q qVar16 = new q("Date of Birth : ");
            q qVar17 = new q("Father's Name : ");
            q qVar18 = new q("DL Number : ");
            q qVar19 = new q("NT Validity : ");
            pVar3.a(qVar15);
            pVar3.a(qVar16);
            pVar3.a(qVar17);
            pVar3.a(qVar18);
            pVar3.a(qVar19);
            p pVar4 = new p();
            pVar4.i("");
            if (resultItemSubmit.getDLCOVNames().isEmpty()) {
                qVar2 = new q("NA");
            } else {
                String applicantname = resultItemSubmit.getApplicantname();
                Objects.requireNonNull(applicantname);
                if (applicantname.length() > 12) {
                    String[] split2 = resultItemSubmit.getApplicantname().split(" ");
                    if (split2.length < 2) {
                        qVar2 = new q(split2[0]);
                    } else if (split2[0].length() + split2[1].length() > 12) {
                        qVar2 = new q(split2[0]);
                    } else {
                        qVar2 = new q(split2[0] + " " + split2[1]);
                    }
                } else {
                    qVar2 = new q(resultItemSubmit.getApplicantname());
                }
            }
            q qVar20 = resultItemSubmit.getApplicantGender().isEmpty() ? new q("NA") : new q(e.k(resultItemSubmit.getDateofBirth(), "yyyy-MM-dd", "dd-MM-yyyy"));
            q qVar21 = resultItemSubmit.getApplicantGender().isEmpty() ? new q("NA") : new q(resultItemSubmit.getFatherName());
            q qVar22 = resultItemSubmit.getApplicantGender().isEmpty() ? new q("NA") : new q(resultItemSubmit.getDlno());
            if (resultItemSubmit.getNTValidities().isEmpty()) {
                qVar3 = new q("NA");
            } else {
                String[] split3 = resultItemSubmit.getNTValidities().split("to");
                qVar3 = split3.length >= 2 ? new q(split3[1].trim()) : new q(resultItemSubmit.getNTValidities());
            }
            pVar4.a(qVar2);
            pVar4.a(qVar20);
            pVar4.a(qVar21);
            pVar4.a(qVar22);
            pVar4.a(qVar3);
            k1 k1Var = new k1();
            k1Var.M(pVar);
            b bVar = b.f244f;
            k1Var.G(bVar);
            k1Var.E(i10);
            k1Var.q0(5.0f);
            k1Var.o0(1);
            k1Var.u0(1);
            k1 k1Var2 = new k1();
            k1Var2.M(pVar2);
            k1Var2.G(bVar);
            k1Var2.E(i10);
            k1Var2.q0(5.0f);
            k1Var2.o0(1);
            k1Var2.u0(1);
            k1 k1Var3 = new k1();
            k1Var3.M(pVar3);
            k1Var3.G(bVar);
            k1Var3.E(i10);
            k1Var3.q0(5.0f);
            k1Var3.o0(1);
            k1Var3.u0(1);
            k1 k1Var4 = new k1();
            k1Var4.M(pVar4);
            k1Var4.G(bVar);
            k1Var4.E(i10);
            k1Var4.q0(5.0f);
            k1Var4.o0(1);
            k1Var4.u0(1);
            n1Var2.a(k1Var);
            n1Var2.a(k1Var2);
            n1Var2.a(k1Var3);
            n1Var2.a(k1Var4);
            k1 k1Var5 = new k1(n1Var2);
            k1Var5.G(bVar);
            k1Var5.E(15);
            k1Var5.q0(5.0f);
            k1Var5.o0(1);
            k1Var5.u0(1);
            n1Var.a(k1Var5);
            return n1Var;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static c g(String str, String str2, boolean z10) {
        try {
            return c.d(str, str2, z10);
        } catch (g | IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static k h(c cVar, float f10, int i10, b bVar) {
        return new k(cVar, f10, i10, bVar);
    }
}
