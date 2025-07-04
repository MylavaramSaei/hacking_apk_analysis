package zaq8hOURtfwbcX17cG;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL extends T9PhQIpGRhE4yZDm1C {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public ArrayList f7593Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f7594e54J8UWNHWALQNixXM;

    public HJFh0TGMpafqLE9haL(OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, int i) {
        super(husniw3snxdgzpagjm);
        this.f7593Z9WdNiOsPR0y54zHW4 = new ArrayList();
        this.f7619KYHag8HRDlnO3X9zmZ = i;
        zaq8hOURtfwbcX17cG();
    }

    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C
    public long Acstmh57AKoSEkEFNJ() {
        int size = this.f7593Z9WdNiOsPR0y54zHW4.size();
        long jAcstmh57AKoSEkEFNJ = 0;
        for (int i = 0; i < size; i++) {
            jAcstmh57AKoSEkEFNJ = jAcstmh57AKoSEkEFNJ + r4.f7618IPyIQcaNa8aB7drBED.f7598KYHag8HRDlnO3X9zmZ + ((T9PhQIpGRhE4yZDm1C) this.f7593Z9WdNiOsPR0y54zHW4.get(i)).Acstmh57AKoSEkEFNJ() + r4.f7623pbVGzGjWvY2LDXC8vo.f7598KYHag8HRDlnO3X9zmZ;
        }
        return jAcstmh57AKoSEkEFNJ;
    }

    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C
    public void KYHag8HRDlnO3X9zmZ() {
        this.f7617HJFh0TGMpafqLE9haL = null;
        Iterator it = this.f7593Z9WdNiOsPR0y54zHW4.iterator();
        while (it.hasNext()) {
            ((T9PhQIpGRhE4yZDm1C) it.next()).KYHag8HRDlnO3X9zmZ();
        }
    }

    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C
    public boolean T9PhQIpGRhE4yZDm1C() {
        int size = this.f7593Z9WdNiOsPR0y54zHW4.size();
        for (int i = 0; i < size; i++) {
            if (!((T9PhQIpGRhE4yZDm1C) this.f7593Z9WdNiOsPR0y54zHW4.get(i)).T9PhQIpGRhE4yZDm1C()) {
                return false;
            }
        }
        return true;
    }

    public final OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm Y43RdunnpKgpbny0lE() {
        for (int size = this.f7593Z9WdNiOsPR0y54zHW4.size() - 1; size >= 0; size--) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) this.f7593Z9WdNiOsPR0y54zHW4.get(size);
            if (t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA.lLKzvdU99Iw80uVD5I() != 8) {
                return t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA;
            }
        }
        return null;
    }

    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C
    public void husNiw3snxdgZPAGJm() {
        for (int i = 0; i < this.f7593Z9WdNiOsPR0y54zHW4.size(); i++) {
            ((T9PhQIpGRhE4yZDm1C) this.f7593Z9WdNiOsPR0y54zHW4.get(i)).husNiw3snxdgZPAGJm();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01cf A[PHI: r1 r22 r23 r24
      0x01cf: PHI (r1v52 int) = (r1v50 int), (r1v58 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C, zaq8hOURtfwbcX17cG.zZKhbgvUfsK4AEX3r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lEeR5KfoEr4xU5yHH7(zaq8hOURtfwbcX17cG.zZKhbgvUfsK4AEX3r0 r26) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zaq8hOURtfwbcX17cG.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(zaq8hOURtfwbcX17cG.zZKhbgvUfsK4AEX3r0):void");
    }

    public final OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm sTkWmhpZ5b1ArQIw4K() {
        for (int i = 0; i < this.f7593Z9WdNiOsPR0y54zHW4.size(); i++) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) this.f7593Z9WdNiOsPR0y54zHW4.get(i);
            if (t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA.lLKzvdU99Iw80uVD5I() != 8) {
                return t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f7619KYHag8HRDlnO3X9zmZ == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator it = this.f7593Z9WdNiOsPR0y54zHW4.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((T9PhQIpGRhE4yZDm1C) it.next())) + "> ";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ) = (r1v2 zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ), (r1v7 zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zZKhbgvUfsK4AEX3r0() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f7593Z9WdNiOsPR0y54zHW4
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C r1 = (zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C) r1
            r1.zZKhbgvUfsK4AEX3r0()
            goto L6
        L16:
            java.util.ArrayList r0 = r5.f7593Z9WdNiOsPR0y54zHW4
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList r2 = r5.f7593Z9WdNiOsPR0y54zHW4
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C r2 = (zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C) r2
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r2 = r2.f7624s3fjYDxWOUexjjVgyA
            java.util.ArrayList r4 = r5.f7593Z9WdNiOsPR0y54zHW4
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C r0 = (zaq8hOURtfwbcX17cG.T9PhQIpGRhE4yZDm1C) r0
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r0 = r0.f7624s3fjYDxWOUexjjVgyA
            int r4 = r5.f7619KYHag8HRDlnO3X9zmZ
            if (r4 != 0) goto L70
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r1 = r2.f1117ao3wqKm5CXFuvC0q47
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r0 = r0.f1131jCtUeU2YI1poCxWcjm
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r2 = r5.pbVGzGjWvY2LDXC8vo(r1, r3)
            int r1 = r1.HJFh0TGMpafqLE9haL()
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r4 = r5.sTkWmhpZ5b1ArQIw4K()
            if (r4 == 0) goto L52
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r1 = r4.f1117ao3wqKm5CXFuvC0q47
            int r1 = r1.HJFh0TGMpafqLE9haL()
        L52:
            if (r2 == 0) goto L59
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r4 = r5.f7618IPyIQcaNa8aB7drBED
            r5.s3fjYDxWOUexjjVgyA(r4, r2, r1)
        L59:
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r1 = r5.pbVGzGjWvY2LDXC8vo(r0, r3)
            int r0 = r0.HJFh0TGMpafqLE9haL()
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r2 = r5.Y43RdunnpKgpbny0lE()
            if (r2 == 0) goto L6d
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r0 = r2.f1131jCtUeU2YI1poCxWcjm
            int r0 = r0.HJFh0TGMpafqLE9haL()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r2 = r2.f1095OUd9THiLjZndMj0qdF
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r0 = r0.f1110XzJ1BS7H9Ilbkv4eVM
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r3 = r5.pbVGzGjWvY2LDXC8vo(r2, r1)
            int r2 = r2.HJFh0TGMpafqLE9haL()
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r4 = r5.sTkWmhpZ5b1ArQIw4K()
            if (r4 == 0) goto L88
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r2 = r4.f1095OUd9THiLjZndMj0qdF
            int r2 = r2.HJFh0TGMpafqLE9haL()
        L88:
            if (r3 == 0) goto L8f
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r4 = r5.f7618IPyIQcaNa8aB7drBED
            r5.s3fjYDxWOUexjjVgyA(r4, r3, r2)
        L8f:
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r1 = r5.pbVGzGjWvY2LDXC8vo(r0, r1)
            int r0 = r0.HJFh0TGMpafqLE9haL()
            OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r2 = r5.Y43RdunnpKgpbny0lE()
            if (r2 == 0) goto La3
            OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0 r0 = r2.f1110XzJ1BS7H9Ilbkv4eVM
            int r0 = r0.HJFh0TGMpafqLE9haL()
        La3:
            if (r1 == 0) goto Lab
        La5:
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r2 = r5.f7623pbVGzGjWvY2LDXC8vo
            int r0 = -r0
            r5.s3fjYDxWOUexjjVgyA(r2, r1, r0)
        Lab:
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r0 = r5.f7618IPyIQcaNa8aB7drBED
            r0.f7603lEeR5KfoEr4xU5yHH7 = r5
            zaq8hOURtfwbcX17cG.KYHag8HRDlnO3X9zmZ r0 = r5.f7623pbVGzGjWvY2LDXC8vo
            r0.f7603lEeR5KfoEr4xU5yHH7 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zaq8hOURtfwbcX17cG.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0():void");
    }

    public final void zaq8hOURtfwbcX17cG() {
        OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmOqIo5QF00RDxUQb4qq = this.f7624s3fjYDxWOUexjjVgyA;
        do {
            husniw3snxdgzpagjm = husniw3snxdgzpagjmOqIo5QF00RDxUQb4qq;
            husniw3snxdgzpagjmOqIo5QF00RDxUQb4qq = husniw3snxdgzpagjmOqIo5QF00RDxUQb4qq.OqIo5QF00RDxUQb4qq(this.f7619KYHag8HRDlnO3X9zmZ);
        } while (husniw3snxdgzpagjmOqIo5QF00RDxUQb4qq != null);
        this.f7624s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm;
        this.f7593Z9WdNiOsPR0y54zHW4.add(husniw3snxdgzpagjm.DfpieXfdYs58yZAiXY(this.f7619KYHag8HRDlnO3X9zmZ));
        OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmTXWeW0sqVddf7ZBflq = husniw3snxdgzpagjm.tXWeW0sqVddf7ZBflq(this.f7619KYHag8HRDlnO3X9zmZ);
        while (husniw3snxdgzpagjmTXWeW0sqVddf7ZBflq != null) {
            this.f7593Z9WdNiOsPR0y54zHW4.add(husniw3snxdgzpagjmTXWeW0sqVddf7ZBflq.DfpieXfdYs58yZAiXY(this.f7619KYHag8HRDlnO3X9zmZ));
            husniw3snxdgzpagjmTXWeW0sqVddf7ZBflq = husniw3snxdgzpagjmTXWeW0sqVddf7ZBflq.tXWeW0sqVddf7ZBflq(this.f7619KYHag8HRDlnO3X9zmZ);
        }
        Iterator it = this.f7593Z9WdNiOsPR0y54zHW4.iterator();
        while (it.hasNext()) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) it.next();
            int i = this.f7619KYHag8HRDlnO3X9zmZ;
            if (i == 0) {
                t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA.f1085HJFh0TGMpafqLE9haL = this;
            } else if (i == 1) {
                t9PhQIpGRhE4yZDm1C.f7624s3fjYDxWOUexjjVgyA.f1147zZKhbgvUfsK4AEX3r0 = this;
            }
        }
        if (this.f7619KYHag8HRDlnO3X9zmZ == 0 && ((OANkd3mP6AYvwbNLJM.KYHag8HRDlnO3X9zmZ) this.f7624s3fjYDxWOUexjjVgyA.W3RZ2dTDKrKpS5Mxdk()).LFGi8lLul9XOP250o9() && this.f7593Z9WdNiOsPR0y54zHW4.size() > 1) {
            ArrayList arrayList = this.f7593Z9WdNiOsPR0y54zHW4;
            this.f7624s3fjYDxWOUexjjVgyA = ((T9PhQIpGRhE4yZDm1C) arrayList.get(arrayList.size() - 1)).f7624s3fjYDxWOUexjjVgyA;
        }
        this.f7594e54J8UWNHWALQNixXM = this.f7619KYHag8HRDlnO3X9zmZ == 0 ? this.f7624s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP() : this.f7624s3fjYDxWOUexjjVgyA.KqgKJKIWne3kz1AdHk();
    }
}
