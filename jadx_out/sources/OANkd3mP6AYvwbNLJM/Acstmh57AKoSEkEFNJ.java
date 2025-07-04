package OANkd3mP6AYvwbNLJM;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Acstmh57AKoSEkEFNJ extends husNiw3snxdgZPAGJm implements pbVGzGjWvY2LDXC8vo {

    /* renamed from: yL2E9nlEZpg8ZZx8XE, reason: collision with root package name */
    public husNiw3snxdgZPAGJm[] f965yL2E9nlEZpg8ZZx8XE = new husNiw3snxdgZPAGJm[4];

    /* renamed from: Fo9071MN8vwEWamAUX, reason: collision with root package name */
    public int f964Fo9071MN8vwEWamAUX = 0;

    @Override // OANkd3mP6AYvwbNLJM.pbVGzGjWvY2LDXC8vo
    public void lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        if (husniw3snxdgzpagjm == this || husniw3snxdgzpagjm == null) {
            return;
        }
        int i = this.f964Fo9071MN8vwEWamAUX + 1;
        husNiw3snxdgZPAGJm[] husniw3snxdgzpagjmArr = this.f965yL2E9nlEZpg8ZZx8XE;
        if (i > husniw3snxdgzpagjmArr.length) {
            this.f965yL2E9nlEZpg8ZZx8XE = (husNiw3snxdgZPAGJm[]) Arrays.copyOf(husniw3snxdgzpagjmArr, husniw3snxdgzpagjmArr.length * 2);
        }
        husNiw3snxdgZPAGJm[] husniw3snxdgzpagjmArr2 = this.f965yL2E9nlEZpg8ZZx8XE;
        int i2 = this.f964Fo9071MN8vwEWamAUX;
        husniw3snxdgzpagjmArr2[i2] = husniw3snxdgzpagjm;
        this.f964Fo9071MN8vwEWamAUX = i2 + 1;
    }

    @Override // OANkd3mP6AYvwbNLJM.pbVGzGjWvY2LDXC8vo
    public void s3fjYDxWOUexjjVgyA() {
        this.f964Fo9071MN8vwEWamAUX = 0;
        Arrays.fill(this.f965yL2E9nlEZpg8ZZx8XE, (Object) null);
    }

    @Override // OANkd3mP6AYvwbNLJM.pbVGzGjWvY2LDXC8vo
    public void HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
    }
}
