package aAp6BD79BhftLCnuvf;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 implements Parcelable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Parcelable f2305lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f2304s3fjYDxWOUexjjVgyA = new C0031lEeR5KfoEr4xU5yHH7();
    public static final Parcelable.Creator<lEeR5KfoEr4xU5yHH7> CREATOR = new s3fjYDxWOUexjjVgyA();

    /* renamed from: aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public class C0031lEeR5KfoEr4xU5yHH7 extends lEeR5KfoEr4xU5yHH7 {
        public C0031lEeR5KfoEr4xU5yHH7() {
            super((C0031lEeR5KfoEr4xU5yHH7) null);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7[] newArray(int i) {
            return new lEeR5KfoEr4xU5yHH7[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return lEeR5KfoEr4xU5yHH7.f2304s3fjYDxWOUexjjVgyA;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public lEeR5KfoEr4xU5yHH7() {
        this.f2305lEeR5KfoEr4xU5yHH7 = null;
    }

    public final Parcelable HJFh0TGMpafqLE9haL() {
        return this.f2305lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2305lEeR5KfoEr4xU5yHH7, i);
    }

    public /* synthetic */ lEeR5KfoEr4xU5yHH7(C0031lEeR5KfoEr4xU5yHH7 c0031lEeR5KfoEr4xU5yHH7) {
        this();
    }

    public lEeR5KfoEr4xU5yHH7(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2305lEeR5KfoEr4xU5yHH7 = parcelable == null ? f2304s3fjYDxWOUexjjVgyA : parcelable;
    }

    public lEeR5KfoEr4xU5yHH7(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2305lEeR5KfoEr4xU5yHH7 = parcelable == f2304s3fjYDxWOUexjjVgyA ? null : parcelable;
    }
}
