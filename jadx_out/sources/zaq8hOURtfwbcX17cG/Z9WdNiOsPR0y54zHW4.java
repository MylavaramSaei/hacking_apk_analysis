package zaq8hOURtfwbcX17cG;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static int f7633IPyIQcaNa8aB7drBED;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public T9PhQIpGRhE4yZDm1C f7634HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f7635KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f7636TCyPEKSzIyweCN5yp1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public T9PhQIpGRhE4yZDm1C f7640zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f7638lEeR5KfoEr4xU5yHH7 = 0;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f7639s3fjYDxWOUexjjVgyA = false;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public ArrayList f7637husNiw3snxdgZPAGJm = new ArrayList();

    public Z9WdNiOsPR0y54zHW4(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, int i) {
        this.f7634HJFh0TGMpafqLE9haL = null;
        this.f7640zZKhbgvUfsK4AEX3r0 = null;
        int i2 = f7633IPyIQcaNa8aB7drBED;
        this.f7635KYHag8HRDlnO3X9zmZ = i2;
        f7633IPyIQcaNa8aB7drBED = i2 + 1;
        this.f7634HJFh0TGMpafqLE9haL = t9PhQIpGRhE4yZDm1C;
        this.f7640zZKhbgvUfsK4AEX3r0 = t9PhQIpGRhE4yZDm1C;
        this.f7636TCyPEKSzIyweCN5yp1 = i;
    }

    public final long HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, long j) {
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = kYHag8HRDlnO3X9zmZ.f7606zZKhbgvUfsK4AEX3r0;
        if (t9PhQIpGRhE4yZDm1C instanceof pbVGzGjWvY2LDXC8vo) {
            return j;
        }
        int size = kYHag8HRDlnO3X9zmZ.f7600Z9WdNiOsPR0y54zHW4.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) kYHag8HRDlnO3X9zmZ.f7600Z9WdNiOsPR0y54zHW4.get(i);
            if (zzkhbgvufsk4aex3r0 instanceof KYHag8HRDlnO3X9zmZ) {
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = (KYHag8HRDlnO3X9zmZ) zzkhbgvufsk4aex3r0;
                if (kYHag8HRDlnO3X9zmZ2.f7606zZKhbgvUfsK4AEX3r0 != t9PhQIpGRhE4yZDm1C) {
                    jMin = Math.min(jMin, HJFh0TGMpafqLE9haL(kYHag8HRDlnO3X9zmZ2, kYHag8HRDlnO3X9zmZ2.f7598KYHag8HRDlnO3X9zmZ + j));
                }
            }
        }
        if (kYHag8HRDlnO3X9zmZ != t9PhQIpGRhE4yZDm1C.f7623pbVGzGjWvY2LDXC8vo) {
            return jMin;
        }
        long jAcstmh57AKoSEkEFNJ = j - t9PhQIpGRhE4yZDm1C.Acstmh57AKoSEkEFNJ();
        return Math.min(Math.min(jMin, HJFh0TGMpafqLE9haL(t9PhQIpGRhE4yZDm1C.f7618IPyIQcaNa8aB7drBED, jAcstmh57AKoSEkEFNJ)), jAcstmh57AKoSEkEFNJ - t9PhQIpGRhE4yZDm1C.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ);
    }

    public void lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        this.f7637husNiw3snxdgZPAGJm.add(t9PhQIpGRhE4yZDm1C);
        this.f7640zZKhbgvUfsK4AEX3r0 = t9PhQIpGRhE4yZDm1C;
    }

    public long s3fjYDxWOUexjjVgyA(OANkd3mP6AYvwbNLJM.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i) {
        long jAcstmh57AKoSEkEFNJ;
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C;
        long j;
        long jZZKhbgvUfsK4AEX3r0;
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C2 = this.f7634HJFh0TGMpafqLE9haL;
        if (t9PhQIpGRhE4yZDm1C2 instanceof HJFh0TGMpafqLE9haL) {
            if (((HJFh0TGMpafqLE9haL) t9PhQIpGRhE4yZDm1C2).f7619KYHag8HRDlnO3X9zmZ != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(t9PhQIpGRhE4yZDm1C2 instanceof Acstmh57AKoSEkEFNJ)) {
                return 0L;
            }
        } else if (!(t9PhQIpGRhE4yZDm1C2 instanceof e54J8UWNHWALQNixXM)) {
            return 0L;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = (i == 0 ? kYHag8HRDlnO3X9zmZ.f1130husNiw3snxdgZPAGJm : kYHag8HRDlnO3X9zmZ.f1088KYHag8HRDlnO3X9zmZ).f7618IPyIQcaNa8aB7drBED;
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ3 = (i == 0 ? kYHag8HRDlnO3X9zmZ.f1130husNiw3snxdgZPAGJm : kYHag8HRDlnO3X9zmZ.f1088KYHag8HRDlnO3X9zmZ).f7623pbVGzGjWvY2LDXC8vo;
        boolean zContains = t9PhQIpGRhE4yZDm1C2.f7618IPyIQcaNa8aB7drBED.f7601e54J8UWNHWALQNixXM.contains(kYHag8HRDlnO3X9zmZ2);
        boolean zContains2 = this.f7634HJFh0TGMpafqLE9haL.f7623pbVGzGjWvY2LDXC8vo.f7601e54J8UWNHWALQNixXM.contains(kYHag8HRDlnO3X9zmZ3);
        long jAcstmh57AKoSEkEFNJ2 = this.f7634HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ();
        if (!zContains || !zContains2) {
            if (zContains) {
                jZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(this.f7634HJFh0TGMpafqLE9haL.f7618IPyIQcaNa8aB7drBED, r12.f7598KYHag8HRDlnO3X9zmZ);
                j = this.f7634HJFh0TGMpafqLE9haL.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ + jAcstmh57AKoSEkEFNJ2;
            } else if (zContains2) {
                j = (-this.f7634HJFh0TGMpafqLE9haL.f7623pbVGzGjWvY2LDXC8vo.f7598KYHag8HRDlnO3X9zmZ) + jAcstmh57AKoSEkEFNJ2;
                jZZKhbgvUfsK4AEX3r0 = -HJFh0TGMpafqLE9haL(this.f7634HJFh0TGMpafqLE9haL.f7623pbVGzGjWvY2LDXC8vo, r12.f7598KYHag8HRDlnO3X9zmZ);
            } else {
                jAcstmh57AKoSEkEFNJ = r12.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ + this.f7634HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ();
                t9PhQIpGRhE4yZDm1C = this.f7634HJFh0TGMpafqLE9haL;
            }
            return Math.max(jZZKhbgvUfsK4AEX3r0, j);
        }
        long jZZKhbgvUfsK4AEX3r02 = zZKhbgvUfsK4AEX3r0(this.f7634HJFh0TGMpafqLE9haL.f7618IPyIQcaNa8aB7drBED, 0L);
        long jHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(this.f7634HJFh0TGMpafqLE9haL.f7623pbVGzGjWvY2LDXC8vo, 0L);
        long j2 = jZZKhbgvUfsK4AEX3r02 - jAcstmh57AKoSEkEFNJ2;
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C3 = this.f7634HJFh0TGMpafqLE9haL;
        int i2 = t9PhQIpGRhE4yZDm1C3.f7623pbVGzGjWvY2LDXC8vo.f7598KYHag8HRDlnO3X9zmZ;
        if (j2 >= (-i2)) {
            j2 += i2;
        }
        int i3 = t9PhQIpGRhE4yZDm1C3.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ;
        long j3 = ((-jHJFh0TGMpafqLE9haL) - jAcstmh57AKoSEkEFNJ2) - i3;
        if (j3 >= i3) {
            j3 -= i3;
        }
        float fAPyGSIylzVNKPT1Bls = t9PhQIpGRhE4yZDm1C3.f7624s3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(i);
        float f = fAPyGSIylzVNKPT1Bls > 0.0f ? (long) ((j3 / fAPyGSIylzVNKPT1Bls) + (j2 / (1.0f - fAPyGSIylzVNKPT1Bls))) : 0L;
        long j4 = ((long) ((f * fAPyGSIylzVNKPT1Bls) + 0.5f)) + jAcstmh57AKoSEkEFNJ2 + ((long) ((f * (1.0f - fAPyGSIylzVNKPT1Bls)) + 0.5f));
        t9PhQIpGRhE4yZDm1C = this.f7634HJFh0TGMpafqLE9haL;
        jAcstmh57AKoSEkEFNJ = t9PhQIpGRhE4yZDm1C.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ + j4;
        return jAcstmh57AKoSEkEFNJ - t9PhQIpGRhE4yZDm1C.f7623pbVGzGjWvY2LDXC8vo.f7598KYHag8HRDlnO3X9zmZ;
    }

    public final long zZKhbgvUfsK4AEX3r0(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, long j) {
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = kYHag8HRDlnO3X9zmZ.f7606zZKhbgvUfsK4AEX3r0;
        if (t9PhQIpGRhE4yZDm1C instanceof pbVGzGjWvY2LDXC8vo) {
            return j;
        }
        int size = kYHag8HRDlnO3X9zmZ.f7600Z9WdNiOsPR0y54zHW4.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) kYHag8HRDlnO3X9zmZ.f7600Z9WdNiOsPR0y54zHW4.get(i);
            if (zzkhbgvufsk4aex3r0 instanceof KYHag8HRDlnO3X9zmZ) {
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = (KYHag8HRDlnO3X9zmZ) zzkhbgvufsk4aex3r0;
                if (kYHag8HRDlnO3X9zmZ2.f7606zZKhbgvUfsK4AEX3r0 != t9PhQIpGRhE4yZDm1C) {
                    jMax = Math.max(jMax, zZKhbgvUfsK4AEX3r0(kYHag8HRDlnO3X9zmZ2, kYHag8HRDlnO3X9zmZ2.f7598KYHag8HRDlnO3X9zmZ + j));
                }
            }
        }
        if (kYHag8HRDlnO3X9zmZ != t9PhQIpGRhE4yZDm1C.f7618IPyIQcaNa8aB7drBED) {
            return jMax;
        }
        long jAcstmh57AKoSEkEFNJ = j + t9PhQIpGRhE4yZDm1C.Acstmh57AKoSEkEFNJ();
        return Math.max(Math.max(jMax, zZKhbgvUfsK4AEX3r0(t9PhQIpGRhE4yZDm1C.f7623pbVGzGjWvY2LDXC8vo, jAcstmh57AKoSEkEFNJ)), jAcstmh57AKoSEkEFNJ - t9PhQIpGRhE4yZDm1C.f7623pbVGzGjWvY2LDXC8vo.f7598KYHag8HRDlnO3X9zmZ);
    }
}
