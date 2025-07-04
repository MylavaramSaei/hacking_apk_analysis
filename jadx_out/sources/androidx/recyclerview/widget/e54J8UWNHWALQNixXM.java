package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class e54J8UWNHWALQNixXM {
    public static int HJFh0TGMpafqLE9haL(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, View view, View view2, RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, boolean z) {
        if (apygsiylzvnkpt1bls.lLKzvdU99Iw80uVD5I() == 0 || wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        }
        return (int) (((pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0(view2) - pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(view)) / (Math.abs(apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view) - apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2)) + 1)) * wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA());
    }

    public static int lEeR5KfoEr4xU5yHH7(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, View view, View view2, RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, boolean z) {
        if (apygsiylzvnkpt1bls.lLKzvdU99Iw80uVD5I() == 0 || wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view) - apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2)) + 1;
        }
        return Math.min(pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da(), pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0(view2) - pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(view));
    }

    public static int s3fjYDxWOUexjjVgyA(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, View view, View view2, RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, boolean z, boolean z2) {
        if (apygsiylzvnkpt1bls.lLKzvdU99Iw80uVD5I() == 0 || wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - Math.max(apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view), apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2))) - 1) : Math.max(0, Math.min(apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view), apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0(view2) - pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(view)) / (Math.abs(apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view) - apygsiylzvnkpt1bls.FtYx4GXtxwA8al5hBy(view2)) + 1))) + (pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C() - pbvgzgjwvy2ldxc8vo.TCyPEKSzIyweCN5yp1(view)));
        }
        return iMax;
    }
}
