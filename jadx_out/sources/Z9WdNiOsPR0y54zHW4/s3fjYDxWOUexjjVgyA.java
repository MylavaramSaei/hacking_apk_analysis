package Z9WdNiOsPR0y54zHW4;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA implements Collection, Set {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static int f2285Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static int f2286IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static Object[] f2288TCyPEKSzIyweCN5yp1;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static Object[] f2290pbVGzGjWvY2LDXC8vo;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2291HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int[] f2292lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Object[] f2293s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ f2294zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final int[] f2289husNiw3snxdgZPAGJm = new int[0];

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Object[] f2287KYHag8HRDlnO3X9zmZ = new Object[0];

    public class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public Map HJFh0TGMpafqLE9haL() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public void IPyIQcaNa8aB7drBED(int i) {
            s3fjYDxWOUexjjVgyA.this.TCyPEKSzIyweCN5yp1(i);
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public int KYHag8HRDlnO3X9zmZ(Object obj) {
            return s3fjYDxWOUexjjVgyA.this.indexOf(obj);
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public void TCyPEKSzIyweCN5yp1(Object obj, Object obj2) {
            s3fjYDxWOUexjjVgyA.this.add(obj);
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public int husNiw3snxdgZPAGJm(Object obj) {
            return s3fjYDxWOUexjjVgyA.this.indexOf(obj);
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7() {
            s3fjYDxWOUexjjVgyA.this.clear();
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public Object pbVGzGjWvY2LDXC8vo(int i, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public Object s3fjYDxWOUexjjVgyA(int i, int i2) {
            return s3fjYDxWOUexjjVgyA.this.f2293s3fjYDxWOUexjjVgyA[i];
        }

        @Override // Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ
        public int zZKhbgvUfsK4AEX3r0() {
            return s3fjYDxWOUexjjVgyA.this.f2291HJFh0TGMpafqLE9haL;
        }
    }

    public s3fjYDxWOUexjjVgyA() {
        this(0);
    }

    public static void HJFh0TGMpafqLE9haL(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (s3fjYDxWOUexjjVgyA.class) {
                try {
                    if (f2285Acstmh57AKoSEkEFNJ < 10) {
                        objArr[0] = f2290pbVGzGjWvY2LDXC8vo;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f2290pbVGzGjWvY2LDXC8vo = objArr;
                        f2285Acstmh57AKoSEkEFNJ++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (s3fjYDxWOUexjjVgyA.class) {
                try {
                    if (f2286IPyIQcaNa8aB7drBED < 10) {
                        objArr[0] = f2288TCyPEKSzIyweCN5yp1;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f2288TCyPEKSzIyweCN5yp1 = objArr;
                        f2286IPyIQcaNa8aB7drBED++;
                    }
                } finally {
                }
            }
        }
    }

    public Object IPyIQcaNa8aB7drBED(int i) {
        return this.f2293s3fjYDxWOUexjjVgyA[i];
    }

    public final int KYHag8HRDlnO3X9zmZ() {
        int i = this.f2291HJFh0TGMpafqLE9haL;
        if (i == 0) {
            return -1;
        }
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f2292lEeR5KfoEr4xU5yHH7, i, 0);
        if (iLEeR5KfoEr4xU5yHH7 < 0 || this.f2293s3fjYDxWOUexjjVgyA[iLEeR5KfoEr4xU5yHH7] == null) {
            return iLEeR5KfoEr4xU5yHH7;
        }
        int i2 = iLEeR5KfoEr4xU5yHH7 + 1;
        while (i2 < i && this.f2292lEeR5KfoEr4xU5yHH7[i2] == 0) {
            if (this.f2293s3fjYDxWOUexjjVgyA[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iLEeR5KfoEr4xU5yHH7 - 1; i3 >= 0 && this.f2292lEeR5KfoEr4xU5yHH7[i3] == 0; i3--) {
            if (this.f2293s3fjYDxWOUexjjVgyA[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public Object TCyPEKSzIyweCN5yp1(int i) {
        Object[] objArr = this.f2293s3fjYDxWOUexjjVgyA;
        Object obj = objArr[i];
        int i2 = this.f2291HJFh0TGMpafqLE9haL;
        if (i2 <= 1) {
            HJFh0TGMpafqLE9haL(this.f2292lEeR5KfoEr4xU5yHH7, objArr, i2);
            this.f2292lEeR5KfoEr4xU5yHH7 = f2289husNiw3snxdgZPAGJm;
            this.f2293s3fjYDxWOUexjjVgyA = f2287KYHag8HRDlnO3X9zmZ;
            this.f2291HJFh0TGMpafqLE9haL = 0;
        } else {
            int[] iArr = this.f2292lEeR5KfoEr4xU5yHH7;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f2291HJFh0TGMpafqLE9haL = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f2293s3fjYDxWOUexjjVgyA;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f2291HJFh0TGMpafqLE9haL - i);
                }
                this.f2293s3fjYDxWOUexjjVgyA[this.f2291HJFh0TGMpafqLE9haL] = null;
            } else {
                lEeR5KfoEr4xU5yHH7(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f2291HJFh0TGMpafqLE9haL--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2292lEeR5KfoEr4xU5yHH7, 0, i);
                    System.arraycopy(objArr, 0, this.f2293s3fjYDxWOUexjjVgyA, 0, i);
                }
                int i5 = this.f2291HJFh0TGMpafqLE9haL;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f2292lEeR5KfoEr4xU5yHH7, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f2293s3fjYDxWOUexjjVgyA, i, this.f2291HJFh0TGMpafqLE9haL - i);
                }
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int iHusNiw3snxdgZPAGJm;
        if (obj == null) {
            iHusNiw3snxdgZPAGJm = KYHag8HRDlnO3X9zmZ();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(obj, iHashCode);
        }
        if (iHusNiw3snxdgZPAGJm >= 0) {
            return false;
        }
        int i2 = ~iHusNiw3snxdgZPAGJm;
        int i3 = this.f2291HJFh0TGMpafqLE9haL;
        int[] iArr = this.f2292lEeR5KfoEr4xU5yHH7;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f2293s3fjYDxWOUexjjVgyA;
            lEeR5KfoEr4xU5yHH7(i4);
            int[] iArr2 = this.f2292lEeR5KfoEr4xU5yHH7;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2293s3fjYDxWOUexjjVgyA, 0, objArr.length);
            }
            HJFh0TGMpafqLE9haL(iArr, objArr, this.f2291HJFh0TGMpafqLE9haL);
        }
        int i5 = this.f2291HJFh0TGMpafqLE9haL;
        if (i2 < i5) {
            int[] iArr3 = this.f2292lEeR5KfoEr4xU5yHH7;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f2293s3fjYDxWOUexjjVgyA;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f2291HJFh0TGMpafqLE9haL - i2);
        }
        this.f2292lEeR5KfoEr4xU5yHH7[i2] = i;
        this.f2293s3fjYDxWOUexjjVgyA[i2] = obj;
        this.f2291HJFh0TGMpafqLE9haL++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        s3fjYDxWOUexjjVgyA(this.f2291HJFh0TGMpafqLE9haL + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f2291HJFh0TGMpafqLE9haL;
        if (i != 0) {
            HJFh0TGMpafqLE9haL(this.f2292lEeR5KfoEr4xU5yHH7, this.f2293s3fjYDxWOUexjjVgyA, i);
            this.f2292lEeR5KfoEr4xU5yHH7 = f2289husNiw3snxdgZPAGJm;
            this.f2293s3fjYDxWOUexjjVgyA = f2287KYHag8HRDlnO3X9zmZ;
            this.f2291HJFh0TGMpafqLE9haL = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f2291HJFh0TGMpafqLE9haL; i++) {
                try {
                    if (!set.contains(IPyIQcaNa8aB7drBED(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2292lEeR5KfoEr4xU5yHH7;
        int i = this.f2291HJFh0TGMpafqLE9haL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int husNiw3snxdgZPAGJm(Object obj, int i) {
        int i2 = this.f2291HJFh0TGMpafqLE9haL;
        if (i2 == 0) {
            return -1;
        }
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f2292lEeR5KfoEr4xU5yHH7, i2, i);
        if (iLEeR5KfoEr4xU5yHH7 < 0 || obj.equals(this.f2293s3fjYDxWOUexjjVgyA[iLEeR5KfoEr4xU5yHH7])) {
            return iLEeR5KfoEr4xU5yHH7;
        }
        int i3 = iLEeR5KfoEr4xU5yHH7 + 1;
        while (i3 < i2 && this.f2292lEeR5KfoEr4xU5yHH7[i3] == i) {
            if (obj.equals(this.f2293s3fjYDxWOUexjjVgyA[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iLEeR5KfoEr4xU5yHH7 - 1; i4 >= 0 && this.f2292lEeR5KfoEr4xU5yHH7[i4] == i; i4--) {
            if (obj.equals(this.f2293s3fjYDxWOUexjjVgyA[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? KYHag8HRDlnO3X9zmZ() : husNiw3snxdgZPAGJm(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2291HJFh0TGMpafqLE9haL <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return zZKhbgvUfsK4AEX3r0().T9PhQIpGRhE4yZDm1C().iterator();
    }

    public final void lEeR5KfoEr4xU5yHH7(int i) {
        if (i == 8) {
            synchronized (s3fjYDxWOUexjjVgyA.class) {
                try {
                    Object[] objArr = f2290pbVGzGjWvY2LDXC8vo;
                    if (objArr != null) {
                        this.f2293s3fjYDxWOUexjjVgyA = objArr;
                        f2290pbVGzGjWvY2LDXC8vo = (Object[]) objArr[0];
                        this.f2292lEeR5KfoEr4xU5yHH7 = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f2285Acstmh57AKoSEkEFNJ--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (s3fjYDxWOUexjjVgyA.class) {
                try {
                    Object[] objArr2 = f2288TCyPEKSzIyweCN5yp1;
                    if (objArr2 != null) {
                        this.f2293s3fjYDxWOUexjjVgyA = objArr2;
                        f2288TCyPEKSzIyweCN5yp1 = (Object[]) objArr2[0];
                        this.f2292lEeR5KfoEr4xU5yHH7 = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f2286IPyIQcaNa8aB7drBED--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f2292lEeR5KfoEr4xU5yHH7 = new int[i];
        this.f2293s3fjYDxWOUexjjVgyA = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        TCyPEKSzIyweCN5yp1(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f2291HJFh0TGMpafqLE9haL - 1; i >= 0; i--) {
            if (!collection.contains(this.f2293s3fjYDxWOUexjjVgyA[i])) {
                TCyPEKSzIyweCN5yp1(i);
                z = true;
            }
        }
        return z;
    }

    public void s3fjYDxWOUexjjVgyA(int i) {
        int[] iArr = this.f2292lEeR5KfoEr4xU5yHH7;
        if (iArr.length < i) {
            Object[] objArr = this.f2293s3fjYDxWOUexjjVgyA;
            lEeR5KfoEr4xU5yHH7(i);
            int i2 = this.f2291HJFh0TGMpafqLE9haL;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2292lEeR5KfoEr4xU5yHH7, 0, i2);
                System.arraycopy(objArr, 0, this.f2293s3fjYDxWOUexjjVgyA, 0, this.f2291HJFh0TGMpafqLE9haL);
            }
            HJFh0TGMpafqLE9haL(iArr, objArr, this.f2291HJFh0TGMpafqLE9haL);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2291HJFh0TGMpafqLE9haL;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f2291HJFh0TGMpafqLE9haL;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2293s3fjYDxWOUexjjVgyA, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2291HJFh0TGMpafqLE9haL * 14);
        sb.append('{');
        for (int i = 0; i < this.f2291HJFh0TGMpafqLE9haL; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
            if (objIPyIQcaNa8aB7drBED != this) {
                sb.append(objIPyIQcaNa8aB7drBED);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0() {
        if (this.f2294zZKhbgvUfsK4AEX3r0 == null) {
            this.f2294zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7();
        }
        return this.f2294zZKhbgvUfsK4AEX3r0;
    }

    public s3fjYDxWOUexjjVgyA(int i) {
        if (i == 0) {
            this.f2292lEeR5KfoEr4xU5yHH7 = f2289husNiw3snxdgZPAGJm;
            this.f2293s3fjYDxWOUexjjVgyA = f2287KYHag8HRDlnO3X9zmZ;
        } else {
            lEeR5KfoEr4xU5yHH7(i);
        }
        this.f2291HJFh0TGMpafqLE9haL = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f2291HJFh0TGMpafqLE9haL) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f2291HJFh0TGMpafqLE9haL);
        }
        System.arraycopy(this.f2293s3fjYDxWOUexjjVgyA, 0, objArr, 0, this.f2291HJFh0TGMpafqLE9haL);
        int length = objArr.length;
        int i = this.f2291HJFh0TGMpafqLE9haL;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
