package androidx.fragment.app;

import OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7;
import W3RZ2dTDKrKpS5Mxdk.YlLW4G6OV9TFyuw5ix;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.TCyPEKSzIyweCN5yp1;
import androidx.fragment.app.XzJ1BS7H9Ilbkv4eVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 extends XzJ1BS7H9Ilbkv4eVM {

    public class Acstmh57AKoSEkEFNJ implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ T9PhQIpGRhE4yZDm1C f3664lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3665s3fjYDxWOUexjjVgyA;

        public Acstmh57AKoSEkEFNJ(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f3664lEeR5KfoEr4xU5yHH7 = t9PhQIpGRhE4yZDm1C;
            this.f3665s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3664lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f3665s3fjYDxWOUexjjVgyA + "has completed");
            }
        }
    }

    public class HJFh0TGMpafqLE9haL extends AnimatorListenerAdapter {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ boolean f3666HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4 f3668husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3669lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ View f3670s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3671zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(ViewGroup viewGroup, View view, boolean z, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            this.f3669lEeR5KfoEr4xU5yHH7 = viewGroup;
            this.f3670s3fjYDxWOUexjjVgyA = view;
            this.f3666HJFh0TGMpafqLE9haL = z;
            this.f3671zZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm;
            this.f3668husNiw3snxdgZPAGJm = z9WdNiOsPR0y54zHW4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3669lEeR5KfoEr4xU5yHH7.endViewTransition(this.f3670s3fjYDxWOUexjjVgyA);
            if (this.f3666HJFh0TGMpafqLE9haL) {
                this.f3671zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7(this.f3670s3fjYDxWOUexjjVgyA);
            }
            this.f3668husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3671zZKhbgvUfsK4AEX3r0 + " has ended.");
            }
        }
    }

    public class IPyIQcaNa8aB7drBED implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ Rect f3672HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ao3wqKm5CXFuvC0q47 f3673lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ View f3674s3fjYDxWOUexjjVgyA;

        public IPyIQcaNa8aB7drBED(ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47, View view, Rect rect) {
            this.f3673lEeR5KfoEr4xU5yHH7 = ao3wqkm5cxfuvc0q47;
            this.f3674s3fjYDxWOUexjjVgyA = view;
            this.f3672HJFh0TGMpafqLE9haL = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3673lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(this.f3674s3fjYDxWOUexjjVgyA, this.f3672HJFh0TGMpafqLE9haL);
        }
    }

    public class KYHag8HRDlnO3X9zmZ implements lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4 f3676HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ View f3678lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3679s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3680zZKhbgvUfsK4AEX3r0;

        public KYHag8HRDlnO3X9zmZ(View view, ViewGroup viewGroup, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f3678lEeR5KfoEr4xU5yHH7 = view;
            this.f3679s3fjYDxWOUexjjVgyA = viewGroup;
            this.f3676HJFh0TGMpafqLE9haL = z9WdNiOsPR0y54zHW4;
            this.f3680zZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm;
        }

        @Override // OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7() {
            this.f3678lEeR5KfoEr4xU5yHH7.clearAnimation();
            this.f3679s3fjYDxWOUexjjVgyA.endViewTransition(this.f3678lEeR5KfoEr4xU5yHH7);
            this.f3676HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3680zZKhbgvUfsK4AEX3r0 + " has been cancelled.");
            }
        }
    }

    public static class T9PhQIpGRhE4yZDm1C extends e54J8UWNHWALQNixXM {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Object f3681HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final Object f3682husNiw3snxdgZPAGJm;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final boolean f3683zZKhbgvUfsK4AEX3r0;

        public T9PhQIpGRhE4yZDm1C(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, boolean z, boolean z2) {
            boolean zE54J8UWNHWALQNixXM;
            Object objDfpieXfdYs58yZAiXY;
            super(husniw3snxdgzpagjm, leer5kfoer4xu5yhh7);
            if (husniw3snxdgzpagjm.husNiw3snxdgZPAGJm() == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE) {
                Fragment fragmentKYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ();
                this.f3681HJFh0TGMpafqLE9haL = z ? fragmentKYHag8HRDlnO3X9zmZ.tXWeW0sqVddf7ZBflq() : fragmentKYHag8HRDlnO3X9zmZ.zaq8hOURtfwbcX17cG();
                Fragment fragmentKYHag8HRDlnO3X9zmZ2 = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ();
                zE54J8UWNHWALQNixXM = z ? fragmentKYHag8HRDlnO3X9zmZ2.e54J8UWNHWALQNixXM() : fragmentKYHag8HRDlnO3X9zmZ2.Z9WdNiOsPR0y54zHW4();
            } else {
                Fragment fragmentKYHag8HRDlnO3X9zmZ3 = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ();
                this.f3681HJFh0TGMpafqLE9haL = z ? fragmentKYHag8HRDlnO3X9zmZ3.OqIo5QF00RDxUQb4qq() : fragmentKYHag8HRDlnO3X9zmZ3.R9SAhYMerGybF9OAjL();
                zE54J8UWNHWALQNixXM = true;
            }
            this.f3683zZKhbgvUfsK4AEX3r0 = zE54J8UWNHWALQNixXM;
            if (z2) {
                Fragment fragmentKYHag8HRDlnO3X9zmZ4 = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ();
                objDfpieXfdYs58yZAiXY = z ? fragmentKYHag8HRDlnO3X9zmZ4.DfpieXfdYs58yZAiXY() : fragmentKYHag8HRDlnO3X9zmZ4.GyWRxpdt1T8mEJXPoD();
            } else {
                objDfpieXfdYs58yZAiXY = null;
            }
            this.f3682husNiw3snxdgZPAGJm = objDfpieXfdYs58yZAiXY;
        }

        public boolean Acstmh57AKoSEkEFNJ() {
            return this.f3683zZKhbgvUfsK4AEX3r0;
        }

        public Object IPyIQcaNa8aB7drBED() {
            return this.f3681HJFh0TGMpafqLE9haL;
        }

        public final ao3wqKm5CXFuvC0q47 KYHag8HRDlnO3X9zmZ(Object obj) {
            if (obj == null) {
                return null;
            }
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = WWC27LAMFqFFBzfbNw.f3557lEeR5KfoEr4xU5yHH7;
            if (ao3wqkm5cxfuvc0q47 != null && ao3wqkm5cxfuvc0q47.husNiw3snxdgZPAGJm(obj)) {
                return ao3wqkm5cxfuvc0q47;
            }
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q472 = WWC27LAMFqFFBzfbNw.f3558s3fjYDxWOUexjjVgyA;
            if (ao3wqkm5cxfuvc0q472 != null && ao3wqkm5cxfuvc0q472.husNiw3snxdgZPAGJm(obj)) {
                return ao3wqkm5cxfuvc0q472;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object TCyPEKSzIyweCN5yp1() {
            return this.f3682husNiw3snxdgZPAGJm;
        }

        public ao3wqKm5CXFuvC0q47 husNiw3snxdgZPAGJm() {
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(this.f3681HJFh0TGMpafqLE9haL);
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ2 = KYHag8HRDlnO3X9zmZ(this.f3682husNiw3snxdgZPAGJm);
            if (ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ == null || ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ2 == null || ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ == ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ2) {
                return ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ != null ? ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ : ao3wqkm5cxfuvc0q47KYHag8HRDlnO3X9zmZ2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ() + " returned Transition " + this.f3681HJFh0TGMpafqLE9haL + " which uses a different Transition  type than its shared element transition " + this.f3682husNiw3snxdgZPAGJm);
        }

        public boolean pbVGzGjWvY2LDXC8vo() {
            return this.f3682husNiw3snxdgZPAGJm != null;
        }
    }

    public class TCyPEKSzIyweCN5yp1 implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ boolean f3684HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3686lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3687s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 f3688zZKhbgvUfsK4AEX3r0;

        public TCyPEKSzIyweCN5yp1(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm2, boolean z, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f3686lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
            this.f3687s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm2;
            this.f3684HJFh0TGMpafqLE9haL = z;
            this.f3688zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
        }

        @Override // java.lang.Runnable
        public void run() {
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7(this.f3686lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(), this.f3687s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(), this.f3684HJFh0TGMpafqLE9haL, this.f3688zZKhbgvUfsK4AEX3r0, false);
        }
    }

    public static class Z9WdNiOsPR0y54zHW4 extends e54J8UWNHWALQNixXM {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f3689HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f3690husNiw3snxdgZPAGJm;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f3691zZKhbgvUfsK4AEX3r0;

        public Z9WdNiOsPR0y54zHW4(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, boolean z) {
            super(husniw3snxdgzpagjm, leer5kfoer4xu5yhh7);
            this.f3691zZKhbgvUfsK4AEX3r0 = false;
            this.f3689HJFh0TGMpafqLE9haL = z;
        }

        public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(Context context) throws Resources.NotFoundException {
            if (this.f3691zZKhbgvUfsK4AEX3r0) {
                return this.f3690husNiw3snxdgZPAGJm;
            }
            TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = androidx.fragment.app.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(context, s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ(), s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm() == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE, this.f3689HJFh0TGMpafqLE9haL);
            this.f3690husNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA;
            this.f3691zZKhbgvUfsK4AEX3r0 = true;
            return leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA;
        }
    }

    public static class e54J8UWNHWALQNixXM {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3692lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 f3693s3fjYDxWOUexjjVgyA;

        public e54J8UWNHWALQNixXM(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f3692lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
            this.f3693s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
        }

        public OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL() {
            return this.f3693s3fjYDxWOUexjjVgyA;
        }

        public void lEeR5KfoEr4xU5yHH7() {
            this.f3692lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f3693s3fjYDxWOUexjjVgyA);
        }

        public XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm s3fjYDxWOUexjjVgyA() {
            return this.f3692lEeR5KfoEr4xU5yHH7;
        }

        public boolean zZKhbgvUfsK4AEX3r0() {
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL2 = XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(this.f3692lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm = this.f3692lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm();
            return HJFh0TGMpafqLE9haL2 == hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm || !(HJFh0TGMpafqLE9haL2 == (hJFh0TGMpafqLE9haL = XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE) || hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm == hJFh0TGMpafqLE9haL);
        }
    }

    public class husNiw3snxdgZPAGJm implements Animation.AnimationListener {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ View f3694HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3696lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3697s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4 f3698zZKhbgvUfsK4AEX3r0;

        public class lEeR5KfoEr4xU5yHH7 implements Runnable {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // java.lang.Runnable
            public void run() {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = husNiw3snxdgZPAGJm.this;
                husniw3snxdgzpagjm.f3697s3fjYDxWOUexjjVgyA.endViewTransition(husniw3snxdgzpagjm.f3694HJFh0TGMpafqLE9haL);
                husNiw3snxdgZPAGJm.this.f3698zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
            }
        }

        public husNiw3snxdgZPAGJm(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, ViewGroup viewGroup, View view, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            this.f3696lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
            this.f3697s3fjYDxWOUexjjVgyA = viewGroup;
            this.f3694HJFh0TGMpafqLE9haL = view;
            this.f3698zZKhbgvUfsK4AEX3r0 = z9WdNiOsPR0y54zHW4;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3697s3fjYDxWOUexjjVgyA.post(new lEeR5KfoEr4xU5yHH7());
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3696lEeR5KfoEr4xU5yHH7 + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3696lEeR5KfoEr4xU5yHH7 + " has reached onAnimationStart.");
            }
        }
    }

    public static /* synthetic */ class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f3700lEeR5KfoEr4xU5yHH7;

        static {
            int[] iArr = new int[XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.values().length];
            f3700lEeR5KfoEr4xU5yHH7 = iArr;
            try {
                iArr[XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3700lEeR5KfoEr4xU5yHH7[XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3700lEeR5KfoEr4xU5yHH7[XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3700lEeR5KfoEr4xU5yHH7[XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class pbVGzGjWvY2LDXC8vo implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3701lEeR5KfoEr4xU5yHH7;

        public pbVGzGjWvY2LDXC8vo(ArrayList arrayList) {
            this.f3701lEeR5KfoEr4xU5yHH7 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            WWC27LAMFqFFBzfbNw.zZKhbgvUfsK4AEX3r0(this.f3701lEeR5KfoEr4xU5yHH7, 4);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ List f3704lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3705s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(List list, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f3704lEeR5KfoEr4xU5yHH7 = list;
            this.f3705s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3704lEeR5KfoEr4xU5yHH7.contains(this.f3705s3fjYDxWOUexjjVgyA)) {
                this.f3704lEeR5KfoEr4xU5yHH7.remove(this.f3705s3fjYDxWOUexjjVgyA);
                zZKhbgvUfsK4AEX3r0.this.Y43RdunnpKgpbny0lE(this.f3705s3fjYDxWOUexjjVgyA);
            }
        }
    }

    /* renamed from: androidx.fragment.app.zZKhbgvUfsK4AEX3r0$zZKhbgvUfsK4AEX3r0, reason: collision with other inner class name */
    public class C0041zZKhbgvUfsK4AEX3r0 implements lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Animator f3707lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm f3708s3fjYDxWOUexjjVgyA;

        public C0041zZKhbgvUfsK4AEX3r0(Animator animator, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f3707lEeR5KfoEr4xU5yHH7 = animator;
            this.f3708s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm;
        }

        @Override // OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7() {
            this.f3707lEeR5KfoEr4xU5yHH7.end();
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3708s3fjYDxWOUexjjVgyA + " has been canceled.");
            }
        }
    }

    public zZKhbgvUfsK4AEX3r0(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public final Map A49QRPHynYLCBN0SqP(List list, List list2, boolean z, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashMap map;
        View view2;
        Object objZ9WdNiOsPR0y54zHW4;
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        ArrayList arrayList3;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm3;
        ArrayList arrayList4;
        Rect rect;
        ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47;
        HashMap map2;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm4;
        View view3;
        View view4;
        View view5;
        boolean z2 = z;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm5 = husniw3snxdgzpagjm;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm6 = husniw3snxdgzpagjm2;
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q472 = null;
        while (it.hasNext()) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) it.next();
            if (!t9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0()) {
                ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47HusNiw3snxdgZPAGJm = t9PhQIpGRhE4yZDm1C.husNiw3snxdgZPAGJm();
                if (ao3wqkm5cxfuvc0q472 == null) {
                    ao3wqkm5cxfuvc0q472 = ao3wqkm5cxfuvc0q47HusNiw3snxdgZPAGJm;
                } else if (ao3wqkm5cxfuvc0q47HusNiw3snxdgZPAGJm != null && ao3wqkm5cxfuvc0q472 != ao3wqkm5cxfuvc0q47HusNiw3snxdgZPAGJm) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + t9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ() + " returned Transition " + t9PhQIpGRhE4yZDm1C.IPyIQcaNa8aB7drBED() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (ao3wqkm5cxfuvc0q472 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C2 = (T9PhQIpGRhE4yZDm1C) it2.next();
                map3.put(t9PhQIpGRhE4yZDm1C2.s3fjYDxWOUexjjVgyA(), Boolean.FALSE);
                t9PhQIpGRhE4yZDm1C2.lEeR5KfoEr4xU5yHH7();
            }
            return map3;
        }
        View view6 = new View(T9PhQIpGRhE4yZDm1C().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C3 = (T9PhQIpGRhE4yZDm1C) it3.next();
            if (!t9PhQIpGRhE4yZDm1C3.pbVGzGjWvY2LDXC8vo() || husniw3snxdgzpagjm5 == null || husniw3snxdgzpagjm6 == null) {
                leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh72;
                arrayList3 = arrayList6;
                husniw3snxdgzpagjm3 = husniw3snxdgzpagjm5;
                arrayList4 = arrayList5;
                rect = rect2;
                ao3wqkm5cxfuvc0q47 = ao3wqkm5cxfuvc0q472;
                map2 = map3;
                View view8 = view6;
                husniw3snxdgzpagjm4 = husniw3snxdgzpagjm6;
                view3 = view8;
                view7 = view7;
            } else {
                Object objG7AC3DWIx9i9fdanjk = ao3wqkm5cxfuvc0q472.G7AC3DWIx9i9fdanjk(ao3wqkm5cxfuvc0q472.KYHag8HRDlnO3X9zmZ(t9PhQIpGRhE4yZDm1C3.TCyPEKSzIyweCN5yp1()));
                ArrayList arrayListE2F9F6h8YJxTHwLCa0 = husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ().e2F9F6h8YJxTHwLCa0();
                ArrayList arrayListE2F9F6h8YJxTHwLCa02 = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().e2F9F6h8YJxTHwLCa0();
                ArrayList arrayListKqgKJKIWne3kz1AdHk = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().KqgKJKIWne3kz1AdHk();
                View view9 = view7;
                int i = 0;
                while (i < arrayListKqgKJKIWne3kz1AdHk.size()) {
                    int iIndexOf = arrayListE2F9F6h8YJxTHwLCa0.indexOf(arrayListKqgKJKIWne3kz1AdHk.get(i));
                    ArrayList arrayList7 = arrayListKqgKJKIWne3kz1AdHk;
                    if (iIndexOf != -1) {
                        arrayListE2F9F6h8YJxTHwLCa0.set(iIndexOf, (String) arrayListE2F9F6h8YJxTHwLCa02.get(i));
                    }
                    i++;
                    arrayListKqgKJKIWne3kz1AdHk = arrayList7;
                }
                ArrayList arrayListKqgKJKIWne3kz1AdHk2 = husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ().KqgKJKIWne3kz1AdHk();
                Fragment fragmentKYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ();
                if (z2) {
                    fragmentKYHag8HRDlnO3X9zmZ.sTkWmhpZ5b1ArQIw4K();
                    husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ().G7AC3DWIx9i9fdanjk();
                } else {
                    fragmentKYHag8HRDlnO3X9zmZ.G7AC3DWIx9i9fdanjk();
                    husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ().sTkWmhpZ5b1ArQIw4K();
                }
                int i2 = 0;
                for (int size = arrayListE2F9F6h8YJxTHwLCa0.size(); i2 < size; size = size) {
                    leer5kfoer4xu5yhh72.put((String) arrayListE2F9F6h8YJxTHwLCa0.get(i2), (String) arrayListKqgKJKIWne3kz1AdHk2.get(i2));
                    i2++;
                }
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it4 = arrayListKqgKJKIWne3kz1AdHk2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it5 = arrayListE2F9F6h8YJxTHwLCa0.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + ((String) it5.next()));
                    }
                }
                Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
                G7AC3DWIx9i9fdanjk(leer5kfoer4xu5yhh73, husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
                leer5kfoer4xu5yhh73.aPyGSIylzVNKPT1Bls(arrayListE2F9F6h8YJxTHwLCa0);
                leer5kfoer4xu5yhh72.aPyGSIylzVNKPT1Bls(leer5kfoer4xu5yhh73.keySet());
                Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh74 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
                G7AC3DWIx9i9fdanjk(leer5kfoer4xu5yhh74, husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
                leer5kfoer4xu5yhh74.aPyGSIylzVNKPT1Bls(arrayListKqgKJKIWne3kz1AdHk2);
                leer5kfoer4xu5yhh74.aPyGSIylzVNKPT1Bls(leer5kfoer4xu5yhh72.values());
                WWC27LAMFqFFBzfbNw.HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh72, leer5kfoer4xu5yhh74);
                xHA29AmDt6y96AnB3t(leer5kfoer4xu5yhh73, leer5kfoer4xu5yhh72.keySet());
                xHA29AmDt6y96AnB3t(leer5kfoer4xu5yhh74, leer5kfoer4xu5yhh72.values());
                if (leer5kfoer4xu5yhh72.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh72;
                    arrayList3 = arrayList6;
                    husniw3snxdgzpagjm3 = husniw3snxdgzpagjm5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    ao3wqkm5cxfuvc0q47 = ao3wqkm5cxfuvc0q472;
                    view7 = view9;
                    obj3 = null;
                    husniw3snxdgzpagjm4 = husniw3snxdgzpagjm2;
                    map2 = map3;
                } else {
                    WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7(husniw3snxdgzpagjm2.KYHag8HRDlnO3X9zmZ(), husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ(), z2, leer5kfoer4xu5yhh73, true);
                    HashMap map4 = map3;
                    View view10 = view6;
                    leer5kfoer4xu5yhh7 = leer5kfoer4xu5yhh72;
                    ArrayList arrayList8 = arrayList6;
                    W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C(), new TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm2, husniw3snxdgzpagjm, z, leer5kfoer4xu5yhh74));
                    arrayList5.addAll(leer5kfoer4xu5yhh73.values());
                    if (arrayListE2F9F6h8YJxTHwLCa0.isEmpty()) {
                        view7 = view9;
                    } else {
                        view7 = (View) leer5kfoer4xu5yhh73.get((String) arrayListE2F9F6h8YJxTHwLCa0.get(0));
                        ao3wqkm5cxfuvc0q472.OANkd3mP6AYvwbNLJM(objG7AC3DWIx9i9fdanjk, view7);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(leer5kfoer4xu5yhh74.values());
                    if (arrayListKqgKJKIWne3kz1AdHk2.isEmpty() || (view5 = (View) leer5kfoer4xu5yhh74.get((String) arrayListKqgKJKIWne3kz1AdHk2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C(), new IPyIQcaNa8aB7drBED(ao3wqkm5cxfuvc0q472, view5, rect2));
                        view4 = view10;
                        z3 = true;
                    }
                    ao3wqkm5cxfuvc0q472.Y43RdunnpKgpbny0lE(objG7AC3DWIx9i9fdanjk, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    ao3wqkm5cxfuvc0q47 = ao3wqkm5cxfuvc0q472;
                    ao3wqkm5cxfuvc0q472.hoXrIDAFrSwfShk8da(objG7AC3DWIx9i9fdanjk, null, null, null, null, objG7AC3DWIx9i9fdanjk, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    husniw3snxdgzpagjm3 = husniw3snxdgzpagjm;
                    map2 = map4;
                    map2.put(husniw3snxdgzpagjm3, bool);
                    husniw3snxdgzpagjm4 = husniw3snxdgzpagjm2;
                    map2.put(husniw3snxdgzpagjm4, bool);
                    obj3 = objG7AC3DWIx9i9fdanjk;
                }
            }
            husniw3snxdgzpagjm5 = husniw3snxdgzpagjm3;
            arrayList5 = arrayList4;
            rect2 = rect;
            map3 = map2;
            leer5kfoer4xu5yhh72 = leer5kfoer4xu5yhh7;
            z2 = z;
            arrayList6 = arrayList3;
            ao3wqkm5cxfuvc0q472 = ao3wqkm5cxfuvc0q47;
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm7 = husniw3snxdgzpagjm4;
            view6 = view3;
            husniw3snxdgzpagjm6 = husniw3snxdgzpagjm7;
        }
        View view11 = view7;
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh75 = leer5kfoer4xu5yhh72;
        ArrayList arrayList9 = arrayList6;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm8 = husniw3snxdgzpagjm5;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q473 = ao3wqkm5cxfuvc0q472;
        HashMap map5 = map3;
        View view12 = view6;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm9 = husniw3snxdgzpagjm6;
        View view13 = view12;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object objZ9WdNiOsPR0y54zHW42 = null;
        while (it6.hasNext()) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C4 = (T9PhQIpGRhE4yZDm1C) it6.next();
            if (t9PhQIpGRhE4yZDm1C4.zZKhbgvUfsK4AEX3r0()) {
                map5.put(t9PhQIpGRhE4yZDm1C4.s3fjYDxWOUexjjVgyA(), Boolean.FALSE);
                t9PhQIpGRhE4yZDm1C4.lEeR5KfoEr4xU5yHH7();
            } else {
                Object objKYHag8HRDlnO3X9zmZ = ao3wqkm5cxfuvc0q473.KYHag8HRDlnO3X9zmZ(t9PhQIpGRhE4yZDm1C4.IPyIQcaNa8aB7drBED());
                XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA = t9PhQIpGRhE4yZDm1C4.s3fjYDxWOUexjjVgyA();
                boolean z4 = obj3 != null && (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA == husniw3snxdgzpagjm8 || husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA == husniw3snxdgzpagjm9);
                if (objKYHag8HRDlnO3X9zmZ == null) {
                    if (!z4) {
                        map5.put(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA, Boolean.FALSE);
                        t9PhQIpGRhE4yZDm1C4.lEeR5KfoEr4xU5yHH7();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view13;
                    objZ9WdNiOsPR0y54zHW4 = obj4;
                    map = map5;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj5 = obj4;
                    R9SAhYMerGybF9OAjL(arrayList12, husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
                    if (z4) {
                        if (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA == husniw3snxdgzpagjm8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        ao3wqkm5cxfuvc0q473.lEeR5KfoEr4xU5yHH7(objKYHag8HRDlnO3X9zmZ, view13);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view13;
                        obj2 = objZ9WdNiOsPR0y54zHW42;
                        map = map5;
                        obj = obj5;
                    } else {
                        ao3wqkm5cxfuvc0q473.s3fjYDxWOUexjjVgyA(objKYHag8HRDlnO3X9zmZ, arrayList12);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objZ9WdNiOsPR0y54zHW42;
                        arrayList2 = arrayList9;
                        map = map5;
                        ao3wqkm5cxfuvc0q473.hoXrIDAFrSwfShk8da(objKYHag8HRDlnO3X9zmZ, objKYHag8HRDlnO3X9zmZ, arrayList12, null, null, null, null);
                        if (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm() == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.GONE) {
                            list2.remove(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
                            ao3wqkm5cxfuvc0q473.T9PhQIpGRhE4yZDm1C(objKYHag8HRDlnO3X9zmZ, husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk, arrayList13);
                            W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C(), new pbVGzGjWvY2LDXC8vo(arrayList12));
                        }
                    }
                    if (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm() == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            ao3wqkm5cxfuvc0q473.aPyGSIylzVNKPT1Bls(objKYHag8HRDlnO3X9zmZ, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        ao3wqkm5cxfuvc0q473.OANkd3mP6AYvwbNLJM(objKYHag8HRDlnO3X9zmZ, view2);
                    }
                    map.put(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA, Boolean.TRUE);
                    if (t9PhQIpGRhE4yZDm1C4.Acstmh57AKoSEkEFNJ()) {
                        objZ9WdNiOsPR0y54zHW42 = ao3wqkm5cxfuvc0q473.Z9WdNiOsPR0y54zHW4(obj2, objKYHag8HRDlnO3X9zmZ, null);
                        objZ9WdNiOsPR0y54zHW4 = obj;
                    } else {
                        objZ9WdNiOsPR0y54zHW4 = ao3wqkm5cxfuvc0q473.Z9WdNiOsPR0y54zHW4(obj, objKYHag8HRDlnO3X9zmZ, null);
                        objZ9WdNiOsPR0y54zHW42 = obj2;
                    }
                }
                husniw3snxdgzpagjm9 = husniw3snxdgzpagjm2;
                map5 = map;
                obj4 = objZ9WdNiOsPR0y54zHW4;
                view11 = view2;
                str = str3;
                view13 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        String str4 = str;
        ArrayList arrayList15 = arrayList10;
        HashMap map6 = map5;
        Object objAcstmh57AKoSEkEFNJ = ao3wqkm5cxfuvc0q473.Acstmh57AKoSEkEFNJ(objZ9WdNiOsPR0y54zHW42, obj4, obj3);
        if (objAcstmh57AKoSEkEFNJ == null) {
            return map6;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C5 = (T9PhQIpGRhE4yZDm1C) it7.next();
            if (!t9PhQIpGRhE4yZDm1C5.zZKhbgvUfsK4AEX3r0()) {
                Object objIPyIQcaNa8aB7drBED = t9PhQIpGRhE4yZDm1C5.IPyIQcaNa8aB7drBED();
                XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2 = t9PhQIpGRhE4yZDm1C5.s3fjYDxWOUexjjVgyA();
                HashMap map7 = map6;
                boolean z5 = obj3 != null && (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2 == husniw3snxdgzpagjm8 || husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2 == husniw3snxdgzpagjm2);
                if (objIPyIQcaNa8aB7drBED == null && !z5) {
                    str2 = str4;
                } else if (lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(T9PhQIpGRhE4yZDm1C())) {
                    str2 = str4;
                    ao3wqkm5cxfuvc0q473.zaq8hOURtfwbcX17cG(t9PhQIpGRhE4yZDm1C5.s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ(), objAcstmh57AKoSEkEFNJ, t9PhQIpGRhE4yZDm1C5.HJFh0TGMpafqLE9haL(), new Acstmh57AKoSEkEFNJ(t9PhQIpGRhE4yZDm1C5, husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2));
                } else {
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + T9PhQIpGRhE4yZDm1C() + " has not been laid out. Completing operation " + husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2);
                    } else {
                        str2 = str4;
                    }
                    t9PhQIpGRhE4yZDm1C5.lEeR5KfoEr4xU5yHH7();
                }
                map6 = map7;
                str4 = str2;
            }
        }
        HashMap map8 = map6;
        String str5 = str4;
        if (!lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(T9PhQIpGRhE4yZDm1C())) {
            return map8;
        }
        WWC27LAMFqFFBzfbNw.zZKhbgvUfsK4AEX3r0(arrayList11, 4);
        ArrayList arrayListE54J8UWNHWALQNixXM = ao3wqkm5cxfuvc0q473.e54J8UWNHWALQNixXM(arrayList14);
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it8 = arrayList15.iterator();
            while (it8.hasNext()) {
                View view14 = (View) it8.next();
                Log.v(str5, "View: " + view14 + " Name: " + lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view14));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it9 = arrayList14.iterator();
            while (it9.hasNext()) {
                View view15 = (View) it9.next();
                Log.v(str5, "View: " + view15 + " Name: " + lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view15));
            }
        }
        ao3wqkm5cxfuvc0q473.HJFh0TGMpafqLE9haL(T9PhQIpGRhE4yZDm1C(), objAcstmh57AKoSEkEFNJ);
        ao3wqkm5cxfuvc0q473.sTkWmhpZ5b1ArQIw4K(T9PhQIpGRhE4yZDm1C(), arrayList15, arrayList14, arrayListE54J8UWNHWALQNixXM, leer5kfoer4xu5yhh75);
        WWC27LAMFqFFBzfbNw.zZKhbgvUfsK4AEX3r0(arrayList11, 0);
        ao3wqkm5cxfuvc0q473.R9SAhYMerGybF9OAjL(obj3, arrayList15, arrayList14);
        return map8;
    }

    public void G7AC3DWIx9i9fdanjk(Map map, View view) {
        String strTXWeW0sqVddf7ZBflq = lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view);
        if (strTXWeW0sqVddf7ZBflq != null) {
            map.put(strTXWeW0sqVddf7ZBflq, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    G7AC3DWIx9i9fdanjk(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // androidx.fragment.app.XzJ1BS7H9Ilbkv4eVM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void KYHag8HRDlnO3X9zmZ(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(java.util.List, boolean):void");
    }

    public final void LIMtzhnLwQyigzK0KO(List list, List list2, boolean z, Map map) {
        int i;
        StringBuilder sb;
        String str;
        boolean z2;
        Context context;
        View view;
        int i2;
        TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        ViewGroup viewGroupT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C();
        Context context2 = viewGroupT9PhQIpGRhE4yZDm1C.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = (Z9WdNiOsPR0y54zHW4) it.next();
            if (z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0() || (leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm = z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context2)) == null) {
                z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
            } else {
                Animator animator = leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm.f3507s3fjYDxWOUexjjVgyA;
                if (animator == null) {
                    arrayList.add(z9WdNiOsPR0y54zHW4);
                } else {
                    XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA = z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA();
                    Fragment fragmentKYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ();
                    if (Boolean.TRUE.equals(map.get(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA))) {
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentKYHag8HRDlnO3X9zmZ + " as this Fragment was involved in a Transition.");
                        }
                        z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
                    } else {
                        boolean z4 = husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm() == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.GONE;
                        if (z4) {
                            list2.remove(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA);
                        }
                        View view2 = fragmentKYHag8HRDlnO3X9zmZ.f3421W3RZ2dTDKrKpS5Mxdk;
                        viewGroupT9PhQIpGRhE4yZDm1C.startViewTransition(view2);
                        animator.addListener(new HJFh0TGMpafqLE9haL(viewGroupT9PhQIpGRhE4yZDm1C, view2, z4, husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA, z9WdNiOsPR0y54zHW4));
                        animator.setTarget(view2);
                        animator.start();
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Animator from operation ");
                            husniw3snxdgzpagjm = husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA;
                            sb2.append(husniw3snxdgzpagjm);
                            sb2.append(" has started.");
                            Log.v("FragmentManager", sb2.toString());
                        } else {
                            husniw3snxdgzpagjm = husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA;
                        }
                        z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL().s3fjYDxWOUexjjVgyA(new C0041zZKhbgvUfsK4AEX3r0(animator, husniw3snxdgzpagjm));
                        z3 = true;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW42 = (Z9WdNiOsPR0y54zHW4) it2.next();
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2 = z9WdNiOsPR0y54zHW42.s3fjYDxWOUexjjVgyA();
            Fragment fragmentKYHag8HRDlnO3X9zmZ2 = husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2.KYHag8HRDlnO3X9zmZ();
            if (z) {
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentKYHag8HRDlnO3X9zmZ2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                z9WdNiOsPR0y54zHW42.lEeR5KfoEr4xU5yHH7();
            } else if (z3) {
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentKYHag8HRDlnO3X9zmZ2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                z9WdNiOsPR0y54zHW42.lEeR5KfoEr4xU5yHH7();
            } else {
                View view3 = fragmentKYHag8HRDlnO3X9zmZ2.f3421W3RZ2dTDKrKpS5Mxdk;
                Animation animation = (Animation) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(((TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(z9WdNiOsPR0y54zHW42.husNiw3snxdgZPAGJm(context2))).f3506lEeR5KfoEr4xU5yHH7);
                if (husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2.husNiw3snxdgZPAGJm() != XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.REMOVED) {
                    view3.startAnimation(animation);
                    z9WdNiOsPR0y54zHW42.lEeR5KfoEr4xU5yHH7();
                    z2 = z3;
                    context = context2;
                    i2 = i;
                    view = view3;
                } else {
                    viewGroupT9PhQIpGRhE4yZDm1C.startViewTransition(view3);
                    TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(animation, viewGroupT9PhQIpGRhE4yZDm1C, view3);
                    z2 = z3;
                    context = context2;
                    view = view3;
                    s3fjydxwouexjjvgya.setAnimationListener(new husNiw3snxdgZPAGJm(husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2, viewGroupT9PhQIpGRhE4yZDm1C, view3, z9WdNiOsPR0y54zHW42));
                    view.startAnimation(s3fjydxwouexjjvgya);
                    i2 = 2;
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "Animation from operation " + husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2 + " has started.");
                    }
                }
                z9WdNiOsPR0y54zHW42.HJFh0TGMpafqLE9haL().s3fjYDxWOUexjjVgyA(new KYHag8HRDlnO3X9zmZ(view, viewGroupT9PhQIpGRhE4yZDm1C, z9WdNiOsPR0y54zHW42, husniw3snxdgzpagjmS3fjYDxWOUexjjVgyA2));
                i = i2;
                z3 = z2;
                context2 = context;
            }
        }
    }

    public void R9SAhYMerGybF9OAjL(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                R9SAhYMerGybF9OAjL(arrayList, childAt);
            }
        }
    }

    public final void VItLRw50eXTZeEfGl0(List list) {
        Fragment fragmentKYHag8HRDlnO3X9zmZ = ((XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm) list.get(list.size() - 1)).KYHag8HRDlnO3X9zmZ();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm) it.next();
            husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3402DfpieXfdYs58yZAiXY.f3470s3fjYDxWOUexjjVgyA = fragmentKYHag8HRDlnO3X9zmZ.f3402DfpieXfdYs58yZAiXY.f3470s3fjYDxWOUexjjVgyA;
            husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3402DfpieXfdYs58yZAiXY.f3456HJFh0TGMpafqLE9haL = fragmentKYHag8HRDlnO3X9zmZ.f3402DfpieXfdYs58yZAiXY.f3456HJFh0TGMpafqLE9haL;
            husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3402DfpieXfdYs58yZAiXY.f3472zZKhbgvUfsK4AEX3r0 = fragmentKYHag8HRDlnO3X9zmZ.f3402DfpieXfdYs58yZAiXY.f3472zZKhbgvUfsK4AEX3r0;
            husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3402DfpieXfdYs58yZAiXY.f3467husNiw3snxdgZPAGJm = fragmentKYHag8HRDlnO3X9zmZ.f3402DfpieXfdYs58yZAiXY.f3467husNiw3snxdgZPAGJm;
        }
    }

    public void Y43RdunnpKgpbny0lE(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        husniw3snxdgzpagjm.husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7(husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
    }

    public void xHA29AmDt6y96AnB3t(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Collection collection) {
        Iterator it = leer5kfoer4xu5yhh7.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
