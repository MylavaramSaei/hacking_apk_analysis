package F8je6vTkTMHm5WbjEC;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 extends KYHag8HRDlnO3X9zmZ {
    public static final Object[] HJFh0TGMpafqLE9haL(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static final void husNiw3snxdgZPAGJm(Object[] objArr, Object obj, int i, int i2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static List s3fjYDxWOUexjjVgyA(Object[] objArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "<this>");
        List listLEeR5KfoEr4xU5yHH7 = pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(objArr);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(listLEeR5KfoEr4xU5yHH7, "asList(...)");
        return listLEeR5KfoEr4xU5yHH7;
    }

    public static /* synthetic */ Object[] zZKhbgvUfsK4AEX3r0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return HJFh0TGMpafqLE9haL(objArr, objArr2, i, i2, i3);
    }
}
