package zaq8hOURtfwbcX17cG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class KYHag8HRDlnO3X9zmZ implements zZKhbgvUfsK4AEX3r0 {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f7598KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f7599TCyPEKSzIyweCN5yp1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public T9PhQIpGRhE4yZDm1C f7606zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f7603lEeR5KfoEr4xU5yHH7 = null;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f7605s3fjYDxWOUexjjVgyA = false;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f7596HJFh0TGMpafqLE9haL = false;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f7602husNiw3snxdgZPAGJm = lEeR5KfoEr4xU5yHH7.UNKNOWN;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f7597IPyIQcaNa8aB7drBED = 1;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1 f7604pbVGzGjWvY2LDXC8vo = null;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f7595Acstmh57AKoSEkEFNJ = false;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public List f7600Z9WdNiOsPR0y54zHW4 = new ArrayList();

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public List f7601e54J8UWNHWALQNixXM = new ArrayList();

    public enum lEeR5KfoEr4xU5yHH7 {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public KYHag8HRDlnO3X9zmZ(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        this.f7606zZKhbgvUfsK4AEX3r0 = t9PhQIpGRhE4yZDm1C;
    }

    public void HJFh0TGMpafqLE9haL() {
        this.f7601e54J8UWNHWALQNixXM.clear();
        this.f7600Z9WdNiOsPR0y54zHW4.clear();
        this.f7595Acstmh57AKoSEkEFNJ = false;
        this.f7599TCyPEKSzIyweCN5yp1 = 0;
        this.f7596HJFh0TGMpafqLE9haL = false;
        this.f7605s3fjYDxWOUexjjVgyA = false;
    }

    @Override // zaq8hOURtfwbcX17cG.zZKhbgvUfsK4AEX3r0
    public void lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        Iterator it = this.f7601e54J8UWNHWALQNixXM.iterator();
        while (it.hasNext()) {
            if (!((KYHag8HRDlnO3X9zmZ) it.next()).f7595Acstmh57AKoSEkEFNJ) {
                return;
            }
        }
        this.f7596HJFh0TGMpafqLE9haL = true;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02 = this.f7603lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r02 != null) {
            zzkhbgvufsk4aex3r02.lEeR5KfoEr4xU5yHH7(this);
        }
        if (this.f7605s3fjYDxWOUexjjVgyA) {
            this.f7606zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this);
            return;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = null;
        int i = 0;
        for (KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 : this.f7601e54J8UWNHWALQNixXM) {
            if (!(kYHag8HRDlnO3X9zmZ2 instanceof TCyPEKSzIyweCN5yp1)) {
                i++;
                kYHag8HRDlnO3X9zmZ = kYHag8HRDlnO3X9zmZ2;
            }
        }
        if (kYHag8HRDlnO3X9zmZ != null && i == 1 && kYHag8HRDlnO3X9zmZ.f7595Acstmh57AKoSEkEFNJ) {
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f7604pbVGzGjWvY2LDXC8vo;
            if (tCyPEKSzIyweCN5yp1 != null) {
                if (!tCyPEKSzIyweCN5yp1.f7595Acstmh57AKoSEkEFNJ) {
                    return;
                } else {
                    this.f7598KYHag8HRDlnO3X9zmZ = this.f7597IPyIQcaNa8aB7drBED * tCyPEKSzIyweCN5yp1.f7599TCyPEKSzIyweCN5yp1;
                }
            }
            zZKhbgvUfsK4AEX3r0(kYHag8HRDlnO3X9zmZ.f7599TCyPEKSzIyweCN5yp1 + this.f7598KYHag8HRDlnO3X9zmZ);
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r03 = this.f7603lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r03 != null) {
            zzkhbgvufsk4aex3r03.lEeR5KfoEr4xU5yHH7(this);
        }
    }

    public void s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f7600Z9WdNiOsPR0y54zHW4.add(zzkhbgvufsk4aex3r0);
        if (this.f7595Acstmh57AKoSEkEFNJ) {
            zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7606zZKhbgvUfsK4AEX3r0.f7624s3fjYDxWOUexjjVgyA.sTkWmhpZ5b1ArQIw4K());
        sb.append(":");
        sb.append(this.f7602husNiw3snxdgZPAGJm);
        sb.append("(");
        sb.append(this.f7595Acstmh57AKoSEkEFNJ ? Integer.valueOf(this.f7599TCyPEKSzIyweCN5yp1) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f7601e54J8UWNHWALQNixXM.size());
        sb.append(":d=");
        sb.append(this.f7600Z9WdNiOsPR0y54zHW4.size());
        sb.append(">");
        return sb.toString();
    }

    public void zZKhbgvUfsK4AEX3r0(int i) {
        if (this.f7595Acstmh57AKoSEkEFNJ) {
            return;
        }
        this.f7595Acstmh57AKoSEkEFNJ = true;
        this.f7599TCyPEKSzIyweCN5yp1 = i;
        for (zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 : this.f7600Z9WdNiOsPR0y54zHW4) {
            zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0);
        }
    }
}
