package Acstmh57AKoSEkEFNJ;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA implements Iterable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f57lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f58s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final WeakHashMap f56HJFh0TGMpafqLE9haL = new WeakHashMap();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f59zZKhbgvUfsK4AEX3r0 = 0;

    public static class HJFh0TGMpafqLE9haL implements Map.Entry {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f60HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Object f61lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Object f62s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f63zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(Object obj, Object obj2) {
            this.f61lEeR5KfoEr4xU5yHH7 = obj;
            this.f62s3fjYDxWOUexjjVgyA = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HJFh0TGMpafqLE9haL)) {
                return false;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) obj;
            return this.f61lEeR5KfoEr4xU5yHH7.equals(hJFh0TGMpafqLE9haL.f61lEeR5KfoEr4xU5yHH7) && this.f62s3fjYDxWOUexjjVgyA.equals(hJFh0TGMpafqLE9haL.f62s3fjYDxWOUexjjVgyA);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f61lEeR5KfoEr4xU5yHH7;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f62s3fjYDxWOUexjjVgyA;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f61lEeR5KfoEr4xU5yHH7.hashCode() ^ this.f62s3fjYDxWOUexjjVgyA.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f61lEeR5KfoEr4xU5yHH7 + "=" + this.f62s3fjYDxWOUexjjVgyA;
        }
    }

    public static abstract class KYHag8HRDlnO3X9zmZ {
        public abstract void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL);
    }

    public static abstract class husNiw3snxdgZPAGJm extends KYHag8HRDlnO3X9zmZ implements Iterator {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f64lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f65s3fjYDxWOUexjjVgyA;

        public husNiw3snxdgZPAGJm(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
            this.f64lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL2;
            this.f65s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
        }

        public abstract HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65s3fjYDxWOUexjjVgyA != null;
        }

        public final HJFh0TGMpafqLE9haL husNiw3snxdgZPAGJm() {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f65s3fjYDxWOUexjjVgyA;
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f64lEeR5KfoEr4xU5yHH7;
            if (hJFh0TGMpafqLE9haL == hJFh0TGMpafqLE9haL2 || hJFh0TGMpafqLE9haL2 == null) {
                return null;
            }
            return HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL);
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            if (this.f64lEeR5KfoEr4xU5yHH7 == hJFh0TGMpafqLE9haL && hJFh0TGMpafqLE9haL == this.f65s3fjYDxWOUexjjVgyA) {
                this.f65s3fjYDxWOUexjjVgyA = null;
                this.f64lEeR5KfoEr4xU5yHH7 = null;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f64lEeR5KfoEr4xU5yHH7;
            if (hJFh0TGMpafqLE9haL2 == hJFh0TGMpafqLE9haL) {
                this.f64lEeR5KfoEr4xU5yHH7 = s3fjYDxWOUexjjVgyA(hJFh0TGMpafqLE9haL2);
            }
            if (this.f65s3fjYDxWOUexjjVgyA == hJFh0TGMpafqLE9haL) {
                this.f65s3fjYDxWOUexjjVgyA = husNiw3snxdgZPAGJm();
            }
        }

        public abstract HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL);

        @Override // java.util.Iterator
        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f65s3fjYDxWOUexjjVgyA;
            this.f65s3fjYDxWOUexjjVgyA = husNiw3snxdgZPAGJm();
            return hJFh0TGMpafqLE9haL;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 extends husNiw3snxdgZPAGJm {
        public lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
            super(hJFh0TGMpafqLE9haL, hJFh0TGMpafqLE9haL2);
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm
        public HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return hJFh0TGMpafqLE9haL.f60HJFh0TGMpafqLE9haL;
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm
        public HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return hJFh0TGMpafqLE9haL.f63zZKhbgvUfsK4AEX3r0;
        }
    }

    /* renamed from: Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public static class C0004s3fjYDxWOUexjjVgyA extends husNiw3snxdgZPAGJm {
        public C0004s3fjYDxWOUexjjVgyA(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
            super(hJFh0TGMpafqLE9haL, hJFh0TGMpafqLE9haL2);
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm
        public HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return hJFh0TGMpafqLE9haL.f63zZKhbgvUfsK4AEX3r0;
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm
        public HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            return hJFh0TGMpafqLE9haL.f60HJFh0TGMpafqLE9haL;
        }
    }

    public class zZKhbgvUfsK4AEX3r0 extends KYHag8HRDlnO3X9zmZ implements Iterator {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f67lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f68s3fjYDxWOUexjjVgyA = true;

        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f68s3fjYDxWOUexjjVgyA) {
                return s3fjYDxWOUexjjVgyA.this.f57lEeR5KfoEr4xU5yHH7 != null;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f67lEeR5KfoEr4xU5yHH7;
            return (hJFh0TGMpafqLE9haL == null || hJFh0TGMpafqLE9haL.f60HJFh0TGMpafqLE9haL == null) ? false : true;
        }

        @Override // Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f67lEeR5KfoEr4xU5yHH7;
            if (hJFh0TGMpafqLE9haL == hJFh0TGMpafqLE9haL2) {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = hJFh0TGMpafqLE9haL2.f63zZKhbgvUfsK4AEX3r0;
                this.f67lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL3;
                this.f68s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
            if (this.f68s3fjYDxWOUexjjVgyA) {
                this.f68s3fjYDxWOUexjjVgyA = false;
                hJFh0TGMpafqLE9haL = s3fjYDxWOUexjjVgyA.this.f57lEeR5KfoEr4xU5yHH7;
            } else {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f67lEeR5KfoEr4xU5yHH7;
                hJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL2 != null ? hJFh0TGMpafqLE9haL2.f60HJFh0TGMpafqLE9haL : null;
            }
            this.f67lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            return this.f67lEeR5KfoEr4xU5yHH7;
        }
    }

    public HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(Object obj) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f57lEeR5KfoEr4xU5yHH7;
        while (hJFh0TGMpafqLE9haL != null && !hJFh0TGMpafqLE9haL.f61lEeR5KfoEr4xU5yHH7.equals(obj)) {
            hJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL.f60HJFh0TGMpafqLE9haL;
        }
        return hJFh0TGMpafqLE9haL;
    }

    public Object IPyIQcaNa8aB7drBED(Object obj) {
        HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL(obj);
        if (HJFh0TGMpafqLE9haL2 == null) {
            return null;
        }
        this.f59zZKhbgvUfsK4AEX3r0--;
        if (!this.f56HJFh0TGMpafqLE9haL.isEmpty()) {
            Iterator it = this.f56HJFh0TGMpafqLE9haL.keySet().iterator();
            while (it.hasNext()) {
                ((KYHag8HRDlnO3X9zmZ) it.next()).lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL2);
            }
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL2.f63zZKhbgvUfsK4AEX3r0;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL2.f60HJFh0TGMpafqLE9haL;
        if (hJFh0TGMpafqLE9haL != null) {
            hJFh0TGMpafqLE9haL.f60HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL2;
        } else {
            this.f57lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL2;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = HJFh0TGMpafqLE9haL2.f60HJFh0TGMpafqLE9haL;
        if (hJFh0TGMpafqLE9haL3 != null) {
            hJFh0TGMpafqLE9haL3.f63zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL;
        } else {
            this.f58s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
        }
        HJFh0TGMpafqLE9haL2.f60HJFh0TGMpafqLE9haL = null;
        HJFh0TGMpafqLE9haL2.f63zZKhbgvUfsK4AEX3r0 = null;
        return HJFh0TGMpafqLE9haL2.f62s3fjYDxWOUexjjVgyA;
    }

    public HJFh0TGMpafqLE9haL KYHag8HRDlnO3X9zmZ(Object obj, Object obj2) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(obj, obj2);
        this.f59zZKhbgvUfsK4AEX3r0++;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f58s3fjYDxWOUexjjVgyA;
        if (hJFh0TGMpafqLE9haL2 == null) {
            this.f57lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        } else {
            hJFh0TGMpafqLE9haL2.f60HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
            hJFh0TGMpafqLE9haL.f63zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL2;
        }
        this.f58s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
        return hJFh0TGMpafqLE9haL;
    }

    public Object TCyPEKSzIyweCN5yp1(Object obj, Object obj2) {
        HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL2 = HJFh0TGMpafqLE9haL(obj);
        if (HJFh0TGMpafqLE9haL2 != null) {
            return HJFh0TGMpafqLE9haL2.f62s3fjYDxWOUexjjVgyA;
        }
        KYHag8HRDlnO3X9zmZ(obj, obj2);
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3fjYDxWOUexjjVgyA)) {
            return false;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) obj;
        if (size() != s3fjydxwouexjjvgya.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = s3fjydxwouexjjvgya.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Map.Entry husNiw3snxdgZPAGJm() {
        return this.f58s3fjYDxWOUexjjVgyA;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(this.f57lEeR5KfoEr4xU5yHH7, this.f58s3fjYDxWOUexjjVgyA);
        this.f56HJFh0TGMpafqLE9haL.put(leer5kfoer4xu5yhh7, Boolean.FALSE);
        return leer5kfoer4xu5yhh7;
    }

    public Iterator lEeR5KfoEr4xU5yHH7() {
        C0004s3fjYDxWOUexjjVgyA c0004s3fjYDxWOUexjjVgyA = new C0004s3fjYDxWOUexjjVgyA(this.f58s3fjYDxWOUexjjVgyA, this.f57lEeR5KfoEr4xU5yHH7);
        this.f56HJFh0TGMpafqLE9haL.put(c0004s3fjYDxWOUexjjVgyA, Boolean.FALSE);
        return c0004s3fjYDxWOUexjjVgyA;
    }

    public Map.Entry s3fjYDxWOUexjjVgyA() {
        return this.f57lEeR5KfoEr4xU5yHH7;
    }

    public int size() {
        return this.f59zZKhbgvUfsK4AEX3r0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r0() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0();
        this.f56HJFh0TGMpafqLE9haL.put(zzkhbgvufsk4aex3r0, Boolean.FALSE);
        return zzkhbgvufsk4aex3r0;
    }
}
