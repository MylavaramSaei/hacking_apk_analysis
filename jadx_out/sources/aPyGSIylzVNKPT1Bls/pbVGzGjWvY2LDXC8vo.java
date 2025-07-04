package aPyGSIylzVNKPT1Bls;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class pbVGzGjWvY2LDXC8vo {

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public static int f2348aPyGSIylzVNKPT1Bls = 1;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f2349Acstmh57AKoSEkEFNJ;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public float f2352KYHag8HRDlnO3X9zmZ;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2359lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public String f2361s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2350HJFh0TGMpafqLE9haL = -1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2362zZKhbgvUfsK4AEX3r0 = -1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f2358husNiw3snxdgZPAGJm = 0;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f2354TCyPEKSzIyweCN5yp1 = false;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public float[] f2351IPyIQcaNa8aB7drBED = new float[9];

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public float[] f2360pbVGzGjWvY2LDXC8vo = new float[9];

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA[] f2355Z9WdNiOsPR0y54zHW4 = new s3fjYDxWOUexjjVgyA[16];

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f2356e54J8UWNHWALQNixXM = 0;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f2353T9PhQIpGRhE4yZDm1C = 0;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public HashSet f2357hoXrIDAFrSwfShk8da = null;

    public enum lEeR5KfoEr4xU5yHH7 {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public pbVGzGjWvY2LDXC8vo(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, String str) {
        this.f2349Acstmh57AKoSEkEFNJ = leer5kfoer4xu5yhh7;
    }

    public static void s3fjYDxWOUexjjVgyA() {
        f2348aPyGSIylzVNKPT1Bls++;
    }

    public final void HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i = this.f2356e54J8UWNHWALQNixXM;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2355Z9WdNiOsPR0y54zHW4[i2] == s3fjydxwouexjjvgya) {
                while (i2 < i - 1) {
                    s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = this.f2355Z9WdNiOsPR0y54zHW4;
                    int i3 = i2 + 1;
                    s3fjydxwouexjjvgyaArr[i2] = s3fjydxwouexjjvgyaArr[i3];
                    i2 = i3;
                }
                this.f2356e54J8UWNHWALQNixXM--;
                return;
            }
            i2++;
        }
    }

    public void KYHag8HRDlnO3X9zmZ(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, String str) {
        this.f2349Acstmh57AKoSEkEFNJ = leer5kfoer4xu5yhh7;
    }

    public final void TCyPEKSzIyweCN5yp1(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i = this.f2356e54J8UWNHWALQNixXM;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2355Z9WdNiOsPR0y54zHW4[i2].OUd9THiLjZndMj0qdF(s3fjydxwouexjjvgya, false);
        }
        this.f2356e54J8UWNHWALQNixXM = 0;
    }

    public void husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, float f) {
        this.f2352KYHag8HRDlnO3X9zmZ = f;
        this.f2354TCyPEKSzIyweCN5yp1 = true;
        int i = this.f2356e54J8UWNHWALQNixXM;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2355Z9WdNiOsPR0y54zHW4[i2].ao3wqKm5CXFuvC0q47(zzkhbgvufsk4aex3r0, this, false);
        }
        this.f2356e54J8UWNHWALQNixXM = 0;
    }

    public final void lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i = 0;
        while (true) {
            int i2 = this.f2356e54J8UWNHWALQNixXM;
            if (i >= i2) {
                s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = this.f2355Z9WdNiOsPR0y54zHW4;
                if (i2 >= s3fjydxwouexjjvgyaArr.length) {
                    this.f2355Z9WdNiOsPR0y54zHW4 = (s3fjYDxWOUexjjVgyA[]) Arrays.copyOf(s3fjydxwouexjjvgyaArr, s3fjydxwouexjjvgyaArr.length * 2);
                }
                s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr2 = this.f2355Z9WdNiOsPR0y54zHW4;
                int i3 = this.f2356e54J8UWNHWALQNixXM;
                s3fjydxwouexjjvgyaArr2[i3] = s3fjydxwouexjjvgya;
                this.f2356e54J8UWNHWALQNixXM = i3 + 1;
                return;
            }
            if (this.f2355Z9WdNiOsPR0y54zHW4[i] == s3fjydxwouexjjvgya) {
                return;
            } else {
                i++;
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.f2361s3fjYDxWOUexjjVgyA != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2361s3fjYDxWOUexjjVgyA);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2350HJFh0TGMpafqLE9haL);
        }
        return sb.toString();
    }

    public void zZKhbgvUfsK4AEX3r0() {
        this.f2361s3fjYDxWOUexjjVgyA = null;
        this.f2349Acstmh57AKoSEkEFNJ = lEeR5KfoEr4xU5yHH7.UNKNOWN;
        this.f2358husNiw3snxdgZPAGJm = 0;
        this.f2350HJFh0TGMpafqLE9haL = -1;
        this.f2362zZKhbgvUfsK4AEX3r0 = -1;
        this.f2352KYHag8HRDlnO3X9zmZ = 0.0f;
        this.f2354TCyPEKSzIyweCN5yp1 = false;
        int i = this.f2356e54J8UWNHWALQNixXM;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2355Z9WdNiOsPR0y54zHW4[i2] = null;
        }
        this.f2356e54J8UWNHWALQNixXM = 0;
        this.f2353T9PhQIpGRhE4yZDm1C = 0;
        this.f2359lEeR5KfoEr4xU5yHH7 = false;
        Arrays.fill(this.f2360pbVGzGjWvY2LDXC8vo, 0.0f);
    }
}
