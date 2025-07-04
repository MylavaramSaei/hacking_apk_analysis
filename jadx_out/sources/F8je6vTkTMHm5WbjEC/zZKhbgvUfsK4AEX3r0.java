package F8je6vTkTMHm5WbjEC;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zZKhbgvUfsK4AEX3r0 extends HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f136HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f137lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Object[] f138s3fjYDxWOUexjjVgyA = f134husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f135zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object[] f134husNiw3snxdgZPAGJm = new Object[0];

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public final int Acstmh57AKoSEkEFNJ(int i) {
        return i < 0 ? i + this.f138s3fjYDxWOUexjjVgyA.length : i;
    }

    public final void HJFh0TGMpafqLE9haL(Object obj) {
        T9PhQIpGRhE4yZDm1C();
        IPyIQcaNa8aB7drBED(size() + 1);
        int iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(this.f137lEeR5KfoEr4xU5yHH7);
        this.f137lEeR5KfoEr4xU5yHH7 = iTCyPEKSzIyweCN5yp1;
        this.f138s3fjYDxWOUexjjVgyA[iTCyPEKSzIyweCN5yp1] = obj;
        this.f136HJFh0TGMpafqLE9haL = size() + 1;
    }

    public final void IPyIQcaNa8aB7drBED(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f134husNiw3snxdgZPAGJm) {
            this.f138s3fjYDxWOUexjjVgyA = new Object[cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(i, 10)];
        } else {
            KYHag8HRDlnO3X9zmZ(s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(objArr.length, i));
        }
    }

    public final void KYHag8HRDlnO3X9zmZ(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
        TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr, 0, this.f137lEeR5KfoEr4xU5yHH7, objArr2.length);
        Object[] objArr3 = this.f138s3fjYDxWOUexjjVgyA;
        int length = objArr3.length;
        int i2 = this.f137lEeR5KfoEr4xU5yHH7;
        TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr3, objArr, length - i2, 0, i2);
        this.f137lEeR5KfoEr4xU5yHH7 = 0;
        this.f138s3fjYDxWOUexjjVgyA = objArr;
    }

    public final void OANkd3mP6AYvwbNLJM(int i, int i2) {
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + (i - 1));
        int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + (i2 - 1));
        while (i > 0) {
            int i3 = iE54J8UWNHWALQNixXM + 1;
            int iMin = Math.min(i, Math.min(i3, iE54J8UWNHWALQNixXM2 + 1));
            Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
            int i4 = iE54J8UWNHWALQNixXM2 - iMin;
            int i5 = iE54J8UWNHWALQNixXM - iMin;
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr, objArr, i4 + 1, i5 + 1, i3);
            iE54J8UWNHWALQNixXM = Acstmh57AKoSEkEFNJ(i5);
            iE54J8UWNHWALQNixXM2 = Acstmh57AKoSEkEFNJ(i4);
            i -= iMin;
        }
    }

    public final void T9PhQIpGRhE4yZDm1C() {
        ((AbstractList) this).modCount++;
    }

    public final int TCyPEKSzIyweCN5yp1(int i) {
        return i == 0 ? IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(this.f138s3fjYDxWOUexjjVgyA) : i - 1;
    }

    public final void Z9WdNiOsPR0y54zHW4(int i, int i2) {
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        if (i < i2) {
            TCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(objArr, null, i, i2);
        } else {
            TCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(objArr, null, i, objArr.length);
            TCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(this.f138s3fjYDxWOUexjjVgyA, null, 0, i2);
        }
    }

    public final Object aPyGSIylzVNKPT1Bls() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        T9PhQIpGRhE4yZDm1C();
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0(this));
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        Object obj = objArr[iE54J8UWNHWALQNixXM];
        objArr[iE54J8UWNHWALQNixXM] = null;
        this.f136HJFh0TGMpafqLE9haL = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, size());
        if (i == size()) {
            zZKhbgvUfsK4AEX3r0(obj);
            return;
        }
        if (i == 0) {
            HJFh0TGMpafqLE9haL(obj);
            return;
        }
        T9PhQIpGRhE4yZDm1C();
        IPyIQcaNa8aB7drBED(size() + 1);
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i);
        if (i < ((size() + 1) >> 1)) {
            int iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(iE54J8UWNHWALQNixXM);
            int iTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1(this.f137lEeR5KfoEr4xU5yHH7);
            int i2 = this.f137lEeR5KfoEr4xU5yHH7;
            if (iTCyPEKSzIyweCN5yp1 >= i2) {
                Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
                objArr[iTCyPEKSzIyweCN5yp12] = objArr[i2];
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr, objArr, i2, i2 + 1, iTCyPEKSzIyweCN5yp1 + 1);
            } else {
                Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.f138s3fjYDxWOUexjjVgyA;
                objArr3[objArr3.length - 1] = objArr3[0];
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr3, objArr3, 0, 1, iTCyPEKSzIyweCN5yp1 + 1);
            }
            this.f138s3fjYDxWOUexjjVgyA[iTCyPEKSzIyweCN5yp1] = obj;
            this.f137lEeR5KfoEr4xU5yHH7 = iTCyPEKSzIyweCN5yp12;
        } else {
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
            Object[] objArr4 = this.f138s3fjYDxWOUexjjVgyA;
            if (iE54J8UWNHWALQNixXM < iE54J8UWNHWALQNixXM2) {
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr4, objArr4, iE54J8UWNHWALQNixXM + 1, iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM2);
            } else {
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr4, objArr4, 1, 0, iE54J8UWNHWALQNixXM2);
                Object[] objArr5 = this.f138s3fjYDxWOUexjjVgyA;
                objArr5[0] = objArr5[objArr5.length - 1];
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr5, objArr5, iE54J8UWNHWALQNixXM + 1, iE54J8UWNHWALQNixXM, objArr5.length - 1);
            }
            this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM] = obj;
        }
        this.f136HJFh0TGMpafqLE9haL = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        T9PhQIpGRhE4yZDm1C();
        IPyIQcaNa8aB7drBED(size() + collection.size());
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
        int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f137lEeR5KfoEr4xU5yHH7;
            int length = i2 - size;
            if (iE54J8UWNHWALQNixXM2 < i2) {
                Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr, objArr, length, i2, objArr.length);
                Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
                if (size >= iE54J8UWNHWALQNixXM2) {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr2, objArr2.length - size, 0, iE54J8UWNHWALQNixXM2);
                } else {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f138s3fjYDxWOUexjjVgyA;
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr3, objArr3, 0, size, iE54J8UWNHWALQNixXM2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr4, objArr4, length, i2, iE54J8UWNHWALQNixXM2);
            } else {
                Object[] objArr5 = this.f138s3fjYDxWOUexjjVgyA;
                length += objArr5.length;
                int i3 = iE54J8UWNHWALQNixXM2 - i2;
                int length2 = objArr5.length - length;
                if (length2 >= i3) {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr5, objArr5, length, i2, iE54J8UWNHWALQNixXM2);
                } else {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr5, objArr5, length, i2, i2 + length2);
                    Object[] objArr6 = this.f138s3fjYDxWOUexjjVgyA;
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr6, objArr6, 0, this.f137lEeR5KfoEr4xU5yHH7 + length2, iE54J8UWNHWALQNixXM2);
                }
            }
            this.f137lEeR5KfoEr4xU5yHH7 = length;
            husNiw3snxdgZPAGJm(Acstmh57AKoSEkEFNJ(iE54J8UWNHWALQNixXM2 - size), collection);
        } else {
            int length3 = iE54J8UWNHWALQNixXM2 + size;
            if (iE54J8UWNHWALQNixXM2 < iE54J8UWNHWALQNixXM) {
                int i4 = size + iE54J8UWNHWALQNixXM;
                Object[] objArr7 = this.f138s3fjYDxWOUexjjVgyA;
                if (i4 <= objArr7.length) {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr7, objArr7, length3, iE54J8UWNHWALQNixXM2, iE54J8UWNHWALQNixXM);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr7, objArr7, length3, iE54J8UWNHWALQNixXM2, iE54J8UWNHWALQNixXM);
                } else {
                    int length4 = iE54J8UWNHWALQNixXM - (i4 - objArr7.length);
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr7, objArr7, 0, length4, iE54J8UWNHWALQNixXM);
                    Object[] objArr8 = this.f138s3fjYDxWOUexjjVgyA;
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr8, objArr8, length3, iE54J8UWNHWALQNixXM2, length4);
                }
            } else {
                Object[] objArr9 = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr9, objArr9, size, 0, iE54J8UWNHWALQNixXM);
                Object[] objArr10 = this.f138s3fjYDxWOUexjjVgyA;
                if (length3 >= objArr10.length) {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr10, objArr10, length3 - objArr10.length, iE54J8UWNHWALQNixXM2, objArr10.length);
                } else {
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f138s3fjYDxWOUexjjVgyA;
                    TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr11, objArr11, length3, iE54J8UWNHWALQNixXM2, objArr11.length - size);
                }
            }
            husNiw3snxdgZPAGJm(iE54J8UWNHWALQNixXM2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            T9PhQIpGRhE4yZDm1C();
            Z9WdNiOsPR0y54zHW4(this.f137lEeR5KfoEr4xU5yHH7, e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size()));
        }
        this.f137lEeR5KfoEr4xU5yHH7 = 0;
        this.f136HJFh0TGMpafqLE9haL = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e54J8UWNHWALQNixXM(int i) {
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i, size());
        return this.f138s3fjYDxWOUexjjVgyA[e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i)];
    }

    public final Object hoXrIDAFrSwfShk8da() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        T9PhQIpGRhE4yZDm1C();
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        int i = this.f137lEeR5KfoEr4xU5yHH7;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f137lEeR5KfoEr4xU5yHH7 = pbVGzGjWvY2LDXC8vo(i);
        this.f136HJFh0TGMpafqLE9haL = size() - 1;
        return obj;
    }

    public final void husNiw3snxdgZPAGJm(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f138s3fjYDxWOUexjjVgyA.length;
        while (i < length && it.hasNext()) {
            this.f138s3fjYDxWOUexjjVgyA[i] = it.next();
            i++;
        }
        int i2 = this.f137lEeR5KfoEr4xU5yHH7;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f138s3fjYDxWOUexjjVgyA[i3] = it.next();
        }
        this.f136HJFh0TGMpafqLE9haL = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
        int length = this.f137lEeR5KfoEr4xU5yHH7;
        if (length < iE54J8UWNHWALQNixXM) {
            while (length < iE54J8UWNHWALQNixXM) {
                if (!jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iE54J8UWNHWALQNixXM) {
            return -1;
        }
        int length2 = this.f138s3fjYDxWOUexjjVgyA.length;
        while (true) {
            if (length >= length2) {
                for (int i = 0; i < iE54J8UWNHWALQNixXM; i++) {
                    if (jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[i])) {
                        length = i + this.f138s3fjYDxWOUexjjVgyA.length;
                    }
                }
                return -1;
            }
            if (jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[length])) {
                break;
            }
            length++;
        }
        return length - this.f137lEeR5KfoEr4xU5yHH7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // F8je6vTkTMHm5WbjEC.HJFh0TGMpafqLE9haL
    public int lEeR5KfoEr4xU5yHH7() {
        return this.f136HJFh0TGMpafqLE9haL;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iKYHag8HRDlnO3X9zmZ;
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
        int i = this.f137lEeR5KfoEr4xU5yHH7;
        if (i < iE54J8UWNHWALQNixXM) {
            iKYHag8HRDlnO3X9zmZ = iE54J8UWNHWALQNixXM - 1;
            if (i <= iKYHag8HRDlnO3X9zmZ) {
                while (!jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[iKYHag8HRDlnO3X9zmZ])) {
                    if (iKYHag8HRDlnO3X9zmZ != i) {
                        iKYHag8HRDlnO3X9zmZ--;
                    }
                }
                return iKYHag8HRDlnO3X9zmZ - this.f137lEeR5KfoEr4xU5yHH7;
            }
            return -1;
        }
        if (i > iE54J8UWNHWALQNixXM) {
            int i2 = iE54J8UWNHWALQNixXM - 1;
            while (true) {
                if (-1 >= i2) {
                    iKYHag8HRDlnO3X9zmZ = IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(this.f138s3fjYDxWOUexjjVgyA);
                    int i3 = this.f137lEeR5KfoEr4xU5yHH7;
                    if (i3 <= iKYHag8HRDlnO3X9zmZ) {
                        while (!jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[iKYHag8HRDlnO3X9zmZ])) {
                            if (iKYHag8HRDlnO3X9zmZ != i3) {
                                iKYHag8HRDlnO3X9zmZ--;
                            }
                        }
                    }
                } else {
                    if (jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, this.f138s3fjYDxWOUexjjVgyA[i2])) {
                        iKYHag8HRDlnO3X9zmZ = i2 + this.f138s3fjYDxWOUexjjVgyA.length;
                        break;
                    }
                    i2--;
                }
            }
        }
        return -1;
    }

    public final int pbVGzGjWvY2LDXC8vo(int i) {
        if (i == IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(this.f138s3fjYDxWOUexjjVgyA)) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iE54J8UWNHWALQNixXM;
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f138s3fjYDxWOUexjjVgyA.length != 0) {
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
            int i = this.f137lEeR5KfoEr4xU5yHH7;
            if (i < iE54J8UWNHWALQNixXM2) {
                iE54J8UWNHWALQNixXM = i;
                while (i < iE54J8UWNHWALQNixXM2) {
                    Object obj = this.f138s3fjYDxWOUexjjVgyA[i];
                    if (!collection.contains(obj)) {
                        this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM] = obj;
                        iE54J8UWNHWALQNixXM++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                TCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(this.f138s3fjYDxWOUexjjVgyA, null, iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM2);
            } else {
                int length = this.f138s3fjYDxWOUexjjVgyA.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.f138s3fjYDxWOUexjjVgyA[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i2);
                for (int i3 = 0; i3 < iE54J8UWNHWALQNixXM2; i3++) {
                    Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM] = obj3;
                        iE54J8UWNHWALQNixXM = pbVGzGjWvY2LDXC8vo(iE54J8UWNHWALQNixXM);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                T9PhQIpGRhE4yZDm1C();
                this.f136HJFh0TGMpafqLE9haL = Acstmh57AKoSEkEFNJ(iE54J8UWNHWALQNixXM - this.f137lEeR5KfoEr4xU5yHH7);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        T9PhQIpGRhE4yZDm1C();
        if (i < size() - i2) {
            OANkd3mP6AYvwbNLJM(i, i2);
            int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i3);
            Z9WdNiOsPR0y54zHW4(this.f137lEeR5KfoEr4xU5yHH7, iE54J8UWNHWALQNixXM);
            this.f137lEeR5KfoEr4xU5yHH7 = iE54J8UWNHWALQNixXM;
        } else {
            zaq8hOURtfwbcX17cG(i, i2);
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
            Z9WdNiOsPR0y54zHW4(Acstmh57AKoSEkEFNJ(iE54J8UWNHWALQNixXM2 - i3), iE54J8UWNHWALQNixXM2);
        }
        this.f136HJFh0TGMpafqLE9haL = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iE54J8UWNHWALQNixXM;
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f138s3fjYDxWOUexjjVgyA.length != 0) {
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
            int i = this.f137lEeR5KfoEr4xU5yHH7;
            if (i < iE54J8UWNHWALQNixXM2) {
                iE54J8UWNHWALQNixXM = i;
                while (i < iE54J8UWNHWALQNixXM2) {
                    Object obj = this.f138s3fjYDxWOUexjjVgyA[i];
                    if (collection.contains(obj)) {
                        this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM] = obj;
                        iE54J8UWNHWALQNixXM++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                TCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(this.f138s3fjYDxWOUexjjVgyA, null, iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM2);
            } else {
                int length = this.f138s3fjYDxWOUexjjVgyA.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f138s3fjYDxWOUexjjVgyA[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i2);
                for (int i3 = 0; i3 < iE54J8UWNHWALQNixXM2; i3++) {
                    Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM] = obj3;
                        iE54J8UWNHWALQNixXM = pbVGzGjWvY2LDXC8vo(iE54J8UWNHWALQNixXM);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                T9PhQIpGRhE4yZDm1C();
                this.f136HJFh0TGMpafqLE9haL = Acstmh57AKoSEkEFNJ(iE54J8UWNHWALQNixXM - this.f137lEeR5KfoEr4xU5yHH7);
            }
        }
        return z;
    }

    @Override // F8je6vTkTMHm5WbjEC.HJFh0TGMpafqLE9haL
    public Object s3fjYDxWOUexjjVgyA(int i) {
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i, size());
        if (i == Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0(this)) {
            return aPyGSIylzVNKPT1Bls();
        }
        if (i == 0) {
            return hoXrIDAFrSwfShk8da();
        }
        T9PhQIpGRhE4yZDm1C();
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i);
        Object obj = this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM];
        if (i < (size() >> 1)) {
            int i2 = this.f137lEeR5KfoEr4xU5yHH7;
            if (iE54J8UWNHWALQNixXM >= i2) {
                Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr, objArr, i2 + 1, i2, iE54J8UWNHWALQNixXM);
            } else {
                Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr2, 1, 0, iE54J8UWNHWALQNixXM);
                Object[] objArr3 = this.f138s3fjYDxWOUexjjVgyA;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f137lEeR5KfoEr4xU5yHH7;
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f138s3fjYDxWOUexjjVgyA;
            int i4 = this.f137lEeR5KfoEr4xU5yHH7;
            objArr4[i4] = null;
            this.f137lEeR5KfoEr4xU5yHH7 = pbVGzGjWvY2LDXC8vo(i4);
        } else {
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0(this));
            Object[] objArr5 = this.f138s3fjYDxWOUexjjVgyA;
            if (iE54J8UWNHWALQNixXM <= iE54J8UWNHWALQNixXM2) {
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr5, objArr5, iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM + 1, iE54J8UWNHWALQNixXM2 + 1);
            } else {
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr5, objArr5, iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM + 1, objArr5.length);
                Object[] objArr6 = this.f138s3fjYDxWOUexjjVgyA;
                objArr6[objArr6.length - 1] = objArr6[0];
                TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr6, objArr6, 0, 1, iE54J8UWNHWALQNixXM2 + 1);
            }
            this.f138s3fjYDxWOUexjjVgyA[iE54J8UWNHWALQNixXM2] = null;
        }
        this.f136HJFh0TGMpafqLE9haL = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        s3fjYDxWOUexjjVgyA.f132lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i, size());
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i);
        Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
        Object obj2 = objArr[iE54J8UWNHWALQNixXM];
        objArr[iE54J8UWNHWALQNixXM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final void zZKhbgvUfsK4AEX3r0(Object obj) {
        T9PhQIpGRhE4yZDm1C();
        IPyIQcaNa8aB7drBED(size() + 1);
        this.f138s3fjYDxWOUexjjVgyA[e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size())] = obj;
        this.f136HJFh0TGMpafqLE9haL = size() + 1;
    }

    public final void zaq8hOURtfwbcX17cG(int i, int i2) {
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i2);
        int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f138s3fjYDxWOUexjjVgyA;
            i2 = Math.min(size, Math.min(objArr.length - iE54J8UWNHWALQNixXM, objArr.length - iE54J8UWNHWALQNixXM2));
            Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
            int i3 = iE54J8UWNHWALQNixXM + i2;
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr2, iE54J8UWNHWALQNixXM2, iE54J8UWNHWALQNixXM, i3);
            iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i3);
            iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(iE54J8UWNHWALQNixXM2 + i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        zZKhbgvUfsK4AEX3r0(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        T9PhQIpGRhE4yZDm1C();
        IPyIQcaNa8aB7drBED(size() + collection.size());
        husNiw3snxdgZPAGJm(e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size()), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "array");
        if (objArr.length < size()) {
            objArr = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(objArr, size());
        }
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(this.f137lEeR5KfoEr4xU5yHH7 + size());
        int i = this.f137lEeR5KfoEr4xU5yHH7;
        if (i < iE54J8UWNHWALQNixXM) {
            TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(this.f138s3fjYDxWOUexjjVgyA, objArr, 0, i, iE54J8UWNHWALQNixXM, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f138s3fjYDxWOUexjjVgyA;
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr2, objArr, 0, this.f137lEeR5KfoEr4xU5yHH7, objArr2.length);
            Object[] objArr3 = this.f138s3fjYDxWOUexjjVgyA;
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(objArr3, objArr, objArr3.length - this.f137lEeR5KfoEr4xU5yHH7, 0, iE54J8UWNHWALQNixXM);
        }
        return Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA(size(), objArr);
    }
}
