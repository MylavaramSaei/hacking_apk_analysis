package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static SparseIntArray f3096husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int[] f3097zZKhbgvUfsK4AEX3r0 = {0, 4, 8};

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public HashMap f3099lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f3100s3fjYDxWOUexjjVgyA = true;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public HashMap f3098HJFh0TGMpafqLE9haL = new HashMap();

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public static SparseIntArray f3101IPyIQcaNa8aB7drBED;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3106lEeR5KfoEr4xU5yHH7 = false;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3107s3fjYDxWOUexjjVgyA = -1;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public String f3102HJFh0TGMpafqLE9haL = null;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3108zZKhbgvUfsK4AEX3r0 = -1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3105husNiw3snxdgZPAGJm = 0;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public float f3103KYHag8HRDlnO3X9zmZ = Float.NaN;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public float f3104TCyPEKSzIyweCN5yp1 = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3101IPyIQcaNa8aB7drBED = sparseIntArray;
            sparseIntArray.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ZnaVa8ZjwKOD2fFM1z, 1);
            f3101IPyIQcaNa8aB7drBED.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.S1bWyMbt52mpbT8Kla, 2);
            f3101IPyIQcaNa8aB7drBED.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ok7GSswMGri0okUcoc, 3);
            f3101IPyIQcaNa8aB7drBED.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ewHoGq0Ja0Rlm24smQ, 4);
            f3101IPyIQcaNa8aB7drBED.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.DEi6LMCtwCmk3LyWsm, 5);
            f3101IPyIQcaNa8aB7drBED.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.acbTdVGls0IueN1I6h, 6);
        }

        public void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            this.f3106lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.f3106lEeR5KfoEr4xU5yHH7;
            this.f3107s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL.f3107s3fjYDxWOUexjjVgyA;
            this.f3102HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL.f3102HJFh0TGMpafqLE9haL;
            this.f3108zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL.f3108zZKhbgvUfsK4AEX3r0;
            this.f3105husNiw3snxdgZPAGJm = hJFh0TGMpafqLE9haL.f3105husNiw3snxdgZPAGJm;
            this.f3104TCyPEKSzIyweCN5yp1 = hJFh0TGMpafqLE9haL.f3104TCyPEKSzIyweCN5yp1;
            this.f3103KYHag8HRDlnO3X9zmZ = hJFh0TGMpafqLE9haL.f3103KYHag8HRDlnO3X9zmZ;
        }

        public void s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.wEyThXmw7FUEJDY9j1);
            this.f3106lEeR5KfoEr4xU5yHH7 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f3101IPyIQcaNa8aB7drBED.get(index)) {
                    case 1:
                        this.f3104TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getFloat(index, this.f3104TCyPEKSzIyweCN5yp1);
                        break;
                    case 2:
                        this.f3108zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getInt(index, this.f3108zZKhbgvUfsK4AEX3r0);
                        break;
                    case 3:
                        this.f3102HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7.f1530HJFh0TGMpafqLE9haL[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f3105husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3107s3fjYDxWOUexjjVgyA = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3107s3fjYDxWOUexjjVgyA);
                        break;
                    case 6:
                        this.f3103KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getFloat(index, this.f3103KYHag8HRDlnO3X9zmZ);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class husNiw3snxdgZPAGJm {

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public static SparseIntArray f3109hoXrIDAFrSwfShk8da;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3119lEeR5KfoEr4xU5yHH7 = false;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public float f3121s3fjYDxWOUexjjVgyA = 0.0f;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public float f3111HJFh0TGMpafqLE9haL = 0.0f;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public float f3122zZKhbgvUfsK4AEX3r0 = 0.0f;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public float f3118husNiw3snxdgZPAGJm = 1.0f;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public float f3113KYHag8HRDlnO3X9zmZ = 1.0f;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public float f3115TCyPEKSzIyweCN5yp1 = Float.NaN;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public float f3112IPyIQcaNa8aB7drBED = Float.NaN;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public float f3120pbVGzGjWvY2LDXC8vo = 0.0f;

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public float f3110Acstmh57AKoSEkEFNJ = 0.0f;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public float f3116Z9WdNiOsPR0y54zHW4 = 0.0f;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public boolean f3117e54J8UWNHWALQNixXM = false;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public float f3114T9PhQIpGRhE4yZDm1C = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3109hoXrIDAFrSwfShk8da = sparseIntArray;
            sparseIntArray.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.sZPuLd2rw7yNBmuw5f, 1);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.mo8MK9AKngpxoIW4Yq, 2);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.tiDhljTjT4UM6aDAqR, 3);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.hNXfNdT5mtxNs1GuVC, 4);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.aCJ5cclggorQVZBTbW, 5);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.d99Jdu1XIwVGvnRvUH, 6);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.JmuEqzl4NsRhujPMMV, 7);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.bUDsVuwB2OjLREfRmq, 8);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.gKlx9TCGZPuWbI4HAq, 9);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.cGibYp8HSk4cU6iz3M, 10);
            f3109hoXrIDAFrSwfShk8da.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.yvmXoJLlPI2eyTRzJi, 11);
        }

        public void lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f3119lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm.f3119lEeR5KfoEr4xU5yHH7;
            this.f3121s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm.f3121s3fjYDxWOUexjjVgyA;
            this.f3111HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm.f3111HJFh0TGMpafqLE9haL;
            this.f3122zZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm.f3122zZKhbgvUfsK4AEX3r0;
            this.f3118husNiw3snxdgZPAGJm = husniw3snxdgzpagjm.f3118husNiw3snxdgZPAGJm;
            this.f3113KYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm.f3113KYHag8HRDlnO3X9zmZ;
            this.f3115TCyPEKSzIyweCN5yp1 = husniw3snxdgzpagjm.f3115TCyPEKSzIyweCN5yp1;
            this.f3112IPyIQcaNa8aB7drBED = husniw3snxdgzpagjm.f3112IPyIQcaNa8aB7drBED;
            this.f3120pbVGzGjWvY2LDXC8vo = husniw3snxdgzpagjm.f3120pbVGzGjWvY2LDXC8vo;
            this.f3110Acstmh57AKoSEkEFNJ = husniw3snxdgzpagjm.f3110Acstmh57AKoSEkEFNJ;
            this.f3116Z9WdNiOsPR0y54zHW4 = husniw3snxdgzpagjm.f3116Z9WdNiOsPR0y54zHW4;
            this.f3117e54J8UWNHWALQNixXM = husniw3snxdgzpagjm.f3117e54J8UWNHWALQNixXM;
            this.f3114T9PhQIpGRhE4yZDm1C = husniw3snxdgzpagjm.f3114T9PhQIpGRhE4yZDm1C;
        }

        public void s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.PDM7aWY7RIz2e8JnJf);
            this.f3119lEeR5KfoEr4xU5yHH7 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f3109hoXrIDAFrSwfShk8da.get(index)) {
                    case 1:
                        this.f3121s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getFloat(index, this.f3121s3fjYDxWOUexjjVgyA);
                        break;
                    case 2:
                        this.f3111HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getFloat(index, this.f3111HJFh0TGMpafqLE9haL);
                        break;
                    case 3:
                        this.f3122zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f3122zZKhbgvUfsK4AEX3r0);
                        break;
                    case 4:
                        this.f3118husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getFloat(index, this.f3118husNiw3snxdgZPAGJm);
                        break;
                    case 5:
                        this.f3113KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getFloat(index, this.f3113KYHag8HRDlnO3X9zmZ);
                        break;
                    case 6:
                        this.f3115TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getDimension(index, this.f3115TCyPEKSzIyweCN5yp1);
                        break;
                    case 7:
                        this.f3112IPyIQcaNa8aB7drBED = typedArrayObtainStyledAttributes.getDimension(index, this.f3112IPyIQcaNa8aB7drBED);
                        break;
                    case 8:
                        this.f3120pbVGzGjWvY2LDXC8vo = typedArrayObtainStyledAttributes.getDimension(index, this.f3120pbVGzGjWvY2LDXC8vo);
                        break;
                    case 9:
                        this.f3110Acstmh57AKoSEkEFNJ = typedArrayObtainStyledAttributes.getDimension(index, this.f3110Acstmh57AKoSEkEFNJ);
                        break;
                    case 10:
                        this.f3116Z9WdNiOsPR0y54zHW4 = typedArrayObtainStyledAttributes.getDimension(index, this.f3116Z9WdNiOsPR0y54zHW4);
                        break;
                    case 11:
                        this.f3117e54J8UWNHWALQNixXM = true;
                        this.f3114T9PhQIpGRhE4yZDm1C = typedArrayObtainStyledAttributes.getDimension(index, this.f3114T9PhQIpGRhE4yZDm1C);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f3126lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final C0036zZKhbgvUfsK4AEX3r0 f3127s3fjYDxWOUexjjVgyA = new C0036zZKhbgvUfsK4AEX3r0();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final HJFh0TGMpafqLE9haL f3123HJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL();

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final s3fjYDxWOUexjjVgyA f3128zZKhbgvUfsK4AEX3r0 = new s3fjYDxWOUexjjVgyA();

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final husNiw3snxdgZPAGJm f3125husNiw3snxdgZPAGJm = new husNiw3snxdgZPAGJm();

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public HashMap f3124KYHag8HRDlnO3X9zmZ = new HashMap();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7 clone() {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
            leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f3128zZKhbgvUfsK4AEX3r0);
            leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f3123HJFh0TGMpafqLE9haL);
            leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f3127s3fjYDxWOUexjjVgyA);
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(this.f3125husNiw3snxdgZPAGJm);
            leer5kfoer4xu5yhh7.f3126lEeR5KfoEr4xU5yHH7 = this.f3126lEeR5KfoEr4xU5yHH7;
            return leer5kfoer4xu5yhh7;
        }

        public void s3fjYDxWOUexjjVgyA(ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = this.f3128zZKhbgvUfsK4AEX3r0;
            s3fjydxwouexjjvgya.f3065zZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya2.f3137IPyIQcaNa8aB7drBED;
            s3fjydxwouexjjvgya.f3050husNiw3snxdgZPAGJm = s3fjydxwouexjjvgya2.f3182pbVGzGjWvY2LDXC8vo;
            s3fjydxwouexjjvgya.f3011KYHag8HRDlnO3X9zmZ = s3fjydxwouexjjvgya2.f3131Acstmh57AKoSEkEFNJ;
            s3fjydxwouexjjvgya.f3023TCyPEKSzIyweCN5yp1 = s3fjydxwouexjjvgya2.f3162Z9WdNiOsPR0y54zHW4;
            s3fjydxwouexjjvgya.f3010IPyIQcaNa8aB7drBED = s3fjydxwouexjjvgya2.f3171e54J8UWNHWALQNixXM;
            s3fjydxwouexjjvgya.f3058pbVGzGjWvY2LDXC8vo = s3fjydxwouexjjvgya2.f3149T9PhQIpGRhE4yZDm1C;
            s3fjydxwouexjjvgya.f3002Acstmh57AKoSEkEFNJ = s3fjydxwouexjjvgya2.f3173hoXrIDAFrSwfShk8da;
            s3fjydxwouexjjvgya.f3035Z9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgya2.f3165aPyGSIylzVNKPT1Bls;
            s3fjydxwouexjjvgya.f3045e54J8UWNHWALQNixXM = s3fjydxwouexjjvgya2.f3143OANkd3mP6AYvwbNLJM;
            s3fjydxwouexjjvgya.f3016OANkd3mP6AYvwbNLJM = s3fjydxwouexjjvgya2.f3190zaq8hOURtfwbcX17cG;
            s3fjydxwouexjjvgya.f3066zaq8hOURtfwbcX17cG = s3fjydxwouexjjvgya2.f3184sTkWmhpZ5b1ArQIw4K;
            s3fjydxwouexjjvgya.f3060sTkWmhpZ5b1ArQIw4K = s3fjydxwouexjjvgya2.f3160Y43RdunnpKgpbny0lE;
            s3fjydxwouexjjvgya.f3033Y43RdunnpKgpbny0lE = s3fjydxwouexjjvgya2.f3148R9SAhYMerGybF9OAjL;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).leftMargin = s3fjydxwouexjjvgya2.f3175jCtUeU2YI1poCxWcjm;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).rightMargin = s3fjydxwouexjjvgya2.f3159XzJ1BS7H9Ilbkv4eVM;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).topMargin = s3fjydxwouexjjvgya2.f3185tXWeW0sqVddf7ZBflq;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).bottomMargin = s3fjydxwouexjjvgya2.f3156W3RZ2dTDKrKpS5Mxdk;
            s3fjydxwouexjjvgya.f3001A49QRPHynYLCBN0SqP = s3fjydxwouexjjvgya2.f3179lLKzvdU99Iw80uVD5I;
            s3fjydxwouexjjvgya.f3028VItLRw50eXTZeEfGl0 = s3fjydxwouexjjvgya2.f3164aAp6BD79BhftLCnuvf;
            s3fjydxwouexjjvgya.f3007G7AC3DWIx9i9fdanjk = s3fjydxwouexjjvgya2.f3170e2F9F6h8YJxTHwLCa0;
            s3fjydxwouexjjvgya.f3014LIMtzhnLwQyigzK0KO = s3fjydxwouexjjvgya2.f3146PPkm9uUfOJHHYveeLT;
            s3fjydxwouexjjvgya.f3030WWC27LAMFqFFBzfbNw = s3fjydxwouexjjvgya2.f3134G7AC3DWIx9i9fdanjk;
            s3fjydxwouexjjvgya.f3024THTDvPxsHqMeGb512f = s3fjydxwouexjjvgya2.f3187xHA29AmDt6y96AnB3t;
            s3fjydxwouexjjvgya.f3022T9PhQIpGRhE4yZDm1C = s3fjydxwouexjjvgya2.f3130A49QRPHynYLCBN0SqP;
            s3fjydxwouexjjvgya.f3049hoXrIDAFrSwfShk8da = s3fjydxwouexjjvgya2.f3155VItLRw50eXTZeEfGl0;
            s3fjydxwouexjjvgya.f3038aPyGSIylzVNKPT1Bls = s3fjydxwouexjjvgya2.f3157WWC27LAMFqFFBzfbNw;
            s3fjydxwouexjjvgya.f3039ao3wqKm5CXFuvC0q47 = s3fjydxwouexjjvgya2.f3141LIMtzhnLwQyigzK0KO;
            s3fjydxwouexjjvgya.f3031XdzLv4NdAtTYoEzVzB = s3fjydxwouexjjvgya2.f3151THTDvPxsHqMeGb512f;
            s3fjydxwouexjjvgya.f3015LU0fFDMACqnfIfA1AZ = s3fjydxwouexjjvgya2.f3166ao3wqKm5CXFuvC0q47;
            s3fjydxwouexjjvgya.f3061tXWeW0sqVddf7ZBflq = s3fjydxwouexjjvgya2.f3152ToH8yzk8U1nKT0PUfY;
            s3fjydxwouexjjvgya.f3032XzJ1BS7H9Ilbkv4eVM = s3fjydxwouexjjvgya2.f3158XdzLv4NdAtTYoEzVzB;
            s3fjydxwouexjjvgya.f3018OqIo5QF00RDxUQb4qq = s3fjydxwouexjjvgya2.f3191zcy2NNbtVXgoGQbfuq;
            s3fjydxwouexjjvgya.f3029W3RZ2dTDKrKpS5Mxdk = s3fjydxwouexjjvgya2.f3142LU0fFDMACqnfIfA1AZ;
            s3fjydxwouexjjvgya.f3034YlLW4G6OV9TFyuw5ix = s3fjydxwouexjjvgya2.f3169ctWLFN70QQINH1kyYo;
            s3fjydxwouexjjvgya.f3056oocVJL811qFf0j0XXZ = s3fjydxwouexjjvgya2.f3176jocVUfxESVhVJU8LoH;
            s3fjydxwouexjjvgya.f3008GyWRxpdt1T8mEJXPoD = s3fjydxwouexjjvgya2.f3161YlLW4G6OV9TFyuw5ix;
            s3fjydxwouexjjvgya.f3005DfpieXfdYs58yZAiXY = s3fjydxwouexjjvgya2.f3180oocVJL811qFf0j0XXZ;
            s3fjydxwouexjjvgya.f3019PPkm9uUfOJHHYveeLT = s3fjydxwouexjjvgya2.f3186udcVtCzLTM1Loe9KrX;
            s3fjydxwouexjjvgya.f3037aAp6BD79BhftLCnuvf = s3fjydxwouexjjvgya2.f3168cT5Hs3CQpLK8NvlZAw;
            s3fjydxwouexjjvgya.f3044e2F9F6h8YJxTHwLCa0 = s3fjydxwouexjjvgya2.f3172hUNBy66ZO1wVLJGW3l;
            s3fjydxwouexjjvgya.f3013KqgKJKIWne3kz1AdHk = s3fjydxwouexjjvgya2.f3167bMSdooljgH14Jgudph;
            s3fjydxwouexjjvgya.f3055lLKzvdU99Iw80uVD5I = s3fjydxwouexjjvgya2.f3154Uj8rPa1EWADtk6Oe0S;
            s3fjydxwouexjjvgya.f3025ToH8yzk8U1nKT0PUfY = s3fjydxwouexjjvgya2.f3132CSih7GetOUab1dYQjM;
            s3fjydxwouexjjvgya.f3067zcy2NNbtVXgoGQbfuq = s3fjydxwouexjjvgya2.f3144OUd9THiLjZndMj0qdF;
            s3fjydxwouexjjvgya.f3009HJFh0TGMpafqLE9haL = s3fjydxwouexjjvgya2.f3150TCyPEKSzIyweCN5yp1;
            s3fjydxwouexjjvgya.f3054lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya2.f3174husNiw3snxdgZPAGJm;
            s3fjydxwouexjjvgya.f3059s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya2.f3138KYHag8HRDlnO3X9zmZ;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).width = s3fjydxwouexjjvgya2.f3136HJFh0TGMpafqLE9haL;
            ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).height = s3fjydxwouexjjvgya2.f3189zZKhbgvUfsK4AEX3r0;
            String str = s3fjydxwouexjjvgya2.f3147Pum9NZyDBKoCnecvlx;
            if (str != null) {
                s3fjydxwouexjjvgya.f3062udcVtCzLTM1Loe9KrX = str;
            }
            s3fjydxwouexjjvgya.setMarginStart(s3fjydxwouexjjvgya2.f3135GyWRxpdt1T8mEJXPoD);
            s3fjydxwouexjjvgya.setMarginEnd(this.f3128zZKhbgvUfsK4AEX3r0.f3145OqIo5QF00RDxUQb4qq);
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
        }

        public final void zZKhbgvUfsK4AEX3r0(int i, ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f3126lEeR5KfoEr4xU5yHH7 = i;
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = this.f3128zZKhbgvUfsK4AEX3r0;
            s3fjydxwouexjjvgya2.f3137IPyIQcaNa8aB7drBED = s3fjydxwouexjjvgya.f3065zZKhbgvUfsK4AEX3r0;
            s3fjydxwouexjjvgya2.f3182pbVGzGjWvY2LDXC8vo = s3fjydxwouexjjvgya.f3050husNiw3snxdgZPAGJm;
            s3fjydxwouexjjvgya2.f3131Acstmh57AKoSEkEFNJ = s3fjydxwouexjjvgya.f3011KYHag8HRDlnO3X9zmZ;
            s3fjydxwouexjjvgya2.f3162Z9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgya.f3023TCyPEKSzIyweCN5yp1;
            s3fjydxwouexjjvgya2.f3171e54J8UWNHWALQNixXM = s3fjydxwouexjjvgya.f3010IPyIQcaNa8aB7drBED;
            s3fjydxwouexjjvgya2.f3149T9PhQIpGRhE4yZDm1C = s3fjydxwouexjjvgya.f3058pbVGzGjWvY2LDXC8vo;
            s3fjydxwouexjjvgya2.f3173hoXrIDAFrSwfShk8da = s3fjydxwouexjjvgya.f3002Acstmh57AKoSEkEFNJ;
            s3fjydxwouexjjvgya2.f3165aPyGSIylzVNKPT1Bls = s3fjydxwouexjjvgya.f3035Z9WdNiOsPR0y54zHW4;
            s3fjydxwouexjjvgya2.f3143OANkd3mP6AYvwbNLJM = s3fjydxwouexjjvgya.f3045e54J8UWNHWALQNixXM;
            s3fjydxwouexjjvgya2.f3190zaq8hOURtfwbcX17cG = s3fjydxwouexjjvgya.f3016OANkd3mP6AYvwbNLJM;
            s3fjydxwouexjjvgya2.f3184sTkWmhpZ5b1ArQIw4K = s3fjydxwouexjjvgya.f3066zaq8hOURtfwbcX17cG;
            s3fjydxwouexjjvgya2.f3160Y43RdunnpKgpbny0lE = s3fjydxwouexjjvgya.f3060sTkWmhpZ5b1ArQIw4K;
            s3fjydxwouexjjvgya2.f3148R9SAhYMerGybF9OAjL = s3fjydxwouexjjvgya.f3033Y43RdunnpKgpbny0lE;
            s3fjydxwouexjjvgya2.f3134G7AC3DWIx9i9fdanjk = s3fjydxwouexjjvgya.f3030WWC27LAMFqFFBzfbNw;
            s3fjydxwouexjjvgya2.f3187xHA29AmDt6y96AnB3t = s3fjydxwouexjjvgya.f3024THTDvPxsHqMeGb512f;
            s3fjydxwouexjjvgya2.f3141LIMtzhnLwQyigzK0KO = s3fjydxwouexjjvgya.f3039ao3wqKm5CXFuvC0q47;
            s3fjydxwouexjjvgya2.f3130A49QRPHynYLCBN0SqP = s3fjydxwouexjjvgya.f3022T9PhQIpGRhE4yZDm1C;
            s3fjydxwouexjjvgya2.f3155VItLRw50eXTZeEfGl0 = s3fjydxwouexjjvgya.f3049hoXrIDAFrSwfShk8da;
            s3fjydxwouexjjvgya2.f3157WWC27LAMFqFFBzfbNw = s3fjydxwouexjjvgya.f3038aPyGSIylzVNKPT1Bls;
            s3fjydxwouexjjvgya2.f3151THTDvPxsHqMeGb512f = s3fjydxwouexjjvgya.f3031XdzLv4NdAtTYoEzVzB;
            s3fjydxwouexjjvgya2.f3166ao3wqKm5CXFuvC0q47 = s3fjydxwouexjjvgya.f3015LU0fFDMACqnfIfA1AZ;
            s3fjydxwouexjjvgya2.f3144OUd9THiLjZndMj0qdF = s3fjydxwouexjjvgya.f3067zcy2NNbtVXgoGQbfuq;
            s3fjydxwouexjjvgya2.f3150TCyPEKSzIyweCN5yp1 = s3fjydxwouexjjvgya.f3009HJFh0TGMpafqLE9haL;
            s3fjydxwouexjjvgya2.f3174husNiw3snxdgZPAGJm = s3fjydxwouexjjvgya.f3054lEeR5KfoEr4xU5yHH7;
            s3fjydxwouexjjvgya2.f3138KYHag8HRDlnO3X9zmZ = s3fjydxwouexjjvgya.f3059s3fjYDxWOUexjjVgyA;
            s3fjydxwouexjjvgya2.f3136HJFh0TGMpafqLE9haL = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).width;
            s3fjydxwouexjjvgya2.f3189zZKhbgvUfsK4AEX3r0 = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).height;
            s3fjydxwouexjjvgya2.f3175jCtUeU2YI1poCxWcjm = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).leftMargin;
            s3fjydxwouexjjvgya2.f3159XzJ1BS7H9Ilbkv4eVM = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).rightMargin;
            s3fjydxwouexjjvgya2.f3185tXWeW0sqVddf7ZBflq = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).topMargin;
            s3fjydxwouexjjvgya2.f3156W3RZ2dTDKrKpS5Mxdk = ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).bottomMargin;
            s3fjydxwouexjjvgya2.f3152ToH8yzk8U1nKT0PUfY = s3fjydxwouexjjvgya.f3061tXWeW0sqVddf7ZBflq;
            s3fjydxwouexjjvgya2.f3158XdzLv4NdAtTYoEzVzB = s3fjydxwouexjjvgya.f3032XzJ1BS7H9Ilbkv4eVM;
            s3fjydxwouexjjvgya2.f3191zcy2NNbtVXgoGQbfuq = s3fjydxwouexjjvgya.f3018OqIo5QF00RDxUQb4qq;
            s3fjydxwouexjjvgya2.f3142LU0fFDMACqnfIfA1AZ = s3fjydxwouexjjvgya.f3029W3RZ2dTDKrKpS5Mxdk;
            s3fjydxwouexjjvgya2.f3169ctWLFN70QQINH1kyYo = s3fjydxwouexjjvgya.f3034YlLW4G6OV9TFyuw5ix;
            s3fjydxwouexjjvgya2.f3176jocVUfxESVhVJU8LoH = s3fjydxwouexjjvgya.f3056oocVJL811qFf0j0XXZ;
            s3fjydxwouexjjvgya2.f3161YlLW4G6OV9TFyuw5ix = s3fjydxwouexjjvgya.f3008GyWRxpdt1T8mEJXPoD;
            s3fjydxwouexjjvgya2.f3180oocVJL811qFf0j0XXZ = s3fjydxwouexjjvgya.f3005DfpieXfdYs58yZAiXY;
            s3fjydxwouexjjvgya2.f3186udcVtCzLTM1Loe9KrX = s3fjydxwouexjjvgya.f3019PPkm9uUfOJHHYveeLT;
            s3fjydxwouexjjvgya2.f3168cT5Hs3CQpLK8NvlZAw = s3fjydxwouexjjvgya.f3037aAp6BD79BhftLCnuvf;
            s3fjydxwouexjjvgya2.f3172hUNBy66ZO1wVLJGW3l = s3fjydxwouexjjvgya.f3044e2F9F6h8YJxTHwLCa0;
            s3fjydxwouexjjvgya2.f3167bMSdooljgH14Jgudph = s3fjydxwouexjjvgya.f3013KqgKJKIWne3kz1AdHk;
            s3fjydxwouexjjvgya2.f3154Uj8rPa1EWADtk6Oe0S = s3fjydxwouexjjvgya.f3055lLKzvdU99Iw80uVD5I;
            s3fjydxwouexjjvgya2.f3132CSih7GetOUab1dYQjM = s3fjydxwouexjjvgya.f3025ToH8yzk8U1nKT0PUfY;
            s3fjydxwouexjjvgya2.f3147Pum9NZyDBKoCnecvlx = s3fjydxwouexjjvgya.f3062udcVtCzLTM1Loe9KrX;
            s3fjydxwouexjjvgya2.f3170e2F9F6h8YJxTHwLCa0 = s3fjydxwouexjjvgya.f3007G7AC3DWIx9i9fdanjk;
            s3fjydxwouexjjvgya2.f3146PPkm9uUfOJHHYveeLT = s3fjydxwouexjjvgya.f3014LIMtzhnLwQyigzK0KO;
            s3fjydxwouexjjvgya2.f3133DfpieXfdYs58yZAiXY = s3fjydxwouexjjvgya.f3021R9SAhYMerGybF9OAjL;
            s3fjydxwouexjjvgya2.f3140KqgKJKIWne3kz1AdHk = s3fjydxwouexjjvgya.f3063xHA29AmDt6y96AnB3t;
            s3fjydxwouexjjvgya2.f3179lLKzvdU99Iw80uVD5I = s3fjydxwouexjjvgya.f3001A49QRPHynYLCBN0SqP;
            s3fjydxwouexjjvgya2.f3164aAp6BD79BhftLCnuvf = s3fjydxwouexjjvgya.f3028VItLRw50eXTZeEfGl0;
            s3fjydxwouexjjvgya2.f3145OqIo5QF00RDxUQb4qq = s3fjydxwouexjjvgya.getMarginEnd();
            this.f3128zZKhbgvUfsK4AEX3r0.f3135GyWRxpdt1T8mEJXPoD = s3fjydxwouexjjvgya.getMarginStart();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
        public static SparseIntArray f3129eWK41qw3g36LVd4UnS;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3136HJFh0TGMpafqLE9haL;

        /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
        public String f3139Kh0uC90qEEhuLdpgB9;

        /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
        public String f3147Pum9NZyDBKoCnecvlx;

        /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
        public int[] f3177k0CbjZvfUz23r8IN6W;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3189zZKhbgvUfsK4AEX3r0;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3178lEeR5KfoEr4xU5yHH7 = false;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f3183s3fjYDxWOUexjjVgyA = false;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3174husNiw3snxdgZPAGJm = -1;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3138KYHag8HRDlnO3X9zmZ = -1;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public float f3150TCyPEKSzIyweCN5yp1 = -1.0f;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public int f3137IPyIQcaNa8aB7drBED = -1;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public int f3182pbVGzGjWvY2LDXC8vo = -1;

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public int f3131Acstmh57AKoSEkEFNJ = -1;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public int f3162Z9WdNiOsPR0y54zHW4 = -1;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public int f3171e54J8UWNHWALQNixXM = -1;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public int f3149T9PhQIpGRhE4yZDm1C = -1;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public int f3173hoXrIDAFrSwfShk8da = -1;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public int f3165aPyGSIylzVNKPT1Bls = -1;

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public int f3143OANkd3mP6AYvwbNLJM = -1;

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public int f3190zaq8hOURtfwbcX17cG = -1;

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public int f3184sTkWmhpZ5b1ArQIw4K = -1;

        /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
        public int f3160Y43RdunnpKgpbny0lE = -1;

        /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
        public int f3148R9SAhYMerGybF9OAjL = -1;

        /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
        public float f3134G7AC3DWIx9i9fdanjk = 0.5f;

        /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
        public float f3187xHA29AmDt6y96AnB3t = 0.5f;

        /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
        public String f3141LIMtzhnLwQyigzK0KO = null;

        /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
        public int f3130A49QRPHynYLCBN0SqP = -1;

        /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
        public int f3155VItLRw50eXTZeEfGl0 = 0;

        /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
        public float f3157WWC27LAMFqFFBzfbNw = 0.0f;

        /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
        public int f3151THTDvPxsHqMeGb512f = -1;

        /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
        public int f3166ao3wqKm5CXFuvC0q47 = -1;

        /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
        public int f3144OUd9THiLjZndMj0qdF = -1;

        /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
        public int f3175jCtUeU2YI1poCxWcjm = -1;

        /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
        public int f3159XzJ1BS7H9Ilbkv4eVM = -1;

        /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
        public int f3185tXWeW0sqVddf7ZBflq = -1;

        /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
        public int f3156W3RZ2dTDKrKpS5Mxdk = -1;

        /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
        public int f3145OqIo5QF00RDxUQb4qq = -1;

        /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
        public int f3135GyWRxpdt1T8mEJXPoD = -1;

        /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
        public int f3133DfpieXfdYs58yZAiXY = -1;

        /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
        public int f3170e2F9F6h8YJxTHwLCa0 = -1;

        /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
        public int f3140KqgKJKIWne3kz1AdHk = -1;

        /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
        public int f3146PPkm9uUfOJHHYveeLT = -1;

        /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
        public int f3164aAp6BD79BhftLCnuvf = -1;

        /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
        public int f3179lLKzvdU99Iw80uVD5I = -1;

        /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
        public float f3152ToH8yzk8U1nKT0PUfY = -1.0f;

        /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
        public float f3158XdzLv4NdAtTYoEzVzB = -1.0f;

        /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
        public int f3142LU0fFDMACqnfIfA1AZ = 0;

        /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
        public int f3191zcy2NNbtVXgoGQbfuq = 0;

        /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
        public int f3161YlLW4G6OV9TFyuw5ix = 0;

        /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
        public int f3180oocVJL811qFf0j0XXZ = 0;

        /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
        public int f3186udcVtCzLTM1Loe9KrX = -1;

        /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
        public int f3168cT5Hs3CQpLK8NvlZAw = -1;

        /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
        public int f3172hUNBy66ZO1wVLJGW3l = -1;

        /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
        public int f3167bMSdooljgH14Jgudph = -1;

        /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
        public float f3154Uj8rPa1EWADtk6Oe0S = 1.0f;

        /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
        public float f3132CSih7GetOUab1dYQjM = 1.0f;

        /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
        public int f3181osrHU7fvDp2EgxZPfM = -1;

        /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
        public int f3163ZJNyOIPL0usMs2xSAn = 0;

        /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
        public int f3153Tu4WCh2gEwj8E4oHbP = -1;

        /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
        public boolean f3169ctWLFN70QQINH1kyYo = false;

        /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
        public boolean f3176jocVUfxESVhVJU8LoH = false;

        /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
        public boolean f3188zXY7dgnTfw9Pd9RXel = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3129eWK41qw3g36LVd4UnS = sparseIntArray;
            sparseIntArray.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.BSCEyBRs5PRvTj6ncV, 24);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.O9jAstt9kmlaKLKyoF, 25);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.hEVnmvJZudTzFwnBf0, 28);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.HBquAyyk1qVcsBE8IF, 29);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.uqiqWjzYjTPv16sgqs, 35);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.MoW36Yff4vwaEnO7Uf, 34);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.AYUaLMV9iUMztj16i3, 4);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.wZQ95O8oIOjGOJYEyM, 3);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ojOFljVHhgv79qoaOh, 1);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.nol4yHeVanXke5f5p9, 6);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.qifGOwUJU8M2kUsoSx, 7);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.SGV6sO7pvYEzDsuItx, 17);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.GLueyv9BgwylJjMQi9, 18);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.m7LkS91w49m30Czlb5, 19);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.doS7eJXXKhNrHhkj53, 26);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.rFFnAu67ZB7G1DiYVL, 31);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.DuV31F8X4xB9cWnvZo, 32);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6Lk0TBpD483oTbhrE, 10);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.LKQRsCqzSNh8wKlkAU, 9);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.M122clhHHPnQOj0qXt, 13);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.L7R3AptECEyKtiwihP, 16);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.nzYKxGFJdgl3XdkAMV, 14);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.P1E7I4nOQeDcWKS2NX, 11);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.vZYwlguE9k8LYEQe57, 15);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.z4aA1rXTkPixJu8v2O, 12);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.of2sKmRuwfi85nOsKg, 38);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.B4O8PzSRwRFToVL7P4, 37);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.VpyBfBQsPHE3HCPBek, 39);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.YgEBqfplpE1HxsgLiW, 40);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.VWHGWT8vIqXOdEWSVO, 20);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.WdFsNlIsytUDOBF3tn, 36);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.lveOFTS2lNtik4smTM, 5);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.DOSR7bzmQizraOHdCw, 76);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.Ezx31zqRGWEh2n7KAa, 76);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.J62YBEer8UQSuhlEfi, 76);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.C3mYeVlq5GzYsTPpOy, 76);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.AGTejISyurDkHA1jzS, 76);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.gZOwwmC3ekxfwtvwiD, 23);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.MIASacmCbduT1To7hE, 27);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.YRbOi4FmSeK3PdVD6h, 30);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.DkSMYH84vB7O9PeHmA, 8);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.oJSDxtYwi69ysfkppA, 33);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.R5s1HXauMWwSYni6Gq, 2);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.OAvcfE0oAIgUpqlZnz, 22);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.uQfniQS8flMJ73Pcgd, 21);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.LaN61dB1MUWP2VKV4s, 61);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.LjWxBiMp5Vn4enYhzb, 62);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.A6ijtoDhsGiumnDCyI, 63);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.vR6sX3HsPiyBxQxdoE, 69);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.crFuQW259sLoeLeXVm, 70);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.gDBKwCx4kJmDHyOhWU, 71);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.UCYCKYCbK3WaLphGSa, 72);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.Wj2XB9phQxTkhBoEUl, 73);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.jh48wDcfV88imBwE5z, 74);
            f3129eWK41qw3g36LVd4UnS.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.qZ6CTlBtzj1VJZGXb9, 75);
        }

        public void lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f3178lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya.f3178lEeR5KfoEr4xU5yHH7;
            this.f3136HJFh0TGMpafqLE9haL = s3fjydxwouexjjvgya.f3136HJFh0TGMpafqLE9haL;
            this.f3183s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.f3183s3fjYDxWOUexjjVgyA;
            this.f3189zZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.f3189zZKhbgvUfsK4AEX3r0;
            this.f3174husNiw3snxdgZPAGJm = s3fjydxwouexjjvgya.f3174husNiw3snxdgZPAGJm;
            this.f3138KYHag8HRDlnO3X9zmZ = s3fjydxwouexjjvgya.f3138KYHag8HRDlnO3X9zmZ;
            this.f3150TCyPEKSzIyweCN5yp1 = s3fjydxwouexjjvgya.f3150TCyPEKSzIyweCN5yp1;
            this.f3137IPyIQcaNa8aB7drBED = s3fjydxwouexjjvgya.f3137IPyIQcaNa8aB7drBED;
            this.f3182pbVGzGjWvY2LDXC8vo = s3fjydxwouexjjvgya.f3182pbVGzGjWvY2LDXC8vo;
            this.f3131Acstmh57AKoSEkEFNJ = s3fjydxwouexjjvgya.f3131Acstmh57AKoSEkEFNJ;
            this.f3162Z9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgya.f3162Z9WdNiOsPR0y54zHW4;
            this.f3171e54J8UWNHWALQNixXM = s3fjydxwouexjjvgya.f3171e54J8UWNHWALQNixXM;
            this.f3149T9PhQIpGRhE4yZDm1C = s3fjydxwouexjjvgya.f3149T9PhQIpGRhE4yZDm1C;
            this.f3173hoXrIDAFrSwfShk8da = s3fjydxwouexjjvgya.f3173hoXrIDAFrSwfShk8da;
            this.f3165aPyGSIylzVNKPT1Bls = s3fjydxwouexjjvgya.f3165aPyGSIylzVNKPT1Bls;
            this.f3143OANkd3mP6AYvwbNLJM = s3fjydxwouexjjvgya.f3143OANkd3mP6AYvwbNLJM;
            this.f3190zaq8hOURtfwbcX17cG = s3fjydxwouexjjvgya.f3190zaq8hOURtfwbcX17cG;
            this.f3184sTkWmhpZ5b1ArQIw4K = s3fjydxwouexjjvgya.f3184sTkWmhpZ5b1ArQIw4K;
            this.f3160Y43RdunnpKgpbny0lE = s3fjydxwouexjjvgya.f3160Y43RdunnpKgpbny0lE;
            this.f3148R9SAhYMerGybF9OAjL = s3fjydxwouexjjvgya.f3148R9SAhYMerGybF9OAjL;
            this.f3134G7AC3DWIx9i9fdanjk = s3fjydxwouexjjvgya.f3134G7AC3DWIx9i9fdanjk;
            this.f3187xHA29AmDt6y96AnB3t = s3fjydxwouexjjvgya.f3187xHA29AmDt6y96AnB3t;
            this.f3141LIMtzhnLwQyigzK0KO = s3fjydxwouexjjvgya.f3141LIMtzhnLwQyigzK0KO;
            this.f3130A49QRPHynYLCBN0SqP = s3fjydxwouexjjvgya.f3130A49QRPHynYLCBN0SqP;
            this.f3155VItLRw50eXTZeEfGl0 = s3fjydxwouexjjvgya.f3155VItLRw50eXTZeEfGl0;
            this.f3157WWC27LAMFqFFBzfbNw = s3fjydxwouexjjvgya.f3157WWC27LAMFqFFBzfbNw;
            this.f3151THTDvPxsHqMeGb512f = s3fjydxwouexjjvgya.f3151THTDvPxsHqMeGb512f;
            this.f3166ao3wqKm5CXFuvC0q47 = s3fjydxwouexjjvgya.f3166ao3wqKm5CXFuvC0q47;
            this.f3144OUd9THiLjZndMj0qdF = s3fjydxwouexjjvgya.f3144OUd9THiLjZndMj0qdF;
            this.f3175jCtUeU2YI1poCxWcjm = s3fjydxwouexjjvgya.f3175jCtUeU2YI1poCxWcjm;
            this.f3159XzJ1BS7H9Ilbkv4eVM = s3fjydxwouexjjvgya.f3159XzJ1BS7H9Ilbkv4eVM;
            this.f3185tXWeW0sqVddf7ZBflq = s3fjydxwouexjjvgya.f3185tXWeW0sqVddf7ZBflq;
            this.f3156W3RZ2dTDKrKpS5Mxdk = s3fjydxwouexjjvgya.f3156W3RZ2dTDKrKpS5Mxdk;
            this.f3145OqIo5QF00RDxUQb4qq = s3fjydxwouexjjvgya.f3145OqIo5QF00RDxUQb4qq;
            this.f3135GyWRxpdt1T8mEJXPoD = s3fjydxwouexjjvgya.f3135GyWRxpdt1T8mEJXPoD;
            this.f3133DfpieXfdYs58yZAiXY = s3fjydxwouexjjvgya.f3133DfpieXfdYs58yZAiXY;
            this.f3170e2F9F6h8YJxTHwLCa0 = s3fjydxwouexjjvgya.f3170e2F9F6h8YJxTHwLCa0;
            this.f3140KqgKJKIWne3kz1AdHk = s3fjydxwouexjjvgya.f3140KqgKJKIWne3kz1AdHk;
            this.f3146PPkm9uUfOJHHYveeLT = s3fjydxwouexjjvgya.f3146PPkm9uUfOJHHYveeLT;
            this.f3164aAp6BD79BhftLCnuvf = s3fjydxwouexjjvgya.f3164aAp6BD79BhftLCnuvf;
            this.f3179lLKzvdU99Iw80uVD5I = s3fjydxwouexjjvgya.f3179lLKzvdU99Iw80uVD5I;
            this.f3152ToH8yzk8U1nKT0PUfY = s3fjydxwouexjjvgya.f3152ToH8yzk8U1nKT0PUfY;
            this.f3158XdzLv4NdAtTYoEzVzB = s3fjydxwouexjjvgya.f3158XdzLv4NdAtTYoEzVzB;
            this.f3142LU0fFDMACqnfIfA1AZ = s3fjydxwouexjjvgya.f3142LU0fFDMACqnfIfA1AZ;
            this.f3191zcy2NNbtVXgoGQbfuq = s3fjydxwouexjjvgya.f3191zcy2NNbtVXgoGQbfuq;
            this.f3161YlLW4G6OV9TFyuw5ix = s3fjydxwouexjjvgya.f3161YlLW4G6OV9TFyuw5ix;
            this.f3180oocVJL811qFf0j0XXZ = s3fjydxwouexjjvgya.f3180oocVJL811qFf0j0XXZ;
            this.f3186udcVtCzLTM1Loe9KrX = s3fjydxwouexjjvgya.f3186udcVtCzLTM1Loe9KrX;
            this.f3168cT5Hs3CQpLK8NvlZAw = s3fjydxwouexjjvgya.f3168cT5Hs3CQpLK8NvlZAw;
            this.f3172hUNBy66ZO1wVLJGW3l = s3fjydxwouexjjvgya.f3172hUNBy66ZO1wVLJGW3l;
            this.f3167bMSdooljgH14Jgudph = s3fjydxwouexjjvgya.f3167bMSdooljgH14Jgudph;
            this.f3154Uj8rPa1EWADtk6Oe0S = s3fjydxwouexjjvgya.f3154Uj8rPa1EWADtk6Oe0S;
            this.f3132CSih7GetOUab1dYQjM = s3fjydxwouexjjvgya.f3132CSih7GetOUab1dYQjM;
            this.f3181osrHU7fvDp2EgxZPfM = s3fjydxwouexjjvgya.f3181osrHU7fvDp2EgxZPfM;
            this.f3163ZJNyOIPL0usMs2xSAn = s3fjydxwouexjjvgya.f3163ZJNyOIPL0usMs2xSAn;
            this.f3153Tu4WCh2gEwj8E4oHbP = s3fjydxwouexjjvgya.f3153Tu4WCh2gEwj8E4oHbP;
            this.f3147Pum9NZyDBKoCnecvlx = s3fjydxwouexjjvgya.f3147Pum9NZyDBKoCnecvlx;
            int[] iArr = s3fjydxwouexjjvgya.f3177k0CbjZvfUz23r8IN6W;
            if (iArr != null) {
                this.f3177k0CbjZvfUz23r8IN6W = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3177k0CbjZvfUz23r8IN6W = null;
            }
            this.f3139Kh0uC90qEEhuLdpgB9 = s3fjydxwouexjjvgya.f3139Kh0uC90qEEhuLdpgB9;
            this.f3169ctWLFN70QQINH1kyYo = s3fjydxwouexjjvgya.f3169ctWLFN70QQINH1kyYo;
            this.f3176jocVUfxESVhVJU8LoH = s3fjydxwouexjjvgya.f3176jocVUfxESVhVJU8LoH;
            this.f3188zXY7dgnTfw9Pd9RXel = s3fjydxwouexjjvgya.f3188zXY7dgnTfw9Pd9RXel;
        }

        public void s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.xGjHHD7pi4zU9rqB8A);
            this.f3183s3fjYDxWOUexjjVgyA = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f3129eWK41qw3g36LVd4UnS.get(index);
                if (i2 == 80) {
                    this.f3169ctWLFN70QQINH1kyYo = typedArrayObtainStyledAttributes.getBoolean(index, this.f3169ctWLFN70QQINH1kyYo);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f3143OANkd3mP6AYvwbNLJM = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3143OANkd3mP6AYvwbNLJM);
                            break;
                        case 2:
                            this.f3156W3RZ2dTDKrKpS5Mxdk = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3156W3RZ2dTDKrKpS5Mxdk);
                            break;
                        case 3:
                            this.f3165aPyGSIylzVNKPT1Bls = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3165aPyGSIylzVNKPT1Bls);
                            break;
                        case 4:
                            this.f3173hoXrIDAFrSwfShk8da = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3173hoXrIDAFrSwfShk8da);
                            break;
                        case 5:
                            this.f3141LIMtzhnLwQyigzK0KO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f3151THTDvPxsHqMeGb512f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3151THTDvPxsHqMeGb512f);
                            break;
                        case 7:
                            this.f3166ao3wqKm5CXFuvC0q47 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3166ao3wqKm5CXFuvC0q47);
                            break;
                        case 8:
                            this.f3145OqIo5QF00RDxUQb4qq = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3145OqIo5QF00RDxUQb4qq);
                            break;
                        case 9:
                            this.f3148R9SAhYMerGybF9OAjL = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3148R9SAhYMerGybF9OAjL);
                            break;
                        case 10:
                            this.f3160Y43RdunnpKgpbny0lE = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3160Y43RdunnpKgpbny0lE);
                            break;
                        case 11:
                            this.f3146PPkm9uUfOJHHYveeLT = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3146PPkm9uUfOJHHYveeLT);
                            break;
                        case 12:
                            this.f3164aAp6BD79BhftLCnuvf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3164aAp6BD79BhftLCnuvf);
                            break;
                        case 13:
                            this.f3133DfpieXfdYs58yZAiXY = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3133DfpieXfdYs58yZAiXY);
                            break;
                        case 14:
                            this.f3140KqgKJKIWne3kz1AdHk = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3140KqgKJKIWne3kz1AdHk);
                            break;
                        case 15:
                            this.f3179lLKzvdU99Iw80uVD5I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3179lLKzvdU99Iw80uVD5I);
                            break;
                        case 16:
                            this.f3170e2F9F6h8YJxTHwLCa0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3170e2F9F6h8YJxTHwLCa0);
                            break;
                        case 17:
                            this.f3174husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3174husNiw3snxdgZPAGJm);
                            break;
                        case 18:
                            this.f3138KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3138KYHag8HRDlnO3X9zmZ);
                            break;
                        case 19:
                            this.f3150TCyPEKSzIyweCN5yp1 = typedArrayObtainStyledAttributes.getFloat(index, this.f3150TCyPEKSzIyweCN5yp1);
                            break;
                        case 20:
                            this.f3134G7AC3DWIx9i9fdanjk = typedArrayObtainStyledAttributes.getFloat(index, this.f3134G7AC3DWIx9i9fdanjk);
                            break;
                        case 21:
                            this.f3189zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3189zZKhbgvUfsK4AEX3r0);
                            break;
                        case 22:
                            this.f3136HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3136HJFh0TGMpafqLE9haL);
                            break;
                        case 23:
                            this.f3175jCtUeU2YI1poCxWcjm = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3175jCtUeU2YI1poCxWcjm);
                            break;
                        case 24:
                            this.f3137IPyIQcaNa8aB7drBED = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3137IPyIQcaNa8aB7drBED);
                            break;
                        case 25:
                            this.f3182pbVGzGjWvY2LDXC8vo = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3182pbVGzGjWvY2LDXC8vo);
                            break;
                        case 26:
                            this.f3144OUd9THiLjZndMj0qdF = typedArrayObtainStyledAttributes.getInt(index, this.f3144OUd9THiLjZndMj0qdF);
                            break;
                        case 27:
                            this.f3159XzJ1BS7H9Ilbkv4eVM = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3159XzJ1BS7H9Ilbkv4eVM);
                            break;
                        case 28:
                            this.f3131Acstmh57AKoSEkEFNJ = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3131Acstmh57AKoSEkEFNJ);
                            break;
                        case 29:
                            this.f3162Z9WdNiOsPR0y54zHW4 = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3162Z9WdNiOsPR0y54zHW4);
                            break;
                        case 30:
                            this.f3135GyWRxpdt1T8mEJXPoD = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3135GyWRxpdt1T8mEJXPoD);
                            break;
                        case 31:
                            this.f3190zaq8hOURtfwbcX17cG = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3190zaq8hOURtfwbcX17cG);
                            break;
                        case 32:
                            this.f3184sTkWmhpZ5b1ArQIw4K = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3184sTkWmhpZ5b1ArQIw4K);
                            break;
                        case 33:
                            this.f3185tXWeW0sqVddf7ZBflq = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3185tXWeW0sqVddf7ZBflq);
                            break;
                        case 34:
                            this.f3149T9PhQIpGRhE4yZDm1C = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3149T9PhQIpGRhE4yZDm1C);
                            break;
                        case 35:
                            this.f3171e54J8UWNHWALQNixXM = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3171e54J8UWNHWALQNixXM);
                            break;
                        case 36:
                            this.f3187xHA29AmDt6y96AnB3t = typedArrayObtainStyledAttributes.getFloat(index, this.f3187xHA29AmDt6y96AnB3t);
                            break;
                        case 37:
                            this.f3158XdzLv4NdAtTYoEzVzB = typedArrayObtainStyledAttributes.getFloat(index, this.f3158XdzLv4NdAtTYoEzVzB);
                            break;
                        case 38:
                            this.f3152ToH8yzk8U1nKT0PUfY = typedArrayObtainStyledAttributes.getFloat(index, this.f3152ToH8yzk8U1nKT0PUfY);
                            break;
                        case 39:
                            this.f3142LU0fFDMACqnfIfA1AZ = typedArrayObtainStyledAttributes.getInt(index, this.f3142LU0fFDMACqnfIfA1AZ);
                            break;
                        case 40:
                            this.f3191zcy2NNbtVXgoGQbfuq = typedArrayObtainStyledAttributes.getInt(index, this.f3191zcy2NNbtVXgoGQbfuq);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f3161YlLW4G6OV9TFyuw5ix = typedArrayObtainStyledAttributes.getInt(index, this.f3161YlLW4G6OV9TFyuw5ix);
                                    break;
                                case 55:
                                    this.f3180oocVJL811qFf0j0XXZ = typedArrayObtainStyledAttributes.getInt(index, this.f3180oocVJL811qFf0j0XXZ);
                                    break;
                                case 56:
                                    this.f3186udcVtCzLTM1Loe9KrX = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3186udcVtCzLTM1Loe9KrX);
                                    break;
                                case 57:
                                    this.f3168cT5Hs3CQpLK8NvlZAw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3168cT5Hs3CQpLK8NvlZAw);
                                    break;
                                case 58:
                                    this.f3172hUNBy66ZO1wVLJGW3l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3172hUNBy66ZO1wVLJGW3l);
                                    break;
                                case 59:
                                    this.f3167bMSdooljgH14Jgudph = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3167bMSdooljgH14Jgudph);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f3130A49QRPHynYLCBN0SqP = zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C(typedArrayObtainStyledAttributes, index, this.f3130A49QRPHynYLCBN0SqP);
                                            break;
                                        case 62:
                                            this.f3155VItLRw50eXTZeEfGl0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3155VItLRw50eXTZeEfGl0);
                                            break;
                                        case 63:
                                            this.f3157WWC27LAMFqFFBzfbNw = typedArrayObtainStyledAttributes.getFloat(index, this.f3157WWC27LAMFqFFBzfbNw);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f3154Uj8rPa1EWADtk6Oe0S = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f3132CSih7GetOUab1dYQjM = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f3181osrHU7fvDp2EgxZPfM = typedArrayObtainStyledAttributes.getInt(index, this.f3181osrHU7fvDp2EgxZPfM);
                                                    continue;
                                                case 73:
                                                    this.f3163ZJNyOIPL0usMs2xSAn = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3163ZJNyOIPL0usMs2xSAn);
                                                    continue;
                                                case 74:
                                                    this.f3139Kh0uC90qEEhuLdpgB9 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f3188zXY7dgnTfw9Pd9RXel = typedArrayObtainStyledAttributes.getBoolean(index, this.f3188zXY7dgnTfw9Pd9RXel);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f3147Pum9NZyDBKoCnecvlx = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f3129eWK41qw3g36LVd4UnS.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f3176jocVUfxESVhVJU8LoH = typedArrayObtainStyledAttributes.getBoolean(index, this.f3176jocVUfxESVhVJU8LoH);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0$zZKhbgvUfsK4AEX3r0, reason: collision with other inner class name */
    public static class C0036zZKhbgvUfsK4AEX3r0 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3194lEeR5KfoEr4xU5yHH7 = false;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3195s3fjYDxWOUexjjVgyA = 0;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3192HJFh0TGMpafqLE9haL = 0;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public float f3196zZKhbgvUfsK4AEX3r0 = 1.0f;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public float f3193husNiw3snxdgZPAGJm = Float.NaN;

        public void lEeR5KfoEr4xU5yHH7(C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r0) {
            this.f3194lEeR5KfoEr4xU5yHH7 = c0036zZKhbgvUfsK4AEX3r0.f3194lEeR5KfoEr4xU5yHH7;
            this.f3195s3fjYDxWOUexjjVgyA = c0036zZKhbgvUfsK4AEX3r0.f3195s3fjYDxWOUexjjVgyA;
            this.f3196zZKhbgvUfsK4AEX3r0 = c0036zZKhbgvUfsK4AEX3r0.f3196zZKhbgvUfsK4AEX3r0;
            this.f3193husNiw3snxdgZPAGJm = c0036zZKhbgvUfsK4AEX3r0.f3193husNiw3snxdgZPAGJm;
            this.f3192HJFh0TGMpafqLE9haL = c0036zZKhbgvUfsK4AEX3r0.f3192HJFh0TGMpafqLE9haL;
        }

        public void s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ZAazWZA7wPP3FPEU71);
            this.f3194lEeR5KfoEr4xU5yHH7 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.ByUUCK9yLDZbYnn09T) {
                    this.f3196zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f3196zZKhbgvUfsK4AEX3r0);
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.B6f659OrHSbQ1dIBLx) {
                    this.f3195s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getInt(index, this.f3195s3fjYDxWOUexjjVgyA);
                    this.f3195s3fjYDxWOUexjjVgyA = zZKhbgvUfsK4AEX3r0.f3097zZKhbgvUfsK4AEX3r0[this.f3195s3fjYDxWOUexjjVgyA];
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.N8pW3GNEzdve5gbCQC) {
                    this.f3192HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getInt(index, this.f3192HJFh0TGMpafqLE9haL);
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.XQXo8jgSHTWLZdMPSX) {
                    this.f3193husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getFloat(index, this.f3193husNiw3snxdgZPAGJm);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3096husNiw3snxdgZPAGJm = sparseIntArray;
        sparseIntArray.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6704O1furmptfI76BGfN0d, 25);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6780iQCvttGuB7nx4r7kMP, 26);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6680Fo9071MN8vwEWamAUX, 29);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6675Er40JrQbOM51vCQI8w, 30);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6798pgB7Gmjz55y9NQYnAD, 36);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6687HR5vAalpgOKVm2T0Gq, 35);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6740ZJNyOIPL0usMs2xSAn, 4);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6795osrHU7fvDp2EgxZPfM, 3);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6724Uj8rPa1EWADtk6Oe0S, 1);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6793oXIAAdret8ERrYfuyf, 6);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6821yXUWiIShOcfJRNCmU8, 7);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6826zXY7dgnTfw9Pd9RXel, 17);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6761eWK41qw3g36LVd4UnS, 18);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6762evSiTWao80SbJUZk9E, 19);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6733Y43RdunnpKgpbny0lE, 27);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6737Ywqw2A0s86HeuFkDt0, 32);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6763f2zPq7MOnQrtOlZ1Zg, 33);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6783jocVUfxESVhVJU8LoH, 10);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6754ctWLFN70QQINH1kyYo, 9);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6712QW0Trt6m3nVBNaYFnP, 13);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6691JXsqbvi9UKxeF3HXpU, 16);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6755d4ZdBAtGyjVWTQYsYn, 14);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6707OWyIJu8lIXxQlvLhaC, 11);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6760e5tXAuLbtMC3XyEoX9, 15);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6792oOMFI1Dcqcg1BSVNty, 12);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6766fDXXEWvhMVO3O8mnuS, 40);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6749bBVlTkqEpHW053CjWL, 39);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6767fLSSbwbzFBVpwBH5FM, 41);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6744aUn6Hqsqw2PVM8685Z, 42);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6692Jsouc4ileb8SxQhxbX, 20);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6670Bc5OTyAfOKVCQb8CEz, 37);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6711Pum9NZyDBKoCnecvlx, 5);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6823yvdWWG9COQQotjfedH, 82);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6743aRQ2M7vtRaPDEyvpdv, 82);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6820yL2E9nlEZpg8ZZx8XE, 82);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6671CSih7GetOUab1dYQjM, 82);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6750bMSdooljgH14Jgudph, 82);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6666A49QRPHynYLCBN0SqP, 24);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6727WWC27LAMFqFFBzfbNw, 28);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6696KqgKJKIWne3kz1AdHk, 31);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6710PPkm9uUfOJHHYveeLT, 8);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6725VItLRw50eXTZeEfGl0, 34);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6719THTDvPxsHqMeGb512f, 2);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6817xHA29AmDt6y96AnB3t, 23);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6698LIMtzhnLwQyigzK0KO, 21);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6682G7AC3DWIx9i9fdanjk, 22);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6745ao3wqKm5CXFuvC0q47, 43);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6789lLKzvdU99Iw80uVD5I, 44);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6674DfpieXfdYs58yZAiXY, 45);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6758e2F9F6h8YJxTHwLCa0, 46);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6685GyWRxpdt1T8mEJXPoD, 60);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6726W3RZ2dTDKrKpS5Mxdk, 47);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6708OqIo5QF00RDxUQb4qq, 48);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6706OUd9THiLjZndMj0qdF, 49);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6781jCtUeU2YI1poCxWcjm, 50);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6732XzJ1BS7H9Ilbkv4eVM, 51);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6807tXWeW0sqVddf7ZBflq, 52);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6741aAp6BD79BhftLCnuvf, 53);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6813vlBaBOcZ1q1ndWVoXn, 54);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6673DFYiVi7zXozAjRciKa, 55);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6779i8aHOwH04efS6lZ3Oa, 56);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6681FtYx4GXtxwA8al5hBy, 57);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6796owCQzRKpGarpL4247z, 58);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6748ayduHasC7VpxsVXE0T, 59);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6723Tu4WCh2gEwj8E4oHbP, 61);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6695Kh0uC90qEEhuLdpgB9, 62);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6786k0CbjZvfUz23r8IN6W, 63);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6722ToH8yzk8U1nKT0PUfY, 64);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6768g0OBkYSIvp0JYnHPjC, 65);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6810udcVtCzLTM1Loe9KrX, 66);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6709PDw1hXOtArGjUqFgpT, 67);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6785jsjSYEu4NPZjZxcfmI, 79);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6714R9SAhYMerGybF9OAjL, 38);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6808tmIBXGVvBsrJ7i63G2, 68);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6809uAIIhSQWhOmxUb3Bqo, 69);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6818xMfAHy6F7qK0zhxhKG, 70);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6736YlLW4G6OV9TFyuw5ix, 71);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6699LU0fFDMACqnfIfA1AZ, 72);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6829zcy2NNbtVXgoGQbfuq, 73);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6794oocVJL811qFf0j0XXZ, 74);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6731XdzLv4NdAtTYoEzVzB, 75);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6676EscIOBqRhG6irG5q11, 76);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6688HZ4bptRS9XIcK1CV95, 77);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6773h7m69eGbRk1hyaVt28, 78);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6774hUNBy66ZO1wVLJGW3l, 80);
        f3096husNiw3snxdgZPAGJm.append(sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6751cT5Hs3CQpLK8NvlZAw, 81);
    }

    public static int T9PhQIpGRhE4yZDm1C(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final lEeR5KfoEr4xU5yHH7 Acstmh57AKoSEkEFNJ(int i) {
        if (!this.f3098HJFh0TGMpafqLE9haL.containsKey(Integer.valueOf(i))) {
            this.f3098HJFh0TGMpafqLE9haL.put(Integer.valueOf(i), new lEeR5KfoEr4xU5yHH7());
        }
        return (lEeR5KfoEr4xU5yHH7) this.f3098HJFh0TGMpafqLE9haL.get(Integer.valueOf(i));
    }

    public void HJFh0TGMpafqLE9haL(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zZKhbgvUfsK4AEX3r0(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final int[] IPyIQcaNa8aB7drBED(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objKYHag8HRDlnO3X9zmZ;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = sTkWmhpZ5b1ArQIw4K.HJFh0TGMpafqLE9haL.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objKYHag8HRDlnO3X9zmZ = ((ConstraintLayout) view.getParent()).KYHag8HRDlnO3X9zmZ(0, strTrim)) != null && (objKYHag8HRDlnO3X9zmZ instanceof Integer)) {
                iIntValue = ((Integer) objKYHag8HRDlnO3X9zmZ).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public void KYHag8HRDlnO3X9zmZ(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3098HJFh0TGMpafqLE9haL.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (ConstraintLayout.s3fjYDxWOUexjjVgyA) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f3100s3fjYDxWOUexjjVgyA && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3098HJFh0TGMpafqLE9haL.containsKey(Integer.valueOf(id))) {
                this.f3098HJFh0TGMpafqLE9haL.put(Integer.valueOf(id), new lEeR5KfoEr4xU5yHH7());
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f3098HJFh0TGMpafqLE9haL.get(Integer.valueOf(id));
            leer5kfoer4xu5yhh7.f3124KYHag8HRDlnO3X9zmZ = androidx.constraintlayout.widget.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f3099lEeR5KfoEr4xU5yHH7, childAt);
            leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(id, s3fjydxwouexjjvgya);
            leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA.f3195s3fjYDxWOUexjjVgyA = childAt.getVisibility();
            leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA.f3196zZKhbgvUfsK4AEX3r0 = childAt.getAlpha();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3121s3fjYDxWOUexjjVgyA = childAt.getRotation();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3111HJFh0TGMpafqLE9haL = childAt.getRotationX();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3122zZKhbgvUfsK4AEX3r0 = childAt.getRotationY();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3118husNiw3snxdgZPAGJm = childAt.getScaleX();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3113KYHag8HRDlnO3X9zmZ = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                husniw3snxdgzpagjm.f3115TCyPEKSzIyweCN5yp1 = pivotX;
                husniw3snxdgzpagjm.f3112IPyIQcaNa8aB7drBED = pivotY;
            }
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3120pbVGzGjWvY2LDXC8vo = childAt.getTranslationX();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3110Acstmh57AKoSEkEFNJ = childAt.getTranslationY();
            leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3116Z9WdNiOsPR0y54zHW4 = childAt.getTranslationZ();
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
            if (husniw3snxdgzpagjm2.f3117e54J8UWNHWALQNixXM) {
                husniw3snxdgzpagjm2.f3114T9PhQIpGRhE4yZDm1C = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7) {
                androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7) childAt;
                leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3188zXY7dgnTfw9Pd9RXel = leer5kfoer4xu5yhh72.hoXrIDAFrSwfShk8da();
                leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3177k0CbjZvfUz23r8IN6W = leer5kfoer4xu5yhh72.getReferencedIds();
                leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3181osrHU7fvDp2EgxZPfM = leer5kfoer4xu5yhh72.getType();
                leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3163ZJNyOIPL0usMs2xSAn = leer5kfoer4xu5yhh72.getMargin();
            }
        }
    }

    public void TCyPEKSzIyweCN5yp1(int i, int i2, int i3, float f) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = Acstmh57AKoSEkEFNJ(i).f3128zZKhbgvUfsK4AEX3r0;
        s3fjydxwouexjjvgya.f3130A49QRPHynYLCBN0SqP = i2;
        s3fjydxwouexjjvgya.f3155VItLRw50eXTZeEfGl0 = i3;
        s3fjydxwouexjjvgya.f3157WWC27LAMFqFFBzfbNw = f;
    }

    public void Z9WdNiOsPR0y54zHW4(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo.f3128zZKhbgvUfsK4AEX3r0.f3178lEeR5KfoEr4xU5yHH7 = true;
                    }
                    this.f3098HJFh0TGMpafqLE9haL.put(Integer.valueOf(leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo.f3126lEeR5KfoEr4xU5yHH7), leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e54J8UWNHWALQNixXM(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void hoXrIDAFrSwfShk8da(Context context, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, TypedArray typedArray) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6714R9SAhYMerGybF9OAjL && sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6696KqgKJKIWne3kz1AdHk != index && sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6710PPkm9uUfOJHHYveeLT != index) {
                leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL.f3106lEeR5KfoEr4xU5yHH7 = true;
                leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3183s3fjYDxWOUexjjVgyA = true;
                leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA.f3194lEeR5KfoEr4xU5yHH7 = true;
                leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3119lEeR5KfoEr4xU5yHH7 = true;
            }
            switch (f3096husNiw3snxdgZPAGJm.get(index)) {
                case 1:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya.f3143OANkd3mP6AYvwbNLJM = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya.f3143OANkd3mP6AYvwbNLJM);
                    continue;
                case 2:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya2.f3156W3RZ2dTDKrKpS5Mxdk = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya2.f3156W3RZ2dTDKrKpS5Mxdk);
                    continue;
                case 3:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya3.f3165aPyGSIylzVNKPT1Bls = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya3.f3165aPyGSIylzVNKPT1Bls);
                    continue;
                case 4:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya4 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya4.f3173hoXrIDAFrSwfShk8da = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya4.f3173hoXrIDAFrSwfShk8da);
                    continue;
                case 5:
                    leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3141LIMtzhnLwQyigzK0KO = typedArray.getString(index);
                    continue;
                case 6:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya5 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya5.f3151THTDvPxsHqMeGb512f = typedArray.getDimensionPixelOffset(index, s3fjydxwouexjjvgya5.f3151THTDvPxsHqMeGb512f);
                    continue;
                case 7:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya6 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya6.f3166ao3wqKm5CXFuvC0q47 = typedArray.getDimensionPixelOffset(index, s3fjydxwouexjjvgya6.f3166ao3wqKm5CXFuvC0q47);
                    continue;
                case 8:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya7 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya7.f3145OqIo5QF00RDxUQb4qq = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya7.f3145OqIo5QF00RDxUQb4qq);
                    continue;
                case 9:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya8 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya8.f3148R9SAhYMerGybF9OAjL = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya8.f3148R9SAhYMerGybF9OAjL);
                    continue;
                case 10:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya9 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya9.f3160Y43RdunnpKgpbny0lE = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya9.f3160Y43RdunnpKgpbny0lE);
                    continue;
                case 11:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya10 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya10.f3146PPkm9uUfOJHHYveeLT = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya10.f3146PPkm9uUfOJHHYveeLT);
                    continue;
                case 12:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya11 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya11.f3164aAp6BD79BhftLCnuvf = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya11.f3164aAp6BD79BhftLCnuvf);
                    continue;
                case 13:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya12 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya12.f3133DfpieXfdYs58yZAiXY = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya12.f3133DfpieXfdYs58yZAiXY);
                    continue;
                case 14:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya13 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya13.f3140KqgKJKIWne3kz1AdHk = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya13.f3140KqgKJKIWne3kz1AdHk);
                    continue;
                case 15:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya14 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya14.f3179lLKzvdU99Iw80uVD5I = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya14.f3179lLKzvdU99Iw80uVD5I);
                    continue;
                case 16:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya15 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya15.f3170e2F9F6h8YJxTHwLCa0 = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya15.f3170e2F9F6h8YJxTHwLCa0);
                    continue;
                case 17:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya16 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya16.f3174husNiw3snxdgZPAGJm = typedArray.getDimensionPixelOffset(index, s3fjydxwouexjjvgya16.f3174husNiw3snxdgZPAGJm);
                    continue;
                case 18:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya17 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya17.f3138KYHag8HRDlnO3X9zmZ = typedArray.getDimensionPixelOffset(index, s3fjydxwouexjjvgya17.f3138KYHag8HRDlnO3X9zmZ);
                    continue;
                case 19:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya18 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya18.f3150TCyPEKSzIyweCN5yp1 = typedArray.getFloat(index, s3fjydxwouexjjvgya18.f3150TCyPEKSzIyweCN5yp1);
                    continue;
                case 20:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya19 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya19.f3134G7AC3DWIx9i9fdanjk = typedArray.getFloat(index, s3fjydxwouexjjvgya19.f3134G7AC3DWIx9i9fdanjk);
                    continue;
                case 21:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya20 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya20.f3189zZKhbgvUfsK4AEX3r0 = typedArray.getLayoutDimension(index, s3fjydxwouexjjvgya20.f3189zZKhbgvUfsK4AEX3r0);
                    continue;
                case 22:
                    C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                    c0036zZKhbgvUfsK4AEX3r0.f3195s3fjYDxWOUexjjVgyA = typedArray.getInt(index, c0036zZKhbgvUfsK4AEX3r0.f3195s3fjYDxWOUexjjVgyA);
                    C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r02 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                    c0036zZKhbgvUfsK4AEX3r02.f3195s3fjYDxWOUexjjVgyA = f3097zZKhbgvUfsK4AEX3r0[c0036zZKhbgvUfsK4AEX3r02.f3195s3fjYDxWOUexjjVgyA];
                    continue;
                case 23:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya21 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya21.f3136HJFh0TGMpafqLE9haL = typedArray.getLayoutDimension(index, s3fjydxwouexjjvgya21.f3136HJFh0TGMpafqLE9haL);
                    continue;
                case 24:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya22 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya22.f3175jCtUeU2YI1poCxWcjm = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya22.f3175jCtUeU2YI1poCxWcjm);
                    continue;
                case 25:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya23 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya23.f3137IPyIQcaNa8aB7drBED = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya23.f3137IPyIQcaNa8aB7drBED);
                    continue;
                case 26:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya24 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya24.f3182pbVGzGjWvY2LDXC8vo = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya24.f3182pbVGzGjWvY2LDXC8vo);
                    continue;
                case 27:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya25 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya25.f3144OUd9THiLjZndMj0qdF = typedArray.getInt(index, s3fjydxwouexjjvgya25.f3144OUd9THiLjZndMj0qdF);
                    continue;
                case 28:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya26 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya26.f3159XzJ1BS7H9Ilbkv4eVM = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya26.f3159XzJ1BS7H9Ilbkv4eVM);
                    continue;
                case 29:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya27 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya27.f3131Acstmh57AKoSEkEFNJ = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya27.f3131Acstmh57AKoSEkEFNJ);
                    continue;
                case 30:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya28 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya28.f3162Z9WdNiOsPR0y54zHW4 = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya28.f3162Z9WdNiOsPR0y54zHW4);
                    continue;
                case 31:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya29 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya29.f3135GyWRxpdt1T8mEJXPoD = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya29.f3135GyWRxpdt1T8mEJXPoD);
                    continue;
                case 32:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya30 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya30.f3190zaq8hOURtfwbcX17cG = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya30.f3190zaq8hOURtfwbcX17cG);
                    continue;
                case 33:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya31 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya31.f3184sTkWmhpZ5b1ArQIw4K = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya31.f3184sTkWmhpZ5b1ArQIw4K);
                    continue;
                case 34:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya32 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya32.f3185tXWeW0sqVddf7ZBflq = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya32.f3185tXWeW0sqVddf7ZBflq);
                    continue;
                case 35:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya33 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya33.f3149T9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya33.f3149T9PhQIpGRhE4yZDm1C);
                    continue;
                case 36:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya34 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya34.f3171e54J8UWNHWALQNixXM = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya34.f3171e54J8UWNHWALQNixXM);
                    continue;
                case 37:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya35 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya35.f3187xHA29AmDt6y96AnB3t = typedArray.getFloat(index, s3fjydxwouexjjvgya35.f3187xHA29AmDt6y96AnB3t);
                    continue;
                case 38:
                    leer5kfoer4xu5yhh7.f3126lEeR5KfoEr4xU5yHH7 = typedArray.getResourceId(index, leer5kfoer4xu5yhh7.f3126lEeR5KfoEr4xU5yHH7);
                    continue;
                case 39:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya36 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya36.f3158XdzLv4NdAtTYoEzVzB = typedArray.getFloat(index, s3fjydxwouexjjvgya36.f3158XdzLv4NdAtTYoEzVzB);
                    continue;
                case 40:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya37 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya37.f3152ToH8yzk8U1nKT0PUfY = typedArray.getFloat(index, s3fjydxwouexjjvgya37.f3152ToH8yzk8U1nKT0PUfY);
                    continue;
                case 41:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya38 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya38.f3142LU0fFDMACqnfIfA1AZ = typedArray.getInt(index, s3fjydxwouexjjvgya38.f3142LU0fFDMACqnfIfA1AZ);
                    continue;
                case 42:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya39 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya39.f3191zcy2NNbtVXgoGQbfuq = typedArray.getInt(index, s3fjydxwouexjjvgya39.f3191zcy2NNbtVXgoGQbfuq);
                    continue;
                case 43:
                    C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r03 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                    c0036zZKhbgvUfsK4AEX3r03.f3196zZKhbgvUfsK4AEX3r0 = typedArray.getFloat(index, c0036zZKhbgvUfsK4AEX3r03.f3196zZKhbgvUfsK4AEX3r0);
                    continue;
                case 44:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm.f3117e54J8UWNHWALQNixXM = true;
                    husniw3snxdgzpagjm.f3114T9PhQIpGRhE4yZDm1C = typedArray.getDimension(index, husniw3snxdgzpagjm.f3114T9PhQIpGRhE4yZDm1C);
                    continue;
                case 45:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm2.f3111HJFh0TGMpafqLE9haL = typedArray.getFloat(index, husniw3snxdgzpagjm2.f3111HJFh0TGMpafqLE9haL);
                    continue;
                case 46:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm3 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm3.f3122zZKhbgvUfsK4AEX3r0 = typedArray.getFloat(index, husniw3snxdgzpagjm3.f3122zZKhbgvUfsK4AEX3r0);
                    continue;
                case 47:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm4 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm4.f3118husNiw3snxdgZPAGJm = typedArray.getFloat(index, husniw3snxdgzpagjm4.f3118husNiw3snxdgZPAGJm);
                    continue;
                case 48:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm5 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm5.f3113KYHag8HRDlnO3X9zmZ = typedArray.getFloat(index, husniw3snxdgzpagjm5.f3113KYHag8HRDlnO3X9zmZ);
                    continue;
                case 49:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm6 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm6.f3115TCyPEKSzIyweCN5yp1 = typedArray.getDimension(index, husniw3snxdgzpagjm6.f3115TCyPEKSzIyweCN5yp1);
                    continue;
                case 50:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm7 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm7.f3112IPyIQcaNa8aB7drBED = typedArray.getDimension(index, husniw3snxdgzpagjm7.f3112IPyIQcaNa8aB7drBED);
                    continue;
                case 51:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm8 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm8.f3120pbVGzGjWvY2LDXC8vo = typedArray.getDimension(index, husniw3snxdgzpagjm8.f3120pbVGzGjWvY2LDXC8vo);
                    continue;
                case 52:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm9 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm9.f3110Acstmh57AKoSEkEFNJ = typedArray.getDimension(index, husniw3snxdgzpagjm9.f3110Acstmh57AKoSEkEFNJ);
                    continue;
                case 53:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm10 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm10.f3116Z9WdNiOsPR0y54zHW4 = typedArray.getDimension(index, husniw3snxdgzpagjm10.f3116Z9WdNiOsPR0y54zHW4);
                    continue;
                case 54:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya40 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya40.f3161YlLW4G6OV9TFyuw5ix = typedArray.getInt(index, s3fjydxwouexjjvgya40.f3161YlLW4G6OV9TFyuw5ix);
                    continue;
                case 55:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya41 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya41.f3180oocVJL811qFf0j0XXZ = typedArray.getInt(index, s3fjydxwouexjjvgya41.f3180oocVJL811qFf0j0XXZ);
                    continue;
                case 56:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya42 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya42.f3186udcVtCzLTM1Loe9KrX = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya42.f3186udcVtCzLTM1Loe9KrX);
                    continue;
                case 57:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya43 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya43.f3168cT5Hs3CQpLK8NvlZAw = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya43.f3168cT5Hs3CQpLK8NvlZAw);
                    continue;
                case 58:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya44 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya44.f3172hUNBy66ZO1wVLJGW3l = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya44.f3172hUNBy66ZO1wVLJGW3l);
                    continue;
                case 59:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya45 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya45.f3167bMSdooljgH14Jgudph = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya45.f3167bMSdooljgH14Jgudph);
                    continue;
                case 60:
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm11 = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                    husniw3snxdgzpagjm11.f3121s3fjYDxWOUexjjVgyA = typedArray.getFloat(index, husniw3snxdgzpagjm11.f3121s3fjYDxWOUexjjVgyA);
                    continue;
                case 61:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya46 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya46.f3130A49QRPHynYLCBN0SqP = T9PhQIpGRhE4yZDm1C(typedArray, index, s3fjydxwouexjjvgya46.f3130A49QRPHynYLCBN0SqP);
                    continue;
                case 62:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya47 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya47.f3155VItLRw50eXTZeEfGl0 = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya47.f3155VItLRw50eXTZeEfGl0);
                    continue;
                case 63:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya48 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya48.f3157WWC27LAMFqFFBzfbNw = typedArray.getFloat(index, s3fjydxwouexjjvgya48.f3157WWC27LAMFqFFBzfbNw);
                    continue;
                case 64:
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                    hJFh0TGMpafqLE9haL2.f3107s3fjYDxWOUexjjVgyA = T9PhQIpGRhE4yZDm1C(typedArray, index, hJFh0TGMpafqLE9haL2.f3107s3fjYDxWOUexjjVgyA);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        hJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                        string = typedArray.getString(index);
                    } else {
                        hJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                        string = T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7.f1530HJFh0TGMpafqLE9haL[typedArray.getInteger(index, 0)];
                    }
                    hJFh0TGMpafqLE9haL.f3102HJFh0TGMpafqLE9haL = string;
                    continue;
                case 66:
                    leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL.f3105husNiw3snxdgZPAGJm = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                    hJFh0TGMpafqLE9haL3.f3104TCyPEKSzIyweCN5yp1 = typedArray.getFloat(index, hJFh0TGMpafqLE9haL3.f3104TCyPEKSzIyweCN5yp1);
                    continue;
                case 68:
                    C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r04 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                    c0036zZKhbgvUfsK4AEX3r04.f3193husNiw3snxdgZPAGJm = typedArray.getFloat(index, c0036zZKhbgvUfsK4AEX3r04.f3193husNiw3snxdgZPAGJm);
                    continue;
                case 69:
                    leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3154Uj8rPa1EWADtk6Oe0S = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3132CSih7GetOUab1dYQjM = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya49 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya49.f3181osrHU7fvDp2EgxZPfM = typedArray.getInt(index, s3fjydxwouexjjvgya49.f3181osrHU7fvDp2EgxZPfM);
                    continue;
                case 73:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya50 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya50.f3163ZJNyOIPL0usMs2xSAn = typedArray.getDimensionPixelSize(index, s3fjydxwouexjjvgya50.f3163ZJNyOIPL0usMs2xSAn);
                    continue;
                case 74:
                    leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3139Kh0uC90qEEhuLdpgB9 = typedArray.getString(index);
                    continue;
                case 75:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya51 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya51.f3188zXY7dgnTfw9Pd9RXel = typedArray.getBoolean(index, s3fjydxwouexjjvgya51.f3188zXY7dgnTfw9Pd9RXel);
                    continue;
                case 76:
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                    hJFh0TGMpafqLE9haL4.f3108zZKhbgvUfsK4AEX3r0 = typedArray.getInt(index, hJFh0TGMpafqLE9haL4.f3108zZKhbgvUfsK4AEX3r0);
                    continue;
                case 77:
                    leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3147Pum9NZyDBKoCnecvlx = typedArray.getString(index);
                    continue;
                case 78:
                    C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r05 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                    c0036zZKhbgvUfsK4AEX3r05.f3192HJFh0TGMpafqLE9haL = typedArray.getInt(index, c0036zZKhbgvUfsK4AEX3r05.f3192HJFh0TGMpafqLE9haL);
                    continue;
                case 79:
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL5 = leer5kfoer4xu5yhh7.f3123HJFh0TGMpafqLE9haL;
                    hJFh0TGMpafqLE9haL5.f3103KYHag8HRDlnO3X9zmZ = typedArray.getFloat(index, hJFh0TGMpafqLE9haL5.f3103KYHag8HRDlnO3X9zmZ);
                    continue;
                case 80:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya52 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya52.f3169ctWLFN70QQINH1kyYo = typedArray.getBoolean(index, s3fjydxwouexjjvgya52.f3169ctWLFN70QQINH1kyYo);
                    continue;
                case 81:
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya53 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                    s3fjydxwouexjjvgya53.f3176jocVUfxESVhVJU8LoH = typedArray.getBoolean(index, s3fjydxwouexjjvgya53.f3176jocVUfxESVhVJU8LoH);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f3096husNiw3snxdgZPAGJm.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    public void husNiw3snxdgZPAGJm(Context context, int i) {
        KYHag8HRDlnO3X9zmZ((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final lEeR5KfoEr4xU5yHH7 pbVGzGjWvY2LDXC8vo(Context context, AttributeSet attributeSet) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6804sTkWmhpZ5b1ArQIw4K);
        hoXrIDAFrSwfShk8da(context, leer5kfoer4xu5yhh7, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return leer5kfoer4xu5yhh7;
    }

    public void zZKhbgvUfsK4AEX3r0(ConstraintLayout constraintLayout, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3098HJFh0TGMpafqLE9haL.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3098HJFh0TGMpafqLE9haL.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(childAt));
            } else {
                if (this.f3100s3fjYDxWOUexjjVgyA && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f3098HJFh0TGMpafqLE9haL.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f3098HJFh0TGMpafqLE9haL.get(Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7) {
                            leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3153Tu4WCh2gEwj8E4oHbP = 1;
                        }
                        int i2 = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3153Tu4WCh2gEwj8E4oHbP;
                        if (i2 != -1 && i2 == 1) {
                            androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7) childAt;
                            leer5kfoer4xu5yhh72.setId(id);
                            leer5kfoer4xu5yhh72.setType(leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3181osrHU7fvDp2EgxZPfM);
                            leer5kfoer4xu5yhh72.setMargin(leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3163ZJNyOIPL0usMs2xSAn);
                            leer5kfoer4xu5yhh72.setAllowsGoneWidget(leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3188zXY7dgnTfw9Pd9RXel);
                            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0;
                            int[] iArr = s3fjydxwouexjjvgya.f3177k0CbjZvfUz23r8IN6W;
                            if (iArr != null) {
                                leer5kfoer4xu5yhh72.setReferencedIds(iArr);
                            } else {
                                String str = s3fjydxwouexjjvgya.f3139Kh0uC90qEEhuLdpgB9;
                                if (str != null) {
                                    s3fjydxwouexjjvgya.f3177k0CbjZvfUz23r8IN6W = IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh72, str);
                                    leer5kfoer4xu5yhh72.setReferencedIds(leer5kfoer4xu5yhh7.f3128zZKhbgvUfsK4AEX3r0.f3177k0CbjZvfUz23r8IN6W);
                                }
                            }
                        }
                        ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = (ConstraintLayout.s3fjYDxWOUexjjVgyA) childAt.getLayoutParams();
                        s3fjydxwouexjjvgya2.lEeR5KfoEr4xU5yHH7();
                        leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya2);
                        if (z) {
                            androidx.constraintlayout.widget.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(childAt, leer5kfoer4xu5yhh7.f3124KYHag8HRDlnO3X9zmZ);
                        }
                        childAt.setLayoutParams(s3fjydxwouexjjvgya2);
                        C0036zZKhbgvUfsK4AEX3r0 c0036zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA;
                        if (c0036zZKhbgvUfsK4AEX3r0.f3192HJFh0TGMpafqLE9haL == 0) {
                            childAt.setVisibility(c0036zZKhbgvUfsK4AEX3r0.f3195s3fjYDxWOUexjjVgyA);
                        }
                        childAt.setAlpha(leer5kfoer4xu5yhh7.f3127s3fjYDxWOUexjjVgyA.f3196zZKhbgvUfsK4AEX3r0);
                        childAt.setRotation(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3121s3fjYDxWOUexjjVgyA);
                        childAt.setRotationX(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3111HJFh0TGMpafqLE9haL);
                        childAt.setRotationY(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3122zZKhbgvUfsK4AEX3r0);
                        childAt.setScaleX(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3118husNiw3snxdgZPAGJm);
                        childAt.setScaleY(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3113KYHag8HRDlnO3X9zmZ);
                        if (!Float.isNaN(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3115TCyPEKSzIyweCN5yp1)) {
                            childAt.setPivotX(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3115TCyPEKSzIyweCN5yp1);
                        }
                        if (!Float.isNaN(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3112IPyIQcaNa8aB7drBED)) {
                            childAt.setPivotY(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3112IPyIQcaNa8aB7drBED);
                        }
                        childAt.setTranslationX(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3120pbVGzGjWvY2LDXC8vo);
                        childAt.setTranslationY(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3110Acstmh57AKoSEkEFNJ);
                        childAt.setTranslationZ(leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm.f3116Z9WdNiOsPR0y54zHW4);
                        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = leer5kfoer4xu5yhh7.f3125husNiw3snxdgZPAGJm;
                        if (husniw3snxdgzpagjm.f3117e54J8UWNHWALQNixXM) {
                            childAt.setElevation(husniw3snxdgzpagjm.f3114T9PhQIpGRhE4yZDm1C);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = (lEeR5KfoEr4xU5yHH7) this.f3098HJFh0TGMpafqLE9haL.get(num);
            int i3 = leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0.f3153Tu4WCh2gEwj8E4oHbP;
            if (i3 != -1 && i3 == 1) {
                androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh74 = new androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7(constraintLayout.getContext());
                leer5kfoer4xu5yhh74.setId(num.intValue());
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 = leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0;
                int[] iArr2 = s3fjydxwouexjjvgya3.f3177k0CbjZvfUz23r8IN6W;
                if (iArr2 != null) {
                    leer5kfoer4xu5yhh74.setReferencedIds(iArr2);
                } else {
                    String str2 = s3fjydxwouexjjvgya3.f3139Kh0uC90qEEhuLdpgB9;
                    if (str2 != null) {
                        s3fjydxwouexjjvgya3.f3177k0CbjZvfUz23r8IN6W = IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh74, str2);
                        leer5kfoer4xu5yhh74.setReferencedIds(leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0.f3177k0CbjZvfUz23r8IN6W);
                    }
                }
                leer5kfoer4xu5yhh74.setType(leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0.f3181osrHU7fvDp2EgxZPfM);
                leer5kfoer4xu5yhh74.setMargin(leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0.f3163ZJNyOIPL0usMs2xSAn);
                ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0 = constraintLayout.generateDefaultLayoutParams();
                leer5kfoer4xu5yhh74.T9PhQIpGRhE4yZDm1C();
                leer5kfoer4xu5yhh73.s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0);
                constraintLayout.addView(leer5kfoer4xu5yhh74, s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r0);
            }
            if (leer5kfoer4xu5yhh73.f3128zZKhbgvUfsK4AEX3r0.f3178lEeR5KfoEr4xU5yHH7) {
                View husniw3snxdgzpagjm2 = new androidx.constraintlayout.widget.husNiw3snxdgZPAGJm(constraintLayout.getContext());
                husniw3snxdgzpagjm2.setId(num.intValue());
                ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r02 = constraintLayout.generateDefaultLayoutParams();
                leer5kfoer4xu5yhh73.s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r02);
                constraintLayout.addView(husniw3snxdgzpagjm2, s3fjydxwouexjjvgyaZZKhbgvUfsK4AEX3r02);
            }
        }
    }
}
