package Z9WdNiOsPR0y54zHW4;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED implements Cloneable {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object f2248husNiw3snxdgZPAGJm = new Object();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Object[] f2249HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2250lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int[] f2251s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2252zZKhbgvUfsK4AEX3r0;

    public IPyIQcaNa8aB7drBED() {
        this(10);
    }

    public int Acstmh57AKoSEkEFNJ() {
        if (this.f2250lEeR5KfoEr4xU5yHH7) {
            zZKhbgvUfsK4AEX3r0();
        }
        return this.f2252zZKhbgvUfsK4AEX3r0;
    }

    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public IPyIQcaNa8aB7drBED clone() {
        try {
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = (IPyIQcaNa8aB7drBED) super.clone();
            iPyIQcaNa8aB7drBED.f2251s3fjYDxWOUexjjVgyA = (int[]) this.f2251s3fjYDxWOUexjjVgyA.clone();
            iPyIQcaNa8aB7drBED.f2249HJFh0TGMpafqLE9haL = (Object[]) this.f2249HJFh0TGMpafqLE9haL.clone();
            return iPyIQcaNa8aB7drBED;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int IPyIQcaNa8aB7drBED(int i) {
        if (this.f2250lEeR5KfoEr4xU5yHH7) {
            zZKhbgvUfsK4AEX3r0();
        }
        return this.f2251s3fjYDxWOUexjjVgyA[i];
    }

    public Object KYHag8HRDlnO3X9zmZ(int i, Object obj) {
        Object obj2;
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f2251s3fjYDxWOUexjjVgyA, this.f2252zZKhbgvUfsK4AEX3r0, i);
        return (iLEeR5KfoEr4xU5yHH7 < 0 || (obj2 = this.f2249HJFh0TGMpafqLE9haL[iLEeR5KfoEr4xU5yHH7]) == f2248husNiw3snxdgZPAGJm) ? obj : obj2;
    }

    public int TCyPEKSzIyweCN5yp1(Object obj) {
        if (this.f2250lEeR5KfoEr4xU5yHH7) {
            zZKhbgvUfsK4AEX3r0();
        }
        for (int i = 0; i < this.f2252zZKhbgvUfsK4AEX3r0; i++) {
            if (this.f2249HJFh0TGMpafqLE9haL[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public Object Z9WdNiOsPR0y54zHW4(int i) {
        if (this.f2250lEeR5KfoEr4xU5yHH7) {
            zZKhbgvUfsK4AEX3r0();
        }
        return this.f2249HJFh0TGMpafqLE9haL[i];
    }

    public Object husNiw3snxdgZPAGJm(int i) {
        return KYHag8HRDlnO3X9zmZ(i, null);
    }

    public void lEeR5KfoEr4xU5yHH7(int i, Object obj) {
        int i2 = this.f2252zZKhbgvUfsK4AEX3r0;
        if (i2 != 0 && i <= this.f2251s3fjYDxWOUexjjVgyA[i2 - 1]) {
            pbVGzGjWvY2LDXC8vo(i, obj);
            return;
        }
        if (this.f2250lEeR5KfoEr4xU5yHH7 && i2 >= this.f2251s3fjYDxWOUexjjVgyA.length) {
            zZKhbgvUfsK4AEX3r0();
        }
        int i3 = this.f2252zZKhbgvUfsK4AEX3r0;
        if (i3 >= this.f2251s3fjYDxWOUexjjVgyA.length) {
            int iHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(i3 + 1);
            int[] iArr = new int[iHusNiw3snxdgZPAGJm];
            Object[] objArr = new Object[iHusNiw3snxdgZPAGJm];
            int[] iArr2 = this.f2251s3fjYDxWOUexjjVgyA;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2249HJFh0TGMpafqLE9haL;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2251s3fjYDxWOUexjjVgyA = iArr;
            this.f2249HJFh0TGMpafqLE9haL = objArr;
        }
        this.f2251s3fjYDxWOUexjjVgyA[i3] = i;
        this.f2249HJFh0TGMpafqLE9haL[i3] = obj;
        this.f2252zZKhbgvUfsK4AEX3r0 = i3 + 1;
    }

    public void pbVGzGjWvY2LDXC8vo(int i, Object obj) {
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f2251s3fjYDxWOUexjjVgyA, this.f2252zZKhbgvUfsK4AEX3r0, i);
        if (iLEeR5KfoEr4xU5yHH7 >= 0) {
            this.f2249HJFh0TGMpafqLE9haL[iLEeR5KfoEr4xU5yHH7] = obj;
            return;
        }
        int i2 = ~iLEeR5KfoEr4xU5yHH7;
        int i3 = this.f2252zZKhbgvUfsK4AEX3r0;
        if (i2 < i3) {
            Object[] objArr = this.f2249HJFh0TGMpafqLE9haL;
            if (objArr[i2] == f2248husNiw3snxdgZPAGJm) {
                this.f2251s3fjYDxWOUexjjVgyA[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f2250lEeR5KfoEr4xU5yHH7 && i3 >= this.f2251s3fjYDxWOUexjjVgyA.length) {
            zZKhbgvUfsK4AEX3r0();
            i2 = ~HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f2251s3fjYDxWOUexjjVgyA, this.f2252zZKhbgvUfsK4AEX3r0, i);
        }
        int i4 = this.f2252zZKhbgvUfsK4AEX3r0;
        if (i4 >= this.f2251s3fjYDxWOUexjjVgyA.length) {
            int iHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(i4 + 1);
            int[] iArr = new int[iHusNiw3snxdgZPAGJm];
            Object[] objArr2 = new Object[iHusNiw3snxdgZPAGJm];
            int[] iArr2 = this.f2251s3fjYDxWOUexjjVgyA;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2249HJFh0TGMpafqLE9haL;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2251s3fjYDxWOUexjjVgyA = iArr;
            this.f2249HJFh0TGMpafqLE9haL = objArr2;
        }
        int i5 = this.f2252zZKhbgvUfsK4AEX3r0;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2251s3fjYDxWOUexjjVgyA;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2249HJFh0TGMpafqLE9haL;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2252zZKhbgvUfsK4AEX3r0 - i2);
        }
        this.f2251s3fjYDxWOUexjjVgyA[i2] = i;
        this.f2249HJFh0TGMpafqLE9haL[i2] = obj;
        this.f2252zZKhbgvUfsK4AEX3r0++;
    }

    public void s3fjYDxWOUexjjVgyA() {
        int i = this.f2252zZKhbgvUfsK4AEX3r0;
        Object[] objArr = this.f2249HJFh0TGMpafqLE9haL;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2252zZKhbgvUfsK4AEX3r0 = 0;
        this.f2250lEeR5KfoEr4xU5yHH7 = false;
    }

    public String toString() {
        if (Acstmh57AKoSEkEFNJ() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2252zZKhbgvUfsK4AEX3r0 * 28);
        sb.append('{');
        for (int i = 0; i < this.f2252zZKhbgvUfsK4AEX3r0; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(IPyIQcaNa8aB7drBED(i));
            sb.append('=');
            Object objZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(i);
            if (objZ9WdNiOsPR0y54zHW4 != this) {
                sb.append(objZ9WdNiOsPR0y54zHW4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void zZKhbgvUfsK4AEX3r0() {
        int i = this.f2252zZKhbgvUfsK4AEX3r0;
        int[] iArr = this.f2251s3fjYDxWOUexjjVgyA;
        Object[] objArr = this.f2249HJFh0TGMpafqLE9haL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2248husNiw3snxdgZPAGJm) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2250lEeR5KfoEr4xU5yHH7 = false;
        this.f2252zZKhbgvUfsK4AEX3r0 = i2;
    }

    public IPyIQcaNa8aB7drBED(int i) {
        this.f2250lEeR5KfoEr4xU5yHH7 = false;
        if (i == 0) {
            this.f2251s3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.f2246lEeR5KfoEr4xU5yHH7;
            this.f2249HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL.f2245HJFh0TGMpafqLE9haL;
        } else {
            int iHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(i);
            this.f2251s3fjYDxWOUexjjVgyA = new int[iHusNiw3snxdgZPAGJm];
            this.f2249HJFh0TGMpafqLE9haL = new Object[iHusNiw3snxdgZPAGJm];
        }
    }
}
