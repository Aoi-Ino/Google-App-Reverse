package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class Data {
    private final ArrayList<OwnerCatagory> ownerCatagory;
    private final ArrayList<OwnerShipType> ownerShipType;
    private final ArrayList<Relation> relation;

    public Data(ArrayList<OwnerCatagory> arrayList, ArrayList<OwnerShipType> arrayList2, ArrayList<Relation> arrayList3) {
        l.f(arrayList, "ownerCatagory");
        l.f(arrayList2, "ownerShipType");
        l.f(arrayList3, "relation");
        this.ownerCatagory = arrayList;
        this.ownerShipType = arrayList2;
        this.relation = arrayList3;
    }

    public static /* synthetic */ Data copy$default(Data data, ArrayList<OwnerCatagory> arrayList, ArrayList<OwnerShipType> arrayList2, ArrayList<Relation> arrayList3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = data.ownerCatagory;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = data.ownerShipType;
        }
        if ((i10 & 4) != 0) {
            arrayList3 = data.relation;
        }
        return data.copy(arrayList, arrayList2, arrayList3);
    }

    public final ArrayList<OwnerCatagory> component1() {
        return this.ownerCatagory;
    }

    public final ArrayList<OwnerShipType> component2() {
        return this.ownerShipType;
    }

    public final ArrayList<Relation> component3() {
        return this.relation;
    }

    public final Data copy(ArrayList<OwnerCatagory> arrayList, ArrayList<OwnerShipType> arrayList2, ArrayList<Relation> arrayList3) {
        l.f(arrayList, "ownerCatagory");
        l.f(arrayList2, "ownerShipType");
        l.f(arrayList3, "relation");
        return new Data(arrayList, arrayList2, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.ownerCatagory, data.ownerCatagory) && l.a(this.ownerShipType, data.ownerShipType) && l.a(this.relation, data.relation);
    }

    public final ArrayList<OwnerCatagory> getOwnerCatagory() {
        return this.ownerCatagory;
    }

    public final ArrayList<OwnerShipType> getOwnerShipType() {
        return this.ownerShipType;
    }

    public final ArrayList<Relation> getRelation() {
        return this.relation;
    }

    public int hashCode() {
        return (((this.ownerCatagory.hashCode() * 31) + this.ownerShipType.hashCode()) * 31) + this.relation.hashCode();
    }

    public String toString() {
        return "Data(ownerCatagory=" + this.ownerCatagory + ", ownerShipType=" + this.ownerShipType + ", relation=" + this.relation + ')';
    }
}
