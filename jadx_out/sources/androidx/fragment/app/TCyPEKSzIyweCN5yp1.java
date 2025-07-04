package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 {

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Animation f3506lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Animator f3507s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(Animator animator) {
            this.f3506lEeR5KfoEr4xU5yHH7 = null;
            this.f3507s3fjYDxWOUexjjVgyA = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public lEeR5KfoEr4xU5yHH7(Animation animation) {
            this.f3506lEeR5KfoEr4xU5yHH7 = animation;
            this.f3507s3fjYDxWOUexjjVgyA = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends AnimationSet implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f3508HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f3509husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ViewGroup f3510lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final View f3511s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f3512zZKhbgvUfsK4AEX3r0;

        public s3fjYDxWOUexjjVgyA(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3509husNiw3snxdgZPAGJm = true;
            this.f3510lEeR5KfoEr4xU5yHH7 = viewGroup;
            this.f3511s3fjYDxWOUexjjVgyA = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f3509husNiw3snxdgZPAGJm = true;
            if (this.f3508HJFh0TGMpafqLE9haL) {
                return !this.f3512zZKhbgvUfsK4AEX3r0;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3508HJFh0TGMpafqLE9haL = true;
                W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(this.f3510lEeR5KfoEr4xU5yHH7, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3508HJFh0TGMpafqLE9haL || !this.f3509husNiw3snxdgZPAGJm) {
                this.f3510lEeR5KfoEr4xU5yHH7.endViewTransition(this.f3511s3fjYDxWOUexjjVgyA);
                this.f3512zZKhbgvUfsK4AEX3r0 = true;
            } else {
                this.f3509husNiw3snxdgZPAGJm = false;
                this.f3510lEeR5KfoEr4xU5yHH7.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3509husNiw3snxdgZPAGJm = true;
            if (this.f3508HJFh0TGMpafqLE9haL) {
                return !this.f3512zZKhbgvUfsK4AEX3r0;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3508HJFh0TGMpafqLE9haL = true;
                W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(this.f3510lEeR5KfoEr4xU5yHH7, this);
            }
            return true;
        }
    }

    public static int HJFh0TGMpafqLE9haL(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int lEeR5KfoEr4xU5yHH7(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.OUd9THiLjZndMj0qdF() : fragment.jCtUeU2YI1poCxWcjm() : z ? fragment.OANkd3mP6AYvwbNLJM() : fragment.Y43RdunnpKgpbny0lE();
    }

    public static lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(Context context, Fragment fragment, boolean z, boolean z2) throws Resources.NotFoundException {
        int iVItLRw50eXTZeEfGl0 = fragment.VItLRw50eXTZeEfGl0();
        int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(fragment, z, z2);
        fragment.JXsqbvi9UKxeF3HXpU(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup != null && viewGroup.getTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f936HJFh0TGMpafqLE9haL) != null) {
            fragment.f3445tXWeW0sqVddf7ZBflq.setTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f936HJFh0TGMpafqLE9haL, null);
        }
        ViewGroup viewGroup2 = fragment.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationUj8rPa1EWADtk6Oe0S = fragment.Uj8rPa1EWADtk6Oe0S(iVItLRw50eXTZeEfGl0, z, iLEeR5KfoEr4xU5yHH7);
        if (animationUj8rPa1EWADtk6Oe0S != null) {
            return new lEeR5KfoEr4xU5yHH7(animationUj8rPa1EWADtk6Oe0S);
        }
        Animator animatorCSih7GetOUab1dYQjM = fragment.CSih7GetOUab1dYQjM(iVItLRw50eXTZeEfGl0, z, iLEeR5KfoEr4xU5yHH7);
        if (animatorCSih7GetOUab1dYQjM != null) {
            return new lEeR5KfoEr4xU5yHH7(animatorCSih7GetOUab1dYQjM);
        }
        if (iLEeR5KfoEr4xU5yHH7 == 0 && iVItLRw50eXTZeEfGl0 != 0) {
            iLEeR5KfoEr4xU5yHH7 = zZKhbgvUfsK4AEX3r0(context, iVItLRw50eXTZeEfGl0, z);
        }
        if (iLEeR5KfoEr4xU5yHH7 != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iLEeR5KfoEr4xU5yHH7));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iLEeR5KfoEr4xU5yHH7);
                    if (animationLoadAnimation != null) {
                        return new lEeR5KfoEr4xU5yHH7(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iLEeR5KfoEr4xU5yHH7);
                    if (animatorLoadAnimator != null) {
                        return new lEeR5KfoEr4xU5yHH7(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iLEeR5KfoEr4xU5yHH7);
                    if (animationLoadAnimation2 != null) {
                        return new lEeR5KfoEr4xU5yHH7(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static int zZKhbgvUfsK4AEX3r0(Context context, int i, boolean z) {
        int i2;
        if (i == 4097) {
            return z ? LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f932husNiw3snxdgZPAGJm : LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f931KYHag8HRDlnO3X9zmZ;
        }
        if (i == 8194) {
            return z ? LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f933lEeR5KfoEr4xU5yHH7 : LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f934s3fjYDxWOUexjjVgyA;
        }
        if (i == 8197) {
            i2 = z ? R.attr.activityCloseEnterAnimation : R.attr.activityCloseExitAnimation;
        } else {
            if (i == 4099) {
                return z ? LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f930HJFh0TGMpafqLE9haL : LU0fFDMACqnfIfA1AZ.lEeR5KfoEr4xU5yHH7.f935zZKhbgvUfsK4AEX3r0;
            }
            if (i != 4100) {
                return -1;
            }
            i2 = z ? R.attr.activityOpenEnterAnimation : R.attr.activityOpenExitAnimation;
        }
        return HJFh0TGMpafqLE9haL(context, i2);
    }
}
