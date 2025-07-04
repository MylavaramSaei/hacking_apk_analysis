package Z9WdNiOsPR0y54zHW4;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 implements Cloneable {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object f2296husNiw3snxdgZPAGJm = new Object();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Object[] f2297HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2298lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long[] f2299s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2300zZKhbgvUfsK4AEX3r0;

    public zZKhbgvUfsK4AEX3r0() {
        this(10);
    }

    public void Acstmh57AKoSEkEFNJ(int i) {
        Object[] objArr = this.f2297HJFh0TGMpafqLE9haL;
        Object obj = objArr[i];
        Object obj2 = f2296husNiw3snxdgZPAGJm;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2298lEeR5KfoEr4xU5yHH7 = true;
        }
    }

    public final void HJFh0TGMpafqLE9haL() {
        int i = this.f2300zZKhbgvUfsK4AEX3r0;
        long[] jArr = this.f2299s3fjYDxWOUexjjVgyA;
        Object[] objArr = this.f2297HJFh0TGMpafqLE9haL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2296husNiw3snxdgZPAGJm) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2298lEeR5KfoEr4xU5yHH7 = false;
        this.f2300zZKhbgvUfsK4AEX3r0 = i2;
    }

    public void IPyIQcaNa8aB7drBED(long j, Object obj) {
        int iS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f2299s3fjYDxWOUexjjVgyA, this.f2300zZKhbgvUfsK4AEX3r0, j);
        if (iS3fjYDxWOUexjjVgyA >= 0) {
            this.f2297HJFh0TGMpafqLE9haL[iS3fjYDxWOUexjjVgyA] = obj;
            return;
        }
        int i = ~iS3fjYDxWOUexjjVgyA;
        int i2 = this.f2300zZKhbgvUfsK4AEX3r0;
        if (i < i2) {
            Object[] objArr = this.f2297HJFh0TGMpafqLE9haL;
            if (objArr[i] == f2296husNiw3snxdgZPAGJm) {
                this.f2299s3fjYDxWOUexjjVgyA[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f2298lEeR5KfoEr4xU5yHH7 && i2 >= this.f2299s3fjYDxWOUexjjVgyA.length) {
            HJFh0TGMpafqLE9haL();
            i = ~HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f2299s3fjYDxWOUexjjVgyA, this.f2300zZKhbgvUfsK4AEX3r0, j);
        }
        int i3 = this.f2300zZKhbgvUfsK4AEX3r0;
        if (i3 >= this.f2299s3fjYDxWOUexjjVgyA.length) {
            int iKYHag8HRDlnO3X9zmZ = HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(i3 + 1);
            long[] jArr = new long[iKYHag8HRDlnO3X9zmZ];
            Object[] objArr2 = new Object[iKYHag8HRDlnO3X9zmZ];
            long[] jArr2 = this.f2299s3fjYDxWOUexjjVgyA;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2297HJFh0TGMpafqLE9haL;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2299s3fjYDxWOUexjjVgyA = jArr;
            this.f2297HJFh0TGMpafqLE9haL = objArr2;
        }
        int i4 = this.f2300zZKhbgvUfsK4AEX3r0;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2299s3fjYDxWOUexjjVgyA;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2297HJFh0TGMpafqLE9haL;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2300zZKhbgvUfsK4AEX3r0 - i);
        }
        this.f2299s3fjYDxWOUexjjVgyA[i] = j;
        this.f2297HJFh0TGMpafqLE9haL[i] = obj;
        this.f2300zZKhbgvUfsK4AEX3r0++;
    }

    public int KYHag8HRDlnO3X9zmZ(long j) {
        if (this.f2298lEeR5KfoEr4xU5yHH7) {
            HJFh0TGMpafqLE9haL();
        }
        return HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f2299s3fjYDxWOUexjjVgyA, this.f2300zZKhbgvUfsK4AEX3r0, j);
    }

    public long TCyPEKSzIyweCN5yp1(int i) {
        if (this.f2298lEeR5KfoEr4xU5yHH7) {
            HJFh0TGMpafqLE9haL();
        }
        return this.f2299s3fjYDxWOUexjjVgyA[i];
    }

    public int Z9WdNiOsPR0y54zHW4() {
        if (this.f2298lEeR5KfoEr4xU5yHH7) {
            HJFh0TGMpafqLE9haL();
        }
        return this.f2300zZKhbgvUfsK4AEX3r0;
    }

    public Object e54J8UWNHWALQNixXM(int i) {
        if (this.f2298lEeR5KfoEr4xU5yHH7) {
            HJFh0TGMpafqLE9haL();
        }
        return this.f2297HJFh0TGMpafqLE9haL[i];
    }

    public Object husNiw3snxdgZPAGJm(long j, Object obj) {
        Object obj2;
        int iS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f2299s3fjYDxWOUexjjVgyA, this.f2300zZKhbgvUfsK4AEX3r0, j);
        return (iS3fjYDxWOUexjjVgyA < 0 || (obj2 = this.f2297HJFh0TGMpafqLE9haL[iS3fjYDxWOUexjjVgyA]) == f2296husNiw3snxdgZPAGJm) ? obj : obj2;
    }

    public void lEeR5KfoEr4xU5yHH7() {
        int i = this.f2300zZKhbgvUfsK4AEX3r0;
        Object[] objArr = this.f2297HJFh0TGMpafqLE9haL;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2300zZKhbgvUfsK4AEX3r0 = 0;
        this.f2298lEeR5KfoEr4xU5yHH7 = false;
    }

    public void pbVGzGjWvY2LDXC8vo(long j) {
        int iS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f2299s3fjYDxWOUexjjVgyA, this.f2300zZKhbgvUfsK4AEX3r0, j);
        if (iS3fjYDxWOUexjjVgyA >= 0) {
            Object[] objArr = this.f2297HJFh0TGMpafqLE9haL;
            Object obj = objArr[iS3fjYDxWOUexjjVgyA];
            Object obj2 = f2296husNiw3snxdgZPAGJm;
            if (obj != obj2) {
                objArr[iS3fjYDxWOUexjjVgyA] = obj2;
                this.f2298lEeR5KfoEr4xU5yHH7 = true;
            }
        }
    }

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
    public zZKhbgvUfsK4AEX3r0 clone() {
        try {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) super.clone();
            zzkhbgvufsk4aex3r0.f2299s3fjYDxWOUexjjVgyA = (long[]) this.f2299s3fjYDxWOUexjjVgyA.clone();
            zzkhbgvufsk4aex3r0.f2297HJFh0TGMpafqLE9haL = (Object[]) this.f2297HJFh0TGMpafqLE9haL.clone();
            return zzkhbgvufsk4aex3r0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (Z9WdNiOsPR0y54zHW4() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2300zZKhbgvUfsK4AEX3r0 * 28);
        sb.append('{');
        for (int i = 0; i < this.f2300zZKhbgvUfsK4AEX3r0; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(TCyPEKSzIyweCN5yp1(i));
            sb.append('=');
            Object objE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i);
            if (objE54J8UWNHWALQNixXM != this) {
                sb.append(objE54J8UWNHWALQNixXM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object zZKhbgvUfsK4AEX3r0(long j) {
        return husNiw3snxdgZPAGJm(j, null);
    }

    public zZKhbgvUfsK4AEX3r0(int i) {
        this.f2298lEeR5KfoEr4xU5yHH7 = false;
        if (i == 0) {
            this.f2299s3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.f2247s3fjYDxWOUexjjVgyA;
            this.f2297HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL.f2245HJFh0TGMpafqLE9haL;
        } else {
            int iKYHag8HRDlnO3X9zmZ = HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(i);
            this.f2299s3fjYDxWOUexjjVgyA = new long[iKYHag8HRDlnO3X9zmZ];
            this.f2297HJFh0TGMpafqLE9haL = new Object[iKYHag8HRDlnO3X9zmZ];
        }
    }
}
