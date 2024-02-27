package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class c {
    public static c c(Bundle bundle, h1 h1Var, p2 p2Var) {
        return d(bundle, h1Var, p2Var, new ArrayList(), c0.f6634a);
    }

    private static c d(Bundle bundle, h1 h1Var, p2 p2Var, List list, b0 b0Var) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            hashMap.put(str, AssetPackState.i(bundle2, str, h1Var, p2Var, b0Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0, 0, 0.0d, 1, "", ""));
        }
        return new k0(bundle2.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map a();

    public abstract long b();
}
