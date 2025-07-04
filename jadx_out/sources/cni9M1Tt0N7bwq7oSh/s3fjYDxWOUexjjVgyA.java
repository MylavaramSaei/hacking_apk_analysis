package cni9M1Tt0N7bwq7oSh;

import F8je6vTkTMHm5WbjEC.A49QRPHynYLCBN0SqP;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends A49QRPHynYLCBN0SqP {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f4715HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4716lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f4717s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f4718zZKhbgvUfsK4AEX3r0;

    public s3fjYDxWOUexjjVgyA(int i, int i2, int i3) {
        this.f4716lEeR5KfoEr4xU5yHH7 = i3;
        this.f4717s3fjYDxWOUexjjVgyA = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f4715HJFh0TGMpafqLE9haL = z;
        this.f4718zZKhbgvUfsK4AEX3r0 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4715HJFh0TGMpafqLE9haL;
    }

    @Override // F8je6vTkTMHm5WbjEC.A49QRPHynYLCBN0SqP
    public int lEeR5KfoEr4xU5yHH7() {
        int i = this.f4718zZKhbgvUfsK4AEX3r0;
        if (i != this.f4717s3fjYDxWOUexjjVgyA) {
            this.f4718zZKhbgvUfsK4AEX3r0 = this.f4716lEeR5KfoEr4xU5yHH7 + i;
        } else {
            if (!this.f4715HJFh0TGMpafqLE9haL) {
                throw new NoSuchElementException();
            }
            this.f4715HJFh0TGMpafqLE9haL = false;
        }
        return i;
    }
}
