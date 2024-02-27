package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class Data {
    private final Object evAlterationOfVehicle;
    private final OwnerInfo ownerInfo;
    private final ArrayList<VhClasse> vhClasses;
    private final ArrayList<VmFuel> vmFuel;
    private final ArrayList<VmVchCatg> vmVchCatgs;
    private final Object vtRetrofittingDtlsAppl;

    public Data(Object obj, OwnerInfo ownerInfo2, ArrayList<VhClasse> arrayList, ArrayList<VmFuel> arrayList2, ArrayList<VmVchCatg> arrayList3, Object obj2) {
        l.f(obj, "evAlterationOfVehicle");
        l.f(ownerInfo2, "ownerInfo");
        l.f(arrayList, "vhClasses");
        l.f(arrayList2, "vmFuel");
        l.f(arrayList3, "vmVchCatgs");
        l.f(obj2, "vtRetrofittingDtlsAppl");
        this.evAlterationOfVehicle = obj;
        this.ownerInfo = ownerInfo2;
        this.vhClasses = arrayList;
        this.vmFuel = arrayList2;
        this.vmVchCatgs = arrayList3;
        this.vtRetrofittingDtlsAppl = obj2;
    }

    public static /* synthetic */ Data copy$default(Data data, Object obj, OwnerInfo ownerInfo2, ArrayList<VhClasse> arrayList, ArrayList<VmFuel> arrayList2, ArrayList<VmVchCatg> arrayList3, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = data.evAlterationOfVehicle;
        }
        if ((i10 & 2) != 0) {
            ownerInfo2 = data.ownerInfo;
        }
        OwnerInfo ownerInfo3 = ownerInfo2;
        if ((i10 & 4) != 0) {
            arrayList = data.vhClasses;
        }
        ArrayList<VhClasse> arrayList4 = arrayList;
        if ((i10 & 8) != 0) {
            arrayList2 = data.vmFuel;
        }
        ArrayList<VmFuel> arrayList5 = arrayList2;
        if ((i10 & 16) != 0) {
            arrayList3 = data.vmVchCatgs;
        }
        ArrayList<VmVchCatg> arrayList6 = arrayList3;
        if ((i10 & 32) != 0) {
            obj2 = data.vtRetrofittingDtlsAppl;
        }
        return data.copy(obj, ownerInfo3, arrayList4, arrayList5, arrayList6, obj2);
    }

    public final Object component1() {
        return this.evAlterationOfVehicle;
    }

    public final OwnerInfo component2() {
        return this.ownerInfo;
    }

    public final ArrayList<VhClasse> component3() {
        return this.vhClasses;
    }

    public final ArrayList<VmFuel> component4() {
        return this.vmFuel;
    }

    public final ArrayList<VmVchCatg> component5() {
        return this.vmVchCatgs;
    }

    public final Object component6() {
        return this.vtRetrofittingDtlsAppl;
    }

    public final Data copy(Object obj, OwnerInfo ownerInfo2, ArrayList<VhClasse> arrayList, ArrayList<VmFuel> arrayList2, ArrayList<VmVchCatg> arrayList3, Object obj2) {
        l.f(obj, "evAlterationOfVehicle");
        l.f(ownerInfo2, "ownerInfo");
        l.f(arrayList, "vhClasses");
        l.f(arrayList2, "vmFuel");
        l.f(arrayList3, "vmVchCatgs");
        l.f(obj2, "vtRetrofittingDtlsAppl");
        return new Data(obj, ownerInfo2, arrayList, arrayList2, arrayList3, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.evAlterationOfVehicle, data.evAlterationOfVehicle) && l.a(this.ownerInfo, data.ownerInfo) && l.a(this.vhClasses, data.vhClasses) && l.a(this.vmFuel, data.vmFuel) && l.a(this.vmVchCatgs, data.vmVchCatgs) && l.a(this.vtRetrofittingDtlsAppl, data.vtRetrofittingDtlsAppl);
    }

    public final Object getEvAlterationOfVehicle() {
        return this.evAlterationOfVehicle;
    }

    public final OwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    public final ArrayList<VhClasse> getVhClasses() {
        return this.vhClasses;
    }

    public final ArrayList<VmFuel> getVmFuel() {
        return this.vmFuel;
    }

    public final ArrayList<VmVchCatg> getVmVchCatgs() {
        return this.vmVchCatgs;
    }

    public final Object getVtRetrofittingDtlsAppl() {
        return this.vtRetrofittingDtlsAppl;
    }

    public int hashCode() {
        return (((((((((this.evAlterationOfVehicle.hashCode() * 31) + this.ownerInfo.hashCode()) * 31) + this.vhClasses.hashCode()) * 31) + this.vmFuel.hashCode()) * 31) + this.vmVchCatgs.hashCode()) * 31) + this.vtRetrofittingDtlsAppl.hashCode();
    }

    public String toString() {
        return "Data(evAlterationOfVehicle=" + this.evAlterationOfVehicle + ", ownerInfo=" + this.ownerInfo + ", vhClasses=" + this.vhClasses + ", vmFuel=" + this.vmFuel + ", vmVchCatgs=" + this.vmVchCatgs + ", vtRetrofittingDtlsAppl=" + this.vtRetrofittingDtlsAppl + ')';
    }
}
