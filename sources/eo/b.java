package eo;

import bo.a;
import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class b implements a {

    /* renamed from: e  reason: collision with root package name */
    private static Permission f23095e = new bo.b("BC", "threadLocalEcImplicitlyCa");

    /* renamed from: f  reason: collision with root package name */
    private static Permission f23096f = new bo.b("BC", "ecImplicitlyCa");

    /* renamed from: g  reason: collision with root package name */
    private static Permission f23097g = new bo.b("BC", "threadLocalDhDefaultParams");

    /* renamed from: h  reason: collision with root package name */
    private static Permission f23098h = new bo.b("BC", "DhDefaultParams");

    /* renamed from: i  reason: collision with root package name */
    private static Permission f23099i = new bo.b("BC", "acceptableEcCurves");

    /* renamed from: j  reason: collision with root package name */
    private static Permission f23100j = new bo.b("BC", "additionalEcParameters");

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal f23101a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal f23102b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    private volatile Set f23103c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private volatile Map f23104d = new HashMap();

    b() {
    }
}
