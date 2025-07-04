package Z9WdNiOsPR0y54zHW4;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2275HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f2276IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f2277KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f2278TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f2279husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final LinkedHashMap f2280lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2281s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2282zZKhbgvUfsK4AEX3r0;

    public husNiw3snxdgZPAGJm(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2275HJFh0TGMpafqLE9haL = i;
        this.f2280lEeR5KfoEr4xU5yHH7 = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object HJFh0TGMpafqLE9haL(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f2280lEeR5KfoEr4xU5yHH7.get(obj);
                if (obj2 != null) {
                    this.f2278TCyPEKSzIyweCN5yp1++;
                    return obj2;
                }
                this.f2276IPyIQcaNa8aB7drBED++;
                Object objLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(obj);
                if (objLEeR5KfoEr4xU5yHH7 == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f2279husNiw3snxdgZPAGJm++;
                        objPut = this.f2280lEeR5KfoEr4xU5yHH7.put(obj, objLEeR5KfoEr4xU5yHH7);
                        if (objPut != null) {
                            this.f2280lEeR5KfoEr4xU5yHH7.put(obj, objPut);
                        } else {
                            this.f2281s3fjYDxWOUexjjVgyA += husNiw3snxdgZPAGJm(obj, objLEeR5KfoEr4xU5yHH7);
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    s3fjYDxWOUexjjVgyA(false, obj, objLEeR5KfoEr4xU5yHH7, objPut);
                    return objPut;
                }
                TCyPEKSzIyweCN5yp1(this.f2275HJFh0TGMpafqLE9haL);
                return objLEeR5KfoEr4xU5yHH7;
            } finally {
            }
        }
    }

    public int KYHag8HRDlnO3X9zmZ(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void TCyPEKSzIyweCN5yp1(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f2281s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r4.f2280lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f2281s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f2281s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap r0 = r4.f2280lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r4.f2280lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r4.f2280lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f2281s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L12
            int r3 = r4.husNiw3snxdgZPAGJm(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f2281s3fjYDxWOUexjjVgyA = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f2277KYHag8HRDlnO3X9zmZ     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f2277KYHag8HRDlnO3X9zmZ = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.s3fjYDxWOUexjjVgyA(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1(int):void");
    }

    public final int husNiw3snxdgZPAGJm(Object obj, Object obj2) {
        int iKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(obj, obj2);
        if (iKYHag8HRDlnO3X9zmZ >= 0) {
            return iKYHag8HRDlnO3X9zmZ;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    public Object lEeR5KfoEr4xU5yHH7(Object obj) {
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.f2278TCyPEKSzIyweCN5yp1;
            i2 = this.f2276IPyIQcaNa8aB7drBED + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2275HJFh0TGMpafqLE9haL), Integer.valueOf(this.f2278TCyPEKSzIyweCN5yp1), Integer.valueOf(this.f2276IPyIQcaNa8aB7drBED), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public final Object zZKhbgvUfsK4AEX3r0(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f2282zZKhbgvUfsK4AEX3r0++;
                this.f2281s3fjYDxWOUexjjVgyA += husNiw3snxdgZPAGJm(obj, obj2);
                objPut = this.f2280lEeR5KfoEr4xU5yHH7.put(obj, obj2);
                if (objPut != null) {
                    this.f2281s3fjYDxWOUexjjVgyA -= husNiw3snxdgZPAGJm(obj, objPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            s3fjYDxWOUexjjVgyA(false, obj, objPut, obj2);
        }
        TCyPEKSzIyweCN5yp1(this.f2275HJFh0TGMpafqLE9haL);
        return objPut;
    }

    public void s3fjYDxWOUexjjVgyA(boolean z, Object obj, Object obj2, Object obj3) {
    }
}
