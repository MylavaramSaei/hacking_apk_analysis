package pjij9fAFhRRn230kOs;

/* loaded from: classes.dex */
public abstract class T9PhQIpGRhE4yZDm1C extends e54J8UWNHWALQNixXM {
    public static /* synthetic */ String HJFh0TGMpafqLE9haL(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return s3fjYDxWOUexjjVgyA(str, str2, str3, z);
    }

    public static final boolean lEeR5KfoEr4xU5yHH7(String str, int i, String str2, int i2, int i3, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String s3fjYDxWOUexjjVgyA(String str, String str2, String str3, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str2, "oldValue");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str3, "newValue");
        int i = 0;
        int iTCyPEKSzIyweCN5yp1 = hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(str, str2, 0, z);
        if (iTCyPEKSzIyweCN5yp1 < 0) {
            return str;
        }
        int length = str2.length();
        int iLEeR5KfoEr4xU5yHH7 = cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iTCyPEKSzIyweCN5yp1);
            sb.append(str3);
            i = iTCyPEKSzIyweCN5yp1 + length;
            if (iTCyPEKSzIyweCN5yp1 >= str.length()) {
                break;
            }
            iTCyPEKSzIyweCN5yp1 = hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(str, str2, iTCyPEKSzIyweCN5yp1 + iLEeR5KfoEr4xU5yHH7, z);
        } while (iTCyPEKSzIyweCN5yp1 > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(string, "toString(...)");
        return string;
    }
}
